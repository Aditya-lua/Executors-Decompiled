/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c950c..0x3c9590 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c950c_0 {
    struct st_3c950c_0 *field_0;
} st_3c950c_0;


st_3c950c_0 ** sub_3c950c(unsigned int a0, st_3c950c_0 **a1, st_3c950c_0 **a2)
{
    st_3c950c_0 **v0;  // x0

    if (a2)
        *(unsigned int *)a2 = 0;
    if ((int)a0 > 15)
    {
        if (a0 == 32 || a0 == 24)
        {
            return a0 >> 3;
        }
        else if (a0 == 16)
        {
            if (a1)
                v0 = 2;
            else
                v0 = 3;
            if (a1)
            {
                return v0;
            }
            else if (!a2)
            {
                return v0;
            }
        }
        else
        {
            return 0;
        }
    }
    else
    {
        if (a0 == 8)
        {
            return 1;
        }
        else if (a0 != 15)
        {
            return 0;
        }
        else if (!a2)
        {
            return 3;
        }
    }
    *(unsigned int *)a2 = 1;
    return 3;
}
