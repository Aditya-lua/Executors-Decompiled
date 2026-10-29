/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0ffc8..0xb100d0 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0ffc8_0 {
    unsigned int field_0;
    char field_4;
    char padding_5[35];
    unsigned int field_28;
    char padding_2c[4];
    char field_30;
    char padding_31[63];
    long long field_70;
    long long field_78;
} st_b0ffc8_0;

extern char g_10002b0;

unsigned long long sub_b0ffc8(void* a0, st_b0ffc8_0 *a1)
{
    st_b0ffc8_0 *v5;  // x19
    unsigned long v6;  // x23
    void* v7;  // x21
    unsigned long long i;  // x8
    void* iter;  // x9
    st_b0ffc8_0 *v10;  // x10
    unsigned long long v11;  // x8
    st_b0ffc8_0 *v12;  // x10
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x60]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1;
    v2 = *(long long *)&g_10002b0;
    v6 = a1->field_78 + 3;
    v0 = 0;
    v1 = 0;
    if (!(a1->field_78 & 3))
        v7 = a0;
    else
        v7 = &v0;
    a1->field_28 = 0xffffffff;
    _bzero();
    sub_b0eb04(v5, &a1->field_30, v5->field_70);
    if ((int)(v6 >> 2) >= 1)
    {
        i = (v6 * 0x4000000000000000 | v6 >> 2) & 0xc00000007fffffff & 0x7fffffff;
        iter = v7;
        v10 = v5;
        do
        {
            v11 = i;
            v12 = &v10->field_4;
            *(unsigned int *)iter = v10->field_0;
            iter += 4;
            i = v11 - 1;
            v10 = v12;
        } while (i);
    }
    if (v7 != a0)
    {
        _memcpy(a0, v7, v5->field_78);
        sub_a66ec0(v7, 32);
    }
    sub_a66ec0(v5, 128);
    if (*(long long *)&g_10002b0 == v2)
        return 1;
    ___stack_chk_fail();
}
