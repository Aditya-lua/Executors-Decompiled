/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa97e54..0xa97f60 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a97e54_0 {
    char padding_0[16];
    uint128_t field_10;
    long long field_20;
    char padding_28[16];
    long long field_38;
    long long field_3c;
} st_a97e54_0;


unsigned long long sub_a97e54(st_a97e54_0 *a0, long long a1, long long a2, unsigned long long a3)
{
    unsigned long long v12;  // x24
    unsigned long long v13;  // x23
    unsigned long long v14;  // x22
    unsigned long long v15;  // x21
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    unsigned long long v19;  // x0
    unsigned long long v20;  // x0
    unsigned long long v21;  // x0
    uint128_t v0;  // [bp-0x60]
    char v1;  // [bp-0x54]
    uint128_t v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    if (!*(int *)((char *)&a0->field_38 + 4))
        return 0;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = &v11;
    v10 = v18;
    *(int *)((char *)&a0->field_38 + 4) = *(int *)((char *)&a0->field_38 + 4) - 1;
    v0 = a0->field_10;
    *((char *)&v0 + 8) = *(char *)((void*)&v0 + 8) & 127;
    v1 = *(char *)((void*)&v0 + 12) & 127;
    *(unsigned int *)&v2 = a3;
    v19 = sub_a4c694(a0->field_20, 0, 0, 0, &v0, 1);
    if (!(unsigned int)v19)
        return v19;
    v20 = sub_c672c8(a0->field_20, a2, &v2, a1, a3);
    if (!(unsigned int)v20)
        return v20;
    v21 = sub_a97d14(a0, &v2, a2, a3);
    if (!(unsigned int)v21)
        return v21;
    v2 ^= a0->field_10;
    if (!*(unsigned long long *)((void*)&v2 + 8) && !*(unsigned long long *)&v2)
    {
        *(unsigned int *)&a0->field_38 = 0;
        return 1;
    }
    sub_a66ec0(a2, a3);
    return 0;
}
