/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb45370..0xb45400 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b45370(unsigned int *a0, long long a1, unsigned long long *a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        if (a0[3])
        {
            a0[2] = 1;
            sub_aa4e98(a0 + 4, a1);
            *a2 = 16;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/macs/poly1305_prov.c", 135, "poly1305_final");
        sub_a36abc(57, 114, 0);
    }
    return 0;
}
