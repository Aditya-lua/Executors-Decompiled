/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5528..0x9e55d4 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5528_0 {
    struct st_9e5528_1 *field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_9e5528_0 *field_10;
} st_9e5528_0;

typedef struct st_9e5528_1 {
    unsigned long long field_0;
} st_9e5528_1;


st_9e5528_0 * sub_9e5528(st_9e5528_0 *a0, st_9e5528_0 *a1)
{
    st_9e5528_0 *v0;  // w9
    st_9e5528_0 *v1;  // x0
    st_9e5528_0 *v2;  // x9
    unsigned long v3;  // x10
    unsigned long v4;  // x10
    unsigned long v5;  // x10

    if (a0 && a1)
    {
        v0 = (st_9e5528_0 *)(int)a0->field_10;
        if (!v0)
            v1 = 1;
        else
            v1 = 0xfffffffe;
        if (v0 != (int)a1->field_10)
            return v1;
        if (!v0)
            v2 = 0xffffffff;
        else
            v2 = 0;
        v3 = a0->field_8;
        if ((int)a1->field_8 < (int)v3)
        {
            return v1;
        }
        else if ((int)a1->field_8 > (int)v3)
        {
            return v2;
        }
        else
        {
            v4 = v3 - 1;
            while (1)
            {
                v5 = v4;
                if ((int)((unsigned int)v5 + 1) < 1)
                {
                    return 0;
                }
                else if ((unsigned long long)*(long long *)&a1->field_0[v5] < (unsigned long long)*(long long *)&a0->field_0[v5])
                {
                    return v1;
                }
                else
                {
                    v4 = v5 - 1;
                    if ((unsigned long long)*(long long *)&a1->field_0[v5] > (unsigned long long)*(long long *)&a0->field_0[v5])
                        return v2;
                }
            }
        }
    }
    if (a0)
        return 0xffffffff;
    return a1 != 0;
}
