/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fcf68..0x9fcfe4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fcf68_0 {
    char padding_0[8];
    struct st_9fcf68_1 *field_8;
} st_9fcf68_0;

typedef struct st_9fcf68_2 {
    char padding_0[200];
    unsigned long long field_c8;
} st_9fcf68_2;

typedef struct st_9fcf68_1 {
    unsigned int field_0;
} st_9fcf68_1;

extern unsigned int g_e8d220;

st_9fcf68_2 * sub_9fcf68(st_9fcf68_0 *a0, unsigned long a1, unsigned long a2)
{
    st_9fcf68_2 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_8 != &g_e8d220)
    {
        v2 = sub_9fd45c(0);
        if (!v2)
            return 0;
    }
    else
    {
        v2 = sub_9fd474(0);
        if (!v2)
            return 0;
    }
    v2->field_c8 = v2->field_c8 + 1;
    sub_a5ab14(a0, *(int *)a0->field_8);
    return 1;
}
