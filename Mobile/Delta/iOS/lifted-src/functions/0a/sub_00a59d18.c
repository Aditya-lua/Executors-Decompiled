/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa59d18..0xa59d8c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a59d18_0 {
    unsigned long long field_0;
    struct st_a59d18_0 *field_8;
    char padding_10[88];
    struct st_a59d18_0 *field_68;
    char padding_70[28];
    struct st_a59d18_0 *field_8c;
} st_a59d18_0;


st_a59d18_0 * sub_a59d18(st_a59d18_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (a0->field_8 && a0->field_8->field_68)
            a0->field_8->field_68();
        if (*(int *)&(a0->padding_70)[1] > 0)
            return *(int *)&(a0->padding_70)[1];
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/p_lib.c", 87, "EVP_PKEY_get_security_bits");
    sub_a36abc(6, 168, 0);
    return 0;
}
