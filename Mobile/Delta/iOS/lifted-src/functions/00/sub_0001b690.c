/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b690..0x1bdc0 (1840 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b690_1 {
    struct st_1b690_0 *field_0;
} st_1b690_1;

typedef struct st_1b690_0 {
    char field_0;
} st_1b690_0;

extern unsigned long long g_e62fb0;
extern unsigned long long g_e62fd8;
extern unsigned long long g_e63020;

void sub_1b690(void* a0)
{
    unsigned long long v35;  // x28
    unsigned long long v36;  // x27
    unsigned long long v45;  // x30
    void* v46;  // x19
    void* v47;  // x21
    long long v49;  // x0
    long long v50;  // x0
    unsigned long long v51;  // x9
    unsigned long long v52;  // x8
    unsigned long long v37;  // x26
    unsigned long long v38;  // x25
    unsigned long long v39;  // x24
    unsigned long long v40;  // x23
    unsigned long long v41;  // x22
    unsigned long long v42;  // x21
    unsigned long long v43;  // x20
    unsigned long long v44;  // x19
    st_1b690_0 *v0;  // [bp-0x160]
    st_1b690_0 **v1;  // [bp-0x158], Other Possible Types: char
    st_1b690_1 **v2;  // [bp-0x150], Other Possible Types: unsigned long
    unsigned long v3;  // [bp-0x148], Other Possible Types: unsigned long long
    st_1b690_0 **v4;  // [bp-0x128], Other Possible Types: st_1b690_1 **, char
    st_1b690_0 *v5;  // [bp-0x110], Other Possible Types: st_1b690_1 **, unsigned long
    unsigned long long v6;  // [bp-0x108]
    uint128_t v7;  // [bp-0x100]
    uint128_t v8;  // [bp-0xf0]
    uint128_t v9;  // [bp-0xe0]
    unsigned long long *v10;  // [bp-0xc8]
    long long v11;  // [bp-0xc0]
    unsigned long long v12;  // [bp-0xb8]
    unsigned long long *v13;  // [bp-0xb0]
    long long v14;  // [bp-0xa8]
    unsigned long long v15;  // [bp-0xa0]
    unsigned long long *v16;  // [bp-0x98]
    long long v17;  // [bp-0x90]
    unsigned long long v18;  // [bp-0x88]
    unsigned long long *v19;  // [bp-0x80]
    long long v20;  // [bp-0x78]
    unsigned long long v21;  // [bp-0x70]
    unsigned long long v22;  // [bp-0x60]
    unsigned long long v23;  // [bp-0x58]
    unsigned long long v24;  // [bp-0x50]
    unsigned long long v25;  // [bp-0x48]
    unsigned long long v26;  // [bp-0x40]
    unsigned long long v27;  // [bp-0x38]
    unsigned long long v28;  // [bp-0x30]
    unsigned long long v29;  // [bp-0x28]
    unsigned long long v30;  // [bp-0x20]
    unsigned long long v31;  // [bp-0x18]
    char *v32;  // [bp-0x10]
    unsigned long long v33;  // [bp-0x8]
    char v34;  // [bp+0x0]

    v22 = v35;
    v23 = v36;
    v24 = v37;
    v25 = v38;
    v26 = v39;
    v27 = v40;
    v28 = v41;
    v29 = v42;
    v30 = v43;
    v31 = v44;
    v32 = &v34;
    v33 = v45;
    v46 = a0 + 132;
    v47 = v46 - 4;
    v0 = &v1;
    v1 = &v0;
    v19 = a0 + 608;
    v20 = (long long)a0[616] - (long long)a0[608] >> 4;
    v21 = 0;
    v16 = a0 + 632;
    v17 = (long long)a0[640] - (long long)a0[632] >> 4;
    v18 = 0;
    v13 = a0 + 1088;
    v14 = (long long)a0[1096] - (long long)a0[1088] >> 3;
    v15 = 0;
    v10 = v46 + 524;
    v11 = (long long)((long long)v46[532] - *v10) >> 3;
    v12 = 0;
    v7 = *(int128_t *)v47;
    v8 = (int128_t)v47[16];
    v9 = *(int128_t *)v46;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(v46 + 0x404, *(unsigned long long *)((void*)&v8 + 8), sub_b19c(&v7) & 0xffffffff);
    if ((char)a0[88] == 1)
    {
        v5 = &v4;
        v4 = &v5;
        v49 = sub_a0c8(v46 + 0x404);
        v2 = sub_201a0(a0, v49, sub_6b08(v46 + 0x404) + 1);
        v3 = sub_6b08(v46 + 0x404);
        v5 = &v4;
        v4 = &v5;
        sub_15cac(v16, &v2);
        v18 += 1;
        v2 = &v5;
        v5 = &v2;
        sub_f2b8(v13, &v7 | 4);
        v15 += 1;
    }
    if (sub_b2b0(v46 + 0x404) & 1)
    {
        v2 = &v4;
        v4 = &v2;
        v50 = sub_a0c8(v46 + 0x404);
        v5 = sub_201a0(a0, v50, sub_6b08(v46 + 0x404) + 1);
        v6 = sub_6b08(v46 + 0x404);
        sub_f8d0(a0);
        v2 = &v4;
        v4 = &v2;
        sub_15cac(v19, &v5);
        v21 += 1;
        if ((*(unsigned int *)&v7 & 0xfffffffe) != 268)
        {
            v51 = 8;
            if ((unsigned int)(*(int *)v47 - 267) < 2)
                v51 = 0x100;
            v52 = 296;
            if (*(int *)v47 == 286)
                v51 = v52;
            goto *((void *)(*(long long *)((char *)&g_e62fb0 + v51)));
        }
        else
        {
            goto *((void *)(g_e63020));
        }
    }
    else
    {
        sub_f8d0(a0);
        v2 = (long long)a0[132];
        v3 = *(unsigned long long *)((void*)&v9 + 8);
        v5 = 0;
        v6 = 0;
        sub_11094(a0, &v2, &v5, "Interpolated string literal contains malformed escape sequence");
        goto *((void *)(g_e62fd8));
    }
}
