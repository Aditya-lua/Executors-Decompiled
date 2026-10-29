/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x44e7c..0x44fd8 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_44e7c_2 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    uint128_t field_10;
    unsigned long long field_20;
    char field_28[14];
    char field_2e;
} st_44e7c_2;

typedef struct st_44e7c_0 {
    char field_0;
} st_44e7c_0;

extern char g_10002b0;

unsigned long long sub_44e7c(void* a0)
{
    unsigned long v7;  // x8
    unsigned long v8;  // x21
    unsigned long v9;  // x22
    st_44e7c_2 *v10;  // x20
    st_44e7c_2 *v11;  // x23
    unsigned long v12;  // x8
    unsigned long long *v13;  // x9
    unsigned long long v14;  // x0
    long long v15;  // x0
    st_44e7c_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_44e7c_0 *v1;  // [bp-0x78]
    unsigned long long *v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    sub_40d5c();
    v7 = (long long)a0[8];
    if (v7)
    {
        v8 = 0;
        v9 = 0;
        do
        {
            if (*(long long *)(*(long long *)a0 + v8) != (long long)a0[24])
            {
                v10 = sub_3c28c(&v2, *(long long *)a0 + v8);
                v11 = *(long long *)a0 + v8;
                v10->field_0 = v11->field_0;
                v10->field_8 = v11->field_8;
                sub_1e934(&v10->field_10);
                v10->field_10 = v11->field_10;
                v10->field_20 = v11->field_20;
                memset(&v11->field_10, 0, 24);
                v12 = *(long long *)&v11->field_28[0];
                *(long long *)&v10->field_28[6] = *(long long *)&v11->field_28[6];
                *(unsigned long *)&v10->field_28[0] = v12;
                v7 = (long long)a0[8];
            }
        } while ((v9 += 1, v8 += 56, v7 > v9));
    }
    v13 = *(long long *)a0;
    *(unsigned long long **)a0 = v2;
    *(unsigned long *)&a0[8] = v3;
    v2 = v13;
    v3 = v7;
    v14 = sub_3e180(&v2);
    if (*(long long *)&g_10002b0 == v4)
        return v14;
    v15 = __Unwind_Resume(___stack_chk_fail());
    sub_3e180(&v2);
    __Unwind_Resume(v15);
}
