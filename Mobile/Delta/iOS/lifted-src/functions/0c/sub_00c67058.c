/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc67058..0xc671e4 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c67058(unsigned long long a0, long long a1, void* a2, void* a3)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long v17;  // cc_dep1
    unsigned long v18;  // cc_dep2
    unsigned long v19;  // cc_ndep
    unsigned long long v20;  // 4102
    unsigned long v21;  // x0
    unsigned int v22;  // w9
    unsigned long long v23;  // 4102
    unsigned long long v24;  // 4102
    void* v25;  // x20
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    void* iter;  // x20
    unsigned long long v13;  // 4118
    unsigned int v14;  // w8
    unsigned int v15;  // w8
    unsigned long v16;  // cc_op
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
    iter = a3;
    if ((int)sub_a3bbe8() >= 1)
    {
        if ((unsigned int)a0 != 1)
        {
            if ((int)sub_a3bbe8(a0, a1) < 1)
                goto LABEL_c671d4;
            if ((unsigned int)a0 == 8 && !(sub_a3eef8(), v20 = arm64g_calculate_condition(v16, v17, v18, v19), !(v20 & 1)))
                goto LABEL_c67108;
            goto LABEL_c67144;
        }
        else if (!(int)a2[8])
        {
            v13 = arm64g_calculate_condition(0x11, (int)a2[28], 2, 0);
            if (!(v13 & 1))
            {
                *(void* *)&a2[32] = a2 + 64;
                *(unsigned int *)&a2[28] = 50;
                v14 = 1;
            }
            else
            {
                v14 = 2;
            }
            *(unsigned int *)&a2[8] = v14;
            if ((int)sub_a3bbe8(1, a1) >= 1)
            {
                v15 = (int)a2[8];
                if (v15 != 2)
                    goto LABEL_c67144;
LABEL_c67108:
                v21 = (long long)iter[8];
                if ((long long)iter[8])
                {
                    v15 = (int)a2[28];
                    for (v22 = *(int *)iter; v15 != v22; iter += 16)
                    {
                        if (!(long long)iter[24])
                            goto LABEL_c67130;
                        v22 = (int)iter[16];
                    }
                    *(unsigned long *)&a2[32] = v21;
                    *(unsigned int *)&a2[28] = _strlen();
LABEL_c67144:
                    if ((int)sub_a3aef4(a0, a1, a2) >= 1)
                    {
                        if ((unsigned int)a0 == 7)
                        {
                            sub_a3eef8();
                            v24 = arm64g_calculate_condition(v16, v17, v18, v19);
                            if (!(v24 & 1))
                            {
                                if (v15 == 2)
                                {
LABEL_c67188:
                                    *(unsigned int *)&a2[28] = 0xffffffff;
                                    if ((long long)iter[8])
                                    {
                                        do
                                        {
                                            v25 = iter;
                                            if (!sub_a6e200((long long)a2[32]))
                                            {
                                                *(int *)&a2[28] = *(int *)v25;
                                                goto LABEL_c671d0;
                                            }
                                        } while ((iter = v25 + 16, (long long)v25[24]));
                                    }
LABEL_c671d0:
                                    *(unsigned long long *)&a2[32] = 0;
                                }
                            }
                            else
                            {
                                *(unsigned int *)&a2[28] = 0xfffffffe;
                            }
                        }
                        else if ((unsigned int)a0 == 2 && !(sub_a3eef8(), v23 = arm64g_calculate_condition(v16, v17, v18, v19), !(v23 & 1)))
                        {
                            goto LABEL_c67188;
                        }
                    }
                }
                else
                {
LABEL_c67130:
                }
            }
        }
    }
LABEL_c671d4:
}
