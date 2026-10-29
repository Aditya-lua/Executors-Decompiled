/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac4f98..0xac5150 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac4f98_0 {
    char padding_0[160];
    struct st_ac4f98_1 *field_a0;
    char padding_a8[24];
    long long field_c0;
} st_ac4f98_0;

typedef struct st_ac4f98_2 {
    struct st_ac4f98_0 *field_0;
    char padding_8[8];
    long long field_10;
} st_ac4f98_2;

typedef struct st_ac4f98_1 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[20];
    unsigned int field_28;
} st_ac4f98_1;

extern char g_10002b0;

long long sub_ac4f98(st_ac4f98_2 *a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6)
{
    st_ac4f98_0 *v5;  // x8
    unsigned long n;  // x24
    unsigned int v7;  // w0
    long long v8;  // x27
    unsigned long long v9;  // x22
    long long v10;  // x19
    unsigned int v0;  // [bp-0xec]
    char v1;  // [bp-0xe8]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = a0->field_0;
    n = v5->field_a0->field_10;
    v7 = sub_a50ac8(v5->field_c0);
    if ((int)v7 >= 1)
    {
        v0 = v7;
        ___memcpy_chk(&v1, a1, n, 128);
        _memcpy(&(&v1)[n], a2, n);
        v8 = a0->field_10;
        if (sub_a3f7f0(v8, 0, 0) == 1 && sub_a3fe10(v8, a1, n) == 1 && sub_a3fe10(v8, a2, n) == 1 && sub_a3fe10(v8, a3, n) == 1 && sub_a3fe10(v8, a4, a5) == 1 && !(v9 = n * 2, sub_a3ff7c(v8, &(&v1)[v9], 0) != 1))
            v10 = !sub_ab2f14(a6, v5->field_a0->field_28, &v1, v9 + v0, a0->field_0->field_c0);
        else
            v10 = 0;
        sub_a66ec0(&v1, 128);
    }
    else
    {
        v10 = 0;
    }
    if (*(long long *)&g_10002b0 == v2)
        return v10;
    ___stack_chk_fail();
}
