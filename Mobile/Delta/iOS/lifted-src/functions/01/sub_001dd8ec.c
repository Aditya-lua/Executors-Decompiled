/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1dd8ec..0x1e08dc (12272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1dd8ec_0 {
    char field_0;
} st_1dd8ec_0;

typedef struct st_1dd8ec_2 {
    unsigned long long field_0;
} st_1dd8ec_2;

typedef struct st_1dd8ec_1 {
    char padding_0[48];
    struct st_1dd8ec_2 *field_30;
} st_1dd8ec_1;

extern st_1dd8ec_1 *g_f0d3d8;
extern char g_10002b0;

void sub_1dd8ec(unsigned long a0)
{
    unsigned long long v15;  // x24
    unsigned long long v16;  // x23
    unsigned long long v17;  // x22
    unsigned long long v18;  // x21
    unsigned long long v19;  // x20
    unsigned long long v20;  // x19
    unsigned long long v21;  // x30
    st_1dd8ec_0 **v0;  // [bp-0xd0], Other Possible Types: char
    st_1dd8ec_0 *v1;  // [bp-0xc8]
    uint128_t v2;  // [bp-0xc0], Other Possible Types: uint128_t
    uint128_t v3;  // [bp-0xa0]
    uint128_t v4;  // [bp-0x80]
    unsigned long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = v19;
    v11 = v20;
    v12 = &v14;
    v13 = v21;
    v5 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v2 = CONCAT(9833478076077649007, 1471524717549481386);
    v4 = CONCAT(3064531296628809586, 11610444449354691342);
    v3 = CONCAT(11741146803621573496, 15790190029780627911);
    v2 ^= v4;
    v2 ^= v3;
    g_f0d3d8->field_30();
}
