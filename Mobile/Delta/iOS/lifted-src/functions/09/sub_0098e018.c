/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e018..0x98e090 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98e018_0 {
    struct st_98e018_0 *field_0;
    struct st_98e018_0 *field_8;
    char padding_10[120];
    struct st_98e018_0 *field_88;
    long long field_90;
} st_98e018_0;


void sub_98e018(st_98e018_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_98e018_0 *v12;  // x21
    st_98e018_0 *v13;  // x21
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
    v12 = a0->field_0;
    if (a0->field_0)
    {
        do
        {
            v13 = v12;
            sub_a6c2e4(v13->field_90, "ssl/quic/quic_txpim.c", 0x33);
            sub_a6c2e4(v13, "ssl/quic/quic_txpim.c", 52);
            v12 = v13->field_88;
        } while (v13->field_88);
    }
    a0->field_0 = 0;
    a0->field_8 = 0;
    sub_a6c2e4();
    return;
}
