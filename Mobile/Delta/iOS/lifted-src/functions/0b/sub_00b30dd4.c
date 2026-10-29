/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb30dd4..0xb30f80 (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b30dd4_0 {
    struct st_b30dd4_0 *field_0;
    char padding_8[8];
    struct st_b30dd4_0 *field_10;
    struct st_b30dd4_0 *field_18;
} st_b30dd4_0;

typedef struct st_b30dd4_1 {
    long long field_0;
    char field_8;
    char padding_9[23];
    struct st_b30dd4_0 *field_20;
    struct st_b30dd4_0 *field_28;
    struct st_b30dd4_0 *field_30;
    struct st_b30dd4_0 *field_38;
} st_b30dd4_1;


st_b30dd4_0 * sub_b30dd4(st_b30dd4_1 *a0, st_b30dd4_0 *a1)
{
    long long v2;  // x0
    st_b30dd4_0 *v3;  // x0
    st_b30dd4_0 *v12;  // x22
    st_b30dd4_1 *v13;  // x21
    st_b30dd4_0 **v14;  // x23
    st_b30dd4_0 **v15;  // x23
    st_b30dd4_0 *v16;  // x0
    st_b30dd4_0 *v17;  // x0
    st_b30dd4_0 *v18;  // x0
    st_b30dd4_0 *v19;  // x0
    st_b30dd4_0 *v4;  // x0
    st_b30dd4_0 *v5;  // x22
    st_b30dd4_1 *v6;  // x21
    st_b30dd4_0 **v7;  // x23
    st_b30dd4_0 **v8;  // x23
    st_b30dd4_0 *v9;  // x0
    st_b30dd4_0 *v10;  // x0
    st_b30dd4_0 *v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec(a0->field_0);
    if (!a1 || !a1->field_0)
        return 1;
    v3 = sub_afe114(&a0->field_8, a1, v2);
    if (!(unsigned int)v3)
        return v3;
    v4 = sub_a6fbc4(a1, "pass");
    if (v4)
    {
        v5 = v4;
        v6 = a0;
        v7 = &v6->field_20;
        v8 = v7 + 1;
        sub_a6c4e8(v6->field_20, v7[1], "providers/implementations/kdfs/pkcs12kdf.c", 0xcc);
        *v8 = 0;
        *v7 = 0;
        if (!v5->field_18)
        {
            v10 = sub_a6bf4c(1, "providers/implementations/kdfs/pkcs12kdf.c", 209);
            *v7 = v10;
            if (!v10)
                return v10;
        }
        else if (v5->field_10)
        {
            v9 = sub_a71440(v5, v7, 0, v8);
            if (!(unsigned int)v9)
                return v9;
        }
    }
    v11 = sub_a6fbc4(a1, "salt");
    if (v11)
    {
        v12 = v11;
        v13 = a0;
        v14 = &v13->field_30;
        v15 = v14 + 1;
        sub_a6c4e8(v13->field_30, v14[1], "providers/implementations/kdfs/pkcs12kdf.c", 0xcc);
        *v15 = 0;
        *v14 = 0;
        if (!v12->field_18)
        {
            v17 = sub_a6bf4c(1, "providers/implementations/kdfs/pkcs12kdf.c", 209);
            *v14 = v17;
            if (!v17)
                return v17;
        }
        else if (v12->field_10)
        {
            v16 = sub_a71440(v12, v14, 0, v15);
            if (!(unsigned int)v16)
                return v16;
        }
    }
    if (sub_a6fbc4(a1, "id"))
    {
        v18 = sub_a6fc2c();
        if (!(unsigned int)v18)
            return v18;
    }
    if (sub_a6fbc4(a1, "iter"))
    {
        v19 = sub_a707f4();
        if (!(unsigned int)v19)
            return v19;
    }
    return 1;
}
