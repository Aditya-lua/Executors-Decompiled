/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a565c..0x9a5694 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9a565c(unsigned int *a0)
{
    unsigned long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = *a0;
        if ((unsigned int)v2)
        {
            if (!(v2 >> 7 & 1))
                return 0;
            a0 = sub_980dc8();
            if (a0)
                goto LABEL_9a5688;
        }
        else
        {
LABEL_9a5688:
            a0 = a0[43];
        }
    }
    return (unsigned int)a0;
}
