/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3b71c..0xa3b8c0 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3b71c_0 {
    void* field_0;
    char padding_8[108];
    unsigned int field_74;
} st_a3b71c_0;

extern void g_a3aef4;
extern char g_10002b0;

void sub_a3b71c(st_a3b71c_0 *a0, void* a1, long long a2)
{
    unsigned long long v39;  // x28
    unsigned long long v40;  // x27
    unsigned int v49;  // w24
    void* v50;  // x21
    void* v51;  // x23
    unsigned long long v41;  // x24
    unsigned long long v42;  // x23
    unsigned long long v43;  // x22
    unsigned long long v44;  // x21
    unsigned long long v45;  // x20
    unsigned long long v46;  // x19
    unsigned long long v47;  // x30
    void* v48;  // w9
    unsigned int v0;  // [bp-0x180]
    unsigned int v1;  // [bp-0x17c]
    unsigned int v2;  // [bp-0x178]
    void* v3;  // [bp-0x174]
    void* v4;  // [bp-0x170]
    void* v5;  // [bp-0x168]
    void* v6;  // [bp-0x160]
    void* v7;  // [bp-0x150]
    void* v8;  // [bp-0x140]
    void* v9;  // [bp-0x130]
    void* v10;  // [bp-0x120]
    void* v11;  // [bp-0x110]
    void* v12;  // [bp-0x100]
    st_a3b71c_0 *v13;  // [bp-0xe8]
    void* v14;  // [bp-0xe0], Other Possible Types: unsigned int
    void* v15;  // [bp-0xd8]
    void* v16;  // [bp-0xd0], Other Possible Types: unsigned int
    unsigned int v17;  // [bp-0xcc]
    long long v18;  // [bp-0xc8]
    void* v19;  // [bp-0xc0]
    void* *v20;  // [bp-0xb8]
    void* v21;  // [bp-0xb0]
    void* v22;  // [bp-0xa0]
    void* v23;  // [bp-0x90]
    void* v24;  // [bp-0x80]
    void* v25;  // [bp-0x70]
    void* v26;  // [bp-0x60]
    unsigned long v27;  // [bp-0x58]
    unsigned long long v28;  // [bp-0x50]
    unsigned long long v29;  // [bp-0x48]
    unsigned long long v30;  // [bp-0x40]
    unsigned long long v31;  // [bp-0x38]
    unsigned long long v32;  // [bp-0x30]
    unsigned long long v33;  // [bp-0x28]
    unsigned long long v34;  // [bp-0x20]
    unsigned long long v35;  // [bp-0x18]
    char *v36;  // [bp-0x10]
    unsigned long long v37;  // [bp-0x8]
    char v38;  // [bp+0x0]

    v28 = v39;
    v29 = v40;
    v30 = v41;
    v31 = v42;
    v32 = v43;
    v33 = v44;
    v34 = v45;
    v35 = v46;
    v36 = &v38;
    v37 = v47;
    v27 = *(long long *)&g_10002b0;
    v26 = 0;
    v25 = (void*)0;
    v24 = (void*)0;
    v23 = (void*)0;
    v22 = (void*)0;
    v21 = (void*)0;
    v19 = (void*)0;
    v16 = (void*)0;
    v14 = (void*)0;
    v6 = (void*)0;
    v7 = (void*)0;
    v4 = (void*)0;
    v11 = (void*)0;
    v12 = (void*)0;
    v9 = (void*)0;
    v10 = (void*)0;
    v8 = (void*)0;
    v48 = (void*)(int)a0->field_0;
    if (!(int)a0->field_0)
        v48 = 0xffffffff;
    v49 = 2;
    v0 = 2;
    v1 = a0->field_74;
    v2 = a0->field_74;
    v3 = v48;
    v5 = a1;
    v6 = a1;
    v50 = sub_a3bce0();
    v51 = &g_a3aef4;
    if (v50)
    {
        if ((long long)v50[56])
            v51 = (long long)v50[56];
        v49 = *(int *)v50;
        v16 = v6 != 0;
    }
    v14 = v49;
    v15 = a1;
    v17 = _strlen(a2);
    v13 = a0;
    v18 = a2;
    v20 = &v8;
    v51();
}
