/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4b778..0xb4b7d0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b4b778(long long a0)
{
    long long v0;  // [bp-0x38], Other Possible Types: unsigned int
    unsigned long long v1;  // [bp-0x30]
    unsigned long long t;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v0 = 0;
    v0 = _getpid();
    v1 = sub_a7c260(v0);
    t = _time(0);
    return sub_aa9aa0(a0, &v0, 24, 0);
}
