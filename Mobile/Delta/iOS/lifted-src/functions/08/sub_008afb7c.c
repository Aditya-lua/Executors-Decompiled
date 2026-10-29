/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8afb7c..0x8afb98 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8afb7c_0 {
    char padding_0[2];
    char field_2;
} st_8afb7c_0;


int sub_8afb7c(st_8afb7c_0 *a0)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // 4140

    v0 = a0->field_2;
    v1 = arm64g_calculate_condition(1, v0 + (v0 & 127 ^ 0xffffff7f) & 0xffffffff, 129, 0);
    return !(v1 & 1);
}
