/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6de70..0xa6df78 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6de70_0 {
    struct st_a6de70_0 *field_0;
} st_a6de70_0;


st_a6de70_0 ** sub_a6de70(unsigned long a0, st_a6de70_0 **a1, unsigned long a2)
{
    unsigned long long len;  // x0
    st_a6de70_0 **v4;  // x0
    st_a6de70_0 **v5;  // x23
    st_a6de70_0 **v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    len = _strlen();
    if (1 >= len)
    {
        sub_a368c8();
        sub_a369bc("crypto/o_str.c", 267, "ossl_hexstr2buf_sep");
        sub_a36abc(15, 121, 0);
    }
    else
    {
        v4 = sub_a6bf4c(len >> 1, "crypto/o_str.c", 271);
        if (!v4)
            return v4;
        if (a1)
        {
            *a1 = 0;
            v0 = 0;
            if (sub_a6dd38())
            {
                *a1 = v0;
                return v4;
            }
        }
        else
        {
            v0 = 0;
            if (sub_a6dd38())
                return v4;
        }
        sub_a6c2e4(v5, "crypto/o_str.c", 282);
    }
    return 0;
}
