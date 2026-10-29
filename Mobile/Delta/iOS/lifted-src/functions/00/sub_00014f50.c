/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14f50..0x14f64 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_14f50_0 {
    unsigned int field_0;
    char field_4;
} st_14f50_0;


long long sub_14f50(st_14f50_0 *a0, st_14f50_0 *a1)
{
    if (!a0->field_4)
        a0 = a1;
    return a0->field_0;
}
