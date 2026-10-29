/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x976018..0x976170 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_976018_0 {
    struct st_976018_0 *field_0;
    char padding_8[8];
    struct st_976018_0 *field_10;
    struct st_976018_0 *field_18;
    struct st_976018_0 *field_20;
    struct st_976018_0 *field_28;
    char padding_30[36];
    unsigned int field_54;
} st_976018_0;


void sub_976018(st_976018_0 *a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    st_976018_0 *v19;  // x23
    st_976018_0 *v20;  // x20
    st_976018_0 *v21;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_976018_0 *v16;  // x20
    st_976018_0 *v17;  // x23
    st_976018_0 *v18;  // x20
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a0->field_0;
    if (v16)
    {
        do
        {
            v17 = v16->field_18;
            if (v16->field_28)
                v16->field_28();
        } while ((v16->field_54 = 0xffffffff, sub_a6c2e4(v16, "ssl/quic/quic_cfq.c", 201), v16 = v17, v16));
    }
    v18 = a0->field_10;
    if (v18)
    {
        do
        {
            v19 = v18->field_18;
            if (v18->field_28)
                v18->field_28();
        } while ((v18->field_54 = 0xffffffff, sub_a6c2e4(v18, "ssl/quic/quic_cfq.c", 201), v18 = v19, v19));
    }
    v20 = a0->field_20;
    if (v20)
    {
        do
        {
            v21 = v20->field_18;
            if (v20->field_28)
                v20->field_28();
        } while ((v20->field_54 = 0xffffffff, sub_a6c2e4(v20, "ssl/quic/quic_cfq.c", 201), v20 = v21, v21));
    }
    sub_a6c2e4();
    return;
}
