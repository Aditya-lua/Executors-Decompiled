/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b11bc..0x9b1288 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b11bc_1 {
    unsigned int field_0;
} st_9b11bc_1;

typedef struct st_9b11bc_0 {
    char padding_0[16];
    struct st_9b11bc_1 *field_10;
    char padding_18[48];
    unsigned int field_48;
} st_9b11bc_0;

typedef struct st_9b11bc_2 {
    unsigned long long field_0;
} st_9b11bc_2;

extern struct st_9b11bc_2 *g_e89520[4];
extern struct st_9b11bc_2 *g_e895b0[4];

unsigned long long * sub_9b11bc(st_9b11bc_0 *a0)
{
    st_9b11bc_2 **v2;  // x8
    unsigned int *v3;  // x0
    st_9b11bc_2 **v4;  // x21
    st_9b11bc_2 **v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_48 == *(int *)a0->field_10)
        return 1;
    if (*(int *)a0->field_10 == *(int *)sub_954154())
    {
        v2 = &g_e89520[0];
        if ((int)g_e89520)
            goto LABEL_9b1238;
    }
    else
    {
        v3 = sub_9541d8();
        if (*(int *)a0->field_10 == *v3 && !(v2 = &g_e895b0[0], !(int)g_e895b0))
        {
LABEL_9b1238:
            v4 = v2 + 3;
            do
            {
                v5 = v4;
                if (*(long long *)((char *)v5 - 8))
                    (*(long long *)((char *)v5 - 8))();
            } while ((v4 = v5 + 3, *(int *)v5));
        }
    }
    return 0;
}
