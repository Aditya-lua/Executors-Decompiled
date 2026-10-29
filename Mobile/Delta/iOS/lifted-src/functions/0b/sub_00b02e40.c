/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb02e40..0xb02f78 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b02e40_0 {
    char padding_0[32];
    char field_20;
    char padding_21[47];
    long long field_50;
    char padding_58[20];
    char field_6c;
    char padding_6d[579];
    char field_2b0;
    char padding_2b1[179];
    char field_364;
} st_b02e40_0;


unsigned long long sub_b02e40(st_b02e40_0 *a0, long long a1, unsigned long a2)
{
    unsigned long long v2;  // x0
    char v3;  // w8
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    if (!(a0->field_364 & 1))
        return 0;
    v3 = *(int *)&a0->padding_2b1[175];
    switch (v3)
    {
    case 0:
        return 0;
    case 3:
        return 0;
    case 1:
        if (sub_a96ab0(&a0->field_2b0, &a0->field_20, a0->field_50, *(long long *)&a0[1].padding_0[3]) == 1)
        {
            *(unsigned int *)&a0->padding_2b1[175] = 2;
            goto LABEL_b02ec0;
        }
        break;
    default:
LABEL_b02ec0:
        *(unsigned long long *)a2 = 0;
        if (*(long long *)&a0[1].padding_0[11])
        {
            if (!(a0->field_6c >> 1 & 1))
            {
                v4 = sub_a97298(&a0->field_2b0, &a0[1].padding_21[10], a1);
                if (!(unsigned int)v4)
                    return v4;
            }
            else
            {
                v5 = sub_a96f58(&a0->field_2b0, &a0[1].padding_21[10], a1);
                if (!(unsigned int)v5)
                    return v5;
            }
            *(long long *)a2 = *(long long *)&a0[1].padding_0[11];
            *(unsigned long long *)&a0[1].padding_0[11] = 0;
        }
        if (!*(long long *)&a0[1].padding_0[19])
        {
LABEL_b02f2c:
            if (!(a0->field_6c >> 1 & 1))
            {
                if (*(long long *)&a0[1].padding_0[3] && !sub_a975dc(&a0->field_2b0, &a0[1].padding_0[27]))
                    goto LABEL_b02f68;
                break;
            }
            else
            {
                if ((int)sub_a97670(&a0->field_2b0, &a0[1].padding_0[27], *(long long *)&a0[1].padding_0[3]) >= 1)
                {
LABEL_b02f68:
                    *(unsigned int *)&a0->padding_2b1[175] = 3;
                    return 1;
                }
            }
        }
        else if (sub_a96d40(&a0->field_2b0, &a0[1].padding_21[26]) == 1)
        {
            *(unsigned long long *)&a0[1].padding_0[19] = 0;
            goto LABEL_b02f2c;
        }
    }
    return 0;
}
