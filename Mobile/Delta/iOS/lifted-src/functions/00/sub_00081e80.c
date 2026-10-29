/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x81e80..0x81f38 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_81e80_0 {
    char field_0;
} st_81e80_0;


unsigned int * sub_81e80(unsigned int *a0, unsigned long long *a1, long long a2, unsigned long a3, unsigned int a4)
{
    unsigned long long v4;  // x22
    unsigned int *v5;  // x0
    unsigned int v6;  // w8
    st_81e80_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_81e80_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a4 - a0[2] < 3670016001)
        return a0;
    v4 = sub_7f400();
    a1[4] = a1[2];
    sub_7ef34(a0, a2, v4);
    v5 = sub_7fc20(a1);
    if (a0[11] < (unsigned int)v4)
        v6 = 0;
    else
        v6 = a0[11] - v4;
    a0[10] = 0;
    a0[11] = v6;
    *(unsigned long long *)&a0[62] = 0;
    return v5;
}
