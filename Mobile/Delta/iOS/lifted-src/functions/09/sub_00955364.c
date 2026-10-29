/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x955364..0x955404 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_955364_0 {
    unsigned int field_0;
    char padding_4[1268];
    unsigned long long field_4f8;
    char padding_500[896];
    unsigned long long field_880;
} st_955364_0;


unsigned long long sub_955364(st_955364_0 *a0, int a1, unsigned long long a2)
{
    unsigned long v2;  // x8
    unsigned long long *v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = a0->field_0;
    if (!(unsigned int)v2 || v2 >> 7 & 1 && (a0 = sub_980dc8(), a0))
    {
        if (55 >= a1)
        {
            switch (a1)
            {
            case 6:
                v3 = a0->field_880 + 16;
                break;
            case 15:
                v3 = &a0->field_4f8;
                break;
            default:
                return 0;
            }
        }
        else
        {
            switch (a1)
            {
            case 56:
                v3 = &a0[1].padding_4[388];
                break;
            case 79:
                v3 = &a0[1].padding_4[964];
                break;
            default:
                return 0;
            }
        }
        *v3 = a2;
        return 1;
    }
    return 0;
}
