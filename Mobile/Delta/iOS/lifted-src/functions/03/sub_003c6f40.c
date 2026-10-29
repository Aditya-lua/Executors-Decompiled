/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c6f40..0x3c708c (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c6f40_1 {
    struct st_3c6f40_0 *field_0;
} st_3c6f40_1;

typedef struct st_3c6f40_0 {
    char field_0;
} st_3c6f40_0;

extern unsigned long long g_e7d880;
extern unsigned long long g_e7d890;

void sub_3c6f40(void* a0)
{
    unsigned long long v17;  // x26
    unsigned long long v18;  // x25
    unsigned long v27;  // x10
    unsigned long v28;  // x20
    unsigned long long v19;  // x24
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    unsigned long long v25;  // x30
    unsigned long v26;  // x8
    st_3c6f40_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_3c6f40_0 *v1;  // [bp-0x78]
    void* v2;  // [bp-0x70]
    long long v3;  // [bp-0x68]
    st_3c6f40_0 *v4;  // [bp-0x60], Other Possible Types: st_3c6f40_1 **
    st_3c6f40_0 **v5;  // [bp-0x58], Other Possible Types: st_3c6f40_1 **, char
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long long v10;  // [bp-0x30]
    unsigned long long v11;  // [bp-0x28]
    unsigned long long v12;  // [bp-0x20]
    unsigned long long v13;  // [bp-0x18]
    char *v14;  // [bp-0x10]
    unsigned long long v15;  // [bp-0x8]
    char v16;  // [bp+0x0]

    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = v24;
    v14 = &v16;
    v15 = v25;
    v1 = &v0;
    v0 = &v1;
    v4 = &v5;
    v5 = &v4;
    v2 = a0;
    v3 = 1;
    std::__1::mutex::lock(a0);
    sub_3c70a0(a0 + 64, &v2, a0);
    v26 = (long long)a0[152];
    if (v26)
    {
        v4 = &v5;
        v5 = &v4;
        v27 = (long long)a0[144];
        v28 = *(long long *)(*(long long *)((long long)a0[120] + (v27 >> 6 & 0x3fffffffffffff8)) + (v27 & 0x1ff) * 8);
        v4 = &v5;
        v5 = &v4;
        *(unsigned long *)&a0[144] = v27 + 1;
        *(unsigned long *)&a0[152] = v26 - 1;
        sub_3c6c98(a0 + 112, 1);
        sub_63c20(&v2);
        if (v28)
        {
            sub_3c718c(v28);
            sub_60b78(v28 + 0x88);
            sub_60b78(v28 + 120);
            sub_2346e4(v28 + 112, 0);
            sub_60b78(v28 + 64);
            operatordelete(v28);
        }
        goto *((void *)(g_e7d890));
    }
    else
    {
        sub_63c20(&v2);
        goto *((void *)(g_e7d880));
    }
}
