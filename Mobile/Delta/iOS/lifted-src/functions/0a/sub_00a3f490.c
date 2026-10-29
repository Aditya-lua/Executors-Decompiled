/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3f490..0xa3f52c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3f490_1 {
    char padding_0[8];
    struct st_a3f490_0 *field_8;
    char padding_10[16];
    struct st_a3f490_0 *field_20;
} st_a3f490_1;

typedef struct st_a3f490_0 {
    unsigned long long field_0;
    char padding_8[56];
    struct st_a3f490_0 *field_40;
    char padding_48[4];
    int field_4c;
} st_a3f490_0;


st_a3f490_1 * sub_a3f490(st_a3f490_1 *a0, st_a3f490_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_a3f490_1 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_8)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0;
    if (v8->field_8->field_40)
    {
        v8 = sub_a50db0(a0, 2);
        if (!(unsigned int)v8)
            a0->field_8->field_40();
    }
    if (a0->field_20 && a0->field_8->field_4c >= 1)
    {
        v8 = sub_a50db0(a0, 4);
        if (a1 || !(unsigned int)v8)
        {
            v8 = sub_a6c4e8(a0->field_20, a0->field_8->field_4c, "crypto/evp/digest.c", 38);
            a0->field_20 = 0;
        }
    }
    return v8;
}
