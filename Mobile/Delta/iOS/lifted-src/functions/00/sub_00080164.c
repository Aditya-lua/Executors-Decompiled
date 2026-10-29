/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x80164..0x80188 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_80164_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_80164_0;


void sub_80164(unsigned long a0, st_80164_0 *a1)
{
    if (!a0)
    {
        return;
    }
    else if (a1->field_8)
    {
        goto *((void *)(a1->field_8));
    }
}
