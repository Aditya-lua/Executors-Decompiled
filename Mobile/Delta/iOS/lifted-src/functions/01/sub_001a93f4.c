/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a93f4..0x1a9464 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a93f4_4 {
    unsigned long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_1a93f4_4;

typedef struct st_1a93f4_5 {
    char padding_0[88];
    struct st_1a93f4_4 *field_58;
} st_1a93f4_5;

typedef struct st_1a93f4_0 {
    char field_0;
} st_1a93f4_0;

typedef struct st_1a93f4_2 {
    unsigned int field_0;
} st_1a93f4_2;

typedef struct st_1a93f4_1 {
    char padding_0[1152];
    struct st_1a93f4_2 *field_480;
} st_1a93f4_1;

typedef struct st_1a93f4_3 {
    char padding_0[96];
    struct st_1a93f4_1 *field_60;
} st_1a93f4_3;

extern st_1a93f4_3 *g_f0d198;

int sub_1a93f4(st_1a93f4_5 *a0)
{
    st_1a93f4_4 *v2;  // x8
    st_1a93f4_4 **v3;  // x0
    st_1a93f4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1a93f4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (g_f0d198->field_60->field_480)
    {
        v2 = a0->field_58;
        v3 = &a0->field_58;
        *(double *)&v2->field_0 = (double)(_mm_cvtsi128_si64(_mm_unpacklo_epi32(_mm_setzero_si128(), *(int *)g_f0d198->field_60->field_480)) >> 32);
    }
    else
    {
        v2 = a0->field_58;
        v3 = &a0->field_58;
        v2->field_0 = 0x404e000000000000;
    }
    v2->field_c = 3;
    *v3 = *v3 + 1;
    return 1;
}
