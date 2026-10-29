/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x953b30..0x953c14 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_953b30_2 {
    char padding_0[1264];
    struct st_953b30_0 *field_4f0;
} st_953b30_2;

typedef struct st_953b30_0 {
    char padding_0[448];
    struct st_953b30_1 *field_1c0;
    unsigned int field_1c8;
    char padding_1cc[4];
    struct st_953b30_1 *field_1d0;
} st_953b30_0;

typedef struct st_953b30_1 {
    unsigned long long field_0;
} st_953b30_1;


long long sub_953b30(st_953b30_2 *a0)
{
    st_953b30_0 *v4;  // x20
    unsigned long v5;  // x0
    unsigned long v6;  // x21
    unsigned long long v7;  // x0
    unsigned long long *v8;  // x8
    unsigned long long v9;  // 4110
    unsigned long v10;  // x8
    unsigned long long v11;  // 4117
    unsigned long long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0->field_4f0;
    if (v4->field_1c0)
    {
        v5 = v4->field_1c8;
    }
    else if (v4->field_1d0)
    {
        v4->field_1d0();
    }
    else
    {
        v5 = 1000000;
        v4->field_1c8 = 1000000;
    }
    v6 = (unsigned int)v5 * 1000;
    v7 = sub_a7c2c0(v5);
    v8 = v7 + v6;
    v9 = arm64g_calculate_condition(50, v7, v6, 0);
    if (!(v9 & 1))
        v8 = 0xffffffffffffffff;
    v4->field_1c0 = v8;
    sub_95f850();
    v10 = (char *)&a0->field_4f0->field_1c0[124].field_0 + 7;
    v11 = arm64g_calculate_condition(50, a0->field_4f0->field_1c0, 999, 0);
    if (!(v11 & 1))
        v10 = 0xffffffffffffffff;
    v0 = (v10 >> 9) / 1953125;
    v1 = ((unsigned int)v10 - 1000000000 * (unsigned int)v0) / 1000;
    return sub_9d46fc();
}
