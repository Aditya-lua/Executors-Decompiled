/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3b040..0x3b0cc (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3b040_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_3b040_2 *field_10;
    unsigned long long field_18;
} st_3b040_1;

typedef struct st_3b040_2 {
    unsigned long long field_0;
} st_3b040_2;

typedef struct st_3b040_0 {
    char field_0;
} st_3b040_0;


unsigned long long * sub_3b040(st_3b040_1 *a0, unsigned long long *a1)
{
    unsigned long long v2;  // x8
    unsigned long long *v3;  // x10
    unsigned long long *v4;  // x12
    unsigned long long v5;  // x14
    unsigned long long v6;  // x14
    unsigned long long *v7;  // x0
    st_3b040_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_3b040_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a0->field_10)
        return 0;
    v2 = *a1;
    if (v2 != a0->field_18)
    {
        v3 = 0;
        v4 = a0->field_8 - 1;
        v5 = 13787848793156543929 * v2 ^ 13787848793156543929 * v2 >> 31;
        do
        {
            v6 = v5 & v4;
            v7 = a0->field_0 + 56 * v6;
            if (*v7 == v2)
                return v7;
        } while (*v7 != a0->field_18 && (v3 = (char *)v3 + 1, v5 = (char *)v3 + v6, v3 <= v4));
    }
    return 0;
}
