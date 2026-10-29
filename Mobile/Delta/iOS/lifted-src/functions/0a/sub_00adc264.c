/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadc264..0xadc718 (1204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adc264_1 {
    char padding_0[8];
    long long field_8;
} st_adc264_1;

typedef struct st_adc264_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_adc264_0;

typedef struct st_adc264_3 {
    char padding_0[8];
    long long field_8;
    long long field_10;
} st_adc264_3;

typedef struct st_adc264_2 {
    char padding_0[16];
    struct st_adc264_3 *field_10;
    struct st_adc264_1 *field_18;
} st_adc264_2;

typedef struct st_adc264_4 {
    unsigned long long field_0;
    unsigned int field_8;
} st_adc264_4;

extern unsigned long long g_c7c2eb;
extern char g_10002b0;

unsigned long long sub_adc264(st_adc264_2 *a0, unsigned long long a1, unsigned long a2, st_adc264_0 *a3, long long a4, long long a5)
{
    long long v19;  // x22
    unsigned long long *v20;  // x8
    unsigned long v29;  // x0
    unsigned long v30;  // x1
    long long v31;  // x2
    char *v32;  // x1
    long long v33;  // x0
    long long v34;  // x3
    long long v35;  // x4
    long long v36;  // x0
    unsigned long long v37;  // x22
    unsigned long long v38;  // x0
    unsigned long long v21;  // x28
    long long v39;  // x0
    unsigned long long v40;  // x0
    unsigned long long v41;  // x8
    long long v43;  // x1
    long long v44;  // x1
    unsigned long long v45;  // x21
    unsigned long long idx;  // x20
    long long *v23;  // x27
    unsigned long v24;  // x0
    unsigned long v25;  // x24
    st_adc264_4 *v26;  // x27
    unsigned long long v27;  // x0
    unsigned long long v28;  // x21
    unsigned long v0;  // [bp-0x300]
    unsigned long long v1;  // [bp-0x2f8]
    unsigned long v2;  // [bp-0x2f0]
    unsigned long long v3;  // [bp-0x2e8]
    unsigned long long v4;  // [bp-0x2e0]
    st_adc264_0 *v5;  // [bp-0x2d0]
    long long v6;  // [bp-0x2c8]
    unsigned long long v7;  // [bp-0x2c0]
    long long *v8;  // [bp-0x2b8]
    char v9;  // [bp-0x2a8]
    unsigned long v10;  // [bp-0x218]
    char *v11;  // [bp-0x200]
    char v12;  // [bp-0x1f4], Other Possible Types: unsigned long long
    char v13;  // [bp-0x1f0]
    char v14;  // [bp-0x1d8]
    char v15;  // [bp-0x1a8]
    unsigned long v16;  // [bp-0x70]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v16 = *(long long *)&g_10002b0;
    if (a2)
    {
        v19 = a4;
        if (a1 == 1)
        {
            v5 = a3;
            v20 = &v15;
            v21 = &g_c7c2eb;
            goto LABEL_adc2f0;
        }
        else if (a1 == 2)
        {
            v5 = a3;
            v20 = &v14;
            v21 = "r";
LABEL_adc2f0:
            *v20 = a2;
            v11 = &v13;
            idx = sub_9ebce0();
            if (!idx)
            {
                sub_a368c8();
                v44 = 0xff;
                goto LABEL_adc370;
            }
            v23 = a0->field_10;
            v24 = sub_af19c4(a2, v19, a5, &v12);
            if (v12 && !(v25 = v24, v12 = 0, (int)sub_ad69e4(v23[1]) < 1))
            {
                v8 = v23;
                v6 = v19;
                while (1)
                {
                    v26 = sub_ad69f8(v23[1], v12);
                    if (!sub_9ebd68(idx, _strlen(v26->field_0) + 0x11))
                    {
                        sub_a368c8();
                        v44 = 271;
LABEL_adc370:
                        sub_a369bc("crypto/x509/by_dir.c", v44, "get_cert_by_subject_ex");
                        v43 = 524295;
                        goto LABEL_adc380;
                    }
                    if (a1 == 2 && *(long long *)((char *)&v26[1].field_0 + 4))
                    {
                        v10 = v25;
                        if (sub_a7c17c(v8[2]))
                        {
                            v27 = sub_ad66d4(*(long long *)((char *)&v26[1].field_0 + 4), &v10);
                            if (!(v27 >> 31 & 1))
                            {
                                v7 = sub_ad69f8(*(long long *)((char *)&v26[1].field_0 + 4), v27);
                                v28 = *(int *)(v7 + 8);
                            }
                            else
                            {
                                v28 = 0;
                                v7 = 0;
                            }
                            sub_a7c1b4(v8[2]);
                            goto LABEL_adc50c;
                        }
                        goto LABEL_adc388;
                    }
                    v28 = 0;
                    v7 = 0;
LABEL_adc50c:
                    v29 = *(long long *)(idx + 8);
                    v30 = *(long long *)(idx + 16);
                    v3 = v21;
                    v4 = v28;
                    v1 = 47;
                    v2 = v25;
                    v0 = v26->field_0;
                    while (1)
                    {
                        v31 = "%s%c%08lx.%s%d";
                        sub_9d5b44(v29, v30, "%s%c%08lx.%s%d");
                        if (_lstat(*(long long *)(idx + 8), &v9) >> 31 & 1)
                            break;
                        v32 = &v9;
                        if (!(_stat(*(long long *)(idx + 8), &v9) >> 31 & 1))
                        {
                            v33 = sub_a36c8c();
                            if (a1 == 1)
                            {
                                v32 = *(long long *)(idx + 8);
                                v31 = v26->field_8;
                                v33 = sub_adca18(a0, v32, v31, v19, a5);
                            }
                            else if (a1 == 2)
                            {
                                v32 = *(long long *)(idx + 8);
                                v31 = v26->field_8;
                                v33 = sub_adccec(a0, v32, v31);
                            }
                            sub_a36cd4(v33, v32, v31, v34, v35);
                        }
                        v28 = (unsigned int)v28 + 1;
                        v29 = *(long long *)(idx + 8);
                        v30 = *(long long *)(idx + 16);
                        v3 = v21;
                        v4 = v28;
                        v1 = 47;
                        v2 = v25;
                        v0 = v26->field_0;
                    }
                    if ((int)v28 >= 1)
                        break;
LABEL_adc450:
                    v12 += 1;
                    v23 = v8;
                    v19 = v6;
                    if ((int)sub_ad69e4(v23[1]) <= v12)
                        goto LABEL_adc388;
                }
                if (!sub_af2758(a0->field_18))
                    goto LABEL_adc388;
                v36 = sub_ad66d4(a0->field_18->field_8, &a1);
                v37 = sub_ad69f8(a0->field_18->field_8, v36);
                sub_af2768(a0->field_18);
                if (a1 != 2)
                {
LABEL_adc44c:
                    if (!v37)
                        goto LABEL_adc450;
                    v5->field_0 = *(int *)v37;
                    v5->field_8 = *(long long *)(v37 + 8);
                    sub_a35af4();
                    v45 = 1;
                }
                else
                {
                    if (sub_a7c198(v8[2]))
                    {
                        v38 = v7;
                        if (!v38)
                        {
                            v10 = v25;
                            v39 = sub_ad66d4(*(long long *)((char *)&v26[1].field_0 + 4), &v10);
                            v38 = sub_ad69f8(*(long long *)((char *)&v26[1].field_0 + 4), v39);
                            if (v38)
                                goto LABEL_adc62c;
                            v40 = sub_a6bf4c(16, "crypto/x509/by_dir.c", 389);
                            if (v40)
                            {
                                v41 = v40;
                                *(unsigned long *)v40 = v25;
                                *(unsigned int *)(v40 + 8) = v28;
                                if (sub_ad68a0(*(long long *)((char *)&v26[1].field_0 + 4), v41))
                                {
                                    sub_ad6ae4(*(long long *)((char *)&v26[1].field_0 + 4));
                                    goto LABEL_adc440;
                                }
                                else
                                {
                                    sub_a7c1b4(v8[2]);
                                    sub_a368c8(sub_a6c2e4(v41, "crypto/x509/by_dir.c", 399), "crypto/x509/by_dir.c", 399);
                                    sub_a369bc("crypto/x509/by_dir.c", 400, "get_cert_by_subject_ex");
                                    v43 = 524303;
LABEL_adc380:
                                    sub_a36abc(11, v43, 0);
                                }
                            }
                            else
                            {
                                sub_a7c1b4(v8[2]);
                                goto LABEL_adc388;
                            }
                        }
                        else
                        {
LABEL_adc62c:
                            if ((int)v28 > *(int *)(v38 + 8))
                                *(unsigned int *)(v38 + 8) = v28;
LABEL_adc440:
                            sub_a7c1b4(v8[2]);
                            goto LABEL_adc44c;
                        }
                    }
                    goto LABEL_adc388;
                }
            }
            else
            {
LABEL_adc388:
                v45 = 0;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/by_dir.c", 250, "get_cert_by_subject_ex");
            sub_a36abc(11, 112, 0);
            v45 = 0;
            idx = 0;
        }
        if (sub_af2758(a0->field_18))
        {
            if (!sub_ab8cf8(a0->field_18->field_8))
                sub_ad6ae4(a0->field_18->field_8);
            sub_af2768(a0->field_18);
        }
        sub_9ebcf4(idx);
    }
    else
    {
        v45 = 0;
    }
    if (*(long long *)&g_10002b0 == v16)
        return v45;
    ___stack_chk_fail();
}
