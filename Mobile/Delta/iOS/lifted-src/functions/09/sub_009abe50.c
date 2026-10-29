/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9abe50..0x9abfcc (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9abe50_2 {
    char padding_0[240];
    unsigned int field_f0;
    char padding_f4[2948];
    struct st_9abe50_0 *field_c78;
} st_9abe50_2;

typedef struct st_9abe50_1 {
    unsigned long long field_0;
} st_9abe50_1;

typedef struct st_9abe50_0 {
    char padding_0[96];
    struct st_9abe50_1 *field_60;
} st_9abe50_0;


uint128_t sub_9abe50(st_9abe50_2 *a0, unsigned long a1)
{
    uint128_t v0;  // [bp-0x70]
    uint128_t v1;  // [bp-0x60]
    uint128_t v2;  // [bp-0x50]
    uint128_t v3;  // [bp-0x48]
    uint128_t v4;  // [bp-0x38]
    uint128_t v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = 0;
    if (a0->field_f0 == 7)
    {
        v4 = 0;
        v3 = 0;
        v2 = 0;
        v0 = 0;
        v1 = 0;
        if (!sub_992148(a0, 0x10000, 1, 0, 0, 0, 0, 0, 0))
        {
            sub_a6c2e4(v5, "ssl/statem/statem_clnt.c", 1902);
            return 0;
        }
    }
    a0->field_c78->field_60();
}
