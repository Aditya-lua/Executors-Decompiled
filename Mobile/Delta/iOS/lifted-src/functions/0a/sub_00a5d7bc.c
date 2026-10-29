/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5d7bc..0xa5dac0 (772 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5d7bc_4 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    char padding_20[8];
    struct st_a5d7bc_0 *field_28;
    char padding_30[68];
    unsigned int field_74;
    struct st_a5d7bc_2 *field_78;
} st_a5d7bc_4;

typedef struct st_a5d7bc_0 {
    char padding_0[80];
    struct st_a5d7bc_1 *field_50;
    struct st_a5d7bc_1 *field_58;
    char padding_60[120];
    struct st_a5d7bc_1 *field_d8;
} st_a5d7bc_0;

typedef struct st_a5d7bc_2 {
    char padding_0[16];
    struct st_a5d7bc_3 *field_10;
} st_a5d7bc_2;

typedef struct st_a5d7bc_1 {
    unsigned int field_0;
} st_a5d7bc_1;

typedef struct st_a5d7bc_3 {
    unsigned long long field_0;
} st_a5d7bc_3;


unsigned int sub_a5d7bc(st_a5d7bc_4 *a0)
{
    unsigned int idx;  // x19
    unsigned int v4;  // x8
    st_a5d7bc_2 *v13;  // q0
    unsigned int v14;  // x9
    st_a5d7bc_2 *v15;  // x8
    unsigned int v5;  // x0
    unsigned long long v6;  // x8
    unsigned int v7;  // x0
    unsigned long v8;  // x8
    st_a5d7bc_0 *v9;  // x0
    st_a5d7bc_0 *v10;  // x0
    st_a5d7bc_0 *v11;  // x0
    st_a5d7bc_0 *v12;  // x0
    unsigned int v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (*(long long *)&a0[1].field_0 && !sub_a32d54(*(long long *)&a0[1].field_0))
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/pmeth_lib.c", 459, "EVP_PKEY_CTX_dup");
        sub_a36abc(6, 0x80026, 0);
        return 0;
    }
    idx = sub_a6bffc(176, "crypto/evp/pmeth_lib.c", 463);
    if (!idx)
        return idx;
    if (!a0[1].field_8)
    {
        v4 = 0;
LABEL_a5d84c:
        *(unsigned long long *)(idx + 0x88) = v4;
        *(unsigned int *)idx = a0->field_0;
        v5 = (unsigned int)a0->padding_10;
        v6 = a0->field_18;
        *(unsigned long long *)(idx + 16) = 0;
        *(unsigned long long *)(idx + 24) = v6;
        *(long long *)(idx + 8) = a0->field_8;
        if (!v5 || !(v7 = sub_a6d9b4(v5, "crypto/evp/pmeth_lib.c", 476), *(unsigned long long *)(idx + 16) = v7, !v7))
        {
            *(unsigned int *)(idx + 116) = a0->field_74;
            if (a0->padding_20)
            {
                if (sub_a2d050(a0->padding_20))
                {
                    *(char [8])(idx + 32) = a0->padding_20;
                    goto LABEL_a5d8a4;
                }
            }
            else
            {
LABEL_a5d8a4:
                v8 = a0->field_0;
                if (!(v8 >> 11 & 1))
                {
                    if ((unsigned int)v8 & 49648)
                    {
                        v9 = a0->field_28;
                        if (!v9 || !(*(st_a5d7bc_0 **)(idx + 40) = v9, !sub_a382a4(v9)))
                        {
                            if (!*(long long *)&a0->padding_30[0])
                                goto LABEL_a5d9dc;
                            if (a0->field_28)
                            {
                                if (a0->field_28->field_d8)
                                    a0->field_28->field_d8();
                                if (!*(long long *)(idx + 48))
                                {
                                    sub_a5ed84(*(long long *)(idx + 40));
                                    goto LABEL_a5da98;
                                }
                                else
                                {
                                    return idx;
                                }
                                goto LABEL_a5da98;
                            }
                        }
                    }
                    else
                    {
                        if ((unsigned int)v8 & 0x600)
                        {
                            v10 = a0->field_28;
                            if (!v10 || !(*(st_a5d7bc_0 **)(idx + 40) = v10, !sub_a382a4(v10)))
                            {
                                if (!*(long long *)&a0->padding_30[0])
                                    goto LABEL_a5d9dc;
                                if (a0->field_28)
                                {
                                    if (a0->field_28->field_58)
                                        a0->field_28->field_58();
                                    if (!*(long long *)(idx + 48))
                                    {
                                        sub_a38220(*(long long *)(idx + 40));
                                        goto LABEL_a5da98;
                                    }
                                    else
                                    {
                                        return idx;
                                    }
                                    goto LABEL_a5da98;
                                }
                            }
                        }
                        else
                        {
                            if ((unsigned int)v8 & 0x3000)
                            {
                                v11 = a0->field_28;
                                if (!v11 || !(*(st_a5d7bc_0 **)(idx + 40) = v11, !sub_a382a4(v11)))
                                {
                                    if (!*(long long *)&a0->padding_30[0])
                                        goto LABEL_a5d9dc;
                                    if (a0->field_28)
                                    {
                                        if (a0->field_28->field_58)
                                            a0->field_28->field_58();
                                        if (!*(long long *)(idx + 48))
                                            sub_a5431c(*(long long *)(idx + 40));
                                        else
                                            return idx;
LABEL_a5da98:
                                        *(unsigned long long *)(idx + 40) = 0;
                                    }
                                }
                            }
                            else
                            {
                                if (!((unsigned int)v8 & 6))
                                {
LABEL_a5d9dc:
                                    v13 = (st_a5d7bc_2 *)*(int128_t *)&a0->field_78;
                                    *(uint128_t *)(idx + 120) = (uint128_t)v13;
                                    if (a0[1].padding_10)
                                    {
                                        if (sub_a5bba8(a0[1].padding_10))
                                        {
                                            v14 = (unsigned int)a0[1].padding_10;
                                            v15 = a0->field_78;
                                            goto LABEL_a5da08;
                                        }
                                    }
                                    else
                                    {
                                        v14 = 0;
                                        v15 = (unsigned long long)v13;
LABEL_a5da08:
                                        *(unsigned long long *)(idx + 144) = v14;
                                        if (v15)
                                            v15->field_10();
                                        if (!*(int *)idx)
                                        {
                                            v0 = (unsigned int)a0->padding_20;
                                            if (!a0[1].field_8)
                                                return idx;
                                            if (sub_a5a1f8(a0[1].field_8, a0->field_8, &v0, a0->padding_10) && sub_a2d050(v0))
                                            {
                                                sub_a55830(*(long long *)(idx + 32));
                                                *(unsigned long long *)(idx + 32) = v0;
                                                return idx;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else
                {
                    v12 = a0->field_28;
                    if (!v12 || !(*(st_a5d7bc_0 **)(idx + 40) = v12, !sub_a382a4(v12)))
                    {
                        if (!*(long long *)&a0->padding_30[0])
                            goto LABEL_a5d9dc;
                        if (a0->field_28)
                        {
                            if (a0->field_28->field_50)
                                a0->field_28->field_50();
                            if (!*(long long *)(idx + 48))
                            {
                                sub_a52760(*(long long *)(idx + 40));
                                goto LABEL_a5da98;
                            }
                            else
                            {
                                return idx;
                            }
                            goto LABEL_a5da98;
                        }
                    }
                }
            }
        }
    }
    else if (sub_a5bba8(a0[1].field_8))
    {
        v4 = a0[1].field_8;
        goto LABEL_a5d84c;
    }
    *(unsigned long long *)(idx + 120) = 0;
    sub_a5d6b0(idx);
    return 0;
}
