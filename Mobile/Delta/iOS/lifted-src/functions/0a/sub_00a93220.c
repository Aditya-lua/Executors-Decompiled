/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa93220..0xa93248 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_a93220(void* a0, char a1, char a2, unsigned long a3, unsigned long a4)
{
    *(unsigned long long *)a0 = 0;
    *(unsigned long long *)&a0[8] = 0;
    *(char *)a0 = a1 * 4 + 56 & 56 & 248 | (a1 * 4 + 56 & 56 & 248 | a2 - 1 & 7) & 7;
    *(unsigned long long *)&a0[32] = 0;
    *(unsigned long *)&a0[40] = a4;
    *(unsigned long *)&a0[48] = a3;
    return a0;
}
