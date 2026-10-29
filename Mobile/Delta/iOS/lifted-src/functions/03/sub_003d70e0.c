/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d70e0..0x3d72a8 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d70e0_0 {
    char field_0;
} st_3d70e0_0;

typedef struct st_3d70e0_1 {
    unsigned long long field_0;
} st_3d70e0_1;

extern st_3d70e0_1 *g_f0b120;

int sub_3d70e0(long long a0, unsigned short *ptr, unsigned long a2, int a3)
{
    long long v4;  // x22
    long long v5;  // x21
    long long v6;  // w0
    long long v7;  // x0
    unsigned long long v8;  // x23
    unsigned long v9;  // x21
    unsigned long long v10;  // x20
    char v11;  // x21
    st_3d70e0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3d70e0_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0 + 0x4000;
    v1 = &v0;
    v0 = &v1;
    if (!*(int *)(v4 + 2104))
    {
        if (15 >= *(int *)(v4 + 2084))
            sub_3ce8a0();
        if (!*(int *)(v4 + 2108))
        {
            memset(ptr, 0, 128);
            v5 = a0;
            v6 = (unsigned int)sub_3d1eb8();
            if (16 > v6)
            {
                if (v6)
                    v7 = sub_3d5ea8(v5);
                else
                    v7 = 0;
                v8 = v5 + a3 * 96;
                v9 = *(int *)(v8 + 18104);
                if (!sub_3d3024(v9, v7))
                    g_f0b120();
                v10 = v9 + v7;
                *(unsigned int *)(v8 + 18104) = v10;
                v11 = *(int *)(v4 + 2112);
                if (sub_3cdd14(v10, 1 << (v11 & 31)))
                {
                    *ptr = (unsigned int)v10 << (v11 & 31);
                    return 1;
                }
            }
        }
        else if (!sub_3d5f50())
        {
            return 1;
        }
        else
        {
            *ptr = *ptr + (unsigned short)(1 << ((char)*(int *)(v4 + 2112) & 31));
            return 1;
        }
    }
    g_f0b120();
}
