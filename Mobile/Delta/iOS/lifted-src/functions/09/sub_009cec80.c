/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cec80..0x9cef0c (652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cec80_0 {
    unsigned int field_0;
    char padding_4[20];
    unsigned long long field_18;
    struct st_9cec80_1 *field_20;
} st_9cec80_0;

typedef struct st_9cec80_1 {
    unsigned long long field_0;
} st_9cec80_1;

typedef struct st_9cec80_2 {
    struct st_9cec80_2 *field_0;
} st_9cec80_2;

extern unsigned long long g_c7c2eb;

unsigned long long sub_9cec80(long long a0, st_9cec80_2 **a1, unsigned long long a2, st_9cec80_0 *a3, void* a4)
{
    st_9cec80_2 **v8;  // x23
    unsigned long v9;  // x26
    unsigned long v10;  // x8
    unsigned long long v11;  // x25
    unsigned long long v12;  // x8
    unsigned long v13;  // x24
    unsigned long long v14;  // x8
    unsigned long v0;  // [bp-0x80], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x68]
    unsigned long long v4;  // [bp-0x60]
    st_9cec80_2 **v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a1;
    v9 = a3->field_0;
    v10 = *(long long *)a4;
    if (v10 >> 7 & 1)
        a3->field_20();
    if (v10 >> 6 & 1)
    {
        v11 = 0;
        if (v9 >> 12 & 1)
            goto LABEL_9cecec;
    }
    else
    {
        v11 = a3->field_18;
        if (v9 >> 12 & 1)
        {
LABEL_9cecec:
            v5 = v8;
            v8 = &v5;
        }
    }
    if (!((unsigned int)v9 & 6))
        a3->field_20();
    if (v11)
    {
        if (!(v10 >> 2 & 1))
        {
            v1 = &g_c7c2eb;
            v2 = v11;
            v0 = a2;
        }
        else
        {
            v12 = "SET";
            if (!((unsigned int)v9 & 2))
                v12 = "SEQUENCE";
            v2 = v12;
            v3 = a3->field_18;
            v0 = a2;
            v1 = &g_c7c2eb;
        }
        if ((int)sub_9d524c(a0) < 1)
            return 0;
    }
    v13 = *v8;
    if ((int)sub_ad69e4(v13) >= 1)
    {
        v4 = sub_ad69f8(v13, 0);
        a3->field_20();
    }
    v14 = "EMPTY";
    if (!v13)
        v14 = "ABSENT";
    v0 = (unsigned int)a2 + 2;
    v1 = &g_c7c2eb;
    v2 = v14;
    if ((int)sub_9d524c() < 1)
        return 0;
    if (!((char)(*(char *)a4) >> 1 & 1))
        return 1;
    v0 = a2;
    v1 = &g_c7c2eb;
    if ((int)sub_9d524c(a0, "%*s}\n") < 1)
        return 0;
    return 1;
}
