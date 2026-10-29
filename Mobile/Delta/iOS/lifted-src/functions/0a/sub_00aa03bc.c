/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa03bc..0xaa0404 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aa03bc(long long a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_af13cc();
    if (v2 >> 31 & 1)
        return 0;
    sub_af1458(a0, v2);
}
