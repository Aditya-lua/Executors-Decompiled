/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad761c..0xad763c (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad761c_1 {
    struct st_ad761c_0 *field_0;
    unsigned long long field_8;
    char padding_10[44];
    unsigned int field_3c;
} st_ad761c_1;

typedef struct st_ad761c_0 {
    char padding_0[72];
    unsigned long long field_48;
} st_ad761c_0;


int sub_ad761c(st_ad761c_1 *a0)
{
    if (a0->field_8)
        return a0->field_3c;
    goto *((void *)(a0->field_0->field_48));
}
