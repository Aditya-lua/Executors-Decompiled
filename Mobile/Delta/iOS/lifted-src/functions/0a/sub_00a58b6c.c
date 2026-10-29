/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa58b6c..0xa58bc4 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_a58b6c(unsigned int *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if (sub_a9908c(sub_a9976c(*a0), 2, a0))
    {
        sub_a99788(*a0);
        return (unsigned int)sub_a9908c();
    }
    else
    {
        return 0;
    }
}
