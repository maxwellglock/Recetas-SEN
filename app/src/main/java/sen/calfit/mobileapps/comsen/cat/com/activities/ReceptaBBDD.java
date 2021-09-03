package sen.calfit.mobileapps.comsen.cat.com.activities;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sen.calfit.mobileapps.comsen.cat.com.domain.Pas;
import sen.calfit.mobileapps.comsen.cat.com.domain.Recepta;

public class ReceptaBBDD  extends AppCompatActivity {


    private static ArrayList<Recepta> data = new ArrayList<>(); // simulació base de dades

    private static ReceptaBBDD instance = null;
    protected ReceptaBBDD () {
        initData();
    }
    public static ReceptaBBDD getInstance() {
        if(instance == null) {
            instance = new ReceptaBBDD();
        }
        return instance;
    }

    public void initData(){

        //29


        data.add(new Recepta("MIX POLLO CON PASTA, ALBAHACA, MANTEQUILLA Y MAS",
                "Receta nutritiva y balanceada en macro-nutrientes", 5, "https://i.postimg.cc/XYjkyX4B/pollo-1433651.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Cubra el pollo con una envoltura de plástico y golpee cada pieza hasta que tenga un grosor uniforme, aproximadamente una pulgada más o menos en las partes más gruesas (esto solo ayuda a que se cocine más rápido y de manera más uniforme).", 5), new Pas(2, "Retire el plástico y espolvoree generosamente cada trozo de pollo con sal marina y pimienta recién molida.", 3), new Pas(3, "Prepara los tomates, el ajo y la albahaca y reserva. Prepara la pasta de acuerdo con las instrucciones del paquete.", 4), new Pas(4, "Caliente el aceite de oliva en una sartén grande y pesada hasta que una gota de agua chisporrotee por la parte superior. ", 4), new Pas(5, "Agregue el pollo y saltee durante varios minutos por cada lado; el objetivo aquí es cocinar el pollo Y obtener un buen dorado por fuera. Cuando el pollo esté listo, déjelo a un lado.", 5), new Pas(6, "Deje que el aceite se enfríe unos minutos, agregue los tomates y vuelva a calentar (si agrega los tomates al aceite caliente, será un festival de salpicaduras). Cocine a fuego lento para cocinar los tomates hasta obtener una mezcla similar a una salsa gruesa.", 2), new Pas(7, "Agregue el ajo y la mantequilla y revuelva para combinar hasta que la mantequilla se derrita. Agregue el pollo nuevamente para remojar en la salsa durante unos minutos.", 4), new Pas(8,"Justo antes de servir, agregue la albahaca. Cubra las porciones de pasta con el pollo y la salsa.", 4))),
                new ArrayList<>(Arrays.asList("1 libra de pechugas de pollo deshuesadas y sin piel", "Sal y pimienta", "5-6 tomates roma, cortados en cubitos", "3 dientes de ajo picados", "3 dientes de ajo picados", "Un puñado de albahaca fresca, suelta, cortada en tiras", "1/4 taza de mantequilla con sal", "8 onzas de pasta, como espaguetis, linguini o bucatini"))));

        data.add(new Recepta("SALMÓN AL HORNO CON FRUTOS SECOS (PORCIONES: 2)",
                "El salmón es un pescado graso rico en Omega3 con propiedades saludables.", 4.5, "https://i.postimg.cc/s2JvZfRG/almond-flakes-dinner-fish-food-food-plating-healthy-salmon-1131198-1.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Comenzamos machacando los distintos frutos secos para hacer una mezcla granulosa con la que haremos una costra sobre el salmón. Para hacer este plato es conveniente usar un lomo grande", 1), new Pas(2, "Con una brocha, barnizamos ligeramente el lomo de salmón con un poco de aceite de oliva virgen extra y lo ponemos a continuación sobre el plato donde tenemos la mezcla de frutos secos. Apretamos un poco para que se queden adheridas y pasamos el pescado a la fuente de horno.", 10), new Pas(3, "En ella habremos puesto una cama de rodajas de calabacín, que serán después la guarnición de nuestra receta de salmón al horno, completando así un plato saludable y lleno de sabor. Horneamos después de haber precalentado a 220º y dejamos cocinar unos 10 minutos hasta que veamos que el salmón ha cambiado de color. ", 10, 10),  new Pas(4, "Dejamos reposar 5 minutos antes de servir para que el salmón se termine de cocinar con el calor remanente.", 5, 5))),
                new ArrayList<>(Arrays.asList("300g de salmón fresco en un lomo", "20g de nueces", "20g de almendra laminada", "20g de pistachos", "5ml de aceite de oliva extra virgen (1 cucharada de té)", "1 calabacín."))));

        data.add(new Recepta("CREMA DE CACAHUATES",
                "Saludable alternativa a la de los comercios, libre de azúcares extras.", 4.5, "https://i.postimg.cc/1zXgxhqk/32383531817-52c8cc5b15-b.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Colocar en la batidora 500 gramos de cacahuetes pelados y tostados (sin sal), 50 cc de aceite de oliva extra virgen y una pizca de sal.", 5), new Pas(2, "Activamos la batidora o el motor de cocina hasta obtener una crema relativamente homogénea.", 10), new Pas(3, " Si deseamos podemos adicionar aceite de sésamo o una cucharada pequeña de cacao en polvo sin azúcar, para dar sabor diferente a la crema.", 8), new Pas(4, "Conservar en heladera. Podemos usarla en variedad de platos: desde un desayuno junto a plátano y una tostada, o bien, para sumar a helados, batidos o como base de un aliño.", 5))),
                new ArrayList<>(Arrays.asList("500 gramos de cacahuetes pelados y tostados (sin sal)", "50 cc de aceite de oliva extra virgen", "Una pizca de sal."))));


        data.add(new Recepta("GALLETAS SUECAS DE AVELLANA",
                "Son típicas de Suecia, en donde cualquier persona te diría que tienen el dulce y reconfortante olor de su infancia", 2.5, "https://i.postimg.cc/3NC5ZydT/24.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Precalentar el horno a 150 °C (300 °F) y forrar una bandeja de hornear con papel sulfurizado.", 4), new Pas(2, "En un bol, mezclar la mantequilla, el edulcorante, la yema de huevo, el polvo de hornear, el extracto de vainilla y la sal.", 4), new Pas(3, "Añadir las harinas de almendra y avellana, y mezclar hasta que todo se combine y se forme una masa húmeda",5), new Pas(4,"Con las manos, formar bolitas de masa de unos 2,5 cm de diámetro y repartirlas sobre la bandeja de hornear.",6 ), new Pas(5, "Aplastarlas un poco con los dedos y colocar una avellana en el centro de cada galleta, presionando suavemente.", 7), new Pas(6, "Hornear durante unos 15-20 minutos hasta que las galletas estén doradas.", 20,20), new Pas(7, "Sacar del horno y dejar que se enfríen en la bandeja de hornear durante al menos 30 minutos antes de retirarlas"  ,30, 30))),
                new ArrayList<>(Arrays.asList("100 g mantequilla ablandada", "80 ml (60 g) eritritol", "1 yema de huevo", "½ cdta. polvo para hornear", "1 cdta. extracto de vainilla", "¼ cdta. sal", "240 ml (110 g) harina de almendra", "240 ml (120 g) avellana molida", "18 avellanas"))));


        data.add(new Recepta("PAN CON SEMILLAS",
                "Ideal para acompañar tus desayunos o meriendas", 3, "https://i.postimg.cc/JzktTNBj/23.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Precalentar el horno a 175°C", 6), new Pas(2, "En un cuenco, mezclar todos los ingredientes secos, excepto las semillas de amapola", 4), new Pas(3, "En un bol separado, mezclar los ingredientes restantes hasta que formen una mezcla homogénea.", 5), new Pas(4, "Añadir la mezcla húmeda a la mezcla seca y mezclar bien", 6), new Pas(5, "Colocar la masa en un molde para pan de aproximadamente 10 x 18 cm ", 5), new Pas(6, "Hornear durante unos 45 minutos sobre la rejilla inferior del horno.", 45, 45), new Pas(7, "Retirar el papel de pergamino y dejar que el pan se enfríe sobre una rejilla.",1))),
                new ArrayList<>(Arrays.asList("240 ml (110 g) harina de almendra", "180 ml (75 g) harina de coco", "80 ml (50 g) semillas de sésamo", "120 ml (85 g) semillas de linaza", "60 ml (40 g) cáscaras de psyllium en polvo", "3 cdta. polvo para hornear", "1 cdta. semillas de hinojo molidas o semillas de alcaravea molidas", "1 cdta. sal", "200 g queso crema a temperatura ambiente", "6 huevos", "120 ml mantequilla derretida o aceite de coco derretido", "180 ml crema (o nata) para montar", "1 cda. semillas de amapola o semillas de sésamo, para decorar"))));


        data.add(new Recepta("LA MEJOR GRANOLA",
                "Helado favorito y querido por generaciones. Con helado bajo en grasa con sabor a mango", 5, "https://i.postimg.cc/YSzygTmb/granola-homemade-nuts-seeds.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Mezcle todo y lo mande al horno unos 45 min a 150~180 grados según él horno ", 5, 45))),
                new ArrayList<>(Arrays.asList("2 1/2 tazas de avena yo use mitad gruesa y mitad instantánea", "5cdas coco en escamas", "5cdas coco rayado", "¼ taza de azúcar de coco", "8 datiles cortados", "10cdas de pasas", "5cdas de semillas mixtas", "Media tasa de miel de caña(se puede sustituir con azúcar o edulcorante)", "Media banana pisada", "1 taza de boniato/manzana cortada en cubitos", "Maní y almendras a gusto.", "Puedes agregarle lo que tu quieras"))));


        data.add(new Recepta("CREAMSICLES/HELADO DE MANGO SIN LACTOSA",
                "Helado favorito y querido por generaciones. Con helado bajo en grasa con sabor a mango", 5, "https://i.postimg.cc/0NRhskPW/CREAMSICLES.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Agregue el mango, el yogur de coco, la leche de su elección y el azúcar de coco en su licuadora.", 4), new Pas(2, "Mezclar hasta que esté suave.", 4), new Pas(3, "Vierta la mezcla de mango mezclado en sus moldes para paletas, dejando aproximadamente ¼ del molde sin llenar.", 6), new Pas(4, "Deje reposar en el congelador durante 30 minutos.", 6, 30), new Pas(5, "Mientras tanto, en un tazón mezcle la crema de coco, la miel o el agave y la vainilla hasta que quede suave.", 4), new Pas(6, "Retire las paletas del congelador, luego vierta la mezcla de crema de coco en el ¼ restante del molde para paletas.", 5), new Pas(7, "Agregue sus palitos de paleta a su molde, luego congele durante al menos 4-6 horas, o hasta que las paletas estén completamente congeladas.", 5, 300))),
                new ArrayList<>(Arrays.asList("2 mangos maduros grandes, cortados en cubos", "½ taza de yogur de coco (natural o de vainilla)", "½ taza de leche sin lácteos a elección", "¼ taza de azúcar de coco", "1 cucharada de miel o agave", "1 cucharadita de extracto de vainilla"))));


        data.add(new Recepta("PASTA CON CAMARONES",
                "versátil y suele gustar a niños y adultos.", 5, "https://i.postimg.cc/QdQtkzyP/spaghetti-shrimp-noodles-benefit-from.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Cocine los fideos según las instrucciones del paquete.", 4), new Pas(2, "Escurrir y reservar.", 4), new Pas(3, "Mientras tanto, en una cacerola mediana, dore 2 dientes de ajo, el condimento de frijoles, la urraca y el chimichurri a fuego medio, fría los condimentos, luego agregue la pasta ya cocida en los condimentos.", 6), new Pas(4, "En otra sartén poner un poco de aceite de oliva 1 diente de ajo y sal, poner los camarones y freír", 6), new Pas(5, "Agrega la masa y dobla los camarones en los fideos para servir en porciones individuales.", 4))),
                new ArrayList<>(Arrays.asList("medio paquete de fideos", "250 gramos de camarón", "3 dientes de ajo", "Condimento para frijoles", "chimichurri", "sal", "Perejil"))));


        data.add(new Recepta("PAN DE SALVADO",
                "Aprende a preparar Pan de salvado de trigo con esta rica y fácil receta. El pan salvado de trigo no es igual al pan integral.", 4.5, "https://i.postimg.cc/d1HQQSQS/bread-oats-flax-corn.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Formar la masa con todos los ingredientes.", 4), new Pas(2, "Dejar levar en lugar tibio hasta que duplique su tamaño.", 4), new Pas(3, "Formar los panes, dejar levar nuevamente.", 6), new Pas(4, "Formar los panes, dejar levar nuevamente.", 6), new Pas(5, "Llevar a horno precalentado durante aproximadamente 25 minutos. Listo!", 4, 25))),
                new ArrayList<>(Arrays.asList("125g de harina 0000", "250g de salvado de trigo", "100g de avena", "50g de levadura fresca", "1 cucharada de miel", "Sal y azucar optativo", "Leche descremada o agua cantidad necesaria"))));

        data.add(new Recepta("NUGGETS DE POLLO",
                "Hechos con ingredientes totalmente naturales, jugosos en su interior y crujientes por fuera", 2.5, "https://i.postimg.cc/7ZxGVTYY/26.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Combinar en un tazón mediano el queso parmesano, la cebolla molida, la sal y la pimienta.", 4), new Pas(2, "En otro tazón, añadir el huevo y batir hasta que esté espumoso", 4), new Pas(3, "Mojar los trozos de pollo en el huevo, asegurándote de cubrirlos completamente.",8), new Pas(4, "Cubrir los trozos de pollo con la mezcla de queso parmesano y sacudir en caso de haya de más.",6), new Pas(5, "En una sartén gran de fuego medio, derretir el aceite de coco. Freír los nuggets de pollo 5 minutos por cada lado hasta que se doren y estén bien hechos.",  5,5))),
                new ArrayList<>(Arrays.asList("650 g muslos de pollo deshuesados cortados en trozos pequeños", "110 g queso parmesano rallado", "1 cdta. cebolla en polvo", "¼ cdta. sal", "¼ cdta. pimienta negra molida", "1 huevo", "1 cda. (15 g) aceite de coco"))));

        data.add(new Recepta("CREMA DE ALMENDRAS",
                "Al igual que la crema de cacahuetes, la crema de almendras siempre es mejor elaborarla en casa para asegurarnos los nutrientes propios de las almendras sin azúcares añadidos y sin aditivos en exceso, como suelen presentarse en los procesados.", 4.5, "https://i.postimg.cc/K8vjLSJ1/almond-cream-filling-640.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Las colocaremos en una placa para horno y las tostaremos por 20-25 minutos.", 5, 25), new Pas(2, "Una vez tostadas dejamos enfriar y colocamos en el vaso de nuestra batidora o motor de cocina. Activamos a máxima potencia y esperamos hasta que poco a poco las almendras comienzan a liberar sus aceites lo que permite que se forme una crema espesa tras unos cinco minutos o menos.", 10), new Pas(3, "Si deseamos una crema más líquida podemos adicionar un par de cucharadas de agua o leche, o bien, aceite de oliva extra virgen. Y si queremos una crema de sabor dulce podemos acudir a una stevia líquida u otro edulcorante sin calorías.", 8), new Pas(4, "Podemos usarla igual que la crema de cacahuete para untar simplemente o dar sabor y textura cremosa a platos. Incluso, va muy bien para rellenar pasteles o emplear en reemplazo de una mantequilla tradicional.", 5))),
                new ArrayList<>(Arrays.asList("Para elaborar crema de almendras sólo necesitamos las almendras crudas sin su cáscara externa."))));


        data.add(new Recepta("MOSTACHOLES CON BRÓCOLI, SALSA BLANCA Y POLLO",
                "Mostacholes con brócoli, salsa blanca sin manteca y pollo. Fácil, rápido y rico. Cred ig: @anahidajilnutricion", 2.5, "https://i.postimg.cc/bNn6Tfhp/210901943-844240553177897-2550090427189962887-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Colocar en una olla la leche fría con la maicena, mezclando con un batidor manual para homogeneizar la preparación.", 4), new Pas(2, "Colocar la olla sobre fuego, revolviendo con el batidor hasta que hierva, espese y se forme una salsa blanca.", 4), new Pas(3, "Retirar del fuego, agregar aceite, pimienta y nuez moscada. Listo!", 6))),
                new ArrayList<>(Arrays.asList("2 cucharadas soperas de maicena", "500cc de leche descremada", "1 cucharada sopera de aceite", "Pimienta y nuez moscada a gusto"))));


        data.add(new Recepta("ANILLOS INTEGRALES DE CHOCOLATE Y COCO",
                "Aperitivo muy rico y sano para tener una opción mas. Cred ig: @anahidajilnutricion", 4.5, "https://i.postimg.cc/vTbWLkLH/210878084-671085757181153-9222618664262256956-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Mezclar todos los sólidos, agregar los líquidos. Mezclar. Armar con las manos los anillitos.", 4), new Pas(2, "Colocar en fuente aceitada y llevar a horno precalentado durante 10 a 15 minutos.", 4, 15), new Pas(3, "Listo!", 6))),
                new ArrayList<>(Arrays.asList("1/2 taza de harina integral", "1/2 taza de avena", "2 cucharadas colmadas de coco rallado", "2 cucharadas de cacao amargo", "1 cucharadita de polvo de hornear", "1 cucharada sopera de edulcorante liquido apto cocción", "Esencia de vainilla a gusto", "1/4 taza de leche descremada", "2 cucharadas soperas de aceite"))));


        data.add(new Recepta("BATIDO TROPICAL CON COLÁGENO",
                "Si sufres de dolores articulares y en especial en invierno, esta receta es perfecta para ti. Ayuda a regenerar el cartílago y reduce la inflamación, fortalece, hidrata y mejora la piel, cabello, uñas y reduce los dolores articulares.", 2.5, "https://i.postimg.cc/QMtP1BDv/8673176560-fdda29df0e-b.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Licuar las frutas con la chía y colágeno", 4), new Pas(2, "Agregar la leche de coco al gusto hasta obtener la consistencia deseada.", 4), new Pas(3, "Servir y disfrutar", 6))),
                new ArrayList<>(Arrays.asList("1scoop de colágeno Energy Green", "1/2tz de mango congelado", "1/2tz de piña congelada", "½ plátano congelado", "3 huevos tamaño mediano", "1/2tz de fresas congeladas", "1cda de chía", "Leche de coco al gusto"))));


        data.add(new Recepta("BATIDO ENERGÉTICO DE MACA NEGRA CON CACAO",
                "Ponte power con este batido energético de maca negra con cacao en polvo", 4.5, "https://i.postimg.cc/RZyzr9Ln/batidochoco2.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "En una licuadora añadir los ingredientes y licuar", 4), new Pas(2, "Servir y añadir chocolate negro rayado al gusto.", 4))),
                new ArrayList<>(Arrays.asList("1cda de maca negra en polvo Amazon Andes", "1cda de cacao en polvo Amazon Andes", "1 taza de leche de vegetal", "1 cda de miel de yacón al gusto", "Chocolate negro o al gusto para decorar."))));


        data.add(new Recepta("PANQUEQUES DE MACAMIX Y MIEL",
                "Una receta casera super fácil y sobretodo saludable ", 4.5, "https://i.postimg.cc/nc475cKC/restaurant-food-gourmet-pancakes-thumbnail.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Licuar el plátano, avena, maca mix, huevo y leche vegetal hasta tener una mezcla uniforme.", 4), new Pas(2, "Calentar una sartén con una pizca de aceite de coco, cuando esté caliente colocar la mezcla de los panqueques haciendo pequeños círculos (pasar a fuego medio)", 4), new Pas(3, "Dejar cocinar hasta que los panqueques muestren pequeñas burbujas, dar la vuelta y dejar un par de minutos extra.", 6), new Pas(4, "Servir y agregar miel y frutas al gusto.", 6))),
                new ArrayList<>(Arrays.asList("2cdas de avena", "2cdas de maca mix gelatinizada Amazon Andes", "1 huevo", "1/2 plátano de seda", "1/4tz de leche de vaca light o bebida vegetal", "Pizca de aceite de coco Amazon Andes", "Miel de abeja o yacón amazon Andes al gusto", "Fruta para decorar"))));


        data.add(new Recepta("PUDÍN DE CHÍA, MACA Y YOGURT",
                "Te encantará, lo volverás a repetir.", 3.5, "https://i.postimg.cc/t4wQPDKQ/yogurt-chia-seeds-fruit-strawberry.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "En un bowl agregar la leche, chía, maca, yacón y canela", 4), new Pas(2, "Mezclar hasta que se integren los ingredientes.", 4))),
                new ArrayList<>(Arrays.asList("-1tz de leche de vaca light o bebida vegetal", "1/4tz de chía", "1cda de maca mix gelatinizada en polvo Amazon Andes", "1cdta de miel de yacón Amazon Andes", "Canela al gusto", "Yogurt de su preferencia", "Opcional: Fruta fresca y frutos secos para decorar"))));



        data.add(new Recepta("ALBÓNDIGAS DE LENTEJAS",
                "Alternativa para quienes no consuman carne, muy nutritiva además.", 4, "https://i.postimg.cc/wMTWCVcW/93989635-1562994567209688-3307983820101246973-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Pisar las lentejas cocidas con el arroz hasta formar una pasta con pedacitos (con un pisapapa porque si se procesa queda muy suave y sin textura).", 4), new Pas(2, "Agregar los además ingredientes y mezclar (Le puedes agregar un POQUITO de agua si te queda muy seco)", 4), new Pas(3, "Hacer bolitas y cocinar durante 20 minutos vuelta", 20, 20), new Pas(4, "y vuelta, cocinar en salsa otros 5-10 minutos mas y listo", 6, 10), new Pas(5, "RECOMENDACION:el arroz y las lentejas un poco pasadas de cocción para poder pisarlas mejor y que queden mas ricas", 6))),
                new ArrayList<>(Arrays.asList("2 tazas de lentejas cocidas", "1 taza de arroz integral cocido", "1 cebollita de verdeo picada", "4 cdas de harina de garbanzos", "4 cdas de harina de arroz", "1 cda de vinagre blanco", "Un huevo de chia (una cucharada de chia mas 4 de agua)", "Sal y condimentos (súper importantes)"))));

        data.add(new Recepta("GALLETAS DE NATA",
                "Cómo hacer galletas de nata. Unas galletas con un sabor intenso a lácteo pero con un toque suave y delicado.", 3, "https://i.postimg.cc/nccTrXJm/food-dessert-no-one-appetizer.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "En un bol mezclamos la harina, la levadura y la sal. En otro bol batimos el huevo con el azúcar hasta que se forme una crema. Añadimos la nata y mezclamos bien.", 6), new Pas(2, "Incorporamos los ingredientes secos y con un tenedor comenzamos a integrar los ingredientes. Nos va a quedar una masa pegajosa y poco manejable.", 4), new Pas(3, "Formamos una bola y la dejamos en el frigo durante no menos de 1 hora. Retiramos la masa del frigo y la cortamos en 3 porciones. Enharinamos bien la superficie de trabajo.", 5), new Pas(4, "Con un rodillo estiramos la masa hasta que quede de medio cm. de grosor. Es fundamental que vayamos enharinando periódicamente la superficie de trabajo y el rodillo para que la masa no se pegue a la encimera. Ya que esta masa tiene una textura bastante pegajosa.", 6), new Pas(5, "Una vez tengamos la masa estirada con el grosor deseado cortamos las galletas con el cortante que queramos. Si no tenemos cortantes para galletas, con un vaso podríamos trabajar de la misma manera.", 5), new Pas(6, "Mientras el horno se precalienta a 180º C vamos colocando las galletas en una bandeja de horno forrada con papel sulfurizado.", 4), new Pas(7, "Horneamos las galletas", 10, 10), new Pas(8, "Retiramos las galletas para una rejilla hasta que se hayan enfriado. Seguimos el proceso hasta terminar la masa de galletas. Las tandas que sean necesarias.", 2))),
                new ArrayList<>(Arrays.asList("425 gr. harina", "1 huevo", "200 ml. de nata para montar 35% M.G.", "200 gr. azúcar blanquilla", "1 sobre de levadura química (8 gr.)", "Pizca de sal", "Papel sulfurizado"))));


        data.add(new Recepta("GALLETAS DE AVENA Y NARANJA",
                "Rápido y fácil para reemplazar galletas convencionales. Cred Ig: @rece.tass", 4, "https://i.postimg.cc/kMHJThyh/103584961-177858077091456-6535973140834742336-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Mezclar todos los ingredientes y haces bolitas.", 4), new Pas(2, "Poner en una placa ligeramente aceitada y llevar a horno medio(180°) ", 4), new Pas(3, "Esperar hasta que se doren", 10))),
                new ArrayList<>(Arrays.asList("2 taza avena", "½ taza azúcar", "Cucharada chía remojada", "¼ taza coco", "Pizca de canela", "Media taza de jugo de naranja", "Chocolate picado"))));


        data.add(new Recepta("GALLETAS SABLÉ DE CHOCOLATE",
                "Cómo hacer galletas de chocolate. Una receta muy dulce. La palabra sablé quiere decir arenado en francés, y esa es la mejor forma de describir a este tipo de galletas. Se trata de una masa frágil y muy crujiente que se desmenuza fácilmente en arenas o migas.", 4.5, "https://i.postimg.cc/HWvXSVQT/cookies-chocolate-cookies-dark-cookies-delicious-thumbnail.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "En un bol mezclamos los ingredientes secos, la harina, el bicarbonato, la sal y el cacao en polvo. Reservamos.", 3), new Pas(2, "En otro bol batimos la mantequilla con el azúcar hasta formar una crema. La mantequilla debe estar blanda", 1, 1), new Pas(3, "Combinamos ambas mezclas, la de los sólidos y la de la mantequilla en el mismo bol y añadimos el chocolate que habremos troceado o rallado. Mezclamos bien hasta que este compacto y se pueda formar una bola", 5), new Pas(4, "Colocamos la masa sobre un papel de plástico transparente y le damos forma de rulo con las manos.Podemos hacer uno o varios rulos. Envolvemos con el papel de plásticos y los giramos sobre si mismo hasta que nos quede como un caramelo alargado.", 4), new Pas(5, "Guardamos la masa así empaquetada en el frigo durante unas horas, hasta que se haya endurecido totalmente. Retiramos la masa del frigo y con un cuchillo cortamos discos de masa que vamos colocando sobre un papel sulfurizado en una bandeja de horno. El grosor de estos discos debe de ser en torno al medio centímetro. Colocamos las galletas separadas en la bandeja", 60, 60), new Pas(6, "Horneamos con el horno previamente caliente a 180º C", 11, 11), new Pas(7, "Retiramos la bandeja del horno y pasamos las galletas sablé a una rejilla con mucho cuidado ya que estarán aun blanditas hasta que se enfríen totalmente.", 10, 10))),
                new ArrayList<>(Arrays.asList("140 gr. harina de trigo", "25 gr. cacao en polvo sin azúcar", "120 gr. mantequilla", "130 gr. azúcar", "110 gr. chocolate 70% cacao", "½ cdita. bicarbonato", "¼ cdita. sal (mejor en escamas)", "½ cdita. extracto vainilla"))));


        data.add(new Recepta("MUFFINS DE ARÁNDANOS",
                "Cómo hacer muffins de arándanos. Los muffins, la versión americana de nuestras tradicionales magdalenas, al igual que estas, nos permiten un sinfín de sabores y rellenos. Pero de entre todas, una de las opciones para preparar muffins y asegurarnos el éxito, es incluyendo en su preparación algo de fruta, como los arándanos. Les dará jugosidad y esponjosidad adicional a este dulce, aumentando su sabor y mejorando su textura.", 3, "https://i.postimg.cc/PxwJ25h5/muffins-blueberry-muffins-cake-cup-cakes.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "En un bol mezclamos los ingredientes secos menos el azúcar y los arándanos. Tamizamos la harina, la levadura, el bicarbonato y la sal y reservamos..", 4), new Pas(2, "En otro bol grande batimos el huevo con 100 g. de azúcar reservando el resto del azúcar para hacer el relleno de crema de queso. Batimos bien hasta que la mezcla espume. Añadimos el extracto de vainilla, el aceite de girasol, el yogur y seguimos batiendo.", 5), new Pas(3, "Incorporamos 125 gr. de crema de queso y la incorporamos con el resto de ingredientes. Cuando la mezcla esté lista incluimos los arándanos. Vamos agregando la harina e integrando con una espátula sin batir la mezcla en exceso. Sólo lo necesario para que se integre la masa. Reservamos.", 5), new Pas(4, "Preparamos la mezcla de queso mezclando el queso en crema con los 40 gr. de azúcar restantes. Colocamos las cápsulas de papel en un molde para muffins y rellenamos cada una hasta casi la mitad de la altura.", 6), new Pas(5, "Añadimos 1 cucharadita de crema de queso. Tapamos con el resto de la masa hasta rellenar la cápsula unos ¾ de su altura. Espolvoreamos con azúcar.", 3), new Pas(6, "Horneamos, con el horno previamente caliente a 180º C, con calor arriba y abajo", 23, 23))),
                new ArrayList<>(Arrays.asList("250 gr. harina", "140 gr. azúcar", "1 cdita. levadura química", "1 cdita. bicarbonato sódico", "¼ cdita. sal", "125 gr. yogur natural", "70 ml. aceite de girasol", "1 huevo", "½ cdita. extracto de vainilla", "100 gr. arándanos frescos", "225 gr. crema de queso"))));

        data.add(new Recepta("CARACOLAS DULCES",
                "Hoy os traigo la receta de unas caracolas dulces que, estoy totalmente seguro de que os engancharán. El resultado es un bocado dulce esponjoso, con una masa súper aromática y con mucho sabor.", 3.5, "https://i.postimg.cc/7Lyqwnyw/bread-escargot-food-dessert-gourmet-thumbnail.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "En un bol mezclamos todos los ingredientes y trabajamos la masa con maquina", 9, 9), new Pas(2, "Ponemos la masa en un bol enharinado y lo tapamos con papel transparente. Dejamos que reposeen un lugar cálido y sin corrientes, el interior del horno previamente templado es un sitio perfecto.", 30, 30), new Pas(3, "Dividimos la masa en porciones de unos 60 gr. y le damos forma a cada uno. Estiramos cada porción con un rodillo de forma alargada", 7), new Pas(4, "Con un cuchillo hacemos unas incisiones profundas a lo largo de la masa, pero sin que lleguen a cortarla totalmente, como muestra el video. Enrollamos la pieza y la doblamos sobre si misma haciendo una caracola.", 2, "3bxmv7qRiak"), new Pas(5, "Colocamos cada porción en la bandeja del horno sobre un papel vegetal. Debemos ponerlas separadas unas de otras ya que aún crecerán bastante. Dejamos que reposen las caracolas dentro del horno aún templado, hasta que doblen su volumen.", 30, 30), new Pas(6, "Pintamos las caracolas con una pizca de mantequilla derretida, espolvoreamos con abundante azúcar y horneamos, con el horno previamente caliente a 180º C", 20, 20), new Pas(7, "Retiramos las caracolas del horno y las dejamos enfriar sobre una rejilla entes de disfrutarlas.", 10, 10))),
                new ArrayList<>(Arrays.asList("400 gr. Harina de fuerza", "195 ml. Leche entera Central Lechera Asturiana", "80 mantequilla Central Lechera Asturiana", "1 huevo", "8 gr. Levadura fresca", "5 gr. Sal", "60 gr. Azúcar + algo para espolvorear"))));


        data.add(new Recepta("BIZCOCHO CASERO DE YOGUR",
                "Os presento uno de los bizcochos más fáciles de preparar y con un resultado de rechupete. Este bizcocho admite multitud de variaciones, lo puedes utilizar como base de distintas tartas o añadirle trocitos de frutas o frutos secos. Y por supuesto, tomarlo tal cual, como os lo presento aquí, bizcocho casero de yogur, un éxito garantizado.", 2.5, "https://i.postimg.cc/QMtP1BDv/8673176560-fdda29df0e-b.jpgg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Añadimos el yogur a un bol grande y lavamos el potito o envase donde viene el yogur. Precalentamos el horno a 200º C y untamos el molde que vamos a utilizar con mantequilla, en la base y los lados. Espolvoreamos con un pellizco de harina y quitamos el exceso de harina. Reservamos..", 4), new Pas(2, "Batimos los huevos con unas varillas, cuando empiecen a blanquear, añadimos una pizca de sal. Medimos el azúcar y volvemos a batir, ya tenemos la base lista.", 4), new Pas(3, "Añadimos en el bol una medida de aceite de oliva suave, la levadura química y medimos de nuevo la harina con el vasito", 6), new Pas(4, "Metemos todo en el bol y batimos con unas varillas . Debe de quedar una masa homogénea y fina. Vertemos la mezcla en el molde", 6), new Pas(5, "Horneamos. Tenéis que poner el futuro bizcocho en la bandeja del medio con calor arriba y abajo, sin aire, a 180º C.", 30, 30), new Pas(6, "Dejamos que se termine de enfriar sobre una rejilla para evitar que coja humedad. Listo para comer.", 11, 11))),
                new ArrayList<>(Arrays.asList("1 medida de yogur de aceite suave de oliva", "1 medida de yogur (en este caso natural azucarado)", "2 medidas de yogur de azúcar blanquilla", "3 medidas de yogur de harina de trigo (o de maíz)", "3 huevos tamaño mediano", "1 sobrecito de levadura química en polvo o polvo de hornear (16 g.)", "1 pizca de sal", "un poquito de mantequilla y una pizca de harina, para la base del bizcocho"))));

        data.add(new Recepta("OMELETE DE CALABACÍN",
                "perfecta para esos aperitivos fríos con la familia o los amigos o incluso en cualquier celebración informal.", 2.5, "https://i.postimg.cc/vBfbCbQH/30.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Precalentar el horno a 200°C", 4), new Pas(2, "Lavar el calabacín, pero no pelarlo. Rallarlo y estrujarlo para quitar el exceso de líquido", 4), new Pas(3, "En un recipiente grande, mezclar el calabacín con el queso rallado, los huevos, la harina de almendras, el psyllium y la sal.",8), new Pas(4, "Combinar bien hasta que quede una masa suave.",6), new Pas(5, "Dividir la masa en porciones.",3), new Pas(6, "Darle forma esférica a cada porción. Luego, con las manos mojadas, aplanarlas para formar las tortillas.", 4),new Pas(6, "Hornear en la mitad del horno, durante unos 20-25 minutos o hasta que apenas se doren.", 25, 25))),
                new ArrayList<>(Arrays.asList("550 g calabacines, rallado", "350 ml queso rallado", "2 huevos, grandes", "475 ml (225 g) harina de almendra", "1 cda. (10 g) cáscaras de psyllium en polvo", "½ cdta. sal"))));


        data.add(new Recepta("ALBONDIGAS RELLENAS",
                "Son muy ricas y faacil de hacer", 2.5, "https://i.postimg.cc/Y23WZ3GB/29.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "En un tazón grande, mezclar la carne, la albahaca, la sal, la pimienta y un poco de agua fría. Mezclar bien con las manos o con un tenedor grande de madera.", 4), new Pas(2, "Armar 10 hamburguesas planas de aproximadamente 8-10 cm (3-4 pulgadas) de diámetro y 1 cm (½ pulgada) de grosor.", 4), new Pas(3, "Cortar la mozzarella en 10 trozos y colocar un trozo en cada hamburguesa. Envolver el queso con la carne y armar una bola.",8), new Pas(4, "Freír en mantequilla a fuego medio hasta que los jugos salgan limpios.",6))),
                new ArrayList<>(Arrays.asList("700 g carne molida de res", "1 cda. albahaca seca", "½ cdta. sal", "2 pizcas pimienta negra molida", "2 cda. agua fría", "110 g (225 ml) queso mozzarella", "mantequilla para freír"))));


        data.add(new Recepta("MOUSSE DE FRESAS",
                "Cómo preparar una mousse de fresas. La receta de hoy es una de esas que podemos preparar con casi nada, y con la que conseguiremos resultados geniales. Bien sea porque no disponemos de tiempo o ganas para preparar un postre, o simplemente porque de repente nos asaltan unas ganas irrefrenables de dulce, esta mousse de fresa fácil es una opción muy a tener en cuenta..", 3, "https://i.postimg.cc/63GBVbws/moussefresa.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Calentamos en un cazo 250 ml. de agua. Cuando comience a hervir añadimos la gelatina de fresa y removemos hasta que se haya diluido.", 3), new Pas(2, "Retiramos del fuego y añadimos 250 ml. de agua fría. Removemos bien y reservamos hasta que se haya enfriado la mezcla. Una vez fría la guardamos en el frigo hasta que vemos que está casi cuajada.", 50, 50), new Pas(3, "Mientras se cuaja la gelatina de fresa montamos la nata la guardamos en la nevera. ", 5), new Pas(4, "Lavamos y troceamos las fresas y las trituramos con la batidora. Guardamos las fresas también en el frigo hasta el momento de utilizarlas, cuando la gelatina se haya cuajado.", 5), new Pas(5, "Con una batidora de varillas batimos la gelatina para deshacerla. Incorporamos la nata con las fresas y seguimos batiendo.", 4), new Pas(6, "Nos quedará una textura totalmente esponjosa y aireada. Servimos en las copas en que vayamos a presentar la mousse y guardamos en el frigo durante 2 horas.", 2))),
                new ArrayList<>(Arrays.asList("1 sobre de gelatina de fresa en polvo (85 gr.)", "200 ml. de nata para montar", "250 gr. de fresas frescas", "500 ml. de agua"))));


        data.add(new Recepta("TARTA DE CUAJADA CON CHOCOLATE",
                "Cómo preparar una tarta de cuajada con chocolate. Os presento una receta de postre muy sencilla y con la que triunfaréis ya sea en una comida familiar, en una comida con amigos o en la merienda con los más peques de la casa.", 4, "https://i.postimg.cc/LstTq2YG/tartachoco.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Picamos las galletas lo más finas posible. Nosotros lo hemos hecho con una batidora de vaso pero si no tenéis se puede hacer envolviéndolas en un trapo de cocina y machacándolas con una cuchara o algo pesado; no queda tan fino pero sirve exactamente igual.", 6), new Pas(2, "Untamos la base del molde con una capa muy fina de mantequilla y derretimos el resto usando el microondas, así es más rápido.Mezclamos la mantequilla derretida con el azúcar con una varilla manual y añadimos las galletas trituradas. Mezclamos hasta que tenga el aspecto de una pasta y la repartimos sobre la base, presionando con la ayuda de una cuchara o con los dedos. La metemos a la nevera", 30, 30), new Pas(3, "Del litro de leche que vamos a utilizar separamos unos 200 ml aproximadamente. En ellos disolvemos los dos sobres de cuajada hasta que esté bien mezclado. El resto de la leche (800 ml) se echan a un cazo y se ponen a hervir con 50 g de azúcar.", 5), new Pas(4, "Troceamos el chocolate (cuanto más fino quede mejor se fundirá). Lo añadimos a la leche que tenemos en el cazo. Removemos a mano con la varilla hasta que obtenemos una crema homogénea y suave. Añadimos la cuajada diluida en leche y seguimos removiendo hasta que hierva durante 4 ó 5 minutos. No debemos dejarlo más tiempo pues si no la crema de chocolate se quemará. Retiramos del fuego y dejamos que se temple en el propio cazo.", 10), new Pas(5, "Vertemos con suavidad sobre la capa de galletas, siempre ayudados de una cuchara para que no caiga forme un agujero.", 1), new Pas(6, "Una vez listo la dejamos enfriar en un sitio fresco y por último la metemos en la nevera un mínimo de 4 horas. Un apunte; esta tarta está mucho mejor de un día para otro.", 2), new Pas(7, "Un poco antes de servirla, la sacamos de la nevera. Desmoldamos con la ayuda de un cuchillo para separar la base de galleta sin que se rompa. Esta tarta está deliciosa sola, pero también acompañada de nata o helado.", 5))),
                new ArrayList<>(Arrays.asList("Ingredientes para la base de galletas: 240 g de galletas", "75 g de mantequilla", "1 cucharada sopera de azúcar", "Ingredientes para la crema de chocolate: 250 g de chocolate negro para fundir", "1 l. de leche entera", "2 sobres de cuajada (2 x 12 g.)", "Pepitas de chocolate para decorar"))));


    }

    public static int getDataSize (){
        return data.size();
    }

    public static Recepta getRecepta (int position){
        return data.get(position);
    }

    public void clear () {
    }

    public void addAll (List<ReceptaBBDD> originalItems) {
    }
}
