/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4d86c..0x4d8f0 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4d86c_1 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
} st_4d86c_1;

typedef struct st_4d86c_2 {
    char padding_0[32];
    struct st_4d86c_1 *field_20;
    unsigned long long field_28;
} st_4d86c_2;

typedef struct st_4d86c_0 {
    char field_0;
} st_4d86c_0;


int sub_4d86c(long long a0, st_4d86c_2 *a1)
{
    unsigned long long *v4;  // x20
    unsigned long long v5;  // x21
    unsigned long long v6;  // x21
    unsigned long long *v7;  // x20
    st_4d86c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_4d86c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a1->field_28)
        return 1;
    v4 = &a1->field_20->field_10;
    v5 = a1->field_28 * 24;
    do
    {
        v6 = v5;
        if (*(long long *)((char *)v4 - 8))
            sub_4a078(a0);
    } while ((v7 = v4 + 3, sub_4a078(a0, *v4), v5 = v6 - 24, v4 += 3, v6 != 24));
    return 1;
}
