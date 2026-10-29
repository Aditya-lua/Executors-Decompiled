/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x561d8..0x56258 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_561d8_3 {
    char padding_0[16];
    long long field_10;
} st_561d8_3;

typedef struct st_561d8_2 {
    unsigned long long field_0;
} st_561d8_2;

typedef struct st_561d8_1 {
    char padding_0[88];
    struct st_561d8_2 *field_58;
    unsigned long long field_60;
} st_561d8_1;

typedef struct st_561d8_0 {
    char field_0;
} st_561d8_0;


int sub_561d8(st_561d8_3 *a0, st_561d8_1 *a1)
{
    unsigned long long *v5;  // x21
    unsigned long long i;  // x22
    unsigned long long v7;  // x22
    unsigned long long *v8;  // x21
    st_561d8_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_561d8_0 *v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (!a1->field_60)
        return 1;
    v5 = a1->field_58;
    i = a1->field_60 * 8;
    do
    {
        v7 = i;
        v8 = v5 + 1;
        v2 = *v5;
        sub_56810(a0->field_10, &v2);
        *(unsigned long long *)(sub_3f3c0(a0->field_10, &v2) + 8) = 0;
        i = v7 - 8;
        v5 = v8;
    } while (i);
    return 1;
}
