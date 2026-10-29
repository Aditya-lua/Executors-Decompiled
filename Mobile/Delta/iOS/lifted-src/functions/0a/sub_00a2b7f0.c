/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2b7f0..0xa2b8d8 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a2b7f0(unsigned long a0, long long a1, unsigned long long a2)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a5ed4c(a1);
    v3 = sub_a2a7c8();
    if (v3)
    {
        v4 = v3;
        if (sub_a2a1c0() && sub_a5ab14(v2, a2, v4))
            return 1;
        sub_a2a8a4(v4);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecx_meth.c", 393, "ecx_generic_import_from");
        sub_a36abc(5, 0x80010, 0);
    }
    return 0;
}
