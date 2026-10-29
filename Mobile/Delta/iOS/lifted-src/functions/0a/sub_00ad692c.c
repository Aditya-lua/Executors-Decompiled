/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad692c..0xad6958 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_ad692c(char *a0)
{
    char *v0;  // w9
    unsigned long v1;  // x8

    if (!a0)
    {
        return 0;
    }
    else if (*(int *)a0)
    {
        v0 = (char *)(*(int *)a0 - 1);
        v1 = *(long long *)(*(long long *)&a0[8] + (long long)v0 * 8);
        *(unsigned int *)a0 = (unsigned int)v0;
        return v1;
    }
    else
    {
        return 0;
    }
}
