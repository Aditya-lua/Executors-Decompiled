/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaef870..0xaef8d8 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aef870(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v6;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_aef470();
    if (!v6)
    {
        v2 = ", value=";
        v3 = a0[2];
        v0 = "name=";
        v1 = a0[1];
        sub_a364a0(4);
        return 0;
    }
    *a1 = v6;
    return 1;
}
