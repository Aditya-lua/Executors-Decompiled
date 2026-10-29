/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x83488..0x83548 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_cbfd18[4];

unsigned int sub_83488(unsigned int *a0, unsigned int a1, unsigned long long a2)
{
    unsigned int v0;  // w10
    unsigned long v1;  // cc_dep1
    unsigned int v10;  // w15
    unsigned int v11;  // w16
    unsigned long long v12;  // x17
    unsigned long v13;  // 4112
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long long v16;  // x3
    unsigned long long idx;  // x17
    unsigned long long v18;  // 4112
    unsigned long v19;  // 4112
    unsigned long v2;  // cc_dep2
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4112
    unsigned long long index;  // x3
    unsigned long long v23;  // 4108
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4108
    unsigned int v26;  // w10
    unsigned long long v27;  // x9
    unsigned long long v28;  // 4112
    unsigned long long idx1;  // x9
    unsigned int v3;  // w9
    unsigned long long v30;  // 4108
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4108
    unsigned int v4;  // w11
    unsigned int v5;  // w11
    unsigned int v6;  // w12
    unsigned int *iter;  // x13
    unsigned int i;  // w14
    unsigned int v9;  // w14

    v0 = a1 + 1;
    v1 = v0;
    v2 = 2;
    if (2 > v0)
    {
        v3 = 0;
        v4 = 0;
    }
    else
    {
        v5 = 0;
        v6 = 0;
        v3 = v0 & 0xfffffffe;
        iter = a0 + 1;
        i = v3;
        do
        {
            v9 = i;
            v10 = *(int *)((char *)iter - 4);
            v11 = *iter;
            v12 = v10 * 0x100;
            if (v12 < a2)
            {
                v13 = arm64g_calculate_condition(0x33, v1, 2, 0);
                v14 = 3;
                v15 = (v13 & 1 ? v10 : 0x40000000);
                v16 = v11 * 0x100;
                idx = v12 / a2;
                v18 = arm64g_calculate_condition(3, v15, 0, 0);
                if (!(v18 & 1))
                    goto LABEL_834d6;
                goto LABEL_834d5;
            }
            else
            {
                v19 = arm64g_calculate_condition(0x33, v1, 2, 0);
                v14 = 0;
                v15 = (v19 & 1 ? v10 : 0x40000000);
                v16 = v11 * 0x100;
                idx = v12 / a2;
                v20 = arm64g_calculate_condition(0, v15, 0, 0);
                if (v20 & 1)
                {
LABEL_834d5:
                    goto LABEL_834d8;
                }
                else
                {
LABEL_834d6:
                    idx = 1;
LABEL_834d8:
                    if (v16 < a2)
                    {
                        v21 = arm64g_calculate_condition(v14 | 48, v15, 0, 0);
                        index = v16 / a2;
                        v23 = arm64g_calculate_condition(3, (v21 & 1 ? v11 : 0x40000000), 0, 0);
                        if (!(v23 & 1))
                            goto LABEL_834e6;
                        goto LABEL_834e5;
                    }
                    else
                    {
                        v24 = arm64g_calculate_condition(v14 | 48, v15, 0, 0);
                        index = v16 / a2;
                        v25 = arm64g_calculate_condition(0, (v24 & 1 ? v11 : 0x40000000), 0, 0);
                        if (v25 & 1)
                        {
LABEL_834e5:
                            continue;
                        }
                        else
                        {
LABEL_834e6:
                            index = 1;
                        }
                    }
                }
            }
            v5 += v10 * g_cbfd18[idx];
            v6 += v11 * g_cbfd18[index];
            iter += 2;
            i = v9 - 2;
            v1 = v9;
        } while (i);
        v4 = v6 + v5;
        v1 = v0;
        v2 = v3;
        if (v0 == v3)
            return v6 + v5 >> 8;
    }
    do
    {
        v26 = a0[v3];
        v3 += 1;
        v27 = v26 * 0x100;
        if (v27 < a2)
        {
            v28 = arm64g_calculate_condition(0x33, v1, v2, 0);
            idx1 = v27 / a2;
            v30 = arm64g_calculate_condition(3, (v28 & 1 ? v26 : 0x40000000), 0, 0);
            if (!(v30 & 1))
                goto LABEL_8352a;
            goto LABEL_83529;
        }
        else
        {
            v31 = arm64g_calculate_condition(0x33, v1, v2, 0);
            idx1 = v27 / a2;
            v32 = arm64g_calculate_condition(0, (v31 & 1 ? v26 : 0x40000000), 0, 0);
            if (v32 & 1)
            {
LABEL_83529:
                continue;
            }
            else
            {
LABEL_8352a:
                idx1 = 1;
            }
        }
    } while ((v4 += v26 * g_cbfd18[idx1], v1 = v3, v2 = a1, v3 <= a1));
    return v4 >> 8;
}
