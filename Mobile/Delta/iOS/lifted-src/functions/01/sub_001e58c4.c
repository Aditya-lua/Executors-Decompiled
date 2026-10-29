/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e58c4..0x1e594c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e58c4_1 {
    char padding_0[24];
    unsigned long long field_18;
} st_1e58c4_1;

typedef struct st_1e58c4_0 {
    char field_0;
} st_1e58c4_0;


long long sub_1e58c4(st_1e58c4_1 *a0, unsigned long a1, char *a2)
{
    st_1e58c4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1e58c4_0 *v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    sub_f1438();
    a0->field_18 = a0->field_18 - 1;
    if (*a2)
        return a1;
    v2 = a1 + 16;
    v3 = a2 + 1;
    sub_1da71c(&v2);
    return v2;
}
