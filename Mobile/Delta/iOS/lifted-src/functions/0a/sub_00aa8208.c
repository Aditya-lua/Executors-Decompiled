/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa8208..0xaa82c8 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa8208_0 {
    unsigned long long field_0;
    char padding_8[8];
    struct st_aa8208_0 *field_10;
} st_aa8208_0;

extern long long g_aa82c8;
extern long long g_f09060;
extern st_aa8208_0 *g_f12f58;
extern char g_f12f60;
extern long long g_f12f68;
extern long long g_f12f70;
extern st_aa8208_0 *g_f12f78;
extern long long g_f12f80;

unsigned long long sub_aa8208(void)
{
    long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f12f60 != 1)
        return v4;
    if (g_f12f58 && g_f12f58->field_10)
        g_f12f58->field_10();
    if (sub_a7c208(&g_f09060, &g_aa82c8) && (int)g_f12f78 && sub_a7c198(g_f12f70))
    {
        sub_a32e7c(g_f12f80);
        g_f12f80 = 0;
        g_f12f58 = 0;
        sub_a7c1b4(g_f12f70);
    }
    sub_b4b24c();
    sub_a7c1d0(g_f12f68);
    g_f12f68 = 0;
    v2 = sub_a7c1d0(g_f12f70);
    g_f12f70 = 0;
    v3 = sub_a681e0(v2);
    g_f12f60 = 0;
    return v3;
}
