/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c4058..0x9c42c8 (624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;

unsigned long long sub_9c4058(char *a0, unsigned long long a1, unsigned long long a2, unsigned int a3, long long a4, long long a5, long long a6)
{
    unsigned long long v8;  // x26
    char *v9;  // x28
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4107
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4107
    unsigned int v22;  // w24
    unsigned long v23;  // cc_op
    unsigned long v24;  // cc_dep1
    unsigned long v25;  // cc_dep2
    unsigned long v26;  // cc_ndep
    unsigned long long v27;  // x0
    unsigned long long v10;  // w9
    unsigned long v28;  // x8
    unsigned int v29;  // w8
    unsigned long long v30;  // 4112
    unsigned long long v31;  // 4109
    unsigned long long v32;  // 4112
    unsigned long long v33;  // 4109
    unsigned long long v34;  // x0
    unsigned long long v35;  // x0
    unsigned long long v36;  // x26
    char *v37;  // x25
    long long v11;  // x1
    unsigned long long v38;  // x26
    unsigned long long v40;  // x0
    unsigned long v12;  // cc_op
    char *v13;  // cc_dep1
    char *v14;  // cc_dep2
    unsigned int v15;  // x19
    char *v16;  // x28
    unsigned int v17;  // w8
    char *v0;  // [bp-0x88]
    unsigned int v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x7c]
    char *v3;  // [bp-0x78]
    char v4;  // [bp-0x6e]
    unsigned long long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a1;
    v9 = a0;
    v10 = (unsigned int)a2 & 7;
    switch (v10)
    {
    case 2:
        if (v8 & 1)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/a_strex.c", 156, "do_buf");
            v11 = 129;
LABEL_9c4298:
            sub_a36abc(13, v11, 0);
LABEL_9c42a0:
            return 0xffffffff;
        }
        goto LABEL_9c40dc;
    case 4:
        if (v8 & 3)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/a_strex.c", 150, "do_buf");
            v11 = 133;
            goto LABEL_9c4298;
        }
    default:
LABEL_9c40dc:
        if (!(unsigned int)v8)
        {
            return 0;
        }
        else if (4 >= v10)
        {
            v12 = 3;
            v13 = v10;
            v14 = 3;
            if (v10 == 3)
                return 0xffffffff;
            v15 = 0;
            v3 = &v9[(int)v8];
            v2 = v10;
            v0 = v9;
            v16 = v9;
            while (1)
            {
                v17 = a3 & 1;
                if (v9 == v16)
                {
                    v18 = arm64g_calculate_condition(v12, v13, v14, 0);
                    v19 = arm64g_calculate_condition(3, (v18 & 1 ? v17 : 0x40000000), 0, 0);
                    if (!(v19 & 1))
                        goto LABEL_9c413e;
                    goto LABEL_9c413d;
                }
                else
                {
                    v20 = arm64g_calculate_condition(v12, v13, v14, 0);
                    v21 = arm64g_calculate_condition(0, (v20 & 1 ? v17 : 0x40000000), 0, 0);
                    if (v21 & 1)
                    {
LABEL_9c413d:
                        v22 = 0;
                        goto LABEL_9c4140;
                    }
                    else
                    {
LABEL_9c413e:
                        v22 = 32;
LABEL_9c4140:
                        v23 = 3;
                        v24 = v10;
                        v25 = 1;
                        v26 = 0;
                        switch (v10)
                        {
                        case 1:
                            v13 = v9 + 1;
                            v5 = *v9;
                            break;
                        case 2:
                            v23 = 3;
                            v24 = v10;
                            v25 = 2;
                            v26 = 0;
                            v28 = *v9;
                            v5 = v28 * 0x100;
                            v13 = v9 + 2;
                            v5 = (v9[1] | (v28 * 0x100 | v28 >> 56) & 0xff00) & 0xffff;
                            break;
                        case 4:
                            v23 = 3;
                            v24 = v10;
                            v25 = 4;
                            v26 = 0;
                            v5 = *v9 * &_NSHomeDirectory;
                            v5 |= v9[1] * 0x10000;
                            v5 |= v9[2] * 0x100;
                            v13 = v9 + 4;
                            v5 |= v9[3];
                            break;
                        default:
                            v23 = 3;
                            v24 = v10;
                            v25 = 4;
                            v26 = 0;
                            v27 = sub_9c5604(v9, v8, &v5);
                            if (v27 >> 31 & 1)
                                return 0xffffffff;
                            v8 -= v27;
                            v13 = &v9[v27 & 0xffffffff];
                            break;
                        }
                        v29 = a3 & 1;
                        if (v13 == v3)
                        {
                            v30 = arm64g_calculate_condition(v23, v24, v25, v26);
                            v31 = arm64g_calculate_condition(3, (v30 & 1 ? v29 : 0x40000000), 0, 0);
                            if (!(v31 & 1))
                                goto LABEL_9c41ee;
                            goto LABEL_9c41ed;
                        }
                        else
                        {
                            v32 = arm64g_calculate_condition(v23, v24, v25, v26);
                            v33 = arm64g_calculate_condition(0, (v32 & 1 ? v29 : 0x40000000), 0, 0);
                            if (v33 & 1)
                            {
LABEL_9c41ed:
                                goto LABEL_9c41f0;
                            }
                            else
                            {
LABEL_9c41ee:
                                v22 = 64;
LABEL_9c41f0:
                                if (!(a2 >> 3 & 1))
                                {
                                    v34 = sub_9c42c8(v5, v22 | a3, a4, a5, a6);
                                    if (v34 >> 31 & 1)
                                        break;
                                    v15 += v34;
                                }
                                else
                                {
                                    v1 = v8;
                                    v35 = sub_9c5788(&v4, 6, v5);
                                    if (v35 >> 31 & 1)
                                        break;
                                    if ((unsigned int)v35)
                                    {
                                        v36 = v35 & 0xffffffff;
                                        v37 = &v4;
                                        do
                                        {
                                            v38 = v36;
                                            v40 = sub_9c42c8(*v37, v22 | a3, a4, a5, a6);
                                            if (v40 >> 31 & 1)
                                                return 0xffffffff;
                                        } while ((v15 += v40, v36 = v38 - 1, v37 += 1, v38 != 1));
                                    }
                                    v8 = v1;
                                    v16 = v0;
                                }
                                v14 = v3;
                                v12 = 4;
                                v9 = v13;
                                v10 = v2;
                                if (v9 == v14)
                                    return v15;
                            }
                        }
                    }
                }
            }
        }
        else
        {
            return 0xffffffff;
        }
        goto LABEL_9c42a0;
    }
}
