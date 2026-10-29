/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1dd788..0x1dd82c (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1dd788_2 {
    char padding_0[16];
    struct st_1dd788_1 *field_10;
} st_1dd788_2;

typedef struct st_1dd788_1 {
    char padding_0[24];
    struct st_1dd788_2 *field_18;
} st_1dd788_1;

typedef struct st_1dd788_0 {
    char field_0;
} st_1dd788_0;

extern long long g_f02738;
extern long long g_f10d28;

int sub_1dd788(st_1dd788_2 *a0)
{
    st_1dd788_1 *v5;  // x0
    st_1dd788_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1dd788_0 *v1;  // [bp-0x40]
    char v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_1e3220(std::__1::mutex::lock(&g_f02738), a0);
    if (v5 && v5->field_18 == a0)
    {
        sub_1daa98();
        sub_1d6950(&v2);
    }
    sub_1dd430(&g_f10d28, &a0->padding_0[8]);
    if (a0->field_10)
        sub_1dd430(&g_f10d28, &a0->field_10);
    return std::__1::mutex::unlock(&g_f02738);
}
