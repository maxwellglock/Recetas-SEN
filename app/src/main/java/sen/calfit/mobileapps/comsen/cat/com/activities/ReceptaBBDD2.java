package sen.calfit.mobileapps.comsen.cat.com.activities;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sen.calfit.mobileapps.comsen.cat.com.domain.Pas;
import sen.calfit.mobileapps.comsen.cat.com.domain.Recepta;

public class ReceptaBBDD2 extends AppCompatActivity {


    private static ArrayList<Recepta> data = new ArrayList<>(); // simulació base de dades


    private static ReceptaBBDD2 instance = null;
    protected ReceptaBBDD2 () {
        initData();
    }
    public static ReceptaBBDD2 getInstance() {
        if(instance == null) {
            instance = new ReceptaBBDD2();
        }
        return instance;
    }

    public void initData(){

        //38


        data.add(new Recepta("GALLETAS DE AVENA SIN HORNEAR",
                "Solo requieren un puñado de ingredientes de despensa y 5 minutos de preparación.", 4.5, "https://i.postimg.cc/02ywV9sS/3.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Cubra una bandeja para hornear grande con papel manteca.", 4), new Pas(2, "En una cacerola mediana agregue el jarabe de arce, la leche, el cacao, aceite de coco, la mantequilla de maní y la vainilla y bata para combinar. Deje hervir durante 2 minutos, revolviendo con frecuencia.", 4,2 ), new Pas(3, "Retirar del fuego y agregar la avena.", 6), new Pas(4, "Use una cuchara para galletas de 2 cucharadas para colocar la masa en la bandeja para hornear. Forme bolas (opcional), enfríe durante 30 minutos en el congelador o hasta que esté firme.", 6, 30))),
                new ArrayList<>(Arrays.asList("1½ tazas de avena", "½ taza de sirope de arce", "¼ taza de leche a elección", "2 cucharadas de cacao en polvo Amazon Andes", "1 cucharada de aceite de coco Amazon Andes", "¼ taza + 2 cucharadas de mantequilla de maní cremosa", "½ cucharadita de extracto de vainilla"))));


        data.add(new Recepta("MUG CAKE DE CHOCOLATE",
                "Un desayuno y/o postre saludable para toda la familia.", 4.5, "https://i.postimg.cc/SRCVxqgV/2.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Batir el huevo y mezclar con el plátano, cacao, maca, avena, polvo de hornear y leche.", 4), new Pas(2, "Integrar bien los ingredientes hasta tener una mezcla homogénea.", 4), new Pas(3, "Llevar al microondas por 1-2 minutos.", 6), new Pas(4, "Servir con fresas y arándanos", 6))),
                new ArrayList<>(Arrays.asList("1 huevo", "1cda de cacao en polvo Amazon Andes", "1cda de maca en polvo Amazon Andes", "1/2 plátano de seda", "3cdas de avena (en hojuelas o en harina)", "3cdas de leche", "1cdta de aceite de coco Amazon Andes", "1cdta de polvo de hornear", "Miel Amazon Andes o endulzante al gusto", "Una pizca de canela en polvo", "Opcional: fresas y arándanos para decorar."))));

        data.add(new Recepta("TORTA DE ZANAHORIA",
                "Es una torta facil de hacer que puede acompañar cualquier merienda y sobre todo saludable", 4.5, "https://i.postimg.cc/rwTrr8GD/90764770-147016560175710-1402678245073820806-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Mesclar todos los líquidos junto con la azúcar y disolver", 4), new Pas(2, "Agregar las zanahorias ralladas y las harinas tamizadas junto con la canela, el polvo para hornear y el bicarbonato", 4), new Pas(3, "Mezclar todo y llevar al horno precalentado a 180° durante 45-50 minutos",5, 50))),
                new ArrayList<>(Arrays.asList("3 tazas de harina", "½ taza de azúcar integral", "½ taza de azúcar integral", "2 cucharadas de edulcorante a elección", "2 tasas de agua", "¾ taza de aceite neutro (girasol)", "1cda de vinagre de manzana", "2 zanahorias ralladas", "2 cucharaditas de canela en polvo", "1½ cucharada de polvo para hornear", "½ cucharada de bicarbonato", "Nueces almendras y pasas a elección"))));


        data.add(new Recepta("LASAGNA DE BERENJENAS",
                "Super rica y con un súper ingrediente.... HUMMUS - Cred IG: @rece.tass", 4.5, "https://i.postimg.cc/BnPxxhkz/93296286-228010161748372-4809585758843368882-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Cortar las berenjena y la cebolla en rodajas finas", 4), new Pas(2, "Hacer una capa de berenjena humus cebolla salsa y repetimos", 4), new Pas(3, "llevar al horno 40 minutos tapado con papel aluminio ",5, 40))),
                new ArrayList<>(Arrays.asList("2 berenjenas", "una cebolla", "una cebolla de verdeo", "1taza de hummus", "media taza de salsa", "queso de avena o alguno vegano"))));



        data.add(new Recepta("FACTURAS INTEGRALES",
                "Exquisitas para acompañar - Cred IG: @rece.tass", 4.5, "https://i.postimg.cc/pT6yTvC1/96779357-1039336783134414-7841589826671370415-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Mezcla todos los ingredientes hasta formar una masa.", 4), new Pas(2, "Forma las facturitas y las llevas al horno (180°) de 15 a 20 minutos", 4, 20), new Pas(3, "Las pintas con almíbar y listo", 5))),
                new ArrayList<>(Arrays.asList("1 taza de harina integral", "1 taza de harina de avena", "1 taza de azúcar integral (podes usar edulcorante)", "2 cucharaditas bien colmadas de bicarbonato de sodio", "3/4 tazas de agua o leche vegetal", "5 cucharadas de aceite neutro)", "esencia de vainilla a gusto"))));


        data.add(new Recepta("ARROZ INTEGRAL",
                "Queda MUY rico y es súper práctico - cred IG @rece.tass", 4, "https://i.postimg.cc/k5Dm5bHq/200274351-760258017995090-7984390752487067391-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Salteas las verduras con un poco de aceite hasta que se doren ", 4), new Pas(2, "le agregas el arroz y revolves por unos tres minutos", 4, 3), new Pas(3, "le agregas los condimentos el agua y el tomate triturado", 6), new Pas(4, "Cocinamos tapado a fuego mínimo hasta que se evapore todo",5))),
                new ArrayList<>(Arrays.asList("1 taza y media de arroz integral", "1 cebolla", "Medio pimiento marrón", "1 taza de tomate triturado", "3 tazas de agua", "Condimentos (tomillo, laurel,orégano,cúrcuma,pimentón )"))));


        data.add(new Recepta("MEDALLONES RELLENOS DE VERDURA",
                "No se pueden perder esta receta porque es MUY rica - Cred IG: @rece.tass", 4, "https://i.postimg.cc/MKZ1XZzd/198917006-103314211929385-5979991379381254789-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Triturar las lentejas y agregar todos los demás ingredientes hasta que quede como una masa.", 4), new Pas(2, "Hacer dos tapitas y rellenarlas con la verdura", 4), new Pas(3, "Pasarlas por pan rallado y cocinarlas en una reseña o darte de los dos lados durante 15 minutos en total", 6, 15), new Pas(4, "Opcional: agregar mantequilla de maní y nibs de cacao para decorar.", 4))),
                new ArrayList<>(Arrays.asList("2 tazas lentejas cocidas", "Medio vaso de agua", "Semillas de chia (a elección)", "Media taza de harina integral", "Condimentos(orégano, provenzal, cebolla, pimentón, surtidos de especias, etc…)", "Para el relleno usar espinacas", "cucharadas de harina ", "provenzal, sal y semillas de lino molido"))));


        data.add(new Recepta("HAMBURGUESAS DE LENTEJAS",
                "Ni secas ni desabridas", 4.5, "https://i.postimg.cc/YSXMP1Sg/14.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "pisar las lentejas y agregar la zanahoria rayada la cebolla picada los condimentos y tres cucharadas de agua.", 4), new Pas(2, "Mezclar todo y cocinar en una sartén anti adherente (en mínimo)con un poquito de aceite hasta que se cueza",5))),
                new ArrayList<>(Arrays.asList("2 tazas de lentejas cocidas", "una cebollita de verdeo", "una zanahoria", "3cucharadas de harina de avena provenzal"))));


        data.add(new Recepta("GALLETAS DE COCO",
                "Un increíble sabor a coco que esta buenísimo", 4.5, "https://i.postimg.cc/vZWyFd4y/13.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "mezclar todos los ingredientes hasta formar una masa, estirar y cortar.", 4), new Pas(2, "llevar al horno precalentado unos 10-20 minutos o hasta que estén doraditas",5,20))),
                new ArrayList<>(Arrays.asList("1taza de harina de avena", "1taza de harina integral", "1/2 taza de coco rallado", "1/2 taza de agua", "1/4 taza de aceite de girasol", "1 cucharadita de aceite de coco", "2 cucharadas de azúcar integral/mascabo", "2 cucharadas de edulcorante "))));


        data.add(new Recepta("BUDIN DE LIMON",
                "Un delicioso budín de limón húmedo y con un sabor súper intenso", 4, "https://i.postimg.cc/yxGx2TgG/12.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Mezclar todo", 4), new Pas(2, "volcar en molde de budin, en caso que haga falta previamente rociada con aceite.", 4), new Pas(3, "Llevar a horno, y retirar una vez cocido, aproximadamente 35 a 45 minutos.",5, 45))),
                new ArrayList<>(Arrays.asList("Jugo de 2 limones", "Ralladura de 1 limón", "1 taza de harina integral", "1 taza de harina leudante", "3 huevos", "1/2 taza de azúcar o su equivalencia en edulcorante apto cocción", "1/4 taza de aceite de girasol alto oleico"))));


        data.add(new Recepta("COOKIES DE AVENA Y CHIPS DE CHOCOLATE",
                "Excelentes para acompañar", 4.5, "https://i.postimg.cc/4xFVsJzq/11.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Pisar la banana, agregar el huevo batido.", 4), new Pas(2, "Agregar esencia de vainilla y edulcorante.", 4), new Pas(3, "Ir sumando avena hasta que se pueda levantar con una cucharada", 6), new Pas(4, "Agregar chips de chocolate.", 5), new Pas(5, "Colocar con cucharada las galletitas en una fuente previamente aceitada.", 5),  new Pas(6,"Llevar a horno bajo precalentado por 15 a 20 minutos aprox.",5,20))),
                new ArrayList<>(Arrays.asList("1 huevo", "1 banana madura pisada", "Esencia de vainilla", "1 cucharada tipo té de edulcorante líquido", "Avena cantidad necesaria hasta poder armar las galletitas con una cuchara", "Chips de chocolate a gusto"))));


        data.add(new Recepta("SOPA DE LENTEJAS",
                "Para los días de frío. - Cred IG: @rece.tass", 4, "https://i.postimg.cc/BnP1dtJw/90087562-520659402163670-5812099428946050695-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Cortar en cubos la cebolla la papá y el zapallo y reogar con un poquito de aceite hasta que se dore", 4), new Pas(2, "agregar un litro y medio de agua junto con los condimentos (caldo)", 4), new Pas( 3, "cuando se cocine agregar las lentejas y triturar un poco para dar cremosidad", 5), new Pas(4, "Agregar los hongos y el tomate en cubos y cocinar 10 minutitos más", 5,10))),
                new ArrayList<>(Arrays.asList("Media papa", "Medio zapallo chico", "2 tazas de lentejas cocidas", "hongos de pino (bien lavados)", "un tomate", "condimentos (provenzal, orégano, especias surtidas) podes ponerle lo que más te guste"))));

        data.add(new Recepta("PASTELITOS KETO DE CHOCOLATE Y AGUACATE (PARA 3 UNIDADES)",
                "Existe la variedad blanda o silken, también llamado sedoso, que es ideal para hacer postres como este pudding de chocolate vegano sin azúcar. Rapidísimo y que podemos personalizar de mil maneras.", 4.5, "https://i.postimg.cc/ZRHxF44Q/united-kingdom-london-chocolate-buns-muffins-thumbnail.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Sacar la pulpa del aguacate o de los aguacates, hasta tener unos 100 g. Si ya está muy blanda podremos hacerla cremosa fácilmente usando simplemente un tenedor. Añadir la mantequilla de cacahuete, el cacao, la vainilla, la sal y el edulcorante, y batir bien.", 5), new Pas(2, "Incorporar la leche y batir con el tenedor o unas varillas pequeñas hasta tener una crema homogénea. Si tuviera muchos grumos podríamos *+triturarla** con una batidora o robot. Añadir un poco de chocolate picado sin azúcar, si se desea.", 10), new Pas(3, "Repartir en 2-3 moldes pequeños aptos para el microondas, llenándolos hasta la mitad de su capacidad. Cocinar en el microondas de uno en uno, en intervalos de 1 minuto a máxima potencia. La masa crecerá mucho para después bajarse.", 8), new Pas(4, "Con cuidado, presionar la masa levantada con una cucharilla y pinchar con un palillo. Si saliera muy húmedo, volver a calentar en intervalos de 30 segundos a potencia media. Dejar enfriar por completo antes de desmoldar, o comer directamente con cuchara, con cacao extra espolvoreado.", 5))),
                new ArrayList<>(Arrays.asList("100g de aguacate (peso de la pulpa)", "35g de mantequilla de cacahuate natural", "15g de cacao puro en polvo sin azúcar (dos cucharadas) y mas para decorar", "2.5 ml de esencia de vainilla", "4g de bicarbonato sódico (1/2 cucharada de té)", "30ml de edulcorante apto para cocinar al gusto (equivalente a unos 20-30g de azúcar)", "1 pizca de sal", "30ml de leche de almendra u otra vegetal", "Chocolate negro sin azúcar picado (opcional) al gusto."))));

        data.add(new Recepta("CRACKERS DE SEMILLAS Y AVENA (PORCIÓN: 30 UNIDADES)",
                "Fácil de preparar y te ayudará a no interrumpir de la cetósis", 4.5, "https://i.postimg.cc/wBh8MV1x/biscuit-nutrition-food-eat.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Precalentar el horno a 150ºC. Disponer todos los ingredientes menos el agua en un recipiente mediano y mezclar bien.", 10), new Pas(2, "Añadir el agua, removiendo con suavidad para integrarla, tapar con un paño limpio y dejar reposar unos 10 minutos.", 10,10), new Pas(3, "Pasado ese tiempo, comprobar que el agua se haya absorbido por la mezcla de semillas. Debe ser una masa ligeramente pegajosa con todos los ingredientes aglutinados, y no debe quedar un charquito de agua al fondo. Si fuera así, añadir un poco más de chía o avena, mezclar y esperar unos minutos más.", 5),  new Pas(4, "Cubrir una bandeja de horno con papel sufurizado y extender la masa encima. Formar un rectángulo y aplanar bien con una espátula, un rodillo o con las manos limpias. Dejar un grosor de unos 3-5 mm, procurando que quede uniforme.", 1), new Pas(5, "Añadir una pizca más de sal por encima y hornear durante unos 30-35 minutos.", 1), new Pas(6, "Esperar un par de minutos antes de deslizar una espátula por debajo, con mucho cuidado, para levantar el rectángulo de semillas y despegarlo del papel. Dar la vuelta (puede ayudar a usar una tabla o un plato, para que no se rompa) y volver a hornear unos 25-30 minutos más, vigilando que no se queme. Si tenemos un horno que no hornea de forma uniforme, girar la bandeja pasados 15 minutos.", 35,35), new Pas(7, "Esperar a que se enfríe fuera del horno, trasladar a una tabla y cortar con un buen cuchillo afilado en triángulos o cuadrados del tamaño que se desee. Es normal que los bordes se resquebrajen un poco al quedarse más crujientes, simplemente guardar las semillas que caigan en un tarro y usar en ensaladas, sopas, batidos o cuencos de yogur.", 3))),
                new ArrayList<>(Arrays.asList("25 g de semillas de chía", "20 g de semillas de amapola", "20 g de semillas de lino, 55 g de semillas de calabaza", "55 g de semillas de sésamo", "20 g de copos de avena finos", "1/4 cucharadita de sal", "semillas de alcaravea o comino al gusto", "1 diente de ajo rallado o 1/4 cucharadita de ajo granulado", "250 ml de agua."))));


        data.add(new Recepta("GALLETAS DE CHOCOLATE",
                "Para cualquier momento del día - Cred IG: @rece.tass", 4, "https://i.postimg.cc/hvNFX2Nn/92631891-2830471203688620-6174404465876445443-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Tamizar todos los secos agregarle los líquidos y mesclar todo hasta qué quede una masa suave", 4), new Pas(2, "poner en una fuente para horno pincelada con un poquito de aceite.", 4), new Pas(3, "Cocinar de 10 a 20 minutos según como te gustan las galletitas a 180°", 5,20))),
                new ArrayList<>(Arrays.asList("1 taza de harina de arroz", "1 taza de harina de avena", "1/4 taza de aceite", "1/2 de agua", "4 cucharadas de cacao amargo", "1 cucharada de polvo de hornear", "3 cucharadas de azúcar integral", "2 cucharadas de edulcorante"))));


        data.add(new Recepta("NUGGETS DE GARBANZOS",
                "Tremendamente ricas y súper saludables - Cred IG: @rece.tass", 4.5, "https://i.postimg.cc/RZRn5QvZ/92571610-259961495019942-1828319694356352469-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Picar la cebolla y la zanahoria, agregarle los garbanzos", 4), new Pas(2, "triturar un poco y agregar el gluten la harina, el agua y especias",4), new Pas(3, "Formar una masa, hacer las formitas y rebosarlas con salvado de trigo", 5),  new Pas(4, "mandar al horno 30 minutos en una fuente apenas aceitada", 6,30))),
                new ArrayList<>(Arrays.asList("1 Cebolla", "1 zanahoria", "2 tazas de garbanzos cocidos", "1/4 taza de gluten puro", "1/2 taza de agua", "1-2 cucharadas de harina de avena", "Rebozador a elección"))));

        data.add(new Recepta("SALTEADO DE TOFU, KALE Y SÉSAMO (PORCIONES: 1)",
                "Sencillísimo de preparar y se puede combinar prácticamente con cualquier ingrediente.", 4.5, "https://i.postimg.cc/yW4JQmwW/tofu-sesame-flat-food-kitchen-asian.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Desechar el líquido de conservación del tofu y escurrir bien. Envolver en varias capas de papel absorbente de cocina, colocar sobre un plato y poner encima algo con peso. Dejar reposar al menos 10 minutos.", 10, 10), new Pas(2, "Cortar en cubos pequeños del tamaño de un bocado, salpimentar y añadir el comino y la cayena. Cortar la col kale en trozos y lavar.", 4), new Pas(3, "Calentar un poco de aceite de sésamo o de oliva en una buena sartén antiadherente y dorar el tofu por todos los lados, salteándolo durante unos 5 minutos.", 5, 5),  new Pas(4, "Agregar el diente de ajo picado muy fino y el jengibre rallado o muy picado.", 1), new Pas(5, "Incorporar las hojas de kale y remover bien a fuego fuerte. Añadir la salsa de soja, el miso y el vino, caldo o agua, y remover bien.", 1), new Pas(6, "Saltear hasta que el kale se cocine al punto deseado, debe quedar tierna y reducir su tamaño por lo menos la mitad.", 1), new Pas(7, "Agregar las semillas de sésamo y dejar que se tuesten un poco. Salpimentar ligeramente si hiciera falta y aliñar con unas gotas de aceite de sésamo extra.", 3))),
                new ArrayList<>(Arrays.asList("120 g de tofu firme", "1 manojo de col kale (unos 80-90 g)", "1/2 diente de ajo pequeño", "1 trocito de jengibre fresco", "1/4 cucharadita de comino molido", "1 pizca de cayena", "1/2 cucharadita de salsa de soja", "1/4 cucharadita de miso (opcional)", "1 cucharadita de vino blanco", "caldo o agua", "1 cucharada de semillas de sésamo blanco o negro", "pimienta negra", "sal", "aceite de sésamo o de oliva."))));

        data.add(new Recepta("PAN DE SALVADO",
                "Aprende a preparar Pan de salvado de trigo con esta rica y fácil receta. El pan salvado de trigo no es igual al pan integral.", 4.5, "https://i.postimg.cc/d1HQQSQS/bread-oats-flax-corn.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Formar la masa con todos los ingredientes.", 4), new Pas(2, "Dejar levar en lugar tibio hasta que duplique su tamaño.", 4), new Pas(3, "Formar los panes, dejar levar nuevamente.", 6), new Pas(4, "Formar los panes, dejar levar nuevamente.", 6), new Pas(5, "Llevar a horno precalentado durante aproximadamente 25 minutos. Listo!", 4, 25))),
                new ArrayList<>(Arrays.asList("125g de harina 0000", "250g de salvado de trigo", "100g de avena", "50g de levadura fresca", "1 cucharada de miel", "Sal y azucar optativo", "Leche descremada o agua cantidad necesaria"))));

        data.add(new Recepta("PUDDING DE CHOCOLATE VEGANO SIN AZÚCAR (PORCIONES: 4)",
                "Existe la variedad blanda o silken, también llamado sedoso, que es ideal para hacer postres como este pudding de chocolate vegano sin azúcar. Rapidísimo y que podemos personalizar de mil maneras.", 4.5, "https://i.postimg.cc/y8xFy192/chocolate-melted-bowl-sweet-cocoa-gourmet-candy-brown-1046088.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Procurar que el dátil sea muy jugoso; en caso contrario conviene dejarlo a remojo para que se hidrate. Picar sin el hueso y machacar con un tenedor para formar una pasta. Derretir el chocolate en el microondas a intervalos cortos y a media potencia, para evitar pasarnos. Dejar enfriar un poco.", 5), new Pas(2, "Escurrir muy bien el tofu y pasar por papel de cocina para que absorba la mayor cantidad de agua, sin apretar. Poner en el vaso de una picadora, batidora o procesador de alimentos, y triturar con la vainilla hasta formar una crema. Añadir el cacao y el dátil y batir un poco más. Incorporar el chocolate derretido, la sal y la ralladura de naranja, si usamos.", 10), new Pas(3, "Seguir triturando hasta que todo quede bien incorporado, formando una crema homogénea y sedosa. Conviene remover un poco con una cuchara o lengüeta.", 8), new Pas(4, "Comprobar el punto de sabor, podemos añadir más cacao, más vainilla o incluso un poco de miel o estevia, si fuera necesario. Repartir en pequeños cuencos -salen 4 raciones pequeñas o dos más grandes-. Reservar en la nevera.", 5))),
                new ArrayList<>(Arrays.asList("250 g de Tofu blando o sedoso escurrido ", "1 Dátil medjoul (o al gusto)", "1-2 cucharadas Cacao puro en polvo sin azúcar", "25 g Chocolate negro sin azúcar (con alto porcentaje en cacao)", "1/2 chdta esencia de vainilla", "Ralladura de naranja al gusto", "Sal una pizca"))));


        data.add(new Recepta("PANCAKES DE AVENA Y BANANA",
                "Puedes acompañarlos con lo que tu quieras - Cred IG: @rece.tass", 4.5, "https://i.postimg.cc/gctj4Zwh/193851547-486087139381658-4962491921262905674-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "poner todos los ingredientes en una batidora o en una mini primer y procesar todo hasta que quede homogéneo y sin grumos.", 4), new Pas(2, "En una sartén anti adherente o con un poquito de aceite ponemos la masa formando circuitos y cocinamos dos minutos a fuego medio", 5, 2))),
                new ArrayList<>(Arrays.asList("Una banana", "Cuatro cucharadas de avena", "Cuatro cucharadas de harina integral", "Una cucharada de azúcar mascabo", "Una cucharada de polvo hornear", "Medio vaso de agua"))));


        data.add(new Recepta("LA MEJOR GRANOLA",
                "Helado favorito y querido por generaciones. Con helado bajo en grasa con sabor a mango", 5, "https://i.postimg.cc/YSzygTmb/granola-homemade-nuts-seeds.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Mezcle todo y lo mande al horno unos 45 min a 150~180 grados según él horno ", 5, 45))),
                new ArrayList<>(Arrays.asList("2 1/2 tazas de avena yo use mitad gruesa y mitad instantánea", "5cdas coco en escamas", "5cdas coco rayado", "¼ taza de azúcar de coco", "8 datiles cortados", "10cdas de pasas", "5cdas de semillas mixtas", "Media tasa de miel de caña(se puede sustituir con azúcar o edulcorante)", "Media banana pisada", "1 taza de boniato/manzana cortada en cubitos", "Maní y almendras a gusto.", "Puedes agregarle lo que tu quieras"))));



        data.add(new Recepta("SALTEADO DE VERDURAS",
                "Está es la mejor opción cuando tenés muy poco tiempo y querés comer algo saludable y rico - Cred IG: @rece.tass", 4.5, "https://i.postimg.cc/SKFDMHSZ/213301475-133985202205946-2946253196929002848-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Cortas todos los vegetales como más te gusten y en una olla o Wok con un poquito de aceite oliva", 4), new Pas(2, "pones la cebolla la zanahoria el pimientos y los zapallitos, en ese orden, dejas que se grille y revolves todo", 4), new Pas(3, "Dejas que se termine de cocinar y listo", 4))),
                new ArrayList<>(Arrays.asList("3 cebollas", "2 zapallito", "una zanahoria", "un poquito de pimiento rojo", "arroz blanco o integral", "lentejas cocidas"))));


        data.add(new Recepta("CREAMSICLES/HELADO DE MANGO SIN LACTEOS",
                "Helado favorito y querido por generaciones. Con helado bajo en grasa con sabor a mango", 5, "https://i.postimg.cc/0NRhskPW/CREAMSICLES.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Agregue el mango, el yogur de coco, la leche de su elección y el azúcar de coco en su licuadora.", 4), new Pas(2, "Mezclar hasta que esté suave.", 4), new Pas(3, "Vierta la mezcla de mango mezclado en sus moldes para paletas, dejando aproximadamente ¼ del molde sin llenar.", 6), new Pas(4, "Deje reposar en el congelador durante 30 minutos.", 6,30), new Pas(5, "Mientras tanto, en un tazón mezcle la crema de coco, la miel o el agave y la vainilla hasta que quede suave.", 4), new Pas(6, "Retire las paletas del congelador, luego vierta la mezcla de crema de coco en el ¼ restante del molde para paletas.", 5), new Pas(7, "Agregue sus palitos de paleta a su molde, luego congele durante al menos 4-6 horas, o hasta que las paletas estén completamente congeladas.", 5,350))),
                new ArrayList<>(Arrays.asList("2 mangos maduros grandes, cortados en cubos", "½ taza de yogur de coco (natural o de vainilla)", "½ taza de leche sin lácteos a elección", "¼ taza de azúcar de coco", "1 cucharada de miel o agave", "1 cucharadita de extracto de vainilla"))));

        data.add(new Recepta("BIZCOCHO CASERO DE YOGUR",
                "Os presento uno de los bizcochos más fáciles de preparar y con un resultado de rechupete. Este bizcocho admite multitud de variaciones, lo puedes utilizar como base de distintas tartas o añadirle trocitos de frutas o frutos secos. Y por supuesto, tomarlo tal cual, como os lo presento aquí, bizcocho casero de yogur, un éxito garantizado.", 2.5, "https://i.postimg.cc/QMtP1BDv/8673176560-fdda29df0e-b.jpgg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Añadimos el yogur a un bol grande y lavamos el potito o envase donde viene el yogur. Precalentamos el horno a 200º C y untamos el molde que vamos a utilizar con mantequilla, en la base y los lados. Espolvoreamos con un pellizco de harina y quitamos el exceso de harina. Reservamos..", 4), new Pas(2, "Batimos los huevos con unas varillas, cuando empiecen a blanquear, añadimos una pizca de sal. Medimos el azúcar y volvemos a batir, ya tenemos la base lista.", 4), new Pas(3, "Añadimos en el bol una medida de aceite de oliva suave, la levadura química y medimos de nuevo la harina con el vasito", 6), new Pas(4, "Metemos todo en el bol y batimos con unas varillas . Debe de quedar una masa homogénea y fina. Vertemos la mezcla en el molde", 6), new Pas(5, "Horneamos. Tenéis que poner el futuro bizcocho en la bandeja del medio con calor arriba y abajo, sin aire, a 180º C.", 30, 30), new Pas(6, "Dejamos que se termine de enfriar sobre una rejilla para evitar que coja humedad. Listo para comer.", 11, 11))),
                new ArrayList<>(Arrays.asList("1 medida de yogur de aceite suave de oliva", "1 medida de yogur (en este caso natural azucarado)", "2 medidas de yogur de azúcar blanquilla", "3 medidas de yogur de harina de trigo (o de maíz)", "3 huevos tamaño mediano", "1 sobrecito de levadura química en polvo o polvo de hornear (16 g.)", "1 pizca de sal", "un poquito de mantequilla y una pizca de harina, para la base del bizcocho"))));


        data.add(new Recepta("ANILLOS INTEGRALES DE CHOCOLATE Y COCO",
                "Aperitivo muy rico y sano para tener una opción mas. Cred ig: @anahidajilnutricion", 4.5, "https://i.postimg.cc/vTbWLkLH/210878084-671085757181153-9222618664262256956-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Mezclar todos los sólidos, agregar los líquidos. Mezclar. Armar con las manos los anillitos.", 4), new Pas(2, "Colocar en fuente aceitada y llevar a horno precalentado durante 10 a 15 minutos.", 4,15), new Pas(3, "Listo!", 6))),
                new ArrayList<>(Arrays.asList("1/2 taza de harina integral", "1/2 taza de avena", "2 cucharadas colmadas de coco rallado", "2 cucharadas de cacao amargo", "1 cucharadita de polvo de hornear", "1 cucharada sopera de edulcorante liquido apto cocción", "Esencia de vainilla a gusto", "1/4 taza de leche descremada o vegetal", "2 cucharadas soperas de aceite"))));

        data.add(new Recepta("GALLETAS DE NATA",
                "Cómo hacer galletas de nata. Unas galletas con un sabor intenso a lácteo pero con un toque suave y delicado.", 3, "https://i.postimg.cc/nccTrXJm/food-dessert-no-one-appetizer.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "En un bol mezclamos la harina, la levadura y la sal. En otro bol batimos el huevo con el azúcar hasta que se forme una crema. Añadimos la nata y mezclamos bien.", 6), new Pas(2, "Incorporamos los ingredientes secos y con un tenedor comenzamos a integrar los ingredientes. Nos va a quedar una masa pegajosa y poco manejable.", 4), new Pas(3, "Formamos una bola y la dejamos en el frigo durante no menos de 1 hora. Retiramos la masa del frigo y la cortamos en 3 porciones. Enharinamos bien la superficie de trabajo.", 5), new Pas(4, "Con un rodillo estiramos la masa hasta que quede de medio cm. de grosor. Es fundamental que vayamos enharinando periódicamente la superficie de trabajo y el rodillo para que la masa no se pegue a la encimera. Ya que esta masa tiene una textura bastante pegajosa.", 6), new Pas(5, "Una vez tengamos la masa estirada con el grosor deseado cortamos las galletas con el cortante que queramos. Si no tenemos cortantes para galletas, con un vaso podríamos trabajar de la misma manera.", 5), new Pas(6, "Mientras el horno se precalienta a 180º C vamos colocando las galletas en una bandeja de horno forrada con papel sulfurizado.", 4), new Pas(7, "Horneamos las galletas", 10, 10), new Pas(8, "Retiramos las galletas para una rejilla hasta que se hayan enfriado. Seguimos el proceso hasta terminar la masa de galletas. Las tandas que sean necesarias.", 2))),
                new ArrayList<>(Arrays.asList("425 gr. harina", "1 huevo", "200 ml. de nata para montar 35% M.G.", "200 gr. azúcar blanquilla", "1 sobre de levadura química (8 gr.)", "Pizca de sal", "Papel sulfurizado"))));


        data.add(new Recepta("BATIDO TROPICAL CON COLÁGENO",
                "Si sufres de dolores articulares y en especial en invierno, esta receta es perfecta para ti. Ayuda a regenerar el cartílago y reduce la inflamación, fortalece, hidrata y mejora la piel, cabello, uñas y reduce los dolores articulares.", 2.5, "https://i.postimg.cc/QMtP1BDv/8673176560-fdda29df0e-b.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Licuar las frutas con la chía y colágeno", 4), new Pas(2, "Agregar la leche de coco al gusto hasta obtener la consistencia deseada.", 4), new Pas(3, "Servir y disfrutar", 6))),
                new ArrayList<>(Arrays.asList("1scoop de colágeno Energy Green", "1/2tz de mango congelado", "1/2tz de piña congelada", "½ plátano congelado", "3 huevos tamaño mediano", "1/2tz de fresas congeladas", "1cda de chía", "Leche de coco al gusto"))));

        data.add(new Recepta("GALLETAS SABLÉ DE CHOCOLATE",
                "Cómo hacer galletas de chocolate. Una receta muy dulce. La palabra sablé quiere decir arenado en francés, y esa es la mejor forma de describir a este tipo de galletas. Se trata de una masa frágil y muy crujiente que se desmenuza fácilmente en arenas o migas.", 4.5, "https://i.postimg.cc/HWvXSVQT/cookies-chocolate-cookies-dark-cookies-delicious-thumbnail.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "En un bol mezclamos los ingredientes secos, la harina, el bicarbonato, la sal y el cacao en polvo. Reservamos.", 3), new Pas(2, "En otro bol batimos la mantequilla con el azúcar hasta formar una crema. La mantequilla debe estar blanda", 1, 1), new Pas(3, "Combinamos ambas mezclas, la de los sólidos y la de la mantequilla en el mismo bol y añadimos el chocolate que habremos troceado o rallado. Mezclamos bien hasta que este compacto y se pueda formar una bola", 5), new Pas(4, "Colocamos la masa sobre un papel de plástico transparente y le damos forma de rulo con las manos.Podemos hacer uno o varios rulos. Envolvemos con el papel de plásticos y los giramos sobre si mismo hasta que nos quede como un caramelo alargado.", 4), new Pas(5, "Guardamos la masa así empaquetada en el frigo durante unas horas, hasta que se haya endurecido totalmente. Retiramos la masa del frigo y con un cuchillo cortamos discos de masa que vamos colocando sobre un papel sulfurizado en una bandeja de horno. El grosor de estos discos debe de ser en torno al medio centímetro. Colocamos las galletas separadas en la bandeja", 60, 60), new Pas(6, "Horneamos con el horno previamente caliente a 180º C", 11, 11), new Pas(7, "Retiramos la bandeja del horno y pasamos las galletas sablé a una rejilla con mucho cuidado ya que estarán aun blanditas hasta que se enfríen totalmente.", 10, 10))),
                new ArrayList<>(Arrays.asList("140 gr. harina de trigo", "25 gr. cacao en polvo sin azúcar", "120 gr. mantequilla", "130 gr. azúcar", "110 gr. chocolate 70% cacao", "½ cdita. bicarbonato", "¼ cdita. sal (mejor en escamas)", "½ cdita. extracto vainilla"))));


        data.add(new Recepta("BATIDO ENERGÉTICO DE MACA NEGRA CON CACAO",
                "Ponte power con este batido energético de maca negra con cacao en polvo", 4.5, "https://i.postimg.cc/RZyzr9Ln/batidochoco2.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "En una licuadora añadir los ingredientes y licuar", 4), new Pas(2, "Servir y añadir chocolate negro rayado al gusto.", 4))),
                new ArrayList<>(Arrays.asList("1cda de maca negra en polvo Amazon Andes", "1cda de cacao en polvo Amazon Andes", "1 taza de leche de vegetal", "1 cda de miel de yacón al gusto", "Chocolate negro o al gusto para decorar."))));


        data.add(new Recepta("PANQUEQUES DE MACAMIX Y MIEL",
                "Una receta casera super fácil y sobretodo saludable ", 4.5, "https://i.postimg.cc/nc475cKC/restaurant-food-gourmet-pancakes-thumbnail.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Licuar el plátano, avena, maca mix, huevo y leche vegetal hasta tener una mezcla uniforme.", 4), new Pas(2, "Calentar una sartén con una pizca de aceite de coco, cuando esté caliente colocar la mezcla de los panqueques haciendo pequeños círculos (pasar a fuego medio)", 4), new Pas(3, "Dejar cocinar hasta que los panqueques muestren pequeñas burbujas, dar la vuelta y dejar un par de minutos extra.", 6), new Pas(4, "Servir y agregar miel y frutas al gusto.", 6))),
                new ArrayList<>(Arrays.asList("2cdas de avena", "2cdas de maca mix gelatinizada Amazon Andes", "1 huevo", "1/2 plátano de seda", "1/4tz de leche de vaca light o bebida vegetal", "Pizca de aceite de coco Amazon Andes", "Miel de abeja o yacón amazon Andes al gusto", "Fruta para decorar"))));



        data.add(new Recepta("ALBÓNDIGAS DE LENTEJAS",
                "Alternativa para quienes no consuman carne, muy nutritiva además. Cred IG @rece.tass", 4, "https://i.postimg.cc/wMTWCVcW/93989635-1562994567209688-3307983820101246973-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Pisar las lentejas cocidas con el arroz hasta formar una pasta con pedacitos (con un pisapapa porque si se procesa queda muy suave y sin textura).", 4), new Pas(2, "Agregar los además ingredientes y mezclar (Le puedes agregar un POQUITO de agua si te queda muy seco)", 4), new Pas(3, "Hacer bolitas y cocinar durante 20 minutos vuelta", 20, 20), new Pas(4, "y vuelta, cocinar en salsa otros 5-10 minutos mas y listo", 6, 10), new Pas(5, "RECOMENDACION:el arroz y las lentejas un poco pasadas de cocción para poder pisarlas mejor y que queden mas ricas", 6))),
                new ArrayList<>(Arrays.asList("2 tazas de lentejas cocidas", "1 taza de arroz integral cocido", "1 cebollita de verdeo picada", "4 cdas de harina de garbanzos", "4 cdas de harina de arroz", "1 cda de vinagre blanco", "Un huevo de chia (una cucharada de chia mas 4 de agua)", "Sal y condimentos (súper importantes)"))));


        data.add(new Recepta("GALLETAS DE AVENA Y NARANJA",
                "Rápido y fácil para reemplazar galletas convencionales. Cred Ig: @rece.tass", 4, "https://i.postimg.cc/kMHJThyh/103584961-177858077091456-6535973140834742336-n.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Mezclar todos los ingredientes y haces bolitas.", 4), new Pas(2, "Poner en una placa ligeramente aceitada y llevar a horno medio(180°) ", 4), new Pas(3, "Esperar hasta que se doren", 10))),
                new ArrayList<>(Arrays.asList("2 taza avena", "½ taza azúcar", "Cucharada chía remojada", "¼ taza coco", "Pizca de canela", "Media taza de jugo de naranja", "Chocolate picado"))));

        data.add(new Recepta("CREMA DE ALMENDRAS",
                "Al igual que la crema de cacahuetes, la crema de almendras siempre es mejor elaborarla en casa para asegurarnos los nutrientes propios de las almendras sin azúcares añadidos y sin aditivos en exceso, como suelen presentarse en los procesados.", 4.5, "https://i.postimg.cc/K8vjLSJ1/almond-cream-filling-640.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Las colocaremos en una placa para horno y las tostaremos por 20-25 minutos.", 5, 25), new Pas(2, "Una vez tostadas dejamos enfriar y colocamos en el vaso de nuestra batidora o motor de cocina. Activamos a máxima potencia y esperamos hasta que poco a poco las almendras comienzan a liberar sus aceites lo que permite que se forme una crema espesa tras unos cinco minutos o menos.", 10), new Pas(3, "Si deseamos una crema más líquida podemos adicionar un par de cucharadas de agua o leche, o bien, aceite de oliva extra virgen. Y si queremos una crema de sabor dulce podemos acudir a una stevia líquida u otro edulcorante sin calorías.", 8), new Pas(4, "Podemos usarla igual que la crema de cacahuete para untar simplemente o dar sabor y textura cremosa a platos. Incluso, va muy bien para rellenar pasteles o emplear en reemplazo de una mantequilla tradicional.", 5))),
                new ArrayList<>(Arrays.asList("Para elaborar crema de almendras sólo necesitamos las almendras crudas sin su cáscara externa."))));


        data.add(new Recepta("CREMA DE CACAHUATES",
                "Saludable alternativa a la de los comercios, libre de azúcares extras.", 4.5, "https://i.postimg.cc/1zXgxhqk/32383531817-52c8cc5b15-b.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Colocar en la batidora 500 gramos de cacahuetes pelados y tostados (sin sal), 50 cc de aceite de oliva extra virgen y una pizca de sal.", 5), new Pas(2, "Activamos la batidora o el motor de cocina hasta obtener una crema relativamente homogénea.", 10), new Pas(3, " Si deseamos podemos adicionar aceite de sésamo o una cucharada pequeña de cacao en polvo sin azúcar, para dar sabor diferente a la crema.", 8), new Pas(4, "Conservar en heladera. Podemos usarla en variedad de platos: desde un desayuno junto a plátano y una tostada, o bien, para sumar a helados, batidos o como base de un aliño.", 5))),
                new ArrayList<>(Arrays.asList("500 gramos de cacahuetes pelados y tostados (sin sal)", "50 cc de aceite de oliva extra virgen", "Una pizca de sal."))));


        data.add(new Recepta("MUFFINS DE ARÁNDANOS",
                "Cómo hacer muffins de arándanos. Los muffins, la versión americana de nuestras tradicionales magdalenas, al igual que estas, nos permiten un sinfín de sabores y rellenos. Pero de entre todas, una de las opciones para preparar muffins y asegurarnos el éxito, es incluyendo en su preparación algo de fruta, como los arándanos. Les dará jugosidad y esponjosidad adicional a este dulce, aumentando su sabor y mejorando su textura.", 3, "https://i.postimg.cc/PxwJ25h5/muffins-blueberry-muffins-cake-cup-cakes.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "En un bol mezclamos los ingredientes secos menos el azúcar y los arándanos. Tamizamos la harina, la levadura, el bicarbonato y la sal y reservamos..", 4), new Pas(2, "En otro bol grande batimos el huevo con 100 g. de azúcar reservando el resto del azúcar para hacer el relleno de crema de queso. Batimos bien hasta que la mezcla espume. Añadimos el extracto de vainilla, el aceite de girasol, el yogur y seguimos batiendo.", 5), new Pas(3, "Incorporamos 125 gr. de crema de queso y la incorporamos con el resto de ingredientes. Cuando la mezcla esté lista incluimos los arándanos. Vamos agregando la harina e integrando con una espátula sin batir la mezcla en exceso. Sólo lo necesario para que se integre la masa. Reservamos.", 5), new Pas(4, "Preparamos la mezcla de queso mezclando el queso en crema con los 40 gr. de azúcar restantes. Colocamos las cápsulas de papel en un molde para muffins y rellenamos cada una hasta casi la mitad de la altura.", 6), new Pas(5, "Añadimos 1 cucharadita de crema de queso. Tapamos con el resto de la masa hasta rellenar la cápsula unos ¾ de su altura. Espolvoreamos con azúcar.", 3), new Pas(6, "Horneamos, con el horno previamente caliente a 180º C, con calor arriba y abajo", 23, 23))),
                new ArrayList<>(Arrays.asList("250 gr. harina", "140 gr. azúcar", "1 cdita. levadura química", "1 cdita. bicarbonato sódico", "¼ cdita. sal", "125 gr. yogur natural", "70 ml. aceite de girasol", "1 huevo", "½ cdita. extracto de vainilla", "100 gr. arándanos frescos", "225 gr. crema de queso"))));

        data.add(new Recepta("CARACOLAS DULCES",
                "Hoy os traigo la receta de unas caracolas dulces que, estoy totalmente seguro de que os engancharán. El resultado es un bocado dulce esponjoso, con una masa súper aromática y con mucho sabor.", 3.5, "https://i.postimg.cc/7Lyqwnyw/bread-escargot-food-dessert-gourmet-thumbnail.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "En un bol mezclamos todos los ingredientes y trabajamos la masa con maquina", 9, 9), new Pas(2, "Ponemos la masa en un bol enharinado y lo tapamos con papel transparente. Dejamos que reposeen un lugar cálido y sin corrientes, el interior del horno previamente templado es un sitio perfecto.", 30, 30), new Pas(3, "Dividimos la masa en porciones de unos 60 gr. y le damos forma a cada uno. Estiramos cada porción con un rodillo de forma alargada", 7), new Pas(4, "Con un cuchillo hacemos unas incisiones profundas a lo largo de la masa, pero sin que lleguen a cortarla totalmente, como muestra el video. Enrollamos la pieza y la doblamos sobre si misma haciendo una caracola.", 2, "3bxmv7qRiak"), new Pas(5, "Colocamos cada porción en la bandeja del horno sobre un papel vegetal. Debemos ponerlas separadas unas de otras ya que aún crecerán bastante. Dejamos que reposen las caracolas dentro del horno aún templado, hasta que doblen su volumen.", 30, 30), new Pas(6, "Pintamos las caracolas con una pizca de mantequilla derretida, espolvoreamos con abundante azúcar y horneamos, con el horno previamente caliente a 180º C", 20, 20), new Pas(7, "Retiramos las caracolas del horno y las dejamos enfriar sobre una rejilla entes de disfrutarlas.", 10, 10))),
                new ArrayList<>(Arrays.asList("400 gr. Harina de fuerza", "195 ml. Leche entera o vegetal", "80 mantequilla", "1 huevo", "8 gr. Levadura fresca", "5 gr. Sal", "60 gr. Azúcar + algo para espolvorear"))));


        data.add(new Recepta("MOUSSE DE FRESAS",
                "Cómo preparar una mousse de fresas. La receta de hoy es una de esas que podemos preparar con casi nada, y con la que conseguiremos resultados geniales. Bien sea porque no disponemos de tiempo o ganas para preparar un postre, o simplemente porque de repente nos asaltan unas ganas irrefrenables de dulce, esta mousse de fresa fácil es una opción muy a tener en cuenta..", 3, "https://i.postimg.cc/63GBVbws/moussefresa.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Calentamos en un cazo 250 ml. de agua. Cuando comience a hervir añadimos la gelatina de fresa y removemos hasta que se haya diluido.", 3), new Pas(2, "Retiramos del fuego y añadimos 250 ml. de agua fría. Removemos bien y reservamos hasta que se haya enfriado la mezcla. Una vez fría la guardamos en el frigo hasta que vemos que está casi cuajada.", 50, 50), new Pas(3, "Mientras se cuaja la gelatina de fresa montamos la nata la guardamos en la nevera. ", 5), new Pas(4, "Lavamos y troceamos las fresas y las trituramos con la batidora. Guardamos las fresas también en el frigo hasta el momento de utilizarlas, cuando la gelatina se haya cuajado.", 5), new Pas(5, "Con una batidora de varillas batimos la gelatina para deshacerla. Incorporamos la nata con las fresas y seguimos batiendo.", 4), new Pas(6, "Nos quedará una textura totalmente esponjosa y aireada. Servimos en las copas en que vayamos a presentar la mousse y guardamos en el frigo durante 2 horas.", 2))),
                new ArrayList<>(Arrays.asList("1 sobre de gelatina de fresa en polvo (85 gr.)", "200 ml. de nata para montar", "250 gr. de fresas frescas", "500 ml. de agua"))));


        data.add(new Recepta("TARTA DE CUAJADA CON CHOCOLATE",
                "Cómo preparar una tarta de cuajada con chocolate. Os presento una receta de postre muy sencilla y con la que triunfaréis ya sea en una comida familiar, en una comida con amigos o en la merienda con los más peques de la casa.", 4, "https://i.postimg.cc/LstTq2YG/tartachoco.jpg",
                new ArrayList<>(Arrays.asList(new Pas(1, "Picamos las galletas lo más finas posible. Nosotros lo hemos hecho con una batidora de vaso pero si no tenéis se puede hacer envolviéndolas en un trapo de cocina y machacándolas con una cuchara o algo pesado; no queda tan fino pero sirve exactamente igual.", 6), new Pas(2, "Untamos la base del molde con una capa muy fina de mantequilla y derretimos el resto usando el microondas, así es más rápido.Mezclamos la mantequilla derretida con el azúcar con una varilla manual y añadimos las galletas trituradas. Mezclamos hasta que tenga el aspecto de una pasta y la repartimos sobre la base, presionando con la ayuda de una cuchara o con los dedos. La metemos a la nevera", 30, 30), new Pas(3, "Del litro de leche que vamos a utilizar separamos unos 200 ml aproximadamente. En ellos disolvemos los dos sobres de cuajada hasta que esté bien mezclado. El resto de la leche (800 ml) se echan a un cazo y se ponen a hervir con 50 g de azúcar.", 5), new Pas(4, "Troceamos el chocolate (cuanto más fino quede mejor se fundirá). Lo añadimos a la leche que tenemos en el cazo. Removemos a mano con la varilla hasta que obtenemos una crema homogénea y suave. Añadimos la cuajada diluida en leche y seguimos removiendo hasta que hierva durante 4 ó 5 minutos. No debemos dejarlo más tiempo pues si no la crema de chocolate se quemará. Retiramos del fuego y dejamos que se temple en el propio cazo.", 10), new Pas(5, "Vertemos con suavidad sobre la capa de galletas, siempre ayudados de una cuchara para que no caiga forme un agujero.", 1), new Pas(6, "Una vez listo la dejamos enfriar en un sitio fresco y por último la metemos en la nevera un mínimo de 4 horas. Un apunte; esta tarta está mucho mejor de un día para otro.", 2), new Pas(7, "Un poco antes de servirla, la sacamos de la nevera. Desmoldamos con la ayuda de un cuchillo para separar la base de galleta sin que se rompa. Esta tarta está deliciosa sola, pero también acompañada de nata o helado.", 5))),
                new ArrayList<>(Arrays.asList("Ingredientes para la base de galletas: 240 g de galletas", "75 g de mantequilla", "1 cucharada sopera de azúcar", "Ingredientes para la crema de chocolate: 250 g de chocolate negro para fundir", "1 l. de leche entera o vegetal", "2 sobres de cuajada (2 x 12 g.)", "Pepitas de chocolate para decorar"))));


    }

    public static int getDataSize (){
        return data.size();
    }

    public static Recepta getRecepta (int position){
        return data.get(position);
    }

    public void clear () {
    }

    public void addAll (List<ReceptaBBDD2> originalItems) {
    }
}
