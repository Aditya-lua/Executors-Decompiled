/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x65cfc..0x65da8 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_65cfc_1 {
    char padding_0[12];
    unsigned int field_c;
} st_65cfc_1;

typedef struct st_65cfc_0 {
    char field_0;
} st_65cfc_0;


unsigned long long sub_65cfc(st_65cfc_1 *a0, unsigned long a1)
{
    unsigned long v5;  // x20
    unsigned long long v6;  // 4118
    long long count;  // x0
    unsigned long long v8;  // 4110
    unsigned long long v9;  // x20
    st_65cfc_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_65cfc_0 *v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    std::__1::mutex::lock(a0 + 1);
    v5 = a0->field_c;
    v6 = arm64g_calculate_condition(1, v5 & 0xffffffff, 1, 0);
    if (!(v6 & 1))
    {
        do
        {
            count = _write(v5, &v2, 8);
            v8 = arm64g_calculate_condition(18, count, 1, 0);
        } while (!(v8 & 1) && *(int *)___error() == 4);
        v9 = count == 8;
    }
    else
    {
        v9 = 0;
    }
    std::__1::mutex::unlock(a0 + 1);
    return v9;
}
