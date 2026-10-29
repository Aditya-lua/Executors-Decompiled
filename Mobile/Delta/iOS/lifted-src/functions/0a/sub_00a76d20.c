/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa76d20..0xa76d80 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a76d20_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    long long field_10;
    char padding_18[8];
    long long field_20;
    long long field_28;
} st_a76d20_0;


st_a76d20_0 * sub_a76d20(st_a76d20_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_a76d20_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0->field_0 == 1)
        sub_a6c4e8(a0->field_8, a0->field_10, "crypto/passphrase.c", 21);
    v8 = sub_a6c4e8(a0->field_20, a0->field_28, "crypto/passphrase.c", 29);
    memset(a0, 0, 48);
    return v8;
}
