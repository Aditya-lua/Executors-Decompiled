/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9539bc..0x953b30 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9539bc_2 {
    char padding_0[1264];
    struct st_9539bc_0 *field_4f0;
} st_9539bc_2;

typedef struct st_9539bc_0 {
    char padding_0[448];
    unsigned long long field_1c0;
    unsigned int field_1c8;
    char padding_1cc[4];
    struct st_9539bc_1 *field_1d0;
} st_9539bc_0;

typedef struct st_9539bc_1 {
    unsigned long long field_0;
} st_9539bc_1;

extern unsigned long long g_e4e1c0;

unsigned long long sub_9539bc(st_9539bc_2 *a0)
{
    unsigned long long v4;  // x0
    st_9539bc_0 *v5;  // x8
    unsigned long v14;  // x8
    unsigned long long v15;  // 4117
    unsigned long long v6;  // x9
    unsigned int v7;  // w9
    st_9539bc_0 *v8;  // x20
    unsigned long v9;  // x0
    unsigned long v10;  // x21
    unsigned long long v11;  // x0
    unsigned long long v12;  // x8
    unsigned long long v13;  // 4110
    unsigned long long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a0->field_4f0->field_1c0)
        return 0;
    v4 = sub_a7c2c0();
    v5 = a0->field_4f0;
    v6 = v5->field_1c0 - v4;
    if (v5->field_1c0 < v4)
        v6 = 0;
    if (v6 <= &g_e4e1c0)
    {
        if (v5->field_1d0)
            v5->field_1d0();
        v7 = v5->field_1c8 * 2;
        if (v7 >= 60000000)
            v7 = 60000000;
        v5->field_1c8 = v7;
        if (sub_953d38(a0) >> 31 & 1)
            return 0xffffffff;
        v8 = a0->field_4f0;
        if (v8->field_1c0)
        {
            v9 = v8->field_1c8;
        }
        else if (v8->field_1d0)
        {
            v8->field_1d0();
        }
        else
        {
            v9 = 1000000;
            v8->field_1c8 = 1000000;
        }
        v10 = (unsigned int)v9 * 1000;
        v11 = sub_a7c2c0(v9);
        v12 = v11 + v10;
        v13 = arm64g_calculate_condition(50, v11, v10, 0);
        if (!(v13 & 1))
            v12 = 0xffffffffffffffff;
        v8->field_1c0 = v12;
        sub_95f850();
        v14 = a0->field_4f0->field_1c0 + 999;
        v15 = arm64g_calculate_condition(50, a0->field_4f0->field_1c0, 999, 0);
        if (!(v15 & 1))
            v14 = 0xffffffffffffffff;
        v0 = (v14 >> 9) / 1953125;
        v1 = ((unsigned int)v14 - 1000000000 * (unsigned int)v0) / 1000;
        sub_9d46fc();
        return sub_9ad538(a0);
    }
    return 0;
}
