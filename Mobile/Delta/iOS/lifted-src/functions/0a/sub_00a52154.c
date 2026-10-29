/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa52154..0xa522e8 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a52154_0 {
    char padding_0[160];
    struct st_a52154_1 *field_a0;
} st_a52154_0;

typedef struct st_a52154_1 {
    unsigned long long field_0;
} st_a52154_1;

extern char g_10002b0;

void sub_a52154(st_a52154_0 **a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6)
{
    unsigned long long v18;  // x26
    unsigned long long v19;  // x25
    unsigned long long v20;  // x24
    unsigned long long v21;  // x23
    unsigned long long v22;  // x22
    unsigned long long v23;  // x21
    unsigned long long v24;  // x20
    unsigned long long v25;  // x19
    unsigned long long v26;  // x30
    unsigned long v0;  // [bp-0xb8]
    uint128_t v1;  // [bp-0xb0]
    uint128_t v2;  // [bp-0xa0]
    uint128_t v3;  // [bp-0x90]
    uint128_t v4;  // [bp-0x80]
    uint128_t v5;  // [bp-0x70]
    unsigned long v6;  // [bp-0x58]
    unsigned long long v7;  // [bp-0x50]
    unsigned long long v8;  // [bp-0x48]
    unsigned long long v9;  // [bp-0x40]
    unsigned long long v10;  // [bp-0x38]
    unsigned long long v11;  // [bp-0x30]
    unsigned long long v12;  // [bp-0x28]
    unsigned long long v13;  // [bp-0x20]
    unsigned long long v14;  // [bp-0x18]
    char *v15;  // [bp-0x10]
    unsigned long long v16;  // [bp-0x8]
    char v17;  // [bp+0x0]

    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = v24;
    v14 = v25;
    v15 = &v17;
    v16 = v26;
    v6 = *(long long *)&g_10002b0;
    v0 = 0;
    v4 = 0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    v1 = 0;
    sub_a70ed8("max_request", &v0);
    *a0->field_a0();
}
