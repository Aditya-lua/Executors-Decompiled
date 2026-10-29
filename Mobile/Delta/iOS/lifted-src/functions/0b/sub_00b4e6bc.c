/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4e6bc..0xb4e778 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4e6bc_1 {
    char padding_0[8];
    struct st_b4e6bc_0 *field_8;
    char padding_10[264];
    unsigned int field_118;
    char field_11c;
} st_b4e6bc_1;

typedef struct st_b4e6bc_0 {
    struct st_b4e6bc_0 *field_0;
    char padding_8[88];
    unsigned int field_60;
} st_b4e6bc_0;


st_b4e6bc_0 * sub_b4e6bc(st_b4e6bc_1 *a0, st_b4e6bc_0 *a1, st_b4e6bc_0 *a2, unsigned long a3)
{
    char v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 && (char)a1->field_0)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/signature/eddsa_sig.c", 683, "ed25519_digest_signverify_init");
        sub_a36abc(57, 122, "Explicit digest not allowed with EdDSA operations");
        return 0;
    }
    if (a2 || !a0->field_8)
    {
        if (!sub_b4f1c8())
        {
            return 0;
        }
        else if (a0->field_8->field_60 == 2)
        {
            v2 = a0->field_11c;
            a0->field_118 = 1;
            a0->field_11c = v2 & 224;
        }
        else
        {
            return 0;
        }
    }
}
