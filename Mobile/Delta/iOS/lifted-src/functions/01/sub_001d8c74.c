/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d8c74..0x1d8d90 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d8c74_1 {
    struct st_1d8c74_1 *field_0;
    long long field_8;
} st_1d8c74_1;

typedef struct st_1d8c74_3 {
    struct st_1d8c74_1 *field_0;
    struct st_1d8c74_2 *field_8;
    char field_10;
} st_1d8c74_3;

typedef struct st_1d8c74_2 {
    struct st_1d8c74_1 *field_0;
} st_1d8c74_2;

typedef struct st_1d8c74_0 {
    char field_0;
} st_1d8c74_0;

extern st_1d8c74_2 *g_f10d78;
extern long long g_f10d80;
extern char g_f10d88;
extern unsigned long long g_f10d90;

long long sub_1d8c74(unsigned long a0, st_1d8c74_1 *i)
{
    unsigned long long idx;  // x22
    unsigned long v5;  // x8
    unsigned long v6;  // x8
    unsigned long v7;  // x24
    unsigned long long index;  // x0
    st_1d8c74_3 *v10;  // x8
    st_1d8c74_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1d8c74_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    idx = sub_10c04(i->field_8, g_f10d80);
    v5 = *(long long *)&g_f10d78[idx];
    do
    {
        v6 = v5;
        v7 = v6;
        v5 = *(long long *)v6;
    } while (*(long long *)v6 != i);
    if ((v7 == &g_f10d88 || sub_10c04(*(long long *)(v7 + 8), g_f10d80) != idx) && (!i->field_0 || sub_10c04(i->field_0->field_8, g_f10d80) != idx))
        *(unsigned long long *)&g_f10d78[idx] = 0;
    if (i->field_0)
    {
        index = sub_10c04(i->field_0->field_8, g_f10d80);
        if (index != idx)
            *(unsigned long *)&g_f10d78[index] = v7;
    }
    *(struct st_1d8c74_1 **)v7 = i->field_0;
    i->field_0 = 0;
    g_f10d90 = g_f10d90 - 1;
    v10->field_0 = i;
    v10->field_8 = &g_f10d78;
    v10->field_10 = 1;
    return sub_16f34(v10 + 1);
}
