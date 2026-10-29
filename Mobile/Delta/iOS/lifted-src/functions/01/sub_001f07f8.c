/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f07f8..0x1f08c4 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f07f8_1 {
    unsigned int field_0;
} st_1f07f8_1;

typedef struct st_1f07f8_0 {
    char field_0;
} st_1f07f8_0;

extern unsigned long long g_e782c8;
extern unsigned long long g_e782f8;

unsigned long long sub_1f07f8(unsigned long a0, st_1f07f8_1 **a1, unsigned int *a2, unsigned int a3, unsigned long long a4, unsigned long a5, unsigned int a6)
{
    unsigned int v2;  // w15
    unsigned long v3;  // cc_dep1
    unsigned long long v12;  // 4129
    unsigned long v13;  // x15
    unsigned long v14;  // cc_dep1
    unsigned long long v15;  // 4108
    unsigned long long v16;  // 4108
    unsigned long long *v17;  // x14
    unsigned long v4;  // cc_dep2
    unsigned int v5;  // w14
    unsigned int v6;  // w15
    unsigned int v7;  // w14
    unsigned long v8;  // 4112
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // 4112
    st_1f07f8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1f07f8_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (*a1 != a2)
    {
        v2 = *(int *)*a1 - 48;
        v3 = v2;
        v4 = 10;
        if (10 <= v2)
        {
            if (a3 == 16)
            {
                v5 = *(int *)*a1 | 32;
                v6 = v5 - 97;
                v3 = v6;
                v4 = 5;
                if (5 >= v6)
                    v2 = v5 - 87;
                else
                    goto *((void *)(g_e782f8));
            }
            else
            {
                goto *((void *)(g_e782f8));
            }
        }
        v7 = v2 + a3 * 0;
        if (v7 <= a6)
        {
            v8 = arm64g_calculate_condition(147, v3, v4, 0);
            v9 = 3;
            v10 = (v8 & 1 ? v7 : 0);
        }
        else
        {
            v11 = arm64g_calculate_condition(147, v3, v4, 0);
            v9 = 0;
            v10 = (v11 & 1 ? v7 : 0);
        }
        v12 = arm64g_calculate_condition(v9 | 32, v10, 0, 0);
        v13 = !(v12 & 1);
        v14 = v13 & 1;
        if ((unsigned int)v13)
        {
            v15 = arm64g_calculate_condition(19, v14, 0, 0);
            if (!(v15 & 1))
                goto LABEL_1f0862;
            v17 = &g_e782f8;
LABEL_1f0861:
        }
        else
        {
            v16 = arm64g_calculate_condition(19, v14, 0, 0);
            if (v16 & 1)
                goto LABEL_1f0861;
LABEL_1f0862:
            v17 = &g_e782c8;
        }
        goto *((void *)(*v17));
    }
    else if (a4 <= 0)
    {
        return 0;
    }
    else
    {
        return 0xffffffff;
    }
}
