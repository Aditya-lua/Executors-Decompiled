/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b7a60..0x1b7aa4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b7a60_0 {
    char padding_0[64];
    unsigned long long field_40;
} st_1b7a60_0;


long long sub_1b7a60(st_1b7a60_0 *a0)
{
    unsigned long long t;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    t = std::__1::chrono::steady_clock::now();
    return ((long long)((t - a0->field_40) * 4835703278458516699) >> 82) + ((t - a0->field_40) * 4835703278458516699 >> 127);
}
