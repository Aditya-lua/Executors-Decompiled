/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa68da4..0xa68e7c (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_a68da4(char *a0, char *a1, unsigned long long *a2, unsigned long a3)
{
    char *v2;  // x0
    char *v3;  // x21
    char *v4;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if (a1 >= 1)
    {
        v2 = sub_a7c17c(*(long long *)&a0[16]);
        if (!(unsigned int)v2)
            return v2;
        if (sub_ad69f8(*(long long *)&a0[24], a1 - 1))
        {
            v3 = sub_ad5f4c();
            sub_a7c1b4(*(long long *)&a0[16]);
            if (v3)
            {
                v4 = (char *)(unsigned int)sub_ad69e4(v3);
                if (v4 < 1)
                {
                    sub_ad6020(v3);
                    return v4 > 0;
                }
                sub_ad69f8(v3, 0);
                a2();
            }
        }
        else
        {
            sub_a7c1b4(*(long long *)&a0[16]);
        }
        return 0;
    }
    else
    {
        return 0;
    }
}
