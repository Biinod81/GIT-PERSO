package usager is
-- d�finition des constantes
LONGUEUR_NOM : constant Integer := 20;

-- d�finition des types
type EnrUsager is record
        numero_adherent : Integer;
	nom : String (1..LONGUEUR_NOM);
	longueur1: Integer;
	annee_naissance : Integer;
end record;

-- lit le nom et le num�ro d'adh�rent de l'usager
procedure lire_usager (usager: out EnrUsager);

-- �crit le nom et le num�ro d'adh�rent de l'usager
procedure ecrire_usager (usager: in EnrUsager);

-- calcule l'�ge de l'usager
function age_usager (usager: in EnrUsager) return Integer;

end usager;
