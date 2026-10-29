/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c96ac..0x9c96fc (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e8a238;

long long sub_9c96ac(unsigned long a0, unsigned int a1, unsigned long long a2, unsigned int a3)
{
    char v0;  // [bp-0x40], Other Possible Types: unsigned int
    unsigned int v1;  // [bp-0x3c]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned int v4;  // [bp-0x28]
    char *v5;  // [bp-0x20]
    unsigned long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = a0;
    v4 = a1;
    v5 = &v0;
    v0 = a3;
    v1 = 4;
    v2 = a2;
    v3 = 0;
    return sub_9c5460(&g_e8a238, &v4, &v6) != 0;
}
