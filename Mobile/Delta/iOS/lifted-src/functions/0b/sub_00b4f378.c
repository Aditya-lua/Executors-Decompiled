/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4f378..0xb4f438 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b4f378(long long a0, long long a1, long long a2, long long a3)
{
    long long v2;  // x19
    long long v3;  // x20
    long long v4;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3f728();
    v3 = sub_a40ca8(a0, "SHAKE256", 0);
    v4 = 0;
    if (v2 && v3)
    {
        if (sub_a3fe04(v2, v3, 0) && sub_a3fe10(v2, a1, a2))
            v4 = sub_a400f8(v2, a3, 64) != 0;
        else
            v4 = 0;
    }
    sub_a3f73c(v2);
    sub_a3f52c(v3);
    return v4;
}
