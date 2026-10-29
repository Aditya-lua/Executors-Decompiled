/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa087ac..0xa088cc (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a087ac_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
} st_a087ac_0;

extern char g_10002b0;

unsigned long long sub_a087ac(st_a087ac_0 *a0)
{
    unsigned long long v11;  // x8
    unsigned long long v12;  // x9
    unsigned long long v21;  // x14
    unsigned long long v22;  // x13
    unsigned long long v23;  // x11
    unsigned long long v24;  // x10
    unsigned long long v25;  // x9
    unsigned long long v26;  // x8
    unsigned long long v27;  // x16
    unsigned long long v28;  // x12
    unsigned long long v13;  // x10
    unsigned long long v14;  // x11
    unsigned long long v15;  // x13
    unsigned long long v16;  // x15
    unsigned long long v17;  // x14
    unsigned long long v18;  // x16
    unsigned long long v19;  // x12
    unsigned long long v20;  // x15
    unsigned long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v11 = a0->field_0 * 2;
    v12 = a0->field_8 * 2;
    v13 = a0->field_10 * 2;
    v14 = a0->field_18 * 2;
    v15 = a0->field_28 * 2;
    v16 = a0->field_38;
    v17 = a0->field_30 * 2;
    v18 = (v16 * 0x200 | v16 >> 55) & 0xfffffffffffffeff & 0xff;
    v19 = v18 + a0->field_20 * 2;
    v20 = ((v16 * 2 | v16 >> 63) & 0xfffffffffffffe & 0xffffffffffffff) + (v17 >> 56);
    v21 = (v17 & 0xfffffffffffffe) + (v15 >> 56);
    v22 = (v15 & 0xfffffffffffffe) + (v19 >> 56);
    v23 = (v14 & 0xfffffffffffffe) + (v13 >> 56);
    v24 = (v13 & 0xfffffffffffffe) + (v12 >> 56);
    v25 = (v12 & 0xfffffffffffffe) + (v11 >> 56);
    v26 = v18 + (v11 & 0xfffffffffffffe);
    v27 = v20 >> 56;
    v28 = (v19 & 0xffffffffffffff) + (v14 >> 56) + v27;
    v6 = (v21 & 0xffffffffffffff) + (v22 >> 56);
    v7 = (v20 & 0xffffffffffffff) + (v21 >> 56);
    v4 = (v28 & 0xffffffffffffff) + (v23 >> 56);
    v5 = (v22 & 0xffffffffffffff) + (v28 >> 56);
    v2 = (v24 & 0xffffffffffffff) + (v25 >> 56);
    v3 = (v23 & 0xffffffffffffff) + (v24 >> 56);
    v0 = (v26 & 0xffffffffffffff) + v27;
    v1 = (v25 & 0xffffffffffffff) + (v26 >> 56);
    sub_a085fc(&v0);
    if (*(long long *)&g_10002b0 == v8)
        return -(v0 & 1);
    ___stack_chk_fail();
}
