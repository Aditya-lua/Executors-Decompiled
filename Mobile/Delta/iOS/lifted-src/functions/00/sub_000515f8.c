/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x515f8..0x516d0 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_515f8_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_515f8_1;

typedef struct st_515f8_0 {
    char field_0;
} st_515f8_0;


unsigned long long sub_515f8(unsigned long long *a0, st_515f8_1 *a1)
{
    unsigned long long v4;  // x22
    unsigned long long v5;  // x23
    unsigned long long v6;  // x8
    unsigned long long v7;  // x8
    unsigned long long v8;  // x24
    unsigned long long v9;  // x21
    st_515f8_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_515f8_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0[2] || sub_51088(a1, a0 + 3) & 1)
        return 0;
    v4 = 0;
    v5 = a0[1] - 1;
    v6 = 13787848793156543929 * a1->field_0;
    v7 = a1->field_8 >> 4 ^ a1->field_8 >> 9 ^ v6 >> 31 ^ v6;
    do
    {
        v8 = v7 & v5;
        v9 = *a0 + v8 * 16;
        if (sub_51088(v9, a1) & 1)
            return v9;
    } while (!sub_51088(v9, a0 + 3) && (v4 += 1, v7 = v4 + v8, v4 <= v5));
    return 0;
}
