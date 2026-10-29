/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb37228..0xb37320 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b37228_0 {
    struct st_b37228_0 *field_0;
    char field_8;
    char padding_9[31];
    struct st_b37228_0 *field_28;
    unsigned int field_30;
} st_b37228_0;


int sub_b37228(st_b37228_0 *a0, st_b37228_0 *a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_b37228_0 *v9;  // x20
    st_b37228_0 *v10;  // x0
    long long v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (a0)
    {
        v1 = v6;
        v2 = v7;
        v3 = &v5;
        v4 = v8;
        if (a0->field_30 == 0x2000 && a0->field_28)
        {
            sub_a66ec0(a0->field_28, 32);
            a0->field_28 = 0;
        }
        if (!a1 || !a1->field_0 || a0->field_30 != 0x1000 || !sub_a6fbc4(a1, "ikme") || (v0 = 32, v9 = &a0->field_8, a0->field_28 = v9, sub_a71440() && v0 == 32))
        {
            v10 = 1;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/ml_kem_kem.c", 127, "ml_kem_set_ctx_params");
            sub_a36abc(57, 154, 0);
            sub_a66ec0(v9, 32);
            v10 = 0;
            a0->field_28 = 0;
        }
        a0 = v10;
    }
    return (unsigned int)a0;
}
