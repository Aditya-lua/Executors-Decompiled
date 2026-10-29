/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3ad00..0xa3aef4 (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3ad00_0 {
    char padding_0[116];
    unsigned int field_74;
    void* field_78;
} st_a3ad00_0;

extern void g_a3aef4;
extern long long g_e91408;
extern char g_10002b0;

unsigned int sub_a3ad00(st_a3ad00_0 *a0, unsigned int a1, unsigned int a2, unsigned int a3, unsigned int a4, unsigned long long a5)
{
    unsigned long long v27;  // 4259
    void* v28;  // x0
    void* v29;  // x20
    unsigned int v30;  // w0
    void* v31;  // x24
    void* v0;  // [bp-0x180]
    unsigned int v1;  // [bp-0x17c]
    unsigned int v2;  // [bp-0x178]
    unsigned int v3;  // [bp-0x174]
    void* v4;  // [bp-0x170], Other Possible Types: unsigned int
    void* v5;  // [bp-0x160]
    void* v6;  // [bp-0x150]
    void* v7;  // [bp-0x140]
    void* v8;  // [bp-0x130]
    void* v9;  // [bp-0x120]
    void* v10;  // [bp-0x110]
    void* v11;  // [bp-0x100]
    st_a3ad00_0 *v12;  // [bp-0xe8]
    unsigned int v13;  // [bp-0xe0]
    unsigned int v14;  // [bp-0xdc]
    void* v15;  // [bp-0xd8]
    unsigned int v16;  // [bp-0xcc]
    void* v17;  // [bp-0xc8], Other Possible Types: unsigned long long
    void* v18;  // [bp-0xb8], Other Possible Types: void* *
    void* v19;  // [bp-0xa8]
    void* v20;  // [bp-0x98]
    void* v21;  // [bp-0x88]
    void* v22;  // [bp-0x78]
    void* v23;  // [bp-0x68]
    unsigned long v24;  // [bp-0x58]
    char *v25;  // [bp-0x10]
    char v26;  // [bp+0x0]

    v25 = &v26;
    v24 = *(long long *)&g_10002b0;
    v22 = (void*)0;
    v23 = (void*)0;
    v20 = (void*)0;
    v21 = (void*)0;
    v18 = (void*)0;
    v19 = (void*)0;
    v15 = (void*)0;
    v17 = (void*)0;
    v5 = (void*)0;
    v6 = (void*)0;
    v0 = (void*)0;
    v4 = (void*)0;
    v10 = (void*)0;
    v11 = (void*)0;
    v8 = (void*)0;
    v9 = (void*)0;
    v7 = (void*)0;
    v27 = arm64g_calculate_condition(0x11, a1, 1, 0);
    if (!(v27 & 1))
        a1 = a0->field_74;
    v1 = a1;
    v2 = a1;
    v3 = a2;
    v4 = a3;
    v28 = sub_a3bce0(&v0, &g_e91408, 86);
    if (v28)
    {
        v29 = v28;
        if (!a0->field_78 || *(int *)a0->field_78 == (int)v29[4] || *(int *)a0->field_78 == (int)v29[8])
        {
            if (!(long long)v29[56])
                v31 = &g_a3aef4;
            else
                v31 = (long long)v29[56];
            v13 = *(int *)v29;
            v14 = v4;
            v16 = a4;
            v12 = a0;
            v17 = a5;
            v18 = &v7;
            v31();
        }
        else
        {
            v30 = 0xffffffff;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/ctrl_params_translate.c", 2716, "evp_pkey_ctx_ctrl_to_param");
        sub_a36abc(6, 147, 0);
        v30 = 0xfffffffe;
    }
    if (*(long long *)&g_10002b0 == v24)
        return v30;
    ___stack_chk_fail();
}
