/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d8fcc..0x9d9074 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d8fcc_0 {
    char padding_0[56];
    unsigned int field_38;
} st_9d8fcc_0;


unsigned long long sub_9d8fcc(st_9d8fcc_0 *a0, long long a1, int a2)
{
    unsigned long long count;  // x0
    unsigned int *v3;  // x0
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned int v4;  // w8
    unsigned long long v5;  // x9
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned int *)___error() = 0;
    count = _write(a0->field_38, a1, a2);
    sub_9d3d58(a0, 15);
    if (1 < (unsigned int)count + 1)
        return count;
    v3 = ___error();
    v4 = *v3;
    v5 = 1 << ((char)v4 & 63) & 144115428594024464;
    if (v4 <= 57)
    {
        v6 = arm64g_calculate_condition(v8 | 144, v9, v10, v11);
        v7 = arm64g_calculate_condition(4, (v6 & 1 ? v5 : 0x40000000), 0, 0);
        if (v7 & 1)
            goto LABEL_9d9068;
    }
    else
    {
        v12 = arm64g_calculate_condition(v8 | 144, v9, v10, v11);
        v13 = arm64g_calculate_condition(0, (v12 & 1 ? v5 : 0x40000000), 0, 0);
        if (v13 & 1)
        {
LABEL_9d9068:
            if (v4 != 100)
                return count;
        }
    }
    sub_9d3d74(a0, 10);
    return count;
}
