/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x73430..0x73560 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_73430_3 {
    char padding_0[56];
    unsigned long long field_38;
    unsigned long long field_40;
    char padding_48[8];
    unsigned long long field_50;
    char padding_58[120];
    struct st_73430_4 *field_d0;
} st_73430_3;

typedef struct st_73430_1 {
    char padding_0[48];
    struct st_73430_2 *field_30;
} st_73430_1;

typedef struct st_73430_2 {
    unsigned long long field_0;
} st_73430_2;

typedef struct st_73430_4 {
    struct st_73430_1 *field_0;
} st_73430_4;

typedef struct st_73430_0 {
    char field_0;
} st_73430_0;


int sub_73430(st_73430_3 *a0)
{
    st_73430_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_73430_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_50)
    {
        if (a0->field_40 - a0->field_38 >= a0->field_50)
            return 1;
    }
    else
    {
        if (a0->field_40 - a0->field_38 > 0x7fff)
            return 1;
    }
    (*(long long *)(*(long long *)a0->field_d0 + 48))();
}
