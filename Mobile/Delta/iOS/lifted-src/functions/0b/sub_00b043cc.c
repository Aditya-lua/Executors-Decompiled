/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb043cc..0xb04464 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b043cc_0 {
    uint128_t field_0;
    uint128_t field_10;
    char field_18;
    char padding_19[7];
    uint128_t field_20;
    uint128_t field_30;
    char field_38;
    char padding_39[7];
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
} st_b043cc_0;


long long sub_b043cc(void* a0, st_b043cc_0 *a1)
{
    unsigned long v2;  // x0
    uint128_t v3;  // q0
    uint128_t v4;  // q1
    uint128_t v5;  // q2
    uint128_t v6;  // q4
    uint128_t v7;  // q3
    unsigned long long v8;  // x8
    uint128_t v9;  // q5
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((long long)a0[96])
    {
        v2 = sub_a4e0ac((long long)a0[96]);
        if (!(unsigned int)v2)
            return v2;
    }
    if ((long long)a0[88] && !sub_a4e0ac((long long)a0[88]))
    {
        sub_a4bbe4((long long)a0[96]);
        return 0;
    }
    v3 = *(int128_t *)a0;
    v4 = (int128_t)a0[16];
    v5 = (int128_t)a0[32];
    a1->field_20 = (int128_t)a0[48];
    v6 = (int128_t)a0[80];
    v7 = (int128_t)a0[96];
    v8 = (long long)a0[112];
    v9 = (int128_t)a0[64];
    a1->field_10 = v4;
    *(uint128_t *)&a1->field_18 = v5;
    a1->field_0 = v3;
    *(unsigned long long *)&a1->field_50 = v8;
    *(uint128_t *)&a1->field_38 = v6;
    a1->field_40 = v7;
    a1->field_30 = v9;
    memset((char *)&a1->field_20 + 8, 0, 24);
    return sub_a97af4((char *)&a1->field_10 + 8, a0 + 24) != 0;
}
