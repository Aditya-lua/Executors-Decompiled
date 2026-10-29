/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6b29c..0xc6b55c (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_dfe83c;
extern char g_dfe840;
extern long long g_dfe844;
extern long long g_dfe88b;
extern long long g_dfe89a;

unsigned long long sub_c6b29c(long long a0, long long a1, long long a2)
{
    unsigned long long v13;  // x28
    unsigned long long v14;  // x27
    unsigned long long v23;  // x30
    unsigned int v24;  // w21
    unsigned long long v25;  // x26
    unsigned int v26;  // w0
    unsigned int v27;  // w0
    unsigned int v28;  // w0
    unsigned int v29;  // w0
    long long v30;  // x24
    long long v31;  // x25
    unsigned long long v32;  // x0
    unsigned long long v15;  // x26
    unsigned long long v33;  // x0
    unsigned long long v34;  // x0
    unsigned int v35;  // w0
    unsigned long long v36;  // x0
    unsigned long long v37;  // x0
    long long v39;  // x1
    unsigned long long v16;  // x25
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    if (!a2)
        return 0;
    v0 = v13;
    v1 = v14;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = &v12;
    v11 = v23;
    if (sub_ab8c18(a2))
        goto LABEL_c6b3b0;
    v24 = sub_ab8ca8(a2);
    v25 = sub_ab8ce4(a2);
    v26 = sub_ab8cf8(a2);
    if (v25 >> 31 & 1)
    {
        sub_a368c8();
        sub_a369bc("providers/common/der/der_rsa_key.c", 308, "ossl_DER_w_RSASSA_PSS_params");
        v39 = 150;
    }
    else if (v26 == 1)
    {
        v27 = sub_ab8ca8(0);
        v28 = sub_ab8ce4(0);
        v29 = sub_ab8cf8(0);
        if (v24 - 672 > 3)
        {
            switch (v24)
            {
            case 64:
                v30 = &g_dfe844;
                v31 = 11;
                goto LABEL_c6b434;
            case 1094:
                v30 = &g_dfe88b;
                break;
            case 1095:
                v30 = &g_dfe89a;
                break;
            default:
LABEL_c6b3b0:
                return 0;
            }
            v31 = 15;
LABEL_c6b434:
            v32 = sub_c68640(a0, a1);
            if (!(unsigned int)v32)
                return v32;
            if (v29 != 1)
            {
                v33 = sub_a69aec(a0, 3, 1);
                if (!(unsigned int)v33)
                    return v33;
            }
            if ((unsigned int)v25 != v28)
            {
                v34 = sub_a69aec(a0, 2, v25);
                if (!(unsigned int)v34)
                    return v34;
            }
            if (sub_ab8cbc(a2) != 911)
                goto LABEL_c6b3b0;
            v35 = sub_ab8cd0(a2);
            if (v35 - 672 <= 3)
                goto *((void *)(sub_c6b4e4 + *(&(&g_dfe840)[v35] - 672) * 4));
            switch (v35)
            {
            case 64:
                if (v24 == v27)
                    return sub_a69b58(a0, a1) != 0;
                v37 = sub_c68354(a0, 0, v30, v31);
                if (!(unsigned int)v37)
                    return v37;
                return sub_a69b58(a0, a1) != 0;
            case 1094:
                break;
            case 1095:
                break;
            default:
LABEL_c6b3b0:
                goto LABEL_c6b3b0;
            }
            v36 = sub_c68354(a0, 1);
            if (!(unsigned int)v36)
                return v36;
        }
        else
        {
            goto *((void *)(sub_c6b3e8 + *(&(&g_dfe83c)[v24] - 672) * 4));
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/common/der/der_rsa_key.c", 312, "ossl_DER_w_RSASSA_PSS_params");
        v39 = 139;
    }
    sub_a36abc(4, v39, 0);
}
