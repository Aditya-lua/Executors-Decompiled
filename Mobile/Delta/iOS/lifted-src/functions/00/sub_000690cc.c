/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x690cc..0x69140 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_690cc_0 {
    char field_0;
} st_690cc_0;

extern long long g_f011f0;

long long sub_690cc(long long a0)
{
    st_690cc_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_690cc_0 *v1;  // [bp-0x38]
    st_690cc_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_690cc_0 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (!sub_6b08(a0 + 72))
        return 1;
    return sub_9fd8(a0 + 72, g_f011f0);
}
