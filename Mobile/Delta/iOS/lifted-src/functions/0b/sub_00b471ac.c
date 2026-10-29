/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb471ac..0xb4721c (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b471ac_0 {
    long long field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    long long field_20;
    char padding_28[200];
    struct st_b471ac_0 *field_f0;
} st_b471ac_0;


void sub_b471ac(st_b471ac_0 *a0)
{
    st_b471ac_0 *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    if (a0)
    {
        v0 = &v1;
        v2 = a0->field_f0;
        if (v2)
        {
            sub_a4bca0(v2->field_0);
            sub_a4bca0(v2->field_8);
            sub_a4bca0(v2->field_10);
            sub_a4bbe4(v2->field_18);
            sub_a4bbe4(v2->field_20);
            sub_a6d4c0(v2, 176, "providers/implementations/rands/drbg_ctr.c", 669);
        }
    }
}
