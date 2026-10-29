/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb49f84..0xb49fe8 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b49f84_0 {
    long long field_0;
    char field_8;
    char padding_9[231];
    struct st_b49f84_0 *field_f0;
} st_b49f84_0;


void sub_b49f84(st_b49f84_0 *a0)
{
    st_b49f84_0 *v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    if (a0)
    {
        v0 = &v1;
        if (a0->field_f0)
        {
            v2 = a0->field_f0;
            sub_a57f0c(v2->field_0);
            sub_afe028(&v2->field_8);
            sub_a6d4c0(v2, 168, "providers/implementations/rands/drbg_hmac.c", 352);
        }
    }
}
