/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae4a14..0xae4a74 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae4a14_0 {
    char padding_0[8];
    struct st_ae4a14_0 *field_8;
} st_ae4a14_0;


st_ae4a14_0 * sub_ae4a14(st_ae4a14_0 **a0)
{
    st_ae4a14_0 *v3;  // x8
    unsigned long long v4;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0[6])
    {
        v3 = a0[5];
        if (v3 && v3->field_8)
            goto *((void *)(v3->field_8));
    }
    v0 = &v2;
    v1 = v4;
    sub_a368c8(a0[6]);
    sub_a369bc("crypto/x509/v3_conf.c", 410, "X509V3_get_section");
    sub_a36abc(0x22, 148, 0);
    return 0;
}
