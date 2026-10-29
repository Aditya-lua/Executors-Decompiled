/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x963f58..0x963fec (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_963f58_0 {
    char padding_0[8];
    long long field_8;
} st_963f58_0;

typedef struct st_963f58_1 {
    char padding_0[344];
    struct st_963f58_0 *field_158;
} st_963f58_1;


long long sub_963f58(st_963f58_1 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_959e7c(a0, 0x40007, sub_a59d18(a1), 0, a1))
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 0x1da1, "SSL_CTX_set0_tmp_dh_pkey");
        sub_a36abc(20, 394, 0);
        return 0;
    }
    sub_a5a4c8(a0->field_158->field_8);
    a0->field_158->field_8 = a1;
    return 1;
}
