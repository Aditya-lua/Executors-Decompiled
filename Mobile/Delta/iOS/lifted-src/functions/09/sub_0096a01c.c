/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96a01c..0x96a0bc (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96a01c_0 {
    char padding_0[1040];
    unsigned long long field_410;
    char field_414;
    char padding_415[3];
    char field_418;
    char padding_419[3];
    char field_41c;
    char padding_41d[1363];
    unsigned long long field_970;
    char padding_978[720];
    char field_c48;
} st_96a01c_0;


char sub_96a01c(st_96a01c_0 *a0)
{
    char v3;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_410 = 0;
    sub_96a0bc((char *)&a0->field_410 + 4, a0, 0x5000e);
    if (sub_9ae540(a0, &a0->field_414, &a0->field_418, 0))
        return 0;
    if (!*(long long *)&a0->padding_41d[1359])
    {
        a0->field_410 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)&a0->field_410 | 68719477192);
        if (!(a0->padding_978[712] >> 5 & 1))
        {
LABEL_96a078:
            v3 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)&a0->field_410 | 274877906976);
            a0->field_410 = v3;
        }
    }
    else if (!(a0->padding_978[712] >> 5 & 1))
    {
        goto LABEL_96a078;
    }
    return 1;
}
