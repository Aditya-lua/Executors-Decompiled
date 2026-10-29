/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9694fc..0x9696b0 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9694fc_1 {
    char padding_0[1616];
    unsigned long long field_650;
    char padding_658[8];
    struct st_9694fc_0 *field_660;
} st_9694fc_1;

typedef struct st_9694fc_0 {
    char padding_0[16];
    unsigned short field_10;
} st_9694fc_0;

typedef struct st_9694fc_5 {
    char padding_0[208];
    unsigned long long field_d0;
} st_9694fc_5;

typedef struct st_9694fc_7 {
    char padding_0[8];
    struct st_9694fc_1 *field_8;
    char padding_10[8];
    struct st_9694fc_3 *field_18;
    char padding_20[736];
    struct st_9694fc_4 *field_300;
    char padding_308[1400];
    struct st_9694fc_6 *field_880;
} st_9694fc_7;

typedef struct st_9694fc_3 {
    char padding_0[216];
    struct st_9694fc_2 *field_d8;
} st_9694fc_3;

typedef struct st_9694fc_4 {
    char padding_0[32];
    unsigned int field_20;
} st_9694fc_4;

typedef struct st_9694fc_6 {
    unsigned long long field_0;
    char padding_8[24];
    struct st_9694fc_5 *field_20;
} st_9694fc_6;

typedef struct st_9694fc_2 {
    char padding_0[80];
    unsigned int field_50;
} st_9694fc_2;

typedef struct st_9694fc_8 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_9694fc_8;

extern st_9694fc_8 g_d282ae;
extern unsigned long long g_e88218;

unsigned long long sub_9694fc(st_9694fc_7 *a0, unsigned long long a1)
{
    unsigned long long v2;  // 4139
    unsigned long long v3;  // x0
    unsigned long long v4;  // w8
    unsigned long long v5;  // 4109
    unsigned long long v6;  // 4109
    unsigned long v7;  // x8
    st_9694fc_0 *v8;  // x20
    unsigned long v9;  // x8
    unsigned long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = arm64g_calculate_condition(1, a1 & 0xffffffff, 1, 0);
    if (v2 & 1)
    {
        if (*(int *)&a0->padding_20[88])
        {
            if (!*(long long *)&a0->padding_20[248])
                return 0;
            a1 = 0;
            do
            {
                v3 = sub_95a098(a1, a0->field_8);
                if (v3 && a0->field_300->field_20 & *(int *)(v3 + 4))
                {
                    if ((unsigned int)a1 == 4)
                        goto LABEL_969670;
                    goto LABEL_9695c4;
                }
            } while ((a1 += 1, (unsigned long long)*(long long *)&a0->padding_20[248] > a1));
            a1 = 0xffffffff;
            if (0)
            {
LABEL_969670:
                if (a0->field_300->field_20 == 32)
                {
                    a1 = 4;
                    goto LABEL_969520;
                }
                else if (*(long long *)&a0->field_880->field_20[1].padding_0[32])
                {
                    a1 = 6;
                    goto LABEL_969520;
                }
                else
                {
                    v4 = 4;
                    v6 = arm64g_calculate_condition(4, a0->field_880->field_20->field_d0, 0, 0);
                    if (!(v6 & 1))
                    {
LABEL_9695e2:
                        a1 = v4 + 1;
LABEL_9695e4:
                        goto LABEL_969520;
                    }
LABEL_9695e1:
                    a1 = v4;
                    goto LABEL_9695e4;
                }
            }
LABEL_9695c4:
            if ((unsigned int)a1 == 5)
            {
                v4 = 5;
                v5 = arm64g_calculate_condition(4, *(long long *)&a0->field_880->field_20[1].padding_0[32], 0, 0);
                if (!(v5 & 1))
                    goto LABEL_9695e2;
                goto LABEL_9695e1;
            }
            goto LABEL_969518;
            goto LABEL_969520;
        }
        else
        {
            a1 = 3435973837 * (a0->field_880->field_0 - (char *)a0->field_880->field_20 >> 3);
        }
    }
LABEL_969518:
    if (8 < (unsigned int)a1)
        return 0;
LABEL_969520:
    if (a0->field_18->field_d8->field_50 & 2 || (unsigned int)a1)
    {
        v7 = a0->field_8->field_650;
        if (!a0->field_8->field_650)
            return 0;
        v8 = a0->field_8->field_660;
        while (1)
        {
            v9 = v7;
            if (v8->field_10 == (&g_d282ae.field_0)[a1 & 0xffffffff])
                break;
            v8 += 4;
            v7 = v9 - 1;
            if (v9 == 1)
                return 0;
        }
        if (!*(int *)&v8[2].padding_0[8])
        {
            return 0;
        }
        else if (*(int *)&v8[1].padding_0[2])
        {
            v10 = sub_95a688();
            if (!v10)
                return v10;
        }
    }
    else
    {
        v8 = &g_e88218;
    }
    if (!sub_96b14c(a0, 0x5000b, v8))
        v8 = 0;
    return v8;
}
