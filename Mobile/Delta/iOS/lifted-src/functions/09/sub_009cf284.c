/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf284..0x9cf298 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf284_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_9cf284_1;

typedef struct st_9cf284_0 {
    unsigned int field_0;
} st_9cf284_0;


unsigned int sub_9cf284(st_9cf284_0 **a0, unsigned int a1, st_9cf284_1 *a2)
{
    unsigned int v0;  // w0

    v0 = *(int *)((char *)*a0 + a2->field_8);
    *(unsigned int *)((char *)*a0 + a2->field_8) = a1;
    return v0;
}
