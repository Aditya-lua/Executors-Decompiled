/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa186bc..0xa18a2c (880 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern void g_e8efa8;

long long sub_a186bc(long long *a0, long long a1)
{
    unsigned long long v8;  // w0
    unsigned int v9;  // w0
    int v18;  // w8
    unsigned long v19;  // x26
    long long v20;  // x27
    unsigned long v21;  // x0
    long long v22;  // x21
    unsigned long v23;  // x0
    long long v24;  // x23
    unsigned long v25;  // x0
    long long v26;  // x22
    unsigned long v27;  // x0
    long long v10;  // x0
    long long v28;  // x20
    unsigned long v29;  // x0
    unsigned long v30;  // x0
    unsigned long v31;  // x0
    unsigned long v32;  // x0
    unsigned long v33;  // x23
    void* iter;  // x22
    unsigned long long v35;  // x23
    unsigned long long v36;  // x23
    unsigned int *v37;  // x20
    long long v11;  // x0
    unsigned long v38;  // cc_dep1
    unsigned long v39;  // cc_dep2
    unsigned long v40;  // x28
    unsigned long long v41;  // w9
    unsigned long v42;  // 4112
    unsigned long v43;  // cc_op
    unsigned long v44;  // cc_dep1
    unsigned long v45;  // cc_dep2
    unsigned long long v46;  // 4143
    unsigned int v47;  // w9
    unsigned long v12;  // x25
    unsigned long v48;  // 4112
    unsigned long long v49;  // 4143
    unsigned long v50;  // 4112
    unsigned long v51;  // cc_op
    unsigned long v52;  // cc_dep1
    unsigned long long v53;  // 4102
    unsigned long v54;  // 4112
    unsigned long long v55;  // 4102
    unsigned long v56;  // cc_dep2
    unsigned long v57;  // cc_ndep
    unsigned int v13;  // w0
    unsigned int v58;  // w0
    unsigned int v59;  // w0
    unsigned long v60;  // x10
    long long v61;  // x8
    long long v62;  // x9
    unsigned long long v63;  // 4110
    unsigned long long v64;  // 4102
    unsigned long long v65;  // 4110
    unsigned long long v66;  // 4102
    unsigned long long v14;  // 4127
    int v15;  // w20
    unsigned int v16;  // w0
    unsigned long long v17;  // 4187
    long long v0;  // [bp-0x90]
    long long v1;  // [bp-0x88]
    long long v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x74]
    long long v4;  // [bp-0x70]
    unsigned int v5;  // [bp-0x64]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = (unsigned int)sub_a1abcc();
    v9 = sub_a1abd4(a0);
    v10 = sub_975fec(a0);
    v11 = sub_97725c(a0);
    v12 = sub_9ffdd0(a0);
    sub_9de064(a1);
    v13 = sub_9e46a8(a0[2]);
    v14 = arm64g_calculate_condition(177, v13, 7, 0);
    v15 = (int)((v14 & 1 ? v13 + 14 : v13 + 7)) >> 3;
    v16 = sub_9e46a8(a0[8]);
    v17 = arm64g_calculate_condition(177, v16, 7, 0);
    v18 = (int)((v17 & 1 ? v16 + 14 : v16 + 7)) >> 3;
    v19 = (v15 < v18 ? v18 : v15);
    v20 = (unsigned int)v19 * 6;
    v21 = sub_a6bf4c(v20, "crypto/ec/ec_curve.c", 3114);
    if (v21)
    {
        v4 = v10;
        v5 = v9;
        v22 = v21;
        v23 = sub_9de208(a1);
        if (...)
        {
            iter = &g_e8efa8;
            v35 = 82;
            do
            {
                v36 = v35;
                v37 = *(long long *)iter;
                v38 = *v37;
                v39 = v5;
                if (*v37 != v5)
                    continue;
                v40 = *(int *)((char *)iter - 8);
                v41 = v3;
                if (1 <= v41)
                {
                    v42 = arm64g_calculate_condition(163, v38, v39, 0);
                    v43 = 3;
                    v44 = (v42 & 1 ? v41 : 0x40000000);
                    v45 = (v42 & 1 ? v40 & 0xffffffff : 0);
                    v46 = arm64g_calculate_condition(19, v44, v45, 0);
                    v47 = !(v46 & 1);
                    if ((unsigned int)v19 != v37[2])
                        goto LABEL_a189a2;
                    goto LABEL_a189a1;
                }
                else
                {
                    v48 = arm64g_calculate_condition(163, v38, v39, 0);
                    v43 = 0;
                    v44 = (v48 & 1 ? v41 : 0x40000000);
                    v45 = (v48 & 1 ? v40 & 0xffffffff : 0);
                    v49 = arm64g_calculate_condition(16, v44, v45, 0);
                    v47 = !(v49 & 1);
                    if ((unsigned int)v19 == v37[2])
                    {
LABEL_a189a1:
                        v50 = arm64g_calculate_condition(v43, v44, v45, 0);
                        v51 = 3;
                        v52 = (v50 & 1 ? v47 : 0x40000000);
                        v53 = arm64g_calculate_condition(3, v52, 0, 0);
                        if (v53 & 1)
                            continue;
                        goto LABEL_a189a8;
                    }
                    else
                    {
LABEL_a189a2:
                        v54 = arm64g_calculate_condition(v43, v44, v45, 0);
                        v51 = 0;
                        v52 = (v54 & 1 ? v47 : 0x40000000);
                        v55 = arm64g_calculate_condition(0, v52, 0, 0);
                        if (v55 & 1)
                            continue;
                        v56 = 0;
                        v57 = 0;
LABEL_a189a8:
                        v2 = v37[1];
                        if (v12 && (v58 = sub_9e4828(v12), !sub_9e4828(v12) && (v59 = sub_9e5bc4(v12, v37[3]), !sub_9e5bc4(v12, v37[3]))))
                            continue;
                        v60 = v37 + 4;
                        v61 = v37[1];
                        v62 = v4;
                        if ((int)v61)
                        {
                            v63 = arm64g_calculate_condition(v51 | 16, v52, v56, v57);
                            v64 = arm64g_calculate_condition(4, (v63 & 1 ? v62 : 0x40000000), 0, 0);
                            if (v64 & 1)
                                goto LABEL_a18940;
                        }
                        else
                        {
                            v65 = arm64g_calculate_condition(v51 | 16, v52, v56, v57);
                            v66 = arm64g_calculate_condition(0, (v65 & 1 ? v62 : 0x40000000), 0, 0);
                            if (v66 & 1)
                                goto LABEL_a18940;
                        }
                        if (v4 != v61 || _memcmp(v60, v11, v4))
                            continue;
LABEL_a18940:
                        if (!_memcmp(v22, v60 + v2, v20))
                            break;
                    }
                }
            } while ((v40 = 0, iter += 32, v35 = v36 - 1, v36 != 1));
        }
        else
        {
            v40 = 0xffffffff;
        }
    }
    else
    {
        v40 = 0xffffffff;
    }
    sub_a6c2e4();
    sub_9de17c(a1);
    return v40;
}
