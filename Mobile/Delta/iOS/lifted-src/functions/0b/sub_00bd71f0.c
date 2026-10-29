/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd71f0..0xbd7230 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd71f0_0 {
    struct st_bd71f0_1 *field_0;
    long long field_8;
} st_bd71f0_0;

typedef struct st_bd71f0_1 {
    unsigned long long field_0;
} st_bd71f0_1;

extern long long g_efa3f0;

long long sub_bd71f0(st_bd71f0_0 **a0, unsigned long long *a1, unsigned long a2)
{
    long long v3;  // x0
    unsigned long long v4;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v3 = *(long long *)(*a1 - a2 * 8 - 8);
    if ((unsigned long long)*a0->field_8 > (unsigned long long)v3)
        return *(long long *)&*a0->field_0[2 * v3];
    v0 = &v2;
    v1 = v4;
    sub_c73c94(v3, *a0->field_8, &g_efa3f0);
}
