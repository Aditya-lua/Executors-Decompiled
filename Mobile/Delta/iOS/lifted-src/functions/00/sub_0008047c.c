/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8047c..0x804fc (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8047c_0 {
    struct st_8047c_0 *field_0;
} st_8047c_0;


unsigned int * sub_8047c(unsigned int *a0, unsigned int a1, unsigned int a2, st_8047c_0 **a3, st_8047c_0 **a4)
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
            goto LABEL_804f0;
LABEL_804c8:
        if (a3)
            goto LABEL_804cc;
    }
    else
    {
        a0[7] = v1;
        v2 = v1;
        if (v2 <= a0[6])
            goto LABEL_804c8;
LABEL_804f0:
        a0[6] = v2;
        if (a3)
        {
LABEL_804cc:
            *(unsigned int *)a3 = 0;
        }
    }
    if (a4)
    {
        *a4 = 0;
        return a0;
    }
    return a0;
}
