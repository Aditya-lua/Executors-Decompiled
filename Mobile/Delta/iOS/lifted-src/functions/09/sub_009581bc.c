/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9581bc..0x95834c (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9581bc_1 {
    char padding_0[216];
    struct st_9581bc_0 *field_d8;
} st_9581bc_1;

typedef struct st_9581bc_2 {
    unsigned int field_0;
    char padding_4[20];
    struct st_9581bc_1 *field_18;
} st_9581bc_2;

typedef struct st_9581bc_4 {
    char padding_0[28];
    unsigned short field_1c;
    char padding_1e[2];
    char field_20;
    char padding_21[7];
    unsigned int field_28;
    unsigned int field_2c;
} st_9581bc_4;

typedef struct st_9581bc_0 {
    char padding_0[80];
    char field_50;
} st_9581bc_0;

typedef struct st_9581bc_3 {
    int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9581bc_3;

extern st_9581bc_3 g_d27b38;

st_9581bc_2 * sub_9581bc(st_9581bc_2 *a0, unsigned long long a1, unsigned long long a2, int a3, int a4, st_9581bc_4 *a5)
{
    st_9581bc_2 *v2;  // x22
    unsigned long long v3;  // w0
    unsigned long v12;  // 4112
    unsigned long long v13;  // 4105
    unsigned int v4;  // w8
    unsigned long v5;  // cc_dep1
    unsigned long v6;  // x8
    unsigned long v7;  // x8
    unsigned long v8;  // 4112
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (a1)
        v3 = (unsigned int)sub_962ee4(a1);
    else
        v3 = (unsigned int)sub_962ea8(v2);
    v4 = v3 & ~((long long)(v3) >> 31);
    if ((int)v4 >= 5)
        v4 = 5;
    v5 = v3;
    if (v3 > 0)
    {
        if (0x10000 >= a2)
        {
            switch (a2)
            {
            case 9:
                if (v2)
                {
                    v6 = v2->field_0;
                    if (!(unsigned int)v6)
                    {
LABEL_9582e4:
                        if (!(v2->field_18->field_d8->field_50 >> 3 & 1))
                        {
                            if (a4 >= 0x303)
                                return 1;
                        }
                        else
                        {
                            if (a4 == 0x100)
                                return 0;
                            if (65277 < a4)
                                return 0;
LABEL_958334:
                            return 1;
                        }
                    }
                    else if (v6 >> 7 & 1)
                    {
                        v2 = sub_980dc8(v2);
                        if (!v2)
                            return v2;
                        goto LABEL_9582e4;
                    }
                }
                break;
            case 10:
                if (v3 <= 2)
                    return 1;
                break;
            case 15:
                if (v3 == 1)
                    return 1;
                break;
            default:
LABEL_958300:
                if (a3 >= (&g_d27b38.field_0)[v4])
                    return 1;
            }
        }
        else
        {
            if (2 < a2 + 0xfffeffff)
                goto LABEL_958300;
            if (a3 >= (&g_d27b38.field_0)[v4] && !(a5->field_20 >> 2 & 1) && (v7 = a5->field_28, !(a5->field_28 & 1) && (v3 < 4 || !(a5->field_28 >> 1 & 1)) && (v3 < 3 || a5->field_2c == 772 || a5->field_1c & 390)))
                goto LABEL_958334;
        }
        return 0;
    }
    else
    {
        if (a2 == 262151)
        {
            v8 = arm64g_calculate_condition(3, v5, 0, 0);
            v9 = 3;
            v10 = (v8 & 1 ? a3 : 0);
            v11 = (v8 & 1 ? 79 : 0);
        }
        else
        {
            v12 = arm64g_calculate_condition(3, v5, 0, 0);
            v9 = 0;
            v10 = (v12 & 1 ? a3 : 0);
            v11 = (v12 & 1 ? 79 : 0);
        }
        v13 = arm64g_calculate_condition(v9 | 208, v10, v11, 0);
        return !(v13 & 1);
    }
}
