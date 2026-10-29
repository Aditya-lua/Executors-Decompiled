/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2cd84..0xb2cde4 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2cd84_0 {
    char padding_0[92];
    unsigned int field_5c;
} st_b2cd84_0;


int sub_b2cd84(st_b2cd84_0 *a0, unsigned int a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a1 != 19 && a1 != 16)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/argon2.c", 1365, "kdf_argon2_ctx_set_version");
        sub_a36abc(57, 125, "invalid Argon2 version");
        return 0;
    }
    a0->field_5c = a1;
    return 1;
}
