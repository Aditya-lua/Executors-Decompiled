/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3be4e4..0x3be650 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3be4e4_1 {
    char padding_0[8];
    long long field_8;
    long long field_10;
    char padding_18[8];
    unsigned int field_20;
} st_3be4e4_1;

typedef struct st_3be4e4_3 {
    struct st_3be4e4_1 *field_0;
} st_3be4e4_3;

typedef struct st_3be4e4_0 {
    char field_0;
} st_3be4e4_0;

typedef struct st_3be4e4_2 {
    char padding_0[384];
    struct st_3be4e4_3 *field_180;
} st_3be4e4_2;

extern st_3be4e4_2 *g_f0d3d8;

char * sub_3be4e4(char **a0)
{
    st_3be4e4_1 *v11;  // x20
    char *v12;  // x20
    char *v22;  // w11
    char *v23;  // x10
    unsigned long long v24;  // x12
    char *v25;  // x11
    char *v26;  // w13
    char *v13;  // x20
    char *v14;  // x0
    char *v15;  // w8
    char *v16;  // x11
    unsigned long long v17;  // x10
    char *v18;  // x11
    unsigned long long v19;  // x10
    st_3be4e4_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_3be4e4_0 *v1;  // [bp-0x98]
    char *v2;  // [bp-0x90]
    char *v3;  // [bp-0x80]
    unsigned int v4;  // [bp-0x70]
    st_3be4e4_3 **v5;  // [bp-0x60]
    st_3be4e4_3 **v6;  // [bp-0x58]
    char *v7;  // [bp-0x50]
    st_3be4e4_0 **v8;  // [bp-0x48]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    v11 = *(long long *)g_f0d3d8->field_180;
    v2 = (char *)0;
    v3 = (char *)0;
    v4 = v11->field_20;
    sub_13538(&v2, v11->field_8);
    sub_3be1f4(&v2, v11->field_10, 0);
    v12 = v3;
    if (v12)
    {
        do
        {
            v13 = v12;
            v14 = sub_a0c8(v13 + 16);
            v5 = &v6;
            v6 = &v5;
            v15 = (char *)*(char *)a0;
            if (v15)
            {
                v16 = 0;
                v17 = 1;
                do
                {
                    v18 = v16;
                    v19 = v17;
                    v17 = v19 + 1;
                    v16 = v18 - 1;
                } while (*((char *)a0 + v19));
                while (1)
                {
                    v22 = (char *)*v14;
                    if (!v22)
                        break;
                    v23 = v14;
                    v14 += 1;
                    if (v22 != v15)
                        continue;
                    v7 = &v8;
                    v8 = &v7;
                    v24 = 1;
                    v25 = v18;
                    while (1)
                    {
                        if (!v25)
                            goto LABEL_3be5ec;
                        v26 = (char *)v23[v24];
                        if (v26 != *((char *)a0 + v24))
                            break;
                        v24 += 1;
                        v25 += 1;
                        if (!v26)
                            goto LABEL_3be5ec;
                    }
                }
            }
            else
            {
                v23 = v14;
LABEL_3be5ec:
                if (v23)
                {
                    sub_1a648(&v2, v3);
                    sub_2219c(&v2, 0);
                    return *(long long *)(*(long long *)&v13[40] + 168);
                }
            }
        } while ((v12 = *(long long *)v13, *(long long *)v13));
    }
    sub_1a648(&v2, v3);
    sub_2219c(&v2, 0);
    return 0;
}
