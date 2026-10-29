/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc2b25c..0xc2b4c8 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c2b25c_0 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c2b25c_0;


void sub_c2b25c(st_c2b25c_0 *a0, unsigned long a1, unsigned long long *a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long v5;  // x25
    unsigned long v6;  // x2
    unsigned long long v16;  // x23
    unsigned long v17;  // x23
    unsigned long long v7;  // 4164
    unsigned long long v8;  // x8
    void* v9;  // x1
    unsigned long long i;  // x8
    void* iter;  // x9
    unsigned long long v12;  // x8
    uint128_t v13;  // q1
    st_c2b25c_0 *v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x60]
    unsigned long long v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a0->field_8;
    v6 = v5 + 1;
    v7 = arm64g_calculate_condition(50, v5, 1, 0);
    if (!(v7 & 1))
    {
        v8 = 0;
    }
    else
    {
        v9 = a0->field_0;
        i = v6 >> 3;
        if (v6 & 7)
            i += 1;
        iter = v9;
        do
        {
            v12 = i;
            v13 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)iter));
            *(unsigned long long *)iter = __dirty_unsupported_Iop_ZeroHI64ofV128(v13 | 0x8080808080808080);
            iter += 8;
            i = v12 - 1;
        } while (i);
        if (v6 >= 8)
        {
            *(long long *)((char *)v9 + v6) = *(long long *)v9;
        }
        else
        {
            _memmove(v9 + 8);
            a4 = a4;
        }
        v16 = 0;
        v1 = a4;
        v2 = a3;
        v0 = a0;
        do
        {
            v17 = v16;
            if (*((char *)a0->field_0 + v17) == 128)
                a2();
        } while ((v16 = v17 + 1, v17 != v5));
        v8 = a0->field_8;
        if (v8 >= 8)
            v8 = (v8 + 1 >> 3) * 7;
    }
    a0->field_10 = v8 - a0->field_18;
    return;
}
