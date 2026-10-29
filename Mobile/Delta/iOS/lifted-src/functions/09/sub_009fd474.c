/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd474..0x9fd594 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fd474_0 {
    struct st_9fd474_0 *field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    struct st_9fd474_0 *field_20;
} st_9fd474_0;

extern long long g_e8d440;

st_9fd474_0 * sub_9fd474(st_9fd474_0 *a0, long long a1, long long a2)
{
    st_9fd474_0 *v2;  // x19
    st_9fd474_0 *v3;  // x0
    st_9fd474_0 *v4;  // x20
    long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ff998();
    if (!v2)
        return v2;
    v3 = sub_9cae2c(0, a1, a2, &g_e8d440);
    if (!v3)
    {
        sub_9ffb3c(v2);
        return 0;
    }
    v4 = v3;
    if (a0)
    {
        sub_9ffb3c(a0->field_0);
        a0->field_0 = v2;
    }
    sub_9ffcd0(v2, v4->field_0, v4->field_8, v4->field_10);
    sub_a60d4c(&v2->field_8, v4->field_18);
    if (v4->field_20)
    {
        v5 = sub_9e4d2c(v4->field_20->field_8);
        sub_a60e3c(&v2->field_8, v4->field_20->field_0->field_8, (int)v4->field_20->field_0->field_0, v5);
        sub_9cf0f4(v4->field_20->field_0);
        sub_9e48d4(v4->field_20->field_8);
        sub_a6c2e4(v4->field_20, "crypto/dh/dh_asn1.c", 125);
        v4->field_20 = 0;
    }
    sub_a6c2e4(v4, "crypto/dh/dh_asn1.c", 129);
    sub_9ffde8(v2, 0xf000);
    sub_9ffe04(v2, 0x1000);
    return v2;
}
