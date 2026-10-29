/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa0308..0xaa035c (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa0308_0 {
    char padding_0[16];
    struct st_aa0308_0 *field_10;
    char padding_18[24];
    struct st_aa0308_0 *field_30;
} st_aa0308_0;


void sub_aa0308(st_aa0308_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    if (a0 && a0->field_10)
    {
        v0 = &v1;
        sub_a6c2e4(a0->field_10->field_30, "crypto/pkcs12/p12_asn.c", 35);
        a0->field_10->field_30 = 0;
    }
}
