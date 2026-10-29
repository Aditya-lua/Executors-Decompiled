/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ad334..0x9ad3f0 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ad334_2 {
    char padding_0[72];
    unsigned int field_48;
    char padding_4c[172];
    struct st_9ad334_0 *field_f8;
    char padding_100[8];
    unsigned long long field_108;
    char padding_110[488];
    unsigned int field_2f8;
    char padding_2fc[508];
    struct st_9ad334_3 *field_4f8;
} st_9ad334_2;

typedef struct st_9ad334_0 {
    char padding_0[8];
    struct st_9ad334_1 *field_8;
} st_9ad334_0;

typedef struct st_9ad334_3 {
    unsigned long long field_0;
} st_9ad334_3;

typedef struct st_9ad334_1 {
    char field_0;
} st_9ad334_1;


unsigned long long sub_9ad334(st_9ad334_2 *a0, unsigned long long *a1)
{
    unsigned long v2;  // x21
    unsigned long long v3;  // x0
    unsigned long v4;  // cc_dep1
    unsigned long long v5;  // 4105
    unsigned long long v6;  // 4105
    unsigned long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_108;
    if (a0->field_2f8 != 0x101)
    {
        if (*(char *)a0->field_f8->field_8 == 20)
        {
            v3 = sub_9af614(a0);
            if (!(unsigned int)v3)
                return v3;
        }
        v4 = a0->field_48;
        if (a0->field_48 == 0x100)
        {
            v5 = arm64g_calculate_condition(3, v4, 0x100, 0);
            if (!(v5 & 1))
                goto LABEL_9ad392;
LABEL_9ad391:
        }
        else
        {
            v6 = arm64g_calculate_condition(3, v4, 0x100, 0);
            if (v6 & 1)
                goto LABEL_9ad391;
LABEL_9ad392:
        }
        v7 = sub_9544f0();
        if (!(unsigned int)v7)
            return v7;
        v2 = a0->field_108;
        if (a0->field_4f8)
            a0->field_4f8();
    }
    *a1 = v2;
    return 1;
}
