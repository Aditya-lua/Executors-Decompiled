/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5087c..0xc50994 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_c5087c(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2, unsigned long long a3)
{
    unsigned long long *v2;  // x19
    unsigned long long *v3;  // x20
    unsigned long v12;  // cc_dep2
    unsigned long long v13;  // x10
    unsigned long long v14;  // x11
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long long v18;  // 4110
    unsigned long v19;  // 4110
    unsigned long long v20;  // 4102
    unsigned long v21;  // 4110
    unsigned long long v4;  // x21
    unsigned long long v22;  // 4102
    unsigned long long v23;  // 4110
    unsigned long v24;  // 4110
    unsigned long v25;  // cc_op
    unsigned long v26;  // cc_dep1
    unsigned long v27;  // cc_dep2
    unsigned long v28;  // 4110
    unsigned long long v29;  // 4126
    unsigned long v30;  // x12
    unsigned long long v31;  // 4110
    unsigned long long v5;  // x23
    unsigned long v32;  // 4110
    unsigned long v33;  // cc_op
    unsigned long v34;  // cc_dep1
    unsigned long v35;  // cc_dep2
    unsigned long v36;  // 4110
    unsigned long long v37;  // 4126
    unsigned long v38;  // x13
    unsigned long v39;  // 4110
    unsigned long v40;  // cc_op
    unsigned long v41;  // cc_dep1
    unsigned long long v6;  // x24
    unsigned long v42;  // cc_dep2
    unsigned long v43;  // 4110
    unsigned long long v44;  // 4123
    unsigned int v45;  // w8
    unsigned long v7;  // x13
    unsigned long long v8;  // x14
    unsigned long v9;  // x9
    unsigned long long v10;  // x8
    unsigned long v11;  // cc_dep1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = a1;
    if (a3 >= 8)
    {
        v4 = a3 >> 3;
        v5 = v4 * 128;
        v6 = v4 * 224;
        a0 = sub_c5087c(a0, (char *)a0 + v5, (char *)a0 + v6, v4);
        v3 = sub_c5087c(v3, (char *)v3 + v5, (char *)v3 + v6, v4);
        v2 = sub_c5087c(v2, (char *)v2 + v5, (char *)v2 + v6, v4);
    }
    v7 = *a0;
    v8 = a0[2];
    v9 = *v3;
    v10 = v3[2];
    v11 = v8;
    v12 = v10;
    if (v10 > v8)
    {
        v13 = *v2;
        v14 = v2[2];
        v15 = 4;
        v16 = v8;
        v17 = v14;
        if (v8 >= v14)
        {
            v18 = arm64g_calculate_condition(148, v16, v17, 0);
            if (v18 & 1)
            {
                v19 = arm64g_calculate_condition(148, v16, v17, 0);
                v15 = 4;
                v16 = (v19 & 1 ? v7 : 0x20000000);
                v17 = (v19 & 1 ? v13 : 0);
                v20 = arm64g_calculate_condition(52, v16, v17, 0);
                if (!(v20 & 1))
                    return a0;
            }
            else
            {
                v21 = arm64g_calculate_condition(148, v16, v17, 0);
                v15 = 0;
                v16 = (v21 & 1 ? v7 : 0x20000000);
                v17 = (v21 & 1 ? v13 : 0);
                v22 = arm64g_calculate_condition(48, v16, v17, 0);
                if (!(v22 & 1))
                    return a0;
            }
        }
        goto LABEL_c50948;
    }
    else
    {
        v23 = arm64g_calculate_condition(148, v11, v12, 0);
        if (v23 & 1)
        {
            v24 = arm64g_calculate_condition(148, v11, v12, 0);
            v25 = 4;
            v26 = (v24 & 1 ? v7 : 0x20000000);
            v27 = (v24 & 1 ? v9 : 0);
        }
        else
        {
            v28 = arm64g_calculate_condition(148, v11, v12, 0);
            v25 = 0;
            v26 = (v28 & 1 ? v7 : 0x20000000);
            v27 = (v28 & 1 ? v9 : 0);
        }
        v29 = arm64g_calculate_condition(v25 | 32, v26, v27, 0);
        v30 = !(v29 & 1);
        v13 = *v2;
        v14 = v2[2];
        v15 = 4;
        v16 = v8;
        v17 = v14;
        if (v14 > v8)
        {
            if (!(v30 & 1))
                return a0;
LABEL_c50948:
            v30 = 1;
        }
        else
        {
            v31 = arm64g_calculate_condition(148, v16, v17, 0);
            if (v31 & 1)
            {
                v32 = arm64g_calculate_condition(148, v16, v17, 0);
                v33 = 4;
                v34 = (v32 & 1 ? v7 : 0x20000000);
                v35 = (v32 & 1 ? v13 : 0);
            }
            else
            {
                v36 = arm64g_calculate_condition(148, v16, v17, 0);
                v33 = 0;
                v34 = (v36 & 1 ? v7 : 0x20000000);
                v35 = (v36 & 1 ? v13 : 0);
            }
            v37 = arm64g_calculate_condition(v33 | 32, v34, v35, 0);
            v38 = !(v37 & 1);
            v15 = 3;
            v16 = v30 & 1;
            v17 = v38 & 1;
            if ((unsigned int)v30 != (unsigned int)v38)
                return a0;
        }
        if (v10 <= v14)
        {
            v39 = arm64g_calculate_condition(v15 | 144, v16, v17, 0);
            v40 = 4;
            v41 = (v39 & 1 ? v9 : 0x20000000);
            v42 = (v39 & 1 ? v13 : 0);
        }
        else
        {
            v43 = arm64g_calculate_condition(v15 | 144, v16, v17, 0);
            v40 = 0;
            v41 = (v43 & 1 ? v9 : 0x20000000);
            v42 = (v43 & 1 ? v13 : 0);
        }
        v44 = arm64g_calculate_condition(v40 | 32, v41, v42, 0);
        if (v14 <= v10)
            v45 = !(v44 & 1);
        else
            v45 = 1;
        if (!((unsigned int)v30 ^ v45))
            return v3;
        return v2;
    }
}
