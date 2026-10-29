/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5e48c..0xb5e4dc (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5e48c_0 {
    char padding_0[84];
    char field_54;
} st_b5e48c_0;


char sub_b5e48c(st_b5e48c_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a0->field_54 & 1))
    {
        if (sub_a95348(&a0[2].padding_0[78]))
            return 0;
        return 1;
    }
    else
    {
        if (sub_a94fe8(&a0[2].padding_0[78]))
            return 0;
        return 1;
    }
}
