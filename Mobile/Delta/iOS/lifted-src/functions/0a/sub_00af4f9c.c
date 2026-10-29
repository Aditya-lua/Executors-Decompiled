/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf4f9c..0xaf5094 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af4f9c(long long a0, long long a1, long long a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x22
    unsigned long long v4;  // 4112
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x22
    unsigned long long v8;  // 4112
    unsigned long long v9;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_af26d0();
    if (!(v2 >> 31 & 1))
    {
        v3 = v2;
        v4 = arm64g_calculate_condition(0x11, sub_af26d0(a0, a2, v3) & 0xffffffff, 1, 0);
        if (v4 & 1)
            return 0;
        v5 = sub_af4144(sub_af26d8(a0, v3), v3);
    }
    else
    {
        v5 = 0;
    }
    v6 = sub_af26d0(a1, a2, 0xffffffff);
    if (!(v6 >> 31 & 1))
    {
        v7 = v6;
        v8 = arm64g_calculate_condition(1, sub_af26d0(a1, a2, v7) & 0xffffffff, 1, 0);
        if (!(v8 & 1))
            return 0;
        v9 = sub_af4144(sub_af26d8(a1, v7), v7);
        if (v5 || v9)
            goto LABEL_af5068;
    }
    else
    {
        v9 = 0;
        if (v5)
        {
LABEL_af5068:
            if (!v5)
            {
                return 0;
            }
            else if (v9)
            {
                return !sub_9c3654(v5);
            }
            else
            {
                return 0;
            }
        }
    }
    return 1;
}
