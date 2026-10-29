/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a354..0x3a690 (828 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a354_3 {
    char padding_0[8];
    unsigned long long field_8;
} st_3a354_3;

typedef struct st_3a354_1 {
    long long field_0;
    char padding_8[1504];
    long long field_5e8;
    char padding_5f0[40];
    long long field_618;
    char padding_620[160];
    struct st_3a354_2 *field_6c0;
    char padding_6c8[56];
    char field_700;
    char padding_701[7];
    unsigned long long field_708;
    char padding_710[24];
    char field_728;
    char padding_729[7];
    unsigned long long field_730;
} st_3a354_1;

typedef struct st_3a354_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[32];
    unsigned long long field_30;
} st_3a354_2;

typedef struct st_3a354_4 {
    unsigned long long field_0;
} st_3a354_4;

typedef struct st_3a354_6 {
    struct st_3a354_4 *field_0;
} st_3a354_6;

typedef struct st_3a354_5 {
    struct st_3a354_4 *field_0;
    char field_8;
} st_3a354_5;

typedef struct st_3a354_0 {
    char field_0;
} st_3a354_0;

extern char g_f0ca50;
extern char g_f0ce38;

long long sub_3a354(st_3a354_1 *a0)
{
    st_3a354_2 **v8;  // x1
    char v9;  // x20
    st_3a354_4 **v18;  // x26
    long long len;  // x0
    unsigned long long v20;  // x0
    char v22;  // x0
    long long len1;  // x0
    char v24;  // x0
    unsigned long long v25;  // x22
    long long v26;  // x0
    long long len2;  // x0
    unsigned long long *v10;  // x22
    long long v28;  // x0
    long long v29;  // x0
    long long v30;  // x23
    unsigned int v31;  // w0
    st_3a354_5 *v11;  // x26
    unsigned long v12;  // x23
    long long v13;  // x24
    unsigned long long v14;  // x0
    char v15;  // x0
    st_3a354_3 *v16;  // x22
    st_3a354_2 **v17;  // x25
    st_3a354_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_3a354_0 *v1;  // [bp-0x78]
    st_3a354_3 *v2;  // [bp-0x70], Other Possible Types: unsigned long long *
    unsigned long v3;  // [bp-0x68]
    st_3a354_6 **v4;  // [bp-0x60], Other Possible Types: unsigned long long *
    st_3a354_2 **v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    sub_45d78();
    v8 = &a0->field_6c0;
    v9 = sub_46ddc(a0, v8);
    if (g_f0ca50 == 1)
    {
        v10 = &a0->field_700;
        v4 = sub_39ab8(v10);
        v5 = v8;
        v2 = v10;
        v3 = a0->field_708;
        v8 = &v2;
        if (sub_290b8(&v4, &v2))
        {
            do
            {
                v11 = *v4 + v5 * 16;
                v12 = *(long long *)v11->field_0;
                v13 = _strlen(v12);
                v14 = sub_2df40(a0->field_0, v12, v13);
                if (v14 >> 31 & 1)
                {
                    sub_45808(a0->field_618 + 12, "Exceeded");
                    sub_45808(" constant limit; simplify the code to compile", "Exceeded");
                }
                v15 = sub_2ffe8(v12, v13);
                sub_2ad10(a0->field_0, 16, v11->field_8, v9, v15);
                sub_31514(a0->field_0, v14);
                sub_3ec0c(&v4);
                v8 = &v2;
            } while (sub_290b8(&v4, &v2) & 1);
        }
    }
    if (g_f0ce38 == 1)
    {
        v16 = &a0->field_728;
        v4 = sub_48518(v16);
        v5 = v8;
        v2 = v16;
        v3 = a0->field_730;
        if (sub_290b8(&v4, &v2))
        {
            do
            {
                v17 = v5;
                v18 = *v4;
                len = _strlen(*(long long *)*(long long *)((char *)v18 + 0x8 * v17));
                v20 = sub_2df40(a0->field_0, *(long long *)*(long long *)((char *)v18 + 0x8 * v17), len);
                if (v20 >> 31 & 1)
                    sub_45808(*(long long *)((char *)v18 + 0x8 * v17) + 8, "Exceeded");
                v22 = sub_46ddc(a0);
                len1 = _strlen(*(long long *)*(long long *)((char *)v18 + 0x8 * v17));
                v24 = sub_2ffe8(*(long long *)*(long long *)((char *)v18 + 0x8 * v17), len1);
                sub_2ad10(a0->field_0, 16, v22, v9, v24);
                sub_31514(a0->field_0, v20);
                sub_3c098(&v4);
            } while (sub_290b8(&v4, &v2) & 1);
        }
    }
    v25 = sub_3b87c(a0, a0->field_618, 2);
    v26 = sub_9fa4(a0->field_5e8, "freeze");
    len2 = _strlen(v26, "freeze");
    if (!(sub_2df40(a0->field_0, v26, len2) >> 31 & 1))
    {
        v28 = sub_9fa4(a0->field_5e8, "table");
        v29 = _strlen(v28, "table");
        if (!(sub_2df40(a0->field_0, v28, v29) >> 31 & 1))
        {
            v30 = sub_2a0dc();
            v31 = sub_2dbc0(a0->field_0, v30);
            if (v31 <= 0x7fff)
            {
                sub_2fdb0(a0->field_0, 12, v25, (short)v31);
                sub_31514(a0->field_0, v30);
                sub_2ad10(a0->field_0, 6, (unsigned int)v25 + 1 & 0xff, v9, 0);
                sub_2ad10(a0->field_0, 21, v25, 2, 2);
                sub_3b76c(a0, 0);
                return sub_2ad10(a0->field_0, 22, v25, 2, 0);
            }
        }
    }
    sub_45808(a0->field_618 + 12, "Exceeded");
    sub_45808(" constant limit; simplify the code to compile", "Exceeded");
}
