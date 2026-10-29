/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa20084..0xa200d4 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a20084_0 {
    char padding_0[80];
    long long field_50;
} st_a20084_0;


long long sub_a20084(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, st_a20084_0 **a7)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*a7->field_50)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_sign.c", 46, "ECDSA_sign_ex");
        sub_a36abc(16, 152, 0);
        return 0;
    }
    goto *((void *)(*a7->field_50));
}
