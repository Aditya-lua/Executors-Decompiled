/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e4d2c..0x9e4d58 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e4d2c_1 {
    unsigned long long field_0;
} st_9e4d2c_1;

typedef struct st_9e4d2c_0 {
    struct st_9e4d2c_1 *field_0;
    unsigned int field_8;
} st_9e4d2c_0;


unsigned long long sub_9e4d2c(st_9e4d2c_0 *a0)
{
    unsigned long long v0;  // 4102

    if ((int)a0->field_8 > 1)
        return 0xffffffffffffffff;
    v0 = arm64g_calculate_condition(19, a0->field_8, 1, 0);
    if (v0 & 1)
        return 0;
    return *(long long *)a0->field_0;
}
