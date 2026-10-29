/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3da974..0x3da9d4 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e7f460;
extern unsigned long long g_e7f490;

unsigned long long sub_3da974(unsigned long a0, unsigned long long a1, char a2, unsigned long long a3)
{
    unsigned long long v0;  // x0

    if (!a1)
        return 0xffffffffffffffff;
    if (a1 > a3)
        a1 = a3 + 1;
    while (1)
    {
        v0 = a1;
        if (v0)
        {
            a1 = v0 - 1;
            if (*(char *)(a0 - 1 + v0) == a2)
                goto *((void *)(g_e7f460));
        }
        else
        {
            goto *((void *)(g_e7f490));
        }
    }
}
