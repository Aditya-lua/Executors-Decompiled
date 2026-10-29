/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa36e70..0xa36ed8 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_a36e70(void)
{
    char *v2;  // x0
    int v3;  // w10
    char **v4;  // x9
    unsigned long idx;  // x12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a35bc0();
    if (v2)
    {
        v3 = *(int *)&v2[896];
        if (*(int *)&v2[900] == *(int *)&v2[896])
            return 0;
        v4 = v2 + 64;
        while (1)
        {
            idx = v3;
            if (*(int *)((char *)v4 + 4 * v3))
                break;
            if (0 < (int)idx)
                v3 = (unsigned int)idx - 1;
            else
                v3 = 15;
            if (*(int *)&v2[900] == v3)
                return 0;
        }
        *(int *)((char *)v4 + 4 * idx) = *(int *)((char *)v4 + 4 * v3) - 1;
        v2 = 1;
    }
    return (unsigned int)v2;
}
