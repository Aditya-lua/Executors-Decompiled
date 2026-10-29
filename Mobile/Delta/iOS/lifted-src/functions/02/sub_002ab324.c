/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ab324..0x2ab3b4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ab324_0 {
    char field_0;
} st_2ab324_0;


long long sub_2ab324(long long a0)
{
    st_2ab324_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_2ab324_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (sub_2aa6a8() != 239)
    {
        sub_2aeaa0(a0);
        return 1;
    }
    else if (sub_2aa6a8(a0) == 0xbb)
    {
        return sub_2aa6a8(a0) == 191;
    }
    else
    {
        return 0;
    }
}
