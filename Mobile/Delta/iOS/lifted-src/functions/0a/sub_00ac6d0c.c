/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac6d0c..0xac6da0 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac6d0c_0 {
    char padding_0[24];
    struct st_ac6d0c_1 *field_18;
} st_ac6d0c_0;

typedef struct st_ac6d0c_1 {
    int field_0;
} st_ac6d0c_1;

extern long long g_eb4120;

st_ac6d0c_0 * sub_ac6d0c(unsigned long a0, long long a1, unsigned long long *a2)
{
    st_ac6d0c_0 *v3;  // x0
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0;
    v3 = sub_9cae2c(0, &v0, a1, &g_eb4120);
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/sm2/sm2_crypt.c", 77, "ossl_sm2_plaintext_size");
        sub_a36abc(53, 104, 0);
        return 0;
    }
    *a2 = *(int *)v3->field_18;
    sub_9cd960();
    return 1;
}
