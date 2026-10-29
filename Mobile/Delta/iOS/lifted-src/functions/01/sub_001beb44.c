/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1beb44..0x1beb64 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1beb44_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
} st_1beb44_0;


long long sub_1beb44(st_1beb44_0 *a0)
{
    if (a0->field_10 != 1)
        return 0;
    return a0->field_8 - a0->field_0;
}
