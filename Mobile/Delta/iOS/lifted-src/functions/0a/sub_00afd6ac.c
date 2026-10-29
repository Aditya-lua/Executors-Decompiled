/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafd6ac..0xafd704 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afd6ac_0 {
    unsigned long long field_0;
} st_afd6ac_0;

extern st_afd6ac_0 *g_f14330;

unsigned long long sub_afd6ac(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_975ffc();
    if (!g_f14330)
        return 0xffffffffffffffff;
    g_f14330();
}
