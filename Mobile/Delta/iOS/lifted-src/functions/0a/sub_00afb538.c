/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafb538..0xafb6e0 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afb538_0 {
    struct st_afb538_0 *field_0;
    char padding_8[16];
    struct st_afb538_0 *field_18;
    struct st_afb538_0 *field_20;
    char field_28;
} st_afb538_0;

extern long long g_ebab00;

st_afb538_0 * sub_afb538(st_afb538_0 *a0, unsigned long long *a1, unsigned long a2, st_afb538_0 *a3, st_afb538_0 *a4, st_afb538_0 *a5)
{
    st_afb538_0 *v4;  // x0
    st_afb538_0 *v5;  // x0
    char v6;  // x8
    st_afb538_0 *v7;  // x0
    st_afb538_0 *v8;  // x22
    st_afb538_0 *v9;  // x0
    st_afb538_0 *v10;  // x21
    unsigned long v0;  // [bp-0x60]
    st_afb538_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = *a1;
    v1 = 0;
    if (a3 || a4 || !(v4 = 0, !a5))
    {
        v1 = sub_a6bffc(48, "crypto/x509/x_pubkey.c", 508);
        if (!v1)
            return 0;
        v1->field_18 = a3;
        sub_a6c2e4(v1->field_20, "crypto/x509/x_pubkey.c", 52);
        v1->field_20 = 0;
        if (a4 && !(v5 = sub_a6d9b4(a4, "crypto/x509/x_pubkey.c", 55), v1->field_20 = v5, v5))
            goto LABEL_afb658;
        v6 = v1->field_28 & 254;
        if (a5)
            v6 += 1;
        v1->field_28 = v6;
        v4 = &v1;
    }
    v7 = sub_9cae2c(v4, &v0);
    if (v7)
    {
        v8 = v7;
        v9 = sub_afb440();
        if (v9)
        {
            v10 = v9;
            if (sub_a5bba8())
            {
                sub_9cd960(v8, &g_ebab00);
                v1 = 0;
                *a1 = v0;
                if (a0)
                {
                    sub_a5a4c8(a0->field_0);
                    a0->field_0 = v10;
                    sub_9cd960(v1, &g_ebab00);
                    return v10;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/x_pubkey.c", 478, "X509_PUBKEY_get");
                sub_a36abc(11, 0xc0103, 0);
                goto LABEL_afb698;
            }
        }
        else
        {
LABEL_afb698:
            sub_9cd960(v8, &g_ebab00);
            v10 = 0;
            v1 = 0;
        }
    }
    else
    {
LABEL_afb658:
        v10 = 0;
    }
    sub_9cd960(v1, &g_ebab00);
    return v10;
}
