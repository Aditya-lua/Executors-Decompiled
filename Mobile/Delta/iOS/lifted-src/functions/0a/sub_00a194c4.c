/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa194c4..0xa195e0 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a194c4_0 {
    char padding_0[24];
    struct st_a194c4_0 *field_18;
    struct st_a194c4_0 *field_20;
    struct st_a194c4_0 *field_28;
} st_a194c4_0;


st_a194c4_0 * sub_a194c4(st_a194c4_0 *a0, long long a1)
{
    st_a194c4_0 *v2;  // x19
    long long v3;  // x20
    long long v4;  // x21
    st_a194c4_0 *v5;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && a0->field_18 && a0->field_20 && a0->field_28)
    {
        v2 = sub_a1a56c(a0->field_18);
        if (v2)
        {
            if (!sub_a1b804(a0->field_18, v2, a0->field_28, 0, 0, a1))
            {
                v3 = 524304;
                v4 = 589;
                goto LABEL_a19598;
            }
            if (sub_a1afd8(a0->field_18, v2, a0->field_20, a1))
            {
                v3 = 123;
                v4 = 593;
LABEL_a19598:
                sub_a368c8();
                sub_a369bc("crypto/ec/ec_key.c", v4, "ossl_ec_key_pairwise_check");
                sub_a36abc(16, v3, 0);
                goto LABEL_a195c4;
            }
            else
            {
                v5 = 1;
            }
        }
        else
        {
LABEL_a195c4:
            v5 = 0;
        }
        sub_a1a254(v2);
        return v5;
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_key.c", 580, "ossl_ec_key_pairwise_check");
    sub_a36abc(16, 0xc0102, 0);
    return 0;
}
