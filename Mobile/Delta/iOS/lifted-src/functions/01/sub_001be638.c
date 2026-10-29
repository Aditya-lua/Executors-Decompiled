/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1be638..0x1be68c (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1be638_0 {
    char field_0;
} st_1be638_0;


long long sub_1be638(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, long long a4)
{
    st_1be638_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1be638_0 *v1;  // [bp-0x28]
    unsigned long v2;  // [bp-0x20]
    unsigned long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!a2)
        return 1;
    v3 = a1;
    v2 = a2;
    return sub_664e4(a4, &v3, &v2);
}
