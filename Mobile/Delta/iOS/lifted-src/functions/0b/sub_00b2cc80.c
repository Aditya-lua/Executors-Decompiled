/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2cc80..0xb2cd1c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2cc80_0 {
    char padding_0[84];
    unsigned long long field_54;
} st_b2cc80_0;


unsigned long long sub_b2cc80(st_b2cc80_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // [bp-0x20]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a1 > 0xffffff)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/argon2.c", 1167, "kdf_argon2_ctx_set_lanes");
        v0 = 0xffffff;
    }
    else
    {
        if (a1)
        {
            *(unsigned int *)&(a0->padding_0)[1] = a1;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/argon2.c", 1173, "kdf_argon2_ctx_set_lanes");
        v0 = 1;
    }
    sub_a36abc(57, 104);
    return 0;
}
