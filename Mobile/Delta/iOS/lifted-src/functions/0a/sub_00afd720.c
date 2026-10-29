/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafd720..0xafd760 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afd720_0 {
    unsigned long long field_0;
} st_afd720_0;

extern st_afd720_0 *g_f14340;

int sub_afd720(long long a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9d3d2c();
    sub_975ffc(a0);
    if (!g_f14340)
        return 1;
    g_f14340();
}
