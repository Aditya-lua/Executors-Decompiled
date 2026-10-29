/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae8aac..0xae8cf4 (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ae8aac(unsigned long a0, long long a1)
{
    long long v9;  // x20
    long long v10;  // x0
    unsigned long v19;  // cc_dep1
    unsigned int v20;  // w10
    unsigned long v21;  // 4112
    unsigned long v22;  // cc_op
    unsigned long v23;  // cc_dep1
    unsigned long v24;  // cc_dep2
    unsigned long v25;  // 4112
    unsigned long long v26;  // 4123
    unsigned long v27;  // x9
    unsigned long long iter;  // x10
    unsigned long long v11;  // 4112
    unsigned long long v29;  // x11
    unsigned int v30;  // w12
    unsigned int v31;  // w13
    unsigned long v32;  // cc_dep1
    unsigned int v33;  // w13
    unsigned long long v34;  // 4112
    unsigned long long v35;  // 4102
    unsigned long long v36;  // 4112
    unsigned long long v37;  // 4102
    unsigned int v38;  // w11
    unsigned long long v12;  // x0
    unsigned long long v39;  // 4108
    unsigned long long v40;  // x24
    unsigned long long v41;  // 4116
    unsigned long long v13;  // w24
    char *v14;  // x23
    unsigned long long v15;  // w24
    unsigned long v16;  // x25
    unsigned int v17;  // w9
    unsigned int v18;  // w10
    unsigned int v0;  // [bp-0x80]
    char *v1;  // [bp-0x78]
    char v2;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned int v3;  // [bp-0x6c]
    char *v4;  // [bp-0x68]
    unsigned long long v5;  // [bp-0x60]
    char v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = sub_ab1c50();
    v5 = 0;
    v3 = 22;
    v0 = 2;
    v1 = &v2;
    v10 = sub_af8d64(v9, 13, 0xffffffff);
    v11 = arm64g_calculate_condition(1, v10 & 0xffffffff, 1, 0);
    if (v11 & 1)
        return 0;
    do
    {
        v12 = sub_9c3fc4(&v6, sub_9f2aec(sub_af8cf4(v9, v10), v10));
        if (v12 >> 31 & 1)
            return 0x11;
        v13 = (unsigned int)v12;
        v14 = (char *)v6;
        if ((unsigned int)v12)
        {
            do
            {
                v15 = v13;
            } while (!*(&v14[v13] - 1) && (v13 = v15 - 1, v15 != 1));
        }
        v16 = v13;
        if (_memchr(v14, 0, v16))
        {
            sub_a6c2e4(v14, "crypto/x509/v3_ncons.c", 382);
            return 53;
        }
        if (v13 < 1)
            continue;
        v17 = *v14;
        v18 = (v17 & 223) - 65;
        v19 = v18;
        if (26 <= v18)
        {
            v20 = v17 - 58;
            if (v17 != 95)
            {
                v21 = arm64g_calculate_condition(19, v19, 26, 0);
                v22 = 1;
                v23 = (v21 & 1 ? v20 : 0x20000000);
                v24 = (v21 & 1 ? 10 : 0);
            }
            else
            {
                v25 = arm64g_calculate_condition(19, v19, 26, 0);
                v22 = 0;
                v23 = (v25 & 1 ? v20 : 0x20000000);
                v24 = (v25 & 1 ? 10 : 0);
            }
            v26 = arm64g_calculate_condition(v22 | 32, v23, v24, 0);
            if (v13 == 1 || !(v26 & 1))
                continue;
        }
        else if (!(v13 != 1))
        {
            continue;
        }
        v27 = -v16;
        iter = 1;
        v29 = 1;
        while (1)
        {
            iter += 1;
            while (1)
            {
                v30 = *(&v14[iter] - 1);
                v31 = (v30 & 223) - 65;
                v32 = v31;
                if (v31 >= 26)
                    break;
LABEL_ae8bc0:
                iter += 1;
                if (v27 + iter == 1)
                {
                    if (v29 & 1)
                        goto LABEL_ae8c4c;
LABEL_ae8c7c:
                    v2 = v13;
                    v4 = v14;
                    v40 = sub_ae8894(&v0, a1);
                    sub_a6c2e4(v14, "crypto/x509/v3_ncons.c", 472);
                    if ((unsigned int)v40)
                        return v40;
                    goto LABEL_ae8c5c;
                }
            }
            v33 = v30 - 48;
            if (v30 != 95)
            {
                v34 = arm64g_calculate_condition(19, v32, 26, 0);
                v35 = arm64g_calculate_condition(0x33, (v34 & 1 ? v33 : 0), (v34 & 1 ? 10 : 0), 0);
                if (v35 & 1)
                    goto LABEL_ae8bc0;
            }
            else
            {
                v36 = arm64g_calculate_condition(19, v32, 26, 0);
                v37 = arm64g_calculate_condition(48, (v36 & 1 ? v33 : 0), (v36 & 1 ? 10 : 0), 0);
                if (v37 & 1)
                    goto LABEL_ae8bc0;
            }
            if ((long long)(v13 - 1) <= (long long)(iter - 1))
                break;
            if (v30 == 45)
                goto LABEL_ae8bc0;
            if (v30 != 46 || !(v38 = v14[iter], v14[iter] != 46 && v14[iter] != 45 && *(&v14[iter] - 2) != 45))
                break;
            v29 = 0;
            v39 = arm64g_calculate_condition(18, v27, iter, 0);
            if (!(v39 & 1))
                goto LABEL_ae8c7c;
        }
LABEL_ae8c4c:
        sub_a6c2e4(v14, "crypto/x509/v3_ncons.c", 430);
LABEL_ae8c5c:
        v10 = sub_af8d64(v9, 13, v10);
        v41 = arm64g_calculate_condition(0x11, v10 & 0xffffffff, 1, 0);
    } while (v41 & 1);
    return 0;
}
