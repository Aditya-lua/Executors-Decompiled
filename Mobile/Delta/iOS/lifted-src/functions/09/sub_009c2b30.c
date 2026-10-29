/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c2b30..0x9c3058 (1320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

char * sub_9c2b30(char *a0, char *a1, char *a2, char *a3)
{
    char *len;  // x27
    unsigned long long v12;  // 4116
    char *v21;  // x28
    char *v22;  // w25
    char *v23;  // x8
    char *i;  // w21
    unsigned int v25;  // w20
    unsigned long v26;  // x20
    unsigned int v27;  // w0
    char *v28;  // w21
    char *v29;  // x9
    char *v30;  // x20
    unsigned int v13;  // w26
    unsigned long long v31;  // x0
    unsigned long long v32;  // 4106
    unsigned long long j;  // x28
    char *v35;  // x8
    unsigned long v36;  // x11
    char *v37;  // x8
    uint128_t *v38;  // x12
    char *v39;  // x9
    char *v40;  // x10
    long long v14;  // x1
    char *v41;  // x27
    uint128_t *iter;  // x11
    uint128_t *v43;  // x12
    char *l;  // x13
    uint128_t v45;  // q0
    uint128_t v46;  // q0
    uint128_t v47;  // q1
    uint128_t v48;  // q1
    char *k;  // x8
    char *v50;  // x12
    char *v15;  // w20
    long long v51;  // x21
    long long v52;  // x22
    char *v16;  // x19
    unsigned long v17;  // x24
    char *v18;  // x23
    uint128_t v19;  // q2
    char *v20;  // x25
    char *v0;  // [bp-0xb4]
    unsigned long v1;  // [bp-0xb0]
    unsigned long v2;  // [bp-0xa8]
    unsigned long v3;  // [bp-0xa0]
    char *v4;  // [bp-0x94]
    unsigned long long v5;  // [bp-0x90]
    char *v6;  // [bp-0x88]
    char v7;  // [bp-0x80]
    unsigned long v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    len = a3;
    v8 = *(long long *)&g_10002b0;
    if ((unsigned int)a3)
    {
        v12 = arm64g_calculate_condition(0x11, len & 0xffffffff, 1, 0);
        if (!(v12 & 1))
            len = _strlen(a2);
        v13 = *a2;
        if (2 >= v13 - 48)
        {
            if (2 > (int)(unsigned int)len)
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/a_object.c", 76, "a2d_ASN1_OBJECT");
                v14 = 138;
LABEL_9c2bf4:
                sub_a36abc(13, v14, 0);
LABEL_9c2bfc:
                v16 = 0;
            }
            else
            {
                v15 = (char *)((unsigned int)len - 2);
                if ((unsigned int)len == 2)
                    goto LABEL_9c2bfc;
                v4 = a1;
                v16 = 0;
                len = 0;
                v17 = a2[1];
                v18 = a2 + 2;
                v3 = 0xfffff880 + 40 * v13;
                v1 = a0 + 16;
                v2 = a0 - 1;
                v5 = 24;
                v19 = CONCAT(0x8080808080808080, 0x8080808080808080);
                v20 = &v7;
                do
                {
                    if ((unsigned int)v17 == 46 || (unsigned int)v17 == 32)
                    {
                        v6 = v20;
                        v21 = 0;
                        v22 = (char *)0;
                        v23 = v18 + 1;
                        i = v15 + 1;
                        do
                        {
                            v18 = v23;
                            v25 = *(v23 - 1);
                            v17 = (char)v25;
                            if (v25 == 32 || v25 == 46)
                            {
                                v15 = i - 2;
                                goto LABEL_9c2d74;
                            }
                            if (!sub_a69974(v17))
                            {
                                v51 = 130;
                                v52 = 98;
                                goto LABEL_9c2fb8;
                            }
                            v26 = (char)v25;
                            if (!v22 && v21 >= 0x1999999999999991)
                            {
                                if (v16 || (v16 = sub_9e4958(), v16))
                                {
                                    if (sub_9e4d58(v16, v21))
                                    {
                                        v22 = (char *)1;
                                        goto LABEL_9c2d24;
                                    }
                                }
LABEL_9c2fa8:
                                v20 = v6;
                                goto LABEL_9c2fe8;
                            }
                            else if (v22)
                            {
LABEL_9c2d24:
                                if (!sub_9ebbfc(v16, 10) || !sub_9eb9e0(v16, v26 - 48))
                                    goto LABEL_9c2fa8;
                                continue;
                            }
                            else
                            {
                                v21 = v26 + 10 * v21 - 48;
                            }
                            v23 = v18 + 1;
                            i -= 1;
                            v19 = CONCAT(0x8080808080808080, 0x8080808080808080);
                        } while (2 <= i);
                        v15 = (char *)0;
LABEL_9c2d74:
                        if ((unsigned int)len)
                        {
                            if (!v22)
                                goto LABEL_9c2e88;
                            goto LABEL_9c2da4;
                        }
                        if (49 >= v13 && 39 < v21)
                        {
                            v51 = 147;
                            v52 = 117;
LABEL_9c2fb8:
                            v20 = v6;
                            goto LABEL_9c2fbc;
                        }
                        if (v22)
                        {
                            if (!sub_9eb9e0(v16, v3))
                                goto LABEL_9c2fa8;
LABEL_9c2da4:
                            v27 = sub_9e46a8(v16);
                            v28 = (char *)(((int)(((v27 + 6) * -1840700269 >> 32) + v27 + 6) >> 2) + (((v27 + 6) * -1840700269 >> 32) + v27 + 6 >> 31));
                            if (v28 > (int)v5)
                            {
                                v0 = v15;
                                if (v6 != &v7)
                                    sub_a6c2e4(v6, "crypto/asn1/a_object.c", 133);
                                v5 = v28 + 32;
                                v20 = sub_a6bf4c(v5, "crypto/asn1/a_object.c", 135);
                                if (!v20)
                                    goto LABEL_9c2ff4;
                                v15 = v0;
                            }
                            else
                            {
                                v20 = v6;
                            }
                            if (13 > v27 + 12)
                            {
                                v29 = 0;
                                v19 = CONCAT(0x8080808080808080, 0x8080808080808080);
                                goto LABEL_9c2eac;
                            }
                            else
                            {
                                v30 = 0;
                                while (1)
                                {
                                    v31 = sub_9eb8c0(v16, 128);
                                    v32 = arm64g_calculate_condition(2, v31, 1, 0);
                                    if (v32 & 1)
                                        break;
                                    v29 = v30 + 1;
                                    *(char *)(v20 + v30) = v31;
                                    v30 = v29;
                                    if (v28 == (unsigned int)v29)
                                    {
                                        v19 = CONCAT(0x8080808080808080, 0x8080808080808080);
                                        goto LABEL_9c2eac;
                                    }
                                }
                                goto LABEL_9c2fe8;
                            }
                        }
                        v21 = &v21[v3];
LABEL_9c2e88:
                        v29 = 0;
                        v20 = v6;
                        do
                        {
                            j = v21;
                            *(char *)(v20 + v29) = (char)j & 127;
                            v29 += 1;
                            v21 = j >> 7;
                        } while (127 < j);
LABEL_9c2eac:
                        v35 = v29 + len;
                        if (a0)
                        {
                            if (v4 >= (int)(unsigned int)v35)
                            {
                                if ((int)(unsigned int)v29 >= 2)
                                {
                                    v36 = (unsigned int)len;
                                    v37 = v29 & 0xffffffff;
                                    if ((unsigned int)v29 < 33 || (v38 = v20 + v37, v38 > &a0[v36] && &v37[v36 + v2] > v20 + 1))
                                    {
                                        v41 = v36;
                                    }
                                    else
                                    {
                                        v39 = v37 - 1;
                                        v40 = v39 & 0xffffffffffffffe0;
                                        v37 -= v40;
                                        v41 = &v40[v36];
                                        iter = v1 + v36;
                                        v43 = (char *)v38 - 16;
                                        l = v40;
                                        do
                                        {
                                            v45 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v43 | v19);
                                            v46 = __dirty_unsupported_Iop_SliceV128(v45, v45, 8);
                                            v47 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*(int128_t *)((char *)v43 - 16) | v19);
                                            v48 = __dirty_unsupported_Iop_SliceV128(v47, v47, 8);
                                            *(uint128_t *)((char *)iter - 16) = v46;
                                            *iter = v48;
                                            iter += 2;
                                            v43 = (char *)v43 - 32;
                                            l -= 32;
                                        } while (l);
                                        len = v41;
                                        if (v39 == v40)
                                            goto LABEL_9c2f30;
                                    }
                                    do
                                    {
                                        k = v37;
                                        v50 = k - 1;
                                        len = v41 + 1;
                                        *(char *)(a0 + v41) = *(char *)(v20 - 1 + k) | 128;
                                        v37 = v50;
                                        v41 = len;
                                    } while (2 < k);
                                }
LABEL_9c2f30:
                                a0[(unsigned int)len] = *v20;
                                v35 = (unsigned int)len + 1;
                                goto LABEL_9c2f3c;
                            }
                            else
                            {
                                v51 = 107;
                                v52 = 156;
                                goto LABEL_9c2fbc;
                            }
                            goto LABEL_9c2fbc;
                        }
                    }
                    else
                    {
                        v51 = 131;
                        v52 = 0x55;
LABEL_9c2fbc:
                        sub_a368c8();
                        sub_a369bc("crypto/asn1/a_object.c", v52, "a2d_ASN1_OBJECT");
                        sub_a36abc(13, v51, 0);
LABEL_9c2fe8:
                        if (v20 != &v7)
                        {
LABEL_9c2ff4:
                            sub_a6c2e4(v20, "crypto/asn1/a_object.c", 171);
                            goto LABEL_9c2c00;
                        }
                    }
LABEL_9c2f3c:
                } while ((len = v35, 0 < v15));
                if (v20 != &v7)
                {
                    sub_a6c2e4(v20, "crypto/asn1/a_object.c", 166);
                    goto LABEL_9c2c04;
                }
            }
LABEL_9c2c00:
            len = 0;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/a_object.c", 71, "a2d_ASN1_OBJECT");
            v14 = 122;
            goto LABEL_9c2bf4;
        }
LABEL_9c2c04:
        sub_9e48d4(v16);
    }
    if (*(long long *)&g_10002b0 == v8)
        return len;
    ___stack_chk_fail();
}
