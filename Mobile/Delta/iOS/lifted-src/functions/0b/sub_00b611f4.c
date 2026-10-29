/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb611f4..0xb612e0 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b611f4_0 {
    struct st_b611f4_0 *field_0;
    unsigned int field_8;
    char padding_c[44];
    struct st_b611f4_0 *field_38;
    struct st_b611f4_0 *field_40;
    struct st_b611f4_0 *field_48;
} st_b611f4_0;


st_b611f4_0 * sub_b611f4(st_b611f4_0 *a0)
{
    st_b611f4_0 *v0;  // [bp-0x18]
    st_b611f4_0 *v1;  // [bp-0x4]

    if (a0 && a0->field_40 && a0->field_48)
    {
        v0 = a0->field_38;
        if (v0 && v0->field_0 == a0 && 16180 <= v0->field_8 && 16211 >= v0->field_8)
        {
            v1 = (st_b611f4_0 *)0;
            return v1;
        }
        v1 = (st_b611f4_0 *)1;
        return v1;
    }
    v1 = (st_b611f4_0 *)1;
    return v1;
}
