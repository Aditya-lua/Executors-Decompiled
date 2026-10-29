/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xca94..0xcb70 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ca94_2 {
    struct st_ca94_3 *field_0;
} st_ca94_2;

typedef struct st_ca94_3 {
    struct st_ca94_2 *field_0;
} st_ca94_3;

typedef struct st_ca94_1 {
    struct st_ca94_0 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
    char padding_14[60];
    long long field_50;
    char padding_58[1];
    char field_59;
} st_ca94_1;

typedef struct st_ca94_0 {
    char field_0;
} st_ca94_0;


long long sub_ca94(st_ca94_1 *a0)
{
    unsigned long v6;  // x9
    unsigned long v7;  // x8
    unsigned long v8;  // x10
    char *v9;  // x13
    unsigned int v10;  // w14
    long long v11;  // x2
    long long v12;  // x1
    st_ca94_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_ca94_0 *v1;  // [bp-0x28]
    st_ca94_3 **v2;  // [bp-0x20]
    st_ca94_3 **v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_10;
    v7 = a0->field_8;
    v8 = (unsigned int)v6 + 1;
    a0->field_10 = v8;
    v3 = &v2;
    v2 = &v3;
    if (v7 > v8)
    {
        v9 = a0->field_0;
        do
        {
        } while (((v9[v8] | 32) - 97 < 26 || (v10 = v9[v8], (char)v10 - 48 < 10 || v10 == 95)) && (v8 = (unsigned int)v8 + 1, a0->field_10 = v8, v3 = &v2, v2 = &v3, v7 > v8));
    }
    v11 = v8 - v6;
    v12 = &a0->field_0[v6];
    if (a0->field_59 != 1)
        return sub_9c9c(a0->field_50, v12, v11);
    return sub_b74c(a0->field_50, v12, v11);
}
