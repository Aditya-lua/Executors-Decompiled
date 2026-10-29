/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4d7c..0x4da0 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4d7c_1 {
    char padding_0[64];
    struct st_4d7c_2 *field_40;
} st_4d7c_1;

typedef struct st_4d7c_0 {
    unsigned long long field_0;
} st_4d7c_0;

typedef struct st_4d7c_2 {
    struct st_4d7c_0 *field_0;
} st_4d7c_2;


st_4d7c_0 ** sub_4d7c(unsigned long a0, st_4d7c_1 *a1)
{
    if (!a1->field_40)
        return 0;
    goto *((void *)(*(long long *)*(long long *)a1->field_40));
}
