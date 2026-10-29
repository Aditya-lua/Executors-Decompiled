/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x36d28..0x36f5c (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_36d28_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    long long field_20;
} st_36d28_0;

typedef struct st_36d28_2 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    struct st_36d28_0 *field_20;
} st_36d28_2;

typedef struct st_36d28_1 {
    char field_0;
} st_36d28_1;

extern unsigned int g_f00b40;
extern unsigned int g_f00b50;
extern unsigned int g_f00b80;
extern unsigned int g_f00bd0;

long long sub_36d28(st_36d28_2 *a0, long long a1, long long a2)
{
    unsigned int v4;  // w9
    char v5;  // x0
    st_36d28_0 *v6;  // x9
    char v7;  // x8
    char v8;  // x22
    char v9;  // x22
    st_36d28_0 *v10;  // x21
    st_36d28_1 **v0;  // [bp-0x40], Other Possible Types: char
    st_36d28_1 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_8;
    if (a0 && v4 == g_f00b40)
    {
        v5 = sub_34930(a2, &a0->field_20);
        if (!v5)
        {
            return 0;
        }
        else if (*(char *)(v5 + 16) & 1)
        {
            return 0;
        }
        else if (*(long long *)(v5 + 8))
        {
            return sub_36d28(*(long long *)(v5 + 8), a1, a2);
        }
        else
        {
            return 0;
        }
    }
    if (a0 && v4 == g_f00b80)
    {
        v6 = a0->field_20;
        if (v6 && v6->field_8 == g_f00b40)
        {
            v7 = sub_34930(a2, &v6->field_20);
            if (v7 && !(*(char *)(v7 + 16) & 1))
            {
                v8 = *(long long *)(v7 + 8);
                if (v8)
                {
                    v9 = v8;
                    if (*(int *)(v9 + 8) == g_f00b50 || *(int *)(v8 + 8) == g_f00bd0 && *(int *)(v8 + 28) == 15 && (v9 = *(long long *)(v8 + 32), *(int *)(*(long long *)(v8 + 32) + 8) == g_f00b50))
                    {
                        if (sub_37060(a1, *(long long *)(v9 + 32)))
                            return 0;
                        return *(long long *)(v9 + 32);
                    }
                }
            }
        }
        v10 = a0->field_20;
        if (!v10)
        {
            return 0;
        }
        else if (v10->field_8 != g_f00b50)
        {
            return 0;
        }
        else if (sub_37060(a1, v10->field_20))
        {
            return 0;
        }
        else
        {
            return v10->field_20;
        }
    }
    if (!a0)
    {
        return 0;
    }
    else if (v4 != g_f00b50)
    {
        return 0;
    }
    else if (!sub_37060(a1, a0->field_20))
    {
        return 0;
    }
    else
    {
        return 0;
    }
}
