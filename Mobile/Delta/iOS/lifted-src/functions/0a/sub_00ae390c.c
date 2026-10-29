/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae390c..0xae3974 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ae390c(unsigned long a0, long long *a1, long long a2, long long a3)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ae39cc(a2, *a1, a3, "Autonomous System Numbers");
    if (!(unsigned int)v2)
        return v2;
    return sub_ae39cc(a2, a1[1], a3, "Routing Domain Identifiers") != 0;
}
