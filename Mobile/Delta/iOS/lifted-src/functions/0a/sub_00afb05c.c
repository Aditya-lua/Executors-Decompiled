/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafb05c..0xafb0d0 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afb05c_0 {
    struct st_afb05c_0 *field_0;
    long long field_8;
    long long field_10;
    char padding_18[8];
    long long field_20;
} st_afb05c_0;


st_afb05c_0 * sub_afb05c(st_afb05c_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_afb05c_0 *v12;  // x20
    st_afb05c_0 *v13;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_0;
    if (v12)
    {
        sub_9cf6c8(v12->field_0);
        sub_9cf0f4(v12->field_8);
        sub_a5a4c8(v12->field_10);
        sub_a6c2e4(v12->field_20, "crypto/x509/x_pubkey.c", 93);
        v13 = sub_a6c2e4(v12, "crypto/x509/x_pubkey.c", 94);
        a0->field_0 = 0;
        a0 = v13;
    }
    return a0;
}
