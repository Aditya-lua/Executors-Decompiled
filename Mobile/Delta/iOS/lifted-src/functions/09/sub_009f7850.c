/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f7850..0x9f78ac (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9f7850(void* a0)
{
    unsigned long long v0;  // 4118
    unsigned long v1;  // x8

    v0 = arm64g_calculate_condition(1, *(int *)a0, 1, 0);
    if (v0 & 1)
        return 0;
    if (*(int *)a0)
    {
        v1 = (long long)a0[8];
    }
    else if (!(long long)a0[24])
    {
        return 0;
    }
    else if ((char)a0[64] != 4)
    {
        return 0;
    }
    else if (((char)a0[65] & 253) != 1)
    {
        return 0;
    }
    else if ((long long)a0[72])
    {
        v1 = (long long)a0[80];
    }
    else
    {
        return 0;
    }
    return v1 != 0;
}
