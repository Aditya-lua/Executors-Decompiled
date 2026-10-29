/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958910..0x9589bc (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_958910_0 {
    char padding_0[16];
    struct st_958910_0 *field_10;
    char padding_18[2152];
    struct st_958910_1 *field_880;
} st_958910_0;

typedef struct st_958910_1 {
    struct st_958910_0 *field_0;
} st_958910_1;


st_958910_0 * sub_958910(st_958910_0 *a0, st_958910_1 **a1, long long a2)
{
    st_958910_1 **v2;  // x8
    st_958910_0 *v3;  // x21
    unsigned long long v4;  // x0
    st_958910_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a0->field_880;
    if (!a0)
        v2 = a1 + 43;
    v3 = *(long long *)*v2;
    if (!v3)
        return 0;
    v4 = sub_96ca2c();
    if ((unsigned int)v4 == 1)
    {
        v5 = v3->field_10;
        if (!v5)
        {
            v5 = sub_ad61b4(NULL);
            v3->field_10 = v5;
            if (!v5)
                return v5;
        }
        return sub_ad68a0(v5, a2) != 0;
    }
    sub_a368c8();
    sub_a369bc("ssl/ssl_cert.c", 345, "ssl_cert_add0_chain_cert");
    sub_a36abc(20, v4, 0);
    return 0;
}
