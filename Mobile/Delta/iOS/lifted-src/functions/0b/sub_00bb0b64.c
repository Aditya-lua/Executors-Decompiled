/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb0b64..0xbb0bd4 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bb0b64_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_bb0b64_1 *field_10;
    char padding_18[8];
    unsigned long long field_20;
} st_bb0b64_0;

typedef struct st_bb0b64_1 {
    unsigned long long field_0;
} st_bb0b64_1;


unsigned long long sub_bb0b64(st_bb0b64_0 *a0)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x8
    unsigned long long i;  // x10
    unsigned long long *v3;  // x11
    unsigned long long *v4;  // x11
    unsigned long long v6;  // 4146
    unsigned long long v7;  // 4148
    unsigned long long v8;  // x9
    unsigned long long v9;  // x9

    v0 = a0->field_20;
    if (!v0)
        return 0;
    v1 = a0->field_0;
    i = a0->field_8;
    if (!i)
    {
        v3 = a0->field_10;
        do
        {
            v4 = v3 + 1;
            v1 -= 128;
            i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v3)) & 0x8080808080808080;
            v3 = v4;
        } while (!i);
        a0->field_10 = v4;
        a0->field_0 = v1;
    }
    a0->field_8 = i - 1 & i;
    a0->field_20 = v0 - 1;
    v6 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
    v7 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
    v8 = ((((v7 | v6) & 0xffff0000ffff0000) >> 16 | (v7 | v6) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v7 | v6) & 0xffff0000ffff0000) >> 16 | (v7 | v6) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
    if (!v8)
        v9 = 64;
    else
        v9 = Clz(v8);
    return v1 - (v9 * 2 & 240) - 16;
}
