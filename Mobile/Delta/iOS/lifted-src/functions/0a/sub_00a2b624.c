/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2b624..0xa2b7f0 (460 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2b624_1 {
    char padding_0[8];
    struct st_a2b624_2 *field_8;
    char padding_10[16];
    struct st_a2b624_0 *field_20;
} st_a2b624_1;

typedef struct st_a2b624_2 {
    unsigned int field_0;
} st_a2b624_2;

typedef struct st_a2b624_0 {
    char padding_0[80];
    struct st_a2b624_0 *field_50;
} st_a2b624_0;

extern unsigned long long g_c7c2eb;

st_a2b624_0 * sub_a2b624(long long a0, st_a2b624_1 *a1, unsigned long long a2, int a3)
{
    st_a2b624_0 *v5;  // x23
    unsigned long long v6;  // x0
    unsigned int v7;  // w8
    st_a2b624_0 *v8;  // x0
    unsigned int v9;  // w8
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1->field_20;
    v6 = sub_a99788(*(int *)a1->field_8);
    if (a3 == 1)
    {
        if (!v5 || !v5->field_50)
        {
            v0 = a2;
            v1 = &g_c7c2eb;
            return (int)sub_9d524c(a0) > 0;
        }
        v1 = &g_c7c2eb;
        v2 = v6;
        v0 = a2;
        if ((int)sub_9d524c(a0, "%*s%s Private-Key:\n") >= 1 && (v0 = a2, v1 = &g_c7c2eb, (int)sub_9d524c(a0, "%*spriv:\n") >= 1))
        {
            v7 = *(int *)a1->field_8;
            v8 = sub_9ca9ac();
            if (!(unsigned int)v8)
                return v8;
LABEL_a2b72c:
            v0 = a2;
            v1 = &g_c7c2eb;
            if ((int)sub_9d524c(a0, "%*spub:\n") >= 1)
            {
                v9 = *(int *)a1->field_8;
                return sub_9ca9ac() != 0;
            }
        }
    }
    else
    {
        if (!v5)
        {
            v0 = a2;
            v1 = &g_c7c2eb;
            return (int)sub_9d524c(a0) > 0;
        }
        v1 = &g_c7c2eb;
        v2 = v6;
        v0 = a2;
        if ((int)sub_9d524c(a0, "%*s%s Public-Key:\n") >= 1)
            goto LABEL_a2b72c;
    }
    return 0;
}
