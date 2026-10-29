/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e7b8..0x98e8d4 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98e7b8_0 {
    unsigned long long field_0;
    char padding_8[24];
    char field_20;
} st_98e7b8_0;


char sub_98e7b8(st_98e7b8_0 *a0)
{
    unsigned long long v0;  // x8
    char v1;  // x8
    char v2;  // x9
    char v3;  // x10
    char v4;  // x10

    v0 = a0->field_0;
    if (64 > v0)
    {
        v1 = 2;
        v2 = *(long long *)&a0->padding_8[0];
        if (v2)
            goto LABEL_98e824;
        goto LABEL_98e7d0;
    }
    if (0x4000 > v0)
    {
        v1 = 3;
        v2 = *(long long *)&a0->padding_8[0];
        if (v2)
            goto LABEL_98e824;
        goto LABEL_98e7d0;
    }
    if (v0 <= 0x3fffffff)
    {
        v1 = 5;
        v2 = *(long long *)&a0->padding_8[0];
        if (v2)
            goto LABEL_98e824;
        goto LABEL_98e7d0;
    }
    if (v0 > 0x3fffffffffffffff)
        return 0;
    v1 = 9;
    v2 = *(long long *)&a0->padding_8[0];
    if (!v2)
    {
LABEL_98e7d0:
        if (a0->field_20 & 1)
            goto LABEL_98e838;
    }
    else
    {
LABEL_98e824:
        if (64 > v2)
        {
            v2 = 1;
            if (a0->field_20 & 1)
                goto LABEL_98e838;
        }
        else if (0x4000 > v2)
        {
            v2 = 2;
            if (a0->field_20 & 1)
                goto LABEL_98e838;
        }
        else if (v2 <= 0x3fffffff)
        {
            v2 = 4;
            if (a0->field_20 & 1)
                goto LABEL_98e838;
        }
        else
        {
            if (v2 > 0x3fffffffffffffff)
                return 0;
            v2 = 8;
            if (a0->field_20 & 1)
            {
LABEL_98e838:
                v4 = *(long long *)&a0->padding_8[8];
                if (64 > v4)
                {
                    v3 = 1;
                }
                else if (0x4000 > v4)
                {
                    v3 = 2;
                }
                else if (v4 <= 0x3fffffff)
                {
                    v3 = 4;
                }
                else if (v4 <= 0x3fffffffffffffff)
                {
                    v3 = 8;
                }
                else
                {
                    return 0;
                }
                return v2 + v1 + v3;
            }
        }
    }
    return v2 + v1;
}
