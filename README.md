# ProxibanqueV4
------------------------------------------------------------------------ProxibanqueV4----------------------------------------------------------------------------------

##Description V4 Le gérant s'identifie grâce à son login et mot de passe. Une fois l'identification réussie s'affiche une page indique les informations sur l'agence

tel que : Numero de compte de l'agence , date de creation , solde actuel , employe , clients , opération , ainsi opération de dérier mois .

le gérant a le droit de crée et suprimer des coseillers . 

Une erreur d'identification envoie un message d'erreur et le conseiller est invité à renseigner de nouveau ses identifiants. 


##Description V4 Le conseiller s'identifie grâce à son login et mot de passe. Une fois l'identification réussie s'affiche sa liste de clients.

Une erreur d'identification envoie un message d'erreur et le conseiller est invité à renseigner de nouveau ses identifiants.

La liste de clients affiche pour chaque client le numéro client qui lui est affecté, son nom et son prénom. Options à la disposition du conseiller pour chaque client :

1/modifier les informations du client

2/supprimer le client

3/créer un compte courant pour le client

4/créer un compte épargne pour le client

accéder à la liste de comptes ouverts pour ce client

La création de compte courant ou compte épargne dirige le conseiller vers une page de formulaire lui permettant de rentrer les informations nécessaires à la création du compte en base.
 
Une fois le compte créé, le conseiller est redirigé vers son écran d'accueil pour poursuivre son activité.

#### Fonctionnalités de l'application ####

#### Créer conseiller #### 

Sur l'écran d'accueil,cliquer sur le bouton Créer conseiller

Remplir le formulaire

Valider

#### Créer client #### 

S'identifier en tant que conseiller en renseignant login et mot de passe.

La liste des clients du conseiller s'affiche, avec les actions possibles pour chaque client.

En haut de la liste, cliquer sur le bouton noiveau client. Remplir le formulaire et ajouter.

Au retour sur la page d'accueil conseiller, le nouveau client est ajouté à la liste.
 
#### Modifier client #### 

Cliquer sur le bouton Modifier client sur la page d'accueil conseiller

Rentrer les valeurs à modifier

Cliquer sur submit

Une confirmation apparaît, cliquer sur le bouton Retour pour revenir à la page d'accueil conseiller

Le bouton Accueil dirige le conseiller vers la page de login de l'application

#### Supprimer client #### 

Cliquer sur le bouton Supprimer client sur la page d'accueil conseiller sur la des clients ou bien sur details client 

Une confirmation apparaît

#### Créer un compte #### 

Quand en crée un nouveau client , automatiquement il ya un compte courant crée et pour un compte épargne , on clik sur le bouton ajouter compte épargne

Renseigner les champs demandés, puis valider , Une confirmation apparaît .

#### Crée un virement  #### 

Cliquer sur le bouton crée un virment y a une page qui s'affiche remplire les informations Compte a Compte apres cliker sur submit

virment effectué .

#### Déploiement de l'application ####


1. Copiez le dossier de votre application angulaire dans votre emplacement source Spring, tel que / src / main / AngularFrontEnd


2. Assurez-vous que le répertoire dist existe déjà dans le répertoire de l'application Angular avant de l'ajouter au répertoire du projet Spring (sous l'instantané).

 Si dans le cas où le répertoire dist est manquant, vous pouvez exécuter la commande  ng build à l'emplacement d'origine et relancer le processus d'importation 

 (redémarrez à partir de l'étape précédente).


3. mettez à jour le fichier pom.xml et ajoutez les entrées de plugin

4. Supprimez tout fichier index.html existant de l'emplacement de l'application Web du projet Spring.

5. Maintenant, allez dans Propriétés du projet , naviguez jusqu'à Deployment Assembly , puis ajoutez le répertoire dist de l' application Angular

 (/ src / main / AngularFrontEnd / dist) à emballer à la racine.

6. Ouvrez le fichier index.html dans le répertoire dist de l'application Angular et mettez à jour la  valeur de base href avec “ ./ ” au lieu de “ / “.

7. Exécutez maintenant l'application Spring sur le serveur.
