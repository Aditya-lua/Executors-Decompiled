/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e2fa4..0x1e30b8 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e2fa4_0 {
    char field_0;
} st_1e2fa4_0;

extern long long g_f02738;
extern long long g_f10d28;

long long sub_1e2fa4(unsigned long a0)
{
    unsigned long long v5;  // x0
    st_1e2fa4_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_1e2fa4_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    v5 = sub_1e3220(std::__1::mutex::lock(&g_f02738), a0);
    if (!v5)
    {
        sub_1e4368();
        sub_1d8938(sub_1d90a0(&g_f10d28, a0 + 8, a0 + 8, a0), &v2, &v2, a0);
    }
    std::__1::mutex::unlock(&g_f02738);
    return !v5;
}
