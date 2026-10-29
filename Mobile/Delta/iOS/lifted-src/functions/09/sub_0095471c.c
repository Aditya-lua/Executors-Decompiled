/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95471c..0x954780 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_954780;
extern long long g_f04c68;
extern long long g_f04e98;

void sub_95471c(void)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    _qsort(&g_f04c68, 7, 80, &g_954780);
    _qsort(&g_f04e98, 167, 80, &g_954780);
    _qsort();
    return;
}
