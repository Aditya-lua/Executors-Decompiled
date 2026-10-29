/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa19e9c..0xa19fb4 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a19e9c_1 {
    char padding_0[72];
    struct st_a19e9c_0 *field_48;
} st_a19e9c_1;

typedef struct st_a19e9c_0 {
    struct st_a19e9c_0 *field_0;
} st_a19e9c_0;


st_a19e9c_0 ** sub_a19e9c(unsigned long a0, unsigned long long a1, unsigned long a2, st_a19e9c_1 **a3, unsigned long a4)
{
    long long v4;  // x1
    st_a19e9c_0 **v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = a1;
    if (!*a3->field_48)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_kmeth.c", 156, "ECDH_compute_key");
        v4 = 152;
    }
    else if (a1 > 0x7fffffff)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_kmeth.c", 160, "ECDH_compute_key");
        v4 = 161;
    }
    else
    {
        *a3->field_48();
    }
    sub_a36abc(16, v4, 0);
    return 0;
}
