/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b6b74..0x1b7334 (1984 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b6b74_5 {
    char padding_0[8];
    unsigned long long field_8;
    char field_10;
    char padding_11[7];
    struct st_1b6b74_6 *field_18;
    struct st_1b6b74_6 *field_20;
    struct st_1b6b74_1 *field_28;
    struct st_1b6b74_1 *field_30;
    char padding_38[8];
    char field_40[169];
    char field_48[169];
    char padding_50[8];
    unsigned long long field_58;
    unsigned long long field_60;
    char padding_68[8];
    unsigned long long field_70;
    unsigned long long field_78;
    char padding_80[8];
    unsigned long long field_88;
    unsigned long long field_90;
    char padding_98[8];
    unsigned int field_a0;
} st_1b6b74_5;

typedef struct st_1b6b74_2 {
    char padding_0[40];
    struct st_1b6b74_3 *field_28;
} st_1b6b74_2;

typedef struct st_1b6b74_3 {
    unsigned long long field_0;
} st_1b6b74_3;

typedef struct st_1b6b74_6 {
    struct st_1b6b74_2 *field_0;
} st_1b6b74_6;

typedef struct st_1b6b74_0 {
    unsigned int field_0;
    char padding_4[12];
    char *field_10;
    char *field_18;
    char padding_20[48];
    unsigned long long field_50;
} st_1b6b74_0;

typedef struct st_1b6b74_1 {
    char field_0;
} st_1b6b74_1;

extern unsigned long long g_e71398;
extern unsigned long long g_e71548;

char * sub_1b6b74(st_1b6b74_5 *a0, st_1b6b74_0 *a1)
{
    st_1b6b74_0 *v12;  // x19
    char *v13;  // x8
    long long v22;  // x0
    long long v23;  // x24
    unsigned long v24;  // x0
    unsigned long long v25;  // x0
    long long v26;  // x0
    unsigned long v27;  // x8
    unsigned long long v28;  // x21
    unsigned long long v29;  // x22
    unsigned long long v30;  // w24
    unsigned long long v31;  // w25
    unsigned long v14;  // x8
    char *v32;  // x8
    unsigned long long v33;  // x9
    unsigned long long v34;  // x9
    char *v36;  // x0
    unsigned long long v37;  // w0
    unsigned long v38;  // x22
    unsigned long long v39;  // x26
    unsigned long long v40;  // x27
    unsigned long long v41;  // x0
    unsigned long long v15;  // x21
    unsigned long long v42;  // x0
    long long v43;  // x0
    long long v44;  // x19
    unsigned long long v45;  // x0
    unsigned long long v46;  // x0
    long long v47;  // x0
    char *v48;  // x0
    unsigned long v49;  // x8
    unsigned long long v50;  // x21
    unsigned long long v51;  // x22
    unsigned long long v16;  // x22
    unsigned long long v52;  // x8
    unsigned long v17;  // x22
    unsigned long long v18;  // x25
    unsigned long long v19;  // x26
    unsigned long v20;  // x0
    unsigned long long v21;  // x0
    st_1b6b74_1 **v0;  // [bp-0xb8], Other Possible Types: char
    st_1b6b74_1 *v1;  // [bp-0xb0]
    st_1b6b74_1 *v2;  // [bp-0xa8], Other Possible Types: unsigned long
    unsigned long long v3;  // [bp-0xa0]
    char v4;  // [bp-0x8a]
    char v5;  // [bp-0x89]
    char v6[169];  // [bp-0x88]
    unsigned long long v7;  // [bp-0x80]
    st_1b6b74_6 **v8;  // [bp-0x70]
    st_1b6b74_1 **v9;  // [bp-0x68], Other Possible Types: st_1b6b74_6 **, char
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a1;
    v1 = &v0;
    v0 = &v1;
    v13 = a1->field_10;
    if (v13 != a1->field_18)
    {
        if (a0[1].padding_0[7] == 1)
        {
            if (v13 + 1 != a1->field_18)
            {
                v4 = *v13;
                v5 = v13[1];
                if (a0[1].padding_0[5] == 1)
                    (*(long long *)(*(long long *)a0->field_18 + 40))();
                sub_1a9004(&a0->field_10, &v4, v6, 0);
                v2 = &v9;
                v9 = &v2;
                if (sub_6b08(v6))
                {
                    v14 = a0->field_70;
                    if (a0->field_78 != a0->field_70)
                    {
                        v15 = 0;
                        v16 = 0;
                        do
                        {
                            if (sub_1c65ac(&v4, v14 + v15) & 1)
                                goto *((void *)(g_e71398));
                        } while ((v16 += 1, v14 = a0->field_70, v15 += 2, v16 < (long long)(a0->field_78 - a0->field_70) >> 1));
                    }
                    if (a0[1].padding_0[6] == 1 && a0->field_58 != a0->field_60)
                    {
                        sub_1adcf4(&a0->field_10, &v4, v6);
                        v17 = a0->field_58;
                        if (a0->field_60 != a0->field_58)
                        {
                            v18 = 0;
                            v19 = 0;
                            do
                            {
                                v20 = sub_a0c8(v17 + v18);
                                v21 = sub_6b08(v17 + v18);
                                v22 = sub_a0c8(v6);
                                v9 = &v8;
                                v8 = &v9;
                                v2 = v20;
                                v3 = v21;
                                if (0 >= (int)sub_2a304(&v2, v22, sub_6b08(v6)))
                                {
                                    v23 = a0->field_58 + v18;
                                    v24 = sub_a0c8(v6);
                                    v25 = sub_6b08(v6);
                                    v26 = sub_a0c8(v23 + 24);
                                    v9 = &v8;
                                    v8 = &v9;
                                    v2 = v24;
                                    v3 = v25;
                                    if (0 >= (int)sub_2a304(&v2, v26, sub_6b08(v23 + 24)))
                                        goto *((void *)(g_e71398));
                                }
                            } while ((v19 += 1, v17 = a0->field_58, v18 += 48, ((long long)(a0->field_60 - a0->field_58) >> 4) * 12297829382473034411 > v19));
                        }
                    }
                    if (a0->field_88 != a0->field_90)
                    {
                        sub_1a2e28(&a0->field_10, &v4, v6, 0);
                        v27 = a0->field_88;
                        if (a0->field_90 != a0->field_88)
                        {
                            v28 = 0;
                            v29 = 0;
                            do
                            {
                                if (sub_20b98(v6, v27 + v28))
                                    goto *((void *)(g_e71398));
                            } while ((v29 += 1, v27 = a0->field_88, v28 += 24, v29 < ((long long)(a0->field_90 - a0->field_88) >> 3) * 12297829382473034411));
                        }
                    }
                    if (sub_1c672c(&a0->field_10, v4, a0->field_a0) && sub_1c672c(&a0->field_10, v5, a0->field_a0) & 1)
                        goto *((void *)(g_e71398));
                    if (!(sub_1c672c(&a0->field_10, v4, *(int *)&a0[1].padding_0[0]) & 1) && !sub_1c672c(&a0->field_10, v5, *(int *)&a0[1].padding_0[0]))
                        goto *((void *)(g_e71398));
                    goto *((void *)(g_e71398));
                }
            }
            goto *((void *)(g_e71548));
        }
        v30 = 0;
        v31 = 1;
        v4 = *v12->field_10;
        if (a0[1].padding_0[5] == 1)
            (*(long long *)(*(long long *)a0->field_18 + 40))();
        v32 = a0->field_28;
        v33 = a0->field_30 - v32;
        if (a0->field_30 != v32)
        {
            if (1 >= v33)
                v33 = 1;
            do
            {
                v34 = v33;
                v36 = &a0->padding_0[0];
                if (*v32 == *v12->field_10)
                    goto LABEL_1b6f34;
            } while ((v33 = v34 - 1, v32 += 1, v34 != 1));
        }
        if (*(int *)&a0[1].padding_0[0] || a0->field_40 != a0->field_48)
        {
            v37 = (unsigned int)sub_1c672c(&a0->field_10);
            v36 = sub_18494(a0->field_40, a0->field_48, &v4, v6);
            if (v36 != a0->field_48)
                v37 = 1;
            if (v37 == 1)
                goto LABEL_1b6ea4;
LABEL_1b6f34:
            v48 = v36;
            if (a0[1].padding_0[4] != 1)
            {
                v12->field_10 = v12->field_10 + 1;
                v52 = a0->field_8;
                v12->field_0 = 0xfffffc1d;
                v12->field_50 = v52;
                return v48;
            }
        }
        else
        {
LABEL_1b6ea4:
            if (a0->field_58 != a0->field_60)
            {
                v30 = 0;
                v31 = 1;
                if (a0[1].padding_0[6] == 1)
                {
                    sub_181f0(v6, &v4, &v5, 1);
                    sub_a0c8(v6);
                    sub_a0c8(v6);
                    sub_6b08(v6);
                    (*(long long *)(*(long long *)a0->field_20 + 32))();
                }
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, 1, v4);
                v38 = a0->field_58;
                if (a0->field_60 != a0->field_58)
                {
                    v39 = 0;
                    v40 = 0;
                    do
                    {
                        v41 = sub_a0c8(v38 + v39);
                        v42 = sub_6b08(v38 + v39);
                        v43 = sub_a0c8(&v2);
                        v9 = &v8;
                        v8 = &v9;
                        v6 = (char[169])v41;
                        v7 = v42;
                        if (0 >= (int)sub_2a304(v6, v43, sub_6b08(&v2)))
                        {
                            v44 = a0->field_58 + v39;
                            v45 = sub_a0c8(&v2);
                            v46 = sub_6b08(&v2);
                            v47 = sub_a0c8(v44 + 24);
                            v9 = &v8;
                            v8 = &v9;
                            v6 = (char[169])v45;
                            v7 = v46;
                            if (0 >= (int)sub_2a304(v6, v47, sub_6b08(v44 + 24)))
                            {
                                v48 = &v2;
                                if (a0[1].padding_0[4] != 1)
                                {
                                    v12->field_10 = &v12->field_10[v31];
                                    v52 = a0->field_8;
                                    v12->field_0 = 0xfffffc1d;
                                    v12->field_50 = v52;
                                    return v48;
                                }
                                v12->field_0 = 0xfffffc1f;
                                v12->field_50 = 0;
                                return &v2;
                            }
                        }
                    } while ((v40 += 1, v38 = a0->field_58, v39 += 48, ((long long)(a0->field_60 - a0->field_58) >> 4) * 12297829382473034411 > v40));
                }
            }
            if (a0->field_88 != a0->field_90)
            {
                sub_1a2e28(&a0->field_10, &v4, &v5, 0);
                v49 = a0->field_88;
                if (a0->field_90 != a0->field_88)
                {
                    v50 = 0;
                    v51 = 0;
                    do
                    {
                        if (sub_20b98(v6, v49 + v50))
                        {
                            v48 = &v6[0];
                            if (a0[1].padding_0[4] != 1)
                            {
                                v12->field_10 = &v12->field_10[v31];
                                v52 = a0->field_8;
                                v12->field_0 = 0xfffffc1d;
                                v12->field_50 = v52;
                                return v48;
                            }
                            v12->field_0 = 0xfffffc1f;
                            v12->field_50 = 0;
                            return v6;
                        }
                    } while ((v51 += 1, v49 = a0->field_88, v50 += 24, v51 < ((long long)(a0->field_90 - a0->field_88) >> 3) * 12297829382473034411));
                }
            }
            v36 = sub_1c672c(&a0->field_10, v4, a0->field_a0);
            v48 = v36;
            if (a0[1].padding_0[4] != ((v30 | (unsigned int)v48) & 1))
            {
                v12->field_10 = &v12->field_10[v31];
                v52 = a0->field_8;
                v12->field_0 = 0xfffffc1d;
                v12->field_50 = v52;
                return v48;
            }
        }
    }
    else
    {
        v36 = &a0->padding_0[0];
        v48 = &a0->padding_0[0];
        if (v36[168] != (v36[168] & 1))
        {
            v12->field_10 = v12->field_10;
            v52 = a0->field_8;
            v12->field_0 = 0xfffffc1d;
            v12->field_50 = v52;
            return v48;
        }
    }
    v12->field_0 = 0xfffffc1f;
    v12->field_50 = 0;
    return v36;
}
