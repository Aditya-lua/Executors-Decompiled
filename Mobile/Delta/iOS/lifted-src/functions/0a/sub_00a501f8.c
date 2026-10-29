/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa501f8..0xa50354 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_a501f8(unsigned int *a0)
{
    unsigned int *v2;  // x19
    unsigned int *v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = *a0;
        if (649 >= (int)(unsigned int)v2)
        {
            if (97 >= (int)(unsigned int)v2)
            {
                if ((int)(unsigned int)v2 > 36)
                {
                    if ((unsigned int)v2 == 37)
                    {
                        return 37;
                    }
                    else if ((unsigned int)v2 == 61)
                    {
                        return 61;
                    }
                    else if ((unsigned int)v2 == 97)
                    {
                        return 5;
                    }
                }
                else
                {
                    if ((unsigned int)v2 == 5)
                    {
                        return 5;
                    }
                    else if ((unsigned int)v2 == 30)
                    {
                        return 30;
                    }
                }
            }
            else
            {
                if ((int)(unsigned int)v2 > 420)
                {
                    if ((unsigned int)v2 == 421)
                    {
                        return 421;
                    }
                    else if ((unsigned int)v2 == 425)
                    {
                        return 425;
                    }
                    else if ((unsigned int)v2 == 429)
                    {
                        return 429;
                    }
                }
                else
                {
                    if ((unsigned int)v2 == 98)
                    {
                        return 37;
                    }
                    else if ((unsigned int)v2 == 166)
                    {
                        return 37;
                    }
                }
            }
        }
        else
        {
            if (654 >= (int)(unsigned int)v2)
            {
                if ((int)(unsigned int)v2 > 651)
                {
                    if ((unsigned int)v2 == 652)
                    {
                        return 429;
                    }
                    else if ((unsigned int)v2 == 653)
                    {
                        return 421;
                    }
                    else if ((unsigned int)v2 == 654)
                    {
                        return 425;
                    }
                }
                else
                {
                    if ((unsigned int)v2 == 650)
                    {
                        return 421;
                    }
                    else if ((unsigned int)v2 == 651)
                    {
                        return 425;
                    }
                }
            }
            else
            {
                if ((unsigned int)v2 - 656 < 2)
                {
                    return 30;
                }
                else if (2 > (unsigned int)v2 - 658)
                {
                    return 61;
                }
                else if ((unsigned int)v2 == 655)
                {
                    return 429;
                }
            }
        }
    }
    else
    {
        v2 = 0;
    }
    if (!sub_a9a7fc(sub_a99624(v2)))
        v3 = 0;
    else
        v3 = v2 & 0xffffffff;
    sub_9c3580();
    return v3;
}
