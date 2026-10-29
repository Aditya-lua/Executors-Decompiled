/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971860..0x971958 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_971860_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[16];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    char padding_60[16];
    void* field_70;
    void* field_78;
    void* field_80;
    void* field_88;
    void* field_90;
    void* field_98;
} st_971860_0;


int sub_971860(st_971860_0 *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x9
    unsigned long v1;  // x8
    unsigned long v10;  // x9
    unsigned int v11;  // w9
    unsigned long v2;  // x10
    unsigned long long v3;  // x10
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102

    v0 = a1[1];
    v1 = a0->field_40;
    v2 = a0->field_38 - v0;
    a0->field_38 = v2;
    v3 = v1 - v2;
    v4 = v1;
    v5 = v2;
    if (v1 > v2)
    {
        if (v3 <= v1 >> 1)
        {
            v6 = arm64g_calculate_condition(148, v4, v5, 0);
            v7 = arm64g_calculate_condition(52, (v6 & 1 ? v1 : 0x20000000), (v6 & 1 ? a0->field_48 : 0), 0);
            if (!(v7 & 1))
                goto LABEL_971888;
        }
        else
        {
            v8 = arm64g_calculate_condition(148, v4, v5, 0);
            v9 = arm64g_calculate_condition(48, (v8 & 1 ? v1 : 0x20000000), (v8 & 1 ? a0->field_48 : 0), 0);
            if (!(v9 & 1))
            {
LABEL_971888:
                if (a0->field_30 * 3 < v3)
                    goto LABEL_9718e4;
            }
        }
    }
    if (*a1 > a0->field_58)
    {
        if (a0->field_48 > v1)
        {
            v1 += v0;
        }
        else
        {
            v10 = a0->field_50 + v0;
            a0->field_50 = v10;
            if (v10 < v1)
                goto LABEL_9718e0;
            a0->field_50 = v10 - v1;
            v1 += a0->field_30;
        }
        a0->field_40 = v1;
LABEL_9718e0:
        *(unsigned int *)&a0->field_70 = 0;
    }
LABEL_9718e4:
    if (a0->field_78)
        *(unsigned long long *)a0->field_78 = a0->field_30;
    if (a0->field_80)
        *(unsigned long *)a0->field_80 = v1;
    if (a0->field_88)
        *(unsigned long long *)a0->field_88 = a0->field_18;
    if (a0->field_90)
        *(unsigned long long *)a0->field_90 = a0->field_38;
    if (!a0->field_98)
        return 1;
    if ((int)a0->field_70)
    {
        v11 = 82;
    }
    else if (a0->field_40 < a0->field_48)
    {
        v11 = 83;
    }
    else
    {
        v11 = 65;
    }
    *(unsigned int *)a0->field_98 = v11;
    return 1;
}
