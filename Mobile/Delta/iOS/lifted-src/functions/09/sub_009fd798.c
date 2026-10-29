/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd798..0x9fd864 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9fd798(unsigned long a0, long long a1, unsigned int a2)
{
    unsigned long v4;  // x21
    unsigned long v5;  // x0
    unsigned long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (a0)
    {
        v4 = sub_a6fbc4(a1, "priv");
        v5 = sub_a6fbc4(a1, "pub");
        if (!a2 || !v4 || sub_a70f20(v4, &v1))
        {
            if (!sub_a70f20() || !sub_9ffd74(a0))
                goto LABEL_9fd83c;
            a0 = 1;
        }
        else
        {
LABEL_9fd83c:
            sub_9e4838(v1);
            sub_9e48d4(v0);
            a0 = 0;
        }
    }
    return a0;
}
