/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2adf68..0x2adfbc (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2adf68_0 {
    char field_0;
} st_2adf68_0;


int sub_2adf68(void)
{
    st_2adf68_0 **v4;  // x0
    st_2adf68_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_2adf68_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = _localeconv();
    if (!*v4)
        return 46;
    return *(char *)*v4;
}
