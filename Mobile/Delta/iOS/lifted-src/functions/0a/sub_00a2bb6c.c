/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2bb6c..0xa2bc5c (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2bb6c_0 {
    char padding_0[80];
    long long field_50;
} st_a2bb6c_0;


st_a2bb6c_0 * sub_a2bb6c(unsigned long a0, st_a2bb6c_0 *a1, unsigned long long *a2, long long a3, long long a4)
{
    st_a2bb6c_0 *v3;  // x0
    st_a2bb6c_0 *v5;  // x0
    st_a2bb6c_0 *v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_c67c9c(*(long long *)(sub_962b90() + 0x88));
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecx_meth.c", 811, "pkey_ecd_digestsign25519");
        sub_a36abc(16, 116, 0);
        return 0;
    }
    if (a1)
    {
        if (63 >= *a2)
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecx_meth.c", 820, "pkey_ecd_digestsign25519");
            sub_a36abc(16, 100, 0);
            return 0;
        }
        v0 = (st_a2bb6c_0 *)0;
        v5 = sub_a0a75c(a1, a3, a4, &v3->padding_0[0x11], v3->field_50, 0, 0, 0, 0);
        if (!(unsigned int)v5)
            return v5;
    }
    *a2 = 64;
    return 1;
}
