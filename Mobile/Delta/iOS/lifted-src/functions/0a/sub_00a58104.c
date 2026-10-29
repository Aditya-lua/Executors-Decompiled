/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa58104..0xa58164 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a58104_0 {
    char padding_0[64];
    long long field_40;
} st_a58104_0;


long long sub_a58104(st_a58104_0 **a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*a0->field_40)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/evp/mac_lib.c", 0x77, "EVP_MAC_init");
        sub_a36abc(0x80006, 0x8010c, 0);
        return 0;
    }
    goto *((void *)(*a0->field_40));
}
