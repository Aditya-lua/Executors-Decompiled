/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadb9c..0xae06c (1232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adb9c_2 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    char padding_1c[12];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_adb9c_3 *field_70;
    char padding_78[8];
    struct st_adb9c_1 *field_80;
    char padding_88[120];
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
} st_adb9c_2;

typedef struct st_adb9c_3 {
    unsigned int field_0;
} st_adb9c_3;

typedef struct st_adb9c_1 {
    char padding_0[4];
    unsigned int field_4;
} st_adb9c_1;

typedef struct st_adb9c_0 {
    char field_0;
} st_adb9c_0;

extern unsigned long long g_e6c180;
extern unsigned long long g_e6c1f8;

unsigned long long sub_adb9c(st_adb9c_2 *a0, void* a1, long long a2, void* a3, int a4, unsigned int a5)
{
    unsigned int *v17;  // x19
    unsigned long v18;  // cc_dep1
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4108
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4108
    st_adb9c_1 *v31;  // x28
    unsigned int v32;  // w22
    unsigned long long v33;  // w8
    unsigned long v34;  // x26
    unsigned long long v35;  // x25
    unsigned long long v36;  // x9
    unsigned long v19;  // cc_dep2
    unsigned long v37;  // cc_dep1
    unsigned long v38;  // cc_dep2
    unsigned long long v39;  // x8
    unsigned long long v40;  // x27
    unsigned long long v41;  // x20
    void* v42;  // x9
    unsigned long long v43;  // 4112
    unsigned long long v44;  // 4102
    unsigned long long v45;  // 4112
    unsigned long long v46;  // 4102
    unsigned long v20;  // x9
    unsigned long v47;  // x20
    st_adb9c_2 *v48;  // x9
    unsigned long v49;  // x9
    unsigned int v50;  // w10
    unsigned long v51;  // x21
    void* v52;  // x27
    unsigned long long v53;  // x20
    unsigned long v54;  // x9
    unsigned long long v55;  // x8
    char *v56;  // x20
    unsigned long long v21;  // x10
    unsigned long v57;  // x10
    unsigned int v58;  // w10
    unsigned int v59;  // w9
    unsigned int v60;  // w11
    unsigned int v61;  // w11
    unsigned int v62;  // w12
    unsigned int v63;  // w22
    unsigned long long v64;  // x9
    unsigned long long v65;  // x4
    unsigned long long idx;  // x23
    st_adb9c_2 *v23;  // x15
    unsigned int v24;  // w14
    unsigned long long v25;  // w9
    unsigned int v26;  // w8
    int v0;  // [bp-0xfc]
    unsigned long v1;  // [bp-0xf8]
    char *v2;  // [bp-0xf0]
    unsigned long v3;  // [bp-0xe8]
    unsigned int v4;  // [bp-0xdc]
    unsigned long long v5;  // [bp-0xc4]
    char *v6;  // [bp-0xc0], Other Possible Types: unsigned long, unsigned long long
    char *v7;  // [bp-0xb8], Other Possible Types: unsigned long, unsigned long long
    unsigned int v8;  // [bp-0xac]
    unsigned long v9;  // [bp-0xa8]
    unsigned long long v10;  // [bp-0xa0]
    unsigned int v11;  // [bp-0x9c]
    st_adb9c_0 **v12;  // [bp-0x80], Other Possible Types: char
    st_adb9c_0 *v13;  // [bp-0x78]
    char v14;  // [bp-0x6c]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v13 = &v12;
    v12 = &v13;
    v17 = a0->field_70;
    v0 = a4;
    if (6 >= a4)
    {
        v18 = a4;
        v19 = 5;
        if (a4 != 5)
        {
            v18 = a4;
            v19 = 6;
            if (a4 != 6)
                goto LABEL_adc2c;
            v20 = *(long long *)a1;
            v21 = 0xbf9b0000;
        }
        else
        {
            v20 = *(long long *)a1;
            v21 = 0xbb000000;
        }
    }
    else
    {
        v18 = a4;
        v19 = 7;
        if (a4 != 7)
        {
            v18 = a4;
            v19 = 8;
            if (a4 == 8)
            {
                v20 = *(long long *)a1;
                v21 = 3081069667;
            }
            else
            {
LABEL_adc2c:
                idx = 2654435761 * *(int *)a1 >> ((char)-a0->field_108 & 31);
                goto LABEL_adc74;
            }
        }
        else
        {
            v20 = *(long long *)a1;
            v21 = 0xbfa56300;
        }
    }
    idx = ((v21 & 0xffff0000ffffffff | 0xbcdc00000000) & 0xffffffffffff | 14923521790222270464) * v20 >> ((char)-a0->field_108 & 63);
LABEL_adc74:
    v23 = a0;
    v9 = v23->field_8;
    v24 = (unsigned int)(a1 - v23->field_8);
    v25 = *(int *)&v23->padding_1c[0];
    v26 = 1 << ((char)v23->field_100 & 31);
    if (v26 < v24 - *(int *)&v23->padding_1c[0])
    {
        v27 = arm64g_calculate_condition(131, v18, v19, 0);
        v28 = arm64g_calculate_condition(3, (v27 & 1 ? v23->field_28 : 0), 0, 0);
        if (!(v28 & 1))
            goto LABEL_adcae;
LABEL_adcad:
        v25 = v24 - v26;
    }
    else
    {
        v29 = arm64g_calculate_condition(131, v18, v19, 0);
        v30 = arm64g_calculate_condition(0, (v29 & 1 ? v23->field_28 : 0), 0, 0);
        if (v30 & 1)
            goto LABEL_adcad;
LABEL_adcae:
    }
    v31 = v23->field_80;
    v32 = ~(0xffffffff << ((char)(v23->field_104 - 1) & 31));
    v4 = v24;
    if (v24 < v32)
        v33 = 0;
    else
        v33 = v24 - v32;
    v10 = v25;
    v5 = v33;
    if (v25 < v33)
        v34 = v33;
    else
        v34 = v25;
    v35 = 1 << ((char)v23->field_10c & 31);
    v36 = v17[idx];
    v37 = v36 & 0xffffffff;
    v38 = v34 & 0xffffffff;
    if ((unsigned int)v36 > (unsigned int)v34)
    {
        v39 = 0;
        v40 = v35;
        while (1)
        {
            v41 = v36;
            v42 = &v31[(unsigned int)v36 & v32];
            if ((int)v42[4] == 1)
            {
                v43 = arm64g_calculate_condition(3, v37, v38, 0);
                v44 = arm64g_calculate_condition(0x33, (v43 & 1 ? v40 & 0xffffffff : 0), (v43 & 1 ? 2 : 0), 0);
                if (v44 & 1)
                    goto LABEL_add3c;
            }
            else
            {
                v45 = arm64g_calculate_condition(3, v37, v38, 0);
                v46 = arm64g_calculate_condition(48, (v45 & 1 ? v40 & 0xffffffff : 0), (v45 & 1 ? 2 : 0), 0);
                if (v46 & 1)
                {
LABEL_add3c:
                    if ((int)v42[4] == 1)
                        *(unsigned long long *)v42 = 0;
                    v41 = v39;
                    if (!(unsigned int)v39)
                        break;
LABEL_add50:
                    do
                    {
                        v47 = v31[(unsigned int)v41 & v32].field_4;
                        sub_acd30(a0, v41, a2, v40, v34, a5);
                        v40 = (unsigned int)v40 + 1;
                        v41 = v47;
                    } while ((unsigned int)v41);
                }
            }
            *(unsigned int *)&v42[4] = v39;
            v40 = (unsigned int)v40 - 1;
            v36 = *(int *)v42;
            v37 = v36 & 0xffffffff;
            v38 = v34 & 0xffffffff;
            v39 = v41;
            if ((unsigned int)v34 >= (unsigned int)v36)
                goto LABEL_add50;
        }
    }
    v48 = a0;
    v1 = v48->field_10;
    v49 = v48->field_18;
    v50 = v4;
    v7 = &v31[v32 & v50];
    v6 = v7 + 4;
    v11 = v50 + 9;
    v51 = v17[idx];
    v17[idx] = v50;
    if ((unsigned int)v51 > v10)
    {
        v3 = v49;
        v52 = a1;
        v8 = v32;
        v53 = v51 & 0xffffffff;
        if (a5 == 1)
        {
            if (v3 > v53)
            {
                v54 = v1;
                v2 = v54 + v53;
                v55 = sub_84f30(a1, v2, a2, v54 + v3, v9 + v3);
                if (v55 + v53 < v3)
                    v56 = v2;
                else
                    v56 = v9 + v53;
                v52 = a1;
                if (v55 <= 0)
                    goto LABEL_adf24;
LABEL_ade6c:
                v57 = v11;
                if (v55 <= v57 - v51)
                    v58 = v57;
                else
                    v58 = (unsigned int)v51 + (unsigned int)v55;
                v11 = v58;
                v59 = v4 - v51;
                v60 = v59 + 1;
                if (!(v60 * 0x100000000))
                    v61 = 32;
                else
                    v61 = Clz(v60 * 0x100000000);
                if (!(*(int *)a3 * 0x100000000))
                    v62 = 32;
                else
                    v62 = Clz(*(int *)a3 * 0x100000000);
                if ((int)((unsigned int)(v55 - 0) * 4) > (int)(v62 - v61))
                    *(unsigned long long *)a3 = v59 + 3;
                v63 = v8;
                if (v52 + v55 == a2)
                    goto *((void *)(g_e6c180));
            }
            else
            {
LABEL_adefc:
                v56 = v9 + v53;
                v55 = sub_7cdfc(v52, v56, a2);
                if (0 < v55)
                    goto LABEL_ade6c;
LABEL_adf24:
                v63 = v8;
            }
            v64 = &v31[(unsigned int)v51 & v63];
            if (*((char *)v52 + v55) > v56[v55])
            {
                *(unsigned int *)v7 = v51;
                if ((unsigned int)v51 > v5)
                {
                    v7 = v64 + 4;
                }
                else
                {
                    v7 = &v14;
                    goto *((void *)(g_e6c180));
                }
            }
            else
            {
                *(unsigned int *)v6 = v51;
                if ((unsigned int)v51 > v5)
                {
                    v6 = v64;
                }
                else
                {
                    v6 = &v14;
                    goto *((void *)(g_e6c180));
                }
            }
            goto *((void *)(g_e6c1f8));
        }
        else
        {
            goto LABEL_adefc;
        }
    }
    else
    {
        v65 = 0;
        *(unsigned int *)v6 = 0;
        *(unsigned int *)v7 = 0;
        if (a5 == 2 && (unsigned int)v35)
            v65 = sub_98fc0(a0, a1, a2, a3);
        a0->field_2c = v11 - 8;
        return v65;
    }
}
