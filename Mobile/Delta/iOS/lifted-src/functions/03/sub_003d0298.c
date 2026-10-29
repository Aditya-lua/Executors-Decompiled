/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d0298..0x3d0448 (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d0298_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned int field_10;
    char padding_14[4];
    unsigned int field_18;
    char padding_1c[4];
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
} st_3d0298_1;

typedef struct st_3d0298_0 {
    char field_0;
} st_3d0298_0;

typedef struct st_3d0298_2 {
    unsigned long long field_0;
} st_3d0298_2;

extern st_3d0298_2 *g_f0b120;

unsigned long long sub_3d0298(st_3d0298_1 *a0)
{
    unsigned long v6;  // x8
    unsigned int v7;  // x9
    unsigned int v8;  // w10
    unsigned long v9;  // x8
    unsigned long v10;  // x8
    unsigned long long i;  // x20
    unsigned long v12;  // x20
    unsigned long v13;  // x8
    unsigned long long v14;  // x0
    st_3d0298_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_3d0298_0 *v1;  // [bp-0x40]
    unsigned short v2;  // [bp-0x34]
    unsigned short v3;  // [bp-0x32]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_10;
    if (v6 & 7)
    {
        sub_3d37fc(a0);
        v6 = a0->field_10;
    }
    if ((int)v6 >= 1)
    {
        v7 = 0;
        v8 = a0->field_18;
        do
        {
            v9 = v6;
            *((char *)&v2 + v7) = v8;
            v7 += 1;
            v8 >>= 8;
            v10 = (unsigned int)v9 - 8;
            v6 = v10;
        } while (8 < (int)v9);
        a0->field_18 = v8;
        a0->field_10 = v10;
        if (!(unsigned int)v10)
        {
            if (v7 - 1 > 2)
                goto LABEL_3d0344;
            goto LABEL_3d0324;
        }
    }
    else if (!(v6 >> 31 & 1))
    {
        v7 = 0;
LABEL_3d0324:
        i = v7 & 0xffffffff;
        do
        {
            *((char *)&v2 + i) = sub_3cedc4(a0);
            i += 1;
        } while (i != 4);
LABEL_3d0344:
        v12 = v2;
        if ((v3 ^ (unsigned int)v12) == 0xffff)
        {
            if (a0->field_0 + v12 > a0->field_8)
                g_f0b120();
            v13 = a0->field_20;
            if (v13 + v12 > a0->field_30)
            {
                v14 = sub_3cf0fc(a0, v13, v12);
                if (!(unsigned int)v14)
                    return v14;
                v13 = a0->field_20;
            }
            _memcpy(v13);
            a0->field_0 = a0->field_0 + v12;
            a0->field_20 = a0->field_20 + v12;
            return 1;
        }
    }
    g_f0b120();
}
