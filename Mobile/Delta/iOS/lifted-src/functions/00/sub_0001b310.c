/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b310..0x1b378 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b310_0 {
    char field_0;
} st_1b310_0;


int sub_1b310(long long a0, unsigned int a1)
{
    st_1b310_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1b310_0 *v1;  // [bp-0x48]
    unsigned int v2;  // [bp-0x40]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    sub_1b378();
    sub_b1a4(a0 + 96);
    if (v2 != a1)
        return 0;
    sub_f8d0(a0);
    sub_f8d0(a0);
    return 0;
}
