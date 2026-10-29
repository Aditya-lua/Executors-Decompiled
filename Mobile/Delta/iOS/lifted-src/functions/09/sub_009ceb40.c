/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ceb40..0x9cec80 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9ceb40(long long a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned long long *a4)
{
    unsigned long long v3;  // x23
    unsigned long long v4;  // x23
    unsigned long long v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a1;
    if ((int)a1 >= 21)
    {
        do
        {
            v4 = v3;
            if (sub_9d3fec(a0, "                    ", 20) != 20)
                return 0;
        } while ((v3 = (unsigned int)v4 - 20, 40 < (int)v4));
    }
    if (sub_9d3fec(a0, "                    ", v3) == (unsigned int)v3)
    {
        if (*a4 & 0x100)
            a3 = 0;
        if (*a4 & 64)
            a2 = 0;
        if (!a3 && !a2)
            return 1;
        if (a2)
        {
            if ((int)sub_9d4888(a0) >= 1 && (!a3 || !(v0 = a3, 1 > (int)sub_9d524c(a0, " (%s)"))))
                goto LABEL_9cec40;
        }
        else
        {
            if (!a3 || (int)sub_9d4888(a0, a3) >= 1)
            {
LABEL_9cec40:
                return sub_9d3fec(a0, ": ", 2) == 2;
            }
        }
    }
    return 0;
}
