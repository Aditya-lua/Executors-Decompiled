/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d8dc4..0x9d8e40 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d8dc4_1 {
    long long field_0;
    long long field_8;
} st_9d8dc4_1;

typedef struct st_9d8dc4_0 {
    char padding_0[49];
    char field_31;
    char padding_32[14];
    struct st_9d8dc4_1 *field_40;
} st_9d8dc4_0;


int sub_9d8dc4(st_9d8dc4_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long v11;  // cc_op
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // cc_ndep
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v7;  // x30
    long long v17;  // x8
    long long *v8;  // x19
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = &a0->field_40->field_0;
        if (*(int *)&a0->padding_0[44])
        {
            if (*(int *)&a0->padding_0[40])
            {
                v9 = arm64g_calculate_condition(v11 | 16, v12, v13, v14);
                v10 = arm64g_calculate_condition(4, (v9 & 1 ? v8 : 0x40000000), 0, 0);
                if (!(v10 & 1))
                    goto LABEL_9d8df0;
            }
            else
            {
                v15 = arm64g_calculate_condition(v11 | 16, v12, v13, v14);
                v16 = arm64g_calculate_condition(0, (v15 & 1 ? v8 : 0x40000000), 0, 0);
                if (!(v16 & 1))
                {
LABEL_9d8df0:
                    v17 = *v8;
                    if (a0->field_31 >> 1 & 1)
                        *(unsigned long long *)(v17 + 8) = 0;
                    sub_9ebcf4(v17);
                }
            }
        }
        sub_a6c2e4(v8[1], "crypto/bio/bss_mem.c", 152);
        sub_a6c2e4(v8, "crypto/bio/bss_mem.c", 0x99);
        a0 = 1;
    }
    return (unsigned int)a0;
}
