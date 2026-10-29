/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4fd04..0xa4fdf4 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4fd04_1 {
    char padding_0[152];
    long long field_98;
} st_a4fd04_1;

typedef struct st_a4fd04_0 {
    long long field_0;
    char padding_8[16];
    char field_18;
    char padding_19[151];
    long long field_b0;
} st_a4fd04_0;

extern char g_10002b0;

long long sub_a4fd04(st_a4fd04_0 *a0, unsigned long a1)
{
    unsigned int v9;  // w0
    unsigned long v10;  // x0
    st_a4fd04_1 *v0;  // [bp-0x98]
    uint128_t v1;  // [bp-0x90]
    uint128_t v2;  // [bp-0x80]
    uint128_t v3;  // [bp-0x70]
    uint128_t v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x50]
    unsigned long v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    if (a1)
    {
        v0 = &a0->field_18;
        v4 = 0;
        v5 = 0;
        v2 = 0;
        v3 = 0;
        v1 = 0;
        sub_a718b8("iv", &v0, 16);
        v9 = sub_a5262c(a0->field_0, a0->field_b0, &v1);
        if (0x11 <= sub_a4fbf0(a0))
            sub_a69928("assertion failed: j <= sizeof(c->iv)", "crypto/evp/evp_lib.c", 75);
        v10 = sub_9c958c();
    }
    else
    {
        v10 = 0;
    }
    if (*(long long *)&g_10002b0 == v6)
        return v10;
    ___stack_chk_fail();
    sub_a69928("assertion failed: j <= sizeof(c->iv)", "crypto/evp/evp_lib.c", 75);
}
