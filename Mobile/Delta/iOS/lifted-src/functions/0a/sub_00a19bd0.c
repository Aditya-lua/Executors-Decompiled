/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa19bd0..0xa19d04 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a19bd0_0 {
    struct st_a19bd0_0 *field_0;
    char padding_8[296];
    struct st_a19bd0_0 *field_130;
} st_a19bd0_0;

typedef struct st_a19bd0_1 {
    char padding_0[24];
    struct st_a19bd0_0 *field_18;
} st_a19bd0_1;


st_a19bd0_0 * sub_a19bd0(st_a19bd0_1 *a0, unsigned long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0->field_18)
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (!a0->field_18->field_0)
    {
        return 0;
    }
    else if (a0->field_18->field_0->field_130)
    {
        a0->field_18->field_0->field_130();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_key.c", 944, "EC_KEY_priv2oct");
        sub_a36abc(16, 0xc0101, 0);
        return 0;
    }
}
