/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa403bc..0xa40484 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a403bc_1 {
    char padding_0[8];
    struct st_a403bc_0 *field_8;
} st_a403bc_1;

typedef struct st_a403bc_0 {
    unsigned long long field_0;
    char padding_8[104];
    struct st_a403bc_0 *field_70;
    char padding_78[40];
    struct st_a403bc_0 *field_a0;
} st_a403bc_0;


int sub_a403bc(st_a403bc_1 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v4;  // x30
    st_a403bc_0 *v5;  // x8
    long long v6;  // x1
    unsigned long long v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    v1 = &v3;
    v2 = v4;
    v0 = a2;
    v5 = a0->field_8;
    if (!v5)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/digest.c", 558, "EVP_DigestSqueeze");
        v6 = 218;
    }
    else if (!v5->field_70)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/digest.c", 563, "EVP_DigestSqueeze");
        v6 = 148;
    }
    else if (v5->field_a0)
    {
        v5->field_a0();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/digest.c", 568, "EVP_DigestSqueeze");
        v6 = 144;
    }
    sub_a36abc(6, v6, 0);
    return sub_a40478(0);
}
