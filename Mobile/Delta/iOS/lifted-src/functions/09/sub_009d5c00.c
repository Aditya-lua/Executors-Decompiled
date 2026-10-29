/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d5c00..0x9d5ee0 (736 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_c7c2eb;
extern char g_10002b0;

unsigned long long sub_9d5c00(long long a0, long long a1, long long a2, long long a3, unsigned long long a4, unsigned int a5, unsigned int a6, int a7)
{
    unsigned long long v6;  // x9
    unsigned int v7;  // w28
    unsigned long long v16;  // 4108
    unsigned long long v17;  // 4108
    unsigned long long v18;  // w11
    unsigned long long v19;  // 4106
    unsigned long long v20;  // 4106
    unsigned long long v21;  // x12
    unsigned long v22;  // cc_dep1
    unsigned long long v23;  // w1
    unsigned long long v24;  // 4106
    unsigned long long v25;  // 4106
    unsigned long long v8;  // w8
    unsigned long long v26;  // 4110
    char *v27;  // x11
    char *v28;  // x13
    unsigned long long v29;  // x14
    unsigned long long v30;  // x9
    unsigned long long v31;  // x17
    unsigned long long v32;  // x16
    char *v33;  // x25
    unsigned int v34;  // w9
    unsigned long v35;  // x26
    unsigned long v9;  // cc_dep1
    unsigned long long v36;  // w24
    unsigned int v37;  // w0
    unsigned long long v38;  // w9
    unsigned long long v39;  // w8
    unsigned long long v40;  // w10
    unsigned long v41;  // cc_dep1
    unsigned long long v42;  // w8
    unsigned long long v43;  // 4108
    unsigned long long v44;  // 4108
    unsigned long long v45;  // w23
    unsigned long long v10;  // w13
    unsigned long long v46;  // x24
    unsigned long long v47;  // w24
    unsigned long long v48;  // x0
    unsigned long long v49;  // w8
    char *v50;  // x25
    unsigned long long v51;  // w23
    unsigned long long v53;  // 4114
    unsigned long long v11;  // 4108
    unsigned long long v12;  // 4108
    unsigned int v13;  // w11
    unsigned long v14;  // cc_dep1
    unsigned long long v15;  // w13
    unsigned long long v0;  // [bp-0x90]
    unsigned long long v1;  // [bp-0x8c]
    char v2;  // [bp-0x83]
    unsigned short v54;  // [bp-0x82]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    unsigned int v5;  // [bp+0x0]

    v4 = &v5;
    v6 = 0;
    v7 = v5;
    v3 = *(long long *)&g_10002b0;
    v8 = a7 & ~(a7 >> 31);
    v9 = v7 & 2;
    if (v7 & 2)
    {
        v10 = 0;
        v11 = arm64g_calculate_condition(25, v9, 0, 0);
        if (!(v11 & 1))
            goto LABEL_9d5c6e;
LABEL_9d5c6d:
        v13 = 43;
    }
    else
    {
        v10 = !(v7 & 4);
        v12 = arm64g_calculate_condition(25, v9, 0, 0);
        if (v12 & 1)
            goto LABEL_9d5c6d;
LABEL_9d5c6e:
        v13 = (v7 & 4) * 8;
    }
    v14 = a4 & 0x8000000000000000;
    if (!(a4 & 0x8000000000000000))
    {
        v15 = v10;
        v16 = arm64g_calculate_condition(10, v14, 0, 0);
        if (!(v16 & 1))
            goto LABEL_9d5c7e;
LABEL_9d5c7d:
        v18 = v13;
        v19 = arm64g_calculate_condition(10, v14, 0, 0);
        if (!(v19 & 1))
            goto LABEL_9d5c82;
LABEL_9d5c81:
        v21 = a4;
    }
    else
    {
        v15 = 0;
        v17 = arm64g_calculate_condition(10, v14, 0, 0);
        if (v17 & 1)
            goto LABEL_9d5c7d;
LABEL_9d5c7e:
        v18 = 45;
        v20 = arm64g_calculate_condition(10, v14, 0, 0);
        if (v20 & 1)
            goto LABEL_9d5c81;
LABEL_9d5c82:
        v21 = -a4;
    }
    v22 = v7 & 64;
    if (v7 & 64)
    {
        v23 = 1;
        v24 = arm64g_calculate_condition(25, v22, 0, 0);
        if (!(v24 & 1))
            goto LABEL_9d5c8e;
LABEL_9d5c8d:
        v18 = 0;
    }
    else
    {
        v23 = v15;
        v25 = arm64g_calculate_condition(25, v22, 0, 0);
        if (v25 & 1)
            goto LABEL_9d5c8d;
LABEL_9d5c8e:
    }
    v0 = v18;
    v26 = arm64g_calculate_condition(25, v22, 0, 0);
    if (!(v26 & 1))
        a4 = v21;
    v27 = "0";
    if (a5 != 8)
        v27 = &g_c7c2eb;
    if (a5 == 16)
        v27 = "0x";
    v28 = "0123456789ABCDEF";
    if (!(v7 & 32))
        v28 = "0123456789abcdef";
    v29 = a5;
    do
    {
        v30 = v6;
        v31 = a4 / v29;
        v32 = v30 + 1;
        *((char *)&v54 + v30) = v28[a4 + -1 * v29 * v31];
    } while (a4 >= v29 && (v6 = v32, a4 = v31, v30 < 25));
    if (!(v7 & 8))
        v33 = &g_c7c2eb;
    else
        v33 = v27;
    v34 = v32 - 1;
    if (v32 != 26)
        v34 = v32;
    v35 = v34;
    *((char *)&v54 + v35) = 0;
    if ((int)v34 < v8)
        v36 = v8;
    else
        v36 = v34;
    v1 = v23;
    v37 = _strlen();
    v38 = v8 - v34 & ~((long long)(v8 - v34) >> 31);
    v39 = (unsigned int)(a6 - (v23 ^ 1) - v37 - v36) & ~((int)((unsigned int)(a6 - (v23 ^ 1) - v37 - v36)) >> 31);
    if (v39 < v38)
        v40 = v38;
    else
        v40 = v39;
    v41 = v7 & 16;
    if (!(v7 & 16))
    {
        v42 = v39;
        v43 = arm64g_calculate_condition(9, v41, 0, 0);
        if (!(v43 & 1))
            goto LABEL_9d5d6e;
LABEL_9d5d6d:
        v45 = v38;
    }
    else
    {
        v42 = 0;
        v44 = arm64g_calculate_condition(9, v41, 0, 0);
        if (v44 & 1)
            goto LABEL_9d5d6d;
LABEL_9d5d6e:
        v45 = v40;
    }
    if (!(v7 & 1))
        v46 = v42;
    else
        v46 = -v42;
    if ((int)v46 >= 1)
    {
        v47 = (unsigned int)v46 + 1;
        while (1)
        {
            v48 = sub_c65cec(a0, a1, a2, a3, 32);
            if (!(unsigned int)v48)
                break;
            v47 -= 1;
            if (1 >= v47)
            {
                v46 = 0;
                goto LABEL_9d5db0;
            }
        }
    }
    else
    {
LABEL_9d5db0:
        if (v1 & 1 || (v48 = sub_c65cec(a0, a1, a2, a3, v0), (unsigned int)v48))
        {
            v49 = *v33;
            if (v49)
            {
                v50 = v33 + 1;
                do
                {
                    v48 = sub_c65cec(a0, a1, a2, a3, (char)v49);
                    if (!(unsigned int)v48)
                    {
                        if (*(long long *)&g_10002b0 == v3)
                            return v48;
                        ___stack_chk_fail();
                    }
                } while ((v49 = *v50, v50 += 1, v49));
            }
            if (v45)
            {
                v51 = v45 + 1;
                do
                {
                    v48 = sub_c65cec(a0, a1, a2, a3, 48);
                    if (!(unsigned int)v48)
                    {
                        if (*(long long *)&g_10002b0 == v3)
                            return v48;
                        ___stack_chk_fail();
                    }
                } while ((v51 -= 1, 1 < v51));
            }
            do
            {
                if ((int)v35 <= 0)
                {
                    if (!(v46 >> 31 & 1))
                    {
                        v48 = 1;
                        break;
                    }
                    else
                    {
                        do
                        {
                            v48 = sub_c65cec(a0, a1, a2, a3, 32);
                        } while ((unsigned int)v48 && (v48 = 1, v53 = arm64g_calculate_condition(49, v46 & 0xffffffff, 1, 0), v46 = (unsigned int)v46 + 1, v53 & 1));
                    }
                }
            } while ((v48 = sub_c65cec(a0, a1, a2, a3, (&v2)[v35]), v35 -= 1, (unsigned int)v48));
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return v48;
    ___stack_chk_fail();
}
