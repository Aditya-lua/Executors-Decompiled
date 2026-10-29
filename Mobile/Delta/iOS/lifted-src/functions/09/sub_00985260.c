/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985260..0x9852c8 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985260_0 {
    uint128_t field_0;
    unsigned long long field_10;
    unsigned long long field_18;
    uint128_t field_20;
} st_985260_0;

typedef struct st_985260_1 {
    uint128_t field_0;
    char padding_10[832];
    unsigned long long field_350;
    uint128_t field_358;
    unsigned long long field_368;
} st_985260_1;


double sub_985260(st_985260_0 *a0)
{
    unsigned long v5;  // d0
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_985260_1 *v9;  // x0
    unsigned long long v10;  // x9
    unsigned long v11;  // d0
    unsigned long v12;  // d0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (1200 > a0->field_18)
        return v5;
    v0 = v6;
    v1 = v7;
    v2 = &v4;
    v3 = v8;
    v9 = sub_a6bffc(0x400, "ssl/quic/quic_record_tx.c", 120);
    if (!v9)
        return v12;
    v9->field_0 = a0->field_0;
    v10 = a0->field_18;
    v9->field_350 = a0->field_10;
    *(unsigned long long *)((char *)&v9->field_358 + 8) = v10;
    *(uint128_t *)&(&v9->field_350)[1] = a0->field_20;
    return v11;
}
