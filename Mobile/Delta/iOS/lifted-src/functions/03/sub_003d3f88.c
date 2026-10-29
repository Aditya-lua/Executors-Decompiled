/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d3f88..0x3d40a4 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d3f88_0 {
    char field_0;
} st_3d3f88_0;

extern long long g_d0daa4;
extern long long g_d0dbc4;

unsigned long long sub_3d3f88(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // w0
    unsigned long long v6;  // w0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    st_3d3f88_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3d3f88_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1)
    {
        v4 = sub_3c9300(a0);
        if (!(unsigned int)v4)
            return v4;
    }
    *(unsigned int *)&a0[3] = 0;
    a0[2] = 0;
    while (1)
    {
        v5 = (unsigned int)sub_3d37fc(a0, 1);
        v6 = (unsigned int)sub_3d37fc(a0, 2);
        if (!v6)
        {
            v7 = sub_3d0298(a0);
            if (!(unsigned int)v7)
                return v7;
        }
        else
        {
            if (v6 == 1)
            {
                v9 = sub_3d66d0((char *)&a0[7] + 4, &g_d0daa4, 288);
                if (!(unsigned int)v9)
                    return v9;
                v10 = sub_3d66d0(a0 + 260, &g_d0dbc4, 32);
                if (!(unsigned int)v10)
                    return v10;
            }
            else if (v6 != 3)
            {
                v8 = sub_3d22b8(a0);
                if (!(unsigned int)v8)
                    return v8;
            }
            else
            {
                return 0;
            }
            v11 = sub_3d6bc8(a0);
            if (!(unsigned int)v11)
                return v11;
        }
        if (v5)
            return 1;
    }
}
