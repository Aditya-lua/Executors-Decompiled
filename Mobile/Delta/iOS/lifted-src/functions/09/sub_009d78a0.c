/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d78a0..0x9d7910 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d78a0_1 {
    char padding_0[56];
    unsigned int field_38;
    char padding_3c[4];
    struct st_9d78a0_0 *field_40;
} st_9d78a0_1;

typedef struct st_9d78a0_0 {
    char padding_0[109];
    char field_6d;
} st_9d78a0_0;


long long sub_9d78a0(st_9d78a0_1 *a0, unsigned int a1)
{
    unsigned long v3;  // x0
    long long v4;  // x1
    long long v5;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    switch (a0->field_40->field_6d)
    {
    case 30:
        v3 = a0->field_38;
        v4 = 41;
        v5 = 61;
        break;
    case 2:
        v3 = a0->field_38;
        v4 = 0;
        v5 = 26;
        break;
    default:
        return 0;
    }
    return ~(unsigned int)_setsockopt(v3, v4, v5, &/* unsupported instruction */, 4) >> 31;
}
