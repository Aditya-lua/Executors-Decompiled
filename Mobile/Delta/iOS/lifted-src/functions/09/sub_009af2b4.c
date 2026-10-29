/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9af2b4..0x9af2d0 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9af2b4_0 {
    char padding_0[2304];
    struct st_9af2b4_1 *field_900;
} st_9af2b4_0;

typedef struct st_9af2b4_1 {
    char padding_0[696];
    unsigned long long field_2b8;
    unsigned long long field_2c0;
} st_9af2b4_1;


long long sub_9af2b4(st_9af2b4_0 *a0)
{
    if (a0->field_900->field_2b8)
    {
        return a0->field_900->field_2b8;
    }
    else if (!a0->field_900->field_2c0)
    {
        return a0->field_900->field_2c0;
    }
}
