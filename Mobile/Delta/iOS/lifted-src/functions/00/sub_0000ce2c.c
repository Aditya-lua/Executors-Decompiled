/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xce2c..0xcfbc (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ce2c_0 {
    struct st_ce2c_1 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
} st_ce2c_0;

typedef struct st_ce2c_2 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
    unsigned long long field_14;
    unsigned long long field_18;
} st_ce2c_2;

typedef struct st_ce2c_3 {
    struct st_ce2c_4 *field_0;
} st_ce2c_3;

typedef struct st_ce2c_4 {
    struct st_ce2c_3 *field_0;
} st_ce2c_4;

typedef struct st_ce2c_1 {
    char field_0;
} st_ce2c_1;


st_ce2c_0 * sub_ce2c(st_ce2c_0 *a0, unsigned long long *a1, unsigned int a2, unsigned int a3, unsigned int a4)
{
    unsigned long v7;  // x25
    unsigned long long v17;  // x8
    st_ce2c_2 *v18;  // x8
    unsigned long v8;  // x9
    unsigned long v9;  // x10
    unsigned long v10;  // x8
    st_ce2c_0 *v11;  // x0
    unsigned long long *v12;  // x11
    unsigned long v13;  // x9
    unsigned long long v14;  // x11
    unsigned long long v15;  // x9
    st_ce2c_1 **v0;  // [bp-0x80], Other Possible Types: char
    st_ce2c_1 *v1;  // [bp-0x78]
    st_ce2c_4 **v2;  // [bp-0x70]
    st_ce2c_4 **v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v7 = a0->field_10 + 1;
    a0->field_10 = v7;
    v2 = &v3;
    v3 = &v2;
    v8 = a0->field_8;
    if (v8 > v7)
    {
        v9 = v7;
        v10 = v7;
        v11 = a0;
        while (1)
        {
            v12 = a0->field_0;
            if (!*((char *)v12 + v9))
                break;
            v2 = &v3;
            v3 = &v2;
            if (*((char *)v12 + v9) == 93)
            {
                v11 = sub_a20c(a0);
                v10 = a0->field_10;
                if ((unsigned int)v11 == a2)
                {
                    v13 = (unsigned int)v10 + 1;
                    a0->field_10 = v13;
                    v14 = a0->field_14 | (v13 - a0->field_18) * 0x100000000;
                    v15 = &a0->field_0[v7];
                    v17 = *a1;
                    v18->field_0 = a3;
                    *(unsigned long long *)&(&v18->field_0)[1] = v17;
                    *(unsigned long long *)((char *)&v18->field_4 + 4) = v14;
                    *(unsigned int *)((char *)&v18->field_c + 4) = (unsigned int)v10 + ~((unsigned int)v7 + a2);
                    v18->field_14 = v15;
                    return v11;
                }
                v8 = a0->field_8;
                v2 = &v3;
                v3 = &v2;
                v9 = v10 & 0xffffffff;
                if (v9 >= v8)
                    break;
            }
            else
            {
                v2 = &v3;
                v3 = &v2;
                if (*((char *)v12 + v9) == 10)
                {
                    v10 = (unsigned int)v10 + 1;
                    a0->field_14 = a0->field_14 + 1;
                    a0->field_18 = v10;
                    a0->field_10 = v10;
                    v2 = &v3;
                    v3 = &v2;
                    v9 = v10 & 0xffffffff;
                    if (v8 <= v9)
                        break;
                }
                else
                {
                    v10 = (unsigned int)v10 + 1;
                    a0->field_10 = v10;
                    v2 = &v3;
                    v3 = &v2;
                    v9 = v10 & 0xffffffff;
                    if (v9 >= v8)
                        break;
                }
            }
        }
    }
    else
    {
        v10 = v7;
        v11 = a0;
    }
    v14 = a0->field_14 | (v10 - a0->field_18) * 0x100000000;
    v17 = *a1;
    v18->field_0 = a4;
    *(unsigned long long *)&(&v18->field_0)[1] = v17;
    *(unsigned long long *)((char *)&v18->field_4 + 4) = v14;
    *(unsigned int *)((char *)&v18->field_c + 4) = 0;
    v18->field_14 = 0;
    return v11;
}
