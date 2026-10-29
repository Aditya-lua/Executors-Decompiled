/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7f6b0..0xa7f76c (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7f6b0_0 {
    char padding_0[8];
    long long field_8;
} st_a7f6b0_0;

extern unsigned long long g_a7f76c;
extern unsigned long long g_a7f7d8;

long long sub_a7f6b0(st_a7f6b0_0 *a0, unsigned int a1, long long a2, long long a3)
{
    unsigned long long *v3;  // x20
    char v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!sub_c68800(&v0, a2, a3, 0))
        return 0;
    if (a1 == 0x3ff00)
        v3 = &g_a7f76c;
    else
        v3 = &g_a7f7d8;
    if (!a0->field_8)
    {
        sub_a6eaf8(&v0);
        return 1;
    }
    v3();
}
