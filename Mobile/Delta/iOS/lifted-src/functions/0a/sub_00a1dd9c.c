/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1dd9c..0xa1de04 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1dd9c_0 {
    char padding_0[152];
    struct st_a1dd9c_1 *field_98;
} st_a1dd9c_0;

typedef struct st_a1dd9c_1 {
    long long field_0;
    char padding_8[8];
    long long field_10;
    char padding_18[16];
    long long field_28;
} st_a1dd9c_1;


st_a1dd9c_0 * sub_a1dd9c(st_a1dd9c_0 *a0)
{
    long long *v2;  // x20
    st_a1dd9c_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a0->field_98->field_0;
    if (!v2)
        return a0;
    sub_a1a174(*v2);
    sub_a18c08(v2[2]);
    sub_a6c2e4(v2[5], "crypto/ec/ec_pmeth.c", 98);
    v3 = sub_a6c2e4(v2, "crypto/ec/ec_pmeth.c", 99);
    a0->field_98 = 0;
    return v3;
}
