/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2b9a0..0xa2ba90 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2b9a0_0 {
    char padding_0[80];
    struct st_a2b9a0_0 *field_50;
} st_a2b9a0_0;


st_a2b9a0_0 * sub_a2b9a0(st_a2b9a0_0 **a0, st_a2b9a0_0 **a1, unsigned long long *a2)
{
    st_a2b9a0_0 *v2;  // x20
    st_a2b9a0_0 *v3;  // x0
    long long v4;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0[0x11] && a0[18])
    {
        v2 = sub_c67c9c();
        v3 = sub_c67c9c(a0[18]);
        if (v2 && v2->field_50)
        {
            if (v3)
            {
                *a1 = v2->field_50;
                *a2 = &v3->padding_0[0x11];
                return 1;
            }
            sub_a368c8();
            sub_a369bc("crypto/ec/ecx_meth.c", 741, "validate_ecx_derive");
            v4 = 133;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecx_meth.c", 737, "validate_ecx_derive");
            v4 = 123;
        }
    }
    else
    {
        sub_a368c8(a0[0x11]);
        sub_a369bc("crypto/ec/ecx_meth.c", 731, "validate_ecx_derive");
        v4 = 140;
    }
    sub_a36abc(16, v4, 0);
    return 0;
}
