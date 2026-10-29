/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab997c..0xab99f4 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ab997c(long long a0, unsigned long a1, unsigned long a2, int a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_9db58c())
    {
        sub_9e5858(a0, 0);
        if (sub_9e4828(a0))
        {
            return 0;
        }
        else if (sub_9ebaf8(a0, 1))
        {
            return (int)sub_9e46a8(a0) > (a3 >> 1) - 100;
        }
    }
    return 0xffffffff;
}
