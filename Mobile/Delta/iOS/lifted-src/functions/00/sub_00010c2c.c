/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10c2c..0x10ce8 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_10c2c(long long a0, unsigned long long a1)
{
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    char v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a1)
    {
        sub_b814(a0 + 128);
        v0 = a1;
        v1 = sub_a0c8(&v2);
        sub_1db64(a0, a0 + 132, "Expected identifier when parsing %s, got %s");
    }
    else
    {
        sub_b814(a0 + 128);
        v0 = sub_a0c8(&v2);
        sub_1db64(a0, a0 + 132, "Expected identifier, got %s");
    }
    return &v2;
}
