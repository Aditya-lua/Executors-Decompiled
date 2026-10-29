/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x193ec..0x196b4 (712 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_193ec_2 {
    struct st_193ec_3 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_193ec_2;

typedef struct st_193ec_4 {
    char padding_0[28];
    unsigned int field_1c;
} st_193ec_4;

typedef struct st_193ec_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    char field_10;
    char padding_11[39];
    unsigned long long field_38;
} st_193ec_1;

typedef struct st_193ec_3 {
    unsigned long long field_0;
} st_193ec_3;

typedef struct st_193ec_0 {
    char field_0;
} st_193ec_0;

extern st_193ec_1 g_f0cb18;
extern long long g_f0cbf8;
extern unsigned int g_f0cc00;
extern long long g_f0cc08;
extern unsigned long long g_f0cc30;
extern char g_10002b0;

unsigned long long sub_193ec(long long a0, unsigned long a1, unsigned long a2, unsigned long long a3, st_193ec_2 *a4, long long a5)
{
    st_193ec_1 *iter;  // x24
    unsigned int v13;  // w23
    unsigned long long v14;  // x25
    char v15;  // x24
    unsigned long long v16;  // x8
    unsigned long long v17;  // x9
    st_193ec_4 **v18;  // x27
    unsigned long i;  // x20
    long long v20;  // x0
    long long v21;  // x0
    unsigned long long v0;  // [bp-0xe0]
    st_193ec_0 **v1;  // [bp-0xd8], Other Possible Types: char
    st_193ec_0 *v2;  // [bp-0xd0]
    unsigned long v3;  // [bp-0xc8]
    unsigned long v4;  // [bp-0xc0]
    uint128_t v5;  // [bp-0xb0]
    uint128_t v6;  // [bp-0xa0], Other Possible Types: char *
    char v7;  // [bp-0x90]
    char v8;  // [bp-0x70]
    unsigned long v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    v5 = CONCAT(a2, a1);
    v7 = 0;
    v8 = 0;
    if (g_f0cb18.padding_0)
    {
        iter = &g_f0cb18.padding_0[0];
        if (_strcmp(a3))
        {
            do
            {
                if (!iter->field_38)
                    goto LABEL_194b0;
            } while ((iter = &iter->field_38, _strcmp(a3)));
        }
        v13 = iter->field_8;
        sub_15990(&v7, &iter->field_10);
        v14 = v13 >> 8;
        v15 = 1;
        if (*(char *)g_f0cc30 == 1)
            goto LABEL_194cc;
LABEL_194e0:
        if (v15 & 1)
            goto LABEL_19524;
        if (*(char *)a3)
        {
            v0 = a3;
            sub_1db64(a0, &v5, "Invalid attribute '@%s'");
        }
        else
        {
            sub_1db64(a0, &v5, "Attribute name is missing");
        }
    }
    else
    {
LABEL_194b0:
        v15 = 0;
        v13 = 0;
        if (*(char *)g_f0cc30 != 1)
            goto LABEL_194e0;
LABEL_194cc:
        if (_strcmp(a3, g_f0cbf8))
            goto LABEL_194e0;
        v13 = g_f0cc00;
        sub_15990(&v7, &g_f0cc08);
        v14 = g_f0cc00 >> 8;
        v15 = 1;
LABEL_19524:
        v16 = a4->field_8 * 8;
        v17 = (a4->field_10 + a4->field_8) * 8;
        if (v16 != v17)
        {
            v18 = v16 + *(long long *)a4->field_0;
            do
            {
                if (*v18->field_1c == (v13 & 0xff | __ROL__((unsigned int)v14, 8) & 0xffffff00))
                {
                    v0 = a3;
                    sub_1db64(a0, &v5, "Cannot duplicate attribute '@%s'");
                }
            } while ((v18 += 1, v18 != v17 + *(long long *)a4->field_0));
        }
        if (v8 & 1)
        {
            v6 = v5;
            sub_12528(&v7, &v6, a5);
            i = v3;
            if (i != v4)
            {
                do
                {
                    v0 = sub_a0c8(i + 16);
                    sub_1db64(a0, i, "%s");
                    i += 40;
                } while (i != v4);
            }
            v6 = &v3;
            sub_1d5cc(&v6);
        }
    }
    sub_1c480(&v7);
    if (*(long long *)&g_10002b0 == v9)
        return v13 & 0xff & 0xffffffff00000000 | (v13 & 0xff & 0xffffffff000000ff | (v14 * 0x100 | v14 >> 56) & 0xffffff00) & 0xffffffff | v15 * 0x100000000;
    v20 = ___stack_chk_fail();
    sub_1c480(&v7);
    v21 = __Unwind_Resume(v20);
    v6 = &v3;
    sub_1d5cc(&v6);
    sub_1c480(&v7);
    __Unwind_Resume(v21);
}
