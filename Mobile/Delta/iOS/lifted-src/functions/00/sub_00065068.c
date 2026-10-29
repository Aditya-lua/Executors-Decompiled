/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x65068..0x650d4 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_65068(void* a0)
{
    unsigned long v0;  // x9
    unsigned long long v1;  // x8
    unsigned long v2;  // x8
    unsigned long long v3;  // x9

    if ((char)((char)a0[396]) >> 4 & 1)
        return a0;
    memset(a0 + 16, 0, 24);
    if ((unsigned long long)(long long)a0[96] < 9)
    {
        memset(a0 + 40, 0, 24);
    }
    else if ((char)a0[402] == 1)
    {
        v0 = (long long)a0[64];
        v1 = v0 + (long long)a0[96];
        *(unsigned long *)&a0[40] = v0;
        *(unsigned long *)&a0[48] = v0;
        *(unsigned long long *)&a0[56] = v1 - 1;
    }
    else
    {
        v2 = (long long)a0[104];
        v3 = v2 + (long long)a0[112] - 1;
        *(unsigned long *)&a0[40] = v2;
        *(unsigned long *)&a0[48] = v2;
        *(unsigned long long *)&a0[56] = v3;
    }
    *(unsigned int *)&a0[396] = 16;
    return a0;
}
