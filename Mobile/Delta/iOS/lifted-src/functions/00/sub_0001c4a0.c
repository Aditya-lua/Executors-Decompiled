/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c4a0..0x1c518 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c4a0_0 {
    unsigned int field_0;
} st_1c4a0_0;

typedef struct st_1c4a0_2 {
    unsigned long long field_0;
} st_1c4a0_2;

typedef struct st_1c4a0_1 {
    struct st_1c4a0_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_1c4a0_1;

extern st_1c4a0_1 g_e61fb8;

unsigned int * sub_1c4a0(st_1c4a0_0 **a0, int *a1)
{
    unsigned long v2;  // x8
    unsigned int *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0[2] <= a0[1])
    {
        v3 = sub_16928(a0);
        a0[1] = v3;
        return (char *)v3 - 80;
    }
    v2 = *a1;
    *(unsigned int *)a0[1] = v2;
    (&g_e61fb8.field_0)[v2]();
}
