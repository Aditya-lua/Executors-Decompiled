/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa05e24..0xa06058 (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a05e24_0 {
    char padding_0[56];
    char field_38;
} st_a05e24_0;

extern char g_10002b0;

unsigned long long sub_a05e24(st_a05e24_0 *a0, uint128_t *a1)
{
    char v31;  // x0
    unsigned long long v32;  // x0
    uint128_t v0;  // [bp-0x2c0]
    uint128_t v1;  // [bp-0x2b0]
    uint128_t v2;  // [bp-0x2a0]
    uint128_t v3;  // [bp-0x290]
    uint128_t v4;  // [bp-0x280]
    uint128_t v5;  // [bp-0x270]
    uint128_t v6;  // [bp-0x260]
    uint128_t v7;  // [bp-0x250]
    uint128_t v8;  // [bp-0x240]
    uint128_t v9;  // [bp-0x230]
    uint128_t v10;  // [bp-0x220]
    uint128_t v11;  // [bp-0x210]
    uint128_t v12;  // [bp-0x200]
    uint128_t v13;  // [bp-0x1f0]
    uint128_t v14;  // [bp-0x1e0]
    uint128_t v15;  // [bp-0x1d0]
    char v16;  // [bp-0x1c0]
    uint128_t v17;  // [bp-0x180], Other Possible Types: char
    uint128_t v18;  // [bp-0x170]
    uint128_t v19;  // [bp-0x160]
    uint128_t v20;  // [bp-0x150]
    char v21;  // [bp-0x140]
    char v22;  // [bp-0x100]
    uint128_t v23;  // [bp-0xc0]
    uint128_t v24;  // [bp-0xb0]
    uint128_t v25;  // [bp-0xa0]
    uint128_t v26;  // [bp-0x90]
    char v27;  // [bp-0x80]
    unsigned long v28;  // [bp-0x38]
    char *v29;  // [bp-0x10]
    char v30;  // [bp+0x0]

    v29 = &v30;
    v28 = *(long long *)&g_10002b0;
    v12 = a1[12];
    v13 = a1[13];
    v14 = a1[14];
    v15 = a1[15];
    v8 = a1[8];
    v9 = a1[9];
    v10 = a1[10];
    v11 = a1[11];
    v4 = a1[4];
    v5 = a1[5];
    v6 = a1[6];
    v7 = a1[7];
    v0 = *a1;
    v1 = a1[1];
    v2 = a1[2];
    v3 = a1[3];
    sub_a04c64(&v22, &v0);
    sub_a04c64(&v16, &v4);
    sub_a088cc(&v27, &v22, &v16);
    sub_a088cc(&v17, &v4, &v0);
    sub_a04c64(&v21, &v17);
    sub_a08d40(&v21, &v21, &v27);
    sub_a08d40(&v17, &v16, &v22);
    sub_a04c64(&v22, &v8);
    sub_a088cc(&v16, &v22, &v22);
    sub_a08d40(&v16, &v16, &v17);
    sub_a04850(&v22, &v16, &v21);
    sub_a04850(&v21, &v17, &v27);
    sub_a04850(&v17, &v27, &v16);
    sub_a66ec0(&v27, 64);
    sub_a04c64(&v27, &v17);
    sub_a08f10(&v23, &v27);
    sub_a04c64(&v27, &v23);
    sub_a04850(&v23, &v27, &v17);
    v17 = v23;
    v18 = v24;
    v19 = v25;
    v20 = v26;
    sub_a04850(&v16, &v22, &v17);
    sub_a04850(&v22, &v21, &v17);
    a0->field_38 = 0;
    sub_a08514(a0, &v22, 1);
    v31 = sub_a089ec(&v16);
    a0->field_38 = v31 & 128 | a0->field_38;
    sub_a66ec0(&v22, 64);
    sub_a66ec0(&v21, 64);
    sub_a66ec0(&v17, 64);
    sub_a66ec0(&v16, 64);
    v32 = sub_a66ec0(&v0, 0x100);
    if (*(long long *)&g_10002b0 == v28)
        return v32;
    ___stack_chk_fail();
}
