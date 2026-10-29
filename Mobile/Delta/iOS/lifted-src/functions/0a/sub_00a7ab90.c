/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7ab90..0xa7abe8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a7ab90(unsigned long long a0, unsigned int a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        if (a0)
        {
            if (!(sub_c692a4() >> 31 & 1))
            {
LABEL_a7abd0:
                a0 = 1;
            }
            else
            {
                a0 = 0;
            }
        }
        return a0;
    }
    sub_a78ccc();
    goto LABEL_a7abd0;
}
