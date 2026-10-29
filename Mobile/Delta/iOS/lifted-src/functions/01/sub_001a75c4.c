/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a75c4..0x1a77b0 (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a75c4_0 {
    char field_0;
} st_1a75c4_0;

extern unsigned long long g_e71728;

long long sub_1a75c4(long long a0, long long a1, long long a2, long long a3)
{
    long long v7;  // x0
    unsigned long v8;  // x0
    long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long v12;  // x0
    unsigned long v13;  // x8
    st_1a75c4_0 *v0;  // [bp-0x88], Other Possible Types: char
    char v1;  // [bp-0x70]
    unsigned short v2;  // [bp-0x52]
    st_1a75c4_0 **v3;  // [bp-0x50], Other Possible Types: char
    st_1a75c4_0 *v4;  // [bp-0x48], Other Possible Types: st_1a75c4_0 **, char
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v2 = 23869;
    v0 = 0;
    v7 = sub_1a5708(a1, a2, &v2, &v3, &v1, &v0, &v0);
    if (v7 != a2)
    {
        sub_1c5f48(a0, a1, v7, 0);
        v0 = &v4;
        v4 = &v0;
        v8 = sub_6b08(&v1);
        if (v8)
        {
            v9 = sub_a0c8(&v1);
            v10 = sub_a0c8(&v1);
            sub_1b7e48(a0, v9, v10 + sub_6b08(&v1), 0);
            v4 = &v3;
            v3 = &v4;
            if (sub_6b08(&v0))
            {
                sub_62444(a3 + 0x88, &v0);
                return v7 + 2;
            }
            v12 = sub_6b08(&v1);
            v13 = 80;
            if (v12 != 1)
                v13 = 0;
            if (v12 == 2)
                v13 = 16;
            goto *((void *)(*(long long *)((char *)&g_e71728 + v13)));
        }
    }
    else
    {
        v8 = sub_1a8238();
    }
    sub_1b4c90(v8);
    __debugbreak();
}
