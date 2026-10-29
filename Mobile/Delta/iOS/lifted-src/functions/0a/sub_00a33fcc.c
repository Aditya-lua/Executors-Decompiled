/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa33fcc..0xa34084 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a33fcc_1 {
    unsigned int field_0;
} st_a33fcc_1;

typedef struct st_a33fcc_0 {
    struct st_a33fcc_0 *field_0;
} st_a33fcc_0;

extern unsigned int g_f12860;
extern st_a33fcc_0 *g_f12868;
extern st_a33fcc_0 *g_f1286c;

st_a33fcc_0 ** sub_a33fcc(unsigned long a0, st_a33fcc_0 **a1, st_a33fcc_1 **a2, unsigned int a3)
{
    unsigned int v2;  // w0
    unsigned long idx;  // x10
    st_a33fcc_0 **v4;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        if (a3 == 64)
        {
            *a1 = sub_a34364();
            return 1;
        }
        *a1 = 0;
        return 0;
    }
    else
    {
        if ((char)g_f1286c == 1)
        {
            *a2 = &g_f12860;
            return (int)g_f12868;
        }
        if (sub_a34364())
        {
            v2 = sub_9c7b68();
            idx = (int)g_f12868;
            v4 = (st_a33fcc_0 **)((unsigned int)idx + 1);
            *(unsigned int *)&g_f12868 = (unsigned int)v4;
            (&g_f12860)[idx] = v2;
        }
        else
        {
            v4 = (st_a33fcc_0 **)(int)g_f12868;
        }
        *(unsigned int *)((char *)&g_f12860 + 0x4 * v4) = 0;
        *(char *)&g_f1286c = 1;
        *a2 = &g_f12860;
        return v4;
    }
}
