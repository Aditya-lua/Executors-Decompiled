/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb48fe0..0xb49038 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b48fe0_0 {
    char padding_0[24];
    long long field_18;
    char padding_20[208];
    struct st_b48fe0_0 *field_f0;
} st_b48fe0_0;


void sub_b48fe0(st_b48fe0_0 *a0)
{
    st_b48fe0_0 *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    if (a0)
    {
        v0 = &v1;
        v2 = a0->field_f0;
        if (v2)
        {
            sub_a3f73c(v2->field_18);
            sub_afe028(v2);
            sub_a6d4c0(v2, 376, "providers/implementations/rands/drbg_hash.c", 460);
        }
    }
}
