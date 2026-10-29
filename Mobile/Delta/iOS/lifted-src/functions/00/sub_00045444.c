/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x45444..0x45580 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_45444_2 {
    char padding_0[1512];
    long long field_5e8;
} st_45444_2;

typedef struct st_45444_3 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
} st_45444_3;

typedef struct st_45444_1 {
    char padding_0[32];
    long long field_20;
    unsigned long long field_28;
} st_45444_1;

typedef struct st_45444_0 {
    char field_0;
} st_45444_0;


long long sub_45444(st_45444_2 *a0, st_45444_1 *a1)
{
    long long v4;  // x0
    long long v5;  // x21
    st_45444_3 *v14;  // x0
    st_45444_3 *v15;  // x8
    unsigned long long v16;  // x0
    char v6;  // x0
    char v7;  // x0
    char idx;  // x0
    char v9;  // x0
    unsigned long iter;  // x21
    unsigned long long v11;  // x22
    unsigned long long v12;  // x22
    char v13;  // x0
    st_45444_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_45444_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_47588(a1->field_20);
    if (!v4)
        return v4;
    v5 = v4;
    v6 = sub_34930(&a0->padding_0[224], v5 + 32);
    if (!v6)
        return v6;
    if (*(char *)(v6 + 16) & 1 || !*(long long *)(v6 + 8))
        return 0;
    v7 = sub_158b8(&a0->padding_0[344], v5 + 32);
    if (!v7)
    {
        return v7;
    }
    else if (!*(int *)(v7 + 8))
    {
        idx = sub_44a3c(*(long long *)(v6 + 8));
        if (!idx)
        {
            return idx;
        }
        else if (*(long long *)(idx + 40))
        {
            v9 = 0;
            iter = *(long long *)(idx + 32) + 8;
            v11 = *(long long *)(idx + 40) * 24;
            do
            {
                v12 = v11;
                v13 = v9;
                if (1 >= (unsigned int)(*(int *)(iter - 8) - 1))
                {
                    v14 = sub_3a7e0(&a0->padding_0[264], iter);
                    v13 = (char)v14;
                    if (v13)
                    {
                        v15 = v14;
                        v13 = v9;
                        if (v14->field_8 == 7)
                        {
                            v13 = v9;
                            if (v15->padding_c)
                            {
                                v16 = sub_a38c(a0->field_5e8, v15->field_10);
                                v13 = v9;
                                if (a1->field_28 == v16)
                                    v13 = *(long long *)(iter + 8);
                            }
                        }
                    }
                }
            } while ((iter += 24, v11 = v12 - 24, v9 = v13, v12 != 24));
            return v13;
        }
    }
    return 0;
}
