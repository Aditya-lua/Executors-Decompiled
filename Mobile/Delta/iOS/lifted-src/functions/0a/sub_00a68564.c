/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa68564..0xa685ec (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a68564_0 {
    char padding_0[324];
    unsigned int field_144;
} st_a68564_0;

extern long long g_a680ec;
extern long long g_f08ef0;
extern char g_f12a90;
extern char g_f12a98;
extern long long g_f12be0;
extern char g_f12be8;

int sub_a68564(st_a68564_0 *a0)
{
    char v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        v2 = 0;
        if (sub_a7c208(&g_f08ef0, &g_a680ec) && *(int *)&g_f12be8)
            v2 = sub_a7bbe0(&g_f12be0);
        if (!v2 & g_f12a90)
            a0 = &g_f12a98;
        else
            a0 = (st_a68564_0 *)v2;
        if (!v2 && !(g_f12a90 & 1))
            return 0;
    }
    return a0->field_144;
}
