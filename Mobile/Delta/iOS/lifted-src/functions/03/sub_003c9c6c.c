/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c9c6c..0x3c9cfc (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c9c6c_0 {
    char field_0;
} st_3c9c6c_0;

extern unsigned int g_d0da20[4];

unsigned long long sub_3c9c6c(unsigned long long a0, unsigned int a1)
{
    unsigned long long idx;  // x20
    unsigned int v5;  // w8
    unsigned int v6;  // w9
    unsigned long v7;  // x10
    unsigned int v8;  // w10
    st_3c9c6c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3c9c6c_0 *v1;  // [bp-0x28]
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
    if (v7 & 31)
        v6 = v6 << (char)(32 - (v7 & 31)) | v6 >> ((char)v7 & 31);
    v8 = g_d0da20[a1];
    *(unsigned int *)(idx + 2080) = v6 & ~v8;
    *(unsigned int *)(idx + 2084) = v5 - a1;
    return v6 & v8;
}
