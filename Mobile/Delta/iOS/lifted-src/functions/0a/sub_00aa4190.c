/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa4190..0xaa41fc (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa4190_0 {
    char padding_0[40];
    unsigned long long field_28;
    long long field_30;
} st_aa4190_0;


long long sub_aa4190(st_aa4190_0 *a0, st_aa4190_0 *a1)
{
    long long v2;  // x20
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_30;
    a1->field_28 = a0->field_28;
    if (a1->field_30)
    {
        sub_a6c2e4(a1->field_30, "crypto/pkcs7/pk7_lib.c", 497);
        a1->field_30 = 0;
    }
    if (v2)
    {
        v3 = sub_a6d9b4(v2, "crypto/pkcs7/pk7_lib.c", 501);
        a1->field_30 = v3;
        if (!v3)
            return v3;
    }
    sub_aa3fc0(a1);
    return 1;
}
