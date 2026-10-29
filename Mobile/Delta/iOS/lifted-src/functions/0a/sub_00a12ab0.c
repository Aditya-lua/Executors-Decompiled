/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa12ab0..0xa12ad0 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a12ab0_0 {
    char padding_0[32];
    long long field_20;
    unsigned int field_28;
} st_a12ab0_0;


int sub_a12ab0(unsigned long a0, st_a12ab0_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a1->field_28 = 0;
    sub_9e5b4c(a1->field_20);
    return 1;
}
