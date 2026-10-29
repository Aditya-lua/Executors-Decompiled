/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa19a8c..0xa19b18 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a19a8c_0 {
    struct st_a19a8c_0 *field_0;
    char padding_8[304];
    struct st_a19a8c_0 *field_138;
} st_a19a8c_0;

typedef struct st_a19a8c_1 {
    char padding_0[24];
    struct st_a19a8c_0 *field_18;
} st_a19a8c_1;


st_a19a8c_0 * sub_a19a8c(st_a19a8c_1 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_18)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (!a0->field_18->field_0)
    {
        return 0;
    }
    else if (a0->field_18->field_0->field_138)
    {
        a0->field_18->field_0->field_138();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_key.c", 981, "EC_KEY_oct2priv");
        sub_a36abc(16, 0xc0101, 0);
        return 0;
    }
}
