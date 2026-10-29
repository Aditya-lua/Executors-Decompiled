/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50ac8..0xa50b14 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50ac8_0 {
    char padding_0[8];
    unsigned int field_8;
} st_a50ac8_0;


unsigned int sub_a50ac8(st_a50ac8_0 *a0)
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
        sub_a369bc("crypto/evp/evp_lib.c", 807, "EVP_MD_get_size");
        sub_a36abc(6, 159, 0);
        return 0xffffffff;
    }
    return a0->field_8;
}
