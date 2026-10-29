/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2cbe4..0xb2cc80 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2cbe4_0 {
    char padding_0[88];
    unsigned long long field_58;
} st_b2cbe4_0;


unsigned long long sub_b2cbe4(st_b2cbe4_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // [bp-0x20]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/argon2.c", 1149, "kdf_argon2_ctx_set_threads");
        v0 = 1;
    }
    else if (a1 > 0xffffff)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/argon2.c", 1155, "kdf_argon2_ctx_set_threads");
        v0 = 0xffffff;
    }
    else
    {
        *(unsigned int *)&a0->field_58 = a1;
        return 1;
    }
    sub_a36abc(57, 234);
    return 0;
}
