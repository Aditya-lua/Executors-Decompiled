/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3d980..0xb3d9f8 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b3d980(long long *a0, long long a1)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b3d4f0();
    if (!v2)
    {
        return v2;
    }
    else if (sub_afde7c(a0 + 4, a1, *a0))
    {
        return 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/keymgmt/mac_legacy_kmgmt.c", 444, "cmac_gen_set_params");
        sub_a36abc(57, 0x80106, 0);
        return 0;
    }
}
