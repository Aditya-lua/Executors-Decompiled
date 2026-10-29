/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaac6e8..0xaac82c (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aac6e8(long long a0)
{
    long long v5;  // x19
    unsigned int v6;  // w0
    unsigned long long v15;  // x0
    unsigned int v7;  // w20
    unsigned int v8;  // w2
    unsigned long long v9;  // 4118
    unsigned long long v10;  // 4112
    unsigned int v11;  // w21
    unsigned long v12;  // x2
    unsigned long long v13;  // x0
    unsigned long long v14;  // x19
    char v0;  // [bp-0x44], Other Possible Types: unsigned int
    long long v1;  // [bp-0x40]
    long long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_a5ed4c();
    if ((int)sub_a5e05c(a0, &v2) < 1)
        return 0;
    v6 = sub_a50ac8(v2);
    if ((int)v6 >= 1)
    {
        v7 = v6;
        if ((int)sub_ab22d8(a0, &v1) >= 1 && (int)sub_ab2478(a0, &v0) >= 1)
        {
            v8 = v0;
            v9 = arm64g_calculate_condition(1, v8, 4, 0);
            if (!(v9 & 1))
            {
                v10 = arm64g_calculate_condition(0x11, v8, 1, 0);
                if (!(v10 & 1))
                {
                    v0 = v7;
                    v8 = v7;
                }
                if (1 < v8 + 3)
                    goto LABEL_aac7dc;
                v11 = 0xffffffff;
            }
            else
            {
                v0 = 0xfffffffd;
                v11 = v7;
            }
            v0 = (unsigned int)((sub_a5bdac(v5) & 0xffffffff) - v7) - 2;
            v12 = v0;
            if ((sub_a59ca4(v5) & 7) == 1)
            {
                v12 = (unsigned int)v12 - 1;
                v0 = v12;
            }
            if (v12 >> 31 & 1)
            {
                return 0;
            }
            else if ((unsigned int)v12 > v11)
            {
                v0 = v11;
            }
LABEL_aac7dc:
            v13 = sub_aac648(v2, v1);
            if (!v13)
                return v13;
            v14 = v13;
            v15 = sub_9c8d24(v14, sub_aadf10(), 0);
            sub_aadf28(v14);
            return v15;
        }
    }
    return 0;
}
