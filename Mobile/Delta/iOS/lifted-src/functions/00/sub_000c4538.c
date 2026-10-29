/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4538..0xc4598 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4538_1 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_c4538_2 *field_10;
    char padding_18[8];
    struct st_c4538_2 *field_20;
} st_c4538_1;

typedef struct st_c4538_2 {
    unsigned long long field_0;
} st_c4538_2;

typedef struct st_c4538_0 {
    char field_0;
} st_c4538_0;


int sub_c4538(st_c4538_1 *a0)
{
    unsigned long v2;  // x10
    unsigned long long *v3;  // x9
    st_c4538_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_c4538_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a0->field_20 <= a0->field_10)
    {
        v2 = a0->field_8;
        v3 = (char *)a0->field_10 - (v2 >> 3);
        a0->field_10 = v3;
        a0->field_8 = (unsigned int)v2 & 7;
        a0->field_0 = *v3;
        return 0;
    }
    return 3;
}
