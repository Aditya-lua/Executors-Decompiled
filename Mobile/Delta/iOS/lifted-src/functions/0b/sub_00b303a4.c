/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb303a4..0xb3064c (680 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b303a4_0 {
    struct st_b303a4_0 *field_0;
    char padding_8[8];
    struct st_b303a4_0 *field_10;
    struct st_b303a4_0 *field_18;
} st_b303a4_0;

typedef struct st_b303a4_1 {
    long long field_0;
    struct st_b303a4_0 *field_8;
    struct st_b303a4_0 *field_10;
    struct st_b303a4_0 *field_18;
    struct st_b303a4_0 *field_20;
    struct st_b303a4_0 *field_28;
    char field_30;
    char padding_31[23];
    struct st_b303a4_0 *field_48;
} st_b303a4_1;


st_b303a4_0 * sub_b303a4(st_b303a4_1 *a0, st_b303a4_0 *a1)
{
    long long v4;  // x0
    st_b303a4_0 *v5;  // x0
    st_b303a4_0 *v14;  // x0
    st_b303a4_0 *v15;  // x0
    st_b303a4_1 *v16;  // x21
    st_b303a4_0 **v17;  // x22
    st_b303a4_0 **v18;  // x22
    st_b303a4_0 *v19;  // x23
    st_b303a4_0 *v20;  // x0
    st_b303a4_0 *v21;  // x0
    st_b303a4_0 *v22;  // x0
    st_b303a4_0 *v23;  // x9
    long long v6;  // x1
    st_b303a4_0 *v7;  // x0
    st_b303a4_0 *v8;  // x0
    st_b303a4_0 *v9;  // x22
    st_b303a4_1 *v10;  // x21
    st_b303a4_0 **v11;  // x23
    st_b303a4_0 **v12;  // x23
    st_b303a4_0 *v13;  // x0
    st_b303a4_0 *v0;  // [bp-0x50]
    st_b303a4_0 *v1;  // [bp-0x44]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_9f2aec(a0->field_0);
    if (!a1)
    {
        return 1;
    }
    else if (a1->field_0)
    {
        if (sub_a6fbc4(a1, "digest"))
        {
            v5 = sub_afe114(&a0->field_30, a1, v4);
            if (!(unsigned int)v5)
                return v5;
            if (!sub_a50b14(sub_954340(&a0->field_30)))
                goto LABEL_b3043c;
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/pbkdf2.c", 270, "kdf_pbkdf2_set_ctx_params");
            v6 = 183;
        }
        else
        {
LABEL_b3043c:
            if (sub_a6fbc4(a1, "pkcs5"))
            {
                v7 = sub_a6fc2c();
                if (!(unsigned int)v7)
                    return v7;
                *(unsigned int *)&a0->field_48 = !v1;
            }
            v8 = sub_a6fbc4(a1, "pass");
            if (v8)
            {
                v9 = v8;
                v10 = a0;
                v11 = &v10->field_8;
                v12 = v11 + 1;
                sub_a6c4e8(v10->field_8, v11[1], "providers/implementations/kdfs/pbkdf2.c", 167);
                *v12 = 0;
                *v11 = 0;
                if (!v9->field_18)
                {
                    v14 = sub_a6bf4c(1, "providers/implementations/kdfs/pbkdf2.c", 172);
                    *v11 = v14;
                    if (!v14)
                        return v14;
                }
                else if (v9->field_10)
                {
                    v13 = sub_a71440(v9, v11, 0, v12);
                    if (!(unsigned int)v13)
                        return v13;
                }
            }
            v15 = sub_a6fbc4(a1, "salt");
            if (!v15)
            {
LABEL_b305bc:
                if (!sub_a6fbc4(a1, "iter"))
                    return 1;
                v22 = sub_a707f4();
                if (!(unsigned int)v22)
                    return v22;
                if ((int)a0->field_48)
                    v23 = 1000;
                else
                    v23 = 1;
                if (v23 <= v0)
                {
                    a0->field_28 = v0;
                    return 1;
                }
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/pbkdf2.c", 305, "kdf_pbkdf2_set_ctx_params");
                v6 = 123;
            }
            else if ((int)a0->field_48 && 15 >= v15->field_18)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/pbkdf2.c", 293, "kdf_pbkdf2_set_ctx_params");
                v6 = 112;
            }
            else
            {
                v16 = a0;
                v17 = &v16->field_18;
                v18 = v17 + 1;
                v19 = v15;
                sub_a6c4e8(v16->field_18, v17[1], "providers/implementations/kdfs/pbkdf2.c", 167);
                *v18 = 0;
                *v17 = 0;
                if (!v19->field_18)
                {
                    v21 = sub_a6bf4c(1, "providers/implementations/kdfs/pbkdf2.c", 172);
                    *v17 = v21;
                    if (!v21)
                        return v21;
                }
                else if (v19->field_10)
                {
                    v20 = sub_a71440(v19, v17, 0, v18);
                    if (!(unsigned int)v20)
                        return v20;
                }
                goto LABEL_b305bc;
            }
        }
        sub_a36abc(57, v6, 0);
        return 0;
    }
    else
    {
        return 1;
    }
}
