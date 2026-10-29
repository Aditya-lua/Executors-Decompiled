/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae0540..0xae0684 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_ae0540(char *a0, char *a1, unsigned int a2)
{
    unsigned long v0;  // x9
    unsigned int v1;  // x8
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned int v12;  // w12
    unsigned int v13;  // w11
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned int v2;  // w10
    unsigned long v3;  // x12
    unsigned int v4;  // w2
    unsigned int v5;  // w2
    unsigned long long v6;  // x13
    unsigned int v7;  // w10
    unsigned int v8;  // w11
    unsigned int v9;  // w9

    v0 = a2;
    if ((int)a2 >= 1)
    {
        v1 = 0;
        while (a0[v1] == a1[v1])
        {
            if (v0 == v1 + 1)
            {
                v1 = v0;
                break;
            }
        }
    }
    else
    {
        v1 = 0;
    }
    v2 = a2 & (int)(a2) >> 31;
    v3 = v0 - 1;
    do
    {
        v4 = a2;
        v5 = v4 - 1;
        if ((int)v4 < 1)
        {
            v4 = v2;
            if ((int)v1 < (int)(v4 - 1))
                return 0xffffffff;
        }
    } while ((v6 = v3 & 0xffffffff, !a0[v6] && (v3 -= 1, a2 = v5, a1[v6] == 0xff)));
    if ((int)v5 > (int)v1)
        return 0xffffffff;
    if ((int)v4 <= (int)v1)
        return v1 * 8;
    v7 = a0[v1 & 0xffffffff];
    v8 = a1[v1 & 0xffffffff];
    v9 = v8 ^ v7;
    if ((int)v9 <= 14)
    {
        v10 = v9;
        v11 = 1;
        switch (v9)
        {
        case 1:
            v12 = 7;
            break;
        case 3:
            v10 = v9;
            v11 = 3;
            v12 = 6;
            break;
        case 7:
            v10 = v9;
            v11 = 7;
            v12 = 5;
            break;
        default:
            v10 = v9;
            v11 = 7;
            return 0xffffffff;
        }
    }
    else if (62 >= (int)v9)
    {
        v10 = v9;
        v11 = 15;
        switch (v9)
        {
        case 15:
            v12 = 4;
            break;
        case 31:
            v10 = v9;
            v11 = 31;
            v12 = 3;
            break;
        default:
            v10 = v9;
            v11 = 31;
            return 0xffffffff;
        }
    }
    else
    {
        v10 = v9;
        v11 = 63;
        switch (v9)
        {
        case 63:
            v12 = 2;
            break;
        case 127:
            v10 = v9;
            v11 = 127;
            v12 = 1;
            break;
        default:
            v10 = v9;
            v11 = 127;
            return 0xffffffff;
        }
    }
    v13 = v9 & v8;
    if (!(v9 & v7))
    {
        v14 = arm64g_calculate_condition(3, v10, v11, 0);
        v15 = arm64g_calculate_condition(19, (v14 & 1 ? v13 : 0), (v14 & 1 ? v9 : 0), 0);
        if (v15 & 1)
            return 0xffffffff;
    }
    else
    {
        v16 = arm64g_calculate_condition(3, v10, v11, 0);
        v17 = arm64g_calculate_condition(16, (v16 & 1 ? v13 : 0), (v16 & 1 ? v9 : 0), 0);
        if (v17 & 1)
            return 0xffffffff;
    }
    return v12 | v1 * 8;
}
