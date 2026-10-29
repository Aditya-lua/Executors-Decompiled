/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2da4c..0xb2dc98 (588 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2da4c_3 {
    struct st_b2da4c_0 *field_0;
    unsigned long long field_8;
} st_b2da4c_3;

typedef struct st_b2da4c_0 {
    struct st_b2da4c_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
} st_b2da4c_0;

typedef struct st_b2da4c_2 {
    struct st_b2da4c_0 *field_0;
    char padding_8[8];
    struct st_b2da4c_0 *field_10;
    unsigned long long field_18;
} st_b2da4c_2;

typedef struct st_b2da4c_1 {
    long long field_0;
    struct st_b2da4c_0 *field_8;
    char field_10;
    char padding_11[23];
    struct st_b2da4c_0 *field_28;
    char field_30;
    char padding_31[7];
    struct st_b2da4c_0 *field_38;
    long long field_40;
} st_b2da4c_1;


unsigned long long sub_b2da4c(st_b2da4c_1 *a0, st_b2da4c_0 *a1)
{
    long long v3;  // x0
    unsigned long long v4;  // x0
    st_b2da4c_0 *v13;  // x0
    st_b2da4c_2 *v14;  // x19
    unsigned long long v15;  // x0
    st_b2da4c_0 *v6;  // x0
    st_b2da4c_0 *v7;  // x21
    st_b2da4c_0 *v9;  // w8
    st_b2da4c_0 *v10;  // x0
    st_b2da4c_3 *v11;  // x23
    unsigned long long v12;  // x0
    unsigned int v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9f2aec(a0->field_0);
    if (!a1 || !a1->field_0)
        return 1;
    if (sub_a6fbc4(a1, "digest"))
    {
        v4 = sub_afe114(&a0->field_10, a1, v3);
        if (!(unsigned int)v4)
        {
            return v4;
        }
        else if (sub_a50b14(sub_954340(&a0->field_10)))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/hkdf.c", 270, "hkdf_common_set_ctx_params");
            sub_a36abc(57, 183, 0);
            return 0;
        }
    }
    v6 = sub_a6fbc4(a1, "mode");
    if (v6)
    {
        if (v6->field_8 == 4)
        {
            v7 = v6;
            if (sub_a6e200(v6->field_10, "EXTRACT_AND_EXPAND"))
            {
                if (sub_a6e200(v7->field_10, "EXTRACT_ONLY"))
                {
                    if (sub_a6e200(v7->field_10, "EXPAND_ONLY"))
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/kdfs/hkdf.c", 284, "hkdf_common_set_ctx_params");
                        sub_a36abc(57, 125, 0);
                        return 0;
                    }
                    v9 = (st_b2da4c_0 *)2;
                }
                else
                {
                    v9 = (st_b2da4c_0 *)1;
                }
            }
            else
            {
                v9 = (st_b2da4c_0 *)0;
            }
        }
        else if (sub_a6fc2c())
        {
            v9 = (st_b2da4c_0 *)v0;
            if (v9 >= 3)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/hkdf.c", 291, "hkdf_common_set_ctx_params");
                sub_a36abc(57, 125, 0);
                return 0;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/hkdf.c", 296, "hkdf_common_set_ctx_params");
            sub_a36abc(57, 125, 0);
            return 0;
        }
        *(unsigned int *)&a0->field_8 = (unsigned int)v9;
    }
    v10 = sub_a6fbc4(a1, "key");
    if (v10)
    {
        v11 = &a0->field_38;
        sub_a6c4e8(a0->field_38, v11->field_8, "providers/implementations/kdfs/hkdf.c", 302);
        v11->field_0 = 0;
        v12 = sub_a71440(v10, v11, 0, &v11->field_8);
        if (!(unsigned int)v12)
            return v12;
    }
    v13 = sub_a6fbc4(a1, "salt");
    if (v13)
    {
        v14 = &a0->field_28;
        sub_a6c2e4(a0->field_28, "providers/implementations/kdfs/hkdf.c", 310);
        v14->field_0 = 0;
        v15 = sub_a71440(v13, v14, 0, v14->padding_8);
        if (!(unsigned int)v15)
            return v15;
    }
    return 1;
}
