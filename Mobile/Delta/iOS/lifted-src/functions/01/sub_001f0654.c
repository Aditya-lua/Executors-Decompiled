/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f0654..0x1f0698 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f0654_0 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned int field_10;
} st_1f0654_0;

extern char g_e73110;

unsigned long long sub_1f0654(st_1f0654_0 *a0, unsigned long long a1)
{
    unsigned long long t;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    t = std::runtime_error::runtime_error(a0, sub_1f2128(a1));
    a0->field_0 = &g_e73110;
    a0->field_10 = a1;
    return t;
}
