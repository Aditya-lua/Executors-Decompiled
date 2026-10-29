/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafbf84..0xafc0ac (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afbf84_0 {
    struct st_afbf84_0 *field_0;
    struct st_afbf84_0 *field_8;
    long long field_10;
    unsigned long long field_18;
    struct st_afbf84_0 *field_20;
} st_afbf84_0;


int sub_afbf84(st_afbf84_0 **a0, unsigned long a1, unsigned long a2, st_afbf84_0 *a3)
{
    st_afbf84_0 *v2;  // x0
    st_afbf84_0 *v3;  // x19
    st_afbf84_0 *v4;  // x0
    st_afbf84_0 *v5;  // x0
    st_afbf84_0 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(48, "crypto/x509/x_pubkey.c", 114);
    if (v2)
    {
        v3 = v2;
        if ((v2->field_0 || (v4 = sub_9cf6bc(), v3->field_0 = v4, v4)) && (v3->field_8 || (v5 = sub_9cf14c(), v3->field_8 = v5, v5)) && !(v3->field_18 = a2, sub_a6c2e4(v3->field_20, "crypto/x509/x_pubkey.c", 52), v3->field_20 = 0, a3 && !(v6 = sub_a6d9b4(a3, "crypto/x509/x_pubkey.c", 55), v3->field_20 = v6, v6)))
        {
            *a0 = v3;
            v2 = 1;
        }
        else
        {
            sub_9cf6c8(v3->field_0);
            sub_9cf0f4(v3->field_8);
            sub_a5a4c8(v3->field_10);
            sub_a6c2e4(v3->field_20, "crypto/x509/x_pubkey.c", 93);
            sub_a368c8(sub_a6c2e4(v3, "crypto/x509/x_pubkey.c", 94), "crypto/x509/x_pubkey.c", 94);
            sub_a369bc("crypto/x509/x_pubkey.c", 120, "x509_pubkey_ex_new_ex");
            sub_a36abc(13, 0x8000b, 0);
            v2 = 0;
        }
    }
    return (unsigned int)v2;
}
