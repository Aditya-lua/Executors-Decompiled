/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0786c..0xb07900 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0786c_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
} st_b0786c_0;

typedef struct st_b0786c_1 {
    char padding_0[104];
    unsigned int field_68;
} st_b0786c_1;


unsigned long long sub_b0786c(st_b0786c_1 *a0, long long a1)
{
    st_b0786c_0 *v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "cts_mode");
    if (v2)
    {
        if (v2->field_8 == 4 && (v3 = sub_b093f4(v2->field_10), !(v3 >> 31 & 1)))
        {
            a0->field_68 = v3;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_camellia_cts.inc", 0x55, "camellia_cbc_cts_set_ctx_params");
            sub_a36abc(57, 104, 0);
            return 0;
        }
    }
}
