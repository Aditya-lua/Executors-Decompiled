/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x49cdc..0x49e14 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f011c0;
extern unsigned long long g_f011c8;
extern unsigned int g_f0cd38;
extern char g_f0cd3c;
extern unsigned long long g_f0cd40;
extern unsigned long long g_f0cd48;
extern unsigned int g_f0cd50;
extern unsigned int g_f0cd58;
extern char g_f0cd5c;
extern unsigned long long g_f0cd60;
extern unsigned long long g_f0cd68;
extern unsigned int g_f0cd70;
extern unsigned int g_f0cd78;
extern char g_f0cd7c;
extern unsigned long long g_f0cd80;
extern unsigned long long g_f0cd88;
extern unsigned int g_f0cd90;
extern unsigned int g_f0cd98;
extern char g_f0cd9c;
extern unsigned long long g_f0cda0;
extern unsigned long long g_f0cda8;
extern unsigned int g_f0cdb0;
extern unsigned int g_f0cdb8;
extern char g_f0cdbc;
extern unsigned long long g_f0cdc0;
extern unsigned long long g_f0cdc8;
extern unsigned int g_f0cdd0;
extern unsigned short g_f0cdd8;
extern unsigned long long g_f0cde0;
extern unsigned long long g_f0cde8;
extern unsigned int g_f0cdf0;
extern unsigned short g_f0cdf8;
extern unsigned long long g_f0ce00;
extern unsigned long long g_f0ce08;
extern unsigned int g_f0ce10;
extern unsigned short g_f0ce18;
extern unsigned long long g_f0ce20;
extern unsigned long long g_f0ce28;
extern unsigned int g_f0ce30;
extern unsigned short g_f0ce38;
extern unsigned long long g_f0ce40;
extern unsigned long long g_f0ce48;
extern unsigned int g_f0ce50;

long long sub_49cdc(void)
{
    unsigned long v0;  // x0

    g_f0cd38 = 25;
    g_f0cd3c = 0;
    g_f0cd40 = "LuauCompileLoopUnrollThreshold";
    g_f0cd48 = g_f011c8;
    g_f0cd50 = 0;
    g_f0cd58 = 300;
    g_f0cd5c = 0;
    g_f0cd60 = "LuauCompileLoopUnrollThresholdMaxBoost";
    g_f0cd68 = &g_f0cd38;
    g_f0cd70 = 0;
    g_f0cd78 = 25;
    g_f0cd7c = 0;
    g_f0cd80 = "LuauCompileInlineThreshold";
    g_f0cd88 = &g_f0cd58;
    g_f0cd90 = 0;
    g_f0cd98 = 300;
    g_f0cd9c = 0;
    g_f0cda0 = "LuauCompileInlineThresholdMaxBoost";
    g_f0cda8 = &g_f0cd78;
    g_f0cdb0 = 0;
    g_f0cdb8 = 5;
    g_f0cdbc = 0;
    g_f0cdc0 = "LuauCompileInlineDepth";
    g_f0cdc8 = &g_f0cd98;
    g_f0cdd0 = 0;
    g_f011c8 = &g_f0cdb8;
    g_f0cdd8 = 0;
    g_f0cde0 = "LuauCompileIifeInline";
    g_f0cde8 = g_f011c0;
    g_f0cdf0 = 0;
    g_f0cdf8 = 0;
    g_f0ce00 = "LuauCompileStringInterpTargetTop";
    g_f0ce08 = &g_f0cdd8;
    g_f0ce10 = 0;
    g_f0ce18 = 0;
    g_f0ce20 = "LuauCompileConcatTargetTop";
    g_f0ce28 = &g_f0cdf8;
    g_f0ce30 = 0;
    g_f0ce38 = 0;
    g_f0ce40 = "LuauOptimizeExportTable";
    g_f0ce48 = &g_f0ce18;
    g_f0ce50 = 0;
    g_f011c0 = &g_f0ce38;
    return v0;
}
