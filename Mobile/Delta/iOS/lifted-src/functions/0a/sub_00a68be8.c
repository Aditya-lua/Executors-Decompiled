/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa68be8..0xa68c3c (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a68be8_0 {
    char padding_0[20];
    struct st_a68be8_1 *field_14;
} st_a68be8_0;

typedef struct st_a68be8_1 {
    unsigned int field_0;
} st_a68be8_1;


unsigned int * sub_a68be8(unsigned long a0, unsigned long a1, unsigned int *a2, st_a68be8_0 *a3, unsigned int *a4)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a4)
    {
        sub_c680ec();
        return 0;
    }
    *a4 = 1;
    if (!a2 || *(int *)&(a3->padding_0)[1])
        return sub_a7a494() != 0;
    return 1;
    return sub_a7a494() != 0;
}
