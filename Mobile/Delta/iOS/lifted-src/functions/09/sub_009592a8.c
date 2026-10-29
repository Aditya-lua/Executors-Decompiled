/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9592a8..0x959338 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9592a8(unsigned long a0, long long a1)
{
    unsigned long long v4;  // x20
    unsigned long long v5;  // x0
    unsigned long long v6;  // x19
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    v4 = sub_afa378();
    v5 = sub_afa378(a1, &v0);
    v6 = 0xfffffffe;
    if (!(v4 >> 31 & 1) && !(v5 >> 31 & 1))
    {
        v6 = v4 - v5;
        if ((unsigned int)v4 == (unsigned int)v5)
            v6 = _memcmp(v1, v0, v4 & 0xffffffff);
    }
    sub_a6c2e4(v1, "ssl/ssl_cert.c", 731);
    sub_a6c2e4(v0, "ssl/ssl_cert.c", 732);
    return v6;
}
