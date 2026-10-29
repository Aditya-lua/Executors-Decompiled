/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5dc18..0xa5dd14 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a5dc18(unsigned int *a0, unsigned long a1)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x3
    unsigned long long v2;  // x9
    unsigned long long v3;  // x9
    unsigned long long v4;  // x9

    v0 = *a0;
    if (!(unsigned int)v0)
        return 0;
    if ((!(v0 >> 11 & 1) || !*(long long *)&a0[12]) && !(v0 >> 11 & 1))
        goto LABEL_a5dc88;
    if (*(long long *)&a0[10] && !(v1 = *(long long *)(*(long long *)&a0[10] + 104), !*(long long *)(*(long long *)&a0[10] + 104)))
        goto LABEL_a5dcd4;
LABEL_a5dc88:
    if ((!((unsigned int)v0 & 49648) || (v2 = *(long long *)&a0[10], !v2 || (v1 = *(long long *)(v2 + 224), !*(long long *)(v2 + 224)))) && (!((unsigned int)v0 & 0x600) || (v3 = *(long long *)&a0[10], !v3 || (v1 = *(long long *)(v3 + 96), !*(long long *)(v3 + 96)))) && (!((unsigned int)v0 & 0x3000) || !(v4 = *(long long *)&a0[10], v4 && (v1 = *(long long *)(v4 + 96), *(long long *)(v4 + 96)))))
    {
        if (!((unsigned int)v0 & 6))
        {
            return 0;
        }
        else if (!*(long long *)&a0[8])
        {
            return 0;
        }
        else if (!*(long long *)(*(long long *)&a0[8] + 112))
        {
            return 0;
        }
    }
LABEL_a5dcd4:
    goto *((void *)(v1));
}
