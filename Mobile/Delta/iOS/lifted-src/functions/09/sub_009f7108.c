/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f7108..0x9f7178 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9f7108(unsigned long a0, long long a1)
{
    unsigned long long v4;  // 4117
    unsigned long long v5;  // x0
    unsigned int v0;  // [bp-0x38]
    long long v1;  // [bp-0x30]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    v0 = sub_9f6d90();
    v4 = arm64g_calculate_condition(1, v0, 1, 0);
    if (v4 & 1)
        return 0xffffffff;
    v5 = sub_9cf0e0(&v0, a1);
    sub_a6c2e4(v1, "crypto/ct/ct_oct.c", 399);
    return v5;
}
