/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb92c..0xaeba10 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aeb92c(unsigned long a0, void* a1, unsigned int a2)
{
    unsigned long v5;  // x8
    unsigned int v6;  // w9
    unsigned long long v15;  // 4102
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    unsigned long long v19;  // x0
    unsigned long long v20;  // x0
    unsigned int v7;  // w11
    unsigned long v8;  // cc_dep1
    unsigned long long v9;  // x0
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned long long v14;  // 4112
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = (int)a1[232];
    if (a2)
    {
        if (!(v5 >> 1 & 1) || (char)((char)a1[236]) >> 2 & 1)
        {
            if (v5 & 1)
                return __ROL__((unsigned int)v5, 28) & 4026531841 & 1;
            v6 = (unsigned int)v5 & 2;
            v7 = (unsigned int)v5 & 8256;
            v8 = v7;
            if (v7 == 8256)
            {
                v9 = 3;
                v10 = arm64g_calculate_condition(19, v8, 8256, 0);
                if (!(v10 & 1))
                    goto LABEL_aeb95e;
LABEL_aeb95d:
                v12 = arm64g_calculate_condition(19, v8, 8256, 0);
                v13 = arm64g_calculate_condition(19, (v12 & 1 ? v6 : 0), 0, 0);
                if (v13 & 1)
                    return v9;
            }
            else
            {
                v9 = 4;
                v11 = arm64g_calculate_condition(19, v8, 8256, 0);
                if (v11 & 1)
                    goto LABEL_aeb95d;
LABEL_aeb95e:
                v14 = arm64g_calculate_condition(19, v8, 8256, 0);
                v15 = arm64g_calculate_condition(16, (v14 & 1 ? v6 : 0), 0, 0);
                if (v15 & 1)
                    return v9;
            }
            if (v5 >> 3 & 1 && (char)a1[244] & 7)
                return 5;
        }
    }
    else
    {
        if (v5 >> 1 & 1 && ((int)a1[236] & 134) == 128)
        {
            v0 = v16;
            v1 = v17;
            v2 = &v4;
            v3 = v18;
            v19 = sub_af26f0(a1, 83, 0xffffffff);
            if (v19 >> 31 & 1)
                return 0;
            v20 = sub_af4068(sub_af26f8(a1, v19), v19);
            if (!(unsigned int)v20)
            {
                return v20;
            }
            else if ((char)((char)a1[232]) >> 2 & 1)
            {
                if (!((int)a1[240] & 8))
                    return 0;
                return !((int)a1[240] & 0x101);
            }
            return 0;
        }
    }
    return 0;
}
