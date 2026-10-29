/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad97ec..0xad98a0 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_ad97ec(unsigned long a0, long long a1, long long a2)
{
    char *v2;  // x0
    char *v3;  // x19
    char *i;  // x9
    long long v5;  // x0
    char *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (!v2)
        return v2;
    v3 = v2;
    sub_ad9384(*(long long *)&v2[16]);
    if (!*(long long *)v3)
    {
        v5 = *(long long *)&v3[16];
    }
    else
    {
        for (i = *(long long *)v3; i == *(long long *)&v3[8]; i = *(long long *)v3)
        {
            sub_ad9488(*(long long *)&v3[24], *(long long *)&v3[16]);
        }
        *(long long *)&v3[8] = *(long long *)&v3[8] + 1;
        sub_ad93b4(*(long long *)&v3[16]);
        v6 = sub_ad9530(a1, a2, 1);
        if (v6)
        {
            *(unsigned long *)&v6[80] = a0;
            return v6;
        }
        sub_ad9384(*(long long *)&v3[16]);
        v5 = *(long long *)&v3[16];
        *(long long *)&v3[8] = *(long long *)&v3[8] - 1;
    }
    sub_ad93b4(v5);
    return 0;
}
