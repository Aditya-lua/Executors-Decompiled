/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa8cb0..0xaa909c (1004 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa8cb0_1 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_aa8cb0_0 *field_10;
} st_aa8cb0_1;

typedef struct st_aa8cb0_0 {
    char padding_0[32];
    struct st_aa8cb0_0 *field_20;
    char padding_28[16];
    struct st_aa8cb0_0 *field_38;
    struct st_aa8cb0_0 *field_40;
    struct st_aa8cb0_0 *field_48;
    struct st_aa8cb0_0 *field_50;
    struct st_aa8cb0_0 *field_58;
    struct st_aa8cb0_0 *field_60;
} st_aa8cb0_0;


st_aa8cb0_0 * sub_aa8cb0(long long a0, long long a1)
{
    long long v4;  // x19
    st_aa8cb0_0 *v5;  // x20
    st_aa8cb0_0 *v14;  // x0
    st_aa8cb0_0 *v15;  // x27
    st_aa8cb0_0 *v16;  // x27
    st_aa8cb0_0 *v17;  // x27
    st_aa8cb0_0 *v18;  // x27
    st_aa8cb0_0 *v19;  // x27
    st_aa8cb0_0 *v20;  // x27
    st_aa8cb0_0 *v6;  // x0
    st_aa8cb0_0 *v7;  // x21
    st_aa8cb0_0 *v8;  // x22
    st_aa8cb0_0 *v9;  // x23
    st_aa8cb0_1 *v10;  // x28
    st_aa8cb0_0 *v11;  // x0
    st_aa8cb0_0 *v12;  // x27
    st_aa8cb0_0 *v13;  // x0
    unsigned long v0;  // [bp-0x70]
    st_aa8cb0_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_962b90(a1);
    v5 = sub_a6820c(v4, 5);
    v6 = sub_9f4bd0(a1, sub_c4ba8(a0));
    if (!v6)
    {
        sub_a368c8();
        sub_a369bc("crypto/rand/rand_lib.c", 995, "random_conf_init");
        sub_a36abc(15, 0x77, 0);
    }
    else if (v5)
    {
        v7 = v6;
        if ((int)sub_ad69e4() < 1)
            return 1;
        v8 = 0;
        v9 = 1;
        while (1)
        {
            v10 = sub_ad69f8(v7, v8);
            if (!sub_a6e200(v10->field_8, "random"))
            {
                if (!v10->field_10)
                {
                    v20 = 0;
                }
                else
                {
                    v20 = sub_a6d9b4(v10->field_10, "crypto/rand/rand_lib.c", 969);
                    if (!v20)
                        break;
                }
                sub_a6c2e4(v5->field_38, "crypto/rand/rand_lib.c", 973);
                v5->field_38 = v20;
            }
            else if (!sub_a6e200(v10->field_8, "cipher"))
            {
                if (v10->field_10)
                {
                    v19 = sub_a6d9b4(v10->field_10, "crypto/rand/rand_lib.c", 969);
                    if (!v19)
                        break;
                }
                else
                {
                    v19 = 0;
                }
                sub_a6c2e4(v5->field_40, "crypto/rand/rand_lib.c", 973);
                v5->field_40 = v19;
            }
            else if (!sub_a6e200(v10->field_8, "digest"))
            {
                if (v10->field_10)
                {
                    v18 = sub_a6d9b4(v10->field_10, "crypto/rand/rand_lib.c", 969);
                    if (!v18)
                        break;
                }
                else
                {
                    v18 = 0;
                }
                sub_a6c2e4(v5->field_48, "crypto/rand/rand_lib.c", 973);
                v5->field_48 = v18;
            }
            else if (!sub_a6e200(v10->field_8, "properties"))
            {
                if (v10->field_10)
                {
                    v17 = sub_a6d9b4(v10->field_10, "crypto/rand/rand_lib.c", 969);
                    if (!v17)
                        break;
                }
                else
                {
                    v17 = 0;
                }
                sub_a6c2e4(v5->field_50, "crypto/rand/rand_lib.c", 973);
                v5->field_50 = v17;
            }
            else if (!sub_a6e200(v10->field_8, "seed"))
            {
                if (v10->field_10)
                {
                    v16 = sub_a6d9b4(v10->field_10, "crypto/rand/rand_lib.c", 969);
                    if (!v16)
                        break;
                }
                else
                {
                    v16 = 0;
                }
                sub_a6c2e4(v5->field_58, "crypto/rand/rand_lib.c", 973);
                v5->field_58 = v16;
            }
            else if (!sub_a6e200(v10->field_8, "seed_properties"))
            {
                if (v10->field_10)
                {
                    v15 = sub_a6d9b4(v10->field_10, "crypto/rand/rand_lib.c", 969);
                    if (!v15)
                        break;
                }
                else
                {
                    v15 = 0;
                }
                sub_a6c2e4(v5->field_60, "crypto/rand/rand_lib.c", 973);
                v5->field_60 = v15;
            }
            else if (sub_a6e200(v10->field_8, "random_provider"))
            {
                sub_a368c8();
                sub_a369bc("crypto/rand/rand_lib.c", 1048, "random_conf_init");
                v0 = v10->field_8;
                v1 = v10->field_10;
                sub_a36abc(15, 120, "name=%s, value=%s");
                v9 = 0;
            }
            else
            {
                v11 = sub_a78b18(v4, v10->field_10, 0);
                if (v11)
                {
                    v12 = v11;
                    if (!sub_aa90a0(v4, v12))
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/rand/rand_lib.c", 0x404, "random_conf_init");
                        sub_a36abc(15, 0xc0103, 0);
                        sub_a77604(v12);
                        return 0;
                    }
                    sub_a77604(v12);
                }
                else
                {
                    v13 = v5->field_20;
                    if (!v13)
                    {
LABEL_aa8fd8:
                        sub_a6c2e4(v13, "crypto/rand/rand_lib.c", 131);
                        v14 = sub_a6d9b4(v10->field_10, "crypto/rand/rand_lib.c", 132);
                        v5->field_20 = v14;
                        if (!v14)
                            break;
                    }
                    else if (sub_a6e200(v13, v10->field_10))
                    {
                        v13 = v5->field_20;
                        goto LABEL_aa8fd8;
                    }
                }
            }
            v8 = (unsigned int)v8 + 1;
            if ((int)sub_ad69e4(v7) <= (int)(unsigned int)v8)
                return v9;
        }
    }
    return 0;
}
