/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6e90c..0x6e978 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6e90c_0 {
    char field_0;
} st_6e90c_0;


unsigned long long sub_6e90c(unsigned long a0, long long a1, long long a2)
{
    st_6e90c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_6e90c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!(sub_69308(a1, a2) & 1))
        return sub_69308(a2, a1) ^ 1;
    return 0;
}
