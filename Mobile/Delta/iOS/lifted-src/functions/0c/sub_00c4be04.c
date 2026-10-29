/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4be04..0xc4bed0 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4be04_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_c4be04_0;


st_c4be04_0 * sub_c4be04(st_c4be04_0 *a0, st_c4be04_0 *a1, st_c4be04_0 *a2, unsigned long long a3)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v19;  // x23
    unsigned long long v20;  // x24
    unsigned int v21;  // w10
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_c4be04_0 *v16;  // x19
    st_c4be04_0 *v17;  // x20
    unsigned long long v18;  // x21
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a2;
    v17 = a1;
    if (a3 >= 8)
    {
        v18 = a3 >> 3;
        v19 = v18 * 128;
        v20 = v18 * 224;
        a0 = sub_c4be04(a0, &a0->padding_0[v19], &a0->padding_0[v20], v18);
        v17 = sub_c4be04(v17, &v17->padding_0[v19], &v17->padding_0[v20], v18);
        v16 = sub_c4be04(v16, &v16->padding_0[v19], &v16->padding_0[v20], v18);
    }
    v21 = v17->field_10 > a0->field_10;
    if (v21 ^ v16->field_10 > v17->field_10)
        v17 = v16;
    if (!(v21 ^ v16->field_10 > a0->field_10))
        return v17;
    return a0;
}
