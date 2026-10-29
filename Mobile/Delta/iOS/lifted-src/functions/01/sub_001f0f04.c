/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f0f04..0x1f106c (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f0f04_1 {
    unsigned int field_0;
    unsigned int field_4;
} st_1f0f04_1;

typedef struct st_1f0f04_0 {
    char field_0;
} st_1f0f04_0;

extern char g_10002b0;

unsigned long long sub_1f0f04(unsigned long long *a0)
{
    unsigned long v12;  // x8
    unsigned long v13;  // x21
    unsigned long long v22;  // 4102
    unsigned long long v23;  // 4112
    unsigned long long v24;  // 4102
    unsigned long v25;  // x20
    unsigned int v26;  // w0
    unsigned long v27;  // x24
    unsigned int *v28;  // x25
    unsigned long v29;  // x24
    unsigned int *v30;  // x25
    unsigned long long v31;  // x0
    unsigned long v14;  // cc_op
    long long v32;  // x0
    long long v33;  // x0
    unsigned long v15;  // cc_dep1
    unsigned long i;  // cc_dep2
    unsigned long v17;  // cc_ndep
    unsigned long v18;  // x8
    st_1f0f04_1 *v19;  // x23
    unsigned long v20;  // x20
    unsigned long long v21;  // 4112
    st_1f0f04_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_1f0f04_0 *v1;  // [bp-0x90]
    unsigned int v2;  // [bp-0x88]
    unsigned int v3;  // [bp-0x84]
    unsigned long v4;  // [bp-0x80]
    unsigned long v5;  // [bp-0x78]
    unsigned long v6;  // [bp-0x70]
    unsigned long v7;  // [bp-0x68]
    unsigned long v8;  // [bp-0x60]
    unsigned long v9;  // [bp-0x58]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v7 = 0;
    v8 = 0;
    v4 = 0;
    v5 = 0;
    v6 = 0;
    v12 = a0[1];
    if (a0[1])
    {
        v13 = 0;
        do
        {
            v18 = v12;
            v19 = *a0 + v13 * 8;
            v20 = v19->field_0;
            if ((unsigned int)v20 < 125252)
            {
                v21 = arm64g_calculate_condition(v14 | 48, v15, i, v17);
                v22 = arm64g_calculate_condition(131, (v21 & 1 ? v20 & 0xffffffff : 0x20000000), (v21 & 1 ? v19->field_4 : 0), 0);
                v12 = v18;
                if (v22 & 1)
                    continue;
            }
            else
            {
                v23 = arm64g_calculate_condition(v14 | 48, v15, i, v17);
                v24 = arm64g_calculate_condition(128, (v23 & 1 ? v20 & 0xffffffff : 0x20000000), (v23 & 1 ? v19->field_4 : 0), 0);
                v12 = v18;
                if (v24 & 1)
                    continue;
            }
            do
            {
                v25 = v20;
                v26 = sub_1eaa7c(&v7, v25);
                if (v26)
                {
                    v27 = v26;
                    v28 = &v7;
                    do
                    {
                        v29 = v27;
                        v30 = v28 + 1;
                        if (*v28 != (unsigned int)v25)
                        {
                            v2 = *v28;
                            v3 = v2;
                            sub_1fa300(&v4, &v2);
                        }
                    } while ((v27 = v29 - 1, v28 = v30, v29 != 1));
                }
            } while (125251 > (unsigned int)v25 && (v20 = (unsigned int)v25 + 1, (unsigned int)v25 < v19->field_4));
            v12 = a0[1];
            v15 = v13 + 1;
            v14 = 4;
            v17 = 0;
            v13 = v15;
            i = v12;
        } while (i > v13);
    }
    sub_1ebd3c(a0, &v4);
    v31 = sub_1eccac(&v4);
    if (*(long long *)&g_10002b0 == v9)
        return v31;
    v32 = ___stack_chk_fail();
    sub_1eccac(&v4);
    v33 = __Unwind_Resume(v32);
    sub_1eccac(&v4);
    __Unwind_Resume(v33);
}
