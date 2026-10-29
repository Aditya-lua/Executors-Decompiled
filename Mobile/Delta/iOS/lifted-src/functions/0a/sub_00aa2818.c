/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa2818..0xaa2840 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa2818_0 {
    char padding_0[56];
    long long field_38;
} st_aa2818_0;


int sub_aa2818(unsigned int a0, st_aa2818_0 **a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0 != 3)
        return 1;
    v0 = &v2;
    v1 = v3;
    sub_a5a4c8(*a1->field_38);
    return 1;
}
