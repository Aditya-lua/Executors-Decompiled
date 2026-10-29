/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9773a0..0x9773e4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9773a0_0 {
    char padding_0[64];
    long long field_40;
} st_9773a0_0;

typedef struct st_9773a0_1 {
    struct st_9773a0_0 *field_0;
    char padding_8[1056];
    long long field_428;
} st_9773a0_1;


long long sub_9773a0(st_9773a0_1 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_97b79c(a0->field_0->field_40))
        return sub_98390c(a0->field_428) != 0;
    return 1;
}
