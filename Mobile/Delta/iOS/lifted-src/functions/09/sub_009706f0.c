/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9706f0..0x970740 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9706f0_0 {
    char padding_0[8];
    long long field_8;
} st_9706f0_0;


unsigned long long * sub_9706f0(st_9706f0_0 *a0, unsigned long a1, unsigned long long *a2)
{
    unsigned int v0;  // [bp-0x24]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if ((int)sub_a64344(a0->field_8) < 1)
        return 0;
    if (!a2)
        return 1;
    *a2 = v0;
    return 1;
}
