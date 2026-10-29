/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb42020..0xb420dc (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b42020_0 {
    char padding_0[72];
    struct st_b42020_1 *field_48;
} st_b42020_0;

typedef struct st_b42020_1 {
    unsigned long long field_0;
} st_b42020_1;

extern char g_10002b0;

void sub_b42020(unsigned int a0, unsigned int a1, long long a2)
{
    unsigned long long v22;  // x20
    unsigned long long v23;  // x19
    unsigned long long v24;  // x30
    st_b42020_0 *v25;  // x0
    uint128_t v0;  // [bp-0xd0]
    uint128_t v1;  // [bp-0xc0]
    unsigned long long v2;  // [bp-0xb0]
    unsigned int v3;  // [bp-0xa8]
    unsigned int v4;  // [bp-0xa4]
    uint128_t v5;  // [bp-0xa0]
    uint128_t v6;  // [bp-0x90]
    uint128_t v7;  // [bp-0x80]
    uint128_t v8;  // [bp-0x78]
    uint128_t v9;  // [bp-0x70]
    uint128_t v10;  // [bp-0x68]
    uint128_t v11;  // [bp-0x60]
    unsigned long long v12;  // [bp-0x58]
    uint128_t v13;  // [bp-0x50]
    uint128_t v14;  // [bp-0x40]
    uint128_t v15;  // [bp-0x30]
    unsigned long v16;  // [bp-0x28]
    unsigned long long v17;  // [bp-0x20]
    unsigned long long v18;  // [bp-0x18]
    char *v19;  // [bp-0x10]
    unsigned long long v20;  // [bp-0x8]
    char v21;  // [bp+0x0]

    v17 = v22;
    v18 = v23;
    v19 = &v21;
    v20 = v24;
    v16 = *(long long *)&g_10002b0;
    v3 = a1;
    v4 = a0;
    v25 = sub_c4c40(a2);
    v15 = 0;
    v13 = 0;
    v14 = 0;
    v9 = 0;
    v11 = 0;
    v6 = 0;
    v7 = 0;
    v5 = 0;
    sub_a6ffac("potential", &v4);
    sub_a6ffac("iteration", &v3);
    v8 = v0;
    v10 = v1;
    v12 = v2;
    v25->field_48();
}
