/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7b198..0xa7b1f0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7b198_0 {
    struct st_a7b198_0 *field_0;
    struct st_a7b198_0 *field_8;
} st_a7b198_0;


void sub_a7b198(unsigned long a0, st_a7b198_0 *a1, st_a7b198_0 *a2)
{
    st_a7b198_0 *v2;  // x0
    st_a7b198_0 *v3;  // x8
    st_a7b198_0 *v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (a1)
    {
        if (v2)
            v3 = v2->field_0;
        else
            v3 = 0;
        a1->field_0 = v3;
    }
    if (!a2)
        return;
    if (v2)
        v4 = v2->field_8;
    else
        v4 = 0;
    a2->field_0 = v4;
    return;
}
