/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x569d4..0x56a8c (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_569d4_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_569d4_2;

typedef struct st_569d4_1 {
    char padding_0[32];
    struct st_569d4_0 *field_20;
    unsigned long long field_28;
} st_569d4_1;

typedef struct st_569d4_0 {
    char padding_0[49];
    char field_31;
} st_569d4_0;

typedef struct st_569d4_3 {
    char field_0;
} st_569d4_3;

extern char g_f0ce38;

int sub_569d4(long long *a0, st_569d4_1 *a1)
{
    st_569d4_2 *v4;  // x0
    long long v5;  // x21
    st_569d4_3 **v0;  // [bp-0x40], Other Possible Types: char
    st_569d4_3 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    sub_56810(a0[2], &a1->field_20);
    v4 = sub_3f3c0(a0[2], &a1->field_20);
    v4->field_8 = a1->field_28;
    if (g_f0ce38 != 1)
        return 1;
    v5 = a0[4];
    if (!v5)
    {
        return 1;
    }
    else if (a1->field_20->field_31 == 1)
    {
        sub_3aaac(v5, &a1->field_20);
        sub_447fc(v5, &a1->field_20);
        sub_103a8(a0[5], &a1->field_20);
        return 1;
    }
    else
    {
        return 1;
    }
}
