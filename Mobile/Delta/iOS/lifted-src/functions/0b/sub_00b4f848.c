/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4f848..0xb4f894 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b4f848(unsigned long a0, long long a1)
{
    long long v2;  // x0
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a58724(sub_9f2aec(a1), "CMAC", 0);
    if (!v2)
        return v2;
    v3 = sub_a58b28();
    sub_a58aa4(v2);
    return v3;
}
