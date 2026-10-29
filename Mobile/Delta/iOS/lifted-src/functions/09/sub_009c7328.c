/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c7328..0x9c755c (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_9c7328(char **a0, unsigned long a1, unsigned int *a2, unsigned int *a3, long long a4)
{
    char *v2;  // x8
    unsigned int v3;  // w9
    unsigned long v12;  // x12
    unsigned long long v13;  // x9
    char *v14;  // x20
    unsigned long long v15;  // w21
    unsigned long long v16;  // x11
    unsigned long long v18;  // x10
    char *v19;  // x12
    unsigned long long v20;  // x13
    unsigned long long i;  // w14
    unsigned int v4;  // w12
    unsigned long long v22;  // x15
    unsigned long long v5;  // x13
    char *v6;  // x10
    unsigned long long v7;  // x11
    unsigned long v8;  // x15
    unsigned long long v9;  // x14
    unsigned long long v10;  // x13
    unsigned long long v11;  // w19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a4 <= 0)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/asn1_lib.c", 56, "ASN1_get_object");
        sub_a36abc(13, 224, 0);
        return 128;
    }
    v2 = *a0;
    v3 = *v2;
    v4 = v3 & 31;
    if (v4 != 31)
    {
        v7 = a4 - 1;
        if (a4 != 1)
        {
            v6 = v2 + 1;
            goto LABEL_9c73dc;
        }
    }
    else if (a4 != 1)
    {
        v5 = 0;
        v6 = v2 + 2;
        v7 = a4 - 2;
        while (1)
        {
            v8 = *(v6 - 1);
            v9 = v8 & 0xff;
            v10 = v5 * 128;
            if (!(v8 >> 31 & 1))
                break;
            if (!v7 || !(v5 = v10 | v9 & 127, v6 += 1, v7 -= 1, (long long)v5 <= 0xffffff))
                goto LABEL_9c74c8;
        }
        if (v7)
        {
            v4 = (unsigned int)v10 | (unsigned int)v9;
LABEL_9c73dc:
            v11 = v3 & 32;
            *a2 = v4;
            *a3 = v3 & 192;
            v12 = *v6;
            if ((unsigned int)v12 == 128)
            {
                *(unsigned long long *)a1 = 0;
                if (v11)
                {
                    v13 = 0;
                    v14 = v6 + 1;
                    v15 = 1;
                    goto LABEL_9c7424;
                }
            }
            else
            {
                v13 = v12 & 127;
                v14 = v6 + 1;
                if (!(v12 >> 7 & 1))
                {
LABEL_9c741c:
                    v15 = 0;
                    *(unsigned long long *)a1 = v13;
LABEL_9c7424:
                    if ((long long)v13 > &v2[a4] - v14)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/asn1/asn1_lib.c", 95, "ASN1_get_object");
                        sub_a36abc(13, 155, 0);
                        v11 |= 128;
                    }
                    *a0 = v14;
                    return v11 | v15;
                }
                else if ((long long)v7 > (long long)v13)
                {
                    if (!(unsigned int)v13)
                    {
                        v13 = 0;
                        goto LABEL_9c741c;
                    }
                    v16 = 0;
                    while (!v14[v16])
                    {
                        if ((unsigned int)v13 == (unsigned int)v16 + 1)
                        {
                            v14 = &v6[1 + v13];
                            v13 = 0;
                            goto LABEL_9c741c;
                        }
                    }
                    v18 = v13 - v16;
                    if ((unsigned int)v18 <= 8)
                    {
                        v19 = &v14[v16];
                        if ((unsigned int)v13 == (unsigned int)v16)
                        {
                            v13 = 0;
                            v14 = v19;
                            goto LABEL_9c741c;
                        }
                        else
                        {
                            v20 = 0;
                            v13 = 0;
                            i = (unsigned int)v18 + 1;
                            do
                            {
                                v22 = v13;
                                v13 = v14[v16 + v20] | (v22 * 0x100 | v22 >> 56) & 0xffffffffffffff00;
                                i -= 1;
                                v20 += 1;
                            } while (1 < i);
                            if ((long long)(v22 * 0x100) < 0)
                                goto LABEL_9c74c8;
                            v14 = &v19[v18];
                            goto LABEL_9c741c;
                        }
                    }
                }
            }
        }
    }
LABEL_9c74c8:
    sub_a368c8();
    sub_a369bc("crypto/asn1/asn1_lib.c", 105, "ASN1_get_object");
    sub_a36abc(13, 123, 0);
    return 128;
}
