/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5fafc..0xc5fc00 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_efd4e0;

long long sub_c5fafc(unsigned long a0, unsigned long i)
{
    unsigned long v4;  // x19
    unsigned long count;  // x0
    unsigned long long v6;  // 4106
    unsigned long v7;  // x8
    unsigned long v8;  // x9
    unsigned long v9;  // x8
    unsigned long long v10;  // x8
    unsigned long long v11;  // 4102
    unsigned long v0;  // [bp-0x60], Other Possible Types: unsigned long long
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!i)
        return 0;
    v4 = &g_efd4e0;
    do
    {
        count = _write();
        v6 = arm64g_calculate_condition(2, count, 1, 0);
        if (!(v6 & 1))
        {
            if (count)
            {
                v7 = i - count;
                if (i < count)
                    sub_c73bb0();
                i = v7;
                goto LABEL_c5fb40;
            }
            goto LABEL_c5fba0;
        }
        else
        {
            v8 = *(int *)___error();
            v9 = 2 | v8 * 0x100000000;
            v0 = 1;
            v1 = v9;
            if ((unsigned int)v8 == 4)
            {
                sub_c40ff0(&v1);
            }
            else
            {
                v4 = v9;
LABEL_c5fba0:
                v0 = v4;
                v10 = v4 & 3;
                if (v10 < 2)
                    return v4;
                v11 = arm64g_calculate_condition(20, v10, 2, 0);
                if (v11 & 1)
                {
                    return v4;
                }
                else if ((unsigned int)(v4 >> 32) == 9)
                {
                    sub_c40ff0(&v0);
                    break;
                }
                else
                {
                    return v4;
                }
            }
        }
LABEL_c5fb40:
    } while (i);
    return 0;
}
