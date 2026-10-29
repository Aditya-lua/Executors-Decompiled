/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x953888..0x9539bc (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_953888_0 {
    struct st_953888_0 *field_0;
    char padding_8[991];
    char field_3e7;
    char padding_3e8[264];
    struct st_953888_1 *field_4f0;
} st_953888_0;

typedef struct st_953888_2 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_953888_2;

typedef struct st_953888_3 {
    char padding_0[265];
    struct st_953888_1 *field_109;
} st_953888_3;

typedef struct st_953888_1 {
    char padding_0[296];
    struct st_953888_0 *field_128;
    struct st_953888_0 *field_130;
    char padding_138[136];
    struct st_953888_0 *field_1c0;
} st_953888_1;

extern st_953888_0 g_e4e1c1;

st_953888_0 * sub_953888(st_953888_0 *a0, int a1, st_953888_0 *a2, st_953888_2 *a3)
{
    st_953888_0 *v3;  // x0
    st_953888_0 *v4;  // x8
    st_953888_3 *v5;  // x9
    unsigned long long v6;  // 4109
    unsigned long long v8;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0 || (int)a0->field_0)
        return 0;
    switch (a1)
    {
    case 74:
        return sub_9539bc();
    case 17:
        if (a2 >= 208)
        {
            a0->field_4f0->field_130 = a2;
            return a2;
        }
        break;
    case 120:
        if (a2 >= 0x100)
        {
            a0->field_4f0->field_128 = a2;
            return 1;
        }
        break;
    case 73:
        if (a0->field_4f0->field_1c0)
        {
            v3 = sub_a7c2c0();
            v4 = a0->field_4f0->field_1c0 - v3;
            if (a0->field_4f0->field_1c0 < v3)
                v4 = 0;
            v5 = &v4->field_3e7;
            v6 = arm64g_calculate_condition(50, v4, 999, 0);
            if (!(v6 & 1))
                v5 = 0xffffffffffffffff;
            if (v4 < &g_e4e1c1.field_0)
                v5 = 999;
            v8 = (v5 >> 9) / 1953125;
            a3->field_0 = v8;
            a3->field_8 = ((unsigned int)v5 - 1000000000 * (unsigned int)v8) / 1000;
            return 1;
        }
        else
        {
            return 0;
        }
    case 121:
        return 0x100;
    default:
        return sub_954bdc();
    }
    return 0;
}
