/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13dc0..0x1449c (1756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13dc0_3 {
    struct st_13dc0_0 *field_0;
    long long field_8;
} st_13dc0_3;

typedef struct st_13dc0_5 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_13dc0_5;

typedef struct st_13dc0_2 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    long long field_20;
} st_13dc0_2;

typedef struct st_13dc0_4 {
    struct st_13dc0_3 *field_0;
} st_13dc0_4;

typedef struct st_13dc0_7 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[12];
    unsigned long long field_1c;
    char padding_24[48];
    unsigned long long field_54;
    char padding_5c[72];
    unsigned long long field_a4;
    char padding_ac[784];
    unsigned long long field_3bc;
    unsigned long long field_3c4;
    char padding_3cc[8];
    unsigned long long field_3d4;
    unsigned long long field_3dc;
} st_13dc0_7;

typedef struct st_13dc0_0 {
    char field_0;
} st_13dc0_0;

typedef struct st_13dc0_1 {
    char padding_0[88];
    char field_58;
    char padding_59[39];
    long long field_80;
    unsigned long long field_84;
    unsigned long long field_8c;
    char padding_94[12];
    long long field_a0;
    char padding_a8[48];
    long long field_d8;
    char padding_e0[72];
    long long field_128;
    char padding_130[784];
    unsigned long long field_440;
    long long field_448;
    char padding_450[8];
    struct st_13dc0_0 *field_458;
    long long field_460;
} st_13dc0_1;

extern unsigned long long g_e62640;
extern unsigned long long g_e62780;

long long sub_13dc0(st_13dc0_1 *a0, st_13dc0_5 *a1, st_13dc0_5 *a2)
{
    unsigned long long v31;  // x24
    unsigned long v32;  // x23
    unsigned long long v41;  // x27
    long long *v42;  // x28
    unsigned long long v43;  // x24
    unsigned long long v44;  // x24
    long long v45;  // x0
    long long v46;  // x0
    long long v47;  // x0
    long long v33;  // x0
    unsigned long long v34;  // w0
    long long v35;  // x22
    long long v36;  // x0
    long long v37;  // x26
    long long v38;  // w8
    long long v39;  // x0
    long long v40;  // x0
    long long v0;  // [bp-0x154]
    st_13dc0_7 *v1;  // [bp-0x150]
    unsigned long long v2;  // [bp-0x148]
    st_13dc0_0 **v3;  // [bp-0x140], Other Possible Types: char
    st_13dc0_0 *v4;  // [bp-0x138]
    st_13dc0_0 *v5;  // [bp-0x130], Other Possible Types: unsigned int, unsigned long
    unsigned long long v6;  // [bp-0x12c]
    unsigned long long v7;  // [bp-0x128]
    unsigned long v8;  // [bp-0x120]
    unsigned int v9;  // [bp-0x118]
    unsigned long long v10;  // [bp-0x114]
    long long *v11;  // [bp-0x110], Other Possible Types: st_13dc0_3 **, st_13dc0_4 **, st_13dc0_0 *, char, long long, unsigned long, unsigned long long
    unsigned long long v12;  // [bp-0x10c]
    unsigned long long v13;  // [bp-0x108], Other Possible Types: unsigned long
    char v14;  // [bp-0x100]
    unsigned long long v15;  // [bp-0xf8]
    unsigned long v16;  // [bp-0xe0]
    st_13dc0_3 *v17;  // [bp-0xd8], Other Possible Types: st_13dc0_4 **, unsigned long
    long long v18;  // [bp-0xd0]
    unsigned long long v19;  // [bp-0xc8]
    uint128_t v20;  // [bp-0xc0]
    st_13dc0_0 **v21;  // [bp-0xb0], Other Possible Types: st_13dc0_4 **, char
    uint128_t v22;  // [bp-0xa8]
    st_13dc0_2 *v23;  // [bp-0x98]
    long long v24;  // [bp-0x90]
    unsigned long long v25;  // [bp-0x88]
    unsigned long long v26;  // [bp-0x80]
    unsigned long long v27;  // [bp-0x78]
    st_13dc0_0 **v28;  // [bp-0x70], Other Possible Types: char, unsigned long
    char *v29;  // [bp-0x10]
    char v30;  // [bp+0x0]

    v29 = &v30;
    v4 = &v3;
    v3 = &v4;
    v0 = (int)a0->field_80;
    v31 = *(long long *)((char *)&a0->field_80 + 4);
    v1 = (char *)&a0->field_80 + 4;
    sub_f8d0();
    v26 = 0;
    v27 = 0;
    v23 = &a0->padding_130[776];
    v24 = (long long)(a0->field_440 - *(long long *)&a0->padding_130[776]) >> 3;
    v25 = 0;
    v2 = v31;
    if ((int)a0->field_80 == 93)
    {
        v11 = v31;
        v13 = *(long long *)((char *)&a0->field_84 + 4);
        sub_1db64(a0, &v11, "Attribute list cannot be empty");
        v11 = v31;
        v13 = *(long long *)((char *)&a0->field_84 + 4);
        v32 = sub_404c(*(long long *)&a0->padding_a8[40], 56);
        sub_68e8(v32, &v11, 4, v26, v27, *(long long *)&a0->padding_e0[64]);
        v17 = v32;
        if (a0->field_58 == 1)
        {
            v33 = sub_404c(*(long long *)&a0->padding_a8[40], 8);
            sub_8880(v33, 0);
            v11 = v17;
            sub_1c9f0(&a0[1].padding_0[48], &v11);
            *(long long *)(sub_12484(&a0[1].padding_0[48], &v11) + 8) = v33;
            v31 = v2;
        }
        v11 = &v21;
        v21 = &v11;
        sub_103a8(a1->field_0, &v17);
        a1->field_10 = a1->field_10 + 1;
        v11 = v0;
        v12 = v31;
        v34 = (unsigned int)sub_1ef30(a0, 93, &v11, 0);
        if (a0->field_58 != 1)
            return sub_dd88(v23, v23->field_0 + v24 * 8, v23->field_8);
        if (v34)
            v35 = *(long long *)&a0->padding_94[8];
        else
            v35 = -0x1;
        v36 = sub_ef54(a0, &v23);
        v17 = sub_87e4(sub_404c(*(long long *)&a0->padding_a8[40], 32), v31, v35, v36, &v23);
        v11 = &v21;
        v21 = &v11;
        sub_103a8(a2->field_0, &v17);
        a2->field_10 = a2->field_10 + 1;
        return sub_dd88(v23, v23->field_0 + v24 * 8, v23->field_8);
    }
    else
    {
        sub_1f174(a0, "attribute name");
        v20 = v22;
        v37 = v21;
        if ((unsigned int)((int)a0->field_80 - 278) < 2)
            goto LABEL_13f58;
        switch (v38)
        {
        case 40:
            v41 = *(long long *)((char *)&a0->field_80 + 4);
            break;
        case 123:
LABEL_13f58:
            v41 = 0xffffffffffffffff;
            break;
        default:
            v5 = sub_193ec(a0, *(unsigned long long *)&v20, *(unsigned long long *)((void*)&v20 + 8), v37, a1, &v26);
            v6 = 0;
            v11 = 4;
            v39 = sub_14f50(&v5, &v11);
            v28 = sub_68e8(sub_404c(*(long long *)&a0->padding_a8[40], 56), &v20, v39, v26, v27, v37);
            if (a0->field_58 == 1)
            {
                v40 = sub_404c(*(long long *)&a0->padding_a8[40], 8);
                sub_8880(v40, 0);
                v11 = v28;
                sub_1c9f0(&a0[1].padding_0[48], &v11);
                *(long long *)(sub_12484(&a0[1].padding_0[48], &v11) + 8) = v40;
            }
            v11 = &v17;
            v17 = &v11;
            sub_103a8(a1->field_0, &v28);
            a1->field_10 = a1->field_10 + 1;
            if ((int)a0->field_80 != 44)
                goto *((void *)(g_e62780));
            if (a0->field_58 == 1)
            {
                v11 = &v17;
                v17 = &v11;
                sub_f2b8(v23, v1);
                v25 += 1;
            }
            sub_f8d0(a0);
            goto *((void *)(g_e62640));
        }
        v17 = a0->padding_450;
        v18 = (char *)a0->field_458 - a0->padding_450 >> 3;
        v19 = 0;
        v16 = 0xffffffffffffffff;
        if (a0->field_58 == 1)
            sub_fd50(a0, &v17, &v16);
        else
            sub_fd50(a0, 0, 0);
        if (v13)
        {
            v42 = v11;
            v43 = v13 * 8;
            do
            {
                v44 = v43;
                if (!(sub_676c(*v42) & 1) && !(sub_7158(*v42) & 1))
                    sub_1db64(a0, &v14, "Only literals can be passed as arguments for attributes");
            } while ((v42 += 1, v43 = v44 - 8, v44 != 8));
        }
        v9 = sub_193ec(a0, *(unsigned long long *)&v20, *(unsigned long long *)((void*)&v20 + 8), v37, a1, &v11);
        v10 = 0;
        v5 = *(unsigned long long *)&v20;
        v7 = v15;
        v28 = 4;
        v45 = sub_14f50(&v9, &v28);
        v8 = sub_68e8(sub_404c(*(long long *)&a0->padding_a8[40], 56), &v5, v45, v11, v13, v37);
        if (a0->field_58 == 1)
        {
            v46 = sub_ef54(a0, &v17);
            v47 = sub_404c(*(long long *)&a0->padding_a8[40], 40);
            sub_88b0(v47, v41, v16, v46, &v17);
            v5 = v8;
            sub_1c9f0(&a0[1].padding_0[48], &v5);
            *(long long *)(sub_12484(&a0[1].padding_0[48], &v5) + 8) = v47;
        }
        v5 = &v28;
        v28 = &v5;
        sub_103a8(a1->field_0, &v8);
        a1->field_10 = a1->field_10 + 1;
        sub_dd88(v17, &v17->field_0[8 * v18], v17->field_8);
        if ((int)a0->field_80 != 44)
            goto *((void *)(g_e62780));
    }
}
