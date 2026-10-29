/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf93bc..0xaf949c (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af93bc_1 {
    uint128_t field_0;
    unsigned int field_10;
} st_af93bc_1;

typedef struct st_af93bc_0 {
    char padding_0[132];
    unsigned int field_84;
    char padding_88[48];
    uint128_t field_b8;
    unsigned int field_c8;
} st_af93bc_0;


double sub_af93bc(st_af93bc_0 *a0, unsigned int *a1, st_af93bc_1 *a2, unsigned int *a3)
{
    uint128_t v2;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x_all.c", 612, "X509_CRL_digest");
        sub_a36abc(11, 0xc0102, 0);
    }
    else if (sub_a509f4(a1, "SHA1") && (a0->field_84 & 0x100100) == 0x100)
    {
        if (a3)
            *a3 = 20;
        v2 = *(int128_t *)&(a0->padding_88)[1];
        a2->field_10 = *(int *)((char *)&a0->field_b8 + 8);
        a2->field_0 = v2;
    }
    else
    {
        sub_af9990();
    }
    return (unsigned long long)v2;
}
