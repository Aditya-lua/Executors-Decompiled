/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3c0c0..0xb3c1c8 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3c0c0_0 {
    char padding_0[16];
    char field_10;
    char field_11;
    char padding_12[70];
    unsigned long long field_58;
    unsigned int field_60;
} st_b3c0c0_0;


unsigned long long sub_b3c0c0(st_b3c0c0_0 *a0, st_b3c0c0_0 *a1, unsigned long long a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // w9
    unsigned long long v5;  // x8
    unsigned long long v6;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    if (!(a2 >> 2 & 1))
    {
        v3 = 1;
        if (!(a2 & 3))
            return 1;
    }
    else
    {
        v3 = a0->field_60 == a1->field_60;
        if (!(a2 & 3))
            return v3;
    }
    if (!(a2 >> 1 & 1) || !(a0->field_10 & 1) || !(a1->field_10 & 1))
    {
        v4 = 0;
        if (!(a2 & 1))
            return 0 & (unsigned int)v3;
        v5 = *(long long *)&a0->padding_12[62];
        if (*(long long *)&a0->padding_12[62] && (v6 = *(long long *)&a1->padding_12[62], *(long long *)&a1->padding_12[62]))
        {
            if (!(unsigned int)v3)
                goto LABEL_b3c1b0;
            v3 = 0;
            v4 = 1;
            if (a0->field_60 != a1->field_60)
                return 0;
            if (a0->field_58 == a1->field_58)
            {
LABEL_b3c1a4:
                v3 = !sub_a66f20(v5, v6);
LABEL_b3c1b0:
                v4 = 1;
            }
        }
    }
    else
    {
        if (!(unsigned int)v3)
            goto LABEL_b3c1b0;
        v3 = 0;
        v4 = 1;
        if (a0->field_60 != a1->field_60)
            return 0;
        if (a0->field_58 == a1->field_58)
        {
            v5 = &a0->field_11;
            v6 = &a1->field_11;
            goto LABEL_b3c1a4;
        }
    }
    return v4 & (unsigned int)v3;
}
