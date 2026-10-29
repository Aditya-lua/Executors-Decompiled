/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa021ac..0xa02200 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a021ac(unsigned long long *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0[1])
    {
        return 0xffffffff;
    }
    else if (a0[2])
    {
        sub_9e46a8();
        sub_9e46a8(a0[2]);
    }
    else
    {
        return 0xffffffff;
    }
}
