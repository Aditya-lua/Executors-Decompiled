/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x273b0..0x2745c (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_273b0_1 {
    char padding_0[8];
    long long field_8;
} st_273b0_1;

typedef struct st_273b0_0 {
    char field_0;
} st_273b0_0;


long long sub_273b0(st_273b0_1 *a0, long long a1, long long a2, char a3)
{
    st_273b0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_273b0_0 *v1;  // [bp-0x48]
    st_273b0_1 *v2;  // [bp-0x40]
    char v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    v3 = 0;
    if (a3)
    {
        sub_27204();
        a0->field_8 = sub_272dc(a0, a1, a2, a0->field_8);
    }
    v3 = 1;
    return sub_2717c(&v2);
}
