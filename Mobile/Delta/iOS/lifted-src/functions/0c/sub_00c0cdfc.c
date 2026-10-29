/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0cdfc..0xc0cebc (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_b6c688;
extern unsigned long long g_b81a2c;
extern long long g_cb9fbe;
extern long long g_cb9ff9;
extern long long g_cba029;

long long sub_c0cdfc(unsigned int *a0, unsigned long long *a1)
{
    unsigned long v10;  // x0
    unsigned long v11;  // x1
    long long v12;  // x2
    unsigned long v0;  // [bp-0x50]
    unsigned int *v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    char *v3;  // [bp-0x38], Other Possible Types: unsigned int *
    unsigned long long v4;  // [bp-0x30]
    unsigned int *v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    if (!a0[10])
    {
        v7 = a0 + 12;
        v0 = a0 + 11;
        v1 = &v0;
        v2 = &g_b81a2c;
        v3 = &v7;
        v4 = &g_b81a2c;
        v5 = a0;
        v6 = &g_b6c688;
        v10 = *a1;
        v11 = a1[1];
        v12 = &g_cb9fbe;
    }
    else if (a0[10] == 2)
    {
        v1 = a0;
        v2 = &g_b6c688;
        v10 = *a1;
        v11 = a1[1];
        v12 = &g_cba029;
    }
    else
    {
        v7 = a0 + 11;
        v1 = &v7;
        v2 = &g_b81a2c;
        v3 = a0;
        v4 = &g_b6c688;
        v10 = *a1;
        v11 = a1[1];
        v12 = &g_cb9ff9;
    }
    return sub_be769c(v10, v11, v12, &v1);
}
