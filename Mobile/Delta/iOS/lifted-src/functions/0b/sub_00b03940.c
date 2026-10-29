/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb03940..0xb03978 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b03940_0 {
    char padding_0[108];
    char field_6c;
} st_b03940_0;


unsigned long long sub_b03940(st_b03940_0 *a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a0->field_6c >> 1 & 1))
    {
        v2 = sub_a97298(&a0[6].padding_0[0x22]);
        if (!(unsigned int)v2)
            return v2;
    }
    else
    {
        v3 = sub_a96f58(&a0[6].padding_0[0x22]);
        if (!(unsigned int)v3)
            return v3;
    }
    return 1;
}
