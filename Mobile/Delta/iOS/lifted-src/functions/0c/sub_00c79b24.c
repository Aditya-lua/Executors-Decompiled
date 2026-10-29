/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc79b24..0xc79b68 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c79b24_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_c79b24_0;

typedef struct st_c79b24_1 {
    struct st_c79b24_1 *field_0;
    struct st_c79b24_1 *field_8;
    unsigned long long field_10;
} st_c79b24_1;


long long sub_c79b24(unsigned long a0, unsigned long a1)
{
    st_c79b24_0 *v0;  // x8
    unsigned long long v1;  // x9
    st_c79b24_1 *v2;  // x10
    st_c79b24_1 *v3;  // x10
    unsigned long long v4;  // 4102

    v0 = a1 & 0xfffffffffffffff0;
    v1 = v0->field_10;
    if (!v1)
    {
        v2 = a1 & 0xfffffffffffffff0;
        do
        {
            v3 = v2->field_0;
            v3->field_8 = v2;
            v1 = v3->field_10;
            v2 = v3;
        } while (!v2->field_10);
    }
    v0->field_10 = v1;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v4 = arm64g_calculate_condition(4, /* unsupported instruction */, 16, 0);
    if (!(v4 & 1))
        return a0;
}
