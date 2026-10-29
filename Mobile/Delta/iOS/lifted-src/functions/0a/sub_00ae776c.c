/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae776c..0xae77d4 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae776c_0 {
    struct st_ae776c_0 *field_0;
} st_ae776c_0;


st_ae776c_0 ** sub_ae776c(unsigned long a0, st_ae776c_0 **a1)
{
    unsigned long v5;  // x8
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_ae776c_0 **v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
        return 0;
    v5 = *(int *)a1;
    if ((int)v5 < 1)
        return 0;
    v0 = v6;
    v1 = v7;
    v2 = &v4;
    v3 = v8;
    v9 = sub_a6bf4c(v5 + 1, "crypto/x509/v3_ia5.c", 0x22);
    if (!v9)
        return v9;
    _memcpy();
    *((char *)v9 + *(int *)a1) = 0;
    return v9;
}
