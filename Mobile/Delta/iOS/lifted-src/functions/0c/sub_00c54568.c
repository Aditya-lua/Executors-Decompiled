/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc54568..0xc546b8 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c54568_0 {
    char padding_0[72];
    unsigned long long field_48;
    unsigned long long field_50;
    char padding_58[16];
    void* field_68;
} st_c54568_0;


unsigned int sub_c54568(st_c54568_0 *a0, char *a1, unsigned long long a2)
{
    void* v2;  // x19
    unsigned long long i;  // x23
    unsigned long long v12;  // 4146
    unsigned int v13;  // x8
    unsigned long long v14;  // x8
    unsigned long long v15;  // 4107
    unsigned long long v16;  // 4107
    unsigned int v17;  // w10
    unsigned long v18;  // cc_op
    unsigned long v19;  // cc_dep1
    unsigned long v20;  // cc_dep2
    unsigned int v21;  // w10
    void* v4;  // x26
    unsigned int v22;  // x1
    unsigned long v23;  // x10
    unsigned long long v24;  // x9
    unsigned long long v25;  // 4110
    unsigned long long v27;  // 4108
    unsigned long long v28;  // 4110
    unsigned long long v29;  // 4108
    unsigned long long v5;  // x23
    void* v6;  // x26
    unsigned long v8;  // x8
    unsigned long long v9;  // x8
    unsigned long v10;  // cc_dep1
    unsigned long long v11;  // 4144
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_68;
    if (!v2 || !*(long long *)&a0[1].padding_0[0])
        return 0;
    i = *(long long *)&a0[1].padding_0[0] * 80;
    v4 = v2;
    do
    {
        v5 = i;
        v6 = v4 + 80;
        v8 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)v4, _mm_setzero_si128()), 4), _mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)v4, _mm_setzero_si128()), 4)));
        v9 = v8 & 0x8888888888888888;
        v10 = v8 & 0x8888888888888888;
        v11 = ((((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v12 = (((((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v13 = ((((v12 | v11) & 0xffff0000ffff0000) >> 16 | (v12 | v11) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v12 | v11) & 0xffff0000ffff0000) >> 16 | (v12 | v11) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        if (!v13)
        {
            v14 = 16;
            v15 = arm64g_calculate_condition(10, v10, 0, 0);
            if (!(v15 & 1))
                goto LABEL_c545e6;
            goto LABEL_c545e5;
        }
        else
        {
            v14 = Clz(v13) >> 2;
            v16 = arm64g_calculate_condition(10, v10, 0, 0);
            if (v16 & 1)
            {
LABEL_c545e5:
                v14 = 16;
                continue;
            }
            else
            {
LABEL_c545e6:
            }
        }
        if (v14 == a2 && !_memcmp(v2, a1, a2) || v14 >= 2 && *(short *)v2 == 0x5f5f && *a1 == 46 && v14 - 1 == a2 && !_memcmp(v2 + 2, a1 + 1))
        {
            v17 = (char)v2[64];
            v18 = 3;
            v19 = v17 & 0xff;
            v20 = 18;
            if (18 >= v17)
            {
                v21 = 1 << ((char)v17 & 31);
                v18 = 9;
                v19 = v21 & 266242;
                v20 = 0;
                if (v21 & 266242)
                    return 1;
            }
            v22 = (long long)v2[40];
            if (!v22)
                return 1;
            v23 = (int)v2[48];
            v24 = a0->field_50 - v23;
            if (v23 <= a0->field_50)
            {
                v25 = arm64g_calculate_condition(v18 | 32, v19, v20, 0);
                v27 = arm64g_calculate_condition(132, (v25 & 1 ? v22 : 0x20000000), (v25 & 1 ? v24 : 0), 0);
                if (!(v27 & 1))
                    return a0->field_48 + v23;
            }
            else
            {
                v28 = arm64g_calculate_condition(v18 | 32, v19, v20, 0);
                v29 = arm64g_calculate_condition(128, (v28 & 1 ? v22 : 0x20000000), (v28 & 1 ? v24 : 0), 0);
                if (!(v29 & 1))
                    return a0->field_48 + v23;
            }
            return 0;
        }
        i = v5 - 80;
        v4 = v6;
        v2 = v6;
    } while (i);
    return 0;
}
