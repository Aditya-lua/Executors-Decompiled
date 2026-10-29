/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3be28..0xb3bf08 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b3be28(long long a0, long long a1, long long a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = sub_a16d8c(sub_9d4f84());
    if (v2 && !sub_a6f90c(a1, a2, "point-format", v2))
        return 0;
    v3 = sub_a16c04(sub_a198e8(a0) & 0x6000);
    if (v3 && !sub_a6f90c(a1, a2, "group-check", v3))
        return 0;
    if (sub_a198c4(a0) >> 1 & 1 && !sub_a6f85c(a1, a2, "include-public", 0))
        return 0;
    sub_a198e8(a0);
    return (unsigned int)sub_a6f85c();
}
