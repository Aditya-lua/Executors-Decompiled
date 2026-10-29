/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4c958..0x4c9bc (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4c958_1 {
    char padding_0[32];
    struct st_4c958_2 *field_20;
    unsigned long long field_28;
} st_4c958_1;

typedef struct st_4c958_2 {
    long long field_0;
} st_4c958_2;

typedef struct st_4c958_0 {
    char field_0;
} st_4c958_0;


int sub_4c958(long long a0, st_4c958_1 *a1)
{
    long long *v4;  // x20
    unsigned long long i;  // x21
    unsigned long long v6;  // x21
    unsigned long long *v7;  // x20
    st_4c958_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_4c958_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a1->field_28)
        return 1;
    v4 = a1->field_20;
    i = a1->field_28 * 8;
    do
    {
        v6 = i;
        v7 = v4 + 1;
        sub_4a078(a0, *v4);
        i = v6 - 8;
        v4 = v7;
    } while (i);
    return 1;
}
