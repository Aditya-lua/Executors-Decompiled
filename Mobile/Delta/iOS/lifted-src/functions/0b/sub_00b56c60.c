/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb56c60..0xb56d00 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b56c60_1 {
    char padding_0[72];
    struct st_b56c60_0 *field_48;
    char padding_50[104];
    long long field_b8;
} st_b56c60_1;

typedef struct st_b56c60_0 {
    char padding_0[16];
    long long field_10;
} st_b56c60_0;


st_b56c60_0 * sub_b56c60(st_b56c60_1 *a0, long long a1)
{
    st_b56c60_0 *v2;  // w0
    st_b56c60_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b56c60_0 *)(unsigned int)sub_b5c36c();
    if (!v2)
        return v2;
    v3 = sub_a6fbc4(a1, "randkey");
    if (!v3)
        return 1;
    if (a0->field_48 && (int)sub_aa845c(a0->field_b8, v3->field_10) >= 1)
    {
        sub_9fc200(v3->field_10);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_des.c", 144, "des_get_ctx_params");
        sub_a36abc(57, 121, 0);
        return 0;
    }
    return 1;
}
