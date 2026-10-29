/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x58dd8..0x58e80 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_cbea64;
extern char g_f0dc0f;

long long sub_58dd8(unsigned long a0, int a1)
{
    int i;  // [bp-0x3c]
    char *v1;  // [bp-0x38]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x20]
    char *v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = &g_f0dc0f;
    v3 = &g_cbea64;
    v2 = a0;
    v1 = &v2;
    for (i = 0; a1 > i; i += 1)
    {
        v4[i] = v3[i] ^ v1[i & 7];
    }
    return a0;
}
