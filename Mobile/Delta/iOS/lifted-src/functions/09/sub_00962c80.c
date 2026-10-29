/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962c80..0x962d24 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_962c80(unsigned int *a0, unsigned int a1, unsigned int a2)
{
    unsigned int idx;  // x0
    unsigned long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!idx)
        return (unsigned int)a0;
    v3 = *a0;
    idx = (unsigned int)a0;
    if (!(unsigned int)v3)
    {
LABEL_962cd0:
        if (a1 == 1)
        {
            a1 = 0;
LABEL_962ce8:
            *(unsigned long long *)(idx + 3320) = a1;
            if (a2 == 1)
            {
                *(unsigned long long *)(idx + 0xd00) = 0;
                return 1;
            }
            if (0x4000 >= a2)
            {
                *(unsigned long long *)(idx + 0xd00) = a2;
                return 1;
            }
        }
        else
        {
            if (0x4000 >= a1)
                goto LABEL_962ce8;
        }
    }
    else if (v3 >> 7 & 1)
    {
        idx = sub_980dc8();
        if (!idx)
            return idx;
        if ((a2 | a1) < 2 || !(*a0 >> 7 & 1))
            goto LABEL_962cd0;
    }
    return 0;
}
