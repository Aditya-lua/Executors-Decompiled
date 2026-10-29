/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab58ec..0xab5a18 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ab58ec(long long a0, unsigned short *a1, unsigned int a2, long long a3, unsigned long long a4)
{
    long long v2;  // x1
    unsigned long iter;  // x19
    unsigned long long v4;  // w23
    unsigned long long v5;  // w24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)a4 > (int)(a2 - 11))
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_pk1.c", 132, "ossl_rsa_padding_add_PKCS1_type_2_ex");
        v2 = 110;
        goto LABEL_ab59dc;
    }
    else
    {
        if (!(a4 >> 31 & 1))
        {
            *a1 = 0x200;
            iter = a1 + 1;
            v4 = (unsigned int)(a2 - a4) - 3;
            if ((int)sub_aa8658() >= 1)
            {
                if (v4 < 1)
                {
                    *(char *)iter = 0;
                    _memcpy(iter + 1, a3, a4 & 0xffffffff);
                    return 1;
                }
                v5 = 0;
                while (1)
                {
                    if (*(char *)iter)
                    {
                        iter += 1;
                        v5 += 1;
                        if (v5 != v4)
                            continue;
                    }
                    else if (1 > (int)sub_aa8658(a0, iter, 1, 0))
                    {
                        break;
                    }
                }
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_pk1.c", 135, "ossl_rsa_padding_add_PKCS1_type_2_ex");
            v2 = 181;
LABEL_ab59dc:
            sub_a36abc(4, v2, 0);
        }
        return 0;
    }
}
