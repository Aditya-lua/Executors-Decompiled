/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadab0c..0xadab74 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adab0c_0 {
    char padding_0[48];
    long long field_30;
} st_adab0c_0;

extern long long g_f12fd0;
extern long long g_f12fd8;
extern char g_10002b8;
extern char g_10002c0;

int sub_adab0c(st_adab0c_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f12fd0 != *(long long *)&g_10002c0)
        _fclose(g_f12fd0);
    if (g_f12fd8 != *(long long *)&g_10002b8)
        _fclose(g_f12fd8);
    sub_a7c1b4(a0->field_30);
    return 1;
}
