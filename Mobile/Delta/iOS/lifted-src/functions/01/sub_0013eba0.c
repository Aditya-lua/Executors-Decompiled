/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13eba0..0x13eca4 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13eba0_0 {
    char field_0;
} st_13eba0_0;

typedef struct st_13eba0_2 {
    char padding_0[257];
    char field_101;
} st_13eba0_2;

typedef struct st_13eba0_3 {
    char padding_0[96];
    struct st_13eba0_2 *field_60;
} st_13eba0_3;

extern st_13eba0_3 *g_f0d198;
extern long long g_f0d450;
extern long long g_f0d458;
extern char g_f0d468;

char sub_13eba0(long long a0)
{
    char v9;  // x0
    long long v10;  // x0
    long long v11;  // x0
    long long v12;  // x0
    st_13eba0_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_13eba0_0 *v1;  // [bp-0x50]
    st_13eba0_0 *v2;  // [bp-0x48], Other Possible Types: unsigned long
    long long v3;  // [bp-0x40]
    char v4;  // [bp-0x38]
    st_13eba0_0 **v5;  // [bp-0x30], Other Possible Types: char
    st_13eba0_0 *v6;  // [bp-0x28], Other Possible Types: st_13eba0_0 **, char
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    v2 = &v6;
    v6 = &v2;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v9 = sub_13e800(a0, 1);
        if (v9 && *(long long *)(v9 + 24))
        {
            v4 = *(long long *)(v9 + 24);
            v6 = &v5;
            v5 = &v6;
            v2 = &g_f0d468;
            v3 = 1;
            std::__1::__shared_mutex_base::lock(&g_f0d468);
            *(char *)(v4 + 81) = 0;
            v10 = sub_13e938(g_f0d450, g_f0d458, &v4);
            sub_dd88(&g_f0d450, v10, g_f0d458);
            sub_13e9ac(&v2);
            return 0;
        }
    }
    v11 = sub_c60d14(a0);
    sub_13e9ac(&v2);
    v12 = __Unwind_Resume(v11);
    sub_13e9ac(&v2);
    __Unwind_Resume(v12);
}
