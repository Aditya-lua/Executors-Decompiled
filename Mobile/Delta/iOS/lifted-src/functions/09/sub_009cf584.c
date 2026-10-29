/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf584..0x9cf6a4 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf584_0 {
    char padding_0[1];
    char field_1;
    char padding_2[30];
    struct st_9cf584_1 *field_20;
} st_9cf584_0;

typedef struct st_9cf584_1 {
    unsigned long long field_0;
} st_9cf584_1;


st_9cf584_0 * sub_9cf584(unsigned long a0, st_9cf584_0 *a1, unsigned long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a1->field_1 & 3))
        return a1;
    a1->field_20();
}
