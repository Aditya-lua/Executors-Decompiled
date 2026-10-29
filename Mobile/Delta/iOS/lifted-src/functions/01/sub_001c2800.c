/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c2800..0x1c2910 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c2800_2 {
    struct st_1c2800_3 *field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_1c2800_2;

typedef struct st_1c2800_0 {
    char padding_0[40];
    struct st_1c2800_1 *field_28;
} st_1c2800_0;

typedef struct st_1c2800_1 {
    unsigned long long field_0;
} st_1c2800_1;

typedef struct st_1c2800_3 {
    struct st_1c2800_0 *field_0;
} st_1c2800_3;

typedef struct st_1c2800_4 {
    char field_0;
} st_1c2800_4;


int sub_1c2800(st_1c2800_2 *a0)
{
    st_1c2800_4 **v0;  // [bp-0x48], Other Possible Types: char
    st_1c2800_4 *v1;  // [bp-0x40]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    a0->field_18 = 0;
    sub_30d84(a0 + 1);
    if (sub_1af75c(a0) > 0x7fff)
        return 0;
    (*(long long *)(*(long long *)a0->field_0 + 40))();
}
