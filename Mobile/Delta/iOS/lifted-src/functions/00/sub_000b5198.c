/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5198..0xb5210 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5198_0 {
    struct st_b5198_0 *field_0;
} st_b5198_0;


unsigned int * sub_b5198(unsigned int *a0, unsigned int a1, unsigned int a2, st_b5198_0 **a3)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    unsigned int v2;  // w8

    v0 = a1 - a0[2];
    if (a3)
    {
        if (*(int *)a3 + a2 >= v0)
            return a0;
    }
    else
    {
        if (v0 <= a2)
            return a0;
    }
    v1 = v0 - a2;
    v2 = a0[7];
    if (v2 >= v1)
    {
        if (a0[6] < v2)
            goto LABEL_b5200;
LABEL_b51e4:
        if (!a3)
            return a0;
    }
    else
    {
        a0[7] = v1;
        v2 = v1;
        if (v2 <= a0[6])
            goto LABEL_b51e4;
LABEL_b5200:
        a0[6] = v2;
        if (!a3)
            return a0;
    }
    *(unsigned int *)a3 = 0;
    return a0;
}
