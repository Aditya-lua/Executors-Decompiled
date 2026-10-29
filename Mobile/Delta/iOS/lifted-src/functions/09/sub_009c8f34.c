/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c8f34..0x9c9144 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c8f34_0 {
    struct st_9c8f34_0 *field_0;
    struct st_9c8f34_1 *field_8;
    struct st_9c8f34_0 *field_10;
} st_9c8f34_0;

typedef struct st_9c8f34_1 {
    char padding_0[64];
    struct st_9c8f34_0 *field_40;
    char padding_48[112];
    struct st_9c8f34_0 *field_b8;
    char padding_c0[120];
    struct st_9c8f34_0 *field_138;
} st_9c8f34_1;


st_9c8f34_0 * sub_9c8f34(long long a0, st_9c8f34_0 *a1, unsigned long long *a2, long long a3, unsigned long a4, unsigned long a5)
{
    st_9c8f34_0 *v3;  // x20
    st_9c8f34_0 **v4;  // x8
    long long v6;  // x1
    st_9c8f34_0 *v7;  // x0
    st_9c8f34_0 *v8;  // x23
    unsigned int v10;  // w0
    unsigned long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *a2;
    if (a1 && !(v3 = a1->field_0, !v3))
    {
        sub_a32e7c(v3->field_10);
        v3->field_10 = 0;
    }
    else
    {
        v3 = sub_a5ba1c();
        if (!v3)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/d2i_pr.c", 110, "ossl_d2i_PrivateKey_legacy");
            sub_a36abc(13, 0x80006, 0);
            return v3;
        }
    }
    if (!sub_a5a05c(v3, a0))
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/d2i_pr.c", 122, "ossl_d2i_PrivateKey_legacy");
        v6 = 163;
        goto LABEL_9c8ff8;
    }
    sub_a36c8c();
    v4 = v3->field_8;
    if (v4[23])
        v4[23]();
    if (v4[8] || v4[39])
    {
        v7 = sub_9ca7fc(0, &v0, a3);
        if (!v7)
        {
            sub_a36e70();
            goto LABEL_9c90c8;
        }
        v8 = sub_a51458();
        sub_9ca820(v7);
        if (v8)
        {
            sub_a36cd4(sub_a5a4c8(v3));
            v10 = sub_a5ac9c(a0);
            v3 = v8;
            if (v10 == sub_a5b018(v8))
            {
                *a2 = v0;
                if (!a1)
                    return v3;
                a1->field_0 = v3;
                return v3;
            }
LABEL_9c90c8:
            if (a1)
                goto LABEL_9c90cc;
        }
        else
        {
            sub_a36e70();
            if (a1)
                goto LABEL_9c90cc;
        }
    }
    else
    {
        sub_a368c8(sub_a36e70());
        sub_a369bc("crypto/asn1/d2i_pr.c", 150, "ossl_d2i_PrivateKey_legacy");
        v6 = 524301;
LABEL_9c8ff8:
        sub_a36abc(13, v6, 0);
        if (a1)
        {
LABEL_9c90cc:
            if (a1->field_0 == v3)
                return 0;
        }
    }
    sub_a5a4c8(v3);
    return 0;
}
