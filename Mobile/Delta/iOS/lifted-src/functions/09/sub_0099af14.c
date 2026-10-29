/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99af14..0x99b03c (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99af14_0 {
    char padding_0[16];
    unsigned int field_10;
} st_99af14_0;

typedef struct st_99af14_3 {
    unsigned int field_0;
    char padding_4[212];
    struct st_99af14_2 *field_d8;
} st_99af14_3;

typedef struct st_99af14_4 {
    char padding_0[24];
    struct st_99af14_3 *field_18;
    char padding_20[40];
    unsigned int field_48;
} st_99af14_4;

typedef struct st_99af14_2 {
    char padding_0[80];
    unsigned int field_50;
} st_99af14_2;

typedef struct st_99af14_1 {
    unsigned int field_0[2];
    unsigned int field_4;
} st_99af14_1;

extern char g_e88ec8;

unsigned int sub_99af14(st_99af14_4 *a0, unsigned int a1, unsigned int a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    st_99af14_0 *v0;  // x1
    unsigned long v1;  // cc_dep1
    unsigned int v10;  // w11
    unsigned long long v11;  // x9
    st_99af14_1 *v2;  // x8
    unsigned long v3;  // x9
    unsigned int v4;  // w10
    unsigned int v5;  // w10
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4105
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4105

    v0 = a3 + a1 * 40;
    if (!v0->field_10)
    {
        return 1;
    }
    else if (*(int *)&v0[1].padding_0[0])
    {
        return 1;
    }
    else
    {
        *(unsigned int *)&v0[1].padding_0[0] = 1;
        v1 = a1;
        if (28 >= a1)
        {
            v2 = &(&g_e88ec8)[a1 * 56];
            v3 = v2->field_0[1];
            if (a2 & 0x800 || a0->field_18->field_d8->field_50 & 8)
            {
                v4 = (a2 * 0x200000 | a2 >> 11) & 0xffe00001 & 1;
                if (v3 >> 2 & 1 && !(!(a0->field_18->field_d8->field_50 & 8) & a2 >> 11))
                    return 1;
            }
            else
            {
                v5 = a0->field_18->field_0;
                if (0x303 < (int)v5)
                {
                    v6 = arm64g_calculate_condition(195, v1, 28, 0);
                    v7 = arm64g_calculate_condition(3, (v6 & 1 ? v5 : 0x40000000), (v6 & 1 ? 0x10000 : 0), 0);
                    v4 = !(v7 & 1);
                }
                else
                {
                    v8 = arm64g_calculate_condition(195, v1, 28, 0);
                    v9 = arm64g_calculate_condition(0, (v8 & 1 ? v5 : 0x40000000), (v8 & 1 ? 0x10000 : 0), 0);
                    v4 = !(v9 & 1);
                }
            }
            if (!(v3 >> 3 & 1) && a0->field_48 == 0x300)
                return 1;
            if (v4 & 1 & (unsigned int)v3 >> 4 & 1)
                return 1;
            if ((unsigned int)v3 & 32)
                v10 = (a2 * 0x2000000 | a2 >> 7) & 4261412865 & 1;
            else
                v10 = 1;
            if ((v10 | v4) != 1)
                return 1;
            if (!*(int *)&a0[1].padding_20[12])
                v4 = 1;
            if (v3 >> 5 & 1 && !v4)
                return 1;
            if (v3 >> 6 & 1 && a0[16].field_48)
                return 1;
            v11 = 16;
            if (!*(int *)&a0[1].padding_20[12])
                v11 = 24;
            if (*(long long *)((char *)v2 + v11))
                goto *((void *)(*(long long *)((char *)v2 + v11)));
        }
    }
}
