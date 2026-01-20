// src/Components/VoitureListe.js
import React, { Component } from 'react';
import axios from 'axios';
import { Table, Card } from 'react-bootstrap';

export default class VoitureListe extends Component {
    constructor(props) {
        super(props);

        this.state = {
            voitures: [] // stocke les voitures récupérées
        };
    }

    // appelé juste après le montage du composant
    componentDidMount() {
        axios.get('http://localhost:8080/api/voitures')
            .then(response => {
                this.setState({ voitures: response.data });
            })
            .catch(error => {
                console.error("Erreur lors de la récupération des voitures :", error);
            });
    }

    render() {
        const { voitures } = this.state;

        return (
            <Card className="border border-dark bg-dark text-white mt-3">
                <Card.Header>Liste des Voitures</Card.Header>
                <Card.Body>
                    <Table bordered hover striped variant="dark">
                        <thead>
                        <tr>
                            <th>Marque</th>
                            <th>Modèle</th>
                            <th>Couleur</th>
                            <th>Année</th>
                            <th>Prix</th>
                        </tr>
                        </thead>
                        <tbody>
                        {voitures.length === 0 ? (
                            <tr align="center">
                                <td colSpan="5">Aucune voiture disponible</td>
                            </tr>
                        ) : (
                            voitures.map(voiture => (
                                <tr key={voiture.id} align="center">
                                    <td>{voiture.marque}</td>
                                    <td>{voiture.modele}</td>
                                    <td>{voiture.couleur}</td>
                                    <td>{voiture.annee}</td>
                                    <td>{voiture.prix}</td>
                                </tr>
                            ))
                        )}
                        </tbody>
                    </Table>
                </Card.Body>
            </Card>
        );
    }
}
