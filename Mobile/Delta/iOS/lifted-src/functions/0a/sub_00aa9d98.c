/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa9d98..0xaaa148 (944 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;
extern char g_10002b0;

void sub_aa9d98(void* a0, void* a1, unsigned long long a2, long long a3, void* a4, unsigned long long a5)
{
    void* v5;  // x22
    unsigned long long v6;  // x19
    unsigned long long v15;  // x19
    unsigned long long i;  // x19
    unsigned long long v17;  // x9
    char *v18;  // x8
    unsigned long long v19;  // x10
    char *v20;  // x8
    char *v21;  // x8
    char *v22;  // x8
    char *v23;  // x8
    char *v24;  // x8
    void* v7;  // x21
    char *v25;  // x8
    char v26;  // x13
    char v27;  // x12
    char v28;  // x11
    char v29;  // x9
    char v30;  // x8
    char v31;  // x10
    unsigned long long v32;  // 4102
    unsigned long long j;  // x19
    void* v34;  // x27
    void* v8;  // x23
    unsigned long v35;  // x24
    unsigned long v36;  // x25
    unsigned long long v37;  // x19
    unsigned long long v38;  // x8
    unsigned long long v39;  // x9
    unsigned long v40;  // x26
    unsigned long v41;  // x23
    unsigned long long v42;  // x8
    void* iter;  // x9
    unsigned long long v44;  // x10
    __m128i v9;  // q0
    unsigned long v10;  // x24
    unsigned long v11;  // x25
    unsigned long long v12;  // 4102
    void* v13;  // x23
    void* v14;  // x21
    __m128i v0;  // [bp-0x80], Other Possible Types: unsigned long
    unsigned long v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a4;
    v6 = a2;
    v7 = a1;
    v8 = a0;
    v2 = *(long long *)&g_10002b0;
    v9 = _mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), *(unsigned long long *)&*(double *)a4), 32);
    v10 = _mm_cvtsi128_si64(v9);
    v11 = _mm_extract_epi64(v9, 1);
    if (a5)
    {
        v12 = arm64g_calculate_condition(180, a2, 8, 0);
        v13 = v8;
        v14 = v7;
        v15 = v6;
        if (!(v12 & 1))
        {
            do
            {
                i = v6;
                v15 = i - 8;
                v13 = v8 + 8;
                v0 = _mm_xor_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), *(unsigned long long *)&*(double *)v8), 32), v9);
                sub_aaa148(&v0, a3);
                v9 = v0;
                v10 = _mm_cvtsi128_si64(v9);
                *(char *)v7 = v10;
                *(char *)&v7[1] = v10 >> 8;
                *(char *)&v7[2] = v10 >> 16;
                *(char *)&v7[3] = v10 >> 24;
                v11 = _mm_extract_epi64(v9, 1);
                *(char *)&v7[4] = v11;
                *(char *)&v7[5] = v11 >> 8;
                *(char *)&v7[6] = v11 >> 16;
                v14 = v7 + 8;
                *(char *)&v7[7] = v11 >> 24;
                v8 = v13;
                v7 = v14;
                v6 = v15;
            } while (15 < i);
        }
        switch (v15)
        {
        case 0:
            v26 = v10 >> 8;
            v29 = v11 >> 8;
            v30 = v11 >> 16;
            v31 = v11 >> 24;
            v28 = v10 >> 24;
            v27 = v10 >> 16;
            break;
        default:
            v17 = 0;
            v18 = v13 + v15;
            if ((long long)v15 <= 3)
            {
                v19 = 0;
                if (v15 == 1)
                    goto LABEL_aaa01c;
                if (v15 == 2)
                    goto LABEL_aaa014;
                if (v15 == 3)
                    goto LABEL_aaa00c;
            }
            else if (5 >= (long long)v15)
            {
                if (v15 == 4)
                    goto LABEL_aaa000;
                v19 = 0;
                if (v15 == 5)
                    goto LABEL_aa9ff8;
            }
            else if (v15 != 6)
            {
                v19 = 0;
                if (v15 != 7)
                    goto LABEL_aaa024;
                v20 = v18 - 1;
                v17 = *(v18 - 1) * 0x10000;
                v18 = v20;
                goto LABEL_aa9ff0;
            }
            else
            {
LABEL_aa9ff0:
                v21 = v18 - 1;
                v17 |= *(v18 - 1) * 0x100;
                v18 = v21;
LABEL_aa9ff8:
                v22 = v18 - 1;
                v17 |= *(v18 - 1);
                v18 = v22;
LABEL_aaa000:
                v19 = v17;
                v23 = v18 - 1;
                v17 = *(v18 - 1) * &g_1000000;
                v18 = v23;
LABEL_aaa00c:
                v24 = v18 - 1;
                v17 |= *(v18 - 1) * 0x10000;
                v18 = v24;
LABEL_aaa014:
                v25 = v18 - 1;
                v17 |= *(v18 - 1) * 0x100;
                v18 = v25;
LABEL_aaa01c:
                v17 |= *(v18 - 1);
            }
LABEL_aaa024:
            v0 = (__m128i)(v17 ^ v10);
            v1 = v19 ^ v11;
            sub_aaa148(&v0, a3);
            v10 = (unsigned long)v0;
            v11 = v1;
            v26 = v10 >> 8;
            v27 = v10 >> 16;
            v28 = v10 >> 24;
            v29 = v11 >> 8;
            v30 = v11 >> 16;
            v31 = v11 >> 24;
            *(unsigned int *)v14 = v10;
            *(unsigned int *)&v14[4] = v11;
        }
        *(char *)v5 = v10;
        *(char *)&v5[1] = v26;
        *(char *)&v5[2] = v27;
        *(char *)&v5[3] = v28;
        *(char *)&v5[4] = v11;
        *(char *)&v5[5] = v29;
    }
    else
    {
        v32 = arm64g_calculate_condition(180, a2, 8, 0);
        if (!(v32 & 1))
        {
            v5 = v5;
            do
            {
                j = v6;
                v34 = v7;
                v35 = *(int *)v8;
                v36 = (int)v8[4];
                v37 = j - 8;
                v8 += 8;
                v0 = (__m128i)v35;
                v1 = v36;
                sub_aaa244(&v0, a3);
                v38 = (unsigned long long)(v0 ^ v10);
                v39 = v1 ^ v11;
                *(char *)v34 = v38;
                *(char *)&v34[1] = v38 >> 8;
                *(char *)&v34[2] = v38 >> 16;
                *(char *)&v34[3] = v38 >> 24;
                *(char *)&v34[4] = v39;
                *(char *)&v34[5] = v39 >> 8;
                *(char *)&v34[6] = v39 >> 16;
                v7 = v34 + 8;
                *(char *)&v34[7] = v39 >> 24;
                v11 = v36;
                v10 = v35;
                v6 = v37;
            } while (15 < j);
            v11 = v36;
            v10 = v35;
            v6 = v37;
        }
        switch (v6)
        {
        case 0:
            v40 = v10;
            v41 = v11;
            break;
        default:
            v40 = *(int *)v8;
            v0 = (__m128i)v40;
            v41 = (int)v8[4];
            v1 = v41;
            sub_aaa244(&v0, a3);
            v42 = (unsigned long long)(v0 ^ v10);
            iter = v7 + v6;
            if ((long long)v6 > 3)
            {
                v44 = v1 ^ v11;
                if (5 >= (long long)v6)
                {
                    if (v6 == 4)
                        goto LABEL_aaa0b8;
                    if (v6 == 5)
                        goto LABEL_aaa0b4;
                }
                else if (v6 != 6)
                {
                    if (v6 != 7)
                        goto LABEL_aaa0d4;
                    *((char *)iter - 1) = v44 >> 16;
                    iter -= 1;
                    goto LABEL_aaa0ac;
                }
                else
                {
LABEL_aaa0ac:
                    *((char *)iter - 1) = v44 >> 8;
                    iter -= 1;
LABEL_aaa0b4:
                    *((char *)iter - 1) = v44;
                    iter -= 1;
LABEL_aaa0b8:
                    *((char *)iter - 1) = v42 >> 24;
                    iter -= 1;
LABEL_aaa0c0:
                    *((char *)iter - 1) = v42 >> 16;
                    iter -= 1;
LABEL_aaa0c8:
                    *((char *)iter - 1) = v42 >> 8;
                    iter -= 1;
LABEL_aaa0d0:
                    *((char *)iter - 1) = v42;
                }
            }
            else
            {
                if (v6 == 1)
                    goto LABEL_aaa0d0;
                if (v6 == 2)
                    goto LABEL_aaa0c8;
                if (v6 == 3)
                    goto LABEL_aaa0c0;
            }
        }
LABEL_aaa0d4:
        *(char *)v5 = v40;
        *(char *)&v5[1] = v40 >> 8;
        *(char *)&v5[2] = v40 >> 16;
        *(char *)&v5[3] = v40 >> 24;
        *(char *)&v5[4] = v41;
        *(char *)&v5[5] = v41 >> 8;
        v30 = v41 >> 16;
        v31 = v41 >> 24;
    }
    *(char *)&v5[6] = v30;
    *(char *)&v5[7] = v31;
    if (*(long long *)&g_10002b0 == v2)
        return;
    ___stack_chk_fail();
}
