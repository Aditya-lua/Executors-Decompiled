/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2328dc..0x23298c (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2328dc_1 {
    struct st_2328dc_0 *field_0;
} st_2328dc_1;

typedef struct st_2328dc_0 {
    char field_0;
} st_2328dc_0;

typedef struct st_2328dc_2 {
    char padding_0[257];
    char field_101;
} st_2328dc_2;

typedef struct st_2328dc_3 {
    char padding_0[96];
    struct st_2328dc_2 *field_60;
} st_2328dc_3;

extern st_2328dc_3 *g_f0d198;

char sub_2328dc(long long a0)
{
    char v6;  // x0
    char idx;  // x20
    unsigned long long t;  // x0
    st_2328dc_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_2328dc_0 *v1;  // [bp-0x38]
    st_2328dc_0 **v2;  // [bp-0x30], Other Possible Types: st_2328dc_1 **, char
    st_2328dc_0 *v3;  // [bp-0x28], Other Possible Types: st_2328dc_1 **
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v6 = sub_232a04(a0, 1);
        if (v6)
        {
            idx = *(long long *)(v6 + 24);
            if (idx)
            {
                v3 = &v2;
                v2 = &v3;
                if (*(char *)(idx + 80) != 1)
                    return 0;
                t = std::__1::chrono::steady_clock::now();
                *(unsigned long long *)(idx + 72) = t - *(long long *)(idx + 64);
                *(char *)(idx + 80) = 0;
                return 0;
            }
        }
    }
    sub_c60e0c(a0);
}
