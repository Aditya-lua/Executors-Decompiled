/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d2040..0x3d2248 (520 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d2040_1 {
    unsigned int field_0;
    unsigned int field_4;
    char padding_8[4];
    unsigned int field_c;
} st_3d2040_1;

typedef struct st_3d2040_2 {
    struct st_3d2040_1 *field_0;
    char padding_8[16];
    struct st_3d2040_3 *field_18;
} st_3d2040_2;

typedef struct st_3d2040_3 {
    char field_0;
    char padding_1[1];
    char field_2;
    char field_3;
    char padding_4[1];
    char field_5;
} st_3d2040_3;

typedef struct st_3d2040_0 {
    char field_0;
} st_3d2040_0;

typedef struct st_3d2040_4 {
    unsigned long long field_0;
} st_3d2040_4;

extern st_3d2040_4 *g_f0b180;

void sub_3d2040(st_3d2040_2 *a0)
{
    st_3d2040_1 *v4;  // x10
    unsigned long v5;  // x8
    char v14;  // x16
    unsigned int j;  // w8
    unsigned int v17;  // w8
    char v18;  // x9
    char *v6;  // x9
    unsigned long v7;  // x11
    char *node;  // x10
    char *iter;  // x9
    unsigned long long i;  // x12
    unsigned long long v11;  // x12
    char v12;  // x13
    char v13;  // x14
    st_3d2040_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_3d2040_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_0;
    v5 = v4->field_0 * v4->field_4;
    v6 = &a0->field_18->field_0;
    if (v4->field_c == 3)
    {
        if ((unsigned int)v5)
        {
            if ((unsigned int)v5 == 1)
            {
                v7 = 0;
                node = v6;
            }
            else
            {
                v7 = v5 & 0xfffffffe;
                node = &v6[3 * v7];
                iter = v6 + 2;
                i = v7;
                do
                {
                    v11 = i;
                    v12 = *(iter - 2);
                    v13 = iter[1];
                    v14 = iter[3];
                    *(iter - 2) = *iter;
                    iter[1] = v14;
                    *iter = v12;
                    iter[3] = v13;
                    iter += 6;
                    i = v11 - 2;
                } while (i);
                if (v7 == v5)
                    return;
            }
            j = v5 - v7;
            do
            {
                v17 = j;
                v18 = *node;
                *node = node[2];
                node[2] = v18;
                node += 3;
                j = v17 - 1;
            } while (j);
            return;
        }
        else
        {
            return;
        }
    }
    g_f0b180();
}
