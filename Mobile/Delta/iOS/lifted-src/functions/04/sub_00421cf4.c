/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x421cf4..0x421d44 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_421cf4_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_421cf4_0;

typedef struct st_421cf4_1 {
    char field_0;
} st_421cf4_1;


unsigned long long sub_421cf4(st_421cf4_0 *a0, unsigned int *a1)
{
    unsigned long v4;  // x20
    unsigned long long v5;  // x0
    st_421cf4_1 **v0;  // [bp-0x30], Other Possible Types: char
    st_421cf4_1 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *a1;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_2a6e94(&a0->field_8, a0->field_0);
    a0->field_0 = 6;
    a0->field_8 = v4;
    return v5;
}
