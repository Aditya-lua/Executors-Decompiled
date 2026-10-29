/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada7dc..0xada93c (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ada7dc_0 {
    char padding_0[48];
    long long field_30;
} st_ada7dc_0;

extern char g_f12fc8;
extern unsigned long long g_f12fd0;
extern unsigned long long g_f12fd8;
extern long long g_f12fe0;
extern char g_10002b8;
extern char g_10002c0;

unsigned long long sub_ada7dc(st_ada7dc_0 *a0)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // 4112
    unsigned long v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a7c198(a0->field_30);
    if (!(unsigned int)v3)
        return v3;
    g_f12fc8 = 1;
    g_f12fd0 = _fopen("/dev/tty", "r");
    if (!g_f12fd0)
        g_f12fd0 = *(long long *)&g_10002c0;
    g_f12fd8 = _fopen("/dev/tty", "w");
    if (!g_f12fd8)
        g_f12fd8 = *(long long *)&g_10002b8;
    v4 = arm64g_calculate_condition(0x11, _tcgetattr(_fileno(g_f12fd0), &g_f12fe0) & 0xffffffff, 1, 0);
    if (v4 & 1)
        return 1;
    if (*(int *)___error() != 25 && *(int *)___error() != 22 && *(int *)___error() != 6 && *(int *)___error() != 5 && *(int *)___error() != 1 && *(int *)___error() != 19)
    {
        sub_a368c8();
        v0 = *(int *)___error(sub_a369bc("crypto/ui/ui_openssl.c", 457, "open_console"), 457, "open_console");
        sub_a36abc(40, 108, "errno=%d");
        return 0;
    }
    g_f12fc8 = 0;
    return 1;
}
