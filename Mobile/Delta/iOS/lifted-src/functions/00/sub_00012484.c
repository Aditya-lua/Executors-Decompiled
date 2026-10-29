/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x12484..0x12528 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_12484_1 {
    struct st_12484_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_12484_1;

typedef struct st_12484_2 {
    unsigned long long field_0;
} st_12484_2;

typedef struct st_12484_0 {
    char field_0;
} st_12484_0;


unsigned long long sub_12484(st_12484_1 *a0, unsigned long long *a1)
{
    unsigned long long v2;  // x8
    unsigned long long *v3;  // x9
    unsigned long long v4;  // x11
    unsigned long long v5;  // x10
    unsigned long long v6;  // x13
    unsigned long long idx;  // x13
    unsigned long long v8;  // x14
    st_12484_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_12484_0 *v1;  // [bp-0x8]

    v2 = 0;
    v1 = &v0;
    v0 = &v1;
    v3 = a0->field_0;
    v4 = a0->field_8 - 1;
    v5 = *a1;
    v6 = 13787848793156543929 * v5 ^ 13787848793156543929 * v5 >> 31;
    while (1)
    {
        idx = v6 & v4;
        v8 = idx * 16;
        if (*(long long *)((char *)v3 + v8) == a0->field_18)
        {
            v3[2 * idx] = v5;
            a0->field_10 = a0->field_10 + 1;
            return &v3[2 * idx];
        }
        else if (*(long long *)((char *)v3 + v8) != v5)
        {
            v2 += 1;
            v6 = v2 + idx;
            if (v2 > v4)
                return 0;
        }
        else
        {
            return &v3[2 * idx];
        }
    }
}
