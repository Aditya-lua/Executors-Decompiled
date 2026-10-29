/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95248..0x952e0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95248_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[28];
    unsigned int field_2c;
} st_95248_1;

typedef struct st_95248_0 {
    char field_0;
} st_95248_0;


long long sub_95248(st_95248_1 *a0, long long a1, long long a2, long long a3)
{
    st_95248_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_95248_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_8 + a0->field_2c <= (unsigned long long)a1)
    {
        sub_9594c();
        return sub_adb9c(a0, a1, a2, a3, 4, 1);
    }
    return 0;
}
