/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb41548..0xb4164c (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b41548_0 {
    long long field_0;
    char padding_8[8];
    unsigned int field_10;
    char padding_14[4];
    unsigned long long field_18;
} st_b41548_0;

typedef struct st_b41548_1 {
    struct st_b41548_1 *field_0;
} st_b41548_1;


st_b41548_1 ** sub_b41548(st_b41548_0 *a0, st_b41548_1 **a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_b41548_1 **v8;  // x0
    st_b41548_1 **v9;  // x0
    st_b41548_1 **v10;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (!*a1)
        return 1;
    if (sub_a6fbc4(a1, "bits"))
    {
        v8 = sub_a70ef8();
        if (!(unsigned int)v8)
        {
            return v8;
        }
        else if (0x1ff >= a0->field_18)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/keymgmt/rsa_kmgmt.c", 509, "rsa_gen_set_params");
            sub_a36abc(57, 171, 0);
            return 0;
        }
    }
    if (sub_a6fbc4(a1, "primes"))
    {
        v9 = sub_a70ef8();
        if (!(unsigned int)v9)
            return v9;
    }
    if (sub_a6fbc4(a1, "e"))
    {
        v10 = sub_a70f20();
        if (!(unsigned int)v10)
            return v10;
    }
    if (a0->field_10 == 0x1000)
        return sub_aae9d0(&a0[1].field_10, (char *)&a0[2].field_0 + 4, a1, a0->field_0) != 0;
    return 1;
}
