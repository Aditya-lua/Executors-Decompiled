/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f3f34..0x1f3fcc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f3f34_1 {
    struct st_1f3f34_2 *field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_1f3f34_1;

typedef struct st_1f3f34_2 {
    unsigned int field_0;
} st_1f3f34_2;

typedef struct st_1f3f34_0 {
    char field_0;
} st_1f3f34_0;


long long sub_1f3f34(st_1f3f34_1 *a0, long long a1, unsigned long long a2)
{
    unsigned long v4;  // x20
    unsigned long v5;  // x23
    st_1f3f34_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1f3f34_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *(int *)((char *)&a0->field_0[a2].field_0 - 4);
    v5 = *(int *)&a0->field_0[a2 & 0xffffffff];
    if ((unsigned int)v4 <= (unsigned int)v5)
        return v4;
    while (!sub_1f4d6c(a0, a1, a0->field_18 + (v5 & 0xffffffff) * 4, a2))
    {
        v5 += a2;
        if ((unsigned int)v5 >= (unsigned int)v4)
            return v4;
    }
    return v5;
}
