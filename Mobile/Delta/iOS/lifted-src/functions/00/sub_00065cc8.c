/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x65cc8..0x65cfc (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_65cc8_0 {
    char padding_0[8];
    unsigned int field_8;
} st_65cc8_0;


long long sub_65cc8(st_65cc8_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    std::__1::mutex::lock(&a0[1].padding_0[4]);
    std::__1::mutex::unlock(&a0[1].padding_0[4]);
    return a0->field_8;
}
