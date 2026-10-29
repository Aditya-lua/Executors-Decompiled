/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96d378..0x96d41c (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_96d378(long long a0, char *a1, unsigned long a2)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a5b3bc())
    {
        v2 = sub_a59ca4(a0);
        if ((int)v2 < 1)
            return 0;
        if (v2 >> 3 != a2)
            return 0;
    }
    else if (sub_a5b3bc(a0, "EC"))
    {
        if (a2 < 3)
        {
            return 0;
        }
        else if (*a1 != 4)
        {
            return 0;
        }
    }
}
