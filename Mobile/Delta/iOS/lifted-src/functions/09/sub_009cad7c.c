/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cad7c..0x9cae2c (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cad7c_0 {
    struct st_9cad7c_0 *field_0;
} st_9cad7c_0;


st_9cad7c_0 ** sub_9cad7c(st_9cad7c_0 **a0, unsigned long a1, unsigned long a2, st_9cad7c_0 **a3, unsigned long long a4, unsigned long long a5)
{
    st_9cad7c_0 **v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    st_9cad7c_0 **v3;  // [bp-0x48]
    st_9cad7c_0 **v4;  // [bp-0x40]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v3 = 0;
    if (!a0)
        a0 = &v3;
    v4 = (st_9cad7c_0 **)0;
    if (a3)
    {
        v1 = a4;
        v2 = a5;
        v0 = (st_9cad7c_0 **)0;
        if ((int)sub_9cae38(a0) > 0)
            return *a0;
        sub_9cdc2c(a0, a3);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/tasn_dec.c", 140, "asn1_item_ex_d2i_intern");
        sub_a36abc(13, 0xc0102, 0);
    }
    return 0;
}
