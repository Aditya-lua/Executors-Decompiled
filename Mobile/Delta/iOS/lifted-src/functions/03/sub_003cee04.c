/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cee04..0x3cee9c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cee04_0 {
    char field_0;
} st_3cee04_0;


long long sub_3cee04(long long a0, char *a1)
{
    unsigned int v4;  // w0
    unsigned int v5;  // w0
    unsigned int v6;  // w0
    unsigned int v7;  // w0
    st_3cee04_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3cee04_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_3d706c();
    if (v4 != *a1)
        return 0;
    v5 = sub_3d706c(a0);
    if (v5 != a1[1])
        return 0;
    v6 = sub_3d706c(a0);
    if (v6 != a1[2])
        return 0;
    v7 = sub_3d706c(a0);
    return v7 == a1[3];
}
