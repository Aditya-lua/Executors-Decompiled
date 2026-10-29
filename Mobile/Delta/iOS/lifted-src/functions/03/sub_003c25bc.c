/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c25bc..0x3c25f8 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c25bc_0 {
    char padding_0[12];
    unsigned int field_c;
} st_3c25bc_0;

typedef struct st_3c25bc_1 {
    char padding_0[88];
    struct st_3c25bc_0 *field_58;
} st_3c25bc_1;

typedef struct st_3c25bc_2 {
    char padding_0[248];
    unsigned long long field_f8;
} st_3c25bc_2;

extern st_3c25bc_2 *g_f0d3d8;

long long sub_3c25bc(st_3c25bc_1 *a0, unsigned long a1)
{
    a0->field_58->field_c = 0;
    a0->field_58 = a0->field_58 + 1;
    goto *((void *)(g_f0d3d8->field_f8));
}
