/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2c278..0x2c2f8 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2c278_1 {
    struct st_2c278_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
} st_2c278_1;

typedef struct st_2c278_2 {
    unsigned int field_0;
} st_2c278_2;

typedef struct st_2c278_0 {
    char field_0;
} st_2c278_0;


unsigned long long sub_2c278(st_2c278_1 *a0, unsigned int *a1)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // x10
    unsigned long long v4;  // x12
    unsigned long long v5;  // x13
    st_2c278_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_2c278_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a0->field_10)
        return 0;
    v2 = *a1;
    if ((unsigned int)v2 == a0->field_18)
        return 0;
    v3 = 0;
    v4 = a0->field_8 - 1;
    v5 = v4 & v2;
    do
    {
        if (*(int *)&a0->field_0[2 * v5] == (unsigned int)v2)
            return &a0->field_0[2 * v5];
    } while (*(int *)&a0->field_0[2 * v5] != a0->field_18 && (v3 += 1, v5 = v3 + v5 & v4, v3 <= v4));
    return 0;
}
