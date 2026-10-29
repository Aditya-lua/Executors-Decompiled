/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4ad38..0xb4ad7c (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4ad38_0 {
    unsigned long long field_0;
    char padding_8[4];
    struct st_b4ad38_0 *field_c;
    char padding_14[4];
    unsigned long long field_18;
} st_b4ad38_0;


int sub_b4ad38(unsigned long a0)
{
    st_b4ad38_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(88, "providers/implementations/rands/test_rng.c", 59);
    if (v2)
    {
        *(unsigned long long *)v2->padding_14 = 0x7fffffff;
        v2->field_0 = a0;
        *(unsigned int *)(v2->padding_8)[1] = 0;
    }
    return (unsigned int)v2;
}
