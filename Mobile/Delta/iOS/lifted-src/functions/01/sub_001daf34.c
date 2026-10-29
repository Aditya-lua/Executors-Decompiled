/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1daf34..0x1db034 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1daf34_1 {
    char padding_0[24];
    unsigned long long field_18;
} st_1daf34_1;

typedef struct st_1daf34_0 {
    char field_0;
} st_1daf34_0;

extern long long g_cbed28;
extern long long g_f02738;
extern long long g_f10d28;

int sub_1daf34(unsigned long long *a0, unsigned long a1)
{
    unsigned long long *v7;  // x20
    st_1daf34_1 *v8;  // x0
    st_1daf34_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1daf34_0 *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    char v3;  // [bp-0x39]
    char *v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    std::__1::mutex::lock(&g_f02738);
    v7 = a0 + 2;
    if (a0[2] && a0[2] != a0[1])
        sub_1dd430(&g_f10d28, v7);
    v4 = &v2;
    v8 = sub_1e5254(&g_f10d28, &v2, &g_cbed28, &v4, &v3);
    v8->field_18 = *a0;
    *v7 = v2;
    std::__1::mutex::unlock(&g_f02738);
    return 1;
}
