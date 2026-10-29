/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d66cc..0x9d66f4 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9d66cc(unsigned long long a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0 >> 31 & 1)
        return 0;
    v0 = &v2;
    v1 = v3;
    return ~(unsigned int)_close() >> 31;
}
