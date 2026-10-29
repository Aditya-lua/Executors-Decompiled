/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4da88..0x4db18 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4da88_1 {
    char padding_0[32];
    struct st_4da88_2 *field_20;
    unsigned long long field_28;
    struct st_4da88_2 *field_30;
    unsigned long long field_38;
} st_4da88_1;

typedef struct st_4da88_2 {
    long long field_0;
} st_4da88_2;

typedef struct st_4da88_0 {
    char field_0;
} st_4da88_0;


long long sub_4da88(long long a0, st_4da88_1 *a1)
{
    long long *v4;  // x21
    unsigned long long i;  // x22
    unsigned long long v6;  // x22
    unsigned long long *v7;  // x21
    long long *v8;  // x20
    unsigned long long j;  // x21
    unsigned long long v10;  // x21
    unsigned long long *v11;  // x20
    st_4da88_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_4da88_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_38)
    {
        v4 = a1->field_30;
        i = a1->field_38 * 8;
        do
        {
            v6 = i;
            v7 = v4 + 1;
            sub_4a078(a0, *v4);
            i = v6 - 8;
            v4 = v7;
        } while (i);
    }
    if (!a1->field_28)
        return 1;
    v8 = a1->field_20;
    j = a1->field_28 * 8;
    do
    {
        v10 = j;
        v11 = v8 + 1;
        sub_49fdc(a0, *v8, 1);
        j = v10 - 8;
        v8 = v11;
    } while (j);
    return 1;
}
