/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa172fc..0xa17360 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a172fc(long long a0, unsigned long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9ffdd0();
    if (a1 > 1)
    {
        v2 = 0;
    }
    else
    {
        v2 = sub_9ffdd0();
        if (v2)
        {
            if (!sub_9e5b90())
            {
                if (a1 == 1)
                    sub_a197a8(a0, 0x1000);
                else
                    sub_a198f0(a0, 0x1000);
            }
            v2 = 1;
        }
    }
    return v2;
}
