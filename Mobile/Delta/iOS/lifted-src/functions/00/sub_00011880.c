/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x11880..0x12160 (2272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_11880_4 {
    unsigned long long field_0;
    long long field_8;
} st_11880_4;

typedef struct st_11880_1 {
    char padding_0[12];
    uint128_t field_c;
} st_11880_1;

typedef struct st_11880_3 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    long long field_20;
} st_11880_3;

typedef struct st_11880_2 {
    long long field_0;
    struct st_11880_1 *field_8;
    uint128_t field_10;
    unsigned int field_20;
    uint128_t field_24;
    char field_34;
} st_11880_2;

typedef struct st_11880_6 {
    unsigned long long field_0;
    char field_8[20];
    unsigned long long field_c[2];
    char field_14;
    char padding_15[7];
    unsigned long long field_1c;
    unsigned long long field_24;
    char padding_2c[40];
    unsigned long long field_54;
    char padding_5c[64];
    unsigned long long field_9c;
    char padding_a4[504];
    unsigned long long field_29c;
    unsigned long long field_2a4;
    char padding_2ac[8];
    unsigned long long field_2b4;
    unsigned long long field_2bc;
} st_11880_6;

typedef struct st_11880_5 {
    struct st_11880_0 *field_0;
} st_11880_5;

typedef struct st_11880_0 {
    char field_0;
} st_11880_0;

extern unsigned long long g_e62d18;
extern unsigned long long g_e62de8;

long long sub_11880(void* a0, unsigned int a1)
{
    void* v48;  // x27
    unsigned long long v49;  // x22
    unsigned long long v58;  // x8
    unsigned long long v59;  // x8
    unsigned int v60;  // w8
    st_11880_1 *v61;  // x28
    long long v62;  // x0
    st_11880_2 *v63;  // x0
    unsigned long long v64;  // x21
    unsigned int v65;  // w0
    unsigned long long v66;  // x8
    unsigned long v67;  // x21
    st_11880_6 *v50;  // x27
    unsigned long v68;  // x0
    long long v69;  // x0
    long long v70;  // x0
    void* v51;  // x20
    void* v52;  // x20
    unsigned long v53;  // x25
    unsigned long long v54;  // x28
    unsigned long long v55;  // x8
    unsigned long long v56;  // x8
    unsigned long long v57;  // x0
    unsigned long long v0;  // [bp-0x1b8]
    unsigned long long v1;  // [bp-0x1b0]
    uint128_t *v2;  // [bp-0x1a8]
    unsigned long long *v3;  // [bp-0x1a0]
    uint128_t *v4;  // [bp-0x198]
    unsigned long long v5;  // [bp-0x18c]
    unsigned long long v6;  // [bp-0x188]
    st_11880_0 **v7;  // [bp-0x180], Other Possible Types: char
    st_11880_0 *v8;  // [bp-0x178]
    st_11880_0 *v9;  // [bp-0x170], Other Possible Types: st_11880_5 **, unsigned long, unsigned long long
    uint128_t v10;  // [bp-0x168], Other Possible Types: unsigned int
    unsigned int v11;  // [bp-0x164]
    unsigned long long v13;  // [bp-0x158]
    st_11880_0 **v14;  // [bp-0x150], Other Possible Types: st_11880_5 **, uint128_t, st_11880_0 *, unsigned long long
    unsigned long long v15;  // [bp-0x148]
    unsigned int v16;  // [bp-0x140]
    uint128_t v17;  // [bp-0x130], Other Possible Types: char, long long, unsigned int, unsigned long, unsigned long long
    uint128_t v18;  // [bp-0x12c], Other Possible Types: unsigned long
    uint128_t v19;  // [bp-0x128], Other Possible Types: uint128_t, unsigned long
    unsigned long long v20;  // [bp-0x124]
    uint128_t v21;  // [bp-0x120], Other Possible Types: char, unsigned long long
    unsigned long long v22;  // [bp-0x11c]
    unsigned long long v23;  // [bp-0x118]
    unsigned int v24;  // [bp-0x114]
    unsigned int v25;  // [bp-0x110], Other Possible Types: unsigned long long
    uint128_t v26;  // [bp-0x10c]
    unsigned long long v27;  // [bp-0x108]
    unsigned long long v28;  // [bp-0x100]
    char v29;  // [bp-0xfc]
    uint128_t v30;  // [bp-0xf0], Other Possible Types: unsigned long long, unsigned long
    st_11880_3 **v31;  // [bp-0xe8], Other Possible Types: uint128_t, unsigned long long
    uint128_t v32;  // [bp-0xe0]
    char v33;  // [bp-0xd8]
    uint128_t v34;  // [bp-0xd0]
    unsigned int v35;  // [bp-0xc0]
    unsigned int v36;  // [bp-0xbc]
    unsigned long long v37;  // [bp-0xb8]
    st_11880_4 *v38;  // [bp-0xb0]
    unsigned long long v39;  // [bp-0xa8]
    unsigned long long iter;  // [bp-0xa0]
    st_11880_3 *v41;  // [bp-0x98]
    unsigned long long v42;  // [bp-0x90]
    unsigned long long node;  // [bp-0x88]
    st_11880_0 **v44;  // [bp-0x80], Other Possible Types: st_11880_5 **, char
    st_11880_0 *v45;  // [bp-0x78], Other Possible Types: st_11880_5 **, st_11880_0 **
    char *v46;  // [bp-0x10]
    char v47;  // [bp+0x0]

    v46 = &v47;
    v8 = &v7;
    v7 = &v8;
    sub_16844();
    v41 = a0 + 800;
    v42 = 7905747460161236407 * ((long long)a0[808] - (long long)a0[800] >> 3);
    node = 0;
    v38 = a0 + 824;
    v39 = 7905747460161236407 * ((long long)a0[832] - (long long)a0[824] >> 3);
    v48 = a0;
    v49 = (long long)v48[132];
    v50 = v48 + 132;
    iter = 0;
    v51 = a0;
    v52 = v51 + 128;
    v36 = (int)v51[128];
    v37 = v49;
    sub_1f3d4(a0, 123, "table type");
    v6 = v49 >> 32;
    v3 = &v17 | 4;
    v4 = &v30 | 4;
    v2 = v4;
    if (*(int *)v52 != 125)
    {
        *(char *)&v34 = 0;
        *(char *)&v35 = 0;
        if (*(int *)v52 != 281 || (sub_b1a4(a0 + 96), (unsigned int)v17 == 58))
        {
LABEL_119a8:
            v53 = 3;
        }
        else
        {
            v17 = (long long)a0[152];
            if (sub_1935c(&v17, "read"))
            {
                sub_1f158(&v34, v50);
                sub_c048(a0 + 96);
                v53 = 1;
            }
            else
            {
                v17 = (long long)a0[152];
                if (!sub_1935c(&v17, "write"))
                    goto LABEL_119a8;
                sub_1f158(&v34, v50);
                sub_c048(a0 + 96);
                v53 = 2;
            }
        }
        if (*(int *)v52 == 91)
        {
            v30 = *(int128_t *)v52;
            v32 = (int128_t)v52[16];
            sub_f8d0(a0);
            if ((*(int *)v52 & 0xfffffffe) == 278 && (sub_b1a4(a0 + 96), (unsigned int)v17 == 93))
            {
                if ((char)a0[88] == 1)
                {
                    v2 = sub_1c948(a0);
                    v54 = v2 >> 32;
                }
                else
                {
                    v54 = 0;
                }
                v14 = 0;
                v15 = 0;
                sub_1ede0(a0);
                v17 = *(unsigned int *)&v30;
                v18 = *(unsigned long long *)((void*)&v30 + 4);
                if (sub_1ef30(a0, 93, &v17, 0))
                    v55 = (long long)a0[160];
                else
                    v55 = 0xffffffffffffffff;
                v1 = v55;
                v5 = 0;
                if (sub_1f3d4(a0, 58, "table field"))
                    v56 = (long long)a0[160];
                else
                    v56 = 0xffffffffffffffff;
                v0 = v56;
                v57 = sub_12740(a0, 0);
                if (*(char *)((void*)&v10 + 8) != 1 || _memchr(v9, 0, v10))
                {
                    sub_1db64(a0, v4, "String literal contains malformed escape sequence or \\0");
                }
                else
                {
                    v19 = *v4;
                    v17 = v9;
                    v23 = v57;
                    v25 = v53;
                    v26 = v34;
                    v29 = v35;
                    v45 = &v44;
                    v44 = &v45;
                    sub_15fe8(v41, &v17);
                    node += 1;
                    if ((char)a0[88] == 1)
                    {
                        v17 = 2;
                        v18 = *(unsigned long long *)((void*)&v30 + 4);
                        v20 = v1;
                        v22 = v0;
                        v24 = sub_1d958(a0);
                        if (v24 == 2)
                            v58 = 0xffffffffffffffff;
                        else
                            v58 = v50->field_0;
                        v25 = v58;
                        v27 = sub_86d8(sub_404c((long long)a0[216], 32), v14, v15, v2, v54);
                        v28 = (long long)a0[132];
                        v45 = &v44;
                        v44 = &v45;
                        sub_15fe8(v38, &v17);
                        iter += 1;
                    }
                }
LABEL_11e34:
                v60 = *(int *)v52;
                if (v60 == 44)
                    goto LABEL_11e64;
                else
                    goto LABEL_11e54;
            }
            else
            {
                v14 = v34;
                v16 = v35;
                v17 = v30;
                v21 = v32;
                sub_19df4(a0, v53, &v14, &v17);
                if ((char)a0[88] != 1)
                    goto LABEL_11e34;
                v17 = 0;
                v18 = v10;
                v22 = v13;
                v24 = sub_1d958(a0);
                if (v24 == 2)
                    v59 = 0xffffffffffffffff;
                else
                    v59 = v50->field_0;
                v25 = v59;
                v27 = 0;
                v28 = 0;
                v14 = &v45;
                v45 = &v14;
                sub_15fe8(v38, &v17);
                iter += 1;
                v60 = *(int *)v52;
                if (v60 != 44)
                    goto LABEL_11e54;
                else
                    goto LABEL_11e64;
            }
        }
        else
        {
            if (!node && (*(int *)v52 != 281 || !(sub_b1a4(a0 + 96), (unsigned int)v17 == 58)))
            {
                v61 = sub_12740(a0, 0);
                v9 = v49;
                v10 = v49;
                v11 = v6;
                v14 = &v45;
                v45 = &v14;
                v62 = sub_404c((long long)a0[216], 120);
                v17 = 0;
                v21 = 0;
                v30 = 0;
                v31 = 0;
                sub_6984(v62, &v9, 0, 0, (long long)a0[288], &v17, &v9, 0, &v30, 0);
                v30 = *(int128_t *)(v61->padding_0)[1];
                v17 = v34;
                v21 = v35;
                v63 = sub_404c((long long)a0[216], 56);
                v63->field_0 = v62;
                v63->field_8 = v61;
                v63->field_10 = v30;
                v63->field_20 = v53;
                *(uint128_t *)&(&v63->field_20)[1] = v17;
                *((char *)&v63->field_24 + 4) = v21;
                goto *((void *)(g_e62d18));
            }
            sub_107a4(a0, "table field");
            if (v33 & 1)
            {
                if (sub_1f3d4(a0, 58, "table field"))
                    v64 = (long long)a0[160];
                else
                    v64 = 0xffffffffffffffff;
                v19 = v31;
                v17 = v30;
                v23 = sub_12740(a0, a1);
                v25 = v53;
                v26 = v34;
                v29 = v35;
                v9 = &v14;
                v14 = &v9;
                sub_15fe8(v41, &v17);
                node += 1;
                if ((char)a0[88] == 1)
                {
                    v65 = sub_1d958(a0);
                    v17 = 1;
                    v66 = 0xffffffffffffffff;
                    *v3 = 0xffffffffffffffff;
                    v3[1] = 0xffffffffffffffff;
                    v22 = v64;
                    v24 = v65;
                    if (v24 != 2)
                        v66 = v50->field_0;
                    v25 = v66;
                    v27 = 0;
                    v28 = 0;
                    v9 = &v14;
                    v14 = &v9;
                    sub_15fe8(v38, &v17);
                    iter += 1;
                }
                v60 = *(int *)v52;
                if (*(int *)v52 != 44)
                    goto LABEL_11e54;
                else
                    goto LABEL_11e64;
            }
            else
            {
                goto *((void *)(g_e62d18));
            }
        }
LABEL_11e54:
        switch (v60)
        {
        case 59:
LABEL_11e64:
            sub_f8d0(a0);
        case 125:
            goto *((void *)(g_e62de8));
        default:
            goto *((void *)(g_e62d18));
        }
    }
    else
    {
        v67 = (long long)a0[140];
        if (!(sub_1ef30(a0, 125, &v36, 1) & 1))
            v67 = (long long)a0[168];
        v17 = v49;
        v19 = v67;
        v30 = sub_1c5e4(a0, &v41);
        v31 = &v41;
        v68 = sub_404c((long long)a0[216], 56);
        sub_731c(v68, &v17, &v30, 0);
        if ((char)a0[88] == 1)
        {
            v69 = sub_1c5e4(a0, &v38);
            v70 = sub_404c((long long)a0[216], 32);
            sub_8580(v70, v69, &v38, 0);
            v17 = v68;
            sub_1c9f0(a0 + 1184, &v17);
            *(long long *)(sub_12484(a0 + 1184, &v17) + 8) = v70;
        }
        sub_13918(v38, v38->field_0 + 56 * v39, v38->field_8);
        sub_13918(v41, v41->field_0 + 56 * v42, v41->field_8);
        return v68;
    }
}
