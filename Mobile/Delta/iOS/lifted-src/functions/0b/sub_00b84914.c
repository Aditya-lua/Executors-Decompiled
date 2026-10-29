/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb84914..0xb84984 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b84914_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
} st_b84914_0;

extern unsigned long long g_b7df8c;
extern unsigned long long g_b8ccac;
extern long long g_cb8afb;
extern long long g_ef8080;

long long sub_b84914(st_b84914_0 **a0, long long *a1)
{
    st_b84914_0 *v6;  // x9
    st_b84914_0 *v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *a0;
    if ((unsigned long long)v6->field_10 > 2)
    {
        v0 = v6;
        v1 = &g_b8ccac;
        v2 = v0->field_8 + 48;
        v3 = &g_b7df8c;
        return sub_be769c(*a1, a1[1], &g_cb8afb, &v0);
    }
    sub_c73c94(2, v6->field_10, &g_ef8080);
}
