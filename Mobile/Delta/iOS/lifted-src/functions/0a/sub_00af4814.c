/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf4814..0xaf486c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af4814_0 {
    char padding_0[256];
    struct st_af4814_0 *field_100;
} st_af4814_0;


unsigned int sub_af4814(st_af4814_0 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_vfy.c", 287, "X509_verify_cert");
        sub_a36abc(11, 0xc0102, 0);
        return 0xffffffff;
    }
}
