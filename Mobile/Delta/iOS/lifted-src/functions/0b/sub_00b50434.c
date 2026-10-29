/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb50434..0xb50794 (864 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b50434_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[24];
    unsigned int field_30;
    char padding_34[148];
    unsigned long long field_c8;
} st_b50434_0;


unsigned long long sub_b50434(st_b50434_0 *a0, unsigned long long a1, unsigned long long *a2, unsigned long long a3, long long a4, long long a5)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // w0
    unsigned long v7;  // x23
    unsigned int v8;  // w0
    unsigned long long v9;  // x2
    long long v10;  // x1
    long long v11;  // x1
    unsigned long long v12;  // x0
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68], Other Possible Types: unsigned long
    char v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_a2f9e0();
    if (!(unsigned int)v5)
    {
        return (unsigned int)v5;
    }
    else if (a1)
    {
        if (!*(long long *)&a0->padding_18[8])
        {
            v12 = sub_aafbcc(a0->field_10);
            if ((int)v12 > a3)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 1011, "rsa_verify_recover");
                goto LABEL_b505c4;
            }
            else
            {
                v7 = sub_aafc18(a5, a4, a1, a0->field_10, *(int *)&a0->padding_34[52]);
                if (!(v7 >> 31 & 1))
                {
                    *a2 = (int)v7;
                    return 1;
                }
                sub_a368c8();
                v11 = 1025;
                goto LABEL_b5074c;
            }
            goto LABEL_b5074c;
        }
        if (*(int *)&a0->padding_34[52] == 1)
        {
            v12 = sub_a50ac8();
            if ((int)v12 <= 0)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 984, "rsa_verify_recover");
                v10 = 166;
                goto LABEL_b5075c;
            }
            if ((v12 & 0xffffffff) > a3)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 988, "rsa_verify_recover");
LABEL_b505c4:
                v1 = v12;
LABEL_b505c8:
                v0 = a3;
                v9 = "buffer size is %d, should be %d";
                v10 = 106;
            }
            else
            {
                if ((int)sub_ab93d0(a0->field_30, 0, 0, a1, &v2, a4, a5, a0->field_10) > 0)
                {
                    *a2 = v2;
                    return 1;
                }
                sub_a368c8();
                v11 = 996;
LABEL_b5074c:
                sub_a369bc("providers/implementations/signature/rsa_sig.c", v11, "rsa_verify_recover");
                v10 = 524292;
                goto LABEL_b5075c;
            }
        }
        else if (*(int *)&a0->padding_34[52] == 5)
        {
            if (!a0->field_c8)
            {
                v5 = sub_a6bf4c(sub_aafbcc(a0->field_10), "providers/implementations/signature/rsa_sig.c", 614);
                a0->field_c8 = v5;
                if (!v5)
                    return (unsigned int)v5;
            }
            v6 = (unsigned int)sub_aafc18(a5, a4);
            if (v6 <= 0)
            {
                sub_a368c8();
                v11 = 952;
                goto LABEL_b5074c;
            }
            v7 = v6 - 1;
            v8 = sub_aba5a8(a0->field_30);
            if (v8 != *(char *)(a0->field_c8 + v7))
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 957, "rsa_verify_recover");
                v10 = 173;
LABEL_b5075c:
                v9 = 0;
            }
            else if ((unsigned int)v7 == sub_a50ac8(*(long long *)&a0->padding_18[8]))
            {
                *a2 = v7;
                if (a0->field_c8 == a1)
                {
                    *a2 = (int)v7;
                    return 1;
                }
                else if (v7 > a3)
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/rsa_sig.c", 970, "rsa_verify_recover");
                    v1 = v7;
                    goto LABEL_b505c8;
                }
                else
                {
                    _memcpy(a1);
                    *a2 = (int)v7;
                    return 1;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 961, "rsa_verify_recover");
                v0 = sub_a50ac8(*(long long *)&a0->padding_18[8]);
                v1 = v7;
                v9 = "Should be %d, but got %d";
                v10 = 166;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/rsa_sig.c", 1003, "rsa_verify_recover");
            v9 = "Only X.931 or PKCS#1 v1.5 padding allowed";
            v10 = 168;
        }
        sub_a36abc(57, v10, v9);
        return 0;
    }
    else
    {
        *a2 = sub_aafbcc(a0->field_10);
        return 1;
    }
}
