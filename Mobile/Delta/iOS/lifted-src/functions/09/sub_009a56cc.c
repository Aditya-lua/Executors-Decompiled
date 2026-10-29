/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a56cc..0x9a5714 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a56cc_0 {
    unsigned int field_0;
    char padding_4[168];
    unsigned int field_ac;
} st_9a56cc_0;


st_9a56cc_0 * sub_9a56cc(st_9a56cc_0 *a0)
{
    unsigned long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    v2 = a0->field_0;
    if ((unsigned int)v2)
    {
        if (v2 >> 7 & 1)
        {
            a0 = sub_980dc8();
            if (!a0)
                return a0;
        }
        else
        {
            return 0;
        }
    }
    if (!*(int *)&a0[1].padding_4[0])
        return a0->field_ac == 1;
    return 0;
}
