/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2cd1c..0xb2cd84 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2cd1c_0 {
    char padding_0[80];
    unsigned int field_50;
} st_b2cd1c_0;


int sub_b2cd1c(st_b2cd1c_0 *a0, unsigned int a1)
{
    unsigned long long v4;  // x30
    unsigned long long v0;  // [bp-0x20]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    if (7 < a1)
    {
        a0->field_50 = a1;
        return 1;
    }
    v1 = &v3;
    v2 = v4;
    sub_a368c8();
    sub_a369bc("providers/implementations/kdfs/argon2.c", 1201, "kdf_argon2_ctx_set_m_cost");
    v0 = 8;
    sub_a36abc(57, 235, "min: %u");
    return 0;
}
