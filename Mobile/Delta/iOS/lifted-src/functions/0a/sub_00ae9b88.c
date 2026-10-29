/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae9b88..0xaea158 (1488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae9b88_0 {
    int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_ae9b88_0;

extern char g_10002b0;

unsigned long long sub_ae9b88(unsigned long long *a0, unsigned long long *a1, unsigned long a2, st_ae9b88_0 **a3)
{
    unsigned long v11;  // x23
    unsigned long v12;  // x21
    unsigned long v22;  // x0
    long long v23;  // x2
    unsigned long long v24;  // x0
    unsigned long long v25;  // x21
    unsigned long long v26;  // x24
    unsigned long long v27;  // w0
    unsigned long long v28;  // w24
    unsigned long long v29;  // x0
    st_ae9b88_0 *v30;  // x8
    st_ae9b88_0 *v13;  // x22
    unsigned long long v31;  // x9
    long long v33;  // x1
    unsigned long long v34;  // x0
    unsigned long long v35;  // x21
    unsigned long long v36;  // x0
    st_ae9b88_0 *v37;  // x9
    unsigned long long v38;  // w8
    unsigned long long v39;  // x0
    st_ae9b88_0 *v14;  // x22
    long long v15;  // x1
    long long v16;  // x1
    unsigned long long len;  // x21
    unsigned long long v18;  // x0
    st_ae9b88_0 *v19;  // x8
    unsigned long long v20;  // w9
    unsigned long long v0;  // [bp-0x890]
    unsigned long v1;  // [bp-0x888]
    unsigned long long v2;  // [bp-0x880]
    unsigned long v3;  // [bp-0x878]
    unsigned long long v4;  // [bp-0x870]
    unsigned long v5;  // [bp-0x868]
    long long n;  // [bp-0x860]
    char v7;  // [bp-0x858]
    unsigned long v8;  // [bp-0x58]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v11 = a0[1];
    if (_strcmp(v11, "language"))
    {
        if (_strcmp(v11, "pathlen"))
        {
            if (!_strcmp(v11, "policy"))
            {
                v12 = a0[2];
                v13 = *a3;
                v14 = v13;
                if (v14 || !(v14 = sub_9cf0ec(), *a3 = v14, !v14))
                {
                    if (!_strncmp(v12, "hex:", 4))
                    {
                        v34 = sub_a6df78(v12 + 4, &n);
                        if (v34)
                        {
                            v35 = v34;
                            v36 = sub_a6c1b4(*a3->field_8, *a3->field_0 + n + 1, "crypto/x509/v3_pci.c", 144);
                            if (v36)
                            {
                                *a3->field_8 = v36;
                                _memcpy(*a3->field_8 + *a3->field_0, v35, n);
                                v37 = *a3;
                                v38 = v37->field_0 + (unsigned int)n;
                                v37->field_0 = v38;
                                *(char *)(v37->field_8 + v38) = 0;
                                sub_a6c2e4(v35, "crypto/x509/v3_pci.c", 163);
                                if (*(long long *)&g_10002b0 == v8)
                                    return 1;
                                ___stack_chk_fail();
                            }
                            else
                            {
                                sub_a6c2e4(v35, "crypto/x509/v3_pci.c", 152);
                                v22 = *a3->field_8;
                                v23 = 157;
                                goto LABEL_aea08c;
                            }
                            goto LABEL_aea08c;
                        }
                    }
                    else if (!_strncmp(v12, "file:", 5))
                    {
                        v24 = sub_9d8180(v12 + 5, "r");
                        if (v24)
                        {
                            v25 = v24;
                            v26 = 1;
                            do
                            {
                                while (1)
                                {
                                    v27 = (unsigned int)sub_9d3d84(v25, &v7, 0x800);
                                    if (0 >= v27)
                                        break;
                                    v28 = v27;
                                    v29 = sub_a6c1b4(*a3->field_8, v27 + *a3->field_0 + 1, "crypto/x509/v3_pci.c", 179);
                                    if (v29)
                                    {
                                        *a3->field_8 = v29;
                                        _memcpy(*a3->field_8 + *a3->field_0, &v7, v28);
                                        v26 = 0;
                                        v30 = *a3;
                                        v31 = v30->field_0 + v28;
                                        v30->field_0 = v31;
                                        *(char *)(v30->field_8 + v31) = 0;
                                    }
                                    else
                                    {
                                        sub_a6c2e4(*a3->field_8, "crypto/x509/v3_pci.c", 182);
                                        *a3->field_8 = 0;
                                        *a3->field_0 = 0;
                                        v4 = ",value:";
                                        v5 = a0[2];
                                        v2 = ",name:";
                                        v3 = a0[1];
                                        v0 = "section:";
                                        v1 = *a0;
                                        sub_a364a0(6);
                                        sub_9d5018(v25);
                                        if (v13)
                                        {
                                            if (*(long long *)&g_10002b0 == v8)
                                                return 0;
                                            ___stack_chk_fail();
                                        }
                                        else
                                        {
                                            sub_9cf0f4(*a3);
                                            *a3 = 0;
                                            if (*(long long *)&g_10002b0 == v8)
                                                return 0;
                                            ___stack_chk_fail();
                                        }
                                    }
                                }
                                if (v27)
                                {
                                    sub_a368c8(sub_9d5018(v25));
                                    v33 = 198;
                                    goto LABEL_aea050;
                                }
                            } while (sub_9d3d68(v25, 8));
                            sub_9d5018(v25);
                            if (!(v26 & 1))
                            {
                                if (*(long long *)&g_10002b0 == v8)
                                    return 1;
                                ___stack_chk_fail();
                            }
                        }
                        else
                        {
                            sub_a368c8();
                            v33 = 169;
LABEL_aea050:
                            sub_a369bc("crypto/x509/v3_pci.c", v33, "process_pci_value");
                            v16 = 524320;
LABEL_aea060:
                            sub_a36abc(0x22, v16, 0);
                        }
                    }
                    else if (_strncmp(v12, "text:", 5))
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/x509/v3_pci.c", 224, "process_pci_value");
                        v16 = 152;
                        goto LABEL_aea060;
                    }
                    else
                    {
                        len = _strlen(v12 + 5);
                        v18 = sub_a6c1b4(v14->field_8, len + v14->field_0 + 1, "crypto/x509/v3_pci.c", 205);
                        if (v18)
                        {
                            *a3->field_8 = v18;
                            _memcpy(*a3->field_8 + *a3->field_0, a0[2] + 5, len);
                            v19 = *a3;
                            v20 = v19->field_0 + (unsigned int)len;
                            v19->field_0 = v20;
                            *(char *)(v19->field_8 + v20) = 0;
                            if (*(long long *)&g_10002b0 == v8)
                                return 1;
                            ___stack_chk_fail();
                        }
                        else
                        {
                            v22 = *a3->field_8;
                            v23 = 217;
                        }
LABEL_aea08c:
                        sub_a6c2e4(v22, "crypto/x509/v3_pci.c", v23);
                        *a3->field_8 = 0;
                        *a3->field_0 = 0;
                    }
                    v4 = ",value:";
                    v5 = a0[2];
                    v2 = ",name:";
                    v3 = a0[1];
                    v0 = "section:";
                    v1 = *a0;
                    sub_a364a0(6);
                    if (v13)
                    {
                        if (*(long long *)&g_10002b0 == v8)
                            return 0;
                        ___stack_chk_fail();
                    }
                    else
                    {
                        sub_9cf0f4(*a3);
                        *a3 = 0;
                        if (*(long long *)&g_10002b0 == v8)
                            return 0;
                        ___stack_chk_fail();
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_pci.c", 129, "process_pci_value");
                    v15 = 524301;
                }
            }
            else
            {
                if (*(long long *)&g_10002b0 == v8)
                    return 1;
                ___stack_chk_fail();
            }
        }
        else
        {
            if (*(long long *)a2)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_pci.c", 112, "process_pci_value");
                v15 = 157;
            }
            else if (!sub_aef870(a0, a2))
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_pci.c", 117, "process_pci_value");
                v15 = 156;
            }
            else
            {
                if (*(long long *)&g_10002b0 == v8)
                    return 1;
                ___stack_chk_fail();
            }
        }
    }
    else
    {
        if (*a1)
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_pci.c", 100, "process_pci_value");
            v15 = 155;
        }
        else
        {
            v39 = sub_a997a4(a0[2], 0);
            *a1 = v39;
            if (!v39)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_pci.c", 105, "process_pci_value");
                v15 = 110;
            }
            else
            {
                if (*(long long *)&g_10002b0 == v8)
                    return 1;
                ___stack_chk_fail();
            }
        }
    }
    sub_a36abc(0x22, v15, 0);
    v4 = ",value:";
    v5 = a0[2];
    v2 = ",name:";
    v3 = a0[1];
    v0 = "section:";
    v1 = *a0;
    sub_a364a0(6);
    if (*(long long *)&g_10002b0 == v8)
        return 0;
    ___stack_chk_fail();
}
