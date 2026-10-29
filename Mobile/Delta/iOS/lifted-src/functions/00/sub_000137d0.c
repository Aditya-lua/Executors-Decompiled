/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x137d0..0x13870 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_137d0_1 {
    char padding_0[8];
    long long field_8;
    struct st_137d0_1 *field_10;
    unsigned int field_18;
} st_137d0_1;

typedef struct st_137d0_0 {
    char field_0;
} st_137d0_0;

extern st_137d0_1 *g_f011c0;
extern st_137d0_1 *g_f011c8;

long long sub_137d0(unsigned long a0, long long a1, unsigned int a2)
{
    st_137d0_1 *v4;  // x22
    st_137d0_1 *v5;  // x22
    st_137d0_1 *iter;  // x22
    st_137d0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_137d0_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = g_f011c0;
    if (g_f011c0)
    {
        do
        {
            v5 = v4;
            if (!_strcmp(v5->field_8, a1))
                v5->field_18 = a2;
        } while ((v4 = v5->field_10, v5->field_10));
    }
    iter = g_f011c8;
    if (!g_f011c8)
        return a0;
    do
    {
        if (!_strcmp(iter->field_8, a1))
            iter->field_18 = a2;
    } while ((iter = iter->field_10, iter));
    return a0;
}
