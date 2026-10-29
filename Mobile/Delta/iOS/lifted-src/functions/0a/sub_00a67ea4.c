/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa67ea4..0xa67f7c (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a67ea4_0 {
    long long field_0;
    char padding_8[216];
    char field_e0;
    char padding_e1[95];
    unsigned int field_140;
} st_a67ea4_0;

extern long long g_a680ec;
extern long long g_f08ef0;
extern char g_f12a90;
extern st_a67ea4_0 g_f12a98;
extern long long g_f12be0;
extern char g_f12be8;

int sub_a67ea4(st_a67ea4_0 *a0)
{
    unsigned int v2;  // x0
    st_a67ea4_0 *v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned int)a0;
    if (v2)
    {
        v2 = 0;
        if (sub_a7c208(&g_f08ef0, &g_a680ec) && *(int *)&g_f12be8)
            v2 = sub_a7bbe0(&g_f12be0);
        if (!v2 & g_f12a90)
            v3 = &g_f12a98.field_0;
        else
            v3 = (st_a67ea4_0 *)v2;
        if (v3 != a0)
        {
            if (a0->field_140)
                sub_a779c0(a0);
            sub_a6ba70(a0);
            sub_a68678(a0);
            sub_a6a0ac(a0);
            sub_a7c1d0(a0->field_0);
            a0->field_0 = 0;
            sub_a7c240(&a0->field_e0);
        }
    }
    return v2;
}
