/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x68110..0x6826c (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_68110_1 {
    char padding_0[96];
    long long field_60;
} st_68110_1;

typedef struct st_68110_0 {
    char field_0;
} st_68110_0;

extern long long g_c7c2eb;
extern unsigned long long g_e6a400;
extern unsigned long long g_e6a498;

long long sub_68110(st_68110_1 *a0, long long a1)
{
    long long v4;  // x0
    long long v5;  // x0
    long long v6;  // x0
    long long v7;  // x0
    long long v8;  // x22
    long long v9;  // x0
    st_68110_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_68110_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_962b90(a0->field_60);
    if (!v4)
        return v4;
    sub_af368c();
    v5 = sub_a0c8(a1);
    v6 = sub_9d885c(v5, sub_6b08(a1));
    if (!v6)
        return v6;
    v7 = sub_a9e46c(v6, 0, 0, &g_c7c2eb);
    if (v7)
    {
        v8 = v7;
        sub_a35af4();
        if (!sub_af2f6c(v4, v8))
        {
            v9 = sub_a35cc4();
            if (sub_67f40(v9) != 11 || sub_682b8(v9) != 101)
            {
                sub_afc404(v8);
                goto *((void *)(g_e6a400));
            }
        }
        sub_afc404(v8);
        goto *((void *)(g_e6a498));
    }
    else
    {
        sub_a35af4();
        goto *((void *)(g_e6a400));
    }
}
