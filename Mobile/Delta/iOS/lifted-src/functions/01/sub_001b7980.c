/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b7980..0x1b7a60 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b7980_2 {
    char padding_0[16];
    long long *field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
} st_1b7980_2;

typedef struct st_1b7980_1 {
    struct st_1b7980_0 *field_0;
} st_1b7980_1;

typedef struct st_1b7980_0 {
    char field_0;
} st_1b7980_0;


unsigned long long sub_1b7980(st_1b7980_2 *a0, unsigned long a1)
{
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    st_1b7980_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1b7980_0 *v1;  // [bp-0x38]
    st_1b7980_0 **v2;  // [bp-0x30], Other Possible Types: st_1b7980_1 **, char
    st_1b7980_0 *v3;  // [bp-0x28], Other Possible Types: st_1b7980_1 **
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v6 = sub_1ad9f8();
    if (v6 - (a0->field_20 + a0->field_28) <= 83)
    {
        if (a1 & 1)
            return 0;
        v3 = &v2;
        v2 = &v3;
        v7 = sub_1ad9f8(a0);
        if (42 > v7 - (a0->field_20 + a0->field_28))
            return 0;
    }
    sub_4e14(*(long long *)((char *)a0->field_10 - 8), 42, 8);
    sub_10780(a0, (char *)a0->field_10 - 8);
    return 1;
}
