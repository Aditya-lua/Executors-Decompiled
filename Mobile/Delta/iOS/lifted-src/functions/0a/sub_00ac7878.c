/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac7878..0xac7fb4 (1852 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac7878_0 {
    char padding_0[16];
    uint128_t field_10;
} st_ac7878_0;

extern long long g_eb4120;

unsigned long long sub_ac7878(long long a0, long long a1, unsigned long a2, long long a3, void* a4, unsigned long long *a5)
{
    long long v14;  // x23
    unsigned int v15;  // w0
    unsigned long long v24;  // x22
    unsigned long long v25;  // x25
    unsigned long long v26;  // x25
    long long v27;  // x26
    long long v28;  // x27
    unsigned long long v29;  // x0
    unsigned long long v30;  // x25
    unsigned long v31;  // x20
    unsigned long long v32;  // x0
    unsigned long long v33;  // x20
    unsigned long long v16;  // 4132
    unsigned long long v34;  // x8
    unsigned long long v35;  // x9
    unsigned long long v36;  // w10
    uint128_t *iter;  // x10
    unsigned long long v38;  // q0
    unsigned long long v39;  // q1
    unsigned long long i;  // x11
    unsigned long long v41;  // x11
    uint128_t v43;  // q0
    unsigned long v17;  // x8
    unsigned long v45;  // d0
    unsigned long long v46;  // x10
    unsigned long long v47;  // x11
    uint128_t v48;  // q0
    double *v49;  // x10
    unsigned long long v50;  // x11
    double *v51;  // x10
    unsigned long long v53;  // 4114
    unsigned long long v18;  // x25
    unsigned long long v54;  // x10
    unsigned long long j;  // x11
    char *v56;  // x9
    unsigned long long v57;  // x11
    char *v58;  // x9
    unsigned long long v60;  // x9
    uint128_t *iter1;  // x10
    uint128_t *iter2;  // x11
    uint128_t *node;  // x12
    unsigned long long v19;  // w20
    unsigned long long l;  // x13
    unsigned long long v65;  // x13
    uint128_t v66;  // q1
    uint128_t v67;  // q3
    unsigned long long v69;  // x13
    double *v70;  // x10
    double *v71;  // x11
    void* v72;  // x12
    unsigned long long v73;  // x13
    long long v20;  // x19
    double *v74;  // x10
    double *v75;  // x11
    unsigned long v76;  // d0
    unsigned long long v78;  // 4120
    void* v79;  // x10
    char *v80;  // x11
    char *v81;  // x12
    unsigned long long k;  // x8
    unsigned long long v83;  // x8
    long long v21;  // x0
    char *v84;  // x12
    char *v85;  // x11
    unsigned long long v87;  // x19
    unsigned long long idx;  // x21
    unsigned long long v23;  // x28
    unsigned long v0;  // [bp-0xd8]
    unsigned long long v1;  // [bp-0xd0]
    unsigned long long v2;  // [bp-0xc8]
    unsigned long long v3;  // [bp-0xc0]
    long long v4;  // [bp-0xb8]
    st_ac7878_0 *v5;  // [bp-0xb0]
    long long v6;  // [bp-0xa4], Other Possible Types: unsigned int
    unsigned long long v7;  // [bp-0x98]
    unsigned long long v8;  // [bp-0x90]
    unsigned long long v9;  // [bp-0x88]
    unsigned long long v10;  // [bp-0x78]
    unsigned long v11;  // [bp-0x68]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = a2;
    v14 = sub_9ffdd0();
    if (sub_975ffc(v14))
    {
        v15 = sub_9e46a8();
        v16 = arm64g_calculate_condition(177, v15, 7, 0);
        v17 = (v16 & 1 ? v15 + 14 : v15 + 7);
        v18 = (long long)(v17 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v17, 61) & 0xe00000001fffffff & 0x1fffffff;
    }
    else
    {
        v18 = 0;
    }
    v19 = (unsigned int)sub_a50ac8(a1);
    v20 = sub_a19700(a0);
    v21 = sub_a19708(a0);
    idx = 0;
    if (!v18)
    {
        v23 = 0;
        v8 = 0;
        v9 = 0;
        v24 = 0;
        v10 = 0;
        v25 = 0;
        goto LABEL_ac7a20;
    }
    v7 = v18;
    v23 = 0;
    v8 = 0;
    v9 = 0;
    v24 = 0;
    v10 = 0;
    v25 = 0;
    if (v19 < 1)
        goto LABEL_ac7a20;
    _memset(a4, 0xff, *a5);
    idx = sub_9cae2c(0, &v11, a3, &g_eb4120);
    if (!idx)
    {
        v23 = 0;
        v8 = 0;
        v9 = 0;
        v24 = 0;
        v10 = 0;
        v25 = 0;
        v27 = 100;
        v28 = 320;
        goto LABEL_ac79f4;
    }
    if (*(int *)*(long long *)(idx + 16) != v19)
    {
        v23 = 0;
        v8 = 0;
        v9 = 0;
        v24 = 0;
        v10 = 0;
        v25 = 0;
        v27 = 104;
        v28 = 325;
        goto LABEL_ac79f4;
    }
    v26 = *(int *)*(long long *)(idx + 24);
    if (v26 > *a5)
    {
        v23 = 0;
        v8 = 0;
        v9 = 0;
        v24 = 0;
        v10 = 0;
        v25 = 0;
        v27 = 107;
        v28 = 333;
        goto LABEL_ac79f4;
    }
    v5 = *(long long *)(*(long long *)(idx + 24) + 8);
    v24 = sub_9dddcc(v20);
    v6 = 524291;
    if (!v24)
    {
        v23 = 0;
        v8 = 0;
        v9 = 0;
        v10 = 0;
        v25 = 0;
        v28 = 339;
        v27 = v6;
        goto LABEL_ac79f4;
    }
    sub_9de064(v24);
    v4 = sub_9de208(v24);
    v29 = sub_9de208(v24);
    if (!v29)
    {
        v23 = 0;
        v8 = 0;
        v9 = 0;
        v10 = 0;
        v25 = 0;
        v28 = 348;
        v27 = v6;
        goto LABEL_ac79f4;
    }
    v2 = v26;
    v3 = v29;
    v0 = *(long long *)(*(long long *)(idx + 16) + 8);
    v30 = sub_a6bffc(v26, "crypto/sm2/sm2_crypt.c", 352);
    v1 = v7 * 2;
    v23 = sub_a6bffc(v1, "crypto/sm2/sm2_crypt.c", 353);
    v31 = v19;
    v10 = v30;
    v9 = sub_a6bffc(v31, "crypto/sm2/sm2_crypt.c", 354);
    if (!v30 || !v23 || !v9)
    {
        v8 = 0;
        v25 = 0;
LABEL_ac7a20:
        _bzero(a4, *a5);
        v87 = 0;
        goto LABEL_ac7a34;
    }
    v32 = sub_a1a56c(v14);
    v6 = 524304;
    if (!v32)
    {
        v8 = 0;
        v25 = 0;
        v28 = 361;
        v27 = v6;
        goto LABEL_ac79f4;
    }
    v8 = v32;
    if (!sub_a1b250(v14, v8, *(long long *)idx, *(long long *)(idx + 8), v24))
    {
        v25 = 0;
        v28 = 370;
        v27 = v6;
        goto LABEL_ac79f4;
    }
    v27 = 524304;
    if (!sub_a1b804(v14, v8, 0, v8, sub_962b90(a0), v24) || !sub_a1b3cc(v14, v8, v4, v3, v24))
    {
        v25 = 0;
        v28 = 370;
        goto LABEL_ac79f4;
    }
    v27 = 786691;
    if (sub_9e5174(v4, v23, v7) >> 31 & 1 || sub_9e5174(v3, v23 + v7, v7) >> 31 & 1 || (v33 = v2, !sub_a1e7f4(v10, v33, v23, v1, 0, 0, a1, v20, v21)))
    {
        v25 = 0;
        v28 = 378;
        goto LABEL_ac79f4;
    }
    v34 = v33 & 0xffffffff;
    if ((unsigned int)v34)
    {
        if (8 > (unsigned int)v33)
        {
            v35 = 0;
            v36 = 0;
        }
        else if (32 > (unsigned int)v34)
        {
            v36 = 0;
            v35 = 0;
LABEL_ac7d70:
            v47 = v35;
            v35 = v33 & 0xfffffffffffffff8;
            v48 = (char)v36;
            v49 = v10 + v47;
            v50 = v47 - v35;
            do
            {
                v51 = v49 + 1;
                v48 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*v49 | v48);
                v53 = arm64g_calculate_condition(18, v50, 8, 0);
                v49 = v51;
                v50 += 8;
            } while (v53 & 1);
            v54 = *(unsigned long long *)&*(unsigned long long *)(void*)&v48 | *(unsigned long long *)&*(unsigned long long *)(void*)&v48 >> 32 | (*(unsigned long long *)&*(unsigned long long *)(void*)&v48 | *(unsigned long long *)&*(unsigned long long *)(void*)&v48 >> 32) >> 16;
            v36 = (unsigned int)v54 | (unsigned int)(v54 >> 8);
            if (v35 == v33)
                goto LABEL_ac7dd4;
        }
        else
        {
            v35 = v33 & 0xffffffffffffffe0;
            iter = v10 + 16;
            v38 = 0;
            v39 = 0;
            i = v35;
            do
            {
                v41 = i;
                v38 |= *(int128_t *)((char *)iter - 16);
                v39 |= *iter;
                iter += 2;
                i = v41 - 32;
            } while (i);
            v43 = v39 | v38;
            v45 = __dirty_unsupported_Iop_ZeroHI64ofV128(v43 | __dirty_unsupported_Iop_SliceV128(v43, v43, 8));
            v46 = __double_as_longlong(v45) | __double_as_longlong(v45) >> 32 | (__double_as_longlong(v45) | __double_as_longlong(v45) >> 32) >> 16;
            v36 = (unsigned int)v46 | (unsigned int)(v46 >> 8);
            if (v35 == v33)
                goto LABEL_ac7dd4;
            if (v33 & 24)
                goto LABEL_ac7d70;
        }
        j = v33 - v35;
        v56 = v10 + v35;
        do
        {
            v57 = j;
            v58 = v56 + 1;
            v36 |= *v56;
            v56 = v58;
            j = v57 - 1;
        } while (j);
LABEL_ac7dd4:
        if (!(v36 & 0xff))
            goto LABEL_ac7ea4;
        if (8 > (unsigned int)v34)
        {
            v60 = 0;
        }
        else
        {
            v60 = 0;
            if (a4 - v5 >= 32 && a4 - v10 >= 32)
            {
                if (32 > (unsigned int)v2)
                {
                    v60 = 0;
LABEL_ac7f5c:
                    v69 = v60;
                    v60 = v34 & 0xfffffff8;
                    v70 = &v5->padding_0[v69];
                    v71 = v10 + v69;
                    v72 = a4 + v69;
                    v73 = v69 - v60;
                    do
                    {
                        v74 = v70 + 1;
                        v75 = v71 + 1;
                        v76 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*v70 ^ *(unsigned long long *)&*v71);
                        *(unsigned long *)v72 = v76;
                        v72 += 8;
                        v78 = arm64g_calculate_condition(18, v73, 8, 0);
                        v70 = v74;
                        v71 = v75;
                        v73 += 8;
                    } while (v78 & 1);
                    if (v60 == v34)
                        goto LABEL_ac7e18;
                }
                else
                {
                    v60 = v34 & 0xffffffe0;
                    iter1 = &v5->field_10;
                    iter2 = v10 + 16;
                    node = a4 + 16;
                    l = v60;
                    do
                    {
                        v65 = l;
                        v66 = *iter1;
                        v67 = *iter2;
                        *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)iter1 - 16) ^ *(int128_t *)((char *)iter2 - 16);
                        *node = v66 ^ v67;
                        iter1 += 2;
                        iter2 += 2;
                        node += 2;
                        l = v65 - 32;
                    } while (l);
                    if (v60 == v34)
                        goto LABEL_ac7e18;
                    if (v34 & 24)
                        goto LABEL_ac7f5c;
                }
            }
        }
        v79 = a4 + v60;
        v80 = v10 + v60;
        v81 = &v5->padding_0[v60];
        k = v34 - v60;
        do
        {
            v83 = k;
            v84 = v81 + 1;
            v85 = v80 + 1;
            *(char *)v79 = *v80 ^ *v81;
            v79 += 1;
            k = v83 - 1;
            v80 = v85;
            v81 = v84;
        } while (k);
LABEL_ac7e18:
        v25 = sub_a3f728();
        if (v25)
        {
            if (!sub_a3fd98(v25, a1) || !sub_a3fe10(v25, v23, v7) || !sub_a3fe10(v25, a4, v2) || !sub_a3fe10(v25, v23 + v7, v7) || !sub_a3ff18(v25, v9, 0))
            {
                v28 = 401;
                goto LABEL_ac7efc;
            }
            if (sub_a66f20(v9, v0, v31))
            {
                v27 = 0x66;
                v28 = 406;
                goto LABEL_ac79f4;
            }
            else
            {
                *a5 = v2;
                v87 = 1;
            }
        }
        else
        {
            v28 = 392;
LABEL_ac7efc:
            v27 = 524294;
LABEL_ac79f4:
            sub_a368c8();
            sub_a369bc("crypto/sm2/sm2_crypt.c", v28, "ossl_sm2_decrypt");
            sub_a36abc(53, v27, 0);
            goto LABEL_ac7a20;
        }
    }
    else
    {
LABEL_ac7ea4:
        v25 = 0;
        v27 = 104;
        v28 = 383;
        goto LABEL_ac79f4;
    }
LABEL_ac7a34:
    sub_a6c2e4(v10, "crypto/sm2/sm2_crypt.c", 417);
    sub_a6c2e4(v23, "crypto/sm2/sm2_crypt.c", 418);
    sub_a6c2e4(v9, "crypto/sm2/sm2_crypt.c", 419);
    sub_a1a254(v8);
    sub_9de17c(v24);
    sub_9dded4(v24);
    sub_9cd960(idx, &g_eb4120);
    sub_a3f73c(v25);
    return v87;
}
