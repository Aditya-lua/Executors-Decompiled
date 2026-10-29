/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91edd8..0x91ef1c (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_91edd8_2 {
    char padding_0[8];
    struct st_91edd8_3 *field_8;
    char padding_10[16];
    unsigned long long field_20;
    unsigned long long field_28;
} st_91edd8_2;

typedef struct st_91edd8_4 {
    unsigned long long field_0;
    char field_8;
    char padding_9[39];
    uint128_t field_30;
} st_91edd8_4;

typedef struct st_91edd8_5 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[24];
    unsigned int field_28;
    char padding_2c[4];
    uint128_t field_30;
} st_91edd8_5;

typedef struct st_91edd8_3 {
    unsigned long long field_0;
} st_91edd8_3;

typedef struct st_91edd8_1 {
    struct st_91edd8_0 *field_0;
} st_91edd8_1;

typedef struct st_91edd8_0 {
    char field_0;
} st_91edd8_0;

extern unsigned int g_fffffffffffffffc;

long long sub_91edd8(st_91edd8_2 *a0)
{
    st_91edd8_4 *v6;  // x1
    st_91edd8_5 *v7;  // x8
    unsigned long long v8;  // x9
    unsigned long long v9;  // x8
    unsigned long v0;  // [bp-0x50]
    long long v1;  // [bp-0x48]
    st_91edd8_0 *v2;  // [bp-0x40], Other Possible Types: st_91edd8_1 **
    st_91edd8_0 **v3;  // [bp-0x38], Other Possible Types: st_91edd8_1 **, char
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v2 = &v3;
    v3 = &v2;
    v0 = a0 + 1;
    v1 = 1;
    std::__1::mutex::lock(v0);
    if (!a0->field_28)
    {
        do
        {
            std::__1::condition_variable::wait(a0[2].padding_10, &v0);
        } while (!a0->field_28);
    }
    v2 = &v3;
    v3 = &v2;
    v6 = *(long long *)((char *)a0->field_8 + (a0->field_20 >> 3 & 0x1ffffffffffffff8)) + (a0->field_20 & 63) * 64;
    v7->field_0 = v6->field_0;
    *(char *)&v7->field_8 = 0;
    v7->field_28 = 0xffffffff;
    sub_15b73c(&v7->field_8, &v6->field_8);
    v7->field_30 = v6->field_30;
    v3 = &v2;
    v2 = &v3;
    sub_15b6c0(*(long long *)((char *)a0->field_8 + (a0->field_20 >> 3 & 0x1ffffffffffffff8)) + (a0->field_20 & 63) * 64 + 8);
    v8 = a0->field_20;
    v9 = a0->field_28;
    a0->field_20 = v8 + (v8 & 1) + (~(unsigned int)v8 | (char *)&g_fffffffffffffffc + 2) + 2;
    a0->field_28 = v9 - 1;
    sub_8b02f0(a0, 1);
    return sub_63c20(&v0);
}
