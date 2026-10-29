/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3fcb8..0xb3fdcc (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3fcb8_0 {
    unsigned long long field_0;
    long long field_8;
} st_b3fcb8_0;


long long sub_b3fcb8(long long a0, st_b3fcb8_0 **a1)
{
    long long v3;  // x20
    long long v4;  // x0
    long long v5;  // x22
    long long v6;  // w0
    long long v7;  // x1
    long long v8;  // x0
    unsigned long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = *a1->field_8;
    v4 = sub_a6bf4c(v3, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 367);
    if (v4)
    {
        v5 = v4;
        if (sub_a830a4())
        {
            v6 = (unsigned int)_memcmp(v5, a0, v3);
            v7 = v3;
            v8 = sub_a6c4e8(v5, v7, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 373);
            if (!v6)
                return 1;
        }
        else
        {
            v7 = v3;
            v8 = sub_a6c4e8(v5, v7, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 373);
        }
        sub_a368c8(v8, v7, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 373);
        sub_a369bc("providers/implementations/keymgmt/ml_kem_kmgmt.c", 378, "check_prvenc");
        v0 = *a1->field_0;
        sub_a36abc(57, 158, "explicit %s private key does not match seed");
    }
    else
    {
        sub_a6c4e8();
    }
    sub_a82b08(a1);
    return 0;
}
