/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x963ccc..0x963cf8 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_963ccc_1 {
    char padding_0[2304];
    struct st_963ccc_0 *field_900;
    char padding_908[216];
    unsigned int field_9e0;
} st_963ccc_1;

typedef struct st_963ccc_0 {
    char padding_0[856];
    char field_358;
} st_963ccc_0;


int sub_963ccc(st_963ccc_1 *a0)
{
    unsigned int v0;  // w8

    if (a0->field_900)
    {
        v0 = a0->field_900->field_358;
        if (3 >= v0 - 1)
            return 0x100 << ((char)v0 & 31);
    }
    return a0->field_9e0;
}
