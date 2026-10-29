/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x977264..0x977334 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_977264_0 {
    char padding_0[8];
    long long field_8;
} st_977264_0;

typedef struct st_977264_1 {
    char padding_0[232];
    long long field_e8;
} st_977264_1;

extern long long g_977334;

st_977264_0 * sub_977264(st_977264_1 *a0, long long a1, long long a2)
{
    st_977264_0 *v4;  // x19
    st_977264_0 *v0;  // [bp-0x70]
    char v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v4 = sub_9ebce0();
    if (v4 && sub_c689b0(&v1, v4))
    {
        if (sub_98e6d0(&v1, a1, a2))
        {
            sub_a6eaf8(&v1);
            if (sub_c68eb8(&v1, &v0) && sub_976170(a0->field_e8, 1, 2, 7, 0, v4->field_8, v0, &g_977334, v4))
                return 1;
        }
        else
        {
            sub_a6ed4c(&v1);
        }
    }
    sub_9ebcf4(v4);
    return 0;
}
