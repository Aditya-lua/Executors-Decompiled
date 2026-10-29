/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafb440..0xafb4c0 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afb440_0 {
    char padding_0[16];
    struct st_afb440_0 *field_10;
} st_afb440_0;


st_afb440_0 * sub_afb440(st_afb440_0 *a0)
{
    long long v2;  // x0
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (a0->field_10)
            return a0->field_10;
        sub_a368c8(0);
        sub_a369bc("crypto/x509/x_pubkey.c", 466, "X509_PUBKEY_get0");
        v2 = 6;
        v3 = 114;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x_pubkey.c", 460, "X509_PUBKEY_get0");
        v2 = 11;
        v3 = 786690;
    }
    sub_a36abc(v2, v3, 0);
    return 0;
}
