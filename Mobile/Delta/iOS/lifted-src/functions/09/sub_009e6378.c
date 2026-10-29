/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e6378..0x9e6404 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9e6378(void* a0, unsigned long a1, unsigned long a2, void* a3)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 == a3)
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_mod.c", 194, "BN_mod_sub_quick");
        sub_a36abc(3, 0x80106, 0);
        return 0;
    }
    v2 = sub_9db58c();
    if (!v2)
    {
        return v2;
    }
    else if (!(int)a0[16])
    {
        return 1;
    }
}
