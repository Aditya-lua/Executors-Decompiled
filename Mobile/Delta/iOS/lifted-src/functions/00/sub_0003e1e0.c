/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3e1e0..0x3e424 (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3e1e0_3 {
    unsigned int field_0;
    char field_4;
    char field_5;
    char padding_6[2];
    long long field_8;
    unsigned long long field_10;
    uint128_t field_18;
} st_3e1e0_3;

typedef struct st_3e1e0_1 {
    long long field_0;
    char padding_8[41];
    char field_31;
} st_3e1e0_1;

typedef struct st_3e1e0_2 {
    char padding_0[8];
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    struct st_3e1e0_1 *field_20;
    long long field_28;
} st_3e1e0_2;

typedef struct st_3e1e0_0 {
    char field_0;
} st_3e1e0_0;

extern unsigned int g_f00b40;
extern unsigned int g_f00b50;
extern unsigned int g_f00b80;
extern unsigned int g_f00b90;
extern char g_f0ca10;
extern char g_f0ca50;
extern char g_f0ce38;

double sub_3e1e0(long long a0, st_3e1e0_2 *a1, long long a2)
{
    unsigned int v6;  // w8
    char v7;  // x0
    st_3e1e0_3 *ptr;  // x8
    unsigned long long len;  // x0
    uint128_t v13;  // q0
    long long v14;  // x0
    unsigned long long v15;  // d0
    long long v8;  // x21
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    st_3e1e0_1 *v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x48]
    st_3e1e0_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_3e1e0_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = &v2;
    v2 = &v3;
    sub_395b0();
    v6 = a1->field_8;
    if (a1 && v6 == g_f00b40)
    {
        if (g_f0ca10 != 1 || *(char *)(*(long long *)a1->padding_1c + 49) != 1 || g_f0ce38 == 1 && sub_40b90(a0 + 1832))
        {
            v9 = sub_42480(a0, a1);
            if (!(v9 >> 31 & 1))
            {
                memset(ptr, 0, 24);
                ptr->field_4 = v9;
            }
            else
            {
                ptr->field_0 = 1;
                memset(&ptr->field_4, 0, 20);
                ptr->field_5 = sub_47cd4(a0, *(long long *)a1->padding_1c);
            }
        }
        else
        {
            v7 = sub_3baf4(a0, a1);
            *(double *)&ptr->field_0 = 1.5e-323;
            ptr->field_4 = v7;
            v8 = *(long long *)*(long long *)a1->padding_1c;
LABEL_3e3b8:
            len = _strlen(v8);
            ptr->field_8 = v8;
            ptr->field_10 = len;
        }
        v13 = *(int128_t *)&(&a1->field_8)[1];
        *(uint128_t *)&(&ptr->field_10)[1] = v13;
        return (unsigned long long)v13;
    }
    if (a1 && v6 == g_f00b50)
    {
        if (g_f0ca50 == 1)
        {
            v10 = sub_10160(a0 + 624, a1->padding_1c);
            if (v10)
            {
                v0 = *(long long *)a1->padding_1c;
                v1 = *(int *)(*(long long *)(v10 + 8) + 8) + 1;
                sub_45808(&(&a1->field_8)[1], "'%s' refers to a class and cannot be used as a variable name (defined on line %d)");
            }
        }
        *(double *)&ptr->field_0 = 1e-323;
        v8 = *(long long *)a1->padding_1c;
        goto LABEL_3e3b8;
    }
    else if (a1 && v6 == g_f00b80)
    {
        *(double *)&ptr->field_0 = 1.5e-323;
        ptr->field_4 = sub_385b8(a0, *(long long *)a1->padding_1c, a2);
        v8 = a1->field_20;
        goto LABEL_3e3b8;
    }
    else
    {
        if (a1 && v6 == g_f00b90)
        {
            v14 = sub_385b8(a0, *(long long *)a1->padding_1c, a2);
            sub_420e4(a0, v14, a1->field_20, a2);
            return v15;
        }
        memset(ptr, 0, 40);
        return 0;
    }
}
