/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaea194..0xaea1e8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aea194(unsigned long a0, long long *a1, unsigned long a2)
{
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a2;
    sub_aef608("Require Explicit Policy", *a1, &v0);
    sub_aef608("Inhibit Policy Mapping", a1[1], &v0);
    return v0;
}
