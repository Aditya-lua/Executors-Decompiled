/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3ff7c..0xa400f8 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3ff7c_0 {
    char padding_0[48];
    struct st_a3ff7c_1 *field_30;
    char padding_38[96];
    struct st_a3ff7c_1 *field_98;
} st_a3ff7c_0;

typedef struct st_a3ff7c_2 {
    char padding_0[8];
    struct st_a3ff7c_0 *field_8;
    char padding_10[9];
    char field_19;
} st_a3ff7c_2;

typedef struct st_a3ff7c_1 {
    unsigned long long field_0;
} st_a3ff7c_1;


unsigned long long sub_a3ff7c(st_a3ff7c_2 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v3;  // x0
    st_a3ff7c_0 *v4;  // x8
    long long v5;  // x1
    unsigned long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!a0->field_8)
        return 0;
    v3 = sub_a50c70();
    if (v3 >> 31 & 1)
        return 0;
    v4 = a0->field_8;
    if (*(long long *)&v4->padding_38[56])
    {
        if (!v4->field_98)
        {
            sub_a368c8();
            v5 = 459;
        }
        else if (!(a0->field_19 >> 3 & 1))
        {
            v4->field_98();
        }
        else
        {
            sub_a368c8();
            v5 = 464;
        }
        sub_a369bc("crypto/evp/digest.c", v5, "EVP_DigestFinal_ex");
        sub_a36abc(6, 188, 0);
        return 0;
    }
    if (65 <= (unsigned int)v3)
        sub_a69928("assertion failed: mdsize <= EVP_MAX_MD_SIZE", "crypto/evp/digest.c", 485);
    v4->field_30();
}
