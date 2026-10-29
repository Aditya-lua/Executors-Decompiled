/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2d60c..0xb2d774 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2d60c_2 {
    struct st_b2d60c_0 *field_0;
    unsigned long long field_8;
} st_b2d60c_2;

typedef struct st_b2d60c_4 {
    struct st_b2d60c_0 *field_0;
    char padding_8[8];
    struct st_b2d60c_0 *field_10;
    unsigned long long field_18;
} st_b2d60c_4;

typedef struct st_b2d60c_3 {
    struct st_b2d60c_0 *field_0;
    char padding_8[8];
    struct st_b2d60c_0 *field_10;
    char padding_18[8];
    struct st_b2d60c_0 *field_20;
    unsigned long long field_28;
} st_b2d60c_3;

typedef struct st_b2d60c_0 {
    struct st_b2d60c_0 *field_0;
} st_b2d60c_0;

typedef struct st_b2d60c_1 {
    char padding_0[8];
    struct st_b2d60c_0 *field_8;
    char padding_10[56];
    struct st_b2d60c_0 *field_48;
    char field_50;
    char padding_51[7];
    struct st_b2d60c_0 *field_58;
    char field_60;
    char padding_61[7];
    struct st_b2d60c_0 *field_68;
    long long field_70;
} st_b2d60c_1;


st_b2d60c_0 ** sub_b2d60c(st_b2d60c_1 *a0, st_b2d60c_0 **a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_b2d60c_0 **v17;  // x0
    st_b2d60c_1 *v18;  // x22
    st_b2d60c_4 *v19;  // x22
    st_b2d60c_0 **v20;  // x0
    st_b2d60c_2 *v21;  // x19
    st_b2d60c_0 **v22;  // x0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_b2d60c_0 **v12;  // x0
    st_b2d60c_0 **v13;  // x0
    st_b2d60c_1 *v14;  // x22
    st_b2d60c_3 *v15;  // x22
    st_b2d60c_0 **v16;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a1)
        return 1;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (!*a1)
        return 1;
    v12 = sub_b2da4c();
    if (!(unsigned int)v12)
    {
        return v12;
    }
    else if ((int)a0->field_8)
    {
        v13 = sub_a6fbc4(a1, "prefix");
        if (v13)
        {
            v14 = a0;
            v15 = &v14->field_48;
            sub_a6c2e4(v14->field_48, "providers/implementations/kdfs/hkdf.c", 859);
            v15->field_0 = 0;
            v16 = sub_a71440(v13, v15, 0, v15->padding_8);
            if (!(unsigned int)v16)
                return v16;
        }
        v17 = sub_a6fbc4(a1, "label");
        if (v17)
        {
            v18 = a0;
            v19 = &v18->field_58;
            sub_a6c2e4(v18->field_58, "providers/implementations/kdfs/hkdf.c", 867);
            v19->field_0 = 0;
            v20 = sub_a71440(v17, v19, 0, v19->padding_8);
            if (!(unsigned int)v20)
                return v20;
        }
        v21 = &a0->field_68;
        sub_a6c4e8(a0->field_68, v21->field_8, "providers/implementations/kdfs/hkdf.c", 874);
        v21->field_0 = 0;
        if (sub_a6fbc4(a1, "data"))
        {
            v22 = sub_a71440();
            if (!(unsigned int)v22)
                return v22;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/hkdf.c", 854, "kdf_tls1_3_set_ctx_params");
        sub_a36abc(57, 125, 0);
        return 0;
    }
    return 1;
}
