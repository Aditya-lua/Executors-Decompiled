/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa14c64..0xa14d9c (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a14c64_0 {
    struct st_a14c64_0 *field_0;
} st_a14c64_0;


int sub_a14c64(long long *a0, st_a14c64_0 **a1, st_a14c64_0 **a2)
{
    st_a14c64_0 **v2;  // x0
    st_a14c64_0 **v3;  // x0
    long long v5;  // x1
    st_a14c64_0 **v6;  // x0
    st_a14c64_0 **v7;  // x22
    st_a14c64_0 **v8;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2 || (v2 = sub_9ffdd0(a2), !v2))
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_ameth.c", 35, "eckey_param2type");
        v5 = 124;
    }
    else if (sub_a1abe0() && sub_a1abcc(v2))
    {
        v3 = sub_a99624();
        if (v3 && sub_a9a7f0())
        {
            *a1 = v3;
            *(unsigned int *)a0 = 6;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_ameth.c", 45, "eckey_param2type");
        v5 = 167;
    }
    else
    {
        v6 = sub_9c7910();
        if (!v6)
            return (unsigned int)v6;
        v7 = v6;
        v8 = (st_a14c64_0 **)(unsigned int)sub_a165e8(a2, v6 + 1);
        *(unsigned int *)v7 = (unsigned int)v8;
        if (v8 > 0)
        {
            *a1 = v7;
            *(unsigned int *)a0 = 16;
            return 1;
        }
        sub_a368c8(sub_9c7940(v7));
        sub_a369bc("crypto/ec/ec_ameth.c", 59, "eckey_param2type");
        v5 = 524304;
    }
    sub_a36abc(16, v5, 0);
    return 0;
}
