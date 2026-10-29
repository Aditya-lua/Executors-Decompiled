/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc73bb0..0xc73c64 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c73bb0_0 {
    struct st_c73bb0_1 *field_0;
} st_c73bb0_0;

typedef struct st_c73bb0_1 {
    struct st_c73bb0_0 *field_0;
} st_c73bb0_1;

extern unsigned long long g_bef1c8;
extern long long g_cb946a;
extern long long g_cb94a1;
extern long long g_cb94c9;

void sub_c73bb0(st_c73bb0_1 **a0, st_c73bb0_1 **a1, st_c73bb0_1 **a2, st_c73bb0_1 **a3)
{
    unsigned long long v9;  // x30
    st_c73bb0_1 **v0;  // [bp-0x40]
    st_c73bb0_1 **v1;  // [bp-0x38]
    st_c73bb0_1 **v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    st_c73bb0_1 **v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v6 = &v8;
    v7 = v9;
    if (a0 > a2)
    {
        v0 = a0;
        v1 = a2;
        v2 = &v0;
        v3 = &g_bef1c8;
        v4 = &v1;
        v5 = &g_bef1c8;
        a1 = &v2;
        a2 = a3;
        a0 = sub_c73b38(&g_cb94c9, &v2, a2);
    }
    if (a2 >= a1 && a0 > a1)
    {
        v0 = a0;
        v1 = a1;
        v2 = &v0;
        v3 = &g_bef1c8;
        v4 = &v1;
        v5 = &g_bef1c8;
        a1 = &v2;
        a2 = a3;
        sub_c73b38(&g_cb94a1, &v2, a2);
    }
    v0 = a1;
    v1 = a2;
    v2 = &v0;
    v3 = &g_bef1c8;
    v4 = &v1;
    v5 = &g_bef1c8;
    sub_c73b38(&g_cb946a, &v2, a3);
}
