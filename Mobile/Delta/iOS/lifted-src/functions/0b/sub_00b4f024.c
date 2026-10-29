/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4f024..0xb4f0e4 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4f024_1 {
    char padding_0[8];
    struct st_b4f024_0 *field_8;
    char padding_10[264];
    unsigned int field_118;
    char field_11c;
} st_b4f024_1;

typedef struct st_b4f024_0 {
    struct st_b4f024_0 *field_0;
    char padding_8[88];
    unsigned int field_60;
} st_b4f024_0;


st_b4f024_0 * sub_b4f024(st_b4f024_1 *a0, st_b4f024_0 *a1, st_b4f024_0 *a2, unsigned long a3)
{
    char v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 && (char)a1->field_0)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/signature/eddsa_sig.c", 717, "ed448_digest_signverify_init");
        sub_a36abc(57, 122, "Explicit digest not allowed with EdDSA operations");
        return 0;
    }
    if (a2 || !a0->field_8)
    {
        if (!sub_b4f1c8())
        {
            return 0;
        }
        else if (a0->field_8->field_60 == 3)
        {
            v2 = a0->field_11c;
            a0->field_118 = 4;
            a0->field_11c = v2 & 228;
        }
        else
        {
            return 0;
        }
    }
}
