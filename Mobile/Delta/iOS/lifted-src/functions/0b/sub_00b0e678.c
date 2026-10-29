/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0e678..0xb0e784 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0e678_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[71];
    unsigned long long field_50;
    char padding_58[8];
    char field_60;
    char padding_61[127];
    long long field_e0;
    long long field_e8;
} st_b0e678_0;

extern char g_10002b0;

unsigned long long sub_b0e678(unsigned long long *a0, st_b0e678_0 *a1)
{
    st_b0e678_0 *v7;  // x19
    unsigned long v8;  // x23
    unsigned long long *v9;  // x21
    unsigned long long i;  // x8
    unsigned long long *iter;  // x9
    st_b0e678_0 *v12;  // x10
    unsigned long long v13;  // x8
    st_b0e678_0 *v14;  // x10
    unsigned long long v0;  // [bp-0x90]
    unsigned long long v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x60]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a1;
    v4 = *(long long *)&g_10002b0;
    v8 = a1->field_e8 + 7;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    if (!(a1->field_e8 & 7))
        v9 = a0;
    else
        v9 = &v0;
    a1->field_50 = 0xffffffffffffffff;
    _bzero();
    sub_b0cde4(v7, &a1->field_60, v7->field_e0);
    if ((int)(v8 >> 3) >= 1)
    {
        i = (v8 * 0x2000000000000000 | v8 >> 3) & 0xe00000007fffffff & 0x7fffffff;
        iter = v9;
        v12 = v7;
        do
        {
            v13 = i;
            v14 = &v12->field_8;
            *iter = v12->field_0;
            iter += 1;
            i = v13 - 1;
            v12 = v14;
        } while (i);
    }
    if (v9 != a0)
    {
        _memcpy(a0, v9, v7->field_e8);
        sub_a66ec0(v9, 64);
    }
    sub_a66ec0(v7, 240);
    if (*(long long *)&g_10002b0 == v4)
        return 1;
    ___stack_chk_fail();
}
