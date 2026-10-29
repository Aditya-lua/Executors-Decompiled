/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf2470..0xaf252c (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_af2470(long long a0, long long a1, long long a2)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_af2b00(a0, sub_adca0c());
    if (!v2)
        return v2;
    v3 = sub_af2b00(a0, sub_adc09c(sub_af2770(), 1, 0, 3, 0, a1, a2));
    if (!v3)
        return v3;
    v4 = sub_af2b00(a0, sub_add204(sub_af27a0(), 2, 0, 3, 0));
    if (!v4)
        return v4;
    sub_a35af4(sub_af2770(), 3, 0, 0, 0, a1, a2);
    return 1;
}
