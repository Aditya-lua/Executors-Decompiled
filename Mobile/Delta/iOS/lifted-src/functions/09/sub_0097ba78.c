/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97ba78..0x97ba98 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97ba78_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_97ba78_0;


int sub_97ba78(st_97ba78_0 *a0, unsigned long a1)
{
    if (a1 <= a0->field_10)
        return 0;
    a0->field_10 = a1;
    return 1;
}
