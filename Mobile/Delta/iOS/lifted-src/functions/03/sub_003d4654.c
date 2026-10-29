/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d4654..0x3d472c (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d4654_0 {
    char field_0;
} st_3d4654_0;

typedef struct st_3d4654_1 {
    unsigned long long field_0;
} st_3d4654_1;

extern st_3d4654_1 *g_f0b120;

unsigned long long sub_3d4654(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long long *ptr;  // x0
    unsigned long long v5;  // x0
    st_3d4654_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3d4654_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    ptr = _calloc(1, 0x4888);
    if (ptr)
    {
        *ptr = a0;
        ptr[2318] = 4016416;
        ptr[2319] = 4012412;
        ptr[2320] = ")";
        v5 = sub_3c9cfc();
        _free(ptr);
        return v5;
    }
    g_f0b120();
}
