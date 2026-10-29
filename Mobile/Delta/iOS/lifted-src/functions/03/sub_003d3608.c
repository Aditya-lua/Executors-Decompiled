/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d3608..0x3d37fc (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d3608_2 {
    struct st_3d3608_5 *field_0;
} st_3d3608_2;

typedef struct st_3d3608_5 {
    struct st_3d3608_2 *field_0;
} st_3d3608_5;

typedef struct st_3d3608_0 {
    char field_0;
} st_3d3608_0;

typedef struct st_3d3608_1 {
    unsigned long long field_0;
} st_3d3608_1;

extern st_3d3608_1 *g_f0b120;

unsigned long long sub_3d3608(long long *a0)
{
    unsigned long idx;  // x23
    unsigned long long v7;  // x0
    unsigned int v8;  // w1
    unsigned int v9;  // w0
    unsigned int v10;  // w0
    unsigned int v11;  // w20
    unsigned int v12;  // w0
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    st_3d3608_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_3d3608_0 *v1;  // [bp-0x68]
    st_3d3608_5 **v2;  // [bp-0x60]
    st_3d3608_5 **v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    *(uint128_t *)&a0[2267] = 0;
    v0 = &v1;
    idx = a0 + 0x800;
    *(uint128_t *)&a0[2279] = 0;
    *(uint128_t *)&a0[2291] = 0;
    *(uint128_t *)&a0[0x8ff] = 0;
    *(unsigned int *)(idx + 2152) = 0;
    v7 = sub_3ce6d0();
    if (!(unsigned int)v7)
        return v7;
    v8 = sub_3d45d0(a0);
    while (1)
    {
        if (v8 == 218)
        {
            v13 = sub_3d305c(a0);
            if (!(unsigned int)v13)
                return v13;
            v14 = sub_3c8b5c(a0);
            if (!(unsigned int)v14)
                return v14;
            if (*(char *)(idx + 2088) != 0xff)
            {
                v8 = sub_3d45d0(a0);
                if ((v8 & 248) != 208)
                    continue;
            }
            else
            {
                *(char *)(idx + 2088) = sub_3cea0c(a0);
                v8 = sub_3d45d0(a0);
                if ((v8 & 248) != 208)
                    continue;
            }
        }
        else if (v8 == 220)
        {
            v2 = &v3;
            v3 = &v2;
            v9 = sub_3d706c(*a0);
            v10 = sub_3d706c(*a0);
            v2 = &v3;
            v3 = &v2;
            v11 = sub_3d706c(*a0);
            v12 = sub_3d706c(*a0);
            if ((v10 | v9 * 0x100) != 4)
                g_f0b120();
            if ((v12 | v11 * 0x100) != *(int *)(*a0 + 4))
                g_f0b120();
        }
        else if (v8 != 217)
        {
            if (!sub_3d15e4(a0))
                break;
        }
        else
        {
            if (*(int *)(idx + 2096))
            {
                sub_3d2ed4(a0);
                break;
            }
        }
        v8 = sub_3d45d0(a0);
    }
    return 1;
}
