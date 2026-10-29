/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4af7c..0xb4aff0 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4af7c_0 {
    char padding_0[72];
    struct st_b4af7c_0 *field_48;
} st_b4af7c_0;


st_b4af7c_0 * sub_b4af7c(st_b4af7c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_b4af7c_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        return 1;
    }
    else if (a0->field_48)
    {
        return 1;
    }
    else
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_a7c11c();
        a0->field_48 = v8;
        if (!v8)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/test_rng.c", 308, "test_rng_enable_locking");
            sub_a36abc(57, 180, 0);
            return 0;
        }
        return 1;
    }
}
