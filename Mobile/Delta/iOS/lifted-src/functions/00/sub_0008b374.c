/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b374..0x8b3b8 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b374_0 {
    char field_0;
} st_8b374_0;


void sub_8b374(unsigned long a0, unsigned long a1, unsigned long a2, unsigned int a3)
{
    st_8b374_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_8b374_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a3 != 1)
    {
        sub_8b010();
        return;
    }
    sub_8ad88();
    return;
}
