/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa97c40..0xa97d14 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a97c40_0 {
    char padding_0[16];
    uint128_t field_10;
    long long field_20;
    char padding_28[16];
    long long field_38;
    long long field_3c;
} st_a97c40_0;


unsigned long long sub_a97c40(st_a97c40_0 *a0, long long a1, long long a2, unsigned int a3)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    unsigned long long v18;  // x0
    unsigned long long v19;  // x0
    unsigned long long v20;  // x0
    uint128_t v0;  // [bp-0x58]
    char v1;  // [bp-0x4c]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (!*(int *)((char *)&a0->field_38 + 4))
        return 0;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = &v10;
    v9 = v17;
    *(int *)((char *)&a0->field_38 + 4) = *(int *)((char *)&a0->field_38 + 4) - 1;
    v18 = sub_a97d14();
    if (!(unsigned int)v18)
        return v18;
    a0->field_10 = v0;
    *((char *)&v0 + 8) = *(char *)((void*)&v0 + 8) & 127;
    v1 = *(char *)((void*)&v0 + 12) & 127;
    v19 = sub_a4c694(a0->field_20, 0, 0, 0, &v0, 1);
    if (!(unsigned int)v19)
        return v19;
    v20 = sub_c672c8(a0->field_20, a2, &a3, a1, a3);
    if (!(unsigned int)v20)
        return v20;
    *(unsigned int *)&a0->field_38 = 0;
    return 1;
}
