/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x224470..0x224554 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_224470_0 {
    char field_0;
} st_224470_0;

typedef struct st_224470_1 {
    char padding_0[257];
    char field_101;
} st_224470_1;

typedef struct st_224470_2 {
    char padding_0[96];
    struct st_224470_1 *field_60;
} st_224470_2;

extern st_224470_2 *g_f0d198;

char sub_224470(long long a0)
{
    char v10;  // x0
    st_224470_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_224470_0 *v1;  // [bp-0x58]
    st_224470_0 **v2;  // [bp-0x50], Other Possible Types: char
    st_224470_0 *v3;  // [bp-0x48]
    st_224470_0 *idx;  // [bp-0x40], Other Possible Types: char
    long long v5;  // [bp-0x38]
    st_224470_0 **v6;  // [bp-0x30], Other Possible Types: char
    st_224470_0 *v7;  // [bp-0x28], Other Possible Types: st_224470_0 **, char
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    idx = &v7;
    v7 = &idx;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v10 = sub_2194ec(a0, 1);
        if (v10 && *(long long *)(v10 + 24))
        {
            v3 = &v2;
            idx = *(long long *)(v10 + 24);
            v2 = &v3;
            v7 = &v6;
            v6 = &v7;
            v5 = 1;
            std::__1::mutex::lock(idx);
            if (sub_60768(idx + 112, 2) && *(long long *)(idx + 96))
                *(long long *)(*(long long *)(idx + 96) + 32) = *(long long *)(idx + 88);
            sub_63c20(&idx);
            return 0;
        }
    }
    sub_c60dec(a0);
}
