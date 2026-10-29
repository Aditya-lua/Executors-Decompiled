/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafb1e4..0xafb440 (604 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afb1e4_0 {
    struct st_afb1e4_0 *field_0;
    struct st_afb1e4_0 *field_8;
    struct st_afb1e4_0 *field_10;
    char padding_18[16];
    struct st_afb1e4_0 *field_28;
    char padding_30[48];
    struct st_afb1e4_0 *field_60;
} st_afb1e4_0;

extern long long g_ebab00;

st_afb1e4_0 * sub_afb1e4(st_afb1e4_0 *a0, st_afb1e4_0 *a1)
{
    st_afb1e4_0 *v5;  // x0
    long long v6;  // x1
    long long v7;  // x0
    st_afb1e4_0 *v0;  // [bp-0x48]
    st_afb1e4_0 *v1;  // [bp-0x40]
    st_afb1e4_0 *v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a0 && a1)
    {
        if (a1->field_8)
        {
            v5 = sub_9cde20(&g_ebab00);
            if (!v5)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/x_pubkey.c", 337, "X509_PUBKEY_set");
                v6 = 524301;
                goto LABEL_afb410;
            }
            else if (a1->field_8->field_28)
            {
                a1->field_8->field_28();
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/x_pubkey.c", 346, "X509_PUBKEY_set");
                v6 = 124;
                goto LABEL_afb410;
            }
            goto LABEL_afb410;
        }
        else
        {
            if (a1->field_60)
            {
                v1 = 0;
                v2 = 0;
                v7 = sub_a30d3c(a1, 134, "DER", "SubjectPublicKeyInfo", 0);
                if (sub_a2f520(v7, &v2, &v1, "SubjectPublicKeyInfo", 0))
                {
                    v0 = v2;
                    v5 = sub_9cae2c(0, &v0, v1, &g_ebab00);
                }
                else
                {
                    v5 = 0;
                }
                sub_a3050c(v7);
                sub_a6c2e4(v2, "crypto/x509/x_pubkey.c", 363);
                if (!v5)
                    goto LABEL_afb3b0;
                sub_9cd960(a0->field_0, &g_ebab00);
                if (sub_a5bba8(a1))
                {
                    a0->field_0 = v5;
                    if (v5->field_10)
                        sub_a5a4c8(v5->field_10);
                    v5->field_10 = a1;
                    return 1;
                }
                sub_a368c8();
                sub_a369bc("crypto/x509/x_pubkey.c", 373, "X509_PUBKEY_set");
                v6 = 786691;
LABEL_afb410:
                sub_a36abc(11, v6, 0);
            }
            else
            {
LABEL_afb3b0:
                sub_a368c8();
                sub_a369bc("crypto/x509/x_pubkey.c", 367, "X509_PUBKEY_set");
                sub_a36abc(11, 111, 0);
                v5 = 0;
            }
            sub_9cd960(v5, &g_ebab00);
            return 0;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/x509/x_pubkey.c", 331, "X509_PUBKEY_set");
    sub_a36abc(11, 0xc0102, 0);
    return 0;
}
