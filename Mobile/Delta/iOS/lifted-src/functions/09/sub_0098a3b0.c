/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98a3b0..0x98a3d4 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98a3b0_0 {
    char padding_0[128];
    unsigned long long field_80;
    unsigned long long field_88;
    char padding_90[24];
    char field_a8;
} st_98a3b0_0;


int sub_98a3b0(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long long *a3, unsigned long long *a4)
{
    unsigned long long v1;  // x10
    st_98a3b0_0 *v0;  // [bp+0x0]

    v1 = v0->field_88;
    *a3 = v0->field_80;
    *a4 = v1;
    v0->field_a8 = v0->field_a8 | 8;
    return 1;
}
