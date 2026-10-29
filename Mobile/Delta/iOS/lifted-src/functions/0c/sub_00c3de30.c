/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3de30..0xc3de74 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c3de30(char *a0, char *a1)
{
    char *v0;  // x1
    unsigned long long v1;  // x8
    char *v2;  // x1
    char *v3;  // x0
    unsigned long long v4;  // 4121

    v0 = a1 - a0;
    if (32 > v0)
    {
        if (a1 != a0)
        {
            v1 = 0;
            do
            {
                v2 = v0;
                v3 = a0 + 1;
                v4 = arm64g_calculate_condition(209, *a0, 65, 0);
                if (!(v4 & 1))
                    v1 += 1;
            } while ((v0 = v2 - 1, a0 = v3, v2 != 1));
            return v1;
        }
        else
        {
            return 0;
        }
    }
}
