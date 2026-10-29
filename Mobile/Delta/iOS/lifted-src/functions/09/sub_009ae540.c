/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ae540..0x9ae69c (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ae540_2 {
    unsigned int field_0;
} st_9ae540_2;

typedef struct st_9ae540_1 {
    char padding_0[24];
    struct st_9ae540_2 *field_18;
    char padding_20[40];
    struct st_9ae540_0 *field_48;
} st_9ae540_1;

typedef struct st_9ae540_0 {
    struct st_9ae540_0 *field_0;
} st_9ae540_0;

extern struct st_9ae540_0 *g_e89520[4];
extern struct st_9ae540_0 *g_e895b0[4];

st_9ae540_0 ** sub_9ae540(st_9ae540_1 *a0, st_9ae540_0 **a1, st_9ae540_0 **a2, st_9ae540_0 **a3)
{
    st_9ae540_0 **v2;  // x8
    st_9ae540_0 **v3;  // w8
    st_9ae540_0 **v4;  // x0
    st_9ae540_0 **v5;  // x24
    st_9ae540_0 **v6;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(int *)a0->field_18 != 0x10000)
    {
        if (*(int *)a0->field_18 != 0x1ffff)
        {
            v3 = (st_9ae540_0 **)(int)a0->field_48;
            *(unsigned int *)a2 = (unsigned int)v3;
            *(unsigned int *)a1 = (unsigned int)v3;
            if (!a3)
                v4 = 0;
            else
                v4 = 786691;
            return v4;
        }
        v2 = &g_e895b0[0];
        *(unsigned int *)a1 = 0;
        if (a3)
            goto LABEL_9ae598;
    }
    else
    {
        v2 = &g_e89520[0];
        *(unsigned int *)a1 = 0;
        if (a3)
        {
LABEL_9ae598:
            *(unsigned int *)a3 = 0;
        }
    }
    if (*(int *)v2)
    {
        v5 = v2 + 3;
        do
        {
            v6 = v5;
            if (*(long long *)((char *)v6 - 16))
                (*(long long *)((char *)v6 - 16))();
            v5 = v6 + 3;
        } while (*(int *)v6);
        *(unsigned int *)a2 = 0;
    }
    else
    {
        *(unsigned int *)a2 = 0;
    }
    return 191;
}
