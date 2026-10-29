/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaebc38..0xaebcf4 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_aef19c;

unsigned long long sub_aebc38(unsigned long a0, long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x19
    unsigned long long v3;  // x21
    unsigned long long v4;  // x22
    long long v5;  // x0
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    if ((int)sub_ad69e4(a1) >= 1)
    {
        v3 = 0;
        v4 = v2;
        while (1)
        {
            v5 = sub_ad69f8(a1, v3);
            v6 = sub_aec0c4(v5, v5, v4);
            if (!v6)
                break;
            v3 = (unsigned int)v3 + 1;
            v4 = v6;
            if ((int)v3 >= (int)sub_ad69e4(a1))
                return v6;
        }
        if (v2)
            return 0;
        sub_ad6958(v4, &g_aef19c);
        return 0;
    }
    else if (v2)
    {
        return v2;
    }
}
