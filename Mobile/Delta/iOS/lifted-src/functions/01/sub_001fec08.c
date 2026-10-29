/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fec08..0x1fec64 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fec08_3 {
    struct st_1fec08_4 *field_0;
    struct st_1fec08_5 *field_8;
} st_1fec08_3;

typedef struct st_1fec08_2 {
    char field_0;
    char padding_1[7];
    struct st_1fec08_1 *field_8;
} st_1fec08_2;

typedef struct st_1fec08_5 {
    struct st_1fec08_2 *field_0;
} st_1fec08_5;

typedef struct st_1fec08_4 {
    unsigned long long field_0;
} st_1fec08_4;

typedef struct st_1fec08_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_1fec08_1;

typedef struct st_1fec08_0 {
    char field_0;
} st_1fec08_0;


st_1fec08_1 * sub_1fec08(st_1fec08_3 *a0, st_1fec08_2 *a1)
{
    st_1fec08_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1fec08_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1->field_0 != 10)
    {
        return 0;
    }
    else if (!a1->field_8)
    {
        return 0;
    }
    else if (a1->field_8->field_50 != *(long long *)a0->field_0)
    {
        return 0;
    }
    else
    {
        *(st_1fec08_2 **)a0->field_8 = a1;
        return 1;
    }
}
