/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf04ec..0xaf057c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_af04ec(long long a0)
{
    unsigned long v4;  // x0
    char v0;  // [bp-0x38]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (sub_af0158(&v0, a0))
    {
        v4 = sub_9cf0ec();
        if (v4)
        {
            v4 = v4;
            if (!sub_9c026c())
            {
                sub_9cf0f4(v4);
                goto LABEL_af054c;
            }
        }
    }
    else
    {
LABEL_af054c:
        v4 = 0;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
