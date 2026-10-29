/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e5628..0x1e568c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e5628_0 {
    char padding_0[24];
    struct st_1e5628_0 *field_18;
} st_1e5628_0;

extern long long g_f02738;
extern long long g_f10d28;

st_1e5628_0 * sub_1e5628(unsigned long a0)
{
    st_1e5628_0 *v3;  // x0
    st_1e5628_0 *v4;  // x19
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0;
    std::__1::mutex::lock(&g_f02738);
    v3 = sub_1dd6a4(&g_f10d28, &v0);
    if (v3)
        v4 = v3->field_18;
    else
        v4 = 0;
    std::__1::mutex::unlock(&g_f02738);
    return v4;
}
