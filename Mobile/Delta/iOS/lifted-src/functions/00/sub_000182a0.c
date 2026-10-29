/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x182a0..0x183f8 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_182a0_0 {
    char padding_0[88];
    long long field_58;
    char padding_60[36];
    long long field_84;
    char padding_8c[76];
    long long field_d8;
} st_182a0_0;

typedef struct st_182a0_1 {
    char padding_0[12];
    unsigned long long field_c;
} st_182a0_1;

typedef struct st_182a0_2 {
    char padding_0[20];
    unsigned long long field_14;
} st_182a0_2;

extern long long g_f0ca10;
extern char g_10002b0;

long long sub_182a0(st_182a0_0 *a0, st_182a0_1 *a1, long long a2)
{
    st_182a0_1 *v6;  // x21
    st_182a0_2 *v7;  // x24
    unsigned long v8;  // x0
    long long v9;  // x0
    unsigned long v0;  // [bp-0x60]
    st_182a0_1 **v1;  // [bp-0x58], Other Possible Types: unsigned long
    st_182a0_1 *v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a1;
    v3 = *(long long *)&g_10002b0;
    if (!(sub_ecd4() & 1))
    {
        if ((char)g_f0ca10 == 1)
        {
            v6 = sub_1af8c(a0, v6);
        }
        else
        {
            v2 = v6;
            v0 = sub_19088(a0, &v2, 1);
            v1 = &v2;
            v6 = sub_11094(a0, (v6->padding_0)[1], &v0, "Assigned expression must be a variable or a field");
        }
    }
    sub_f8d0(a0);
    v7 = sub_18934(a0, 0);
    v0 = *(long long *)&(v6->padding_0)[1];
    v1 = *(long long *)&(v7->padding_0)[1];
    v8 = sub_404c(*(long long *)&a0->padding_8c[72], 56);
    sub_5b0c(v8, &v0, a2, v6, v7);
    if ((char)a0->field_58 == 1)
    {
        v9 = sub_404c(*(long long *)&a0->padding_8c[72], 12);
        sub_86c4(v9, *(long long *)&(a0->padding_60)[1]);
        v0 = v8;
        sub_1c9f0(&a0[5].padding_0[24], &v0);
        *(long long *)(sub_12484(&a0[5].padding_0[24], &v0) + 8) = v9;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v8;
    ___stack_chk_fail();
}
