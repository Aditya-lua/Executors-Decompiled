/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x29a28..0x29a6c (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_29a28_0 {
    long long field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_29a28_0;


st_29a28_0 * sub_29a28(st_29a28_0 *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_2bbf4();
    v2 = a0->field_0;
    if (!v2)
        return a0;
    sub_4e14(v2, (long long)(a0->field_18 - v2) >> 5, 8);
    return a0;
}
