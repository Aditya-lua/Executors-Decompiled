/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa40520..0xa40a34 (1300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a40520_0 {
    char padding_0[184];
    struct st_a40520_1 *field_b8;
    struct st_a40520_1 *field_c0;
} st_a40520_0;

typedef struct st_a40520_1 {
    char field_0;
} st_a40520_1;


int sub_a40520(char idx, void* a1)
{
    st_a40520_0 *v2;  // x8
    char v3;  // x9
    uint128_t v12;  // q1
    uint128_t v13;  // q2
    char v14;  // w8
    char v15;  // x0
    char v16;  // x0
    char v17;  // x0
    char v18;  // w8
    unsigned long long v19;  // 4102
    uint128_t v20;  // q0
    uint128_t v21;  // q1
    char v4;  // w8
    uint128_t v22;  // q2
    char v23;  // x0
    unsigned long long v5;  // 4102
    char v6;  // x8
    uint128_t v7;  // q0
    uint128_t v8;  // q1
    long long v9;  // x1
    char v10;  // x21
    uint128_t v11;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = (long long)a1[8];
        if (!v2)
        {
            if (idx)
            {
                if (!sub_a50db0(idx, 0x400))
                {
                    sub_a5d6b0(*(long long *)(idx + 40));
                    *(unsigned long long *)(idx + 40) = 0;
                }
                sub_a3f3d0(idx, 0, 0);
                sub_a66ec0(idx, 72);
            }
            if (*(long long *)(idx + 64) && !*(int *)(*(long long *)(idx + 64) + 24))
            {
                do
                {
                    /* unsupported instruction */;
                    v18 = /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v19 = arm64g_calculate_condition(19, v18, 1, 0);
                if (!(v19 & 1))
                {
                    /* unsupported instruction */;
                }
                else if (1 < v18)
                {
                    goto LABEL_a40908;
                }
                sub_a50b58();
            }
LABEL_a40908:
            *(int128_t *)idx = *(int128_t *)a1;
            v20 = (int128_t)a1[16];
            v21 = (int128_t)a1[32];
            v22 = (int128_t)a1[48];
            *(long long *)(idx + 64) = (long long)a1[64];
            *(uint128_t *)(idx + 32) = v21;
            *(uint128_t *)(idx + 48) = v22;
            *(uint128_t *)(idx + 16) = v20;
LABEL_a40928:
            sub_a50dd0(idx, 0x400);
            if (!(long long)a1[40] || !(v23 = sub_a5d7bc((long long)a1[40]), *(unsigned long long *)(idx + 40) = v23, !v23))
                return 1;
            sub_a368c8();
            sub_a369bc("crypto/evp/digest.c", 660, "EVP_MD_CTX_copy_ex");
            sub_a36abc(6, 190, 0);
LABEL_a40988:
            if (!sub_a50db0(idx, 0x400))
            {
                sub_a5d6b0(*(long long *)(idx + 40));
                *(unsigned long long *)(idx + 40) = 0;
            }
            sub_a3f3d0(idx, 0, 0);
            sub_a66ec0(idx, 72);
            return 0;
            return 1;
        }
        if (*(long long *)&v2->padding_0[112] && !((char)a1[25] & 1))
        {
            if (v2->field_c0)
            {
                if (*(long long *)(idx + 8) == v2 && v2->field_b8)
                    v2->field_b8();
                if (!sub_a50db0(idx, 0x400))
                {
                    sub_a5d6b0(*(long long *)(idx + 40));
                    *(unsigned long long *)(idx + 40) = 0;
                }
                if (*(long long *)(idx + 56))
                {
                    if (*(long long *)(idx + 8) && *(long long *)(*(long long *)(idx + 8) + 176))
                        (*(long long *)(*(long long *)(idx + 8) + 176))();
                    *(unsigned long long *)(idx + 56) = 0;
                    sub_a50dbc(idx, 2);
                }
                if (*(long long *)(idx + 8))
                {
                    if (*(long long *)(*(long long *)(idx + 8) + 64) && !sub_a50db0(idx, 2))
                        (*(long long *)(*(long long *)(idx + 8) + 64))();
                    if (*(long long *)(idx + 32) && *(int *)(*(long long *)(idx + 8) + 76) >= 1 && !sub_a50db0(idx, 4))
                    {
                        sub_a6c4e8(*(long long *)(idx + 32), *(int *)(*(long long *)(idx + 8) + 76), "crypto/evp/digest.c", 38);
                        *(unsigned long long *)(idx + 32) = 0;
                    }
                }
                sub_a32e7c(*(long long *)(idx + 16));
                *(unsigned long long *)(idx + 16) = 0;
                v3 = (long long)a1[64];
                if (*(long long *)(idx + 64) != v3 && v3 && !*(int *)(v3 + 24))
                {
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                }
                if (*(long long *)(idx + 64) != v3 && *(long long *)(idx + 64) && !*(int *)(*(long long *)(idx + 64) + 24))
                {
                    do
                    {
                        /* unsupported instruction */;
                        v4 = /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v5 = arm64g_calculate_condition(19, v4, 1, 0);
                    if (!(v5 & 1))
                    {
                        /* unsupported instruction */;
                    }
                    else if (1 < v4)
                    {
                        goto LABEL_a409d0;
                    }
                    sub_a50b58();
                }
LABEL_a409d0:
                v6 = (long long)a1[64];
                v7 = (int128_t)a1[48];
                v8 = (int128_t)a1[16];
                *(int128_t *)(idx + 32) = (int128_t)a1[32];
                *(uint128_t *)(idx + 48) = v7;
                *(int128_t *)idx = *(int128_t *)a1;
                *(uint128_t *)(idx + 16) = v8;
                *(unsigned long long *)(idx + 40) = 0;
                *(unsigned long long *)(idx + 56) = 0;
                *(unsigned long long *)(idx + 64) = v6;
                if ((long long)a1[56])
                    (*(long long *)((long long)a1[8] + 192))();
                goto LABEL_a40928;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/digest.c", 616, "EVP_MD_CTX_copy_ex");
                v9 = 190;
            }
        }
        else
        {
            if (!(long long)a1[16])
            {
LABEL_a406e8:
                if (*(long long *)(idx + 8) != v2)
                {
                    v10 = 0;
                }
                else
                {
                    v10 = *(long long *)(idx + 32);
                    sub_a50dbc(idx, 4);
                }
                if (!sub_a50db0(idx, 0x400))
                {
                    sub_a5d6b0(*(long long *)(idx + 40));
                    *(unsigned long long *)(idx + 40) = 0;
                }
                sub_a3f3d0(idx, 0, 0);
                sub_a66ec0(idx, 72);
                *(int128_t *)idx = *(int128_t *)a1;
                v11 = (int128_t)a1[16];
                v12 = (int128_t)a1[32];
                v13 = (int128_t)a1[48];
                *(long long *)(idx + 64) = (long long)a1[64];
                *(uint128_t *)(idx + 32) = v12;
                *(uint128_t *)(idx + 48) = v13;
                *(uint128_t *)(idx + 16) = v11;
                sub_a50dd0(idx, 0x400);
                *(unsigned long long *)(idx + 32) = 0;
                *(unsigned long long *)(idx + 40) = 0;
                if ((long long)a1[32])
                {
                    v14 = *(int *)(*(long long *)(idx + 8) + 76);
                    if (v14)
                    {
                        if (v10)
                        {
                            *(unsigned long long *)(idx + 32) = v10;
                        }
                        else
                        {
                            v15 = sub_a6bf4c(v14, "crypto/evp/digest.c", 701);
                            *(unsigned long long *)(idx + 32) = v15;
                            if (!v15)
                                return *(unsigned int *)&v15;
                            v10 = v15;
                            v14 = *(int *)(*(long long *)(idx + 8) + 76);
                        }
                        _memcpy(v10, (long long)a1[32], v14);
                    }
                }
                v16 = (long long)a1[40];
                *(long long *)(idx + 48) = (long long)a1[48];
                if (v16 && !(v17 = sub_a5d7bc(v16), *(unsigned long long *)(idx + 40) = v17, v17))
                    goto LABEL_a40988;
                if (*(long long *)(*(long long *)(idx + 8) + 56))
                    goto *((void *)(*(long long *)(*(long long *)(idx + 8) + 56)));
            }
            else if (sub_a32d54((long long)a1[16]))
            {
                v2 = (long long)a1[8];
                goto LABEL_a406e8;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/digest.c", 674, "EVP_MD_CTX_copy_ex");
                v9 = 524326;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/digest.c", 598, "EVP_MD_CTX_copy_ex");
        v9 = 786690;
    }
    sub_a36abc(6, v9, 0);
    return 0;
}
