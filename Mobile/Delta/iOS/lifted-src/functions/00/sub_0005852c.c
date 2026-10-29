/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5852c..0x585dc (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f011c0;
extern unsigned short g_f0ced8;
extern unsigned long long g_f0cee0;
extern unsigned long long g_f0cee8;
extern unsigned int g_f0cef0;
extern unsigned short g_f0cef8;
extern unsigned long long g_f0cf00;
extern unsigned long long g_f0cf08;
extern unsigned int g_f0cf10;
extern unsigned short g_f0cf18;
extern unsigned long long g_f0cf20;
extern unsigned long long g_f0cf28;
extern unsigned int g_f0cf30;
extern unsigned short g_f0cf38;
extern unsigned long long g_f0cf40;
extern unsigned long long g_f0cf48;
extern unsigned int g_f0cf50;
extern long long g_f0d672;

int sub_5852c(void)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    g_f0ced8 = 0;
    g_f0cee0 = "LuauUdataMetatablePinned";
    g_f0cee8 = g_f011c0;
    g_f0cef0 = 0;
    g_f0cef8 = 0x100;
    g_f0cf00 = "LuauGcTableStepFix";
    g_f0cf08 = &g_f0ced8;
    g_f0cf10 = 0;
    g_f0cf18 = 0;
    g_f0cf20 = "LuauGcTraceUdata";
    g_f0cf28 = &g_f0cef8;
    g_f0cf30 = 0;
    g_f011c0 = &g_f0cf18;
    v2 = sub_137d0(&g_f0d672, "LuauGcTraceUdata", 2);
    g_f0cf38 = 0x100;
    g_f0cf40 = "LuauGcMarkUdataAccess";
    g_f0cf48 = g_f011c0;
    g_f0cf50 = 0;
    g_f011c0 = &g_f0cf38;
    return v2;
}
