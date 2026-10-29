/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b4080..0x1b40d4 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b4080_0 {
    char field_0;
} st_1b4080_0;


long long sub_1b4080(unsigned long long *a0, long long a1)
{
    unsigned long long v5;  // x30
    long long v6;  // x8
    st_1b4080_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1b4080_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    if (a1 >= 0)
    {
        v6 = a0[2] - *a0;
        if ((unsigned long long)a1 < (unsigned long long)v6)
            a1 = v6;
        if ((unsigned long long)v6 >= 0x7ffffffffffffffe)
            return 0x7fffffffffffffff;
        return a1;
    }
    sub_ca34();
}
