/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2581b4..0x258204 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e7a5d8;

unsigned long long * sub_2581b4(void)
{
    unsigned long long *v6;  // x0
    unsigned long v0;  // [bp-0x40]
    char *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    char v3;  // [bp-0x21]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_6c18c();
    v2 = 1;
    *v6 = &g_e7a5d8;
    v0 = 0;
    v1 = &v3;
    sub_607ac(&v0);
    return v6;
}
