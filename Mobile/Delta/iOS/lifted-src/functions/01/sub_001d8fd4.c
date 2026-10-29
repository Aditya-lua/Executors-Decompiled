/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d8fd4..0x1d9088 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d8fd4_0 {
    char padding_0[80];
    unsigned long long field_50;
} st_1d8fd4_0;

typedef struct st_1d8fd4_1 {
    char padding_0[8];
    struct st_1d8fd4_0 *field_8;
    struct st_1d8fd4_0 *field_10;
    struct st_1d8fd4_1 *field_18;
    unsigned long long field_20;
    char padding_28[64];
    struct st_1d8fd4_1 *field_68;
} st_1d8fd4_1;

extern long long g_f02738;
extern long long g_f10d28;

st_1d8fd4_1 * sub_1d8fd4(st_1d8fd4_0 *a0)
{
    st_1d8fd4_1 *v4;  // x0
    st_1d8fd4_1 *iter;  // x19
    st_1d8fd4_1 *v0;  // [bp-0x30]
    st_1d8fd4_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = a0;
    std::__1::mutex::lock(&g_f02738);
    if (sub_1dd6a4(&g_f10d28, &v1) && !(v4 = sub_1e3220(), !v4))
    {
        iter = v4->field_18;
        v0 = iter;
        if (iter)
        {
            if (!sub_1e56ec() || iter->field_20 != v1->field_50 || iter->field_8 != v1 && iter->field_10 != v1)
                goto LABEL_1d9040;
            iter = iter->field_68;
        }
    }
    else
    {
LABEL_1d9040:
        iter = 0;
    }
    std::__1::mutex::unlock(&g_f02738);
    return iter;
}
