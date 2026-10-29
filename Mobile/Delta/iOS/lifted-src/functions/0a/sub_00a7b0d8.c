/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7b0d8..0xa7b174 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;

unsigned long long sub_a7b0d8(char *a0)
{
    unsigned long v0;  // x8
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v4;  // x9

    v0 = *a0;
    v2 = v0 & 63;
    switch (1 << (((char)v0 * 0 | (char)(v0 >> 6)) & 31))
    {
    case 1:
        return v2;
    case 4:
        v3 = v2 * &_NSHomeDirectory | a0[1] * 0x10000 | a0[2] * 0x100;
        v4 = 3;
        break;
    case 2:
        v3 = v2 * 0x100;
        v4 = 1;
        break;
    default:
        v3 = v2 * 0x100000000000000 | a0[1] * 0x1000000000000 | a0[2] * 0x10000000000 | a0[3] * 0x100000000 | a0[4] * &_NSHomeDirectory | a0[5] * 0x10000 | a0[6] * 0x100;
        v4 = 7;
        break;
    }
    return v3 | a0[v4];
}
