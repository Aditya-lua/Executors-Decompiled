/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa20028..0xa20084 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a20028_0 {
    char padding_0[80];
    long long field_50;
} st_a20028_0;


long long sub_a20028(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, st_a20028_0 **a5)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*a5->field_50)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_sign.c", 46, "ECDSA_sign_ex");
        sub_a36abc(16, 152, 0);
        return 0;
    }
    goto *((void *)(*a5->field_50));
}
