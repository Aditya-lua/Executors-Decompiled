/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a1520..0x9a157c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9a1520(long long *a0, long long *a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a6c2e4(*a1, "include/internal/packet.h", 483);
    v2 = sub_a6da14(*a0, a0[1], "include/internal/packet.h", 486);
    *a1 = v2;
    return v2 != 0;
}
