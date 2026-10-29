/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6926c..0x69308 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

long long sub_6926c(unsigned long a0, long long a1, long long a2)
{
    long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    long long v7;  // x0
    unsigned long long v8;  // x0
    char v0;  // [bp-0x42]
    char v1;  // [bp-0x41]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a0c8(a1);
    v5 = sub_a0c8(a1);
    v6 = sub_6b08(a1);
    v7 = sub_a0c8(a2);
    v8 = sub_a0c8(a2);
    return sub_691a4(v4, v5 + v6, v7, v8 + sub_6b08(a2), &v1, &v0, &v0);
}
