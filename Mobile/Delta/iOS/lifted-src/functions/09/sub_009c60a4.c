/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c60a4..0x9c60f4 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_9c60a4(void* a0, void* a1, void* a2, void* a3, void* a4, void* a5)
{
    if (!a5)
        return 0;
    if (a0)
        *(int *)a0 = *(int *)a5;
    if (a1)
        *(int *)a1 = (int)a5[4];
    if (a2)
        *(int *)a2 = (long long)a5[8];
    if (a3)
        *(long long *)a3 = (long long)a5[24];
    if (!a4)
        return 1;
    *(long long *)a4 = (long long)a5[16];
    return 1;
}
