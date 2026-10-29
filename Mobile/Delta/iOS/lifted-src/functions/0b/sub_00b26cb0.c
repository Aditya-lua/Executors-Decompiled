/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb26cb0..0xb26da0 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b26cb0_0 {
    unsigned long long field_0;
} st_b26cb0_0;


unsigned long long * sub_b26cb0(st_b26cb0_0 **a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    st_b26cb0_0 **iter;  // x8
    unsigned long long *v3;  // w9
    unsigned long long *v4;  // x8
    st_b26cb0_0 **node;  // x9
    unsigned long long *v6;  // w10
    unsigned long long *v7;  // x22
    st_b26cb0_0 **iter1;  // x9
    unsigned long long *v9;  // w10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    iter = a0 + 1;
    v3 = (unsigned long long *)*(int *)((char *)iter - 8);
    if (*(int *)((char *)iter - 8))
    {
        do
        {
            if (v3 == 1)
            {
                v4 = *iter;
                goto LABEL_b26cf0;
            }
        } while ((iter += 2, v3 = (unsigned long long *)*(int *)((char *)iter - 8), *(int *)((char *)iter - 8)));
    }
    v4 = 0;
LABEL_b26cf0:
    node = a0 + 1;
    v6 = (unsigned long long *)*(int *)((char *)node - 8);
    if (*(int *)((char *)node - 8))
    {
        do
        {
            if (v6 == 10)
            {
                v7 = *node;
                goto LABEL_b26d1c;
            }
        } while ((node += 2, v6 = (unsigned long long *)*(int *)((char *)node - 8), *(int *)((char *)node - 8)));
    }
    v7 = 0;
LABEL_b26d1c:
    iter1 = a0 + 1;
    v9 = (unsigned long long *)*(int *)((char *)iter1 - 8);
    if (*(int *)((char *)iter1 - 8))
    {
        do
        {
            if (v9 == 40)
            {
                if (!v4)
                {
                    return 0;
                }
                else if (!*iter1)
                {
                    return 0;
                }
                else if (v7)
                {
                    v4();
                }
                else
                {
                    return 0;
                }
            }
        } while ((iter1 += 2, v9 = (unsigned long long *)*(int *)((char *)iter1 - 8), *(int *)((char *)iter1 - 8)));
    }
    return 0;
}
