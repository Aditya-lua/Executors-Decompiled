/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c6e28..0x3c6e98 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c6e28_0 {
    char field_0;
} st_3c6e28_0;

typedef struct st_3c6e28_1 {
    unsigned long long field_0;
    unsigned int field_8;
} st_3c6e28_1;


unsigned long long sub_3c6e28(unsigned long long a0, st_3c6e28_1 *a1)
{
    st_3c6e28_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_3c6e28_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 && a1->field_0 == 5140098453230081348 && a1->field_8 == 1)
    {
        a1->field_0 = 4919409929716253012;
        a0 = sub_60b78(a1 + 2, a1 + 2);
    }
    return a0;
}
