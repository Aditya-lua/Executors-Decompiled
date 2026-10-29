/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979864..0x979918 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_979864(unsigned long long *a0, long long a1)
{
    unsigned long long v2;  // x22
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        v2 = 1424;
    else
        v2 = 1432;
    if ((unsigned long long)*(long long *)((char *)a0 + v2) <= 0x3fffffffffffffff)
    {
        v3 = sub_989380();
        if (!v3)
            return v3;
        if (sub_979918(a0, v3, 1, !a1))
        {
            *(long long *)((char *)a0 + v2) = *(long long *)((char *)a0 + v2) + 1;
            return v3;
        }
        sub_989488(a0 + 106, v3);
    }
    return 0;
}
