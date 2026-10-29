/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa20124..0xa20174 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a20124_0 {
    char padding_0[104];
    long long field_68;
} st_a20124_0;


unsigned int sub_a20124(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, st_a20124_0 **a5)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*a5->field_68)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_vrf.c", 47, "ECDSA_verify");
        sub_a36abc(16, 152, 0);
        return 0xffffffff;
    }
    goto *((void *)(*a5->field_68));
}
