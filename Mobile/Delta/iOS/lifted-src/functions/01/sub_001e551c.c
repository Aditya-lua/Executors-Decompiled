/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e551c..0x1e5628 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e551c_1 {
    struct st_1e551c_1 *field_0;
    unsigned long long field_8;
} st_1e551c_1;

typedef struct st_1e551c_0 {
    char field_0;
} st_1e551c_0;

typedef struct st_1e551c_2 {
    struct st_1e551c_1 *field_0;
} st_1e551c_2;

extern st_1e551c_2 *g_f10d50;
extern unsigned long long g_f10d58;
extern st_1e551c_1 *g_f10d60;

unsigned long long sub_1e551c(unsigned long a0, st_1e551c_1 *a1)
{
    long long v4;  // x0
    unsigned long long v5;  // x0
    st_1e551c_1 *v6;  // x21
    unsigned long long index;  // x0
    st_1e551c_1 *v8;  // x22
    unsigned long long v9;  // x20
    unsigned long long idx;  // x0
    unsigned long long v11;  // x0
    st_1e551c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1e551c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a1)
    {
        v11 = sub_1db1f0();
        g_f10d58 = 0;
        return v11;
    }
    v4 = sub_1d8c58();
    sub_1db1f0(v4, v4);
    g_f10d58 = a1;
    v5 = _bzero(g_f10d50, a1 * 8);
    v6 = g_f10d60;
    if (!g_f10d60)
        return v5;
    index = sub_10c04(g_f10d60->field_8, a1);
    *(st_1e551c_1 ***)&g_f10d50[index] = &g_f10d60;
    v8 = g_f10d60->field_0;
    if (!v8)
        return index;
    v9 = index;
    do
    {
        idx = sub_10c04(v8->field_8, a1);
        if (idx == v9)
        {
            idx = v9;
        }
        else if (*(long long *)&g_f10d50[idx])
        {
            v6->field_0 = v8->field_0;
            v8->field_0 = *(long long *)*(long long *)&g_f10d50[idx];
            *(st_1e551c_1 **)*(long long *)&g_f10d50[idx] = v8;
            idx = v9;
            v8 = v6;
        }
        else
        {
            *(st_1e551c_1 **)&g_f10d50[idx] = v6;
        }
    } while ((v6 = v8, v8 = v8->field_0, v9 = idx, v8));
    return idx;
}
