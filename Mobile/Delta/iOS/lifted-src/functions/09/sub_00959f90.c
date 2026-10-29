/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x959f90..0x95a098 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_959f90_1 {
    char padding_0[352];
    unsigned long long field_160;
    char padding_168[1320];
    struct st_959f90_0 *field_690;
} st_959f90_1;

typedef struct st_959f90_0 {
    struct st_959f90_0 *field_0;
} st_959f90_0;

extern st_959f90_0 *g_d27b50;

st_959f90_0 ** sub_959f90(long long a0, st_959f90_0 **a1, st_959f90_1 *a2)
{
    st_959f90_0 **v2;  // x24
    st_959f90_0 **v3;  // x22
    unsigned long v4;  // x23
    st_959f90_0 **v5;  // x22
    st_959f90_0 **v6;  // x23
    st_959f90_0 **v7;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = &g_d27b50;
    do
    {
        v4 = *(int *)v3;
        if (sub_a5b3bc(a0, sub_a9976c(v4)) || sub_a5b3bc(a0, sub_a99788(v4)))
        {
            if (!a1)
                return v3;
            *a1 = v2;
            return v3;
        }
    } while ((v2 = (char *)v2 + 1, v3 += 1, v2 != 9));
    if (a2->field_690)
    {
        v5 = 0;
        v6 = 9;
        do
        {
            v7 = v6;
            if (sub_a5b3bc(a0, sub_a9976c(*(int *)(a2->field_160 + (char *)v5))) || sub_a5b3bc(a0, sub_a99788(*(int *)(a2->field_160 + (char *)v5))))
            {
                if (!a1)
                    return a2->field_160 + (char *)v5;
                *a1 = v7;
                return a2->field_160 + (char *)v5;
            }
        } while ((v6 = (char *)v7 + 1, v5 += 1, (char *)v7 - 8 < a2->field_690));
    }
    return 0;
}
