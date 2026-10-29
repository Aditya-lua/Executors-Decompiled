/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb718c0..0xb7196c (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b718c0(long long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (_posix_memalign())
    {
        return 0;
    }
    else if (v0)
    {
        _memcpy();
        _free(a0);
        return v0;
    }
    else
    {
        return 0;
    }
}
