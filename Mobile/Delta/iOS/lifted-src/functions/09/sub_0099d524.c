/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99d524..0x99d5d0 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99d524_1 {
    char padding_0[8];
    struct st_99d524_0 *field_8;
    char padding_10[592];
    long long field_260;
    char padding_268[128];
    long long field_2e8;
} st_99d524_1;

typedef struct st_99d524_0 {
    char padding_0[752];
    long long field_2f0;
} st_99d524_0;


long long sub_99d524(st_99d524_1 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_8->field_2f0 && (!a0->field_260 || !a0->field_2e8))
    {
        if (sub_c68d5c(a1, 0x3374, 2) && sub_c68d5c(a1, 0, 2))
            return 1;
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 443, "tls_construct_ctos_npn");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    return 2;
}
