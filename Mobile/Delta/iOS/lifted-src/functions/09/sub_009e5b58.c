/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5b58..0x9e5b90 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5b58_1 {
    unsigned long long field_0;
} st_9e5b58_1;

typedef struct st_9e5b58_0 {
    struct st_9e5b58_1 *field_0;
    unsigned int field_8;
} st_9e5b58_0;


long long sub_9e5b58(st_9e5b58_0 *a0, unsigned long a1)
{
    if (a0->field_8 == 1 && *(long long *)a0->field_0 == a1)
        return 1;
    if (!a1)
        return !a0->field_8;
    return 0;
}
