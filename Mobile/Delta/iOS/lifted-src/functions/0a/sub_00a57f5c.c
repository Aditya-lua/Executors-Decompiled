/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa57f5c..0xa58044 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a57f5c_2 {
    struct st_a57f5c_0 *field_0;
    struct st_a57f5c_3 *field_8;
} st_a57f5c_2;

typedef struct st_a57f5c_0 {
    char padding_0[48];
    struct st_a57f5c_1 *field_30;
} st_a57f5c_0;

typedef struct st_a57f5c_1 {
    unsigned long long field_0;
} st_a57f5c_1;

typedef struct st_a57f5c_3 {
    struct st_a57f5c_0 *field_0;
} st_a57f5c_3;


void* sub_a57f5c(st_a57f5c_2 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_a57f5c_0 **v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_8)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a6bf4c(16, "crypto/evp/mac_lib.c", 57);
    if (v8)
    {
        *(int128_t *)v8 = *(int128_t *)a0;
        if (sub_a382a4(*v8))
            a0->field_0->field_30();
        sub_a368c8();
        sub_a369bc("crypto/evp/mac_lib.c", 63, "EVP_MAC_CTX_dup");
        sub_a36abc(6, 0x80006, 0);
        sub_a6c2e4(v8, "crypto/evp/mac_lib.c");
        v8 = 0;
    }
    return (unsigned int)v8;
}
