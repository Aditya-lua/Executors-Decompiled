/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x696cc..0x69758 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_696cc_1 {
    unsigned int field_0;
} st_696cc_1;

typedef struct st_696cc_0 {
    char field_0;
} st_696cc_0;


unsigned int * sub_696cc(st_696cc_1 **a0, unsigned int *a1)
{
    unsigned int v4;  // w0
    st_696cc_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_696cc_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (*(int *)a0)
        return 0;
    v4 = _atoi(sub_a0c8(a0 + 7));
    if (0xffff0001 > v4 - 0x10000)
        return 0;
    if (!a1)
        return 1;
    *a1 = v4;
    return 1;
}
