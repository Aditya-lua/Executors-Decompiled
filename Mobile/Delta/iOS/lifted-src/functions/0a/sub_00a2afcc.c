/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2afcc..0xa2b050 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2afcc_1 {
    unsigned int field_0;
} st_a2afcc_1;

typedef struct st_a2afcc_0 {
    char padding_0[8];
    struct st_a2afcc_1 *field_8;
    char padding_10[80];
    long long field_60;
} st_a2afcc_0;


int sub_a2afcc(st_a2afcc_0 *a0, unsigned long a1, unsigned long a2)
{
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_60)
        sub_a7a42c(sub_975ff4(a0->field_60));
    v3 = sub_a2a41c(0);
    if (v3)
    {
        sub_a5ab14(a0, *(int *)a0->field_8, v3);
        v3 = 1;
    }
    return v3;
}
