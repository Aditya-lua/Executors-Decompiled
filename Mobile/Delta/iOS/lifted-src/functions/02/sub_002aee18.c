/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aee18..0x2aee88 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aee18_0 {
    char field_0;
} st_2aee18_0;

extern long long g_e7f660;

int sub_2aee18(char *a0, unsigned long a1, unsigned long a2, long long a3)
{
    st_2aee18_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_2aee18_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    a0[40] = 1;
    if (a0[41] != 1)
        return 0;
    ___cxa_throw(sub_2abeb8(___cxa_allocate_exception(40), a3), &g_e7f660, 0x2ae354);
}
