/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96a23c..0x96a380 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96a23c_1 {
    char padding_0[216];
    struct st_96a23c_0 *field_d8;
} st_96a23c_1;

typedef struct st_96a23c_0 {
    char padding_0[80];
    unsigned int field_50;
} st_96a23c_0;

typedef struct st_96a23c_2 {
    char padding_0[24];
    struct st_96a23c_1 *field_18;
    char padding_20[321];
    char field_161;
    char padding_162[686];
    unsigned int field_410;
    unsigned int field_414;
    unsigned int field_418;
    unsigned int field_41c;
} st_96a23c_2;


long long sub_96a23c(st_96a23c_2 *a0, void* a1, long long a2, unsigned int a3)
{
    unsigned long v2;  // cc_dep1
    unsigned long long v3;  // x8
    unsigned long long v4;  // 4107
    unsigned long long v5;  // 4107
    unsigned long long v6;  // x9
    void* v7;  // x1
    st_96a23c_2 *v8;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18->field_d8->field_50 & 8;
    if (!(a0->field_18->field_d8->field_50 & 8))
    {
        v3 = 44;
        v4 = arm64g_calculate_condition(9, v2, 0, 0);
        if (!(v4 & 1))
            goto LABEL_96a276;
LABEL_96a275:
        v6 = 48;
    }
    else
    {
        v3 = 52;
        v5 = arm64g_calculate_condition(9, v2, 0, 0);
        if (v5 & 1)
            goto LABEL_96a275;
        v6 = 56;
LABEL_96a276:
    }
    if (!(a0->field_410 & (int)a1[28]) && !(a0->field_414 & (int)a1[32]) && a0->field_41c)
    {
        v7 = a1;
        if (!(a0->field_161 >> 6 & 1) || (v7 = a1, 2 >= sub_95c238(v7) + 0xfcffecff))
        {
            v8 = a0;
            if (0 >= (int)sub_9ae69c() && !(sub_9ae69c(v8, *(int *)((char *)a1 + v6), v8->field_418) >> 31 & 1))
                return !sub_959e54(v8, a2, (int)v7[0x44], 0, v7);
        }
    }
    return 1;
}
