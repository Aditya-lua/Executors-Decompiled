/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2df04..0xb2df7c (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2df04_0 {
    char padding_0[168];
    unsigned long long field_a8;
} st_b2df04_0;


int sub_b2df04(unsigned long a0)
{
    st_b2df04_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_a6bffc(216, "providers/implementations/kdfs/hmacdrbg_kdf.c", 47);
        if (v2)
        {
            v2->field_a8 = a0;
            return (unsigned int)v2;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/hmacdrbg_kdf.c", 49, "hmac_drbg_kdf_new");
        sub_a36abc(57, 0xc0100, 0);
    }
    return 0;
}
