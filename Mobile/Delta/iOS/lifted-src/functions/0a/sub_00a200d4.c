/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa200d4..0xa20124 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a200d4_0 {
    char padding_0[112];
    long long field_70;
} st_a200d4_0;


unsigned int sub_a200d4(unsigned long a0, unsigned long a1, unsigned long a2, st_a200d4_0 **a3)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*a3->field_70)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_vrf.c", 31, "ECDSA_do_verify");
        sub_a36abc(16, 152, 0);
        return 0xffffffff;
    }
    goto *((void *)(*a3->field_70));
}
