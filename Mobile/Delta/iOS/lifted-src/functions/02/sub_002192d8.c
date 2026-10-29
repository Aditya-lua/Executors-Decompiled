/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2192d8..0x2193b8 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2192d8_0 {
    char field_0;
} st_2192d8_0;

typedef struct st_2192d8_1 {
    char padding_0[257];
    char field_101;
} st_2192d8_1;

typedef struct st_2192d8_2 {
    char padding_0[96];
    struct st_2192d8_1 *field_60;
} st_2192d8_2;

extern st_2192d8_2 *g_f0d198;

char sub_2192d8(long long a0)
{
    char v10;  // x0
    st_2192d8_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_2192d8_0 *v1;  // [bp-0x58]
    st_2192d8_0 **v2;  // [bp-0x50], Other Possible Types: char
    st_2192d8_0 *v3;  // [bp-0x48]
    st_2192d8_0 *v4;  // [bp-0x40], Other Possible Types: char
    long long v5;  // [bp-0x38]
    st_2192d8_0 **v6;  // [bp-0x30], Other Possible Types: char
    st_2192d8_0 *v7;  // [bp-0x28], Other Possible Types: st_2192d8_0 **, char
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v4 = &v7;
    v7 = &v4;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v10 = sub_2194ec(a0, 1);
        if (v10 && *(long long *)(v10 + 24))
        {
            v3 = &v2;
            v4 = *(long long *)(v10 + 24);
            v2 = &v3;
            v7 = &v6;
            v6 = &v7;
            v5 = 1;
            std::__1::mutex::lock(v4);
            if (sub_60768(v4 + 112, 2) && *(long long *)(v4 + 96))
                *(unsigned long long *)(*(long long *)(v4 + 96) + 32) = 0;
            sub_63c20(&v4);
            return 0;
        }
    }
    sub_c60dec(a0);
}
