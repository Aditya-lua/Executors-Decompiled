/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95a0e8..0x95a2fc (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95a0e8_0 {
    char padding_0[36];
    unsigned long long field_24;
} st_95a0e8_0;

typedef struct st_95a0e8_1 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
    char padding_478[56];
    unsigned long long field_4b0;
} st_95a0e8_1;


unsigned long long sub_95a0e8(st_95a0e8_1 *a0, st_95a0e8_0 *a1, unsigned long long *a2)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // w9
    unsigned long long idx;  // x20
    unsigned long long v5;  // x0
    unsigned long long v6;  // 4102
    unsigned long long v7;  // 4102
    unsigned long long *v8;  // x21
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = *(int *)&(a1->padding_0)[1];
    if (0xfff >= v3)
    {
        if (63 >= v3)
        {
            if (7 >= v3)
            {
                switch (v3)
                {
                case 1:
                    idx = 0;
                    break;
                case 2:
                    idx = 1;
                    break;
                case 4:
                    idx = 2;
                    break;
                default:
LABEL_95a2e4:
                    *a2 = v2;
                    return 1;
                }
            }
            else
            {
                switch (v3)
                {
                case 8:
                    idx = 3;
                    break;
                case 16:
                    idx = 4;
                    break;
                case 32:
                    v5 = sub_a4e104(a0->field_0, "NULL", a0->field_470);
                    *a2 = v5;
                    if (!v5)
                        return v5;
                    return 1;
                default:
LABEL_95a2e4:
                    *a2 = v2;
                    return 1;
                }
            }
        }
        else
        {
            if (0x1ff >= v3)
            {
                switch (v3)
                {
                case 64:
                    idx = 6;
                    break;
                case 128:
                    idx = 7;
                    break;
                case 256:
                    idx = 8;
                    break;
                default:
LABEL_95a2e4:
                    *a2 = v2;
                    return 1;
                }
            }
            else
            {
                switch (v3)
                {
                case 512:
                    idx = 9;
                    break;
                case 1024:
                    idx = 10;
                    break;
                case 2048:
                    idx = 11;
                    break;
                default:
LABEL_95a2e4:
                    *a2 = v2;
                    return 1;
                }
            }
        }
    }
    else
    {
        if (0x40000 > v3)
        {
            if (0x8000 > v3)
            {
                switch (v3)
                {
                case 4096:
                    idx = 12;
                    break;
                case 8192:
                    idx = 13;
                    break;
                case 16384:
                    idx = 14;
                    break;
                default:
LABEL_95a2e4:
                    *a2 = v2;
                    return 1;
                }
            }
            else
            {
                v6 = arm64g_calculate_condition(3, v3, 0x8000, 0);
                if (!(v6 & 1))
                {
                    switch (v3)
                    {
                    case 65536:
                        idx = 16;
                        break;
                    case 131072:
                        idx = 0x11;
                        break;
                    default:
LABEL_95a2e4:
                        *a2 = v2;
                        return 1;
                    }
                }
                else
                {
                    idx = 15;
                }
            }
        }
        else
        {
            if (0x200000 > v3)
            {
                switch (v3)
                {
                case 262144:
                    idx = 18;
                    break;
                case 524288:
                    idx = 19;
                    break;
                case 1048576:
                    idx = 20;
                    break;
                default:
LABEL_95a2e4:
                    *a2 = v2;
                    return 1;
                }
            }
            else
            {
                v7 = arm64g_calculate_condition(3, v3, 0x200000, 0);
                if (!(v7 & 1))
                {
                    switch (v3)
                    {
                    case 4194304:
                        idx = 22;
                        break;
                    case 8388608:
                        idx = 23;
                        break;
                    default:
LABEL_95a2e4:
                        *a2 = v2;
                        return 1;
                    }
                }
                else
                {
                    idx = 21;
                }
            }
        }
    }
    v8 = &a0->field_4b0;
    v9 = v8[idx];
    if (!v9)
        return v9;
    v10 = sub_963e34(v9);
    if (!(unsigned int)v10)
        return v10;
    v2 = v8[idx];
    goto LABEL_95a2e4;
}
