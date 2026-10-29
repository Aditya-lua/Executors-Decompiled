/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaef470..0xaef608 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aef470(unsigned long a0, char *a1)
{
    char *v3;  // x19
    char *v4;  // x8
    unsigned int v5;  // w20
    unsigned long long v6;  // w0
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long idx;  // x0
    long long v10;  // x1
    unsigned long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_utl.c", 0xcc, "s2i_ASN1_INTEGER");
        v10 = 109;
        goto LABEL_aef570;
    }
    v3 = a1;
    v0 = sub_9e4958();
    if (v0)
    {
        v4 = v3;
        v5 = *v4;
        if (v5 == 45)
            v3 = v4 + 1;
        if (*v3 == 48 && (v3[1] | 32) == 120)
        {
            v3 += 2;
            v6 = (unsigned int)sub_9dd9cc(&v0, v3);
            if (v6)
                goto LABEL_aef510;
LABEL_aef518:
            sub_a368c8(sub_9e48d4(v0));
            sub_a369bc("crypto/x509/v3_utl.c", 233, "s2i_ASN1_INTEGER");
            v10 = 100;
            goto LABEL_aef570;
        }
        v6 = (unsigned int)sub_9ddb90(&v0, v3);
        if (!v6)
            goto LABEL_aef518;
LABEL_aef510:
        if (v3[v6])
            goto LABEL_aef518;
        if (v5 == 45)
            v7 = sub_9e4828(v0) != 0;
        else
            v7 = 1;
        v8 = sub_9c1acc(v0, 0);
        sub_9e48d4(v0);
        if (v8)
        {
            idx = v8;
            if (!(v7 & 1))
                *(unsigned int *)(idx + 4) = *(int *)(idx + 4) | 0x100;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_utl.c", 243, "s2i_ASN1_INTEGER");
            v10 = 101;
LABEL_aef570:
            sub_a36abc(0x22, v10, 0);
            idx = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_utl.c", 209, "s2i_ASN1_INTEGER");
        v10 = 524291;
        goto LABEL_aef570;
    }
    return idx;
}
