/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bf1c8..0x1bf204 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bf1c8_1 {
    char padding_0[16];
    struct st_1bf1c8_2 *field_10;
} st_1bf1c8_1;

typedef struct st_1bf1c8_2 {
    unsigned int field_0;
} st_1bf1c8_2;

typedef struct st_1bf1c8_0 {
    char field_0;
} st_1bf1c8_0;


unsigned long long sub_1bf1c8(st_1bf1c8_1 *a0, unsigned int a1, unsigned long long a2)
{
    st_1bf1c8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1bf1c8_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a2 >> 31 & 1)
        return 0;
    return (*(int *)&a0->field_10[(unsigned int)a2] & a1) != 0;
}
