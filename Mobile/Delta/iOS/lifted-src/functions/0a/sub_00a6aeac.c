/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6aeac..0xa6afb8 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6aeac_0 {
    unsigned long long field_0;
} st_a6aeac_0;

typedef struct st_a6aeac_1 {
    struct st_a6aeac_0 *field_0;
} st_a6aeac_1;

extern char g_f12df8;
extern char g_f12dfc;
extern st_a6aeac_1 *g_f12e00;
extern char g_f12e08;
extern char g_f12e10;
extern long long g_f12e18;
extern char g_f12e20;

void sub_a6aeac(void)
{
    long long v3;  // x0
    long long v4;  // x0
    long long v5;  // x0
    long long v6;  // x0
    long long v7;  // x0
    long long v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*(int *)&g_f12df8)
    {
        return;
    }
    else if (!(g_f12dfc & 1))
    {
        g_f12dfc = 1;
        sub_a6bab4();
        if (g_f12e00)
            (*(long long *)g_f12e00)();
        g_f12e00 = 0;
        sub_a7c1d0(*(long long *)&g_f12e08);
        *(unsigned long long *)&g_f12e08 = 0;
        sub_a7c1d0(*(long long *)&g_f12e10);
        *(unsigned long long *)&g_f12e10 = 0;
        sub_c044(sub_c044(sub_c044(sub_a7c240(&g_f12e18))));
        if (g_f12e20 == 1)
            sub_9d0878();
        v3 = sub_9f5c38(sub_aa8208());
        v4 = sub_ad6b70(sub_a33210(v3));
        v5 = sub_a6b8a8(sub_a67c58(v4));
        v6 = sub_a58e64(sub_9d5070(v5));
        v7 = sub_a357a0(sub_a99534(v6));
        v8 = sub_9f29fc(sub_a6c564(v7));
        sub_c044(v8);
        *(unsigned int *)&g_f12df8 = 0;
        return;
    }
    else
    {
        return;
    }
}
