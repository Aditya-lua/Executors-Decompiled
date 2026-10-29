/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x968444..0x968490 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_968444_1 {
    struct st_968444_0 *field_0;
    unsigned long long field_8;
} st_968444_1;

typedef struct st_968444_0 {
    char padding_0[28];
    unsigned short field_1c;
} st_968444_0;


int sub_968444(st_968444_1 **a0, st_968444_1 **a1)
{
    unsigned int v0;  // w9
    st_968444_1 *v1;  // x10
    unsigned int v2;  // w11
    unsigned long long v3;  // x9
    unsigned long long v4;  // x10
    unsigned int v5;  // w8
    unsigned long v6;  // cc_op
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4109

    v0 = *a0->field_0->field_1c;
    v1 = *a1;
    v2 = v1->field_0->field_1c;
    if (v2 == v0)
    {
        v3 = v1->field_8;
        v4 = *a0->field_8;
        v5 = *a0->field_8 > v1->field_8;
        v6 = 4;
    }
    else
    {
        v7 = arm64g_calculate_condition(35, v2 & 0xffff, v0 & 0xffff, 0);
        v5 = !(v7 & 1);
        v6 = 3;
        v4 = v0 & 0xffff;
        v3 = v2 & 0xffff;
    }
    v8 = arm64g_calculate_condition(v6 | 32, v4, v3, 0);
    return v5 - !(v8 & 1);
}
