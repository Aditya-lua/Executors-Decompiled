/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa559d4..0xa559f0 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a559d4_0 {
    char padding_0[104];
    unsigned long long field_68;
} st_a559d4_0;


int sub_a559d4(st_a559d4_0 *a0, unsigned long a1, unsigned long a2)
{
    if (!a0->field_68)
        return 1;
    goto *((void *)(a0->field_68));
}
