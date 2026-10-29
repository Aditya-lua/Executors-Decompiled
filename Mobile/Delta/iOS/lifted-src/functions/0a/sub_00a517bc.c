/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa517bc..0xa51810 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a517bc_0 {
    char padding_0[104];
    long long field_68;
} st_a517bc_0;


long long sub_a517bc(st_a517bc_0 **a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*a0->field_68)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/evp/evp_rand.c", 98, "EVP_RAND_enable_locking");
        sub_a36abc(6, 213, 0);
        return 0;
    }
    goto *((void *)(*a0->field_68));
}
