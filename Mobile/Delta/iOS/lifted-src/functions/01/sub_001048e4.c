/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1048e4..0x10492c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1048e4_2 {
    char padding_0[8];
    struct st_1048e4_1 *field_8;
} st_1048e4_2;

typedef struct st_1048e4_1 {
    unsigned long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_1048e4_1;

typedef struct st_1048e4_0 {
    char field_0;
} st_1048e4_0;


long long sub_1048e4(unsigned long long *a0, st_1048e4_2 *a1)
{
    st_1048e4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1048e4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1->field_8->field_c != 8)
        return 0;
    return a1->field_8->field_0 == *a0;
}
