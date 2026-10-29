/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5b90..0x9e5bc4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5b90_0 {
    struct st_9e5b90_1 *field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
} st_9e5b90_0;

typedef struct st_9e5b90_1 {
    unsigned long long field_0;
} st_9e5b90_1;


long long sub_9e5b90(st_9e5b90_0 *a0)
{
    if (a0->field_8 != 1)
    {
        return 0;
    }
    else if (*(long long *)a0->field_0 == 1)
    {
        return !a0->field_10;
    }
    else
    {
        return 0;
    }
}
