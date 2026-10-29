/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb45448..0xb454dc (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b45448_0 {
    char padding_0[16];
    struct st_b45448_0 *field_10;
    unsigned long long field_18;
} st_b45448_0;


st_b45448_0 * sub_b45448(long long a0, long long a1)
{
    st_b45448_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "key");
    if (v2)
    {
        if (v2->field_10 && v2->field_18 == 32)
        {
            sub_aa4d60(a0 + 16);
            *(double *)(a0 + 8) = 2.121995791e-314;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/macs/poly1305_prov.c", 86, "poly1305_setkey");
            sub_a36abc(57, 105, 0);
            return 0;
        }
    }
    return 1;
}
