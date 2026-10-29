/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5842c..0xa58460 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5842c_0 {
    long long field_0;
    unsigned int field_8;
} st_a5842c_0;


st_a5842c_0 * sub_a5842c(st_a5842c_0 *a0, long long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = &v2;
    v1 = v3;
    return sub_a4f0d8(a0->field_0, a0->field_8, 0, a1) != 0;
}
