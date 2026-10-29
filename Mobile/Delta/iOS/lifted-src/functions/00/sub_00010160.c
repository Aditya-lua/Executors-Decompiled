/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10160..0x101e4 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_10160_1 {
    struct st_10160_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_10160_1;

typedef struct st_10160_2 {
    unsigned long long field_0;
} st_10160_2;

typedef struct st_10160_0 {
    char field_0;
} st_10160_0;


unsigned long long sub_10160(st_10160_1 *a0, unsigned long long *a1)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x10
    unsigned long long v4;  // x12
    unsigned long long v5;  // x13
    unsigned long long v6;  // x13
    st_10160_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_10160_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a0->field_10)
        return 0;
    v2 = *a1;
    if (v2 == a0->field_18)
        return 0;
    v3 = 0;
    v4 = a0->field_8 - 1;
    v5 = v2 >> 4 ^ v2 >> 9;
    do
    {
        v6 = v5 & v4;
        if (*(long long *)&a0->field_0[2 * v6] == v2)
            return &a0->field_0[2 * v6];
    } while (*(long long *)&a0->field_0[2 * v6] != a0->field_18 && (v3 += 1, v5 = v3 + v6, v3 <= v4));
    return 0;
}
