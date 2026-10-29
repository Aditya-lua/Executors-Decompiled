/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f488..0x2013c (3252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f488_2 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[32];
    unsigned long long field_30;
    long long field_38;
    char padding_40[80];
    unsigned long long field_90;
    long long field_98;
} st_1f488_2;

typedef struct st_1f488_3 {
    unsigned long long field_0;
    long long field_8;
} st_1f488_3;

typedef struct st_1f488_1 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[80];
    unsigned long long field_60;
    long long field_68;
    char padding_70[32];
    unsigned long long field_90;
    long long field_98;
    char padding_a0[80];
    unsigned long long field_f0;
    long long field_f8;
} st_1f488_1;

typedef struct st_1f488_7 {
    char padding_0[20];
    unsigned long long field_14;
} st_1f488_7;

typedef struct st_1f488_6 {
    unsigned long long field_0;
    uint128_t field_8;
} st_1f488_6;

typedef struct st_1f488_5 {
    struct st_1f488_0 *field_0;
} st_1f488_5;

typedef struct st_1f488_8 {
    unsigned long long field_0;
    char field_8[20];
    unsigned long long field_c[2];
    char field_14;
    char padding_15[15];
    unsigned long long field_24;
    char padding_2c[40];
    unsigned long long field_54;
    char padding_5c[528];
    unsigned long long field_26c;
    unsigned long long field_274;
    char padding_27c[80];
    unsigned long long field_2cc;
    unsigned long long field_2d4;
    char padding_2dc[32];
    unsigned long long field_2fc;
    unsigned long long field_304;
    char padding_30c[80];
    unsigned long long field_35c;
    unsigned long long field_364;
} st_1f488_8;

typedef struct st_1f488_4 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[80];
    unsigned long long field_60;
    long long field_68;
} st_1f488_4;

typedef struct st_1f488_0 {
    char field_0;
} st_1f488_0;

extern unsigned long long g_e62278;
extern unsigned long long g_e62328;
extern unsigned long long g_e62348;
extern char g_f0ca70;
extern char g_f0ca90;

long long sub_1f488(void* a0, unsigned long long *a1, unsigned long a2)
{
    void* v43;  // x0
    void* v44;  // x20
    st_1f488_6 *v53;  // x8
    long long v54;  // x0
    void* v55;  // x25
    st_1f488_7 *v56;  // x20
    long long v57;  // x0
    unsigned long long v58;  // w21
    void* v59;  // x23
    st_1f488_8 *v60;  // x23
    unsigned int v61;  // w8
    unsigned int v62;  // w26
    void* v45;  // x20
    unsigned long long v63;  // x0
    long long v64;  // x0
    void* v46;  // x23
    unsigned long long v47;  // w20
    unsigned long long v48;  // x21
    unsigned long long v49;  // x0
    unsigned long v50;  // x24
    unsigned long long i;  // x25
    unsigned long long v52;  // x27
    unsigned long long v0;  // [bp-0x1d0], Other Possible Types: unsigned long
    long long v1;  // [bp-0x1c8]
    unsigned long long v2;  // [bp-0x1b0]
    unsigned long v3;  // [bp-0x1a0], Other Possible Types: unsigned long long
    unsigned long v4;  // [bp-0x198], Other Possible Types: unsigned long long
    st_1f488_0 **v5;  // [bp-0x190], Other Possible Types: char
    st_1f488_0 *v6;  // [bp-0x188]
    st_1f488_0 *v7;  // [bp-0x180], Other Possible Types: st_1f488_0 **, uint128_t, unsigned long, unsigned long long
    unsigned long long v8;  // [bp-0x178]
    uint128_t v9;  // [bp-0x170], Other Possible Types: unsigned int
    char v10;  // [bp-0x158], Other Possible Types: unsigned int, unsigned long long, unsigned long
    unsigned long v11;  // [bp-0x154]
    uint128_t v12;  // [bp-0x150], Other Possible Types: char, unsigned long long, unsigned long
    char v13;  // [bp-0x148], Other Possible Types: unsigned long
    unsigned int v14;  // [bp-0x140], Other Possible Types: unsigned long long
    unsigned long long v15;  // [bp-0x138]
    unsigned long v16;  // [bp-0x134]
    unsigned long v17;  // [bp-0x12c]
    unsigned int v18;  // [bp-0x124]
    st_1f488_0 *v19;  // [bp-0x120], Other Possible Types: st_1f488_0 **, st_1f488_5 **, unsigned long long, unsigned long
    st_1f488_2 **v20;  // [bp-0x118], Other Possible Types: uint128_t, unsigned long
    unsigned long long v21;  // [bp-0x110]
    st_1f488_0 *v22;  // [bp-0x108], Other Possible Types: st_1f488_0 **, unsigned long, unsigned long long
    st_1f488_3 **v23;  // [bp-0x100], Other Possible Types: unsigned long long
    st_1f488_0 **v24;  // [bp-0xf8], Other Possible Types: st_1f488_5 **, unsigned long, unsigned long long
    unsigned long v25;  // [bp-0xf0], Other Possible Types: unsigned long long
    st_1f488_4 *v26;  // [bp-0xe8], Other Possible Types: unsigned long long *
    unsigned long long v27;  // [bp-0xe0]
    unsigned long long iter;  // [bp-0xd8]
    st_1f488_0 *v29;  // [bp-0xd0], Other Possible Types: st_1f488_2 *, uint128_t, uint192_t, unsigned long, unsigned long long
    st_1f488_4 **v30;  // [bp-0xc8], Other Possible Types: long long, unsigned long, unsigned long long
    uint128_t v31;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned long long v32;  // [bp-0xb8]
    unsigned long v33;  // [bp-0xb0], Other Possible Types: unsigned long long
    uint128_t v34;  // [bp-0xb0]
    long long v35;  // [bp-0xa8], Other Possible Types: unsigned long long
    st_1f488_1 *v36;  // [bp-0x98], Other Possible Types: unsigned long
    unsigned long long v37;  // [bp-0x90]
    unsigned long long v38;  // [bp-0x88]
    unsigned int v39;  // [bp-0x7c]
    unsigned long v40;  // [bp-0x78]
    char *v41;  // [bp-0x10]
    char v42;  // [bp+0x0]

    v41 = &v42;
    v6 = &v5;
    v5 = &v6;
    if (*(long long *)(a2 + 8))
    {
        v43 = a0;
        if ((int)v43[128] != 299)
        {
            v29 = 0;
            v30 = 0;
            v7 = 0;
            v8 = 0;
            sub_b814(v43 + 128);
            v0 = sub_a0c8(&v10);
            return sub_ebbc(a0, a0 + 132, &v29, &v7, "Expected a function type declaration after attribute, but got %s instead");
        }
    }
    else
    {
        v44 = a0;
        v45 = v44 + 128;
        if ((int)v44[128] != 299)
        {
            v55 = v45 - 32;
            if (g_f0ca90 == 1)
            {
                *(long long *)&v29 = (long long)a0[152];
                if (sub_1935c(&v29, "extern") & 1)
                    goto LABEL_1f9f8;
            }
            else
            {
                v7 = (long long)a0[152];
                if (sub_1935c(&v7, "class") && (g_f0ca70 != 1 || !(sub_b1a4(v55), v10 == 58)) || !(v36 = (long long)a0[152], !(sub_1935c(&v36, "extern") & 1)))
                {
LABEL_1f9f8:
                    v10 = (long long)a0[152];
                    if (sub_1935c(&v10, "extern"))
                    {
                        sub_f8d0(a0);
                        v10 = (long long)a0[152];
                        if (sub_21970(&v10, "type"))
                        {
                            v10 = 0;
                            v12 = 0;
                            v29 = 0;
                            v30 = 0;
                            v0 = (long long)a0[152];
                            return sub_ebbc(a0, a0 + 132, &v10, &v29, "Expected `type` keyword after `extern`, but got %s instead");
                        }
                        v58 = g_f0ca90 ^ 1;
                    }
                    else
                    {
                        v58 = 0;
                    }
                    sub_f8d0(a0);
                    v59 = a0;
                    v60 = v59 + 132;
                    v3 = (long long)v59[132];
                    sub_1f174(a0, "type name");
                    *(char *)&v33 = 0;
                    *(char *)&v35 = 0;
                    v10 = (long long)a0[152];
                    if (sub_1935c(&v10, "extends"))
                    {
                        sub_f8d0(a0);
                        sub_1f174(a0, "supertype name");
                        sub_1a62c(&v33, &v10);
                    }
                    if (v58 & 1 || g_f0ca90 & 1)
                    {
                        v10 = (long long)a0[152];
                        if (sub_21970(&v10, "with"))
                        {
                            v0 = (long long)a0[152];
                            sub_1db64(a0, v60, "Expected `with` keyword before listing properties of the external type, but got %s instead");
                        }
                        else
                        {
                            sub_f8d0(a0);
                        }
                    }
                    v4 = 0;
                    v26 = a0 + 896;
                    v27 = 7905747460161236407 * ((long long)a0[904] - (long long)a0[896] >> 3);
                    iter = 0;
                    if (*(int *)v45 == 296)
                    {
                        sub_f8d0(a0);
                        v10 = v3;
                        v12 = (long long)a0[140];
                        v29 = sub_1c5e4(a0, &v26);
                        v30 = &v26;
                        v64 = sub_404c((long long)a0[216], 80);
                        sub_7370(v64, &v10, &v36, v33, v35, &v29, v4);
                        sub_13918(v26, v26->field_0 + 56 * v27, v26->field_8);
                        return v64;
                    }
                    v24 = 0;
                    v25 = 0;
                    if ((*(int *)v45 & 0xfffffffe) == 284)
                    {
                        v24 = sub_237f0(a0, 0);
                        v25 = 0;
                        if (*(int *)v45 != 299)
                        {
                            v29 = 0;
                            v30 = 0;
                            v7 = 0;
                            v8 = 0;
                            sub_b814(v45);
                            v0 = sub_a0c8(&v10);
                            sub_ebbc(a0, v60, &v29, &v7, "Expected a method type declaration after attribute, but got %s instead");
                            goto *((void *)(g_e62278));
                        }
                        else
                        {
                            sub_24f18(a0, &v24);
                            v29 = &v7;
                            v7 = &v29;
                            sub_15fe8(v26, &v10);
                            iter += 1;
                            goto *((void *)(g_e62328));
                        }
                    }
                    else
                    {
                        switch (v61)
                        {
                        case 91:
                            v29 = *(int128_t *)v45;
                            v31 = (int128_t)v45[16];
                            sub_f8d0(a0);
                            if ((*(int *)v45 & 0xfffffffe) == 278)
                            {
                                sub_b1a4(v55);
                                if ((unsigned int)v10 == 93)
                                {
                                    sub_1ede0(a0, 0);
                                    v10 = *(unsigned int *)&v29;
                                    v11 = *(unsigned long long *)((void*)&v29 + 4);
                                    sub_1ef30(a0, 93, &v10, 0);
                                    sub_1f3d4(a0, 58, "property type annotation");
                                    v63 = sub_12740(a0, 0);
                                    if (v9 == 1 && !_memchr(v7, 0, v8))
                                    {
                                        v10 = v7;
                                        v12 = (long long)a0[132];
                                        v13 = (long long)a0[168];
                                        v14 = v63;
                                        v15 = 0;
                                        v16 = *(unsigned long long *)((void*)&v29 + 4);
                                        v17 = (long long)a0[168];
                                        v18 = 3;
                                        v19 = &v22;
                                        v22 = &v19;
                                        sub_15fe8(v26, &v10);
                                        iter += 1;
                                        goto *((void *)(g_e62328));
                                    }
                                    sub_1db64(a0, &v29 | 4, "String literal contains malformed escape sequence or \\0");
                                    goto *((void *)(g_e62328));
                                }
                            }
                            if (v4)
                            {
                                v19 = 0;
                                v21 = 0;
                                v7 = v29;
                                v9 = v31;
                                sub_19df4(a0, 3, &v19, &v7);
                                sub_1db64(a0, v10 + 16, "Cannot have more than one indexer on an extern type");
                                goto *((void *)(g_e62328));
                            }
                            else
                            {
                                v19 = 0;
                                v21 = 0;
                                v7 = v29;
                                v9 = v31;
                                sub_19df4(a0, 3, &v19, &v7);
                                v4 = v10;
                                goto *((void *)(g_e62328));
                            }
                        case 299:
                            sub_24f18(a0, &v24);
                            v29 = &v7;
                            v7 = &v29;
                            sub_15fe8(v26, &v10);
                            iter += 1;
                            goto *((void *)(g_e62328));
                        case 281:
                            sub_b1a4(v55);
                            v62 = 3;
                            if ((unsigned int)v10 != 58)
                            {
                                v10 = (long long)a0[152];
                                if (sub_1935c(&v10, "read"))
                                {
                                    v62 = 1;
                                    sub_c048(v55);
                                    break;
                                }
                                else
                                {
                                    v10 = (long long)a0[152];
                                    if (sub_1935c(&v10, "write"))
                                    {
                                        v62 = 2;
                                        sub_c048(v55);
                                        break;
                                    }
                                    else
                                    {
                                        v0 = (long long)a0[152];
                                        sub_1db64(a0, v60, "Expected blank or 'read' or 'write' attribute, got '%s'");
                                        sub_c048(v55);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            v62 = 3;
                            break;
                        }
                        sub_107a4(a0, "property name");
                        if ((char)v32 & 1)
                        {
                            sub_1f3d4(a0, 58, "property type annotation");
                            v12 = *(uint128_t *)((void*)&v29 + 8);
                            v10 = *(unsigned long long *)&v29;
                            v14 = sub_12740(a0, 0);
                            v15 = 0;
                            v16 = (long long)a0[132];
                            v17 = (long long)a0[168];
                            v18 = v62;
                            v7 = &v19;
                            v19 = &v7;
                            sub_15fe8(v26, &v10);
                            iter += 1;
                            goto *((void *)(g_e62328));
                        }
                        else
                        {
                            goto *((void *)(g_e62348));
                        }
                    }
                }
            }
            sub_107a4(a0, "global variable name");
            if (v14 == 1)
            {
                sub_1f3d4(a0, 58, "global variable declaration");
                v56 = sub_12740(a0, 1);
                v29 = *a1;
                v30 = *(long long *)&(v56->padding_0)[1];
                v57 = sub_404c((long long)a0[216], 64);
                sub_58c4(v57, &v29, &v10, &v12, v56);
            }
            else
            {
                v29 = 0;
                v30 = 0;
                v7 = 0;
                v8 = 0;
                v57 = sub_ebbc(a0, a1, &v29, &v7, "declare must be followed by an identifier, 'function', or 'extern type'");
            }
            return v57;
        }
    }
    sub_f8d0(a0);
    sub_1f174(a0, "global function name");
    sub_11190(a0, 0, 0, 0, 0);
    v39 = (int)a0[128];
    v46 = a0;
    v40 = (long long)v46[132];
    sub_1f3d4(a0, 40, "global function declaration");
    v36 = a0 + 752;
    v37 = 12297829382473034411 * ((long long)a0[760] - (long long)a0[752] >> 4);
    v38 = 0;
    v33 = 0;
    v35 = 0;
    if ((int)a0[128] == 41)
    {
        v47 = 0;
        v48 = 0;
    }
    else
    {
        sub_199b8(a0, &v36, 1, 0, 0, 0, 0);
        v34 = *(uint128_t *)((void*)&v29 + 4);
        v48 = v32;
        v47 = *(char *)&v29;
    }
    sub_1ef30(a0, 41, &v39, 0);
    v3 = v48;
    v4 = v47;
    v49 = sub_18b88(a0, 0);
    if (!v49)
    {
        v29 = sub_13094(a0, 0, 0);
        v30 = 0;
        v31 = 0;
        v49 = sub_62f0(sub_404c((long long)a0[216], 56), v46 + 132, &v29);
    }
    v2 = v49;
    v50 = (long long)a0[140];
    v29 = a0 + 848;
    v30 = (long long)a0[856] - (long long)a0[848] >> 3;
    v31 = 0;
    v26 = a0 + 992;
    v27 = 12297829382473034411 * ((long long)a0[1000] - (long long)a0[992] >> 3);
    iter = 0;
    if (v38)
    {
        i = 0;
        v52 = v37 * 48;
        do
        {
            if (!*(long long *)(v36->field_0 + v52 + 24))
            {
                v19 = *a1;
                v20 = v50;
                v24 = 0;
                v25 = 0;
                v22 = 0;
                v23 = 0;
                v54 = sub_ebbc(a0, &v19, &v24, &v22, "All declaration parameters must be annotated");
                goto LABEL_1f890;
            }
            v19 = &v24;
            v24 = &v19;
            sub_103a8(v29);
            v31 += 1;
            v53 = v36->field_0 + v52;
            v19 = v53->field_0;
            v20 = *(int128_t *)&(&v53->field_0)[1];
            v24 = &v22;
            v22 = &v24;
            sub_15798(v26, &v19);
            iter += 1;
            i += 1;
            v52 += 48;
        } while (i < v38);
    }
    if ((v4 & !v3) == 1)
    {
        v19 = *a1;
        v20 = v50;
        v24 = 0;
        v25 = 0;
        v22 = 0;
        v23 = 0;
        v54 = sub_ebbc(a0, &v19, &v24, &v22, "All declaration parameters must be annotated");
LABEL_1f890:
    }
    else
    {
        v24 = *a1;
        v25 = v50;
        v19 = sub_ef54(a0, &v29);
        v20 = &v29;
        v21 = v3;
        v22 = sub_ef88(a0, &v26);
        v23 = &v26;
        v54 = sub_404c((long long)a0[216], 176);
        *(char *)&v1 = (char)v4 & 1;
        sub_590c(v54, &v24, a2, &v7, &v8, &v10, &v13, &v19, &v22, v1, &v34, v2);
    }
    sub_23e3c(v26, *v26 + 24 * v27, v26[1]);
    sub_dd88(v29, v29->field_0 + v30 * 8, v29->field_8);
    sub_1d9ac(v36, v36->field_0 + 48 * v37, v36->field_8);
    return v54;
}
