/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bf120..0x9bf170 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9bf120_0 {
    char padding_0[240];
    unsigned int field_f0;
} st_9bf120_0;


void sub_9bf120(unsigned long a0, unsigned int a1, st_9bf120_0 *a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a2->field_f0 = (a1 >> 5) + 5;
    sub_9bee10();
    return;
}
