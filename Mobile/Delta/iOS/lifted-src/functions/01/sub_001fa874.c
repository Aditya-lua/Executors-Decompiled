/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fa874..0x1fa8d0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fa874_1 {
    struct st_1fa874_0 *field_0;
    unsigned long long field_8;
} st_1fa874_1;

typedef struct st_1fa874_0 {
    char field_0;
} st_1fa874_0;


st_1fa874_1 * sub_1fa874(st_1fa874_1 *a0)
{
    unsigned long long v2;  // x9
    unsigned long long i;  // x8
    unsigned long long v4;  // x10
    char *v5;  // x11
    char v6;  // x13
    char *v7;  // x12
    st_1fa874_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1fa874_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_8;
    if (a0->field_8 < 2)
        return a0;
    i = 0;
    v4 = 0xffffffffffffffff;
    do
    {
        v5 = a0->field_0;
        v6 = v5[i];
        v7 = &v5[a0->field_8];
        v5[i] = v7[v4];
        v7[v4] = v6;
        i += 1;
        v4 -= 1;
    } while (v2 >> 1 != i);
    return a0;
}
