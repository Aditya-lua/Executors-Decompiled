/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5d784..0x5d838 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5d784_1 {
    struct st_5d784_1 *field_0;
    unsigned long long field_8;
} st_5d784_1;

typedef struct st_5d784_0 {
    char field_0;
} st_5d784_0;

extern char g_f011d0;

long long sub_5d784(long long a0, unsigned long a1, long long a2)
{
    st_5d784_1 *v6;  // x23
    st_5d784_1 *v7;  // x0
    st_5d784_1 *v8;  // x0
    st_5d784_1 *v9;  // x8
    st_5d784_1 *v10;  // x8
    st_5d784_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_5d784_0 *v1;  // [bp-0x58]
    unsigned long v2;  // [bp-0x50]
    unsigned long i;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_f011d0;
    i = a1;
    if (a1 == &g_f011d0)
        return &g_f011d0;
    v6 = &v2;
    do
    {
        v7 = sub_5ec80(a0, sub_5d8e0(a0, &i), a2, 0);
        v8 = sub_60194(a0);
        v8->field_0 = v7;
        v9 = v8;
        v9->field_8 = &g_f011d0;
        v10 = &v9->field_8;
        v6->field_0 = v9;
        v6 = v10;
    } while (i != &g_f011d0);
    return v2;
}
