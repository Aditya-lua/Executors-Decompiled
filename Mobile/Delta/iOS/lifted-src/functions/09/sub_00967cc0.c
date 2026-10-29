/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x967cc0..0x967d1c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_967cc0_0 {
    unsigned int field_0;
    char padding_4[2756];
    long long field_ac8;
} st_967cc0_0;


st_967cc0_0 * sub_967cc0(st_967cc0_0 *a0)
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
            a0 = sub_980dc8(a0);
            if (!a0)
                return a0;
        }
        else
        {
            return a0;
        }
    }
    sub_a6c2e4(a0->field_ac8, "ssl/t1_lib.c", 122);
}
