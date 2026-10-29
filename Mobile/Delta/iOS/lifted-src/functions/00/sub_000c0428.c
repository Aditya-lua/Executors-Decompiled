/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0428..0xc0504 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0428_0 {
    char field_0;
} st_c0428_0;


unsigned long long sub_c0428(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7)
{
    st_c0428_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_c0428_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a2)
    {
        return 0xffffffffffffffba;
    }
    else if (!a4)
    {
        return 0xffffffffffffffec;
    }
    else if (sub_bf30c(a2, a4))
    {
        return sub_c020c(a0, a1, a2, a3, a4, a5, a6, a7);
    }
    else
    {
        return sub_c3dbc(a0, a1, a2, a3, a4, a5, a6, a7);
    }
}
