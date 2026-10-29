/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d4920..0x3d4cf0 (976 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d4920_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
} st_3d4920_1;

typedef struct st_3d4920_0 {
    short field_0;
    char padding_2[14];
    short field_10;
    char padding_12[14];
    unsigned short field_20;
    char padding_22[14];
    unsigned short field_30;
    char padding_32[14];
    unsigned short field_40;
    char field_42;
    char padding_43[13];
    unsigned short field_50;
    char padding_52[14];
    unsigned short field_60;
    char padding_62[14];
    unsigned short field_70;
} st_3d4920_0;

extern char g_10002b0;

int sub_3d4920(char *a0, unsigned long long a1, st_3d4920_0 *a2)
{
    unsigned int iter;  // x8
    unsigned short *node;  // x9
    unsigned int v15;  // w19
    unsigned int v16;  // w21
    unsigned int v17;  // w22
    unsigned int v18;  // w23
    unsigned int v19;  // w21
    unsigned int v20;  // w25
    unsigned int v21;  // w26
    unsigned int v22;  // w27
    unsigned int v23;  // w28
    unsigned int v24;  // w1
    unsigned int v7;  // w7
    unsigned int v25;  // w10
    unsigned int v26;  // w0
    unsigned int v27;  // w1
    unsigned int v28;  // w28
    unsigned int v29;  // w7
    unsigned int v30;  // w27
    unsigned int v31;  // w0
    unsigned int v32;  // w10
    unsigned int v33;  // w1
    unsigned int v34;  // w19
    unsigned short v8;  // x19
    unsigned int v35;  // w20
    unsigned int v36;  // w21
    int *v37;  // x23
    unsigned int v38;  // x19
    char *iter1;  // x21
    st_3d4920_1 *v40;  // x8
    unsigned int v41;  // w10
    unsigned int v42;  // w12
    unsigned int v43;  // w13
    unsigned int v44;  // w9
    unsigned int v9;  // w7
    unsigned int v45;  // w11
    unsigned long v46;  // x14
    unsigned long v47;  // x8
    unsigned int v48;  // w16
    unsigned int v49;  // w13
    unsigned int v50;  // w0
    unsigned long long v51;  // x1
    unsigned int v52;  // w4
    unsigned long v53;  // x2
    unsigned long v54;  // x3
    unsigned int *v10;  // x19
    unsigned int v55;  // w0
    unsigned long long v56;  // x1
    unsigned int v57;  // w23
    unsigned int v58;  // w24
    unsigned int v59;  // w25
    unsigned int v60;  // w22
    unsigned int v61;  // w26
    unsigned int v62;  // w27
    unsigned int v63;  // w20
    unsigned int v64;  // w28
    unsigned int v11;  // w19
    unsigned int v65;  // w0
    unsigned int v12;  // w20
    unsigned int v13;  // w21
    unsigned int v14;  // w20
    unsigned long v0;  // [bp-0x178], Other Possible Types: unsigned long long
    char v1;  // [bp-0x170]
    unsigned long v2;  // [bp-0x70]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v0 = a1;
    iter = 0;
    v2 = *(long long *)&g_10002b0;
    node = &a2->field_40;
    while (1)
    {
        v7 = *(short *)((char *)node - 48);
        v8 = *(short *)((char *)node - 32);
        if (!(unsigned short)v7 && !*(short *)((char *)node - 32))
        {
            if (*(short *)((char *)node - 16) || *node || node[8] || node[16] || node[24])
            {
                v8 = 0;
            }
            else
            {
                v9 = *(short *)((char *)node - 64) * 4;
                v10 = &(&v1)[iter];
                v10[56] = v9;
                v10[48] = v9;
                v10[40] = v9;
                v10[32] = v9;
                v10[24] = v9;
                v10[16] = v9;
                v10[8] = v9;
                *v10 = v9;
                iter += 4;
                node += 1;
                if (iter == 32)
                    break;
                else
                    continue;
            }
        }
        v11 = v8;
        v12 = node[16];
        v13 = 2217 * (v12 + v11);
        v14 = v13 + 0xffffe271 * v12;
        v15 = v13 + 3135 * v11;
        v16 = *(short *)((char *)node - 64);
        v17 = *node;
        v18 = (v17 + v16) * 0x1000;
        v19 = (v16 - v17) * 0x1000;
        v20 = node[24];
        v21 = node[8];
        v22 = *(short *)((char *)node - 16);
        v23 = v22 + v20;
        v21 += v7;
        v24 = 4816 * (v23 + v21);
        v25 = v24 + 0xfffff19b * (v20 + v7);
        v26 = v24 + 0xffffd6ff * (v22 + v21);
        v27 = 0xffffe09e * v23;
        v28 = 0xfffff9c3 * v21;
        v29 = v28 + 6149 * v7 + v25;
        v30 = v27 + 12586 * v22 + v26;
        v31 = v28 + 8410 * v21 + v26;
        v32 = v27 + 1223 * v20 + v25;
        v33 = v15 + v18 + 0x200;
        v34 = v14 + v19 + 0x200;
        v35 = v19 - v14 + 0x200;
        v36 = v18 - v15 + 0x200;
        v37 = &(&v1)[iter];
        *v37 = (int)(v29 + v33) >> 10;
        v37[56] = (int)(v33 - v29) >> 10;
        v37[8] = (int)(v30 + v34) >> 10;
        v37[48] = (int)(v34 - v30) >> 10;
        v37[16] = (int)(v31 + v35) >> 10;
        v37[40] = (int)(v35 - v31) >> 10;
        v37[24] = (int)(v32 + v36) >> 10;
        v37[32] = (int)(v36 - v32) >> 10;
        iter += 4;
        node += 1;
        if (iter == 32)
            break;
    }
    v38 = 0;
    v0 = (int)v0;
    iter1 = a0 + 3;
    do
    {
        v40 = &(&v1)[v38];
        v41 = v40->field_1c;
        v42 = v40->field_c;
        v43 = 2217 * (v40->field_18 + v40->field_8);
        v44 = v43 + 0xffffe271 * v40->field_18;
        v45 = v43 + 3135 * v40->field_8;
        v46 = v40->field_14;
        v47 = v40->field_4;
        v48 = (v40->field_10 + v40->field_0) * 0x1000;
        v49 = (v40->field_0 - v40->field_10) * 0x1000;
        v50 = v42 + v41;
        v51 = v47 + v46;
        v52 = 4816 * ((unsigned int)v51 + v50);
        v53 = v52 + 0xfffff19b * ((unsigned int)v47 + v41);
        v54 = v52 + 0xffffd6ff * (v42 + (unsigned int)v46);
        v55 = 0xffffe09e * v50;
        v56 = 0xfffff9c3 * v51;
        v57 = (unsigned int)v56 + 6149 * (unsigned int)v47 + (unsigned int)v53;
        v58 = v55 + 12586 * v42 + (unsigned int)v54;
        v59 = (unsigned int)v56 + 8410 * (unsigned int)v46 + (unsigned int)v54;
        v60 = v55 + 1223 * v41 + (unsigned int)v53;
        v61 = v45 + v48 + 0x1010000;
        v62 = v44 + v49 + 0x1010000;
        v63 = v49 - v44 + 0x1010000;
        v64 = v48 - v45 + 0x1010000;
        *(iter1 - 3) = sub_3d66bc((int)(v57 + v61) >> 0x11, v56, v53, v54, 0x1805, 0xffffd6ff);
        iter1[4] = sub_3d66bc((int)(v61 - v57) >> 0x11);
        *(iter1 - 2) = sub_3d66bc((int)(v58 + v62) >> 0x11);
        iter1[3] = sub_3d66bc((int)(v62 - v58) >> 0x11);
        *(iter1 - 1) = sub_3d66bc((int)(v59 + v63) >> 0x11);
        iter1[2] = sub_3d66bc((int)(v63 - v59) >> 0x11);
        *iter1 = sub_3d66bc((int)(v60 + v64) >> 0x11);
        v65 = sub_3d66bc((int)(v64 - v60) >> 0x11);
        iter1[1] = v65;
        v38 += 32;
        iter1 = &iter1[v0];
    } while (v38 != 0x100);
    if (*(long long *)&g_10002b0 == v2)
        return v65;
    ___stack_chk_fail();
}
