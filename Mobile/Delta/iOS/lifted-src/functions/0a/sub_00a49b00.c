/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa49b00..0xa49ba8 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a49b00_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40[28];
    char field_4c;
    char padding_4d[15];
    uint128_t field_5c;
    uint128_t field_6c;
    uint128_t field_7c;
    uint128_t field_8c;
    char field_9c[28];
    char field_a8;
    char padding_a9[15];
    uint128_t field_b8;
    uint128_t field_c8;
    uint128_t field_d8;
    uint128_t field_e8;
    char field_f8[28];
    char field_104;
    char padding_105[15];
    unsigned long long field_114;
} st_a49b00_1;

typedef struct st_a49b00_0 {
    char padding_0[260];
    uint128_t field_104;
    uint128_t field_114;
    uint128_t field_124;
    uint128_t field_134;
    uint128_t field_144;
    uint128_t field_150;
    uint128_t field_160;
    uint128_t field_170;
    uint128_t field_180;
    uint128_t field_190;
    uint128_t field_1a0;
    uint128_t field_1ac;
    uint128_t field_1bc;
    uint128_t field_1cc;
    uint128_t field_1dc;
    uint128_t field_1ec;
    uint128_t field_1fc;
    uint128_t field_208;
    unsigned long long field_218;
} st_a49b00_0;

typedef struct st_a49b00_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40[28];
    char field_4c;
    char padding_4d[15];
    unsigned long long field_5c;
} st_a49b00_2;


double sub_a49b00(long long a0, long long a1)
{
    st_a49b00_0 *v2;  // x19
    unsigned long long v3;  // x0
    st_a49b00_1 *v4;  // x20
    uint128_t v5;  // q0
    uint128_t v6;  // q1
    uint128_t v7;  // q2
    uint128_t v8;  // q3
    uint128_t v9;  // q4
    uint128_t v10;  // q5
    st_a49b00_2 *v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    v3 = sub_a50904(a0);
    if ((int)v3 >= 1)
    {
        sub_aaabf4(v2, v3, a1);
        v4 = (v2->padding_0)[1];
        sub_a7d710(v4);
        v5 = v4->field_20;
        v6 = v4->field_30;
        v2->field_170 = v5;
        v2->field_180 = v6;
        v7 = *(int128_t *)&v4->field_40[0];
        v2->field_190 = v7;
        v8 = v2->field_144;
        *(uint128_t *)((char *)&v2->field_190 + 12) = v8;
        v9 = v4->field_0;
        v10 = v4->field_10;
        v2->field_150 = v9;
        v2->field_160 = v10;
        v11 = (char *)&v2->field_1a0 + 12;
        v11->field_20 = v5;
        v11->field_30 = v6;
        *(uint128_t *)&v11->field_40[0] = v7;
        *(uint128_t *)&v11->field_40[12] = v8;
        v11->field_0 = v9;
        v11->field_10 = v10;
        *(unsigned long long *)((char *)&v2->field_1fc + 8) = 0xffffffffffffffff;
    }
    return (unsigned long long)v5;
}
