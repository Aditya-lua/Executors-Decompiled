/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa59ca4..0xa59d18 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a59ca4_0 {
    unsigned long long field_0;
    struct st_a59ca4_0 *field_8;
    char padding_10[80];
    struct st_a59ca4_0 *field_60;
    char padding_68[32];
    struct st_a59ca4_0 *field_88;
} st_a59ca4_0;


st_a59ca4_0 * sub_a59ca4(st_a59ca4_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (a0->field_8 && a0->field_8->field_60)
            a0->field_8->field_60();
        if ((int)a0->field_88 > 0)
            return (int)a0->field_88;
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/p_lib.c", 71, "EVP_PKEY_get_bits");
    sub_a36abc(6, 166, 0);
    return 0;
}
