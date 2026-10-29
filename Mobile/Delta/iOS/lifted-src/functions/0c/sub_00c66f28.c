/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc66f28..0xc67058 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c66f28(unsigned long long a0, long long a1, unsigned int *a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long long v17;  // 4102
    unsigned int v18;  // w0
    unsigned long v19;  // cc_op
    unsigned long v20;  // cc_dep1
    unsigned long long v21;  // 4102
    unsigned long long v9;  // x20
    unsigned long long v22;  // 4102
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // 4118
    unsigned int v13;  // w8
    unsigned long long v14;  // 4124
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if ((unsigned int)a0 != 1)
    {
        if ((unsigned int)a0 != 8)
        {
            if ((unsigned int)a0 != 7)
            {
                if ((unsigned int)a0 == 4)
                    goto LABEL_c66f80;
            }
            else
            {
                if (!a2[2])
                    goto LABEL_c6701c;
            }
        }
        else
        {
            if (!a2[2])
                goto LABEL_c66f60;
        }
LABEL_c66f88:
        if ((int)sub_a3bbe8(a0, a1) >= 1 && ((unsigned int)a0 != 1 || a2[2] != 2 || (v14 = arm64g_calculate_condition(33, a2[7] - 2, 3, 0), v14 & 1)) && (int)sub_a3aef4(a0, a1, a2) >= 1)
        {
            if ((unsigned int)a0 != 8)
            {
                if ((unsigned int)a0 != 7)
                {
                    if ((unsigned int)a0 == 2 && (sub_a3eef8(), v17 = arm64g_calculate_condition(v19 | 16, v20, v15, v16), !(v17 & 1) && a2[7] >= 2))
                    {
                        v18 = 0xffffffff;
LABEL_c6704c:
                        a2[7] = v18;
                    }
                }
                else
                {
                    sub_a3eef8();
                    v21 = arm64g_calculate_condition(v19 | 16, v20, v15, v16);
                    if (!(v21 & 1))
                        a2[7] = 0xfffffffe;
                }
            }
            else
            {
                v18 = sub_a3eef8();
                v22 = arm64g_calculate_condition(v19 | 16, v20, v15, v16);
                if (!(v22 & 1))
                    goto LABEL_c6704c;
            }
        }
    }
    else if (!a2[2])
    {
        v12 = arm64g_calculate_condition(0x11, a2[7], 2, 0);
        if (!(v12 & 1))
        {
LABEL_c66f60:
            v13 = 1;
            goto LABEL_c66f84;
        }
LABEL_c66f80:
        v13 = 2;
LABEL_c66f84:
        a2[2] = v13;
        goto LABEL_c66f88;
    }
    else
    {
LABEL_c6701c:
    }
}
