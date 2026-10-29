/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb26e60..0xb270e8 (648 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b26e60_0 {
    struct st_b26e60_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_b26e60_0 *field_8;
    struct st_b26e60_0 *field_10;
    struct st_b26e60_0 *field_18;
    struct st_b26e60_0 *field_20;
    struct st_b26e60_0 *field_28;
    struct st_b26e60_0 *field_30;
    struct st_b26e60_0 *field_38;
    struct st_b26e60_0 *field_40;
    struct st_b26e60_0 *field_48;
    struct st_b26e60_0 *field_50;
    struct st_b26e60_0 *field_58;
} st_b26e60_0;

extern long long g_b270e8;

st_b26e60_0 * sub_b26e60(unsigned long long a0, st_b26e60_0 *a1, unsigned long long a2, st_b26e60_0 *a3)
{
    st_b26e60_0 *v4;  // x23
    st_b26e60_0 *v5;  // x21
    st_b26e60_0 *v14;  // x20
    st_b26e60_0 *v15;  // x20
    st_b26e60_0 *v16;  // x26
    st_b26e60_0 *v17;  // x23
    long long v18;  // x24
    st_b26e60_0 *v19;  // x8
    st_b26e60_0 *v6;  // x25
    st_b26e60_0 *v7;  // x25
    st_b26e60_0 *v8;  // x27
    st_b26e60_0 *v9;  // x27
    st_b26e60_0 *v10;  // x28
    st_b26e60_0 *v11;  // x28
    st_b26e60_0 *v12;  // x19
    st_b26e60_0 *v13;  // x19
    unsigned long long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a3;
    v5 = sub_a6bffc(112, "providers/implementations/encode_decode/ml_common_codecs.c", 45);
    if (!v5)
        return v5;
    v5->field_0 = a1;
    *(unsigned int *)&v5->field_1 = 0;
    v6 = v5;
    v6->field_8 = &a1->field_50;
    v7 = &v6->field_8;
    *(unsigned int *)&v5->field_10 = 0;
    v8 = v5;
    v8->field_18 = &a1[1].field_40;
    v9 = &v8->field_18;
    v10 = v5;
    v10->field_28 = &a1[2].field_30;
    v11 = &v10->field_28;
    *(unsigned int *)&v5->field_20 = 0;
    *(unsigned int *)&v5->field_30 = 0;
    v12 = v5;
    v12->field_38 = &a1[3].field_20;
    v13 = &v12->field_38;
    *(unsigned int *)&v5->field_40 = 0;
    v14 = v5;
    v14->field_48 = &a1[4].field_10;
    v15 = &v14->field_48;
    *(unsigned int *)&v5->field_50 = 0;
    if (!v4)
        return v5;
    v16 = 0;
LABEL_b26f30:
    v17 = (char *)v4 + _strspn(v4, "\t ,");
    if (!(char)v17->field_0 && !(unsigned int)v16)
    {
        sub_a368c8(sub_a6c2e4(v5, "providers/implementations/encode_decode/ml_common_codecs.c", 82), "providers/implementations/encode_decode/ml_common_codecs.c", 82);
        sub_a369bc("providers/implementations/encode_decode/ml_common_codecs.c", 83, "ossl_ml_common_pkcs8_fmt_order");
        v0 = a0;
        v1 = a2;
        sub_a36abc(57, 245, "no %s private key %s formats are enabled");
        return 0;
    }
    v18 = _strcspn(v17, "\t ,");
    if (0 >= *(int *)&v5->field_1 && !(v19 = v5, sub_a6e258(v5->field_0->field_0, v17, v18)) || 0 >= (int)v5->field_10 && !(v19 = v7, sub_a6e258(v7->field_0->field_0, v17, v18)) || 0 >= (int)v5->field_20 && !(v19 = v9, sub_a6e258(v9->field_0->field_0, v17, v18)) || 0 >= (int)v5->field_30 && !(v19 = v11, sub_a6e258(v11->field_0->field_0, v17, v18)) || 0 >= (int)v5->field_40 && !(v19 = v13, sub_a6e258(v13->field_0->field_0, v17, v18)) || 0 >= (int)v5->field_50 && !(v19 = v15, sub_a6e258(v15->field_0->field_0, v17, v18)))
    {
        v16 = (unsigned int)v16 + 1;
        *(unsigned int *)&v19->field_1 = (unsigned int)v16;
    }
    v4 = (char *)v17 + v18;
    if (6 <= (int)(unsigned int)v16)
    {
        _qsort(v5, 6, 16, &g_b270e8);
        *(unsigned long long *)((char *)v5 + ((long long)(v16 * 0x100000000) >> 63 & 0xfffffff000000000 | __ROL__(v16, 4) & 0xffffffff0 & 0xfffffffff)) = 0;
        return v5;
    }
    goto LABEL_b26f30;
}
