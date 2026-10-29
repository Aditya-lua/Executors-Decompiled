/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40e80..0x41380 (1280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40e80_3 {
    long long field_0;
    char padding_8[1524];
    unsigned int field_5fc;
} st_40e80_3;

typedef struct st_40e80_2 {
    long long field_0;
    long long field_8;
} st_40e80_2;

typedef struct st_40e80_1 {
    char padding_0[56];
    struct st_40e80_2 *field_38;
} st_40e80_1;

typedef struct st_40e80_4 {
    struct st_40e80_5 *field_0;
} st_40e80_4;

typedef struct st_40e80_5 {
    struct st_40e80_4 *field_0;
} st_40e80_5;

typedef struct st_40e80_0 {
    char field_0;
} st_40e80_0;

extern unsigned long long g_e64b48;
extern unsigned long long g_e64b50;
extern unsigned long long g_e64b58;
extern unsigned long long g_e64b60;
extern char g_10002b0;

void sub_40e80(st_40e80_3 *a0, st_40e80_1 *a1, unsigned int a2, unsigned int a3, unsigned int a4, unsigned int a5, char a6, char a7)
{
    unsigned long long v28;  // x28
    unsigned long long v29;  // x27
    unsigned long long v38;  // x30
    unsigned long long v39;  // x8
    char v40;  // x23
    unsigned int *v41;  // x28
    unsigned long v42;  // x11
    unsigned long long v43;  // x24
    unsigned long long v44;  // x0
    unsigned long v45;  // cc_dep1
    unsigned long long v46;  // 4110
    unsigned long long v47;  // 4110
    unsigned long long v30;  // x26
    unsigned int v48;  // w9
    unsigned long long v49;  // x0
    unsigned long long v50;  // x23
    long long v51;  // x1
    unsigned int v52;  // w20
    unsigned long long index;  // x20
    unsigned long long v54;  // x0
    unsigned long long iter;  // x22
    unsigned long long v56;  // x0
    unsigned long long v57;  // x2
    unsigned long long v31;  // x25
    long long v58;  // x1
    unsigned int v59;  // w20
    unsigned long long v32;  // x24
    unsigned long long v33;  // x23
    unsigned long long v34;  // x22
    unsigned long long v35;  // x21
    unsigned long long v36;  // x20
    unsigned long long v37;  // x19
    unsigned long long v0;  // [bp-0xc4]
    unsigned long v1;  // [bp-0xc0]
    unsigned int v2;  // [bp-0xb8]
    unsigned int v3;  // [bp-0xb4]
    unsigned long v4;  // [bp-0xb0]
    unsigned int v5;  // [bp-0xa8]
    unsigned int v6;  // [bp-0xa0]
    unsigned int v7;  // [bp-0x9c]
    st_40e80_0 **v8;  // [bp-0x98], Other Possible Types: char
    st_40e80_0 *v9;  // [bp-0x90]
    st_40e80_0 **v10;  // [bp-0x88], Other Possible Types: st_40e80_5 **, char
    st_40e80_0 *v11;  // [bp-0x80], Other Possible Types: st_40e80_5 **
    unsigned long v12;  // [bp-0x78], Other Possible Types: unsigned long long
    unsigned long long v13;  // [bp-0x70]
    unsigned long v14;  // [bp-0x68]
    unsigned long long v15;  // [bp-0x60]
    unsigned long long v16;  // [bp-0x58]
    unsigned long long v17;  // [bp-0x50]
    unsigned long long v18;  // [bp-0x48]
    unsigned long long v19;  // [bp-0x40]
    unsigned long long v20;  // [bp-0x38]
    unsigned long long v21;  // [bp-0x30]
    unsigned long long v22;  // [bp-0x28]
    unsigned long long v23;  // [bp-0x20]
    unsigned long long v24;  // [bp-0x18]
    char *v25;  // [bp-0x10]
    unsigned long long v26;  // [bp-0x8]
    char v27;  // [bp+0x0], Other Possible Types: unsigned long long

    v15 = v28;
    v16 = v29;
    v17 = v30;
    v18 = v31;
    v19 = v32;
    v20 = v33;
    v21 = v34;
    v22 = v35;
    v23 = v36;
    v24 = v37;
    v25 = &v27;
    v26 = v38;
    v2 = a4;
    v3 = a5;
    v6 = a3;
    v7 = a2;
    v14 = *(long long *)&g_10002b0;
    v9 = &v8;
    v8 = &v9;
    v39 = *(long long *)&a1[1].padding_0[0];
    v0 = v27;
    if (v39 == 1)
    {
        v40 = a6 + 1;
        v13 = 0;
        v12 = 0;
        v41 = &a0->field_5fc;
        v5 = 73;
        v1 = g_e64b48;
        v4 = g_e64b50;
        goto LABEL_4105c;
    }
    else
    {
        v42 = g_e64b50;
        if (v0 >= 0)
        {
            v5 = 75;
            v43 = 1;
        }
        else
        {
            if (v39 == 2)
            {
                v44 = sub_4663c(a0, a1->field_38->field_8);
                v39 = *(long long *)&a1[1].padding_0[0];
                if (v44 & 1)
                {
                    v5 = 75;
                    v43 = 1;
                    v42 = g_e64b50;
                    goto LABEL_40fac;
                }
            }
            v43 = 0;
            v45 = v39;
            if (v39 == 2)
            {
                v42 = v42;
                v46 = arm64g_calculate_condition(4, v45, 2, 0);
                if (!(v46 & 1))
                    goto LABEL_40fa6;
LABEL_40fa5:
                v48 = 74;
            }
            else
            {
                v42 = g_e64b58;
                v47 = arm64g_calculate_condition(4, v45, 2, 0);
                if (v47 & 1)
                    goto LABEL_40fa5;
LABEL_40fa6:
                v48 = 60;
            }
            v5 = v48;
        }
LABEL_40fac:
        v13 = 0;
        v12 = 0;
        v4 = v42;
        if (v39)
        {
            v40 = a6 + 1;
            v41 = &a0->field_5fc;
            if (v43 & 1)
            {
                v49 = sub_42480(a0, a1->field_38->field_0);
                if (!(v49 >> 31 & 1))
                {
                    v50 = (unsigned int)v49 & 0xff;
                    *(unsigned int *)&v12 = v50;
                    if ((unsigned long long)*(long long *)&a1[1].padding_0[0] < 2)
                        goto LABEL_41328;
LABEL_40ff4:
                    index = 1;
                    v1 = g_e64b60;
                    do
                    {
                        v54 = sub_45e80(a0, (&a1->field_38->field_0)[index]);
                        if (v54 >> 31 & 1)
                        {
                            sub_45808(&a1->padding_0[12], "Exceeded constant limit; simplify the code to compile");
                            __debugbreak();
                        }
                    } while ((*(unsigned int *)((char *)&v12 + 4 * index) = v54, index += 1, index < (unsigned long long)*(long long *)&a1[1].padding_0[0]));
                }
                else
                {
                    v50 = v40;
                    *(unsigned int *)&v12 = v50;
                    v51 = a1->field_38->field_0;
                    v11 = &v10;
                    v10 = &v11;
                    v52 = a0->field_5fc;
                    a0->field_5fc = (unsigned int)v50 + 1;
                    sub_47e48(a0, v51, v50, 1);
                    *v41 = v52;
                    if (2 <= (unsigned long long)*(long long *)&a1[1].padding_0[0])
                        goto LABEL_40ff4;
LABEL_41328:
                    v1 = g_e64b60;
                }
            }
            else
            {
                v1 = g_e64b60;
LABEL_4105c:
                iter = 0;
                while (1)
                {
                    v56 = sub_42480(a0, (&a1->field_38->field_0)[iter]);
                    if (!(v56 >> 31 & 1))
                    {
                        *(unsigned int *)((char *)&v12 + 4 * iter) = (unsigned int)v56 & 0xff;
                        iter += 1;
                        if ((unsigned long long)*(long long *)&a1[1].padding_0[0] <= iter)
                            break;
                    }
                    else
                    {
                        v57 = v40 + (unsigned int)iter & 0xff;
                        *(unsigned int *)((char *)&v12 + 4 * iter) = v57;
                        v58 = (&a1->field_38->field_0)[iter];
                        v10 = &v11;
                        v11 = &v10;
                        v59 = a0->field_5fc;
                        a0->field_5fc = (unsigned int)v57 + 1;
                        sub_47e48(a0, v58, v57, 1);
                        *v41 = v59;
                        iter += 1;
                        if (iter >= (unsigned long long)*(long long *)&a1[1].padding_0[0])
                            break;
                    }
                }
                v50 = (unsigned int)v12;
            }
        }
        else
        {
            v50 = 0;
            v1 = g_e64b60;
        }
    }
    sub_2bc4c(a0->field_0);
    sub_2ad10(a0->field_0, v5, a7, (unsigned int)v50 & 0xff, 0);
    goto *((void *)(v4));
}
