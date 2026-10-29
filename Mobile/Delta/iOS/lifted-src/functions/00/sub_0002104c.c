/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2104c..0x211f0 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2104c_2 {
    char padding_0[12];
    unsigned long long field_c;
} st_2104c_2;

typedef struct st_2104c_1 {
    char padding_0[128];
    long long field_80;
    unsigned long long field_84;
    char padding_8c[12];
    unsigned long long field_98;
    char padding_a0[56];
    long long field_d8;
    char padding_e0[52];
    unsigned int field_114;
} st_2104c_1;

typedef struct st_2104c_0 {
    char field_0;
} st_2104c_0;


st_2104c_2 * sub_2104c(st_2104c_1 *a0, char *a1, unsigned long long *a2)
{
    st_2104c_2 *v10;  // x22
    unsigned int v11;  // w26
    long long i;  // w8
    st_2104c_2 *v13;  // x22
    st_2104c_2 *v14;  // x0
    st_2104c_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_2104c_0 *v1;  // [bp-0x98]
    unsigned long v2;  // [bp-0x90]
    unsigned long long v3;  // [bp-0x88]
    unsigned long v4;  // [bp-0x80]
    char v5;  // [bp-0x78]
    unsigned long long v6;  // [bp-0x70]
    unsigned long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    if ((int)a0->field_80 == 281)
        *a2 = *(long long *)&a0->padding_8c[8];
    v10 = sub_1d794(a0, "function name");
    v11 = *(int *)&a0->padding_e0[44];
    i = (int)a0->field_80;
    v13 = v10;
    if (i == 46)
    {
        do
        {
            v7 = *(long long *)((char *)&a0->field_80 + 4);
            sub_f8d0(a0);
            sub_1f174(a0, "field name");
            *a2 = v4;
            v2 = *(long long *)&(v10->padding_0)[1];
            v3 = v6;
            v13 = sub_404c(*(long long *)&a0->padding_a0[48], 80);
            sub_6148(v13, &v2, v10, &v4, &v5, &v7, 46);
            sub_16844(a0, "function name");
            i = (int)a0->field_80;
            v10 = v13;
        } while (i == 46);
    }
    *(unsigned int *)&a0->padding_e0[44] = v11;
    if (i != 58)
        return v13;
    v7 = *(long long *)((char *)&a0->field_80 + 4);
    sub_f8d0(a0);
    sub_1f174(a0, "method name");
    *a2 = v4;
    v2 = *(long long *)&(v13->padding_0)[1];
    v3 = v6;
    v14 = sub_6148(sub_404c(*(long long *)&a0->padding_a0[48], 80), &v2, v13, &v4, &v5, &v7, 58);
    *a1 = 1;
    return v14;
}
