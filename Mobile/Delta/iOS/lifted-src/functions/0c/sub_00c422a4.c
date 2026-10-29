/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc422a4..0xc422f8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c422a4_0 {
    char padding_0[8];
    char field_8;
} st_c422a4_0;

extern unsigned long long g_f14410;

void sub_c422a4(st_c422a4_0 *a0, unsigned long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    if (!(a1 & 1) && g_f14410 & 0x7fffffffffffffff)
    {
        v0 = &v1;
        if (!(sub_c76a10() & 1))
            a0->field_8 = 1;
    }
}
