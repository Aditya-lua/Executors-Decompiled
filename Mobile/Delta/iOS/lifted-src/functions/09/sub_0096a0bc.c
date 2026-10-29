/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96a0bc..0x96a23c (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96a0bc_1 {
    char padding_0[1616];
    unsigned long long field_650;
    char padding_658[8];
    struct st_96a0bc_0 *field_660;
    unsigned int field_668;
} st_96a0bc_1;

typedef struct st_96a0bc_3 {
    unsigned short field_0;
} st_96a0bc_3;

typedef struct st_96a0bc_4 {
    char padding_0[8];
    struct st_96a0bc_1 *field_8;
    char padding_10[104];
    unsigned int field_78;
    char padding_7c[2052];
    struct st_96a0bc_2 *field_880;
} st_96a0bc_4;

typedef struct st_96a0bc_0 {
    char padding_0[16];
    unsigned short field_10;
    char padding_12[14];
    int field_20;
} st_96a0bc_0;

typedef struct st_96a0bc_5 {
    char padding_0[4];
    unsigned int field_4;
} st_96a0bc_5;

typedef struct st_96a0bc_2 {
    char padding_0[30];
    unsigned short field_1e;
    char padding_20[48];
    struct st_96a0bc_3 *field_50;
} st_96a0bc_2;

extern unsigned int g_d282a4;
extern unsigned int g_d282a6;

unsigned long long sub_96a0bc(unsigned int *a0, st_96a0bc_4 *a1, long long a2)
{
    st_96a0bc_2 *v2;  // x8
    unsigned int v3;  // w9
    unsigned long v12;  // x8
    st_96a0bc_0 *v13;  // x22
    unsigned long v14;  // x8
    st_96a0bc_5 *v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned short *v4;  // x23
    unsigned int v5;  // x24
    unsigned int v6;  // w25
    unsigned int v7;  // x0
    unsigned long v8;  // cc_dep1
    unsigned long long v9;  // 4105
    unsigned long long v10;  // 4105
    unsigned int v11;  // x26
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_880;
    v3 = v2->field_1e & 3;
    if (1 < (int)v3)
    {
        v8 = v3 & 0xffff;
        if (v3 == 2)
        {
            v5 = 1;
            v9 = arm64g_calculate_condition(3, v8, 2, 0);
            if (!(v9 & 1))
                goto LABEL_96a142;
LABEL_96a141:
            v4 = &g_d282a6;
        }
        else
        {
            v5 = 2;
            v10 = arm64g_calculate_condition(3, v8, 2, 0);
            if (v10 & 1)
                goto LABEL_96a141;
LABEL_96a142:
            v4 = &g_d282a4;
        }
        goto LABEL_96a16c;
    }
    if (!v3)
    {
        if (a1->field_78 == 1 && (v4 = v2->field_50, v2->field_50))
        {
            v5 = *(long long *)&v2[1].padding_0[0];
            if (!*(long long *)&v2[1].padding_0[0])
                goto LABEL_96a210;
            goto LABEL_96a16c;
        }
        v4 = *(long long *)&v2->padding_20[32];
        if (*(long long *)&v2->padding_20[32])
        {
            v5 = *(long long *)&v2->padding_20[40];
            if (!*(long long *)&v2->padding_20[40])
                goto LABEL_96a210;
LABEL_96a16c:
            v11 = 0;
            v6 = 11;
            v7 = (unsigned int)a0;
            do
            {
                v12 = a1->field_8->field_650;
                if (a1->field_8->field_650)
                {
                    v13 = a1->field_8->field_660;
                    do
                    {
                        v14 = v12;
                        if (v13->field_10 == *v4 && *(int *)&v13[1].padding_0[8])
                        {
                            v15 = sub_95a098(v13->field_20);
                            v7 = (unsigned int)v15;
                            if (v7)
                            {
                                v7 = (unsigned int)v15;
                                if (*(int *)(v7 + 4) & v6)
                                {
                                    v16 = sub_96b14c(a1, a2, v13);
                                    v7 = v16;
                                    if (v7)
                                    {
                                        v6 &= ~v15->field_4;
                                        v7 = v16;
                                        break;
                                    }
                                }
                            }
                        }
                    } while ((v13 += 2, v12 = v14 - 1, v14 != 1));
                }
            } while ((v11 += 1, v4 += 1, v11 != v5));
        }
        else
        {
            v4 = *(long long *)&a1->field_8->field_668;
            v5 = (unsigned int)a1->field_8->padding_658;
            if (a1->field_8->padding_658)
                goto LABEL_96a16c;
LABEL_96a210:
            v6 = 11;
            v7 = (unsigned int)a0;
        }
    }
    else
    {
        v4 = &g_d282a4;
        v5 = 1;
        goto LABEL_96a16c;
    }
    v17 = v7;
    *a0 = *a0 | v6;
    return v17;
}
