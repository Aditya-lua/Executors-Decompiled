/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962a34..0x962a88 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_962a34(unsigned int *a0)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if ((unsigned int)v2)
    {
        if (!(v2 >> 7 & 1))
        {
            v3 = 0;
        }
        else
        {
            v3 = sub_980dc8();
            v2 = *a0;
        }
        if (((unsigned int)v2 & 0xfffffffe) == 128)
        {
            v3 = 1;
        }
        else
        {
            a0 = v3;
            if (a0)
                goto LABEL_962a78;
        }
    }
    else
    {
LABEL_962a78:
        v3 = a0[629];
    }
    return v3;
}
