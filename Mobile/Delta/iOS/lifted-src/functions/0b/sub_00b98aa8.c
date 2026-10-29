/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb98aa8..0xb98b8c (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_b98aa8(unsigned long long *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long v11;  // 4110
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long long v15;  // 4102
    unsigned long v16;  // cc_op
    unsigned long v17;  // cc_dep1
    unsigned long v18;  // cc_dep2
    unsigned long v19;  // cc_ndep
    unsigned long v20;  // 4110
    unsigned long long v7;  // x30
    unsigned long long v21;  // 4102
    unsigned long v22;  // x9
    unsigned long long v23;  // x8
    unsigned long long v24;  // x9
    unsigned long long v25;  // 4110
    unsigned long long v26;  // 4102
    unsigned long v8;  // x9
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    unsigned long v29;  // x9
    unsigned long long v30;  // x9
    unsigned long long v31;  // 4110
    unsigned long long v32;  // 4102
    unsigned long long v9;  // x8
    unsigned long long v33;  // 4110
    unsigned long long v34;  // 4102
    unsigned long v35;  // x9
    unsigned long long v10;  // x9
    unsigned long long v36;  // x8
    unsigned long long v37;  // 4112
    unsigned long v38;  // x9
    unsigned long long v39;  // x8
    unsigned long long v40;  // 4112
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0[2];
    v9 = v8 * 8;
    v10 = v9 + v8;
    if (v8)
    {
        v11 = arm64g_calculate_condition(v16 | 16, v17, v18, v19);
        v12 = 2;
        v13 = (v11 & 1 ? v10 : 0x40000000);
        v14 = (v11 & 1 ? 0x11 : 0);
        v15 = arm64g_calculate_condition(18, v13, v14, 0);
        if (v15 & 1)
            goto LABEL_b98af4;
LABEL_b98ad0:
        v22 = a0[6];
        v23 = v22 * 8;
        v24 = v23 + v22;
        if (v22)
        {
            v25 = arm64g_calculate_condition(v12 | 16, v13, v14, 0);
            v26 = arm64g_calculate_condition(18, (v25 & 1 ? v24 : 0x40000000), (v25 & 1 ? 0x11 : 0), 0);
            if (v26 & 1)
                goto LABEL_b98b1c;
            goto LABEL_b98ae8;
        }
        else
        {
            v27 = arm64g_calculate_condition(v12 | 16, v13, v14, 0);
            v28 = arm64g_calculate_condition(16, (v27 & 1 ? v24 : 0x40000000), (v27 & 1 ? 0x11 : 0), 0);
            if (v28 & 1)
                goto LABEL_b98b1c;
            goto LABEL_b98ae8;
        }
    }
    else
    {
        v20 = arm64g_calculate_condition(v16 | 16, v17, v18, v19);
        v12 = 0;
        v13 = (v20 & 1 ? v10 : 0x40000000);
        v14 = (v20 & 1 ? 0x11 : 0);
        v21 = arm64g_calculate_condition(16, v13, v14, 0);
        if (!(v21 & 1))
            goto LABEL_b98ad0;
LABEL_b98af4:
        _free(a0[1] - v9 - 8);
        v29 = a0[6];
        v23 = v29 * 8;
        v30 = v23 + v29;
        if (v29)
        {
            v31 = arm64g_calculate_condition(v16 | 16, v17, v18, v19);
            v32 = arm64g_calculate_condition(2, (v31 & 1 ? v30 : 0x40000000), (v31 & 1 ? 0x11 : 0), 0);
            if (!(v32 & 1))
                goto LABEL_b98b1c;
LABEL_b98ae8:
            v35 = a0[10];
            if (a0[10])
                goto LABEL_b98b34;
        }
        else
        {
            v33 = arm64g_calculate_condition(v16 | 16, v17, v18, v19);
            v34 = arm64g_calculate_condition(0, (v33 & 1 ? v30 : 0x40000000), (v33 & 1 ? 0x11 : 0), 0);
            if (v34 & 1)
                goto LABEL_b98ae8;
LABEL_b98b1c:
            _free(a0[5] - v23 - 8);
            v35 = a0[10];
            if (a0[10])
            {
LABEL_b98b34:
                v36 = v35 * 8;
                v37 = arm64g_calculate_condition(2, v36 + v35, 0x11, 0);
                if (!(v37 & 1))
                    _free(a0[9] - v36 - 8);
            }
        }
    }
    v38 = a0[14];
    if (v38)
    {
        v39 = v38 * 8;
        v40 = arm64g_calculate_condition(2, v39 + v38, 0x11, 0);
        if (!(v40 & 1))
            _free(a0[13] - v39 - 8);
    }
}
