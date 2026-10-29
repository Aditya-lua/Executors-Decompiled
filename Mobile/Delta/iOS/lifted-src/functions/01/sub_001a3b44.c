/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a3b44..0x1a3b88 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a3b44_0 {
    char padding_0[56];
    unsigned long long field_38;
} st_1a3b44_0;


long long sub_1a3b44(st_1a3b44_0 *a0)
{
    unsigned long long t;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    t = std::__1::chrono::steady_clock::now();
    return ((long long)((t - a0->field_38) * 4835703278458516699) >> 82) + ((t - a0->field_38) * 4835703278458516699 >> 127);
}
