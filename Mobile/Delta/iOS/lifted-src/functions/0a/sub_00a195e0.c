/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa195e0..0xa19698 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a195e0_0 {
    char padding_0[40];
    struct st_a195e0_0 *field_28;
    char padding_30[32];
    long long field_50;
} st_a195e0_0;


st_a195e0_0 * sub_a195e0(st_a195e0_0 *a0)
{
    st_a195e0_0 *v2;  // x0
    st_a195e0_0 *v3;  // x19
    st_a195e0_0 *v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_key.c", 618, "ossl_ec_key_simple_check_key");
        sub_a36abc(16, 0xc0102, 0);
        return a0;
    }
    v2 = sub_9dddcc(a0->field_50);
    if (!v2)
        return 0;
    v3 = v2;
    if (sub_a19308(a0, v3) && (!a0->field_28 || sub_a1941c(a0) && sub_a194c4(a0, v3)))
        v4 = 1;
    else
        v4 = 0;
    sub_9dded4(v3);
    return v4;
}
