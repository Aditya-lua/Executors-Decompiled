/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cc13c..0x3cd4ac (4976 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cc13c_2 {
    struct st_3cc13c_1 *field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_3cc13c_2;

typedef struct st_3cc13c_0 {
    char field_0;
} st_3cc13c_0;

typedef struct st_3cc13c_1 {
    char padding_0[8];
    unsigned int field_8;
} st_3cc13c_1;

typedef struct st_3cc13c_3 {
    unsigned long long field_0;
} st_3cc13c_3;

extern st_3cc13c_3 *g_f0b120;

long long sub_3cc13c(st_3cc13c_2 *a0, unsigned long a1, unsigned int a2, unsigned int a3, unsigned long long a4, unsigned long long a5, unsigned long long a6, unsigned int a7)
{
    unsigned long v11;  // x26
    unsigned long v12;  // x0
    unsigned long long v13;  // x22
    unsigned long v14;  // x0
    unsigned int v0;  // [bp-0x1e0]
    unsigned int v1;  // [bp-0x1dc]
    st_3cc13c_2 *v2;  // [bp-0x138]
    unsigned long long v3;  // [bp-0x130]
    unsigned int v4;  // [bp-0x124]
    unsigned int v5;  // [bp-0x114]
    unsigned int v6;  // [bp-0xc4]
    st_3cc13c_0 **v7;  // [bp-0xb8], Other Possible Types: char
    st_3cc13c_0 *v8;  // [bp-0xb0]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = &v7;
    v7 = &v8;
    v11 = a0->field_0->field_8;
    v12 = sub_3d6ef0(a4, a5, a3 << ((unsigned int)a6 == 16), 0);
    a0->field_18 = v12;
    if (v12)
    {
        if (!(sub_3cfce4(v11, a4, a6, 7) && (v6 = v11, v5 = a4, v13 = 7 + (unsigned int)a6 * (unsigned int)a4 * (unsigned int)v11 >> 3, sub_3d6e2c(v13, a5, v13))))
        {
            g_f0b120();
        }
        else if ((unsigned int)a5 + (unsigned int)v13 * (unsigned int)a5 > a2)
        {
            g_f0b120();
        }
        else
        {
            v3 = v13;
            v14 = sub_3ceae0(v13, 2, 0);
            if (v14)
            {
                v2 = a0;
                if (!(unsigned int)a5)
                {
                    v4 = 1;
                    _free(v14);
                    return v4 != 0;
                }
                v0 = a7;
                v1 = a3;
                g_f0b120();
            }
        }
    }
    g_f0b120();
}
