/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9830a0..0x98311c (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9830a0_1 {
    uint128_t field_0;
    struct st_9830a0_0 *field_10;
    char padding_18[8];
    struct st_9830a0_0 *field_20;
    uint128_t field_28;
    unsigned long long field_38;
    char field_40;
} st_9830a0_1;

typedef struct st_9830a0_0 {
    uint128_t field_0;
    struct st_9830a0_0 *field_10;
    char padding_18[8];
    struct st_9830a0_0 *field_20;
    char padding_28[104];
    uint128_t field_90;
    unsigned long long field_a0;
    char padding_a8[888];
    char field_420;
} st_9830a0_0;


double sub_9830a0(st_9830a0_1 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9830a0_0 *v8;  // x0
    st_9830a0_0 *v9;  // q1
    unsigned long v10;  // d0
    unsigned long v11;  // d0
    unsigned long v12;  // d0
    unsigned long v13;  // d0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_10)
    {
        return v13;
    }
    else if (a0->field_20)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_a6bffc(1096, "ssl/quic/quic_record_rx.c", 0xcc);
        if (!v8)
            return v11;
        v8->field_90 = *(int128_t *)&(&a0->field_20)[1];
        v8->field_a0 = *(long long *)((char *)&a0->field_28 + 8);
        v9 = (st_9830a0_0 *)*(int128_t *)&a0->field_10;
        v8->field_0 = a0->field_0;
        *(uint128_t *)&v8->field_10 = (uint128_t)v9;
        v8->field_420 = a0->field_38;
        v8->field_20 = a0->field_20;
        *(unsigned int *)&v8[1].padding_18[7] = 1;
        return v10;
    }
    else
    {
        return v12;
    }
}
