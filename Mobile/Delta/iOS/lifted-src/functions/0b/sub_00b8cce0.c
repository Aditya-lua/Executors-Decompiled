/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb8cce0..0xb8cdc4 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b8cce0_0 {
    long long field_0;
    unsigned long long field_8;
} st_b8cce0_0;


unsigned long long * sub_b8cce0(unsigned long long *a0)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // x22
    unsigned long long v12;  // x9
    unsigned long long v13;  // x8
    unsigned long long v14;  // x9
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long long *v4;  // x0
    unsigned long long *v5;  // x0
    st_b8cce0_0 *v6;  // x24
    unsigned long v7;  // cc_op
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = 12297829382473034411 * (a0[3] - a0[1] >> 4);
    v4 = a0;
    v5 = a0;
    if (v3)
    {
        while (1)
        {
            v4 = v5;
            v6 = a0[1] + 48 * v2;
            v2 += 1;
            do
            {
                /* unsupported instruction */;
                v7 = 4;
                v8 = /* unsupported instruction */;
                v9 = 1;
                v10 = 0;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v11 = arm64g_calculate_condition(20, v8, 1, 0);
            if (!(v11 & 1))
            {
                /* unsupported instruction */;
                v4 = sub_b86a90(v6->field_0);
            }
            v12 = v6[1].field_0;
            v13 = v12 * 16;
            v14 = v13 + v12;
            if (v12)
            {
                v15 = arm64g_calculate_condition(v7 | 16, v8, v9, v10);
                v16 = arm64g_calculate_condition(18, (v15 & 1 ? v14 : 0x40000000), (v15 & 1 ? 25 : 0), 0);
                if (v16 & 1)
                    goto LABEL_b8cd68;
                goto LABEL_b8cd5c;
            }
            else
            {
                v17 = arm64g_calculate_condition(v7 | 16, v8, v9, v10);
                v18 = arm64g_calculate_condition(16, (v17 & 1 ? v14 : 0x40000000), (v17 & 1 ? 25 : 0), 0);
                if (!(v18 & 1))
                {
LABEL_b8cd5c:
                    v5 = v4;
                    if (v2 == v3)
                        break;
                }
                else
                {
LABEL_b8cd68:
                    v4 = _free(v6->field_8 - v13 - 16);
                    v5 = v4;
                    if (v2 == v3)
                        break;
                }
            }
        }
    }
    if (!a0[2])
        return v4;
    return _free();
}
