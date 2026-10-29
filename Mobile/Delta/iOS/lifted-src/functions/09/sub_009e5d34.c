/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5d34..0x9e5dac (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5d34_0 {
    struct st_9e5d34_1 *field_0;
    unsigned long long field_8;
    unsigned int field_c;
    unsigned int field_10;
} st_9e5d34_0;

typedef struct st_9e5d34_1 {
    unsigned long long field_0;
} st_9e5d34_1;


st_9e5d34_0 * sub_9e5d34(st_9e5d34_0 *a0)
{
    unsigned long v0;  // x8
    unsigned long v1;  // cc_op
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // 4110
    unsigned long long v12;  // 4174
    unsigned int v13;  // w13
    unsigned long i;  // cc_dep1
    unsigned long v3;  // cc_dep2
    unsigned long long v4;  // x10
    unsigned long long v5;  // w9
    unsigned long v6;  // x12
    unsigned long v7;  // 4110
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1

    v0 = *(int *)((char *)&a0->field_8 + 4);
    v1 = 3;
    i = v0 & 0xffffffff;
    v3 = 1;
    if ((int)v0 >= 1)
    {
        v4 = 0;
        v5 = 0;
        v6 = (int)a0->field_8;
        do
        {
            if (*(long long *)&a0->field_0[v4])
            {
                v7 = arm64g_calculate_condition(v1 | 16, i, v3, 0);
                v8 = 4;
                v9 = (v7 & 1 ? v4 : 0);
                v10 = (v7 & 1 ? v6 : 0);
            }
            else
            {
                v11 = arm64g_calculate_condition(v1 | 16, i, v3, 0);
                v8 = 0;
                v9 = (v11 & 1 ? v4 : 0);
                v10 = (v11 & 1 ? v6 : 0);
            }
            v12 = arm64g_calculate_condition(v8 | 160, v9, v10, 0);
            v13 = (int)((unsigned int)!(v12 & 1) * 0x80000000) >> 31 & 0xfffffffe | (unsigned int)!(v12 & 1);
            v4 += 1;
            v5 = ~v13 & v5 | v13 & (unsigned int)v4;
            v1 = 4;
            i = v0;
            v3 = v4;
        } while (i != v3);
    }
    else
    {
        v5 = 0;
    }
    *(unsigned int *)&a0->field_8 = v5;
    a0->field_c = (0xffffffff ^ (long long)(v5 - 1 & ~v5) >> 31) & a0->field_c;
    return a0;
}
