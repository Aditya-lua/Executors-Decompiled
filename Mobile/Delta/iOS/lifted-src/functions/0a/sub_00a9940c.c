/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9940c..0xa9946c (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9940c_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_a9940c_0;

typedef struct st_a9940c_1 {
    unsigned long long field_0;
} st_a9940c_1;

extern long long g_f12f08;

long long sub_a9940c(st_a9940c_0 *a0)
{
    unsigned int v2;  // w0
    st_a9940c_1 **v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f12f08)
    {
        v2 = sub_ad69e4(g_f12f08);
        if ((int)v2 > (int)a0->field_0)
        {
            v3 = sub_ad69f8(g_f12f08);
            (*v3)();
        }
    }
    v4 = sub_a66dc4(a0->field_8);
    return v4 ^ a0->field_0;
}
