/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x976edc..0x976fa4 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_976edc_1 {
    unsigned long long field_0;
    char padding_8[40];
    unsigned long long field_30;
    uint128_t field_38;
    char padding_48[992];
    unsigned long long field_428;
    char padding_430[496];
    unsigned long long field_620;
    char padding_628[24];
    unsigned long long field_640;
} st_976edc_1;

typedef struct st_976edc_0 {
    unsigned long long field_0;
    uint128_t field_8;
    unsigned long long field_18;
    unsigned int field_20;
    char padding_24[4];
    unsigned long long field_28;
    unsigned int field_30;
    unsigned int field_34;
} st_976edc_0;


double sub_976edc(st_976edc_0 *a0)
{
    st_976edc_1 *v2;  // x0
    unsigned long v3;  // x8
    unsigned long long v4;  // x9
    uint128_t v5;  // q0
    unsigned long v6;  // x10
    unsigned long v7;  // x8
    st_976edc_1 *v8;  // x19
    unsigned long long v9;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(1624, "ssl/quic/quic_channel.c", 463);
    if (v2)
    {
        v2->field_0 = a0->field_0;
        v3 = (unsigned int)a0->field_18;
        v4 = *(long long *)&v2->padding_430[488] & 0xfffff9fffdffffff & 0xfffffffffc000000 | (*(long long *)&v2->padding_430[488] & 0xfffff9fffdffffff & 0xfffffffffdffffff | (v3 * 0x2000000 | v3 >> 39) & 0x2000000) & 0x3ffffff;
        v2->field_30 = *(long long *)&a0->field_20;
        v5 = *(int128_t *)&(&a0->field_0)[1];
        *(uint128_t *)&(&v2->field_30)[1] = v5;
        *(long long *)&v2->padding_48[984] = *(long long *)((char *)&a0->field_8 + 8);
        v6 = (unsigned int)a0->field_28;
        v7 = *(int *)((char *)&a0->field_28 + 4) & 1;
        *(unsigned long long *)&v2->padding_430[488] = (v4 | v7 * 0x40000000000) & 0xfffffc0000000000 | ((v4 | v7 * 0x40000000000) & 0xfffffdffffffffff | (v6 * 0x20000000000 | v6 >> 23) & 0x20000000000) & 0x3ffffffffff;
        if (v6 & 1 && *(long long *)&a0->field_30)
        {
            v8 = v2;
            v9 = sub_a6d9b4(*(long long *)&a0->field_30, "ssl/quic/quic_channel.c", 477);
            *(unsigned long long *)&v8->padding_628[16] = v9;
            if (!v9)
                sub_a6c2e4(v8, "ssl/quic/quic_channel.c", 478);
        }
    }
    return (unsigned long long)v5;
}
