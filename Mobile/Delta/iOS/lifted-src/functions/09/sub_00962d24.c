/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962d24..0x962d6c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_962d24(unsigned int *a0, unsigned long long a1)
{
    unsigned long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = *a0;
        if (!(unsigned int)v2)
        {
LABEL_962d58:
            *(unsigned long long *)&a0[1364] = a1;
            a0 = 1;
        }
        else if (!(v2 >> 7 & 1))
        {
            a0 = 0;
        }
        else
        {
            a0 = sub_980dc8();
            if (a0)
                goto LABEL_962d58;
        }
    }
    return (unsigned int)a0;
}
