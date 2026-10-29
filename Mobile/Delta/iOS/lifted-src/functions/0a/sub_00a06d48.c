/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa06d48..0xa06ed0 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a06d48_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
} st_a06d48_0;

extern long long g_f086b8;
extern char g_10002b0;

unsigned long long sub_a06d48(long long a0, st_a06d48_0 *a1)
{
    unsigned long long v46;  // x0
    uint128_t v0;  // [bp-0x340]
    uint128_t v1;  // [bp-0x330]
    uint128_t v2;  // [bp-0x320]
    uint128_t v3;  // [bp-0x310]
    uint128_t v4;  // [bp-0x300]
    uint128_t v5;  // [bp-0x2f0]
    uint128_t v6;  // [bp-0x2e0]
    uint128_t v7;  // [bp-0x2d0]
    uint128_t v8;  // [bp-0x2c0]
    uint128_t v9;  // [bp-0x2b0]
    uint128_t v10;  // [bp-0x2a0]
    uint128_t v11;  // [bp-0x290]
    uint128_t v12;  // [bp-0x280]
    uint128_t v13;  // [bp-0x270]
    uint128_t v14;  // [bp-0x260]
    uint128_t v15;  // [bp-0x250]
    char v16;  // [bp-0x238]
    uint128_t v17;  // [bp-0x200], Other Possible Types: char
    uint128_t v18;  // [bp-0x1f0]
    uint128_t v19;  // [bp-0x1e0]
    unsigned long v20;  // [bp-0x1d0]
    char v21;  // [bp-0x1c9]
    uint128_t v22;  // [bp-0x1c0]
    uint128_t v23;  // [bp-0x1b0]
    uint128_t v24;  // [bp-0x1a0]
    uint128_t v25;  // [bp-0x190]
    uint128_t v26;  // [bp-0x180]
    uint128_t v27;  // [bp-0x170]
    uint128_t v28;  // [bp-0x160]
    uint128_t v29;  // [bp-0x150]
    uint128_t v30;  // [bp-0x140]
    uint128_t v31;  // [bp-0x130]
    uint128_t v32;  // [bp-0x120]
    uint128_t v33;  // [bp-0x110]
    uint128_t v34;  // [bp-0x100], Other Possible Types: uint128_t
    uint128_t v35;  // [bp-0xf0]
    uint128_t v36;  // [bp-0xe0]
    uint128_t v37;  // [bp-0xd0]
    uint128_t v38;  // [bp-0xc0]
    uint128_t v39;  // [bp-0xb0]
    uint128_t v40;  // [bp-0xa0]
    uint128_t v41;  // [bp-0x90]
    char v42;  // [bp-0x80]
    unsigned long v43;  // [bp-0x38]
    char *v44;  // [bp-0x10]
    char v45;  // [bp+0x0]

    v44 = &v45;
    v43 = *(long long *)&g_10002b0;
    v20 = a1->field_30;
    v17 = a1->field_0;
    v18 = a1->field_10;
    v19 = a1->field_20;
    v17 = *(char *)&v17 & 252;
    v21 = *(char *)((void*)&v20 + 7) | 128;
    sub_a0a0cc(&v16, &v17, 56);
    sub_a0a654(&v16, &v16);
    sub_a05544(&v0, g_f086b8, &v16);
    v34 = v12;
    v35 = v13;
    v36 = v14;
    v37 = v15;
    v30 = v8;
    v31 = v9;
    v32 = v10;
    v33 = v11;
    v26 = v4;
    v27 = v5;
    v28 = v6;
    v29 = v7;
    v22 = v0;
    v23 = v1;
    v24 = v2;
    v25 = v3;
    sub_a04c64(&v42, &v22);
    sub_a08f10(&v38, &v42);
    sub_a04c64(&v42, &v38);
    sub_a04850(&v38, &v42, &v22);
    v34 = v38;
    v35 = v39;
    v36 = v40;
    v37 = v41;
    sub_a04850(&v30, &v34, &v26);
    sub_a04c64(&v26, &v30);
    sub_a08514(a0, &v26, 1);
    sub_a66ec0(&v22, 0x100);
    v46 = sub_a66ec0(&v0, 0x100);
    if (*(long long *)&g_10002b0 == v43)
        return v46;
    ___stack_chk_fail();
}
