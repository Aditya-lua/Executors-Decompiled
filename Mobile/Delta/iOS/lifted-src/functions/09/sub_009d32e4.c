/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d32e4..0x9d33ac (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9d32e4(void* a0, unsigned int a1, unsigned long a2)
{
    void* v0;  // x8
    unsigned long v1;  // x0
    unsigned long v2;  // x9

    v0 = (long long)a0[64];
    if (10 >= (int)a1)
    {
        if (2 >= (int)a1)
        {
            if (a1 == 1)
                goto LABEL_9d3378;
            if (a1 != 2)
            {
                return 0;
            }
            else if (0 < (int)v0[16])
            {
                return 0;
            }
            else if (!(long long)a0[72])
            {
                return 1;
            }
        }
        else
        {
            switch (a1)
            {
            case 3:
                break;
            case 10:
                v1 = (int)v0[16];
                if ((unsigned int)v1)
                {
                    return v1;
                }
                else if (!(long long)a0[72])
                {
                    return (long long)a0[72];
                }
            default:
                return 0;
            }
            goto LABEL_9d3370;
        }
    }
    else
    {
        if (a1 - 11 >= 2)
        {
            switch (a1)
            {
            case 128:
LABEL_9d3378:
                if ((long long)a2 < 0)
                    return 0;
                v2 = (int)v0[16] + (int)v0[20];
                if ((long long)v2 < (long long)a2)
                    return 0;
                *(unsigned int *)&v0[16] = v2 - a2;
                *(unsigned int *)&v0[20] = a2;
                return 1;
            case 133:
LABEL_9d3370:
                return (int)v0[20];
            default:
                return 0;
            }
        }
        else
        {
            return 1;
        }
    }
}
