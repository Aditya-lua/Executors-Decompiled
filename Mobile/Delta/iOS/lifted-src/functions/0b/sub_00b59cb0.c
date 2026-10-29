/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb59cb0..0xb59d40 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b59cb0_0 {
    struct st_b59cb0_0 *field_0;
} st_b59cb0_0;


st_b59cb0_0 ** sub_b59cb0(st_b59cb0_0 **a0, st_b59cb0_0 **a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        if (a1 && *a1)
        {
            v0 = v5;
            v1 = v6;
            v2 = &v4;
            v3 = v7;
            if (!sub_a6fbc4(a1, "pad-type") || sub_a6ffcc())
                return 1;
            sub_a368c8();
            sub_a369bc("providers/implementations/digests/mdc2_prov.c", 0x33, "mdc2_set_ctx_params");
            sub_a36abc(57, 103, 0);
            return 0;
            return 1;
        }
        a0 = 1;
    }
    return (unsigned int)a0;
}
