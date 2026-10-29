/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c32d0..0x9c3580 (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c32d0(char a0, long long *a1, unsigned long long a2)
{
    char v7;  // x20
    long long *v8;  // x24
    char index;  // x0
    long long v18;  // x20
    char v19;  // x21
    char idx;  // x25
    char v21;  // x0
    char idx1;  // x0
    char v23;  // x0
    unsigned long long v9;  // x19
    unsigned long long v10;  // x0
    unsigned long long v11;  // x2
    long long *v12;  // x8
    unsigned long long v13;  // w10
    unsigned long v14;  // x11
    unsigned long long v15;  // w10
    long long v16;  // x1
    char v0;  // [bp-0x78]
    char v1;  // [bp-0x68]
    unsigned int v2;  // [bp-0x64]
    char v3;  // [bp-0x60]
    char v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (a1 && a2 + 0xffffffff80000000 >= 0xffffffff80000001 && !(v7 = *a1, !v7 || *(char *)(v7 + a2 - 1) < 0))
    {
        v8 = a1;
        v3 = v7;
        v1 = 0;
        v2 = a2;
        v9 = a2;
        v4 = 0;
        if (sub_a99eac(&v0))
        {
            v10 = sub_a99624();
            if (a0)
            {
                sub_9c3580(*(long long *)a0);
                *(unsigned long long *)a0 = v10;
            }
            *v8 = *v8 + v9;
            return v10;
        }
        if (*(char *)v7 == 128)
        {
LABEL_9c33c4:
            sub_a368c8();
            v16 = 282;
        }
        else
        {
            v11 = v9;
            v12 = v8;
            if (v9 != 1)
            {
                v13 = (unsigned int)v11 - 1;
                v14 = v7 + 1;
                do
                {
                    v15 = v13;
                    if (*(char *)v14 == 128 && *(char *)(v14 - 1) >= 0)
                        goto LABEL_9c33c4;
                } while ((v14 += 1, v13 = v15 - 1, v15 != 1));
            }
            if (!a0 || (index = *(long long *)a0, !index || !(*(char *)(index + 32) & 1)))
            {
                index = sub_a6bffc(40, "crypto/asn1/a_object.c", 337);
                if (!index)
                    return index;
                *(unsigned int *)(index + 32) = 1;
                v12 = v8;
                v11 = v9;
            }
            v18 = *v12;
            v19 = *(long long *)(index + 24);
            *(unsigned long long *)(index + 24) = 0;
            idx = index;
            if (!v19 || (int)v11 > *(int *)(index + 20))
            {
                *(unsigned int *)(index + 20) = 0;
                sub_a6c2e4(v19, "crypto/asn1/a_object.c", 301);
                v21 = sub_a6bf4c(v11, "crypto/asn1/a_object.c", 302);
                if (v21)
                {
                    v19 = v21;
                    *(unsigned int *)(idx + 32) = *(int *)(idx + 32) | 8;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/a_object.c", 327, "ossl_c2i_ASN1_OBJECT");
                    sub_a36abc(13, v9, 0);
                    v23 = idx;
                    if (a0 && *(long long *)a0 == v23)
                        return 0;
                    sub_9c3580(v23);
                    return 0;
                }
            }
            _memcpy(v19, v18);
            idx1 = idx;
            if ((char)(*(char *)(idx + 32)) >> 2 & 1)
            {
                sub_a6c2e4(*(long long *)idx1, "crypto/asn1/a_object.c", 310);
                sub_a6c2e4(*(long long *)(idx + 8), "crypto/asn1/a_object.c", 311);
                idx1 = idx;
                *(unsigned int *)(idx + 32) = *(int *)(idx + 32) & 0xfffffffb;
            }
            *(unsigned long long *)(idx1 + 24) = v19;
            *(unsigned int *)(idx1 + 20) = v9;
            *(unsigned long long *)idx1 = 0;
            *(unsigned long long *)(idx1 + 8) = 0;
            if (a0)
                *(unsigned long long *)a0 = idx1;
            *v8 = v18 + v9;
            return idx1;
        }
    }
    else
    {
        sub_a368c8();
        v16 = 252;
    }
    sub_a369bc("crypto/asn1/a_object.c", v16, "ossl_c2i_ASN1_OBJECT");
    sub_a36abc(13, 216, 0);
    return 0;
}
