/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb29ee8..0xb29f7c (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b29ee8_0 {
    unsigned long long field_0;
    char padding_8[8];
    struct st_b29ee8_0 *field_10;
    char padding_18[64];
    unsigned long long field_58;
} st_b29ee8_0;


st_b29ee8_0 * sub_b29ee8(st_b29ee8_0 *a0, st_b29ee8_0 *a1)
{
    st_b29ee8_0 *v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b29ee8_0 *)(unsigned int)sub_a2f9e0();
    if (!v2)
        return v2;
    if (a0 && a1 && a1->field_58 == a0->field_0 && sub_a2a930(a1))
    {
        sub_a2a8a4(a0->field_10);
        a0->field_10 = a1;
        return 1;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/exchange/ecx_exch.c", 121, "ecx_set_peer");
    sub_a36abc(57, 0xc0103, 0);
    return 0;
}
