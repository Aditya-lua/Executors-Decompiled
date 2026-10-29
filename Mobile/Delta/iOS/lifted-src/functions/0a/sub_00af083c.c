/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf083c..0xaf091c (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af083c(unsigned long long a0, long long a1, unsigned long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v17;  // w10
    unsigned long v18;  // cc_dep1
    unsigned long long v19;  // 4105
    unsigned long long v20;  // 4105
    unsigned long long v21;  // x0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x22
    char *v13;  // x8
    char *v14;  // x9
    unsigned long long v15;  // w10
    char *v16;  // x8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if ((int)sub_ad69e4(a1) < 1)
        return 1;
    v12 = 0;
    do
    {
        v13 = *(long long *)(sub_ad69f8(a1, v12) + 8);
        v14 = v13 + 1;
        while (1)
        {
            v15 = *(v14 - 1);
            if (45 >= v15)
            {
                v16 = v13;
                if (!v15)
                    break;
                if (v15 == 44)
                    goto LABEL_af08b8;
            }
            else if (v15 == 46 || v15 == 58)
            {
LABEL_af08b8:
                if (!*v14)
                {
                    v16 = v13;
                    break;
                }
                else
                {
                    v16 = v14;
                    break;
                }
            }
            v14 += 1;
        }
        v17 = *v16;
        v18 = v17 & 0xff;
        if (v17 != 43)
        {
            v19 = arm64g_calculate_condition(19, v18, 43, 0);
            if (!(v19 & 1))
                goto LABEL_af08d6;
            goto LABEL_af08d5;
        }
        else
        {
            v20 = arm64g_calculate_condition(19, v18, 43, 0);
            if (v20 & 1)
            {
LABEL_af08d5:
                continue;
            }
            else
            {
LABEL_af08d6:
            }
        }
        v21 = sub_af9054();
        if (!(unsigned int)v21)
            return v21;
        v12 = (unsigned int)v12 + 1;
    } while ((int)v12 < (int)sub_ad69e4(a1));
    return 1;
}
