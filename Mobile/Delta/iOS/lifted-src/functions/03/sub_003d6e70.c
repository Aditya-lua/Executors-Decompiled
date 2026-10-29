/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d6e70..0x3d6eb8 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d6e70_0 {
    char field_0;
} st_3d6e70_0;

unsigned int sub_3d6e70(long long a0)
{
    unsigned int v4;  // w0
    st_3d6e70_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d6e70_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_3d706c();
    return sub_3d706c(a0) | v4 * 0x100;
}
