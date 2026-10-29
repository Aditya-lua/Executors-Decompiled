/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6a774..0xc6a7d4 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6a774_0 {
    char padding_0[176];
    unsigned int field_b0;
} st_c6a774_0;


long long sub_c6a774(st_c6a774_0 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a368c8();
    sub_a369bc("crypto/x509/x509_vfy.c", 3617, "build_chain");
    sub_a36abc(11, 0xc0103, 0);
    a0->field_b0 = 1;
    return sub_ad6020(a1);
}
