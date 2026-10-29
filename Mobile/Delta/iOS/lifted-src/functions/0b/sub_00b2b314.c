/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2b314..0xb2b37c (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2b314_0 {
    char padding_0[8];
    unsigned int field_8;
} st_b2b314_0;


int sub_b2b314(st_b2b314_0 *a0, unsigned int a1)
{
    unsigned long long v4;  // x30
    unsigned long long v0;  // [bp-0x20]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    if (3 < a1)
    {
        a0->field_8 = a1;
        return 1;
    }
    v1 = &v3;
    v2 = v4;
    sub_a368c8();
    sub_a369bc("providers/implementations/kdfs/argon2.c", 1219, "kdf_argon2_ctx_set_out_length");
    v0 = 4;
    sub_a36abc(57, 217, "min: %u");
    return 0;
}
