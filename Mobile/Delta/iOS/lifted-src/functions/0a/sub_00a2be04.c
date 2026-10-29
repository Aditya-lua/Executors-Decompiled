/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2be04..0xa2beb4 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_a2be04(unsigned long a0, long long a1, unsigned long a2, long long a3, long long a4)
{
    long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c67c9c(*(long long *)(sub_962b90() + 0x88));
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecx_meth.c", 889, "pkey_ecd_digestverify448");
        sub_a36abc(16, 116, 0);
    }
    else if (a2 == 114)
    {
        return sub_a084a0(*v2, a3, a4, a1, (char *)&v2[2] + 1, 0, 0, 0, v2[1]);
    }
    return 0;
}
