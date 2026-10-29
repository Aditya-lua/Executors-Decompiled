/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x66170..0x66258 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_66170_1 {
    char padding_0[24];
    unsigned long long field_18;
} st_66170_1;

typedef struct st_66170_2 {
    char padding_0[48];
    struct st_66170_3 *field_30;
} st_66170_2;

typedef struct st_66170_3 {
    unsigned long long field_0;
} st_66170_3;

typedef struct st_66170_0 {
    char field_0;
} st_66170_0;


long long sub_66170(st_66170_2 **a0, unsigned long a1, st_66170_1 *a2)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    st_66170_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_66170_0 *v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = &v10;
    v9 = v17;
    v1 = &v0;
    v0 = &v1;
    if (a2->field_18 && sub_60b58(a2) & 1)
        return sub_66238();
    *a0->field_30();
}
