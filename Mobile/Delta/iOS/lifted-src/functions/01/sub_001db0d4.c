/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1db0d4..0x1db1f0 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1db0d4_1 {
    struct st_1db0d4_1 *field_0;
    long long field_8;
} st_1db0d4_1;

typedef struct st_1db0d4_3 {
    struct st_1db0d4_1 *field_0;
    struct st_1db0d4_2 *field_8;
    char field_10;
} st_1db0d4_3;

typedef struct st_1db0d4_2 {
    struct st_1db0d4_1 *field_0;
} st_1db0d4_2;

typedef struct st_1db0d4_0 {
    char field_0;
} st_1db0d4_0;

extern st_1db0d4_2 *g_f10d50;
extern long long g_f10d58;
extern char g_f10d60;
extern unsigned long long g_f10d68;

long long sub_1db0d4(unsigned long a0, st_1db0d4_1 *i)
{
    unsigned long long idx;  // x22
    unsigned long v5;  // x8
    unsigned long v6;  // x8
    unsigned long v7;  // x24
    unsigned long long index;  // x0
    st_1db0d4_3 *v10;  // x8
    st_1db0d4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1db0d4_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    idx = sub_10c04(i->field_8, g_f10d58);
    v5 = *(long long *)&g_f10d50[idx];
    do
    {
        v6 = v5;
        v7 = v6;
        v5 = *(long long *)v6;
    } while (*(long long *)v6 != i);
    if ((v7 == &g_f10d60 || sub_10c04(*(long long *)(v7 + 8), g_f10d58) != idx) && (!i->field_0 || sub_10c04(i->field_0->field_8, g_f10d58) != idx))
        *(unsigned long long *)&g_f10d50[idx] = 0;
    if (i->field_0)
    {
        index = sub_10c04(i->field_0->field_8, g_f10d58);
        if (index != idx)
            *(unsigned long *)&g_f10d50[index] = v7;
    }
    *(struct st_1db0d4_1 **)v7 = i->field_0;
    i->field_0 = 0;
    g_f10d68 = g_f10d68 - 1;
    v10->field_0 = i;
    v10->field_8 = &g_f10d50;
    v10->field_10 = 1;
    return sub_16f34(v10 + 1);
}
