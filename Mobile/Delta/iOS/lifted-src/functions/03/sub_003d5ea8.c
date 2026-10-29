/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d5ea8..0x3d5f50 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d5ea8_0 {
    char field_0;
} st_3d5ea8_0;

typedef struct st_3d5ea8_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_3d5ea8_1;

extern unsigned int g_d0da20[4];
extern st_3d5ea8_1 g_d0da64;

unsigned long long sub_3d5ea8(unsigned long long a0, unsigned int a1)
{
    unsigned long long idx;  // x20
    unsigned int v5;  // w8
    unsigned long long v6;  // w9
    unsigned long v7;  // x10
    unsigned int v8;  // w11
    unsigned long long v9;  // w10
    unsigned long long v10;  // x8
    st_3d5ea8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d5ea8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    idx = a0 + 0x4000;
    v1 = &v0;
    v0 = &v1;
    v5 = *(int *)(idx + 2084);
    if ((int)a1 > *(int *)(idx + 2084))
    {
        sub_3ce8a0();
        v5 = *(int *)(idx + 2084);
    }
    if ((int)a1 > (int)v5)
        return 0;
    v6 = *(int *)(idx + 2080);
    v7 = -a1;
    v8 = g_d0da20[a1];
    if (!(v7 & 31))
        v9 = v6;
    else
        v9 = v6 << (char)(32 - (v7 & 31)) | v6 >> ((char)v7 & 31);
    *(unsigned int *)(idx + 2080) = v9 & ~v8;
    *(unsigned int *)(idx + 2084) = v5 - a1;
    if (v6 < 0)
        v10 = 0;
    else
        v10 = (&g_d0da64.field_0)[a1];
    return v10 + (v9 & v8);
}
