/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab5744..0xab58ec (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ab5744(unsigned long a0, unsigned int a1, void* a2, unsigned int a3, unsigned int a4)
{
    long long v2;  // x1
    unsigned int v3;  // w9
    unsigned long v4;  // x8
    unsigned long long v5;  // x19
    unsigned long long v7;  // 4127
    unsigned long long v8;  // 4112
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)a4 < 11)
        return 0xffffffff;
    if (a4 == a3)
    {
        if (*(char *)a2)
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_pk1.c", 78, "RSA_padding_check_PKCS1_type_1");
            v2 = 138;
            goto LABEL_ab5804;
        }
        else
        {
            a2 += 1;
            a3 = a4 - 1;
        }
    }
    if (a3 + 1 == a4 && *(char *)a2 == 1)
    {
        v3 = 0;
        v4 = a2 + 2;
        v5 = a3 - 2;
        while (1)
        {
            switch (*(char *)(v4 - 1))
            {
            case 255:
                v3 += 1;
                v4 += 1;
                v5 = (unsigned int)v5 - 1;
                v7 = arm64g_calculate_condition(0x11, v5 & 0xffffffff, 1, 0);
                if (!(v7 & 1))
                    goto LABEL_ab585c;
                continue;
            case 0:
                v8 = arm64g_calculate_condition(1, v5 & 0xffffffff, 1, 0);
                if (!(v8 & 1))
                {
                    if (7 >= v3)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/rsa/rsa_pk1.c", 110, "RSA_padding_check_PKCS1_type_1");
                        v2 = 103;
                        break;
                    }
                    else if ((int)v5 > (int)a1)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/rsa/rsa_pk1.c", 116, "RSA_padding_check_PKCS1_type_1");
                        v2 = 109;
                        break;
                    }
                    else
                    {
                        _memcpy();
                        return v5;
                    }
                }
LABEL_ab585c:
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_pk1.c", 105, "RSA_padding_check_PKCS1_type_1");
                v2 = 113;
                break;
            default:
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_pk1.c", 97, "RSA_padding_check_PKCS1_type_1");
                v2 = 0x66;
                break;
            }
            break;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_pk1.c", 0x55, "RSA_padding_check_PKCS1_type_1");
        v2 = 106;
    }
LABEL_ab5804:
    sub_a36abc(4, v2, 0);
    return 0xffffffff;
}
