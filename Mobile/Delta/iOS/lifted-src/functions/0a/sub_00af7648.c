/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf7648..0xaf7af4 (1196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af7648_0 {
    int field_0;
    char padding_4[4];
    long long field_8;
} st_af7648_0;

typedef struct st_af7648_3 {
    char padding_0[16];
    long long field_10;
    char padding_18[8];
    struct st_af7648_2 *field_20;
    char padding_28[112];
    long long field_98;
    char padding_a0[12];
    unsigned int field_ac;
} st_af7648_3;

typedef struct st_af7648_2 {
    char padding_0[25];
    char field_19;
} st_af7648_2;

typedef struct st_af7648_4 {
    char padding_0[232];
    char field_e8;
    char padding_e9[39];
    long long field_110;
} st_af7648_4;

typedef struct st_af7648_1 {
    struct st_af7648_0 *field_0;
    char padding_8[16];
    unsigned int field_18;
} st_af7648_1;


unsigned long long sub_af7648(st_af7648_3 *a0, long long *a1, unsigned int *a2, void* a3, st_af7648_4 *a4)
{
    unsigned long v16;  // x8
    unsigned long long v17;  // x28
    unsigned long long v26;  // x19
    unsigned long long v27;  // x30
    unsigned int v28;  // w25
    long long v29;  // x0
    unsigned long long v30;  // w8
    unsigned long long v31;  // x0
    unsigned int v32;  // w21
    unsigned long v33;  // x26
    long long v34;  // x21
    unsigned int v35;  // w22
    unsigned long long v18;  // x27
    unsigned long v36;  // x22
    long long v37;  // x0
    unsigned long v38;  // x0
    unsigned long v39;  // x28
    unsigned long v40;  // x1
    long long v41;  // x23
    unsigned long long v42;  // x22
    unsigned long long v43;  // x1
    long long v44;  // x23
    unsigned long v45;  // x10
    unsigned long long v19;  // x26
    unsigned long long v46;  // x20
    st_af7648_1 *v47;  // x21
    long long v48;  // x0
    unsigned long long v49;  // x23
    st_af7648_0 *v50;  // x0
    st_af7648_0 *v51;  // x26
    st_af7648_0 *v52;  // x28
    unsigned long long v53;  // x22
    unsigned long v54;  // x23
    unsigned long long v55;  // x24
    unsigned long long v20;  // x25
    st_af7648_0 *v56;  // x0
    unsigned long long v57;  // x22
    long long v58;  // x0
    unsigned long long v59;  // x24
    unsigned int v60;  // w10
    unsigned long long v21;  // x24
    unsigned long long v22;  // x23
    unsigned long long v23;  // x22
    unsigned long long v24;  // x21
    unsigned long long v25;  // x20
    unsigned int v0;  // [bp-0x70]
    unsigned int v1;  // [bp-0x6c]
    unsigned int *v2;  // [bp-0x68]
    unsigned long long v3;  // [bp-0x60]
    unsigned long long v4;  // [bp-0x58]
    unsigned long long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    v16 = (int)a3[152];
    if (v16 >> 1 & 1)
        return 0;
    v3 = v17;
    v4 = v18;
    v5 = v19;
    v6 = v20;
    v7 = v21;
    v8 = v22;
    v9 = v23;
    v10 = v24;
    v11 = v25;
    v12 = v26;
    v13 = &v15;
    v14 = v27;
    if ((long long)a3[168])
        return 0;
    v28 = *a2;
    if (!(a0->field_20->field_19 >> 4 & 1))
    {
        if (!((unsigned int)v16 & 96))
            goto LABEL_af76d8;
    }
    else
    {
        if (!(v16 >> 6 & 1) || (int)a3[156] & ~v28)
        {
LABEL_af76d8:
            v2 = a2;
            v29 = sub_97725c(a4);
            if (sub_af1860(v29, sub_9ffdd0(a3)))
            {
                v30 = 0;
                if (!((char)((char)a3[152]) >> 5 & 1))
                    return 0;
            }
            else
            {
                v30 = 32;
            }
            v32 = ((unsigned int)((int)a3[132]) >> 1 & 0x100 | v30) ^ 0x100;
            if (!sub_af7af4(a0, a3, 0))
                v33 = v32;
            else
                v33 = v32 | 64;
            v34 = sub_9ffdd0();
            v35 = a0->field_ac;
            if (v35 == sub_ad69e4(a0->field_98) - 1)
                v36 = v35;
            else
                v36 = v35 + 1;
            v37 = sub_ad69f8();
            v38 = v33;
            if (!sub_aeb17c(v37, (long long)a3[0x88]) && v38 >> 5 & 1)
            {
                v31 = (unsigned int)v38 | 28;
                *a1 = v37;
            }
            else
            {
                v39 = v38;
                do
                {
                    v36 = (unsigned int)v36 + 1;
                    if ((int)sub_ad69e4(a0->field_98) <= (int)v36)
                    {
                        if (a0->field_20->field_19 >> 4 & 1 && (int)sub_ad69e4(a0->field_10) >= 1)
                        {
                            v42 = 0;
                            do
                            {
                                v43 = v42;
                                v44 = sub_ad69f8(a0->field_10, v43);
                                if (!sub_af1860(sub_ab1c50(v44, v43), v34) && !sub_aeb17c(v44, (long long)a3[0x88]))
                                {
                                    *a1 = v44;
                                    v31 = (unsigned int)v39 | 4;
                                    goto LABEL_af7874;
                                }
                            } while ((v42 = (unsigned int)v42 + 1, (int)sub_ad69e4(a0->field_10) > (int)v42));
                        }
                        v31 = v39;
                        goto LABEL_af7874;
                    }
                } while ((v40 = v36, v41 = sub_ad69f8(a0->field_98, v36), sub_af1860(sub_ab1c50(v41, v36), v34) || sub_aeb17c(v41, (long long)a3[0x88])));
                v31 = (unsigned int)v39 | 12;
                *a1 = v41;
            }
LABEL_af7874:
            if (v31 >> 2 & 1)
            {
                v45 = (int)a3[152];
                if (!(v45 >> 4 & 1))
                {
                    if (!(a4->field_e8 >> 4 & 1))
                    {
                        if (!(v45 >> 3 & 1))
                            goto LABEL_af789c;
                    }
                    else
                    {
                        if (!(v45 >> 2 & 1))
                        {
LABEL_af789c:
                            v0 = (int)a3[156];
                            v1 = v31;
                            if ((int)sub_ad69e4(a4->field_110) >= 1)
                            {
                                v46 = 0;
                                do
                                {
                                    v47 = sub_ad69f8(a4->field_110, v46);
                                    v48 = sub_9ffdd0(a3);
                                    if (*(long long *)&v47->padding_8[8] && (int)sub_ad69e4(*(long long *)&v47->padding_8[8]) >= 1)
                                    {
                                        v49 = 0;
                                        do
                                        {
                                            v50 = sub_ad69f8(*(long long *)&v47->padding_8[8], v49);
                                            if (v50->field_0 == 4 && !sub_af1860(v50->field_8, v48))
                                                goto LABEL_af7950;
                                        } while ((v49 = (unsigned int)v49 + 1, (int)sub_ad69e4(*(long long *)&v47->padding_8[8]) > (int)v49));
                                    }
                                    if (!(v1 >> 5 & 1))
                                        continue;
LABEL_af7950:
                                    if (!(long long)a3[144] || (v51 = v47->field_0, !v51 || (v52 = *(long long *)(long long)a3[144], !v52)))
                                    {
LABEL_af7a98:
                                        v31 = v1;
                                        v60 = v47->field_18 & v0;
                                        goto LABEL_af7adc;
                                    }
                                    if (v51->field_0 == 1)
                                    {
                                        v53 = *(long long *)&v51[1].field_0;
                                        if (!v53)
                                            continue;
                                        if (v52->field_0 == 1)
                                        {
                                            if (!*(long long *)&v52[1].field_0 || sub_af1860(v53))
                                                continue;
                                            goto LABEL_af7a98;
                                        }
                                        else
                                        {
                                            v51 = v52;
                                            goto LABEL_af7a40;
                                        }
                                        goto LABEL_af7a40;
                                    }
                                    else if (v52->field_0 == 1)
                                    {
                                        v53 = *(long long *)&v52[1].field_0;
                                        if (!v53)
                                            continue;
LABEL_af7a40:
                                        v54 = v51->field_8;
                                        if ((int)sub_ad69e4(v54) >= 1)
                                        {
                                            v55 = 0;
                                            do
                                            {
                                                v56 = sub_ad69f8(v54, v55);
                                                if (v56->field_0 == 4 && !sub_af1860(v53, v56->field_8))
                                                    goto LABEL_af7a98;
                                            } while ((v55 = (unsigned int)v55 + 1, (int)sub_ad69e4(v54) > (int)v55));
                                        }
                                    }
                                    else if ((int)sub_ad69e4(v51->field_8) >= 1)
                                    {
                                        v57 = 0;
                                        do
                                        {
                                            v58 = sub_ad69f8(v51->field_8, v57);
                                            if ((int)sub_ad69e4(v52->field_8) >= 1)
                                            {
                                                v59 = 0;
                                                do
                                                {
                                                    if (!sub_ae75e0(v58, sub_ad69f8(v52->field_8, v59)))
                                                        goto LABEL_af7a98;
                                                } while ((v59 = (unsigned int)v59 + 1, (int)v59 < (int)sub_ad69e4(v52->field_8)));
                                            }
                                        } while ((v57 = (unsigned int)v57 + 1, (int)sub_ad69e4(v51->field_8) > (int)v57));
                                    }
                                } while ((v46 = (unsigned int)v46 + 1, (int)sub_ad69e4(a4->field_110) > (int)v46));
                            }
                            if ((long long)a3[144])
                            {
                                v31 = v1;
                                if (v31 >> 5 & 1 && !(v60 = v0, *(long long *)(long long)a3[144]))
                                    goto LABEL_af7adc;
                            }
                            else
                            {
                                v60 = v0;
                                v31 = v1;
                                if (v31 >> 5 & 1)
                                {
LABEL_af7adc:
                                    if (!(v60 & ~v28))
                                        return 0;
                                    v28 |= v60;
                                    v31 = (unsigned int)v31 | 128;
                                }
                            }
                        }
                    }
                }
                *v2 = v28;
                return (unsigned int)v31;
            }
        }
    }
    return 0;
}
