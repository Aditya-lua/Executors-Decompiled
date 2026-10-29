/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5d0c8..0xa5d15c (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5d0c8_0 {
    char padding_0[288];
    struct st_a5d0c8_1 *field_120;
} st_a5d0c8_0;

typedef struct st_a5d0c8_1 {
    unsigned long long field_0;
} st_a5d0c8_1;

typedef struct st_a5d0c8_2 {
    struct st_a5d0c8_2 *field_0;
    struct st_a5d0c8_0 *field_8;
    char padding_10[80];
    struct st_a5d0c8_2 *field_60;
} st_a5d0c8_2;


st_a5d0c8_2 * sub_a5d0c8(st_a5d0c8_2 *a0, unsigned long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/pmeth_gn.c", 439, "EVP_PKEY_export");
        sub_a36abc(6, 0xc0102, 0);
        return 0;
    }
    else if ((int)a0->field_0 && !a0->field_60)
    {
        v0 = a2;
        v1 = a3;
        a0->field_8->field_120();
    }
}
