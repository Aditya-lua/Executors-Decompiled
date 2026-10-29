/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0c920..0xa0cd6c (1100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0c920_0 {
    char padding_0[32];
    char field_20;
    char field_21;
    char field_22;
    char field_23;
    char field_24;
    char field_25;
    char field_26;
    char field_27;
    char field_28;
    char field_29;
    char field_2a;
    char field_2b;
    char field_2c;
    char field_2d;
    char field_2e;
    char field_2f;
    char field_30[15];
    char field_37;
    char padding_38[7];
    char field_3f;
} st_a0c920_0;

extern char g_10002b0;

long long sub_a0c920(long long a0, long long a1, st_a0c920_0 *a2, long long a3, unsigned long long a4, long long a5, unsigned int a6, unsigned long a7, unsigned long a8, long long a9, long long a10)
{
    unsigned int v12;  // w8
    unsigned long long v13;  // 4102
    unsigned int v22;  // w8
    unsigned long long v23;  // 4102
    st_a0c920_0 *v24;  // x14
    unsigned int v25;  // w15
    unsigned long long v26;  // 4102
    unsigned int v27;  // w15
    unsigned long long v28;  // 4102
    unsigned int v29;  // w15
    unsigned long long v30;  // 4102
    unsigned int v31;  // w15
    unsigned int v14;  // w8
    unsigned long long v32;  // 4102
    unsigned int v33;  // w15
    unsigned long long v34;  // 4102
    unsigned int v35;  // w15
    unsigned long long v36;  // 4102
    unsigned int v37;  // w15
    unsigned long long v38;  // 4102
    unsigned int v39;  // w15
    unsigned long long v40;  // 4102
    unsigned int v41;  // w15
    unsigned long long v15;  // 4102
    unsigned long long v42;  // 4102
    unsigned int v43;  // w15
    unsigned long long v44;  // 4102
    st_a0c920_0 *v45;  // x22
    unsigned long v48;  // x0
    unsigned long v49;  // x20
    unsigned long v50;  // x21
    unsigned int v16;  // w8
    unsigned long long v17;  // 4102
    unsigned int v18;  // w8
    unsigned long long v19;  // 4102
    unsigned int v20;  // w8
    unsigned long long v21;  // 4102
    char v0;  // [bp-0x1fc]
    char v1;  // [bp-0x184]
    uint128_t v2;  // [bp-0x180]
    __m128i v3;  // [bp-0x170]
    unsigned long long v4;  // [bp-0x160]
    __m128i v5;  // [bp-0x108]
    __m128i v6;  // [bp-0xf8]
    unsigned long long v7;  // [bp-0xe8]
    char v8;  // [bp-0xd8]
    char v9;  // [bp-0x98]
    unsigned long v10;  // [bp-0x78]
    char *v11;  // [bp-0x10]

    v11 = &a8;
    v10 = *(long long *)&g_10002b0;
    if (!a7)
        a8 = 0;
    if (...)
    {
        v45 = a2;
        if (sub_a0c110(&v2, a3))
            goto LABEL_a0c9c4;
        v2 = _mm_sub_epi32(_mm_setzero_si128(), v2);
        v3 = _mm_sub_epi32(_mm_setzero_si128(), v3);
        v4 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(_mm_setzero_si128(), v4));
        v5 = _mm_sub_epi32(_mm_setzero_si128(), v5);
        v6 = _mm_sub_epi32(_mm_setzero_si128(), v6);
        v7 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(_mm_setzero_si128(), v7));
        v48 = sub_a40ca8(a9, "SHA512", a10);
        if (v48)
        {
            v49 = v48;
            v50 = sub_a3f728();
            if (v50 && sub_a0aa1c(v50, v49, a4, a5, a7, a8) && sub_a3fe10(v50, v45, 32) && sub_a3fe10(v50, a3, 32) && sub_a3fe10(v50, a0, a1) && sub_a3ff7c(v50, &v8, &v1))
            {
                sub_a0ab18(&v8);
                sub_a0cd6c(&v0, &v8, &v2, &v45->field_20);
                sub_a0b498(&v9, &v0);
                v48 = !sub_a66f20(&v9, v45, 32);
            }
            else
            {
                v48 = 0;
            }
            sub_a3f52c(v49);
            sub_a3f73c(v50);
        }
    }
    else
    {
LABEL_a0c9c4:
        v48 = 0;
    }
    if (*(long long *)&g_10002b0 == v10)
        return v48;
    ___stack_chk_fail();
}
