/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2ac04..0xb2b148 (1348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2ac04_0 {
    struct st_b2ac04_0 *field_0;
    unsigned long long field_8;
    struct st_b2ac04_0 *field_10;
} st_b2ac04_0;

typedef struct st_b2ac04_1 {
    struct st_b2ac04_1 *field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_b2ac04_1 *field_10;
} st_b2ac04_1;

typedef struct st_b2ac04_2 {
    char padding_0[8];
    struct st_b2ac04_1 *field_8;
    struct st_b2ac04_1 *field_10;
    struct st_b2ac04_1 *field_18;
    struct st_b2ac04_1 *field_20;
    struct st_b2ac04_1 *field_28;
    struct st_b2ac04_1 *field_30;
    struct st_b2ac04_1 *field_38;
    struct st_b2ac04_1 *field_40;
    struct st_b2ac04_1 *field_48;
    struct st_b2ac04_1 *field_4c;
    char padding_54[12];
    unsigned int field_60;
} st_b2ac04_2;


st_b2ac04_0 * sub_b2ac04(st_b2ac04_2 *a0, st_b2ac04_0 *a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v19;  // x8
    st_b2ac04_0 *v20;  // x0
    unsigned long long v21;  // x8
    st_b2ac04_0 *v22;  // x0
    st_b2ac04_0 *v23;  // w8
    long long v24;  // x1
    st_b2ac04_0 *v25;  // x0
    st_b2ac04_0 *v26;  // w8
    st_b2ac04_0 *v27;  // x0
    st_b2ac04_0 *v28;  // x0
    unsigned long long v11;  // x20
    st_b2ac04_0 *v29;  // x0
    st_b2ac04_0 *v30;  // x0
    st_b2ac04_0 *v31;  // x0
    st_b2ac04_0 *v32;  // x0
    st_b2ac04_0 *v33;  // x0
    st_b2ac04_0 *v34;  // x0
    st_b2ac04_0 *v35;  // x0
    st_b2ac04_0 *v36;  // x0
    st_b2ac04_0 *v37;  // x0
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    st_b2ac04_0 *v14;  // x0
    unsigned long long v15;  // x8
    st_b2ac04_0 *v16;  // x0
    unsigned long long v17;  // x8
    st_b2ac04_0 *v18;  // x0
    st_b2ac04_0 *v0;  // [bp-0x40], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a1)
        return 1;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    if (!a1->field_0)
        return 1;
    v14 = sub_a6fbc4(a1, "pass");
    if (!v14)
    {
LABEL_b2ad04:
        v16 = sub_a6fbc4(a1, "salt");
        if (v16)
        {
            if (v16->field_10)
            {
                if (a0->field_20)
                {
                    sub_a6c4e8(a0->field_20, (int)a0->field_28, "providers/implementations/kdfs/argon2.c", 1295);
                    a0->field_20 = 0;
                    *(unsigned int *)&a0->field_28 = 0;
                }
                if (sub_a71440())
                {
                    v17 = v1;
                    if (7 >= v17)
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/kdfs/argon2.c", 1304, "kdf_argon2_ctx_set_salt");
                        v0 = 8;
                    }
                    else
                    {
                        if (v17 > 0xffffffff)
                        {
                            sub_a368c8();
                            sub_a369bc("providers/implementations/kdfs/argon2.c", 1310, "kdf_argon2_ctx_set_salt");
                            v0 = 0xffffffff;
                        }
                        else
                        {
                            *(unsigned int *)&a0->field_28 = v17;
                            goto LABEL_b2ae0c;
                        }
                    }
                    sub_a36abc(57, 112);
                    sub_a6c2e4(a0->field_20, "providers/implementations/kdfs/argon2.c", 1319);
                    a0->field_20 = 0;
                    *(unsigned int *)&a0->field_28 = 0;
                    return 0;
                }
            }
        }
        else
        {
LABEL_b2ae0c:
            v18 = sub_a6fbc4(a1, "secret");
            if (v18)
            {
                if (v18->field_10)
                {
                    if (a0->field_30)
                    {
                        sub_a6c4e8(a0->field_30, (int)a0->field_38, "providers/implementations/kdfs/argon2.c", 1236);
                        a0->field_30 = 0;
                        *(unsigned int *)&a0->field_38 = 0;
                    }
                    if (sub_a71440())
                    {
                        v19 = v1;
                        if (v19 > 0xffffffff)
                        {
                            sub_a6c2e4(a0->field_30, "providers/implementations/kdfs/argon2.c", 1245);
                            a0->field_30 = 0;
                            *(unsigned int *)&a0->field_38 = 0;
                            return 0;
                        }
                        *(unsigned int *)&a0->field_38 = v19;
                        goto LABEL_b2aea4;
                        goto LABEL_b2aea4;
                    }
                }
            }
            else
            {
LABEL_b2aea4:
                v20 = sub_a6fbc4(a1, "ad");
                if (v20)
                {
                    if (v20->field_10)
                    {
                        if (a0->field_40)
                        {
                            sub_a6c4e8(a0->field_40, (int)a0->field_48, "providers/implementations/kdfs/argon2.c", 1333);
                            a0->field_40 = 0;
                            *(unsigned int *)&a0->field_48 = 0;
                        }
                        if (sub_a71440())
                        {
                            v21 = v1;
                            if (v21 > 0xffffffff)
                            {
                                sub_a6c2e4(a0->field_40, "providers/implementations/kdfs/argon2.c", 1342);
                                a0->field_40 = 0;
                                *(unsigned int *)&a0->field_48 = 0;
                                return 0;
                            }
                            *(unsigned int *)&a0->field_48 = v21;
                            goto LABEL_b2af3c;
                            goto LABEL_b2af3c;
                        }
                    }
                }
                else
                {
LABEL_b2af3c:
                    if (sub_a6fbc4(a1, "size"))
                    {
                        v22 = sub_a6ffd0();
                        if (!(unsigned int)v22)
                            return v22;
                        v23 = (st_b2ac04_0 *)(unsigned int)v1;
                        if (3 >= v23)
                        {
                            sub_a368c8();
                            sub_a369bc("providers/implementations/kdfs/argon2.c", 1219, "kdf_argon2_ctx_set_out_length");
                            v0 = 4;
                            v24 = 217;
                            goto LABEL_b2b12c;
                        }
                        else
                        {
                            *(unsigned int *)&a0->field_8 = (unsigned int)v23;
                        }
                    }
                    if (sub_a6fbc4(a1, "iter"))
                    {
                        v25 = sub_a6ffd0();
                        if (!(unsigned int)v25)
                            return v25;
                        v26 = (st_b2ac04_0 *)(unsigned int)v1;
                        if (v26)
                        {
                            *(unsigned int *)((char *)&a0->field_48 + 4) = (unsigned int)v26;
                            goto LABEL_b2afd0;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("providers/implementations/kdfs/argon2.c", 1187, "kdf_argon2_ctx_set_t_cost");
                            v0 = 1;
                            v24 = 123;
                        }
LABEL_b2b12c:
                        sub_a36abc(57, v24, "min: %u");
                    }
                    else
                    {
LABEL_b2afd0:
                        if (sub_a6fbc4(a1, "threads"))
                        {
                            v27 = sub_a6ffd0();
                            if (!(unsigned int)v27)
                                return v27;
                            v28 = sub_b2cbe4(a0, (unsigned int)v1);
                            if (!(unsigned int)v28)
                                return v28;
                        }
                        if (sub_a6fbc4(a1, "lanes"))
                        {
                            v29 = sub_a6ffd0();
                            if (!(unsigned int)v29)
                                return v29;
                            v30 = sub_b2cc80(a0, (unsigned int)v1);
                            if (!(unsigned int)v30)
                                return v30;
                        }
                        if (sub_a6fbc4(a1, "memcost"))
                        {
                            v31 = sub_a6ffd0();
                            if (!(unsigned int)v31)
                                return v31;
                            v32 = sub_b2cd1c(a0, (unsigned int)v1);
                            if (!(unsigned int)v32)
                                return v32;
                        }
                        if (sub_a6fbc4(a1, "early_clean"))
                        {
                            v33 = sub_a6ffd0();
                            if (!(unsigned int)v33)
                                return v33;
                            *(unsigned int *)&a0->padding_54[8] = (unsigned int)v1 != 0;
                        }
                        if (sub_a6fbc4(a1, "version"))
                        {
                            v34 = sub_a6ffd0();
                            if (!(unsigned int)v34)
                                return v34;
                            v35 = sub_b2cd84(a0, (unsigned int)v1);
                            if (!(unsigned int)v35)
                                return v35;
                        }
                        v36 = sub_a6fbc4(a1, "properties");
                        if (!v36)
                            return 1;
                        if ((int)v36->field_8 == 4)
                        {
                            v37 = sub_b2cde4(a0, v36->field_10);
                            if (!(unsigned int)v37)
                                return v37;
                            return 1;
                        }
                    }
                }
            }
        }
    }
    else if (v14->field_10)
    {
        if (a0->field_10)
        {
            sub_a6c4e8(a0->field_10, (int)a0->field_18, "providers/implementations/kdfs/argon2.c", 1263);
            a0->field_10 = 0;
            *(unsigned int *)&a0->field_18 = 0;
        }
        if (sub_a71440())
        {
            v15 = v1;
            if (v15 > 0xffffffff)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/argon2.c", 1272, "kdf_argon2_ctx_set_pwd");
                v0 = 0xffffffff;
                sub_a36abc(57, 112, "max: %u");
                sub_a6c2e4(a0->field_10, "providers/implementations/kdfs/argon2.c", 1281);
                a0->field_10 = 0;
                *(unsigned int *)&a0->field_18 = 0;
                return 0;
            }
            *(unsigned int *)&a0->field_18 = v15;
            goto LABEL_b2ad04;
            goto LABEL_b2ad04;
        }
    }
    return 0;
}
