/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x955bc8..0x955d6c (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_955bc8_0 {
    char padding_0[16];
    struct st_955bc8_0 *field_10;
} st_955bc8_0;

extern st_955bc8_0 g_f04c68;
extern st_955bc8_0 *g_f04c78;
extern st_955bc8_0 g_f04cb8;
extern st_955bc8_0 *g_f04cc8;
extern st_955bc8_0 g_f04d08;
extern st_955bc8_0 *g_f04d18;
extern st_955bc8_0 g_f04d58;
extern st_955bc8_0 *g_f04d68;
extern st_955bc8_0 g_f04da8;
extern st_955bc8_0 *g_f04db8;
extern st_955bc8_0 g_f04df8;
extern st_955bc8_0 *g_f04e08;
extern st_955bc8_0 g_f04e48;
extern st_955bc8_0 *g_f04e58;
extern st_955bc8_0 g_f04e98;
extern st_955bc8_0 g_f082c8;
extern st_955bc8_0 *g_f082d8;
extern st_955bc8_0 g_f08318;
extern st_955bc8_0 *g_f08328;

st_955bc8_0 * sub_955bc8(long long a0)
{
    st_955bc8_0 *v2;  // x20
    unsigned long long v3;  // x21
    unsigned long long v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f04c78 && !_strcmp(a0))
        return &g_f04c68.padding_0[0];
    if (g_f04cc8 && !_strcmp(a0))
        return &g_f04cb8.padding_0[0];
    if (g_f04d18 && !_strcmp(a0))
        return &g_f04d08.padding_0[0];
    if (g_f04d68 && !_strcmp(a0))
        return &g_f04d58.padding_0[0];
    if (g_f04db8 && !_strcmp(a0))
        return &g_f04da8.padding_0[0];
    if (g_f04e08 && !_strcmp(a0))
        return &g_f04df8.padding_0[0];
    if (g_f04e58 && !_strcmp(a0))
        return &g_f04e48.padding_0[0];
    v2 = &g_f04e98.padding_0[0];
    v3 = 167;
    do
    {
        v4 = v3;
        if (v2->field_10 && !_strcmp(a0))
            return v2;
    } while ((v2 = &v2[3].padding_0[8], v3 = v4 - 1, v4 != 1));
    if (g_f082d8 && !_strcmp(a0))
        return &g_f082c8.padding_0[0];
    if (g_f08328 && !_strcmp(a0))
        return &g_f08318.padding_0[0];
    return 0;
}
