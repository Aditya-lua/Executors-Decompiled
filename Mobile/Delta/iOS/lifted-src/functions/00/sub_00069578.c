/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x69578..0x6966c (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_69578_0 {
    char field_0;
} st_69578_0;

extern unsigned long long g_e6a5d8;
extern unsigned long long g_e6a600;

void sub_69578(long long a0)
{
    unsigned long long v13;  // x26
    unsigned long long v14;  // x25
    unsigned long long v23;  // x0
    char *v24;  // x21
    unsigned long long *v25;  // x22
    unsigned long v26;  // x20
    unsigned int v28;  // w8
    unsigned long long v29;  // x8
    unsigned long v30;  // cc_op
    unsigned long v31;  // cc_dep1
    unsigned long v32;  // cc_dep2
    unsigned long long v15;  // x24
    unsigned long v33;  // cc_ndep
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4102
    unsigned long long v36;  // 4110
    unsigned long long v37;  // 4102
    unsigned long long v16;  // x23
    unsigned long long v17;  // x22
    unsigned long long v18;  // x21
    unsigned long long v19;  // x20
    unsigned long long v20;  // x19
    unsigned long long v21;  // x30
    char *v22;  // x19
    st_69578_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_69578_0 *v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = &v12;
    v11 = v21;
    v1 = &v0;
    v0 = &v1;
    v22 = sub_a0c8();
    v23 = sub_a0c8(a0);
    v24 = v23 + sub_6b08(a0);
    if (v22 != v24)
    {
        v25 = &g_e6a600;
        do
        {
            v26 = *v22;
            if (sub_58440(v26, 0x100))
                continue;
            v28 = (unsigned int)v26 & 0xff;
            v29 = 1 << ((char)v28 & 63) & 0x680000000000;
            if (v28 <= 46)
            {
                v34 = arm64g_calculate_condition(v30 | 144, v31, v32, v33);
                v35 = arm64g_calculate_condition(20, (v34 & 1 ? v29 : 0x40000000), 0, 0);
                if (v35 & 1)
                    continue;
                goto LABEL_69624;
            }
            else
            {
                v36 = arm64g_calculate_condition(v30 | 144, v31, v32, v33);
                v37 = arm64g_calculate_condition(16, (v36 & 1 ? v29 : 0x40000000), 0, 0);
                if (!(v37 & 1))
                {
LABEL_69624:
                    v25 = &g_e6a5d8;
                    break;
                }
            }
        } while ((v22 += 1, v22 != v24));
        goto *((void *)(*v25));
    }
    else
    {
        goto *((void *)(g_e6a600));
    }
}
