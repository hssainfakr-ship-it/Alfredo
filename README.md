# 🎓 Alfredo - تطبيق التعليم الذكي

تطبيق Android Native متقدم وفخم لتلاميذ الثالثة إعدادي في المغرب

## ✨ الميزات الرئيسية

✅ **تطبيق Native حقيقي** - بدون WebView  
✅ **يعمل Offline** - بدون الحاجة للإنترنت  
✅ **واجهة فخمة** - أسود، ذهبي، أبيض مع Animations  
✅ **بنك أسئلة ضخم** - منظم ومصنف حسب المادة والصعوبة  
✅ **نظام XP والمستويات** - Débutant → Élève → Expert → Champion  
✅ **3 أوضاع تعليمية**:
  - 🎯 Mix Express: أسئلة عشوائية
  - 📝 Mode Examen: محاكاة امتحان حقيقية بمؤقت
  - 🔥 Défi Quotidien: تحدي يومي مع Streak

✅ **نظام الإنجازات** - badges وإحصائيات  
✅ **دعم اللغات** - العربية والفرنسية  
✅ **وضع ليلي** - Dark Mode  

## 📱 المتطلبات

- **Android 6.0 (API 23)+**
- **Kotlin** و **Room Database**
- **MinSdk: 23** | **TargetSdk: 34**

## 📚 المواد المدعومة

- 🧮 Mathématiques (الرياضيات)
- 📖 Français (الفرنسية)  
- ⚛️ Physique-Chimie (الفيزياء والكيمياء)

البنية مرنة وتدعم إضافة مواد جديدة

## 🏗️ هيكل المشروع

```
Alfredo/
├── app/
│   ├── src/main/
│   │   ├── java/com/alfredo/
│   │   │   ├── activities/          # الشاشات الرئيسية
│   │   │   ├── fragments/           # الأجزاء
│   │   │   ├── adapters/            # محولات القوائم
│   │   │   ├── database/            # Room Database
│   │   │   ├── models/              # نماذج البيانات
│   │   │   ├── utils/               # أدوات مساعدة
│   │   │   ├── services/            # الخدمات
│   │   │   ├── viewmodels/          # ViewModels
│   │   │   └── App.kt               # التطبيق الرئيسي
│   │   └── res/
│   │       ├── layout/              # ملفات XML
│   │       ├── drawable/            # الصور والأيقونات
│   │       ├── values/              # الألوان والنصوص
│   │       └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
└── settings.gradle
```

## 🎨 نظام الألوان (Premium)

- 🖤 **Black**: #1A1A1A
- ✨ **Gold**: #D4AF37
- ⚪ **White**: #FFFFFF
- 🔘 **Dark Gray**: #2D2D2D

## 🚀 البدء

```bash
# استنساخ المشروع
git clone https://github.com/hssainfakr-ship-it/Alfredo.git

# بناء التطبيق
./gradlew build

# تشغيل على جهاز أو محاكي
./gradlew installDebug
```

## 📊 الإحصائيات المتتبعة

- ✓ عدد الأسئلة المحلولة
- ✓ نسبة الإجابات الصحيحة/الخاطئة
- ✓ XP المكتسب
- ✓ المستوى الحالي
- ✓ أيام الانقطاع (Streak)
- ✓ متوسط النسب في كل مادة

## 🔐 التخزين المحلي

جميع البيانات تُحفظ محلياً على الهاتف:
- ✓ تقدم المستخدم
- ✓ النقاط والمستويات
- ✓ الإنجازات المفتوحة
- ✓ نتائج الاختبارات
- ✓ الإعدادات

---

**تم التطوير بحب ❤️ لتلاميذ المغرب**

