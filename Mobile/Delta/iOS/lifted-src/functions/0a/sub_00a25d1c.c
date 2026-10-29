/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa25d1c..0xa260e0 (964 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a25d1c_1 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned long long field_18;
} st_a25d1c_1;

typedef struct st_a25d1c_3 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_a25d1c_3;

typedef struct st_a25d1c_2 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    long long field_20;
    unsigned int field_28;
} st_a25d1c_2;

typedef struct st_a25d1c_0 {
    struct st_a25d1c_1 *field_0;
    char padding_8[8];
    uint128_t field_10;
    unsigned int field_20;
    char padding_24[12];
    uint128_t field_30;
} st_a25d1c_0;

extern st_a25d1c_0 g_d6f000;
extern char g_10002b0;

unsigned int sub_a25d1c(long long a0, st_a25d1c_2 *a1, unsigned int a2, unsigned int a3, unsigned long a4, unsigned long a5, long long a6)
{
    long long v17;  // x1
    unsigned int v18;  // x0
    unsigned long v28;  // d1
    unsigned int v29;  // x8
    st_a25d1c_0 *v30;  // x8
    unsigned int v31;  // w28
    unsigned int v32;  // w26
    unsigned int v33;  // w27
    unsigned int v34;  // x8
    st_a25d1c_0 *v35;  // x8
    unsigned int v36;  // w0
    long long *v19;  // x26
    unsigned int v37;  // x20
    st_a25d1c_3 *v38;  // x0
    unsigned long long v39;  // x8
    uint128_t *v20;  // x0
    uint128_t v21;  // q0
    unsigned int v22;  // s0
    uint128_t *v23;  // x0
    uint128_t v24;  // q0
    unsigned int v25;  // s0
    uint128_t v26;  // q1
    unsigned int v0;  // [bp-0x180]
    uint128_t v1;  // [bp-0x170], Other Possible Types: unsigned int
    unsigned int v2;  // [bp-0x160]
    uint128_t v3;  // [bp-0x150], Other Possible Types: unsigned int
    unsigned int v4;  // [bp-0x140]
    unsigned int v5;  // [bp-0x140]
    unsigned int v6;  // [bp-0x130]
    unsigned long v7;  // [bp-0x108]
    long long *v8;  // [bp-0x100]
    uint128_t v9;  // [bp-0xf0]
    unsigned int v10;  // [bp-0xe0]
    uint128_t v11;  // [bp-0xd0]
    unsigned int v12;  // [bp-0xa0]
    unsigned int v13;  // [bp-0x90]
    unsigned long v14;  // [bp-0x68]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v14 = *(long long *)&g_10002b0;
    v12 = 0;
    v13 = 0;
    if (a3 >= 0xfffffff)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_sm2p256.c", 523, "ecp_sm2p256_points_mul");
        v17 = 0xc0100;
        goto LABEL_a25d90;
    }
    sub_9de064(a6);
    if (a2)
    {
        v18 = sub_c4c40(a0);
        if (v18)
        {
            v19 = (long long *)v18;
            if (!sub_9e42c8(&v12, a2, 4))
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ecp_sm2p256.c", 537, "ecp_sm2p256_points_mul");
                v17 = 146;
LABEL_a25d90:
                sub_a36abc(16, v17, 0);
            }
            else if (sub_9e4290(v19[2]) == 4 && sub_9e4290(v19[3]) == 4 && (v20 = sub_954340(v19[2]), v21 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn32to16x4(~CatEvenLanesV(_mm_cmpeq_epi64(v20[1], _mm_set_epi64x(3658240301855244569, 6888541805516278164)), _mm_cmpeq_epi64(*v20, _mm_set_epi64x(0x8fe30bbff2660be1, 8167917329763300551))))), v22 = __dirty_unsupported_Iop_ZeroHI112ofV128(_mm_max_epu16(_mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))))), !((unsigned int)__dirty_unsupported_Iop_ZeroHI112ofV128(_mm_max_epu16(_mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))))) & 1) && (v23 = sub_954340(v19[3]), v24 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn32to16x4(~CatEvenLanesV(_mm_cmpeq_epi64(v23[1], _mm_set_epi64x(13562368876371933084, 6466552116128850259)), _mm_cmpeq_epi64(*v23, _mm_set_epi64x(15035697800923465536, 206940067568677024))))), v25 = __dirty_unsupported_Iop_ZeroHI112ofV128(_mm_max_epu16(_mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)))))), _mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)))))))), !((unsigned int)__dirty_unsupported_Iop_ZeroHI112ofV128(_mm_max_epu16(_mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)))))), _mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)))))))) & 1) && (int)v19[5] == 1)))
            {
                v0 = 0;
                v1 = 0;
                v2 = 0;
                v3 = 0;
                v5 = 0;
                v6 = 0;
                v26 = v12 | v13;
                v28 = __dirty_unsupported_Iop_ZeroHI64ofV128(v26 | __dirty_unsupported_Iop_SliceV128(v26, v26, 8));
                if (__double_as_longlong(v28))
                {
                    v29 = (char)(unsigned int)v12;
                    if (v29)
                    {
                        v30 = &(&g_d6f000.field_0)[8 * v29];
                        v0 = *(int128_t *)&v30->field_0;
                        v1 = v30->field_10;
                        v2 = *(int128_t *)&v30->field_20;
                        v3 = v30->field_30;
                        v4 = 1;
                    }
                    v31 = 1;
                    v32 = 0x800;
                    v33 = 8;
                    do
                    {
                        v34 = (char)((unsigned long long)(*(long long *)((char *)&v12 + (v31 & 0xfffffff8))) >> ((char)v33 & 56 & 63));
                        if (v34)
                        {
                            v35 = &(&g_d6f000.field_0)[8 * v34 + v32];
                            v8 = (long long *)*(int128_t *)&v35->field_0;
                            v9 = v35->field_10;
                            v10 = *(int128_t *)&v35->field_20;
                            v11 = v35->field_30;
                            sub_a26cc0(&v0, &v0, &v8);
                        }
                    } while ((v31 += 1, v32 += 0x800, v33 += 8, v5 = v4, v31 != 32));
                }
                goto LABEL_a25f5c;
            }
            else
            {
                v7 = a2;
                v8 = v19;
                if (sub_a262b4(a0, &v0, &v7, &v8, 1, a6))
                    goto LABEL_a25f5c;
                goto LABEL_a25d98;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecp_sm2p256.c", 532, "ecp_sm2p256_points_mul");
            v17 = 113;
            goto LABEL_a25d90;
        }
        goto LABEL_a25d98;
    }
    else
    {
LABEL_a25f5c:
        if (a3)
        {
            v36 = sub_a262b4();
            if (a2 && v36)
            {
                sub_a26944(&v0, &v0, &v8);
                goto LABEL_a25fd0;
            }
            if (v36)
                goto LABEL_a25fd0;
LABEL_a25d98:
            v37 = 0;
        }
        else
        {
LABEL_a25fd0:
            if (!sub_9e4320(a1->field_10, &v0, 4) || !sub_9e4320(a1->field_18, &v2, 4) || !sub_9e4320(a1->field_20, &v5, 4))
                goto LABEL_a25d98;
            v38 = sub_954340(a1->field_20);
            v39 = v38->field_8 | v38->field_10 | v38->field_0 ^ 1 | v38->field_18;
            a1->field_28 = (v39 - 1 & ~v39) >> 63;
            v37 = 1;
        }
    }
    sub_9de17c(a6);
    if (*(long long *)&g_10002b0 == v14)
        return v37;
    ___stack_chk_fail();
}
