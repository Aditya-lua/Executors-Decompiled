/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc50d54..0xc50de8 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_c50d54(void* a0)
{
    long long v0;  // x9
    unsigned long v1;  // x1

    v0 = *(long long *)a0;
    if (4 >= v0)
    {
        if (v0 == 2)
        {
            return 0x100 > (char)a0[8];
        }
        else if (v0 == 3)
        {
            return 0x100 > (short)a0[8];
        }
        else if (v0 == 4)
        {
            v1 = (int)a0[8];
        }
        else
        {
            return 0;
        }
    }
    else
    {
        if (v0 == 5)
        {
            return 0x100 > (unsigned long long)(long long)a0[8];
        }
        else if (v0 == 6)
        {
            v1 = (long long)a0[8];
            if ((long long)a0[8] < 0)
                return 0;
        }
        else if (v0 == 7)
        {
            return 0x100 > (unsigned long long)(long long)a0[8];
        }
        else
        {
            return 0;
        }
    }
    return 0x100 > v1;
}
