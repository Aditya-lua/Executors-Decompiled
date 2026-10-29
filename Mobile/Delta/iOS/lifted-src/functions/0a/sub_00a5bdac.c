/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5bdac..0xa5be20 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5bdac_0 {
    unsigned long long field_0;
    struct st_a5bdac_0 *field_8;
    char padding_10[72];
    struct st_a5bdac_0 *field_58;
    char padding_60[48];
    struct st_a5bdac_0 *field_90;
} st_a5bdac_0;


st_a5bdac_0 * sub_a5bdac(st_a5bdac_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (a0->field_8 && a0->field_8->field_58)
            a0->field_8->field_58();
        if ((int)a0->field_90 > 0)
            return (int)a0->field_90;
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/p_lib.c", 1877, "EVP_PKEY_get_size");
    sub_a36abc(6, 167, 0);
    return 0;
}
