/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab915c..0xab93d0 (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ab915c(long long *a0, long long *a1, long long a2, long long a3, long long n)
{
    unsigned long long v2;  // x24
    long long v4;  // x25
    long long v5;  // x0
    long long v6;  // x26
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 <= 673)
    {
        if (116 >= a2)
        {
            if (63 >= a2)
            {
                switch (a2)
                {
                case 0:
                    sub_a368c8();
                    sub_a369bc("crypto/rsa/rsa_sign.c", 265, "encode_pkcs1");
                    sub_a36abc(4, 117, 0);
                    return 0;
                case 4:
                    v2 = 18;
                    break;
                default:
LABEL_ab939c:
                    sub_a368c8();
                    sub_a369bc("crypto/rsa/rsa_sign.c", 271, "encode_pkcs1");
                    sub_a36abc(4, 116, 0);
                    return 0;
                }
                goto LABEL_ab933c;
            }
            else
            {
                switch (a2)
                {
                case 64:
LABEL_ab9308:
                    v2 = 15;
                    break;
                case 95:
                    v2 = 14;
                    break;
                default:
LABEL_ab939c:
                    sub_a368c8();
                    sub_a369bc("crypto/rsa/rsa_sign.c", 271, "encode_pkcs1");
                    sub_a36abc(4, 116, 0);
                    return 0;
                }
                goto LABEL_ab933c;
            }
        }
        if (671 >= a2)
        {
            switch (a2)
            {
            case 117:
                goto LABEL_ab9308;
            case 257:
                v2 = 18;
                break;
            default:
LABEL_ab939c:
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_sign.c", 271, "encode_pkcs1");
                sub_a36abc(4, 116, 0);
                return 0;
            }
            goto LABEL_ab933c;
        }
        else
        {
            if (a2 != 672)
                if (a2 != 673)
                    goto LABEL_ab939c;
        }
    }
    else if (a2 > 1095)
    {
        if (a2 > 1097)
        {
            if (a2 != 1098 && a2 != 1099)
            {
                if (a2 != 1143)
                    goto LABEL_ab939c;
                v2 = 18;
                goto LABEL_ab933c;
            }
        }
        else
        {
            if (a2 != 1096)
                if (a2 != 1097)
                    goto LABEL_ab939c;
        }
    }
    else
    {
        if (1093 >= a2)
        {
            if (a2 != 674)
                if (a2 != 675)
                    goto LABEL_ab939c;
        }
        else
        {
            if (a2 != 1094)
                if (a2 != 1095)
                    goto LABEL_ab939c;
        }
    }
    v2 = 19;
LABEL_ab933c:
    v4 = v2 + n;
    v5 = sub_a6bf4c(v4, "crypto/rsa/rsa_sign.c", 275);
    if (!v5)
        return v5;
    v6 = v5;
    _memcpy();
    _memcpy(v6 + v2, a3, n);
    *a0 = v6;
    *a1 = v4;
    return 1;
}
