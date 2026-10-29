/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa34dc4..0xa34e98 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a34dc4_0 {
    char padding_0[8];
    long long field_8;
} st_a34dc4_0;

typedef struct st_a34dc4_2 {
    unsigned long long field_0;
} st_a34dc4_2;

typedef struct st_a34dc4_1 {
    char padding_0[80];
    struct st_a34dc4_2 *field_50;
} st_a34dc4_1;


unsigned long long sub_a34dc4(unsigned long long a0, long long a1, unsigned long a2, st_a34dc4_0 *a3)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x0
    st_a34dc4_1 *v17;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a3->field_8)
        return a0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = sub_ad69e4(a1);
    if ((int)v16 < 1)
        return v16;
    v17 = sub_ad69f8(a1, 0);
    v17->field_50();
}
