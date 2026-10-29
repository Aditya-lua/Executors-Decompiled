/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5db1c..0xa5dc18 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a5db1c(unsigned int *a0, unsigned long a1)
{
    unsigned long v0;  // x9
    unsigned long long v1;  // x3
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v4;  // x8

    v0 = *a0;
    if (!(unsigned int)v0)
        return 0;
    if ((!(v0 >> 11 & 1) || !*(long long *)&a0[12]) && !(v0 >> 11 & 1))
        goto LABEL_a5db8c;
    if (*(long long *)&a0[10] && !(v1 = *(long long *)(*(long long *)&a0[10] + 88), !*(long long *)(*(long long *)&a0[10] + 88)))
        goto LABEL_a5dbfc;
LABEL_a5db8c:
    if ((!((unsigned int)v0 & 49648) || (v2 = *(long long *)&a0[10], !v2 || (v1 = *(long long *)(v2 + 240), !*(long long *)(v2 + 240)))) && (!((unsigned int)v0 & 0x600) || (v3 = *(long long *)&a0[10], !v3 || (v1 = *(long long *)(v3 + 112), !*(long long *)(v3 + 112)))))
    {
        if ((unsigned int)v0 & 0x3000)
        {
            v4 = *(long long *)&a0[10];
            if (!v4)
                return 0;
            v1 = *(long long *)(v4 + 112);
            if (!*(long long *)(v4 + 112))
                return 0;
        }
        else
        {
            return 0;
        }
    }
LABEL_a5dbfc:
    goto *((void *)(v1));
}
