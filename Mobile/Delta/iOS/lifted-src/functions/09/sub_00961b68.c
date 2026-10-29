/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x961b68..0x961b9c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_961b68_0 {
    unsigned int field_0;
    char padding_4[588];
    unsigned long long field_250;
} st_961b68_0;


int sub_961b68(st_961b68_0 *a0, st_961b68_0 *a1)
{
    if (a0->field_0 != a1->field_0)
    {
        return 1;
    }
    else if (a0->field_250 != a1->field_250)
    {
        return 1;
    }
}
