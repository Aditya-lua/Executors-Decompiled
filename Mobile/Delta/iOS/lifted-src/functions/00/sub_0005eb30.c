/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5eb30..0x5ebd8 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_cbea69;
extern char g_f0dbfd;

long long sub_5eb30(unsigned long a0, int a1)
{
    int i;  // [bp-0x3c]
    char *v1;  // [bp-0x38]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x20]
    char *v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = &g_f0dbfd;
    v3 = &g_cbea69;
    v2 = a0;
    v1 = &v2;
    for (i = 0; a1 > i; i += 1)
    {
        v4[i] = v3[i] ^ v1[i & 7];
    }
    return a0;
}
