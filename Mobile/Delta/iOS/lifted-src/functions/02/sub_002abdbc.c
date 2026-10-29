/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2abdbc..0x2abe2c (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2abdbc_0 {
    char field_0;
} st_2abdbc_0;

extern long long g_e7f5d0;

int sub_2abdbc(char *a0, unsigned long a1, unsigned long a2, long long a3)
{
    st_2abdbc_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_2abdbc_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    a0[88] = 1;
    if (a0[128] != 1)
        return 0;
    ___cxa_throw(sub_2ae450(___cxa_allocate_exception(32), a3), &g_e7f5d0, 0x2ab438);
}
