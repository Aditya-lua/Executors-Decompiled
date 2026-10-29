/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x960f58..0x96123c (740 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_960f58_1 {
    char padding_0[8];
    struct st_960f58_0 *field_8;
} st_960f58_1;

typedef struct st_960f58_0 {
    char padding_0[160];
    unsigned long long field_a0;
} st_960f58_0;

extern char g_d27fb0;

st_960f58_1 * sub_960f58(st_960f58_1 *a0, unsigned int a1, unsigned long a2, long long a3)
{
    st_960f58_1 *v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 == 92 && a2 == 1)
    {
        v2 = (st_960f58_1 *)(unsigned int)sub_9689f0();
    }
    else if (a0)
    {
        if (115 >= a1 - 16)
            goto *((void *)(sub_960fcc + *(&(&g_d27fb0)[a1] - 16) * 4));
        else
            goto *((void *)(a0->field_8->field_a0));
    }
    else
    {
        if ((a1 | 4) == 0x66)
            v2 = (st_960f58_1 *)(unsigned int)sub_96b5f0(0, 0, a3, 0);
        else
            return 0;
    }
    return v2;
}
