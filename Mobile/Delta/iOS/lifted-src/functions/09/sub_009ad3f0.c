/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ad3f0..0x9ad488 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ad3f0_1 {
    char padding_0[72];
    unsigned int field_48;
    char padding_4c[1188];
    struct st_9ad3f0_0 *field_4f0;
} st_9ad3f0_1;

typedef struct st_9ad3f0_0 {
    char padding_0[268];
    unsigned short field_10c;
    unsigned short field_10e;
} st_9ad3f0_0;


int sub_9ad3f0(st_9ad3f0_1 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9ad3f0_0 *v8;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_48 != 0x100)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_4f0;
    v8->field_10e = v8->field_10e + 1;
    if (!sub_c68d5c(a1, v8->field_10c, 2))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_dtls.c", 1015, "dtls_construct_change_cipher_spec");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    return 1;
}
