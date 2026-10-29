/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a79c8..0x2a7cec (804 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a79c8_0 {
    char field_0;
} st_2a79c8_0;

extern unsigned long long g_e7ca78;
extern long long g_e7f620;

void sub_2a79c8(char *a0, st_2a79c8_0 **a1)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long v18;  // cc_dep2
    unsigned long v19;  // cc_ndep
    unsigned long v20;  // 4112
    unsigned long v21;  // cc_op
    unsigned long v22;  // cc_dep1
    unsigned long v23;  // cc_dep2
    unsigned long long v24;  // 4112
    unsigned long v25;  // cc_op
    unsigned long v26;  // cc_dep1
    unsigned long long v12;  // x20
    unsigned long v27;  // 4112
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4107
    unsigned long long v13;  // x19
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4107
    unsigned long long v33;  // x9
    unsigned long long v14;  // x30
    long long v34;  // x0
    long long v15;  // x8
    unsigned int v17;  // w8
    st_2a79c8_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_2a79c8_0 *v1;  // [bp-0x58]
    char v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = &v9;
    v8 = v14;
    v1 = &v0;
    v0 = &v1;
    if (*a1 != a0)
    {
        v34 = ___cxa_allocate_exception(32);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, "iterator does not fit current value", 35);
        sub_2aab3c(202, &v2, a0);
        ___cxa_throw(v34, &g_e7f620, 0x2aede8);
        __debugbreak();
    }
    sub_2ab824(sub_2abea8(v15, a0), a0);
    v17 = *a0;
    if ((v17 & 252) != 4)
    {
        v20 = arm64g_calculate_condition(v25 | 16, v26, v18, v19);
        v21 = 3;
        v22 = (v20 & 1 ? v17 & 0xff : 0x40000000);
        v23 = (v20 & 1 ? 3 : 0);
        v24 = arm64g_calculate_condition(19, v22, v23, 0);
        if (!(v24 & 1))
            goto LABEL_2a7a26;
LABEL_2a7a25:
        v29 = arm64g_calculate_condition(v21 | 16, v22, v23, 0);
        v30 = arm64g_calculate_condition(3, (v29 & 1 ? v17 & 0xff : 0x40000000), (v29 & 1 ? 8 : 0), 0);
        if (!(v30 & 1))
            goto LABEL_2a7a32;
LABEL_2a7a31:
        v33 = 152;
    }
    else
    {
        v27 = arm64g_calculate_condition(v25 | 16, v26, v18, v19);
        v21 = 0;
        v22 = (v27 & 1 ? v17 & 0xff : 0x40000000);
        v23 = (v27 & 1 ? 3 : 0);
        v28 = arm64g_calculate_condition(16, v22, v23, 0);
        if (v28 & 1)
            goto LABEL_2a7a25;
LABEL_2a7a26:
        v31 = arm64g_calculate_condition(v21 | 16, v22, v23, 0);
        v32 = arm64g_calculate_condition(0, (v31 & 1 ? v17 & 0xff : 0x40000000), (v31 & 1 ? 8 : 0), 0);
        if (v32 & 1)
            goto LABEL_2a7a31;
        v33 = 104;
LABEL_2a7a32:
    }
    if (v17 == 1)
        v33 = 80;
    if (v17 == 2)
        v33 = 88;
    goto *((void *)(*(long long *)((char *)&g_e7ca78 + v33)));
}
