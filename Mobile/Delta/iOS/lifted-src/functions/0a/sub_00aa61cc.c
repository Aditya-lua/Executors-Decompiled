/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa61cc..0xaa61ec (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa61cc_0 {
    int field_0;
} st_aa61cc_0;

unsigned long long sub_aa61cc(st_aa61cc_0 **a0, st_aa61cc_0 **a1)
{
    if (*(int *)*a1 > *(int *)*a0)
        return 0xffffffff;
    return *(int *)*a0 > *(int *)*a1;
}
