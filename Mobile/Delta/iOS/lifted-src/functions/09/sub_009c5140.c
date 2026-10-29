/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c5140..0x9c52ec (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c5140_1 {
    char padding_0[14];
    char field_e;
    char field_f;
} st_9c5140_1;

typedef struct st_9c5140_0 {
    unsigned int field_0;
    unsigned int field_4;
    struct st_9c5140_1 *field_8;
} st_9c5140_0;


long long sub_9c5140(long long a0, st_9c5140_0 *a1, unsigned long a2)
{
    unsigned int v17;  // w8
    unsigned long v20;  // cc_dep2
    unsigned long v21;  // cc_ndep
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4102
    unsigned long v24;  // cc_op
    unsigned long v25;  // cc_dep1
    unsigned long v26;  // x23
    char *v27;  // x21
    unsigned long v28;  // x22
    unsigned long v30;  // x0
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4102
    unsigned long v0;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned long v1;  // [bp-0xb8]
    unsigned long v2;  // [bp-0xb0]
    unsigned long v3;  // [bp-0xa8]
    unsigned long v4;  // [bp-0xa0]
    unsigned long v5;  // [bp-0x98]
    char *v6;  // [bp-0x90], Other Possible Types: unsigned long
    char *v7;  // [bp-0x88], Other Possible Types: unsigned long
    char v8;  // [bp-0x78], Other Possible Types: unsigned int
    unsigned int v9;  // [bp-0x74]
    unsigned int v10;  // [bp-0x70]
    unsigned int v11;  // [bp-0x6c]
    unsigned int v12;  // [bp-0x68]
    unsigned int v13;  // [bp-0x64]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    if (sub_9c4808(&v8))
    {
        v17 = a1->field_0;
        if (a1->field_4 == 24)
        {
            v18 = arm64g_calculate_condition(v24, v25, v20, v21);
            v19 = arm64g_calculate_condition(179, (v18 & 1 ? v17 : 0x80000000), (v18 & 1 ? 16 : 0), 0);
            if (!(v19 & 1))
                goto LABEL_9c5180;
        }
        else
        {
            v22 = arm64g_calculate_condition(v24, v25, v20, v21);
            v23 = arm64g_calculate_condition(176, (v22 & 1 ? v17 : 0x80000000), (v22 & 1 ? 16 : 0), 0);
            if (!(v23 & 1))
            {
LABEL_9c5180:
                if (a1->field_8->field_e == 46)
                {
                    v26 = 0;
                    v27 = &a1->field_8->field_f;
                    v28 = v17 - 15;
                    while (sub_a69974(v27[v26]))
                    {
                        if (v28 == v26 + 1)
                        {
                            if (!(unsigned int)v28)
                                goto LABEL_9c521c;
                            goto LABEL_9c51b8;
                        }
                    }
                    v28 = v26;
                    if ((unsigned int)v28)
                    {
LABEL_9c51b8:
                        if ((a2 & 15) != 1)
                        {
                            v6 = v27;
                            v7 = v13 + 1900;
                            v4 = v8;
                            v5 = v28;
                            v2 = v10;
                            v3 = v9;
                            v0 = (char *)(4 * v12 + 13813512);
                            v1 = v11;
                            return (int)sub_9d524c(a0) > 0;
                        }
                        v6 = v28;
                        v7 = v27;
                        v4 = v9;
                        v5 = v8;
                        v2 = v11;
                        v3 = v10;
                        v0 = v13 + 1900;
                        v1 = v12 + 1;
                        return (int)sub_9d524c(a0) > 0;
                    }
                }
            }
        }
LABEL_9c521c:
        if ((a2 & 15) != 1)
        {
            v4 = v8;
            v5 = v13 + 1900;
            v2 = v10;
            v3 = v9;
            v0 = (char *)(4 * v12 + 13813512);
            v1 = v11;
            return (int)sub_9d524c(a0) > 0;
        }
        v4 = v9;
        v5 = v8;
        v2 = v11;
        v3 = v10;
        v0 = v13 + 1900;
        v1 = v12 + 1;
        return (int)sub_9d524c(a0) > 0;
    }
    else
    {
        if (!sub_9d3fec(a0, "Bad time value", 14))
            v30 = 0;
        else
            v30 = 0xffffffff;
        return v30;
    }
}
