/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafeadc..0xafedfc (800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_afeadc(void* a0, unsigned long long a1, unsigned long long *a2, unsigned long a3, long long a4, long long a5)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned int v14;  // w0
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4109
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4109
    unsigned long v5;  // x24
    unsigned int v6;  // w8
    long long v7;  // x1
    long long v8;  // x1
    unsigned long v9;  // cc_dep1
    unsigned long long v10;  // x0
    unsigned long long v11;  // x21
    unsigned long long v12;  // x0
    unsigned long v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_aafbcc((long long)a0[8]);
    v4 = sub_a2f9e0(v3);
    if (!(unsigned int)v4)
        return v4;
    v5 = (int)v3;
    v6 = (int)a0[16];
    if (v6 == 7)
    {
        if (!a1)
        {
            *a2 = 48;
            return 1;
        }
        if (47 < a3)
            goto LABEL_afebc4;
        sub_a368c8();
        v7 = 243;
        goto LABEL_afeb80;
    }
    else
    {
        if (!a1)
        {
            if ((unsigned int)v5)
            {
                *a2 = v5;
                return 1;
            }
            sub_a368c8();
            sub_a369bc("providers/implementations/asymciphers/rsa_enc.c", 249, "rsa_decrypt");
            v8 = 158;
        }
        else if (v5 > a3)
        {
            sub_a368c8();
            v7 = 0x101;
LABEL_afeb80:
            sub_a369bc("providers/implementations/asymciphers/rsa_enc.c", v7, "rsa_decrypt");
            v8 = 142;
        }
        else
        {
            v9 = v6;
            if (v6 != 4)
            {
                if (!(int)a0[64])
                {
                    v16 = arm64g_calculate_condition(3, v9, 4, 0);
                    v17 = arm64g_calculate_condition(3, (v16 & 1 ? v6 : 0), v16 & 1, 0);
                    if (!(v17 & 1))
                        goto LABEL_afec6e;
LABEL_afec6d:
                }
                else
                {
                    v18 = arm64g_calculate_condition(3, v9, 4, 0);
                    v19 = arm64g_calculate_condition(0, (v18 & 1 ? v6 : 0), v18 & 1, 0);
                    if (v19 & 1)
                        goto LABEL_afec6d;
LABEL_afec6e:
                }
                v14 = sub_aafc0c();
                *a2 = ~((int)(v14) >> 63) & v14 | (int)(v14) >> 63 & *a2;
                return (0xffffffff ^ (int)(v14) >> 31) & 1;
            }
LABEL_afebc4:
            v10 = sub_a6bf4c(v5, "providers/implementations/asymciphers/rsa_enc.c", 266);
            if (!v10)
                return v10;
            v11 = v10;
            if (sub_aafc0c(a5, a4, v11, (long long)a0[8], 3) != (unsigned int)v5)
            {
                sub_a368c8(sub_a6c2e4(v11, "providers/implementations/asymciphers/rsa_enc.c", 275), "providers/implementations/asymciphers/rsa_enc.c", 275);
                sub_a369bc("providers/implementations/asymciphers/rsa_enc.c", 276, "rsa_decrypt");
                v8 = 162;
            }
            else if ((int)a0[16] == 4)
            {
                if ((long long)a0[24] || !(v12 = sub_a40ca8(*(long long *)a0, "SHA-1", 0), *(unsigned long long *)&a0[24] = v12, !v12))
                {
                    v0 = (long long)a0[32];
                    v14 = sub_ab30ec(a1, a3, v11, v5, v5, (long long)a0[40], (int)a0[48]);
                    sub_a6c2e4(v11, "providers/implementations/asymciphers/rsa_enc.c", 305);
                    *a2 = ~((int)(v14) >> 63) & v14 | (int)(v14) >> 63 & *a2;
                    return (0xffffffff ^ (int)(v14) >> 31) & 1;
                }
                sub_a368c8(sub_a6c2e4(v11, "providers/implementations/asymciphers/rsa_enc.c", 283), "providers/implementations/asymciphers/rsa_enc.c", 283);
                sub_a369bc("providers/implementations/asymciphers/rsa_enc.c", 284, "rsa_decrypt");
                v8 = 786691;
            }
            else if ((int)a0[56])
            {
                v14 = sub_ab652c(*(long long *)a0, a1, a3, v11, v5);
                sub_a6c2e4(v11, "providers/implementations/asymciphers/rsa_enc.c", 305);
                *a2 = ~((int)(v14) >> 63) & v14 | (int)(v14) >> 63 & *a2;
                return (0xffffffff ^ (int)(v14) >> 31) & 1;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/asymciphers/rsa_enc.c", 297, "rsa_decrypt");
                sub_a36abc(57, 161, 0);
                sub_a6c2e4(v11, "providers/implementations/asymciphers/rsa_enc.c", 298);
                return 0;
            }
        }
        sub_a36abc(57, v8, 0);
        return 0;
    }
}
