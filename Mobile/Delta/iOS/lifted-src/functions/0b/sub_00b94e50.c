/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb94e50..0xb94fac (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b94e50_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char field_18;
} st_b94e50_0;

extern unsigned long long g_e0ddf0[4];
extern unsigned long long g_e0de70[4];
extern unsigned long long g_e0def0[4];
extern unsigned long long g_e0df70[4];

int sub_b94e50(st_b94e50_0 *a0, char a1)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x8
    unsigned long long v10;  // x10
    unsigned long long v11;  // x11
    unsigned long long v12;  // 4121
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4107
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4107
    unsigned long long v17;  // x11
    unsigned long long v18;  // 4121
    unsigned long long v2;  // x11
    unsigned long long v3;  // 4121
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4107
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4107
    unsigned long long v8;  // x11
    unsigned int v9;  // w9

    v0 = g_e0ddf0[a1];
    v1 = a0->field_0;
    switch (v1)
    {
    case 9:
        if (g_e0de70[a0->field_18] < v0)
            return 1;
        break;
    case 8:
        if (7 < v0)
            return 1;
        break;
    case 6:
        if (a0->field_8 != 9223372036854775810)
            goto LABEL_b94ebc;
        v2 = a0->field_10 & 0x7fffffffffffffff;
        v3 = arm64g_calculate_condition(210, a0->field_10, 1, 0);
        if (v3 & 1)
        {
            v4 = arm64g_calculate_condition(212, a0->field_8, 9223372036854775810, 0);
            v5 = arm64g_calculate_condition(196, (v4 & 1 ? v2 : 0), (v4 & 1 ? 0x7fefffffffffffff : 0), 0);
            if (!(v5 & 1))
                goto LABEL_b94eae;
            v8 = 9;
LABEL_b94ead:
        }
        else
        {
            v6 = arm64g_calculate_condition(212, a0->field_8, 9223372036854775810, 0);
            v7 = arm64g_calculate_condition(192, (v6 & 1 ? v2 : 0), (v6 & 1 ? 0x7fefffffffffffff : 0), 0);
            if (v7 & 1)
                goto LABEL_b94ead;
            v8 = 7;
LABEL_b94eae:
        }
        if (v8 < v0)
            return 1;
        break;
    default:
LABEL_b94ebc:
        if (v0 > 9)
            return 1;
    }
    v9 = a1;
    v10 = g_e0def0[v9];
    switch (v1)
    {
    case 9:
        if (v10 != g_e0df70[a0->field_18])
            return 0;
        break;
    case 8:
        if (v10 != 7)
            return 0;
        break;
    case 6:
        if (a0->field_8 != 9223372036854775810)
            goto LABEL_b94f60;
        v11 = a0->field_10 & 0x7fffffffffffffff;
        v12 = arm64g_calculate_condition(210, a0->field_10, 1, 0);
        if (v12 & 1)
        {
            v13 = arm64g_calculate_condition(212, a0->field_8, 9223372036854775810, 0);
            v14 = arm64g_calculate_condition(196, (v13 & 1 ? v11 : 0), (v13 & 1 ? 0x7fefffffffffffff : 0), 0);
            if (!(v14 & 1))
                goto LABEL_b94f36;
            v17 = 9;
LABEL_b94f35:
        }
        else
        {
            v15 = arm64g_calculate_condition(212, a0->field_8, 9223372036854775810, 0);
            v16 = arm64g_calculate_condition(192, (v15 & 1 ? v11 : 0), (v15 & 1 ? 0x7fefffffffffffff : 0), 0);
            if (v16 & 1)
                goto LABEL_b94f35;
            v17 = 7;
LABEL_b94f36:
        }
        if (v10 != v17)
            return 0;
        break;
    default:
LABEL_b94f60:
        if (v10 != 9)
            return 0;
    }
    v18 = arm64g_calculate_condition(33, v9 - 7, 2, 0);
    return !(v18 & 1);
}
