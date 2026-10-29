/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1eebe8..0x1eec58 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1eebe8_1 {
    long long field_0;
    unsigned long long field_8;
} st_1eebe8_1;

typedef struct st_1eebe8_0 {
    char field_0;
} st_1eebe8_0;


unsigned long long * sub_1eebe8(unsigned long long *a0, st_1eebe8_1 *a1)
{
    unsigned long long v4;  // x21
    st_1eebe8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1eebe8_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1->field_8;
    if (!v4)
        return a0;
    sub_1fb5d8(a0, a0[1] + v4);
    _memmove(*a0 + a0[1] * 8, a1->field_0, v4 * 8);
    return a0;
}
