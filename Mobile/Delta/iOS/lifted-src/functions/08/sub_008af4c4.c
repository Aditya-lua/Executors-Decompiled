/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8af4c4..0x8af584 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8af4c4_2 {
    char padding_0[16];
    long long *field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
} st_8af4c4_2;

typedef struct st_8af4c4_1 {
    struct st_8af4c4_0 *field_0;
} st_8af4c4_1;

typedef struct st_8af4c4_0 {
    char field_0;
} st_8af4c4_0;


unsigned long long sub_8af4c4(st_8af4c4_2 *a0, unsigned long a1)
{
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    st_8af4c4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_8af4c4_0 *v1;  // [bp-0x38]
    st_8af4c4_0 **v2;  // [bp-0x30], Other Possible Types: st_8af4c4_1 **, char
    st_8af4c4_0 *v3;  // [bp-0x28], Other Possible Types: st_8af4c4_1 **
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v6 = sub_15390c();
    if (v6 - (a0->field_20 + a0->field_28) <= 127 && (a1 & 1 || !(v3 = &v2, v2 = &v3, v7 = sub_15390c(a0), 64 <= sub_15390c(a0) - (a0->field_20 + a0->field_28))))
        return 0;
    sub_4e14(*(long long *)((char *)a0->field_10 - 8), 64, 8);
    sub_10780(a0, (char *)a0->field_10 - 8);
    return 1;
}
