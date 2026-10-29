/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d8d90..0x1d8e14 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d8d90_2 {
    char padding_0[24];
    struct st_1d8d90_1 *field_18;
} st_1d8d90_2;

typedef struct st_1d8d90_0 {
    char field_0;
} st_1d8d90_0;

typedef struct st_1d8d90_1 {
    char padding_0[112];
    char field_70;
} st_1d8d90_1;

extern long long g_f02738;

int sub_1d8d90(st_1d8d90_1 *a0)
{
    st_1d8d90_2 *v5;  // x0
    st_1d8d90_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1d8d90_0 *v1;  // [bp-0x40]
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
    a0->field_70 = 6;
    return std::__1::mutex::unlock(&g_f02738);
}
