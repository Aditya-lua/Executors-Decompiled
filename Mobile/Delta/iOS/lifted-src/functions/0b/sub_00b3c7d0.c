/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3c7d0..0xb3c828 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b3c7d0(unsigned long a0, long long a1)
{
    unsigned int v2;  // w0
    unsigned int v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b3c894();
    if (!v2)
        return v2;
    if (!sub_a6fbc4(a1, "mandatory-digest"))
        return 1;
    v3 = sub_a71468();
    if (!v3)
        return v3;
    return 1;
}
