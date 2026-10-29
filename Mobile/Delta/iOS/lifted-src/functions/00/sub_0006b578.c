/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6b578..0x6b6d0 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_6b578(long long a0, long long a1, long long a2, long long a3)
{
    unsigned long long v5;  // x0
    void* v6;  // x8
    uint128_t v0;  // [bp-0x60]
    long long v1;  // [bp-0x50]
    char *v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    *(char ***)&v0 = &v2;
    v2 = &v0;
    v5 = sub_6ac74();
    if ((unsigned int)v5 != 1)
    {
        *(unsigned short *)v6 = 0;
        *(unsigned long long *)&v6[8] = 0;
        *(unsigned long long *)&v6[16] = 0;
        return v5;
    }
    std::__1::mutex::lock(a0 + 1208);
    *(unsigned short *)v6 = 0;
    *(unsigned long long *)&v6[8] = 0;
    *(unsigned long long *)&v6[16] = 0;
    if (!a2)
    {
        sub_736ac(a0, a1, a3);
    }
    else if (a2 == 1)
    {
        sub_726d8(a0, a1, a3);
    }
    else if (a2 == 2)
    {
        sub_73134(a0, a1);
    }
    else
    {
        sub_6ae44((long long)v6[16], 0);
        return std::__1::mutex::unlock(a0 + 1208);
    }
    *(uint128_t *)v6 = v0;
    *(long long *)&v6[16] = v1;
    sub_6ae44((long long)v6[16], 0);
    return std::__1::mutex::unlock(a0 + 1208);
}
