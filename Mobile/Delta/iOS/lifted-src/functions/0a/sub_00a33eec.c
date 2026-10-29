/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa33eec..0xa33fcc (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a33eec_1 {
    unsigned int field_0;
} st_a33eec_1;

typedef struct st_a33eec_0 {
    struct st_a33eec_0 *field_0;
} st_a33eec_0;

extern unsigned int g_f12848;
extern st_a33eec_0 *g_f12858;
extern st_a33eec_0 *g_f1285c;

st_a33eec_0 ** sub_a33eec(unsigned long a0, st_a33eec_0 **a1, st_a33eec_1 **a2, unsigned int a3)
{
    st_a33eec_0 **v2;  // x0
    unsigned int v3;  // w0
    unsigned long index;  // x8
    unsigned int v5;  // w0
    unsigned long idx;  // x9
    st_a33eec_0 **v7;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        switch (a3)
        {
        case 97:
            v2 = sub_a341c0();
        case 5:
            v2 = sub_a340fc();
            break;
        default:
            *a1 = 0;
            return 0;
        }
        *a1 = v2;
        return 1;
    }
    else if ((char)g_f1285c == 1)
    {
        *a2 = &g_f12848;
        return (int)g_f12858;
    }
    else
    {
        if (sub_a340fc())
        {
            v3 = sub_9f2ae0();
            index = (int)g_f12858;
            *(unsigned int *)&g_f12858 = (unsigned int)index + 1;
            (&g_f12848)[index] = v3;
        }
        if (sub_a341c0())
        {
            v5 = sub_9f2ae0();
            idx = (int)g_f12858;
            v7 = (st_a33eec_0 **)((unsigned int)idx + 1);
            *(unsigned int *)&g_f12858 = (unsigned int)v7;
            (&g_f12848)[idx] = v5;
        }
        else
        {
            v7 = (st_a33eec_0 **)(int)g_f12858;
        }
        *(unsigned int *)((char *)&g_f12848 + 0x4 * v7) = 0;
        *(char *)&g_f1285c = 1;
        *a2 = &g_f12848;
        return v7;
    }
}
