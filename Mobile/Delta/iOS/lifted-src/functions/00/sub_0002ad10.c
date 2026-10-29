/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ad10..0x2ad6c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ad10_0 {
    char field_0;
} st_2ad10_0;

extern char _NSHomeDirectory;

long long sub_2ad10(long long a0, unsigned int a1, unsigned int a2, unsigned int a3, unsigned int a4)
{
    st_2ad10_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_2ad10_0 *v1;  // [bp-0x30]
    unsigned int v2;  // [bp-0x24]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = a1 | a2 * 0x100 | a3 * 0x10000 | a4 * &_NSHomeDirectory;
    sub_a390(a0 + 48, &v2);
    return sub_a390(a0 + 72, a0 + 648);
}
