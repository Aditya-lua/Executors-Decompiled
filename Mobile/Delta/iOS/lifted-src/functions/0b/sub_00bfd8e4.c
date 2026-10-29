/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfd8e4..0xbfd9c4 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfd8e4_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_bfd8e4_0;

typedef struct st_bfd8e4_1 {
    long long field_0;
    char field_8;
    char field_9;
} st_bfd8e4_1;


double sub_bfd8e4(st_bfd8e4_0 *a0, st_bfd8e4_1 *a1)
{
    unsigned long v4;  // x20
    unsigned int v5;  // w24
    unsigned long v14;  // x20
    unsigned long v15;  // x20
    long long v16;  // x0
    long long v17;  // x0
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long long v8;  // x25
    unsigned long long v9;  // 4102
    unsigned long long v10;  // 4102
    unsigned long long v11;  // x23
    unsigned long long ptr;  // x0
    unsigned long long idx;  // x23
    uint128_t v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_8;
    v5 = a1->field_9;
    v6 = v5 & 0xff;
    v7 = v4 & 0xff;
    if (v5 < (unsigned int)v4)
    {
        v8 = 0;
        v9 = arm64g_calculate_condition(147, v6, v7, 0);
        if (v9 & 1)
            goto LABEL_bfd968;
LABEL_bfd918:
        v11 = (v8 * 8 | v8 >> 61) & 0x7fffffff8 & 0x7ffffffff;
        ptr = _malloc(v11);
        if (!ptr)
        {
            v16 = sub_c6b970(8, v11);
            v1 = v11;
            sub_b661ac(&v0);
            v17 = __Unwind_Resume(v16);
            sub_c73e0c(v17);
        }
        idx = 0;
        v0 = CONCAT(ptr, v8);
        v14 = v4;
        do
        {
            v15 = v14 + 1;
            *(unsigned long long *)(ptr + idx * 8) = sub_bfa154(a1->field_0, v14);
            idx += 1;
            v14 = v15;
        } while ((v5 - v4 & 0xff) != idx);
    }
    else
    {
        v8 = v5 - v4 & 0xffffffff;
        v10 = arm64g_calculate_condition(147, v6, v7, 0);
        if (!(v10 & 1))
            goto LABEL_bfd918;
LABEL_bfd968:
        idx = 0;
        v0 = CONCAT(8, 0);
    }
    a0->field_0 = v0;
    a0->field_10 = idx;
    return *(unsigned long long *)&v0;
}
