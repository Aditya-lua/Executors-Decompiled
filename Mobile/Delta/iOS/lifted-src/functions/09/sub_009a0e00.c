/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a0e00..0x9a0e28 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a0e00_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_9a0e00_0;


int sub_9a0e00(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    st_9a0e00_0 *v0;  // [bp+0x0]

    if (!v0->field_8)
        return 1;
    goto *((void *)(v0->field_8));
}
