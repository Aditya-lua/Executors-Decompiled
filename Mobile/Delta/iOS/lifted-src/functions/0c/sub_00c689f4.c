/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc689f4..0xc68a08 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c689f4_0 {
    char padding_0[32];
    unsigned int field_20;
} st_c689f4_0;

typedef struct st_c689f4_1 {
    char padding_0[40];
    struct st_c689f4_0 *field_28;
} st_c689f4_1;


long long sub_c689f4(st_c689f4_1 *a0, unsigned int a1)
{
    if (a0->field_28)
        a0->field_28->field_20 = a1;
}
