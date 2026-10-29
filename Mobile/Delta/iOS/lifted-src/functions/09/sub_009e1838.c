/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e1838..0x9e18c0 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9e1838(long long a0, long long a1, long long a2)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9de064(a2);
    v2 = sub_9de208(a2);
    if (v2)
    {
        sub_a36c8c();
        sub_9e5d14(a0, 4);
        v3 = sub_9e1750(v2, a0, a1, a2);
        v4 = v3 != 0;
        sub_a36cd4(v3, a0, a1, a2);
    }
    else
    {
        v4 = 0;
    }
    sub_9de17c(a2);
    return v4;
}
