/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x231338..0x2313c0 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_231338_0 {
    char field_0;
} st_231338_0;

typedef struct st_231338_1 {
    char padding_0[257];
    char field_101;
} st_231338_1;

typedef struct st_231338_2 {
    char padding_0[96];
    struct st_231338_1 *field_60;
} st_231338_2;

extern st_231338_2 *g_f0d198;

char sub_231338(long long a0)
{
    char v6;  // x0
    char idx;  // x8
    st_231338_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_231338_0 *v1;  // [bp-0x38]
    st_231338_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_231338_0 *v3;  // [bp-0x28]
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
                *(unsigned long long *)(idx + 72) = 0;
                *(char *)(idx + 80) = 0;
                return 0;
            }
        }
    }
    sub_c60e0c(a0);
}
