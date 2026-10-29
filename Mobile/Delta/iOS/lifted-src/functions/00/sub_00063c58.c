/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63c58..0x63c70 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_63c58_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_63c58_0;


void sub_63c58(unsigned long a0, st_63c58_0 **a1)
{
    if (!a1)
        return;
    goto *((void *)(*a1->field_8));
}
