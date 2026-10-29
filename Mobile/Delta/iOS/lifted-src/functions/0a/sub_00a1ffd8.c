/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1ffd8..0xa20028 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1ffd8_0 {
    char padding_0[96];
    long long field_60;
} st_a1ffd8_0;


long long sub_a1ffd8(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, st_a1ffd8_0 **a4)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*a4->field_60)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_sign.c", 31, "ECDSA_do_sign_ex");
        sub_a36abc(16, 152, 0);
        return 0;
    }
    goto *((void *)(*a4->field_60));
}
