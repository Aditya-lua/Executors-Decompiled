/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c6ce4..0x1c6f6c (648 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c6ce4_0 {
    char field_0;
} st_1c6ce4_0;

extern unsigned long long g_e726e0;
extern unsigned long long g_e72778;
extern unsigned long long g_e727d8;
extern char g_10002b0;

unsigned int sub_1c6ce4(unsigned long a0, unsigned long a1, long long a2)
{
    unsigned int num;  // x22
    unsigned long v19;  // cc_dep2
    unsigned long v20;  // cc_ndep
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long v23;  // cc_op
    unsigned long v24;  // cc_dep1
    unsigned long long v25;  // x0
    char *v26;  // x0
    unsigned long long v27;  // x8
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    st_1c6ce4_0 **v0;  // [bp-0x110], Other Possible Types: char
    st_1c6ce4_0 *v1;  // [bp-0x108]
    char v2;  // [bp-0x100]
    unsigned long v3;  // [bp-0xf8]
    char *v4;  // [bp-0xf0]
    long long v5;  // [bp-0xe8]
    unsigned int v6;  // [bp-0xe0]
    unsigned int v7;  // [bp-0xd0]
    char v8;  // [bp-0xc0]
    char v9;  // [bp-0xa0]
    unsigned int v10;  // [bp-0x88]
    char v11;  // [bp-0x80]
    unsigned long v12;  // [bp-0x70]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v3 = a0;
    v4 = &v11;
    v5 = 16;
    v6 = 0;
    v7 = 0;
    if (sub_1c2800(&v3))
    {
        num = _strtoul(sub_1a7f50(&v3), &v2, 16);
        if (v2 != sub_1a7f50(&v3))
        {
            v17 = arm64g_calculate_condition(v23 | 16, v24, v19, v20);
            v18 = arm64g_calculate_condition(18, (v17 & 1 ? num : 0x40000000), v17 & 1, 0);
            if (v18 & 1)
                goto LABEL_1c6dac;
        }
        else
        {
            v21 = arm64g_calculate_condition(v23 | 16, v24, v19, v20);
            v22 = arm64g_calculate_condition(16, (v21 & 1 ? num : 0x40000000), v21 & 1, 0);
            if (v22 & 1)
            {
LABEL_1c6dac:
                if (!num)
                {
                    goto *((void *)(g_e727d8));
                }
                else
                {
                    v10 = 0;
                    sub_1e524(&v8, a2);
                    v25 = sub_1c6438(a0, num, &v9, &v8);
                    sub_181a8(&v8);
                    sub_181a8(&v9);
                    if (v25 & 1 && sub_1c2800(&v3))
                    {
                        v26 = sub_1a7f50(&v3);
                        if (*v26 == 13 && v26[1] == 10 && !v26[2])
                        {
                            if (sub_1c2800(&v3) & 1)
                                v27 = 80;
                            else
                                v27 = 152;
                            goto *((void *)(*(long long *)((char *)&g_e726e0 + v27)));
                        }
                    }
                }
            }
        }
        goto *((void *)(g_e72778));
    }
    else
    {
        if (*(long long *)&g_10002b0 == v12)
            return 0;
        __Unwind_Resume(___stack_chk_fail());
    }
}
