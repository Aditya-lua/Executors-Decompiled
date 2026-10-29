/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1ea4..0xaf1f10 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af1ea4_0 {
    char padding_0[80];
    long long field_50;
} st_af1ea4_0;


st_af1ea4_0 * sub_af1ea4(st_af1ea4_0 *a0, unsigned long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a368c8();
    sub_a369bc("crypto/x509/x509_cmp.c", 397, "X509_check_private_key");
    sub_a36abc(11, 108, 0);
    return 0;
}
