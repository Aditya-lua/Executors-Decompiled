/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1449b4..0x144aa8 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e6f328;
extern unsigned long long g_e6f3a0;

unsigned int sub_1449b4(unsigned long a0)
{
    unsigned int v0;  // x9
    unsigned int v1;  // x11
    unsigned long long v2;  // x10
    unsigned int v3;  // w13
    unsigned long long v5;  // 4112

    if (!a0)
        return 0;
    v0 = a0 + 8520;
    v1 = a0 + 14424;
    v2 = 0xffffffffffffffd5;
    while (1)
    {
        if (*(long long *)(v0 - 16) || *(long long *)(v0 - 8) || *(long long *)v0 || *(int *)(v0 - 52))
        {
            v3 = 1;
            if (*(long long *)v1 != 3960360)
                goto LABEL_144a6c;
        }
        else if (*(int *)(v0 - 36))
        {
            v3 = 1;
            if (*(long long *)v1 != 3960360)
                goto LABEL_144a6c;
        }
        else
        {
            v3 = *(int *)(v0 - 20) != 0;
            if (*(long long *)v1 != 3960360)
                goto LABEL_144a6c;
        }
        if (!*(long long *)(v1 + 0x400) && !*(long long *)(v1 + 0x800) && !*(long long *)(v1 + 4128) && !(v3 & 1))
            goto *((void *)(g_e6f3a0));
LABEL_144a6c:
        v0 += 72;
        v1 += 8;
        v5 = arm64g_calculate_condition(50, v2, 1, 0);
        v2 += 1;
        if (!(v5 & 1))
            goto *((void *)(g_e6f328));
    }
}
