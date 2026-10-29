/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa36e0c..0xa36e70 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_a36e0c(void)
{
    char *v2;  // x0
    char *v3;  // w9
    char *v4;  // x0
    char *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a35bc0();
    if (!v2)
        return v2;
    v3 = (char *)*(int *)&v2[896];
    if (*(int *)&v2[900] == *(int *)&v2[896])
        return 0;
    v4 = 0;
    while (1)
    {
        v5 = v4;
        if (*(int *)(v2 + 0x4 * v3 + 64))
            return v5;
        v4 = (unsigned int)v5 + 1;
        if (0 < v3)
            v3 -= 1;
        else
            v3 = (char *)15;
        if (*(int *)&v2[900] == v3)
            return (unsigned int)v5 + 1;
    }
}
