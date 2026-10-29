/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa69544..0xa69594 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a69544_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_a69544_0;


long long sub_a69544(st_a69544_0 *a0, unsigned long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a98e90(a0->field_8, a0->field_0))
        return 0;
    sub_9c7b68();
}
