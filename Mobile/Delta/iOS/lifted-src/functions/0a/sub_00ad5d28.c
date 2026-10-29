/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad5d28..0xad5db8 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ad5d28(long long a0, long long a1)
{
    long long v2;  // x0
    long long v3;  // x19
    long long v4;  // x20
    long long v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if (a1)
    {
        v2 = sub_9dde10();
        if (!v2)
            return v2;
        v3 = v2;
        v4 = sub_9e4958();
        if (v4 && sub_9e5dac(v4, a0, a1, v3))
            v5 = !sub_9e4828(v4);
        else
            v5 = 0;
        sub_9dded4(v3);
        sub_9e48d4(v4);
        return v5;
    }
    else
    {
        return 0;
    }
}
