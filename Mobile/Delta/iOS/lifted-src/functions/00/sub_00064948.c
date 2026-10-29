/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x64948..0x64a74 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_64948_3 {
    char padding_0[128];
    struct st_64948_4 *field_80;
} st_64948_3;

typedef struct st_64948_1 {
    char padding_0[48];
    struct st_64948_2 *field_30;
} st_64948_1;

typedef struct st_64948_2 {
    unsigned long long field_0;
} st_64948_2;

typedef struct st_64948_4 {
    struct st_64948_1 *field_0;
} st_64948_4;

typedef struct st_64948_0 {
    char field_0;
} st_64948_0;


void sub_64948(st_64948_3 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    st_64948_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_64948_0 *v1;  // [bp-0x48]
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
    if (!a0->field_80)
        sub_64d58(0);
    (*(long long *)(*(long long *)a0->field_80 + 48))();
}
