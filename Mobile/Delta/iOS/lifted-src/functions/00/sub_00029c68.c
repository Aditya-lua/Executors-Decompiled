/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x29c68..0x29ccc (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_29c68_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_29c68_1;

typedef struct st_29c68_0 {
    char field_0;
} st_29c68_0;


st_29c68_1 * sub_29c68(st_29c68_1 *a0)
{
    st_29c68_1 *v4;  // x0
    st_29c68_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_29c68_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0[1].padding_0 < a0->field_8 * 3 >> 2)
        return a0;
    v4 = sub_2b914();
    if (!v4)
        return sub_2fa34(a0);
    return v4;
}
