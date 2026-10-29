/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf23d8..0xaf2470 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af23d8(void)
{
    unsigned long long v2;  // x19
    unsigned long long v3;  // x20
    unsigned long long i;  // w20
    unsigned long v5;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad5f4c();
    if (!v2)
    {
        return v2;
    }
    else if ((int)sub_ad69e4(v2) >= 1)
    {
        v3 = 0;
        while (sub_af3b1c(sub_ad69f8(v2, v3), v3))
        {
            v3 = (unsigned int)v3 + 1;
            if ((int)v3 >= (int)sub_ad69e4(v2))
                return v2;
        }
        if ((unsigned int)v3)
        {
            i = (unsigned int)v3 + 1;
            do
            {
                v5 = i - 2;
                sub_afc404(sub_ad69f8(v2, v5), v5);
                i -= 1;
            } while (1 < i);
        }
        sub_ad6020(v2);
        return 0;
    }
    else
    {
        return v2;
    }
}
