/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ab880..0x2abdbc (1340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ab880_1 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_2ab880_1;

typedef struct st_2ab880_0 {
    char field_0;
} st_2ab880_0;

extern unsigned long long g_e7b9a0;
extern unsigned long long g_e7ba90;
extern unsigned long long g_e7bb30;
extern char g_10002b0;

void sub_2ab880(void* a0, unsigned int a1, st_2ab880_1 *a2)
{
    unsigned long long v39;  // x28
    unsigned long long v40;  // x27
    void* v49;  // x22
    void* v50;  // x22
    char v51;  // x1
    unsigned long v52;  // x8
    unsigned long long *v53;  // x19
    char v54;  // x1
    unsigned long v55;  // x8
    unsigned int v56;  // w0
    void* v57;  // x24
    void* v58;  // x24
    unsigned long long v41;  // x24
    char v59;  // x1
    unsigned long v60;  // x8
    unsigned long long *v61;  // x19
    unsigned long long v42;  // x23
    unsigned long long v43;  // x22
    unsigned long long v44;  // x21
    unsigned long long v45;  // x20
    unsigned long long v46;  // x19
    unsigned long long v47;  // x30
    unsigned int v48;  // w0
    st_2ab880_0 **v0;  // [bp-0x1e0], Other Possible Types: char
    st_2ab880_0 *v1;  // [bp-0x1d8]
    char v2;  // [bp-0x1d0]
    unsigned long v3;  // [bp-0x1c8]
    char v4;  // [bp-0x1c0]
    unsigned long v5;  // [bp-0x1b8]
    char v6;  // [bp-0x1b0]
    unsigned long v7;  // [bp-0x1a8]
    char v8;  // [bp-0x1a0]
    char v9;  // [bp-0x188]
    uint128_t v10;  // [bp-0x170]
    unsigned long v11;  // [bp-0x160]
    char *v12;  // [bp-0x158], Other Possible Types: char, unsigned long long
    char v13;  // [bp-0x130]
    char v14;  // [bp-0x118]
    st_2ab880_1 *v15;  // [bp-0xf8], Other Possible Types: char
    uint128_t v16;  // [bp-0xf0], Other Possible Types: char
    uint128_t v17;  // [bp-0xe0]
    char v18;  // [bp-0xd8]
    char v19;  // [bp-0xd0]
    char v20;  // [bp-0xcf]
    void* v21;  // [bp-0xc8]
    char v22;  // [bp-0xc0]
    char v23;  // [bp-0xa0]
    char v24;  // [bp-0x98]
    char v25;  // [bp-0x70]
    char v26;  // [bp-0x68]
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
    v1 = &v0;
    v0 = &v1;
    if ((long long)a0[24])
    {
        sub_1e524(&v14, a0);
        sub_2adaa8(&v15, a2, &v14, (char)a0[192], a0 + 40);
        sub_181a8(&v14);
        sub_2aee88(a0, &v15);
        if (a1)
        {
            v48 = sub_2b0244(a0 + 40);
            *(unsigned int *)&a0[32] = v48;
            if (v48 != 15)
            {
                v49 = a0;
                v50 = v49 + 72;
                sub_2ad000(a0 + 40);
                v10 = *(int128_t *)v50;
                v11 = (long long)v50[16];
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v8, "value", 5);
                sub_2ad2d8(a0, 15, &v8);
                sub_2a9c90(101, &v10, &v9, 0);
                sub_2ad268(&v15, (long long)v49[72], &v13, &v12);
                v12 = &g_e7b9a0;
            }
        }
        if (v23 == 1)
        {
            v6 = 9;
            sub_2ae53c(&v7, 9);
            v51 = a2->field_0;
            a2->field_0 = v6;
            v6 = v51;
            v52 = a2->field_8;
            a2->field_8 = v7;
            v7 = v52;
            sub_2a6e94(&v7, v6);
            v53 = &g_e7bb30;
        }
        else
        {
            if (a2->field_0 == 9)
            {
                v4 = 0;
                sub_2ae53c(&v5, 0);
                v54 = a2->field_0;
                a2->field_0 = v4;
                v4 = v54;
                v55 = a2->field_8;
                a2->field_8 = v5;
                v5 = v55;
                sub_2a6e94(&v5, v4);
            }
            v53 = &g_e7ba90;
        }
        sub_2a6e94(&v26, v25);
        sub_181a8(&v24);
        v12 = &v22;
        sub_2ab41c(&v12);
        v12 = &v18;
        sub_2ab41c(&v12);
        v12 = &v16;
        sub_10344(&v12);
        goto *((void *)(*v53));
    }
    else
    {
        v15 = a2;
        v16 = 0;
        v17 = 0;
        v19 = 0;
        v20 = (char)a0[192];
        v21 = a0 + 40;
        sub_2a5e1c(a0, &v15);
        if (a1)
        {
            v56 = sub_2b0244(v21);
            *(unsigned int *)&a0[32] = v56;
            if (v56 != 15)
            {
                v57 = a0;
                v58 = v57 + 72;
                sub_2ad000(v21);
                v10 = *(int128_t *)v58;
                v11 = (long long)v58[16];
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v8, "value", 5);
                sub_2ad2d8(a0, 15, &v8);
                sub_2a9c90(101, &v10, &v9, 0);
                sub_2aee18(&v15, (long long)v57[72], &v13, &v12);
                v12 = &g_e7b9a0;
            }
        }
        if (v19 == 1)
        {
            v2 = 9;
            sub_2ae53c(&v3, 9);
            v59 = a2->field_0;
            a2->field_0 = v2;
            v2 = v59;
            v60 = a2->field_8;
            a2->field_8 = v3;
            v3 = v60;
            sub_2a6e94(&v3, v2);
            v61 = &g_e7bb30;
        }
        else
        {
            v61 = &g_e7ba90;
        }
        v12 = &v16;
        sub_10344(&v12);
        goto *((void *)(*v61));
    }
}
