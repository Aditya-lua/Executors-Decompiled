/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b59b4..0x1b59dc (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b59b4_0 {
    char padding_0[16];
    char field_10;
} st_1b59b4_0;


void sub_1b59b4(st_1b59b4_0 *a0)
{
    void* v0;  // x8

    if (a0->field_10 != 1)
    {
        memset(v0, 0, 24);
        return;
    }
}
