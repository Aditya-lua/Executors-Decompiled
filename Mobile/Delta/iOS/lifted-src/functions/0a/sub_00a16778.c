/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa16778..0xa1683c (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a16778_0 {
    struct st_a16778_0 *field_0;
    char padding_8[16];
    struct st_a16778_0 *field_18;
} st_a16778_0;


st_a16778_0 * sub_a16778(st_a16778_0 *a0, unsigned long long *a1, unsigned long a2)
{
    st_a16778_0 *v2;  // x0
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && !(v2 = a0->field_0, !v2 || !v2->field_18))
    {
        if (sub_a19954())
        {
            *a1 = *a1 + a2;
            return v2;
        }
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_asn1.c", 1135, "o2i_ECPublicKey");
        v3 = 524304;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_asn1.c", 1129, "o2i_ECPublicKey");
        v3 = 786690;
    }
    sub_a36abc(16, v3, 0);
    return 0;
}
