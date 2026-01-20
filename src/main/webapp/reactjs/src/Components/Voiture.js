// src/Components/Voiture.js
import React, { Component } from 'react';
import { Card, Form, Button, Row, Col } from 'react-bootstrap';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faCar, faPlus } from '@fortawesome/free-solid-svg-icons';

export default class Voiture extends Component {
    constructor(props) {
        super(props);

        this.state = {
            marque: '',
            modele: '',
            couleur: '',
            annee: '',
            prix: ''
        };

        this.voitureChange = this.voitureChange.bind(this);
        this.submitVoiture = this.submitVoiture.bind(this);
    }

    voitureChange(event) {
        this.setState({ [event.target.name]: event.target.value });
    }

    submitVoiture(event) {
        alert(
            `Marque: ${this.state.marque}\nModele: ${this.state.modele}\nCouleur: ${this.state.couleur}\nAnnee: ${this.state.annee}\nPrix: ${this.state.prix}`
        );
        event.preventDefault();
    }

    render() {
        const marginTop = { marginTop: '20px' };

        return (
            <Card className="border border-dark bg-dark text-white" style={marginTop}>
                <Card.Header>
                    <FontAwesomeIcon icon={faCar} /> Ajouter Voiture
                </Card.Header>
                <Form onSubmit={this.submitVoiture} id="VoitureFormId">
                    <Card.Body>
                        <Row>
                            <Col>
                                <Form.Group controlId="formGridMarque">
                                    <Form.Label>Marque</Form.Label>
                                    <Form.Control
                                        required
                                        type="text"
                                        name="marque"
                                        placeholder="Entrez Marque Voiture"
                                        value={this.state.marque}
                                        onChange={this.voitureChange}
                                        className="bg-dark text-white"
                                    />
                                </Form.Group>
                            </Col>

                            <Col>
                                <Form.Group controlId="formGridModele">
                                    <Form.Label>Modele</Form.Label>
                                    <Form.Control
                                        required
                                        type="text"
                                        name="modele"
                                        placeholder="Entrez Modele Voiture"
                                        value={this.state.modele}
                                        onChange={this.voitureChange}
                                        className="bg-dark text-white"
                                    />
                                </Form.Group>
                            </Col>
                        </Row>

                        <Row>
                            <Col>
                                <Form.Group controlId="formGridCouleur">
                                    <Form.Label>Couleur</Form.Label>
                                    <Form.Control
                                        required
                                        type="text"
                                        name="couleur"
                                        placeholder="Entrez Couleur Voiture"
                                        value={this.state.couleur}
                                        onChange={this.voitureChange}
                                        className="bg-dark text-white"
                                    />
                                </Form.Group>
                            </Col>

                            <Col>
                                <Form.Group controlId="formGridAnnee">
                                    <Form.Label>Annee</Form.Label>
                                    <Form.Control
                                        required
                                        type="number"
                                        name="annee"
                                        placeholder="Entrez Annee"
                                        value={this.state.annee}
                                        onChange={this.voitureChange}
                                        className="bg-dark text-white"
                                    />
                                </Form.Group>
                            </Col>

                            <Col>
                                <Form.Group controlId="formGridPrix">
                                    <Form.Label>Prix</Form.Label>
                                    <Form.Control
                                        required
                                        type="number"
                                        name="prix"
                                        placeholder="Entrez Prix"
                                        value={this.state.prix}
                                        onChange={this.voitureChange}
                                        className="bg-dark text-white"
                                    />
                                </Form.Group>
                            </Col>
                        </Row>
                    </Card.Body>

                    <Card.Footer style={{ textAlign: 'right' }}>
                        <Button size="sm" variant="success" type="submit">
                            <FontAwesomeIcon icon={faPlus} /> Submit
                        </Button>
                    </Card.Footer>
                </Form>
            </Card>
        );
    }
}
