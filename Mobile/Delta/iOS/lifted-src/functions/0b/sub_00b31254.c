/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb31254..0xb317d4 (1408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b31254_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    char padding_20[8];
    long long field_28;
    unsigned long long field_30;
    char padding_38[16];
    long long field_48;
    unsigned long long field_50;
} st_b31254_0;

extern char g_1000000;

unsigned long long sub_b31254(st_b31254_0 *a0, unsigned long long a1, unsigned long a2, long long a3)
{
    unsigned long long v24;  // x15
    unsigned long long v25;  // x23
    long long v34;  // x1
    unsigned long long v36;  // x25
    unsigned long long v37;  // x14
    unsigned long v38;  // x9
    unsigned long long v39;  // x26
    unsigned long long v40;  // x9
    unsigned long long v41;  // 4115
    long long v42;  // x9
    unsigned long long v43;  // x0
    unsigned long long v26;  // x0
    unsigned long long v44;  // x21
    unsigned long long v45;  // x27
    unsigned long long i;  // x9
    unsigned int *v47;  // x10
    unsigned long long v48;  // x8
    unsigned long long v49;  // x23
    unsigned long long v50;  // x12
    unsigned long long v51;  // x2
    void* iter;  // x27
    unsigned int *iter1;  // x25
    long long v27;  // x0
    unsigned long long j;  // x8
    void* iter2;  // x9
    unsigned long long v56;  // x8
    unsigned int v57;  // w10
    unsigned int v58;  // w10
    unsigned int v59;  // w10
    unsigned long long k;  // x28
    unsigned long long v62;  // x28
    unsigned long long v63;  // x25
    long long v28;  // x1
    unsigned long v65;  // x9
    unsigned long v66;  // x10
    void* v67;  // x8
    unsigned int *v68;  // x10
    unsigned int *v69;  // x9
    unsigned long long m;  // x11
    unsigned long long v71;  // x9
    uint128_t *node;  // x11
    uint128_t *v73;  // x12
    unsigned long v29;  // x24
    unsigned long long l;  // x10
    unsigned long long v75;  // x10
    void* v76;  // x13
    uint128_t v77;  // q1
    uint128_t v78;  // q3
    unsigned long long v80;  // x11
    unsigned long long v30;  // x22
    unsigned int *v84;  // x8
    unsigned long long n;  // x9
    unsigned long long v86;  // x9
    unsigned long long v31;  // x28
    uint128_t v32;  // q0
    unsigned long v0;  // [bp-0x120]
    unsigned long v1;  // [bp-0x118]
    long long v2;  // [bp-0x108]
    unsigned long long v3;  // [bp-0x100]
    unsigned long long v4;  // [bp-0xf8]
    unsigned long v5;  // [bp-0xf0]
    unsigned long v6;  // [bp-0xe8]
    unsigned long v7;  // [bp-0xe0]
    unsigned long long v8;  // [bp-0xd8]
    uint128_t *v9;  // [bp-0xd0]
    unsigned long long v10;  // [bp-0xc8]
    unsigned long long v11;  // [bp-0xc0]
    long long v12;  // [bp-0xb8]
    unsigned long long v13;  // [bp-0xb0]
    unsigned long long v14;  // [bp-0xa8]
    unsigned long long v15;  // [bp-0xa0]
    uint128_t *v16;  // [bp-0x98]
    unsigned long long v17;  // [bp-0x90]
    unsigned int *v18;  // [bp-0x88]
    unsigned int *v19;  // [bp-0x80]
    unsigned int *v20;  // [bp-0x78]
    unsigned int *v21;  // [bp-0x70]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    if (!sub_a2f9e0() || !sub_b317e0(a0, a3))
    {
LABEL_b314b8:
        return 0;
    }
    v24 = (unsigned long long)a0->padding_10;
    if (v24)
    {
        v25 = (unsigned long long)a0->padding_20;
        if (v25)
        {
            v26 = a0->field_50;
            if (!v26)
            {
                sub_a3f52c(0);
                v26 = sub_a40ca8(a0->field_0, "sha256", a0->field_8);
                a0->field_50 = v26;
                if (v26)
                {
                    v24 = (unsigned long long)a0->padding_10;
                    v25 = (unsigned long long)a0->padding_20;
                    goto LABEL_b312d8;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kdfs/scrypt.c", 167, "set_digest");
                    v27 = 57;
                    v28 = 147;
                }
            }
            else
            {
LABEL_b312d8:
                v29 = a0->field_30;
                if (v29 < 2)
                    return 0;
                v30 = *(long long *)&a0->padding_38[0];
                if (!v30)
                    return 0;
                v31 = *(long long *)&a0->padding_38[8];
                if (!v31)
                    return 0;
                v32 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_Cnt8x16(__double_as_longlong(__longlong_as_double(v29))));
                if (1 < (unsigned int)__dirty_unsupported_Iop_ZeroHI112ofV128(_mm_add_epi16(_mm_add_epi16(_mm_add_epi16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8))), CatOddLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8))), CatOddLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8))))), _mm_add_epi16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)))))), _mm_add_epi16(_mm_add_epi16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8))), CatOddLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8))), CatOddLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8))))), _mm_add_epi16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v32, v32), 8)))))))))
                    return 0;
                if (v31 > 0x3fffffff / v30)
                {
                    sub_a368c8();
                    v34 = 461;
                }
                else if (63 >= v30 * 16 && v29 >> ((char)(v30 * 16) & 63))
                {
                    sub_a368c8();
                    v34 = 472;
                }
                else
                {
                    v36 = v31 * 128;
                    v37 = v30 * v36;
                    if (v37 > 0x7fffffff)
                    {
                        sub_a368c8();
                        v34 = 490;
                    }
                    else
                    {
                        v38 = v29 + 2;
                        if (v38 > 0x1ffffffffffffff / v30)
                        {
                            sub_a368c8();
                            v34 = 500;
                        }
                        else
                        {
                            v39 = v30 * 32;
                            v40 = v39 * v38 * 4;
                            v41 = arm64g_calculate_condition(50, v40, v37, 0);
                            if (!(v41 & 1))
                            {
                                sub_a368c8();
                                v34 = 507;
                            }
                            else
                            {
                                v42 = v37 + v40;
                                if ((unsigned long long)v42 > (unsigned long long)a0->field_48)
                                {
                                    sub_a368c8();
                                    v34 = 516;
                                }
                                else
                                {
                                    if (!a1)
                                        return 1;
                                    v3 = v24;
                                    v4 = v37;
                                    v5 = a0->field_8;
                                    v6 = a0->field_0;
                                    v7 = a0->field_18;
                                    v8 = v26;
                                    v2 = v42;
                                    v43 = sub_a6bf4c(v42, "providers/implementations/kdfs/scrypt.c", 524);
                                    if (v43)
                                    {
                                        v44 = v43;
                                        v45 = v4;
                                        if (sub_a59264(v3, v7, v25, a0->field_28, 1, v8, v45, v44, v6, v5))
                                        {
                                            i = 0;
                                            v47 = v44 + v45;
                                            v48 = v39 * 4;
                                            v20 = (char *)v47 + v48;
                                            v49 = v30 * 128;
                                            v19 = (char *)v20 + v48;
                                            v12 = &v19[v30 * (v29 * 32 - 32)];
                                            v21 = v47;
                                            v17 = v29 * 128;
                                            v18 = (char *)v47 - 64;
                                            v50 = -v49;
                                            v10 = v29 - 1;
                                            v11 = v50;
                                            v51 = v44;
                                            v16 = v51 + (v36 + 128) * v30 + 16;
                                            v13 = v51;
                                            v14 = v31;
                                            v9 = v45 + v44 + 16;
                                            do
                                            {
                                                v15 = i;
                                                iter = v51 + v49 * i;
                                                iter1 = v19;
                                                if (v39)
                                                {
                                                    iter1 = v19;
                                                    j = v39;
                                                    iter2 = iter;
                                                    do
                                                    {
                                                        v56 = j;
                                                        v57 = *(char *)iter2;
                                                        *iter1 = v57;
                                                        v58 = v57 | (char)iter2[1] * 0x100;
                                                        *iter1 = v58;
                                                        v59 = v58 | (char)iter2[2] * 0x10000;
                                                        *iter1 = v59;
                                                        *iter1 = v59 | (char)iter2[3] * &g_1000000;
                                                        iter1 += 1;
                                                        iter2 += 4;
                                                        j = v56 - 1;
                                                    } while (j);
                                                }
                                                k = v10;
                                                do
                                                {
                                                    v62 = k;
                                                    sub_b31b24(iter1, (char *)iter1 + v50, v30);
                                                    iter1 = (char *)iter1 + v49;
                                                    k = v62 - 1;
                                                } while (k);
                                                sub_b31b24(v21, v12, v30);
                                                v63 = 0;
                                                while (1)
                                                {
                                                    if (!v39)
                                                    {
                                                        sub_b31b24(v21, v20, v30);
                                                        v63 += 1;
                                                        if (v63 == v29)
                                                            break;
                                                        else
                                                            continue;
                                                    }
                                                    v65 = *(int *)((char *)v18 + v49);
                                                    v66 = v65 / v29;
                                                    v67 = &v19[v39 * (v65 - v29 * v66)];
                                                    if (v49)
                                                    {
                                                        v68 = v20;
                                                        v69 = v21;
                                                        m = v39;
                                                        if ((v66 * v17 - v65 * 128 - 128) * v30)
                                                        {
                                                            v71 = 0;
                                                            node = v16;
                                                            v73 = v9;
                                                            l = v39;
                                                            do
                                                            {
                                                                v75 = l;
                                                                v76 = v67 + v71 * 4;
                                                                v77 = *v73;
                                                                v78 = (int128_t)v76[16];
                                                                *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)v73 - 16) ^ *(int128_t *)v76;
                                                                *node = v77 ^ v78;
                                                                v71 += 8;
                                                                v73 += 2;
                                                                node += 2;
                                                                l = v75 - 8;
                                                            } while (l);
                                                            goto LABEL_b31720;
                                                        }
                                                    }
                                                    else
                                                    {
                                                        v68 = v20;
                                                        v69 = v21;
                                                        m = v39;
                                                    }
                                                    do
                                                    {
                                                        v80 = m;
                                                        *v68 = *(int *)v67 ^ *v69;
                                                        v68 += 1;
                                                        v67 += 4;
                                                        m = v80 - 1;
                                                        v69 += 1;
                                                    } while (m);
LABEL_b31720:
                                                    sub_b31b24(v21, v20, v30);
                                                    v63 += 1;
                                                    if (v63 == v29)
                                                    {
                                                        v84 = v21;
                                                        n = v39;
                                                        do
                                                        {
                                                            v86 = n;
                                                            *(unsigned int *)iter = *v84;
                                                            iter += 4;
                                                            v84 += 1;
                                                            n = v86 - 1;
                                                        } while (n);
                                                    }
                                                }
                                                i = v15 + 1;
                                                v51 = v13;
                                                v50 = v11;
                                            } while (i != v14);
                                            v0 = v6;
                                            v1 = v5;
                                            v44 = v51;
                                            if (sub_a59264(v3, v7))
                                            {
                                                sub_a6c4e8(v44, v2, "providers/implementations/kdfs/scrypt.c", 547);
                                                return 1;
                                            }
                                        }
                                        sub_a368c8();
                                        sub_a369bc("providers/implementations/kdfs/scrypt.c", 545, "scrypt_alg");
                                        sub_a36abc(6, 181, 0);
                                        sub_a6c4e8(v44, v2, "providers/implementations/kdfs/scrypt.c", 547);
                                        return 0;
                                    }
                                    goto LABEL_b314b8;
                                }
                            }
                        }
                    }
                }
                sub_a369bc("providers/implementations/kdfs/scrypt.c", v34, "scrypt_alg");
                v27 = 6;
                v28 = 172;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/scrypt.c", 199, "kdf_scrypt_derive");
            v27 = 57;
            v28 = 131;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/scrypt.c", 194, "kdf_scrypt_derive");
        v27 = 57;
        v28 = 130;
    }
    sub_a36abc(v27, v28, 0);
    return 0;
}
