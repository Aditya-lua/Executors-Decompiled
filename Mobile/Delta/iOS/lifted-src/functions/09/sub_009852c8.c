/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9852c8..0x985398 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9852c8_0 {
    struct st_9852c8_0 *field_0;
    char padding_8[8];
    char field_10;
    char padding_11[863];
    struct st_9852c8_0 *field_370;
    char padding_378[16];
    struct st_9852c8_0 *field_388;
    char padding_390[32];
    long long field_3b0;
} st_9852c8_0;


void sub_9852c8(st_9852c8_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_9852c8_0 *v12;  // x0
    st_9852c8_0 *v13;  // x0
    st_9852c8_0 *v14;  // x0
    st_9852c8_0 *v15;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_388;
    if (a0->field_388)
    {
        do
        {
            v13 = v12;
            sub_a6c2e4();
            v12 = v13->field_0;
        } while (v13->field_0);
    }
    v14 = a0->field_370;
    if (a0->field_370)
    {
        do
        {
            v15 = v14;
            sub_a6c2e4();
            v14 = v15->field_0;
        } while (v15->field_0);
    }
    sub_a6c2e4(a0->field_3b0, "ssl/quic/quic_record_tx.c", 155);
    sub_c62520(&a0->field_10, 0);
    sub_c62520(&a0->field_10, 1);
    sub_c62520(&a0->field_10, 2);
    sub_c62520(&a0->field_10, 3);
    sub_a6c2e4();
    return;
}
