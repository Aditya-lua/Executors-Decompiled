/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95fae0..0x95fb6c (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95fae0_2 {
    struct st_95fae0_0 *field_0;
    struct st_95fae0_0 *field_8;
} st_95fae0_2;

typedef struct st_95fae0_0 {
    char padding_0[344];
    struct st_95fae0_1 *field_158;
} st_95fae0_0;

typedef struct st_95fae0_1 {
    struct st_95fae0_2 *field_0;
} st_95fae0_1;


st_95fae0_0 * sub_95fae0(st_95fae0_0 *a0)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0 || !*(long long *)*(long long *)a0->field_158)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 2061, "SSL_CTX_check_private_key");
        v2 = 177;
    }
    else if (!*(long long *)(*(long long *)a0->field_158 + 8))
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 2065, "SSL_CTX_check_private_key");
        v2 = 190;
    }
    sub_a36abc(20, v2, 0);
    return 0;
}
