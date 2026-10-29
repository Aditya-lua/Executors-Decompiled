/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa18d10..0xa18dbc (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a18d10_1 {
    struct st_a18d10_0 *field_0;
    char padding_8[16];
    struct st_a18d10_1 *field_18;
} st_a18d10_1;

typedef struct st_a18d10_0 {
    char padding_0[64];
    struct st_a18d10_1 *field_40;
} st_a18d10_0;


st_a18d10_1 * sub_a18d10(st_a18d10_1 *a0)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0 || !a0->field_18)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_key.c", 212, "EC_KEY_generate_key");
        v2 = 786690;
    }
    else if (a0->field_0->field_40)
    {
        a0->field_0->field_40();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_key.c", 224, "EC_KEY_generate_key");
        v2 = 152;
    }
    sub_a36abc(16, v2, 0);
    return 0;
}
