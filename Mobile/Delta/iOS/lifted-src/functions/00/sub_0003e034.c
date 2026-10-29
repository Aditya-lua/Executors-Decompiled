/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3e034..0x3e180 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3e034_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    void* field_20;
} st_3e034_1;

typedef struct st_3e034_0 {
    char field_0;
} st_3e034_0;

extern unsigned int g_f00ae0;
extern unsigned int g_f00b40;
extern unsigned int g_f00b80;
extern unsigned int g_f00ba0;
extern unsigned int g_f00be0;
extern unsigned int g_f00c10;

st_3e034_1 * sub_3e034(long long a0, st_3e034_1 *a1)
{
    unsigned int v4;  // w8
    char v5;  // x0
    char v6;  // x0
    st_3e034_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3e034_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1->field_8;
    if (a1 && v4 == g_f00b40)
    {
        v5 = sub_34930(a0 + 224, &a1->field_20);
        if (!v5)
        {
            return v5;
        }
        else if (*(char *)(v5 + 16) & 1)
        {
            return 0;
        }
        else if (*(long long *)(v5 + 8))
        {
            return sub_3e034(a0, *(long long *)(v5 + 8));
        }
        else
        {
            return 0;
        }
    }
    if (a1 && v4 == g_f00b80)
    {
        v6 = sub_45444();
        if (v6)
            return sub_3e034(a0, v6);
        return v6;
    }
    if ((!a1 || v4 != g_f00ae0) && (!a1 || v4 != g_f00be0) && (!a1 || v4 != g_f00c10))
    {
        if (v4 == g_f00ba0)
            return a1;
        return 0;
    }
    return sub_3e034(a0, a1->field_20);
}
