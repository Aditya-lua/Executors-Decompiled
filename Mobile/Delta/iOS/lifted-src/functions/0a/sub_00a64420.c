/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa64420..0xa644c4 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a64420_0 {
    struct st_a64420_0 *field_0;
    long long field_8;
    long long field_10;
    long long field_18;
} st_a64420_0;


st_a64420_0 * sub_a64420(void)
{
    st_a64420_0 *v2;  // x0
    st_a64420_0 *v3;  // x19
    long long v4;  // x20
    long long v5;  // x21
    long long v6;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(40, "crypto/hmac/hmac.c", 166);
    if (!v2)
        return v2;
    v3 = v2;
    if (!sub_a64290())
    {
        v4 = v3->field_10;
        sub_a3f568(v4);
        v5 = v3->field_18;
        sub_a3f568(v5);
        v6 = v3->field_8;
        sub_a3f568(v6);
        v3->field_0 = 0;
        sub_a3f73c(v4);
        sub_a3f73c(v5);
        sub_a3f73c(v6);
        sub_a6c2e4(v3, "crypto/hmac/hmac.c", 196);
        return 0;
    }
    return v3;
}
