/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb45924..0xb45a18 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b45924_0 {
    char padding_0[120];
    unsigned int field_78;
} st_b45924_0;


long long sub_b45924(st_b45924_0 *a0, long long *a1, long long a2, long long a3, long long a4, long long a5)
{
    long long v3;  // x8
    long long v4;  // x0
    long long v5;  // x23
    long long v6;  // x1
    st_b45924_0 *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0;
    if (a2 < 0)
        v3 = 0;
    else
        v3 = (unsigned long long)(a2 + 7) >> 3;
    if ((unsigned long long)a3 < (unsigned long long)v3)
        a3 = v3;
    if ((unsigned long long)a3 < (unsigned long long)a4)
        a4 = a3;
    v4 = sub_a6c610();
    if (v4)
    {
        v5 = v4;
        if (sub_b45a18(a0, v5, a4, a0->field_78, a5, &v0, 8))
        {
            *a1 = v5;
            return a4;
        }
        v6 = a4;
        sub_a368c8(sub_a6d4c0(v5, v6, "providers/implementations/rands/drbg.c", 177), v6, "providers/implementations/rands/drbg.c", 177);
        sub_a369bc("providers/implementations/rands/drbg.c", 178, "ossl_drbg_get_seed");
        sub_a36abc(57, 191, 0);
    }
    return 0;
}
