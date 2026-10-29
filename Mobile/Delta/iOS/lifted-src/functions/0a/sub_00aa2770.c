/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa2770..0xaa2818 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aa2770(int a0, long long *a1, unsigned long a2, long long *a3)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (11 < a0)
    {
        if (a0 == 12)
            goto LABEL_aa27e8;
        if (a0 == 13)
        {
LABEL_aa27a8:
            if (1 > (int)sub_aa33e0(*a1, a3[1]))
                return 0;
        }
    }
    else if (a0 == 10)
    {
        if ((int)sub_aa41fc(a3 + 2, *a1) < 1)
            return 0;
LABEL_aa27e8:
        v2 = sub_aa29e4(*a1, *a3);
        a3[1] = v2;
        if (!v2)
            return v2;
    }
    else if (a0 == 11)
    {
        goto LABEL_aa27a8;
    }
    return 1;
}
