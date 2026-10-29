/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5b884..0x5b924 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5b884_1 {
    char padding_0[2072];
    unsigned int field_818;
} st_5b884_1;

typedef struct st_5b884_0 {
    char field_0;
} st_5b884_0;

extern char g_f011d0;

long long sub_5b884(st_5b884_1 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long v6;  // x0
    st_5b884_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_5b884_0 *v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long i;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v2 = a2;
    v0 = &v1;
    i = a1;
    if (a1 == &g_f011d0)
        return &g_f011d0;
    do
    {
        a0->field_818 = a0->field_818;
        sub_59d80(a0);
        sub_59d80(a0, v2);
        v6 = sub_5ec80(a0, sub_5d8e0(a0, &i), v2, &v2);
    } while (i != &g_f011d0);
    return v6;
}
