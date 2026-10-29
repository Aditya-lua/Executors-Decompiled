/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d2db8..0x3d2ed4 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d2db8_2 {
    unsigned short field_0;
    char field_2;
} st_3d2db8_2;

typedef struct st_3d2db8_0 {
    struct st_3d2db8_1 *field_0;
    char padding_8[16];
    void* field_18;
} st_3d2db8_0;

typedef struct st_3d2db8_1 {
    unsigned int field_0;
    unsigned int field_4;
} st_3d2db8_1;

typedef struct st_3d2db8_3 {
    char field_0;
} st_3d2db8_3;

typedef struct st_3d2db8_4 {
    unsigned long long field_0;
} st_3d2db8_4;

extern st_3d2db8_4 *g_f0b120;

int sub_3d2db8(st_3d2db8_0 *a0, unsigned int *a1, unsigned long a2, unsigned long long a3)
{
    unsigned long i;  // x22
    void* v5;  // x21
    void* v14;  // x8
    void* node;  // x9
    unsigned long v16;  // x22
    void* v17;  // x8
    unsigned long v6;  // x0
    void* v7;  // x23
    void* v8;  // x8
    void* iter;  // x9
    unsigned long v10;  // x22
    void* v11;  // x8
    st_3d2db8_2 *v12;  // x10
    st_3d2db8_3 **v0;  // [bp-0x50], Other Possible Types: char
    st_3d2db8_3 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    i = a0->field_0->field_0 * a0->field_0->field_4;
    v5 = a0->field_18;
    v6 = sub_3ceae0(i, a3, 0);
    if (v6)
    {
        v7 = v6;
        if ((unsigned int)a3 == 3)
        {
            if ((unsigned int)i)
            {
                v8 = v5;
                iter = v7;
                do
                {
                    v10 = i;
                    v11 = v8 + 1;
                    v12 = &a1[*(char *)v8];
                    *(unsigned short *)iter = v12->field_0;
                    *(char *)&iter[2] = v12->field_2;
                    iter += 3;
                    i = v10 - 1;
                    v8 = v11;
                } while (i);
            }
        }
        else
        {
            if ((unsigned int)i)
            {
                v14 = v5;
                node = v7;
                do
                {
                    v16 = i;
                    v17 = v14 + 1;
                    *(unsigned int *)node = a1[*(char *)v14];
                    node += 4;
                    i = v16 - 1;
                    v14 = v17;
                } while (i);
            }
        }
        _free(v5);
        a0->field_18 = v7;
        return 1;
    }
    g_f0b120();
}
