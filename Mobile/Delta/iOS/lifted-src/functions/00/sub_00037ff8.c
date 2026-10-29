/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x37ff8..0x380c0 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_37ff8_3 {
    char padding_0[144];
    struct st_37ff8_2 *field_90;
} st_37ff8_3;

typedef struct st_37ff8_1 {
    unsigned long long field_0;
} st_37ff8_1;

typedef struct st_37ff8_2 {
    struct st_37ff8_1 *field_0;
} st_37ff8_2;

typedef struct st_37ff8_0 {
    char field_0;
} st_37ff8_0;

extern unsigned long long g_e65478;

void sub_37ff8(unsigned long long a0, st_37ff8_3 *a1)
{
    unsigned long long v16;  // x24
    unsigned long long v17;  // x23
    unsigned long long v18;  // x22
    unsigned long long v19;  // x21
    unsigned long long v20;  // x20
    unsigned long long v21;  // x19
    unsigned long long v22;  // x30
    st_37ff8_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_37ff8_0 *v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x68]
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = v19;
    v11 = v20;
    v12 = v21;
    v13 = &v15;
    v14 = v22;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_e65478;
    v3 = a0;
    v5 = 0;
    v6 = 0;
    v4 = 0;
    (*(long long *)*(long long *)a1->field_90)();
}
