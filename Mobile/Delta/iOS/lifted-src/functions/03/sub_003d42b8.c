/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d42b8..0x3d4490 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d42b8_2 {
    unsigned int field_0;
    unsigned int field_4;
    struct st_3d42b8_1 *field_8;
} st_3d42b8_2;

typedef struct st_3d42b8_1 {
    unsigned int field_0;
} st_3d42b8_1;

typedef struct st_3d42b8_0 {
    char field_0;
} st_3d42b8_0;

typedef struct st_3d42b8_3 {
    unsigned long long field_0;
} st_3d42b8_3;

extern st_3d42b8_3 *g_f0b120;
extern char g_1000001;

unsigned int * sub_3d42b8(st_3d42b8_2 *a0, unsigned int *a1, unsigned int *a2, unsigned int *a3, unsigned int *a4, st_3d42b8_1 **a5)
{
    unsigned int *v4;  // w0
    unsigned long v5;  // x22
    unsigned long v6;  // x23
    unsigned long v7;  // x24
    unsigned int *v8;  // w8
    long long v9;  // x25
    unsigned int *v10;  // x0
    unsigned int *v11;  // x22
    st_3d42b8_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_3d42b8_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (unsigned int *)(unsigned int)sub_3cbaa0();
    *(unsigned int *)a5 = (unsigned int)v4;
    if (!v4)
        return 0;
    if (&g_1000001 > a0->field_4 && &g_1000001 > a0->field_0)
    {
        *a1 = a0->field_0;
        v5 = a0->field_4;
        *a2 = v5;
        v6 = (int)a0->field_8;
        if (a3)
        {
            *a3 = v6;
            v5 = a0->field_4;
        }
        v7 = a0->field_0;
        v8 = (unsigned int *)*(int *)a5;
        v9 = (v8 < 0 ? (unsigned int *)((char *)&v8[1] + 3) : v8) >> 3;
        if (sub_3d391c(v6, v7, v5, v9))
        {
            v10 = sub_3d3c30(v6, v7, v5, v9);
            if (!v10)
                g_f0b120();
            v11 = v10;
            if (sub_3cebbc(a0, v11, v9 * v5 * v6 * v7))
            {
                if (!a4)
                {
                    return v11;
                }
                else if ((int)a0->field_8 == a4)
                {
                    return v11;
                }
                else if (*(int *)a5 == 16)
                {
                    return sub_3cfd40();
                }
                else
                {
                    return sub_3cf884();
                }
            }
            _free(v11);
            g_f0b120();
        }
    }
    g_f0b120();
}
