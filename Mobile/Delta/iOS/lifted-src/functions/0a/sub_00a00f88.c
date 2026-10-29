/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa00f88..0xa0100c (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a00f88_0 {
    char padding_0[192];
    unsigned long long field_c0;
} st_a00f88_0;


st_a00f88_0 * sub_a00f88(long long a0, unsigned long a1, unsigned long a2)
{
    st_a00f88_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a013f0(0);
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/dsa/dsa_ameth.c", 361, "old_dsa_priv_decode");
        sub_a36abc(10, 0x8000a, 0);
        return 0;
    }
    v2->field_c0 = v2->field_c0 + 1;
    sub_a5ab14(a0, 116, v2);
    return 1;
}
