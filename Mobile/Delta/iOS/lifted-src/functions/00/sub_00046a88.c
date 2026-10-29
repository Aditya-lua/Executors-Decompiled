/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x46a88..0x46c80 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_46a88_2 {
    char padding_0[32];
    struct st_46a88_3 *field_20;
    unsigned long long field_28;
} st_46a88_2;

typedef struct st_46a88_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    struct st_46a88_1 *field_20;
    struct st_46a88_0 *field_28;
} st_46a88_0;

typedef struct st_46a88_1 {
    unsigned long long field_0;
} st_46a88_1;

typedef struct st_46a88_3 {
    struct st_46a88_0 *field_0;
} st_46a88_3;

typedef struct st_46a88_4 {
    char field_0;
} st_46a88_4;

extern unsigned long long g_e65018;
extern unsigned int g_f00ca0;
extern unsigned int g_f00d00;
extern char g_10002b0;

void sub_46a88(unsigned long long a0, unsigned long a1, st_46a88_3 **a2, st_46a88_2 *a3, unsigned long long a4)
{
    unsigned long long v21;  // x28
    unsigned long long v22;  // x27
    unsigned long long v31;  // x30
    unsigned long long v32;  // x21
    unsigned long long v33;  // cc_dep1
    unsigned long v34;  // cc_dep2
    unsigned long long idx;  // x21
    st_46a88_0 *v36;  // x27
    unsigned int v37;  // w8
    unsigned long v38;  // 4112
    unsigned long v39;  // cc_op
    unsigned long v40;  // cc_dep1
    unsigned long long v23;  // x26
    unsigned long v41;  // cc_dep2
    unsigned long long v42;  // 4102
    unsigned long v43;  // 4112
    unsigned long long v44;  // 4102
    unsigned long long v45;  // 4112
    unsigned long long v46;  // 4102
    unsigned long long v47;  // 4112
    unsigned long long v48;  // 4102
    unsigned long long *iter;  // x27
    unsigned long long i;  // x28
    unsigned long long v24;  // x25
    unsigned long long v51;  // x28
    unsigned long long v25;  // x24
    unsigned long long v26;  // x23
    unsigned long long v27;  // x22
    unsigned long long v28;  // x21
    unsigned long long v29;  // x20
    unsigned long long v30;  // x19
    st_46a88_4 **v0;  // [bp-0xc0], Other Possible Types: char
    st_46a88_4 *v1;  // [bp-0xb8]
    st_46a88_0 *v2;  // [bp-0xb0], Other Possible Types: unsigned long
    unsigned long long v3;  // [bp-0xa8]
    unsigned long long v4;  // [bp-0xa0]
    st_46a88_0 *v5;  // [bp-0x98]
    char v6;  // [bp-0x90]
    unsigned long v7;  // [bp-0x68]
    unsigned long long v8;  // [bp-0x60]
    unsigned long long v9;  // [bp-0x58]
    unsigned long long v10;  // [bp-0x50]
    unsigned long long v11;  // [bp-0x48]
    unsigned long long v12;  // [bp-0x40]
    unsigned long long v13;  // [bp-0x38]
    unsigned long long v14;  // [bp-0x30]
    unsigned long long v15;  // [bp-0x28]
    unsigned long long v16;  // [bp-0x20]
    unsigned long long v17;  // [bp-0x18]
    char *v18;  // [bp-0x10]
    unsigned long long v19;  // [bp-0x8]
    char v20;  // [bp+0x0]

    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = v30;
    v18 = &v20;
    v19 = v31;
    v32 = a4;
    v7 = *(long long *)&g_10002b0;
    v1 = &v0;
    v2 = 0;
    v0 = &v1;
    v3 = &g_e65018;
    v4 = a0;
    v5 = 0;
    sub_f6e8(&v6, &v2, 0);
    v33 = a3->field_28;
    if (a3->field_28 > v32)
    {
        v34 = v32;
        do
        {
            idx = v32;
            v36 = *(long long *)&a3->field_20[idx];
            v37 = v36->field_8;
            if (v36)
            {
                v38 = arm64g_calculate_condition(20, v33, v34, 0);
                v39 = 3;
                v40 = (v38 & 1 ? v37 : 0);
                v41 = (v38 & 1 ? g_f00ca0 : 0);
                v42 = arm64g_calculate_condition(3, v40, v41, 0);
                if (v42 & 1)
                    goto LABEL_46b6c;
                goto LABEL_46b40;
            }
            else
            {
                v43 = arm64g_calculate_condition(20, v33, v34, 0);
                v39 = 0;
                v40 = (v43 & 1 ? v37 : 0);
                v41 = (v43 & 1 ? g_f00ca0 : 0);
                v44 = arm64g_calculate_condition(0, v40, v41, 0);
                if (!(v44 & 1))
                {
LABEL_46b40:
                    if (v36)
                    {
                        v45 = arm64g_calculate_condition(v39 | 16, v40, v41, 0);
                        v46 = arm64g_calculate_condition(19, (v45 & 1 ? v37 : 0), (v45 & 1 ? g_f00d00 : 0), 0);
                        if (v46 & 1)
                            continue;
                    }
                    else
                    {
                        v47 = arm64g_calculate_condition(v39 | 16, v40, v41, 0);
                        v48 = arm64g_calculate_condition(16, (v47 & 1 ? v37 : 0), (v47 & 1 ? g_f00d00 : 0), 0);
                        if (v48 & 1)
                            continue;
                    }
                    sub_3aaac(&v6, &v36->field_20);
                    sub_447fc(&v6, &v36->field_20);
                }
                else
                {
LABEL_46b6c:
                    if (v36->field_28)
                    {
                        iter = v36->field_20;
                        i = v36->field_28 * 8;
                        do
                        {
                            v51 = i;
                            v2 = *iter;
                            sub_3aaac(&v6, &v2);
                            sub_447fc(&v6, &v2);
                            iter += 1;
                            i = v51 - 8;
                        } while (i);
                    }
                }
            }
        } while ((v32 = idx + 1, v34 = a3->field_28, v33 = v32, a3->field_28 > v33));
    }
    (*(long long *)*a2)();
}
