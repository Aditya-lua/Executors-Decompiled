/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2bd70..0x2bd8c (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2bd70_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[104];
    struct st_2bd70_1 *field_78;
} st_2bd70_0;

typedef struct st_2bd70_1 {
    unsigned int field_0;
} st_2bd70_1;


long long sub_2bd70(st_2bd70_0 *a0, int a1)
{
    return *(char *)(a0->field_8 + *(int *)&a0->field_78[a1] * 0x88 + 26);
}
