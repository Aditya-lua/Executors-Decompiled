/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ccd0..0x1d4a8 (2008 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ccd0_4 {
    unsigned long long field_0;
    long long field_8;
} st_1ccd0_4;

typedef struct st_1ccd0_3 {
    unsigned long long field_0;
    uint128_t field_8;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
} st_1ccd0_3;

typedef struct st_1ccd0_8 {
    char padding_0[56];
    unsigned long long field_38;
} st_1ccd0_8;

typedef struct st_1ccd0_10 {
    struct st_1ccd0_8 *field_0;
} st_1ccd0_10;

typedef struct st_1ccd0_11 {
    char field_0[20];
    char field_4[28];
    char field_c;
    char padding_d[3];
    unsigned long long field_10[2];
    char field_18;
    char padding_19[63];
    unsigned long long field_58;
    char padding_60[52];
    unsigned int field_94;
    char padding_98[16];
    unsigned long long field_a8;
    char padding_b0[24];
    unsigned long long field_c8;
    unsigned int *field_d0;
    char padding_d8[144];
    struct st_1ccd0_1 *field_168;
    char padding_170[424];
    unsigned long long field_318;
    unsigned long long field_320;
} st_1ccd0_11;

typedef struct st_1ccd0_9 {
    char padding_0[88];
    struct st_1ccd0_10 *field_58;
} st_1ccd0_9;

typedef struct st_1ccd0_2 {
    char padding_0[128];
    uint128_t field_80;
    char field_84[28];
    char field_8c;
    char padding_8d[3];
    unsigned long long field_90[2];
    char field_98;
    char padding_99[63];
    long long field_d8;
    char padding_e0[52];
    unsigned int field_114;
    char padding_118[16];
    unsigned long long field_128;
    char padding_130[24];
    unsigned long long field_148;
    unsigned int *field_150;
    char padding_158[80];
    char field_1a8;
    char padding_1a9[63];
    struct st_1ccd0_1 *field_1e8;
    char padding_1f0[424];
    unsigned long long field_398;
    long long field_3a0;
} st_1ccd0_2;

typedef struct st_1ccd0_0 {
    char field_0;
} st_1ccd0_0;

typedef struct st_1ccd0_1 {
    char padding_0[1184];
    unsigned int field_4a0;
} st_1ccd0_1;

typedef struct st_1ccd0_7 {
    unsigned long long field_0;
} st_1ccd0_7;

typedef struct st_1ccd0_6 {
    struct st_1ccd0_7 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_1ccd0_6;

extern st_1ccd0_6 g_e61f80;
extern long long g_f0d608;
extern long long g_f0d630;
extern char g_10002b0;

long long sub_1ccd0(st_1ccd0_2 *a0, unsigned long long *a1, unsigned int a2)
{
    unsigned long long v35;  // x22
    unsigned int *v36;  // x21
    long long v46;  // x0
    unsigned long v47;  // x0
    unsigned long v48;  // x21
    st_1ccd0_3 *v37;  // x20
    unsigned long v38;  // x10
    st_1ccd0_11 *v39;  // x25
    char v40;  // w8
    char v41;  // x22
    char *v42;  // x8
    st_1ccd0_9 *v43;  // x22
    char *v0;  // [bp-0x1e0], Other Possible Types: unsigned long
    char v1;  // [bp-0x1d8]
    st_1ccd0_0 **v2;  // [bp-0x1c0], Other Possible Types: char
    st_1ccd0_0 *v3;  // [bp-0x1b8]
    uint128_t v4;  // [bp-0x1b0], Other Possible Types: uint128_t
    uint128_t v5;  // [bp-0x1a0], Other Possible Types: char
    uint128_t v6;  // [bp-0x18c]
    char v7;  // [bp-0x17c]
    st_1ccd0_4 *v8;  // [bp-0x178]
    unsigned long long v9;  // [bp-0x170]
    char iter;  // [bp-0x168]
    unsigned long v11;  // [bp-0x160]
    uint128_t v12;  // [bp-0x158]
    char v13;  // [bp-0x148]
    st_1ccd0_0 **v14;  // [bp-0x140], Other Possible Types: char
    st_1ccd0_0 *v15;  // [bp-0x138], Other Possible Types: st_1ccd0_0 **, char
    char *v16;  // [bp-0x130], Other Possible Types: char, uint128_t
    uint128_t v17;  // [bp-0x128], Other Possible Types: uint128_t
    uint192_t v18;  // [bp-0x120]
    char v19;  // [bp-0x118]
    char *ptr;  // [bp-0x100], Other Possible Types: st_1ccd0_0 *, unsigned long
    uint128_t v21;  // [bp-0xf8]
    char v22;  // [bp-0xe8], Other Possible Types: unsigned long
    uint128_t v23;  // [bp-0xe0], Other Possible Types: char, unsigned long, uint128_t
    char *v24;  // [bp-0xd0], Other Possible Types: uint128_t
    uint128_t v25;  // [bp-0xc8]
    unsigned long v26;  // [bp-0xc0]
    char *v27;  // [bp-0xb8], Other Possible Types: uint128_t
    uint128_t v28;  // [bp-0xb0]
    char v29;  // [bp-0xa8]
    st_1ccd0_9 *v30;  // [bp-0xa0], Other Possible Types: unsigned long long
    char v31;  // [bp-0x98]
    unsigned long v32;  // [bp-0x70]
    char *v33;  // [bp-0x10]
    char v34;  // [bp+0x0]

    v33 = &v34;
    v32 = *(long long *)&g_10002b0;
    v3 = &v2;
    v2 = &v3;
    sub_107a4();
    if (!(v13 & 1))
    {
        v22 = *(long long *)&a0->padding_e0[32];
        v23 = *(int128_t *)((char *)&a0->field_80 + 4);
        sub_19994(&v11, &v22);
    }
    v35 = *(long long *)&a0->padding_118[8];
    v36 = a0->field_128;
    v37 = sub_404c(*(long long *)&a0->padding_99[23], 64);
    v38 = *(int *)(a0->field_128 - 4);
    v37->field_0 = v11;
    *(uint128_t *)&(&v37->field_0)[1] = v12;
    *(unsigned long long *)((char *)&v37->field_8 + 8) = 0;
    *(unsigned long *)v37->padding_18 = ((char *)v36 - v35 >> 3) - 1;
    v37->field_20 = v38;
    *(unsigned short *)&v37->field_28 = 1;
    v37[1].field_0 = 0;
    v39 = &a0->field_80;
    if ((int)a0->field_80 == 281 && !(v22 = *(long long *)&a0->field_84[8], !sub_1935c(&v22, "extends")))
    {
        sub_f8d0(a0);
        v1 = sub_190d4(a0);
    }
    else
    {
        v1 = 0;
    }
    v8 = &a0->padding_1f0[384];
    v9 = 14757395258967641293 * (*(long long *)&a0->padding_1f0[392] - *(long long *)&a0->padding_1f0[384] >> 4);
    iter = 0;
    v22 = 0;
    sub_f6e8(&v31, &v22, 0);
    while (1)
    {
LABEL_1ce6c:
        v40 = *(int *)&v39->field_0[0];
        switch (v40)
        {
        case 0: case 296:
            sub_1f3d4(a0, 296, "class");
            v22 = *a1;
            v23 = *(long long *)((char *)&a0->field_80 + 12);
            if ((unsigned int)*(int *)&a0->padding_e0[12] >= 2)
            {
                v0 = v37->field_0;
                sub_1db64(a0, &(&v37->field_0)[1], "Cannot declare class '%s' inside another statement or expression");
                goto LABEL_1d2c4;
            }
            goto LABEL_1d2c4;
        case 281:
            *(char *)&v6 = 0;
            v7 = 0;
            v22 = *(long long *)&a0->field_84[8];
            if (sub_1935c(&v22, "public"))
            {
                sub_1f158(&v6, (char *)&a0->field_80 + 4);
                sub_f8d0(a0);
            }
            break;
        default:
            *(char *)&v6 = 0;
            v7 = 0;
            break;
        }
        if (v7 == 1)
            break;
        if (*(int *)&v39->field_0[0] == 299)
        {
LABEL_1cf40:
            v4 = *(int128_t *)&v39->field_0[0];
            v5 = *(int128_t *)&v39->field_0[16];
            sub_f8d0(a0);
            sub_1f174(a0, "method name");
            *(int *)(*(long long *)&a0->padding_1a9[23] + 1184) = *(int *)(*(long long *)&a0->padding_1a9[23] + 1184) + 1;
            v22 = 0;
            v23 = 0;
            v43 = sub_e5f4(a0, 0, &v4, &ptr, 0, &v22, 0, 0);
            *(int *)(*(long long *)&a0->padding_1a9[23] + 1184) = *(int *)(*(long long *)&a0->padding_1a9[23] + 1184) - 1;
            if (*(long long *)&v43[1].padding_0[0] && sub_1935c(*(long long *)v43->field_58, "self") && *(long long *)(*(long long *)v43->field_58 + 56))
                sub_1db64(a0, *(long long *)(*(long long *)v43->field_58 + 56) + 12, "The 'self' parameter cannot have a type annotation");
            if (*ptr == 95 && ptr[1] == 95)
            {
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v22, ptr, _strlen(ptr));
                if (!sub_13a08(&g_f0d630, &v22))
                {
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v22, ptr, _strlen(ptr));
                    if (sub_13a08(&g_f0d608, &v22))
                        goto LABEL_1d1b4;
                }
                v0 = ptr;
                sub_1db64(a0, &v21);
                goto LABEL_1d1b4;
            }
            else
            {
LABEL_1d1b4:
                if (!sub_19204(&v31, &ptr))
                {
                    sub_1dcc4(&v31, &ptr);
                    sub_1ac2c(&v31, &ptr);
                    v18 = _INSERT(CONCAT(v17, 0), 0, v7);
                    v16 = v6;
                    *(int128_t *)((char *)&v18 + 4) = *(int128_t *)(&v4 | 4);
                    v28 = v21;
                    v22 = 1;
                    v23 = v16;
                    v24 = *(uint128_t *)&v18;
                    v26 = *(unsigned long long *)((void*)&v18 + 16);
                    v27 = ptr;
                    v30 = v43;
                    v15 = &v14;
                    v14 = &v15;
                    sub_1c4a0(v8, &v22);
                    iter += 1;
                    (&g_e61f80.field_0)[v22]();
                }
                v0 = ptr;
                sub_1db64(a0, &v21, "Duplicate class member '%s'");
            }
        }
        else
        {
            sub_1db64(a0, (char *)&a0->field_80 + 4, "Only class properties and functions can be declared within a class");
            sub_f8d0(a0);
        }
    }
    if (*(int *)&v39->field_0[0] == 299)
        goto LABEL_1cf40;
    sub_107a4(a0, "class property name");
    if (!(v19 & 1))
        continue;
    *(char *)&v4 = 0;
    v5 = 0;
    if (*(int *)&v39->field_0[0] == 58)
    {
        sub_1f158(&v4, (char *)&a0->field_80 + 4);
        sub_f8d0(a0);
        v41 = sub_12740(a0, 0);
        v42 = v16;
        if (*v42 == 95)
            goto LABEL_1d098;
    }
    else
    {
        v41 = 0;
        v42 = v16;
        if (*v42 == 95)
        {
LABEL_1d098:
            if (v42[1] == 95)
                sub_1db64(a0, &v17, "Class properties cannot start with '__'");
        }
    }
    if (!sub_19204(&v31, &v16))
    {
        sub_1dcc4(&v31, &v16);
        sub_1ac2c(&v31, &v16);
        v23 = v6;
        v25 = v17;
        v27 = v4;
        v29 = v5;
        v22 = 0;
        v24 = v16;
        v30 = v41;
        ptr = &v15;
        v15 = &ptr;
        sub_1c4a0(v8, &v22);
        iter += 1;
        (&g_e61f80.field_0)[v22]();
    }
    v0 = v16;
    sub_1db64(a0, &v17, "Duplicate class member '%s'");
    goto LABEL_1ce6c;
LABEL_1d2c4:
    v46 = sub_1c710(a0, &v8);
    v47 = sub_404c(*(long long *)&a0->padding_99[23], 72);
    v48 = v47;
    sub_6508(v47, &v22, v37, v1, v46, &v8, a2);
    if (sub_10160(&a0->padding_158[40], v37))
    {
        v16 = 0;
        *(unsigned long long *)&v17 = 0;
        ptr = v48;
        v4 = CONCAT(&ptr, sub_19088(a0, &ptr, 1));
        v0 = v37->field_0;
        v48 = sub_ebbc(a0, &(&v37->field_0)[1], &v16, &v4, "A class named '%s' has already been declared in this module");
    }
    else
    {
        sub_13d5c(&a0->padding_158[40], v37);
        *(unsigned long *)(sub_fb84(&a0->padding_158[40], v37) + 8) = v48;
    }
    sub_a070(&v31);
    sub_10820(v8, v8->field_0 + 80 * v9, v8->field_8);
    if (*(long long *)&g_10002b0 != v32)
    {
        ___stack_chk_fail();
        return sub_1d490();
    }
    return v48;
}
