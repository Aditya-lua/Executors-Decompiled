/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc79750..0xc797f4 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c79750(long long a0, long long a1)
{
    unsigned long long *ptr;  // x0
    unsigned long long v6;  // x20
    char v0;  // [bp-0x50]
    unsigned long long *v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    sub_b72214(&v0, a0, a1);
    switch (v0)
    {
    case 0:
        return 1;
    case 9223372036854775808:
        _opendir(v1);
        ptr = v1;
        v6 = 0;
        *(char *)ptr = 0;
        if (!v2)
            return 0;
        break;
    default:
        ptr = v1;
        v6 = 1;
        break;
    }
    _free(ptr);
    return v6;
}
