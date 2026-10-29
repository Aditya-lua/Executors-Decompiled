/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa93248..0xa932c4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a93248(void* a0, unsigned long a1, unsigned long a2, unsigned long long a3)
{
    unsigned long v3;  // x9
    unsigned long long v4;  // x10
    unsigned long long v5;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v3 = *(char *)a0;
    v4 = v3 & 7;
    if (14 - v4 > a2)
        return 0xffffffff;
    if ((unsigned int)v4 >= 3)
    {
        *(char *)&a0[8] = a3 >> 56;
        *(char *)&a0[9] = a3 >> 48;
        *(char *)&a0[10] = a3 >> 40;
        *(char *)&a0[11] = a3 >> 32;
    }
    else
    {
        *(unsigned long long *)&a0[8] = 0;
    }
    v0 = &v2;
    v1 = v5;
    *(unsigned int *)&a0[12] = (((((a3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a3 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((a3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a3 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    *(char *)a0 = (char)v3 & 191;
    _memcpy(a0 + 1);
    return 0;
}
