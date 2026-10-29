/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac3a34..0xac3b54 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac3a34_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    unsigned int field_98;
    char padding_9c[4];
    uint128_t field_a0;
    uint128_t field_b0;
    uint128_t field_c0;
} st_ac3a34_0;


unsigned int sub_ac3a34(st_ac3a34_0 *a0, unsigned long long a1)
{
    unsigned int idx;  // x19
    uint128_t v3;  // q1
    uint128_t v4;  // q1
    uint128_t v5;  // q0
    uint128_t v6;  // q1
    uint128_t v7;  // q0
    uint128_t v8;  // q0
    unsigned int v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    idx = sub_a6bffc(208, "crypto/slh_dsa/slh_dsa_key.c", 152);
    if (!idx)
        return idx;
    v3 = a0->field_a0;
    *(int128_t *)(idx + 160) = *(int128_t *)&a0->field_98;
    *(uint128_t *)(idx + 176) = v3;
    *(uint128_t *)(idx + 192) = a0->field_b0;
    v4 = a0->field_70;
    *(uint128_t *)(idx + 96) = a0->field_60;
    *(uint128_t *)(idx + 112) = v4;
    v5 = a0->field_90;
    *(uint128_t *)(idx + 128) = a0->field_80;
    *(uint128_t *)(idx + 144) = v5;
    v6 = a0->field_30;
    *(uint128_t *)(idx + 32) = a0->field_20;
    *(uint128_t *)(idx + 48) = v6;
    v7 = a0->field_50;
    *(uint128_t *)(idx + 64) = a0->field_40;
    *(uint128_t *)(idx + 80) = v7;
    v8 = a0->field_10;
    *(uint128_t *)idx = a0->field_0;
    *(uint128_t *)(idx + 16) = v8;
    *(unsigned long long *)(idx + 144) = 0;
    *(unsigned long long *)(idx + 128) = 0;
    *(unsigned int *)(idx + 152) = 0;
    if ((long long)a0->field_b0 && (long long)a0->field_b0 != *(long long *)((char *)&a0->field_a0 + 8))
        sub_a40a98();
    if (*(long long *)((char *)&a0->field_a0 + 8))
        sub_a40a98(*(long long *)((char *)&a0->field_a0 + 8));
    if (*(long long *)((char *)&a0->field_b0 + 8))
        sub_a382a4(*(long long *)((char *)&a0->field_b0 + 8));
    if (!(long long)a0->field_90 || !(v9 = sub_a6d9b4(a0->field_90, "crypto/slh_dsa/slh_dsa_key.c", 160), *(unsigned long long *)(idx + 144) = v9, !v9))
    {
        if (a1 & 3)
        {
            if ((long long)a0->field_80)
                *(unsigned long long *)(idx + 128) = idx + *(int *)(*(long long *)(idx + 160) + 16) * 2;
            if (!(a1 & 1))
                return idx;
            *(int *)(idx + 152) = *(int *)((char *)&a0->field_90 + 8);
            return idx;
        }
        else
        {
            return idx;
        }
    }
    sub_ac39b4(idx);
    return 0;
}
