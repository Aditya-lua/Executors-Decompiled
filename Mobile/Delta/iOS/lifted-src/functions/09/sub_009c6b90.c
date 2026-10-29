/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c6b90..0x9c705c (1228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern void g_e89e3c;

unsigned long long sub_9c6b90(char *a0, unsigned long long a1, void* a2)
{
    unsigned long long v14;  // x26
    unsigned long long v15;  // x25
    unsigned long long v24;  // x22
    unsigned long long v25;  // x8
    unsigned long long v26;  // x20
    unsigned long long v27;  // x23
    unsigned long long v28;  // 4116
    unsigned long long len;  // x0
    unsigned long v30;  // x24
    void* v31;  // x25
    unsigned long long v32;  // w26
    unsigned long long v33;  // w26
    unsigned long long v16;  // x24
    unsigned long v34;  // x8
    unsigned long long v35;  // 4118
    int v37;  // w8
    unsigned long long v38;  // w11
    void* v39;  // x8
    unsigned long long v40;  // 4142
    unsigned long long v41;  // w9
    int v42;  // w8
    unsigned long long v43;  // w12
    unsigned long long v17;  // x23
    unsigned long long v44;  // 4142
    long long v47;  // x1
    int v48;  // w8
    unsigned long long v49;  // 4142
    int v50;  // w8
    unsigned long long v51;  // w10
    unsigned long long v52;  // 4142
    unsigned long long v53;  // 4118
    unsigned long long v18;  // x22
    unsigned long long v19;  // x21
    unsigned long long v20;  // x20
    unsigned long long v21;  // x19
    unsigned long long v22;  // x30
    void* v23;  // x19
    char *v0;  // [bp-0x60]
    unsigned int v1;  // [bp-0x58]
    unsigned int v2;  // [bp-0x54]
    unsigned long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    if (!a0)
        return 0xffffffff;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = &v13;
    v12 = v22;
    v23 = a2;
    v24 = a1;
    if ((int)a1 >= 1)
    {
        v25 = 0;
        v26 = a0 + 1;
        do
        {
            if (*(char *)(v26 - 1) == 58)
            {
                v27 = ~(unsigned int)v25 + v24;
                goto LABEL_9c6c08;
            }
        } while ((v25 = (unsigned int)v25 + 1, v26 += 1, (unsigned int)v24 != (unsigned int)v25));
    }
    v27 = 0;
    v26 = 0;
    v25 = v24;
LABEL_9c6c08:
    v28 = arm64g_calculate_condition(0x11, v25 & 0xffffffff, 1, 0);
    len = v25;
    if (!(v28 & 1))
        len = _strlen(a0);
    v30 = (int)len;
    v31 = &g_e89e3c;
    v32 = 49;
    while (1)
    {
        v33 = v32;
        if ((unsigned int)v30 == *(int *)((char *)v31 - 4) && !sub_a6e258(*(long long *)((char *)v31 - 12), a0, v30))
            break;
        v31 += 16;
        v32 = v33 - 1;
        if (v33 == 1)
            goto LABEL_9c6c80;
    }
    v34 = *(int *)v31;
    v35 = arm64g_calculate_condition(1, v34 & 0xffffffff, 1, 0);
    if (v35 & 1)
    {
LABEL_9c6c80:
        sub_a368c8();
        sub_a369bc("crypto/asn1/asn1_gen.c", 275, "asn1_cb");
        v0 = a0;
        sub_a36abc(13, 194, "tag=%s");
        return 0xffffffff;
    }
    if (!(v34 >> 16 & 1))
    {
        *(unsigned int *)&v23[8] = v34;
        *(unsigned long long *)&v23[16] = v26;
        if (v26 || !a0[(unsigned int)v25])
            return 0;
        sub_a368c8();
        sub_a369bc("crypto/asn1/asn1_gen.c", 285, "asn1_cb");
        sub_a36abc(13, 189, 0);
        return 0xffffffff;
        return 0;
    }
    if ((int)v34 > 65540)
    {
        if (65542 >= (int)v34)
        {
            if ((unsigned int)v34 != 65541)
            {
                if ((unsigned int)v34 != 65542)
                    return 1;
                v37 = (int)v23[504];
                if (v37 != 20)
                {
                    v38 = *(int *)v23;
                    *(int *)&v23[504] = v37 + 1;
                    v39 = v23 + v37 * 24 + 24;
                    v40 = arm64g_calculate_condition(0x11, v38, 1, 0);
                    if (v40 & 1)
                        goto LABEL_9c6f60;
                    v41 = 0;
                    v38 = 16;
                    goto LABEL_9c7014;
                }
            }
            else
            {
                v42 = (int)v23[504];
                if (v42 != 20)
                {
                    v43 = *(int *)v23;
                    *(int *)&v23[504] = v42 + 1;
                    v39 = v23 + v42 * 24 + 24;
                    v44 = arm64g_calculate_condition(1, v43, 1, 0);
                    if (!(v44 & 1))
                    {
                        v41 = (int)v23[4];
                        *(unsigned long long *)v23 = 0xffffffffffffffff;
                    }
                    else
                    {
                        v41 = 0;
                        v43 = 4;
                    }
                    *(unsigned int *)v39 = v43;
                    *(unsigned int *)&v39[4] = v41;
                    *(unsigned int *)&v39[8] = 0;
                    *(unsigned int *)&v39[12] = 0;
                    return 1;
                }
            }
            goto LABEL_9c6ee0;
        }
        if ((unsigned int)v34 == 65543)
        {
            v48 = (int)v23[504];
            if (v48 != 20)
            {
                v38 = *(int *)v23;
                *(int *)&v23[504] = v48 + 1;
                v39 = v23 + v48 * 24 + 24;
                v49 = arm64g_calculate_condition(1, v38, 1, 0);
                if (!(v49 & 1))
                {
LABEL_9c6f60:
                    v41 = (int)v23[4];
                    *(unsigned long long *)v23 = 0xffffffffffffffff;
                }
                else
                {
                    v41 = 0;
                    v38 = 0x11;
                }
LABEL_9c7014:
                *(unsigned int *)v39 = v38;
                *(unsigned int *)&v39[4] = v41;
                *(unsigned int *)&v39[8] = 1;
                *(unsigned int *)&v39[12] = 0;
                return 1;
            }
LABEL_9c6ee0:
            sub_a368c8();
            sub_a369bc("crypto/asn1/asn1_gen.c", 480, "append_exp");
            sub_a36abc(13, 174, 0);
            return 0xffffffff;
        }
        else if ((unsigned int)v34 == 65544)
        {
            if (!v26)
            {
                sub_a368c8();
                v47 = 333;
            }
            else if (!_strncmp(v26, "ASCII", 5))
            {
                *(unsigned int *)&v23[12] = 1;
                return 1;
            }
            else if (_strncmp(v26, "UTF8", 4))
            {
                if (*(char *)v26 == 72 && *(char *)(v26 + 1) == 69 && *(char *)(v26 + 2) == 88)
                {
                    *(unsigned int *)&v23[12] = 3;
                    return 1;
                }
                if (!_strncmp(v26, "BITLIST", 7))
                {
                    *(unsigned int *)&v23[12] = 4;
                    return 1;
                }
                sub_a368c8();
                v47 = 345;
            }
            else
            {
                *(unsigned int *)&v23[12] = 2;
                return 1;
            }
            sub_a369bc("crypto/asn1/asn1_gen.c", v47, "asn1_cb");
            sub_a36abc(13, 160, 0);
        }
        else
        {
            return 1;
        }
    }
    else
    {
        if ((unsigned int)v34 == 65537)
        {
            v53 = arm64g_calculate_condition(1, *(int *)v23, 1, 0);
            if (!(v53 & 1))
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/asn1_gen.c", 296, "asn1_cb");
                sub_a36abc(13, 181, 0);
                return 0xffffffff;
            }
            if (!sub_9c705c(v26, v27, v23, v23 + 4))
                return 0xffffffff;
            return 1;
        }
        else if ((unsigned int)v34 != 65538)
        {
            if ((unsigned int)v34 == 65540)
            {
                v50 = (int)v23[504];
                if (v50 != 20)
                {
                    v51 = *(int *)v23;
                    *(int *)&v23[504] = v50 + 1;
                    v39 = v23 + v50 * 24 + 24;
                    v52 = arm64g_calculate_condition(1, v51, 1, 0);
                    if (!(v52 & 1))
                    {
                        v41 = (int)v23[4];
                        *(unsigned long long *)v23 = 0xffffffffffffffff;
                    }
                    else
                    {
                        v41 = 0;
                        v51 = 3;
                    }
                    *(unsigned int *)v39 = v51;
                    *(unsigned int *)&v39[4] = v41;
                    *(unsigned int *)&v39[8] = 0;
                    *(unsigned int *)&v39[12] = 1;
                    return 1;
                }
            }
            else
            {
                return 1;
            }
        }
        else
        {
            if (!sub_9c705c(v26, v27, &v2, &v1))
            {
                return 0xffffffff;
            }
            else if (!sub_9c71a0(v23, v2, v1, 1, 0, 0))
            {
                return 0xffffffff;
            }
            else
            {
                return 1;
            }
        }
        goto LABEL_9c6ee0;
    }
    return 0xffffffff;
}
