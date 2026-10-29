/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa20874..0xa20908 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a20874(long long *a0, long long *a1)
{
    unsigned long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9e6c64(a0[15]);
    a0[15] = 0;
    sub_9e4838(a0[16]);
    a0[16] = 0;
    v2 = sub_a27188(a0, a1);
    if (!(unsigned int)v2)
        return v2;
    if (a1[15])
    {
        v3 = sub_9e6c04();
        a0[15] = v3;
        if (!v3)
        {
            return v3;
        }
        else if (!sub_9e6f30())
        {
            sub_9e6c64(a0[15]);
            a0[15] = 0;
            return 0;
        }
    }
    if (!a1[16])
        return 1;
    v4 = sub_9e4b00(a1[16]);
    a0[16] = v4;
    if (!v4)
    {
        sub_9e6c64(a0[15]);
        a0[15] = 0;
        return 0;
    }
    return 1;
}
