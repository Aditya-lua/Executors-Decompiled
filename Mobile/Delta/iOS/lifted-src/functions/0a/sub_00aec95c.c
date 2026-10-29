/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaec95c..0xaecd38 (988 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_aec95c(char *a0, unsigned long a1, long long a2, char *a3, char *a4, char *a5)
{
    char *v3;  // x19
    char *v4;  // x24
    char *v13;  // x0
    char *v14;  // x0
    char *v15;  // x0
    char *v16;  // x0
    char *v17;  // x0
    char *v18;  // x0
    long long v19;  // x0
    char *v5;  // x25
    char *v6;  // x1
    char *ptr;  // x0
    char *v9;  // x24
    char *v10;  // x0
    char *v11;  // x0
    char *v12;  // x0
    char *v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a4)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_san.c", 0x200, "a2i_GENERAL_NAME");
        sub_a36abc(0x22, 124, 0);
        return 0;
    }
    v3 = a0;
    if (!v3)
    {
        v3 = sub_ae75a4();
        if (!v3)
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_san.c", 521, "a2i_GENERAL_NAME");
            sub_a36abc(0x22, 0x8000d, 0);
            return v3;
        }
    }
    if (5 >= a3)
    {
        if (a3 - 1 < 2)
            goto LABEL_aeca74;
        switch (a3)
        {
        case 0:
            ptr = _strchr(a4, 59);
            if (ptr)
            {
                v9 = ptr;
                v10 = sub_ae7574();
                *(char **)&v3[8] = v10;
                if (v10)
                {
                    sub_9cf1fc(*(long long *)&v10[8]);
                    v11 = sub_9c613c(v9 + 1, a2);
                    *(char **)(*(long long *)&v3[8] + 8) = v11;
                    if (v11)
                    {
                        v12 = sub_a6da14(a4, (int)(v9 - a4), "crypto/x509/v3_san.c", 649);
                        if (v12)
                        {
                            v13 = sub_a997a4();
                            *(char **)*(long long *)&v3[8] = v13;
                            sub_a6c2e4(v12, "crypto/x509/v3_san.c", 653);
                            if (*(long long *)*(long long *)&v3[8])
                            {
                                *(unsigned int *)v3 = (unsigned int)a3;
                                return v3;
                            }
                        }
                    }
                    sub_ae7580(*(long long *)&v3[8]);
                    *(unsigned long long *)&v3[8] = 0;
                }
            }
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_san.c", 564, "a2i_GENERAL_NAME");
            break;
        case 4:
            v4 = sub_afa384();
            if (v4)
            {
                v5 = sub_ae4a14(a2, a4);
                if (!v5)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_san.c", 674, "do_dirname");
                    v0 = a4;
                    sub_a36abc(0x22, 150, "section=%s");
                }
                else if (sub_af083c(v4, v5, 0x1001))
                {
                    *(char **)&v3[8] = v4;
                    sub_ae4a74(a2, v5);
                    *(unsigned int *)v3 = (unsigned int)a3;
                    return v3;
                }
            }
            else
            {
                v5 = 0;
            }
            sub_afa390(v4);
            v6 = v5;
            sub_a368c8(sub_ae4a74(a2, v6), v6);
            sub_a369bc("crypto/x509/v3_san.c", 557, "a2i_GENERAL_NAME");
            break;
        default:
            goto LABEL_aecb0c;
        }
        goto LABEL_aecd00;
    }
    if (a3 != 6)
    {
        if (a3 == 7)
        {
            v15 = a4;
            if (a5)
            {
                v16 = sub_af057c(v15);
                *(char **)&v3[8] = v16;
                if (v16)
                {
                    *(unsigned int *)v3 = (unsigned int)a3;
                    return v3;
                }
            }
            else
            {
                v17 = sub_af04ec(v15);
                *(char **)&v3[8] = v17;
                if (v17)
                {
                    *(unsigned int *)v3 = (unsigned int)a3;
                    return v3;
                }
            }
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_san.c", 549, "a2i_GENERAL_NAME");
            v0 = a4;
        }
        else if (a3 == 8)
        {
            v14 = sub_a997a4(a4, 0);
            if (v14)
            {
                *(char **)&v3[8] = v14;
                *(unsigned int *)v3 = (unsigned int)a3;
                return v3;
            }
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_san.c", 536, "a2i_GENERAL_NAME");
            v0 = a4;
        }
        else
        {
LABEL_aecb0c:
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_san.c", 569, "a2i_GENERAL_NAME");
LABEL_aecd00:
        }
        sub_a36abc();
        if (a0)
            return 0;
        sub_ae75b0(v3);
        return 0;
    }
LABEL_aeca74:
    v18 = sub_9cf180();
    *(char **)&v3[8] = v18;
    if (v18 && sub_9c7770(v18, a4, _strlen(a4)))
    {
        *(unsigned int *)v3 = (unsigned int)a3;
        return v3;
    }
    v19 = sub_9cf0f4();
    *(unsigned long long *)&v3[8] = 0;
    sub_a368c8(v19);
    sub_a369bc("crypto/x509/v3_san.c", 577, "a2i_GENERAL_NAME");
    goto LABEL_aecd00;
}
