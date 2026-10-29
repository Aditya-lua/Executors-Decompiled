/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab5a18..0xab5dfc (996 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab5a18_0 {
    char padding_0[11];
    uint128_t field_b;
    uint128_t field_1b;
} st_ab5a18_0;


unsigned int sub_ab5a18(char *a0, unsigned long long a1, unsigned long a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    unsigned long long v21;  // x0
    unsigned long long v22;  // x14
    void* v23;  // x0
    unsigned long long v24;  // x11
    char *node;  // x13
    void* v26;  // x16
    void* v27;  // x1
    void* v28;  // x0
    unsigned long long v29;  // x17
    void* v30;  // x9
    unsigned long long v13;  // x24
    void* v31;  // x12
    unsigned long v32;  // x14
    char v33;  // x2
    unsigned long long v34;  // w13
    unsigned long long v35;  // w14
    unsigned long long v36;  // x16
    char *iter;  // x11
    int v38;  // w1
    unsigned int v39;  // w21
    unsigned long long v40;  // w22
    unsigned long long v14;  // x23
    unsigned long long v41;  // w15
    int v42;  // w14
    unsigned long long j;  // x14
    unsigned long long v44;  // x8
    unsigned long long v45;  // x17
    unsigned long long v46;  // x6
    unsigned long long v47;  // w4
    char v48;  // x3
    unsigned long v49;  // x5
    unsigned long long v50;  // x7
    unsigned long long v15;  // x22
    void* v51;  // x20
    unsigned long long v52;  // x20
    uint128_t v53;  // q0
    uint128_t v54;  // q1
    unsigned long long l;  // x24
    void* iter1;  // x23
    unsigned long long v57;  // x24
    st_ab5a18_0 *v58;  // x25
    uint128_t v59;  // q3
    uint128_t v60;  // q5
    unsigned long long v16;  // x21
    unsigned long long v62;  // x24
    unsigned long long v63;  // x23
    unsigned long long *iter2;  // x25
    unsigned long long v65;  // x20
    uint128_t v66;  // q2
    uint128_t v67;  // q3
    unsigned long long v70;  // 4133
    unsigned long long v17;  // x20
    char *v71;  // x7
    unsigned long long k;  // x6
    unsigned long long v73;  // x6
    unsigned int v75;  // w10
    unsigned long long v76;  // x14
    void* v77;  // x9
    unsigned int v80;  // w0
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    unsigned long long i;  // x19
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (a1 < 1)
    {
        return 0xffffffff;
    }
    else if ((int)a3 >= 1)
    {
        v0 = v11;
        v1 = v12;
        v2 = v13;
        v3 = v14;
        v4 = v15;
        v5 = v16;
        v6 = v17;
        v7 = v18;
        v8 = &v10;
        v9 = v19;
        if ((int)a4 >= (int)a3 && (int)a4 > 10)
        {
            i = a4 & 0xffffffff;
            v21 = sub_a6bf4c(i, "crypto/rsa/rsa_pk1.c", 193);
            if (!v21)
                goto LABEL_ab5d40;
            v22 = 0;
            v23 = v21 + i;
            v24 = a3;
            node = a2 + (a3 & 0xffffffff);
            v26 = v23 + 10;
            v27 = v23 - 1;
            do
            {
                v28 = v23;
                v29 = v22;
                v30 = v26;
                v31 = v27;
                v32 = (unsigned int)v24 != 0;
                node = &node[-1 * v32];
                if ((unsigned int)v24)
                    v33 = *node;
                else
                    v33 = 0;
                v24 -= v32;
                *((char *)v28 - 1) = v33;
                v23 = v28 - 1;
                v22 = v29 + 1;
                v26 = v30 - 1;
                v27 -= 1;
            } while ((unsigned int)v22 != (unsigned int)a4);
            v34 = 0;
            v35 = 0;
            v36 = 2;
            iter = a0;
            do
            {
                v38 = *((char *)v23 + v36) - 1 >> 31;
                v34 = ~(v38 & ~v35) & v34 | v38 & ~v35 & (unsigned int)v36;
                v35 |= v38;
                v36 += 1;
            } while (i != v36);
            v39 = ~v34 + (unsigned int)a4;
            if (((a1 - v39 ^ v39 | v39 ^ a1) ^ a1) < 0)
                v40 = 0;
            else
                v40 = (long long)((*(char *)v28 ^ 2) - 1 & v33 - 1 & (9 - v34 | v34)) >> 31;
            v41 = (unsigned int)a4 - 11;
            v42 = (long long)(v41 - a1 & 10 - (unsigned int)a4) >> 31;
            j = ~v42 & a1 | v42 & v41;
            if ((int)i >= 13)
            {
                v44 = i - v29 + v21 + 10;
                v45 = 1;
                do
                {
                    v46 = a4 - v45;
                    if ((int)v46 < 12)
                        continue;
                    if (((unsigned int)v45 & v41 - v39) - 1 < 0)
                        v47 = 0;
                    else
                        v47 = 0xff;
                    v48 = ~v47;
                    v49 = (int)v45;
                    v50 = v46 - 11;
                    if (v50 < 8 || (v51 = v23 + v46, v23 + v46 + v49 > v44 && v23 + v46 > v44 + v49))
                    {
                        v63 = 11;
                        goto LABEL_ab5c28;
                    }
                    if (32 > v50)
                    {
                        v52 = 0;
                        goto LABEL_ab5cc8;
                    }
                    else
                    {
                        v52 = v50 & 0xffffffffffffffe0;
                        v53 = CONCAT(v47 & 0xff | (v47 & 0xff) * 0x100 | (v47 & 0xff | (v47 & 0xff) * 0x100) * 0x10000 | (v47 & 0xff | (v47 & 0xff) * 0x100 | (v47 & 0xff | (v47 & 0xff) * 0x100) * 0x10000) * 0x100000000, v47 & 0xff | (v47 & 0xff) * 0x100 | (v47 & 0xff | (v47 & 0xff) * 0x100) * 0x10000 | (v47 & 0xff | (v47 & 0xff) * 0x100 | (v47 & 0xff | (v47 & 0xff) * 0x100) * 0x10000) * 0x100000000);
                        v54 = CONCAT(v48 | v48 * 0x100 | (v48 | v48 * 0x100) * 0x10000 | (v48 | v48 * 0x100 | (v48 | v48 * 0x100) * 0x10000) * 0x100000000, v48 | v48 * 0x100 | (v48 | v48 * 0x100) * 0x10000 | (v48 | v48 * 0x100 | (v48 | v48 * 0x100) * 0x10000) * 0x100000000);
                        l = v52;
                        iter1 = v31;
                        do
                        {
                            v57 = l;
                            v58 = iter1 + v49;
                            v59 = v53 & *(int128_t *)((char *)&v58->field_b + 11);
                            v60 = v54 & (int128_t)iter1[27];
                            *(uint128_t *)&iter1[11] = v54 & (int128_t)iter1[11] | v53 & *(int128_t *)(v58->padding_0)[1];
                            *(uint128_t *)&iter1[27] = v60 | v59;
                            iter1 += 32;
                            l = v57 - 32;
                        } while (l);
                        if (v50 == v52)
                            continue;
                        if (v50 & 24)
                        {
LABEL_ab5cc8:
                            v62 = v50 & 0xfffffffffffffff8;
                            v63 = v62 + 11;
                            iter2 = v30 + v52;
                            v65 = v52 - v62;
                            do
                            {
                                v66 = __dirty_unsupported_Iop_ZeroHI64ofV128((v47 & 0xff | (v47 & 0xff) * 0x100 | (v47 & 0xff | (v47 & 0xff) * 0x100) * 0x10000 | (v47 & 0xff | (v47 & 0xff) * 0x100 | (v47 & 0xff | (v47 & 0xff) * 0x100) * 0x10000) * 0x100000000) & *(long long *)((char *)iter2 + v49));
                                v67 = __dirty_unsupported_Iop_ZeroHI64ofV128((v48 | v48 * 0x100 | (v48 | v48 * 0x100) * 0x10000 | (v48 | v48 * 0x100 | (v48 | v48 * 0x100) * 0x10000) * 0x100000000) & *(unsigned long long *)&*(double *)iter2);
                                *iter2 = __dirty_unsupported_Iop_ZeroHI64ofV128(v67 | v66);
                                iter2 += 1;
                                v70 = arm64g_calculate_condition(18, v65, 8, 0);
                                v65 += 8;
                            } while (v70 & 1);
                            if (v50 == v62)
                                continue;
                            goto LABEL_ab5c28;
                        }
                        else
                        {
                            v63 = v52 | 11;
LABEL_ab5c28:
                            v71 = v31 + v63;
                            k = v46 - v63;
                            do
                            {
                                v73 = k;
                                *v71 = v48 & *v71 | (char)v47 & v71[v49];
                                v71 += 1;
                                k = v73 - 1;
                            } while (k);
                        }
                    }
                } while ((v45 = (unsigned int)v45 * 2, v41 > (int)v45));
            }
            if ((int)j >= 1)
            {
                v75 = (unsigned int)(v34 - a4) + 1;
                do
                {
                    v76 = j;
                    v77 = v30 + 1;
                    *iter = (char)~(v40 & 0xff & (int)(v75 | v39) >> 31) & *iter | (char)v40 & (char)((int)(v75 | v39) >> 31) & *(char *)v30;
                    iter += 1;
                    v75 += 1;
                    j = v76 - 1;
                    v30 = v77;
                } while (j);
            }
            sub_a368c8(sub_a6c4e8(), i, "crypto/rsa/rsa_pk1.c", 263);
            sub_a369bc("crypto/rsa/rsa_pk1.c", 270, "RSA_padding_check_PKCS1_type_2");
            sub_a36abc(4, 159, 0);
            sub_a366d8(v40 & 1);
            v80 = ~v40 | v40 & v39;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_pk1.c", 189, "RSA_padding_check_PKCS1_type_2");
            sub_a36abc(4, 159, 0);
LABEL_ab5d40:
            v80 = 0xffffffff;
        }
        return v80;
    }
    else
    {
        return 0xffffffff;
    }
}
