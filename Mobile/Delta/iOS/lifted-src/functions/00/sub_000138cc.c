/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x138cc..0x13918 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_138cc_1 {
    char padding_0[32];
    char field_20;
} st_138cc_1;

typedef struct st_138cc_0 {
    char padding_0[72];
    char field_48;
} st_138cc_0;


st_138cc_0 * sub_138cc(st_138cc_0 *a0)
{
    st_138cc_1 *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0->field_48 != 1)
        return a0;
    v0 = &a0->padding_0[40];
    sub_10344(&v0);
    sub_a070(a0);
    return a0;
}
