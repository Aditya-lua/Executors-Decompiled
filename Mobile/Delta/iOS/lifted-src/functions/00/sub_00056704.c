/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x56704..0x567ac (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_56704_1 {
    char padding_0[32];
    long long field_20;
} st_56704_1;

typedef struct st_56704_0 {
    char field_0;
} st_56704_0;

extern char g_f0ca50;

long long sub_56704(long long *a0, st_56704_1 *a1)
{
    long long v4;  // x20
    unsigned long long *v5;  // x22
    st_56704_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_56704_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (g_f0ca50 == 1)
    {
        v4 = a1->field_20;
        v5 = &a1->field_20;
        sub_1dd64(a0[3], v4);
        *(long long *)(sub_fb84(a0[3], v4) + 8) = v4;
        sub_56810(a0[2], v5);
        *(char *)(sub_3f3c0(a0[2], v5) + 16) = 1;
    }
    return g_f0ca50;
}
