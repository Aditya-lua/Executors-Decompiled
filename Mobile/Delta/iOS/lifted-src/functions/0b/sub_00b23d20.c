/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb23d20..0xb23dbc (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b23d20_0 {
    char padding_0[88];
    unsigned long long field_58;
} st_b23d20_0;


unsigned long long sub_b23d20(st_b23d20_0 *a0)
{
    unsigned long long v5;  // x0
    long long v6;  // x1
    unsigned int v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a0 && *(long long *)&a0->padding_0[80])
    {
        v0 = a0->field_58;
        v1 = *(long long *)&a0->padding_0[80];
        v2 = 0;
        v5 = sub_9cf0e0(&v0);
        if (!(v5 >> 31 & 1))
            return v5;
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 818, "ecx_pki_priv_to_der");
        v6 = 524301;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 808, "ecx_pki_priv_to_der");
        v6 = 786690;
    }
    sub_a36abc(57, v6, 0);
    return 0;
}
