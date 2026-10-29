/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4322c..0xb43280 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4322c_0 {
    char padding_0[128];
    char field_80;
} st_b4322c_0;


void sub_b4322c(st_b4322c_0 *a0, unsigned long a1, unsigned long long *a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return;
    *a2 = a0->field_80;
}
