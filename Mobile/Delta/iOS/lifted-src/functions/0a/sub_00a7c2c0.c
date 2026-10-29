/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7c2c0..0xa7c360 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a7c2c0(void)
{
    unsigned int *v4;  // x0
    char v0;  // [bp-0x20], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (_gettimeofday(&v0, 0) >> 31 & 1)
    {
        sub_a368c8();
        v4 = ___error(sub_a369bc("crypto/time.c", 39, "ossl_time_now"), 39, "ossl_time_now");
        sub_a36abc(2, *v4, "calling gettimeofday()");
        return 0;
    }
    else if (v0 > 0)
    {
        return 1000 * (v1 + 1000000 * v0);
    }
    else if (v1 < 1)
    {
        return 0;
    }
    else
    {
        return v1 * 1000;
    }
}
