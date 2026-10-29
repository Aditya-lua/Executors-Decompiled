/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x959ea4..0x959f90 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_959ea4_0 {
    char padding_0[352];
    struct st_959ea4_1 *field_160;
    char padding_168[1320];
    unsigned long long field_690;
} st_959ea4_0;

typedef struct st_959ea4_1 {
    unsigned long long field_0;
} st_959ea4_1;


unsigned long long sub_959ea4(unsigned long long a0, unsigned long long *a1, st_959ea4_0 *a2)
{
    unsigned long long v0;  // x8
    unsigned long long *v1;  // x10
    unsigned long long v2;  // x9
    unsigned long long v4;  // 4113

    if (a0 > 911)
    {
        if (a0 > 979)
        {
            if (a0 == 980)
            {
                v0 = 6;
            }
            else if (a0 != 1087)
            {
                if (a0 != 1088)
                    goto LABEL_959f4c;
                v0 = 8;
            }
            else
            {
                v0 = 7;
            }
        }
        else
        {
            if (a0 != 912)
            {
                if (a0 != 979)
                    goto LABEL_959f4c;
                v0 = 5;
            }
            else
            {
                v0 = 1;
            }
        }
    }
    else
    {
        if (407 >= a0)
        {
            switch (a0)
            {
            case 6:
                v0 = 0;
                break;
            case 116:
                v0 = 2;
                break;
            default:
LABEL_959f4c:
                if (!a2->field_690)
                    return 0;
LABEL_959f54:
                v1 = a2->field_160;
                v2 = 0xfffffffffffffff7;
                while (*(int *)v1 != a0)
                {
                    v2 -= 1;
                    v4 = arm64g_calculate_condition(18, a2->field_690 + v2, 9, 0);
                    v1 += 1;
                    if (!(v4 & 1))
                        return 0;
                }
                v0 = -v2;
                break;
            }
        }
        else
        {
            switch (a0)
            {
            case 408:
                v0 = 3;
                break;
            case 811:
                v0 = 4;
                break;
            default:
LABEL_959f4c:
                if (!a2->field_690)
                    return 0;
                goto LABEL_959f54;
            }
        }
    }
    *a1 = v0;
    return 1;
}
