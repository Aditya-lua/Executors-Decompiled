/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x955a98..0x955b68 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_955a98_0 {
    char padding_0[344];
    unsigned long long field_158;
    char padding_160[208];
    unsigned long long field_230;
    char padding_238[32];
    char field_258;
    char padding_259[15];
    char field_268;
    char padding_269[223];
    char field_348;
    char padding_349[7];
    char field_350;
    char padding_351[7];
    char field_358;
    char padding_359[95];
    unsigned long long field_3b8;
} st_955a98_0;


long long sub_955a98(st_955a98_0 *a0, int a1, unsigned long a2)
{
    unsigned long long *v0;  // x8

    if (74 >= a1)
    {
        if (62 >= a1)
        {
            switch (a1)
            {
            case 6:
                v0 = a0->field_158 + 16;
                break;
            case 53:
                v0 = &a0->field_230;
                break;
            default:
                return 0;
            }
        }
        else
        {
            switch (a1)
            {
            case 63:
                v0 = &a0->field_268;
                break;
            case 72:
                v0 = &a0->field_258;
                break;
            default:
                return 0;
            }
        }
    }
    else
    {
        if (76 < a1)
        {
            switch (a1)
            {
            case 77:
                a0->field_3b8 = a0->field_3b8 | 32;
                v0 = &a0->field_358;
                break;
            case 79:
                v0 = &a0[1].padding_0[40];
                break;
            default:
                return 0;
            }
        }
        else if (a1 == 75)
        {
            a0->field_3b8 = a0->field_3b8 | 32;
            v0 = &a0->field_348;
        }
        else if (a1 == 76)
        {
            a0->field_3b8 = a0->field_3b8 | 32;
            v0 = &a0->field_350;
        }
        else
        {
            return 0;
        }
    }
    *v0 = a2;
    return 1;
}
