/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96b360..0x96b4b0 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96b360_1 {
    char padding_0[1616];
    unsigned long long field_650;
    char padding_658[8];
    struct st_96b360_0 *field_660;
} st_96b360_1;

typedef struct st_96b360_3 {
    int field_0;
    char padding_4[212];
    struct st_96b360_2 *field_d8;
} st_96b360_3;

typedef struct st_96b360_4 {
    char padding_0[8];
    struct st_96b360_1 *field_8;
    char padding_10[8];
    struct st_96b360_3 *field_18;
} st_96b360_4;

typedef struct st_96b360_0 {
    char padding_0[16];
    unsigned short field_10;
    char padding_12[2];
    unsigned int field_14;
    char padding_18[4];
    unsigned int field_1c;
} st_96b360_0;

typedef struct st_96b360_2 {
    char padding_0[80];
    char field_50;
} st_96b360_2;


char sub_96b360(st_96b360_4 *a0, long long a1, unsigned short *a2, unsigned long a3)
{
    char v2;  // x23
    char v3;  // x25
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // 4112
    unsigned long long v14;  // 4105
    unsigned long v4;  // x8
    st_96b360_0 *iter;  // x24
    unsigned long v6;  // x8
    unsigned long v7;  // cc_dep1
    unsigned int v8;  // w8
    unsigned long v9;  // 4112
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3)
    {
        v2 = 0;
        v3 = 0;
        do
        {
            v4 = a0->field_8->field_650;
            if (a0->field_8->field_650)
            {
                iter = a0->field_8->field_660;
                do
                {
                    v6 = v4;
                    if (iter->field_10 == *a2 && *(int *)&iter[1].padding_0[12] && sub_969d00(a0, iter))
                    {
                        if (!sub_c68d5c(a1, *a2, 2))
                        {
                            return 0;
                        }
                        else if (v2 || a0->field_18->field_d8->field_50 >> 3 & 1)
                        {
                            v2 = 1;
                            break;
                        }
                        else
                        {
                            v2 = 1;
                            if (a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
                            {
                                v7 = iter->field_1c;
                                if (iter->field_1c == 6)
                                {
                                    v2 = 0;
                                    break;
                                }
                                else
                                {
                                    v8 = iter->field_14;
                                    if (v8 != 64)
                                    {
                                        v9 = arm64g_calculate_condition(19, v7, 6, 0);
                                        v10 = 3;
                                        v11 = (v9 & 1 ? v8 : 0x40000000);
                                        v12 = (v9 & 1 ? 675 : 0);
                                    }
                                    else
                                    {
                                        v13 = arm64g_calculate_condition(19, v7, 6, 0);
                                        v10 = 0;
                                        v11 = (v13 & 1 ? v8 : 0x40000000);
                                        v12 = (v13 & 1 ? 675 : 0);
                                    }
                                    v14 = arm64g_calculate_condition(v10, v11, v12, 0);
                                    v2 = !(v14 & 1);
                                    break;
                                }
                            }
                        }
                    }
                } while ((iter = &iter[2].padding_0[8], v4 = v6 - 1, v6 != 1));
            }
        } while ((v3 += 1, a2 += 1, v3 != a3));
        if (v2)
            return v2;
    }
    sub_a368c8();
    sub_a369bc("ssl/t1_lib.c", 3434, "tls12_copy_sigalgs");
    sub_a36abc(20, 118, 0);
    return 0;
}
