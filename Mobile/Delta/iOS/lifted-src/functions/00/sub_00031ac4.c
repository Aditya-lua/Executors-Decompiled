/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x31ac4..0x31b78 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_31ac4_2 {
    int field_0;
} st_31ac4_2;

typedef struct st_31ac4_1 {
    int field_0;
    char padding_4[4];
    struct st_31ac4_2 *field_8;
    struct st_31ac4_2 *field_10;
    char padding_18[8];
    struct st_31ac4_2 *field_20;
    struct st_31ac4_2 *field_28;
} st_31ac4_1;

typedef struct st_31ac4_0 {
    char field_0;
} st_31ac4_0;


unsigned long long sub_31ac4(unsigned long a0, long long a1, st_31ac4_1 *a2)
{
    unsigned long long v4;  // x0
    int *i;  // x21
    unsigned int *v6;  // x21
    int *j;  // x21
    unsigned int *v8;  // x21
    unsigned long long v9;  // x0
    st_31ac4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_31ac4_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    sub_30a74(a1, a2->field_0);
    sub_30a74(a1, (long long)(a2->field_10 - a2->field_8) >> 2);
    v4 = sub_30a74(a1, (long long)(a2->field_28 - a2->field_20) >> 2);
    i = a2->field_8;
    if (a2->field_8 != a2->field_10)
    {
        do
        {
            v6 = i + 1;
            v4 = sub_30a74(a1, *i);
            i = v6;
        } while (i != a2->field_10);
    }
    j = a2->field_20;
    if (a2->field_20 == a2->field_28)
        return v4;
    do
    {
        v8 = j + 1;
        v9 = sub_30a74(a1, *j);
        j = v8;
    } while (j != a2->field_28);
    return v9;
}
