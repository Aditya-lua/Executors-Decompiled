/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5b774..0x5b81c (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_cbead2;
extern char g_f0dba7;

long long sub_5b774(unsigned long a0, unsigned int a1)
{
    unsigned int i;  // [bp-0x3c]
    char *v1;  // [bp-0x38]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x20]
    char *v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = &g_f0dba7;
    v3 = &g_cbead2;
    v2 = a0;
    v1 = &v2;
    for (i = 0; (int)a1 > (int)i; i += 1)
    {
        v4[i] = v3[i] ^ (char)i ^ v1[i & 7];
    }
    return a0;
}
