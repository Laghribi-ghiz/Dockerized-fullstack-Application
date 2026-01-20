import React from 'react';
import { Container, Card } from 'react-bootstrap';

class Bienvenue extends React.Component {
    render() {
        return (
            <Container className="mt-4">
                <Card bg="dark" text="white" className="p-4">
                    <h1>Bienvenue au Magasin des Voitures</h1>
                    <blockquote className="blockquote mb-0">
                        <p>Le meilleur de nos voitures est exposé près de chez vous</p>
                        <footer className="blockquote-footer text-white">
                            Master MIOLA
                        </footer>
                    </blockquote>
                </Card>
            </Container>
        );
    }
}

export default Bienvenue;
