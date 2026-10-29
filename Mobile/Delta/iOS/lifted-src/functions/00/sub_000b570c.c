/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb570c..0xb5aa0 (916 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b570c_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    char padding_2c[68];
    struct st_b570c_2 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[120];
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
} st_b570c_1;

typedef struct st_b570c_2 {
    unsigned int field_0;
} st_b570c_2;

typedef struct st_b570c_0 {
    char field_0;
} st_b570c_0;

extern unsigned long long g_e6c770;
extern unsigned long long g_e6c7a0;

long long sub_b570c(st_b570c_1 *a0, void* a1, void* a2, unsigned int a3, unsigned long long a4, unsigned int a5)
{
    unsigned long long v29;  // x28
    unsigned long long v30;  // x27
    unsigned long long v39;  // x30
    void* v40;  // x25
    void* v41;  // x22
    unsigned long v42;  // x10
    unsigned long long v43;  // x11
    unsigned long long idx;  // x9
    unsigned int v45;  // w10
    unsigned int v46;  // w14
    unsigned long v47;  // x28
    unsigned int v48;  // w16
    unsigned long long v31;  // x26
    unsigned long v49;  // cc_dep1
    unsigned long v50;  // cc_dep2
    unsigned int v51;  // w11
    void* v52;  // x1
    unsigned long v53;  // x17
    unsigned int v54;  // w12
    unsigned int v55;  // w11
    unsigned long long v56;  // 4112
    unsigned long long v57;  // 4108
    unsigned long long v58;  // 4112
    unsigned long long v32;  // x25
    unsigned long long v59;  // 4108
    unsigned long v60;  // x23
    unsigned long long v61;  // x20
    unsigned long v62;  // x21
    char *v63;  // x22
    unsigned long long v64;  // x8
    char *v65;  // x20
    unsigned long v66;  // cc_dep1
    unsigned long long v67;  // 4108
    unsigned long long v68;  // 4108
    unsigned long long v33;  // x24
    void* v69;  // x10
    unsigned long long v70;  // x9
    unsigned long long v34;  // x23
    unsigned long long v35;  // x22
    unsigned long long v36;  // x21
    unsigned long long v37;  // x20
    unsigned long long v38;  // x19
    unsigned int v0;  // [bp-0xd4]
    unsigned long v1;  // [bp-0xd0]
    void* v2;  // [bp-0xc8]
    void* v3;  // [bp-0xc0]
    unsigned long v4;  // [bp-0xb8]
    char *v5;  // [bp-0xb0], Other Possible Types: unsigned int *, unsigned long long
    char *v6;  // [bp-0xa8], Other Possible Types: void*, unsigned long long
    unsigned int v7;  // [bp-0xa0]
    unsigned int v8;  // [bp-0x9c]
    unsigned long v9;  // [bp-0x98]
    unsigned int v10;  // [bp-0x90]
    unsigned long v11;  // [bp-0x88]
    unsigned long v12;  // [bp-0x80]
    st_b570c_0 **v13;  // [bp-0x78], Other Possible Types: char
    st_b570c_0 *v14;  // [bp-0x70]
    char v15;  // [bp-0x64]
    unsigned long long v16;  // [bp-0x60]
    unsigned long long v17;  // [bp-0x58]
    unsigned long long v18;  // [bp-0x50]
    unsigned long long v19;  // [bp-0x48]
    unsigned long long v20;  // [bp-0x40]
    unsigned long long v21;  // [bp-0x38]
    unsigned long long v22;  // [bp-0x30]
    unsigned long long v23;  // [bp-0x28]
    unsigned long long v24;  // [bp-0x20]
    unsigned long long v25;  // [bp-0x18]
    char *v26;  // [bp-0x10]
    unsigned long long v27;  // [bp-0x8]
    char v28;  // [bp+0x0]

    v16 = v29;
    v17 = v30;
    v18 = v31;
    v19 = v32;
    v20 = v33;
    v21 = v34;
    v22 = v35;
    v23 = v36;
    v24 = v37;
    v25 = v38;
    v26 = &v28;
    v27 = v39;
    v40 = a2;
    v41 = a1;
    v14 = &v13;
    v13 = &v14;
    if (6 >= a4)
    {
        if (a4 != 5)
        {
            if (a4 != 6)
                goto LABEL_b5794;
            v42 = *(long long *)v41;
            v43 = 0xbf9b0000;
        }
        else
        {
            v42 = *(long long *)v41;
            v43 = 0xbb000000;
        }
    }
    else
    {
        if (a4 == 7)
        {
            v42 = *(long long *)v41;
            v43 = 0xbfa56300;
        }
        else if (a4 == 8)
        {
            v42 = *(long long *)v41;
            v43 = 3081069667;
        }
        else
        {
LABEL_b5794:
            idx = 2654435761 * *(int *)v41 >> ((char)-a0->field_108 & 31);
            goto LABEL_b57dc;
        }
    }
    idx = ((v43 & 0xffff0000ffffffff | 0xbcdc00000000) & 0xffffffffffff | 14923521790222270464) * v42 >> ((char)-a0->field_108 & 63);
LABEL_b57dc:
    v45 = 0xffffffff << ((char)(a0->field_104 - 1) & 31);
    v46 = ~v45;
    v47 = *(int *)&a0->field_70[idx];
    v1 = a0->field_10;
    v11 = a0->field_8;
    v48 = (unsigned int)(v41 - a0->field_8);
    v49 = v48;
    v50 = v46;
    if (v48 < v46)
        v51 = 0;
    else
        v51 = v48 - v46;
    v7 = v46;
    v8 = v51;
    v9 = a0->field_80;
    v52 = a0->field_80 + (v48 & ~v45) * 2 * 4;
    v53 = a0->field_18;
    v54 = a0->field_1c;
    v55 = 1 << ((char)a0->field_100 & 31);
    if (v55 < a3 - a0->field_1c)
    {
        v56 = arm64g_calculate_condition(131, v49, v50, 0);
        v57 = arm64g_calculate_condition(3, (v56 & 1 ? a0->field_28 : 0), 0, 0);
        if (!(v57 & 1))
            goto LABEL_b584a;
LABEL_b5849:
        v54 = a3 - v55;
    }
    else
    {
        v58 = arm64g_calculate_condition(131, v49, v50, 0);
        v59 = arm64g_calculate_condition(0, (v58 & 1 ? a0->field_28 : 0), 0, 0);
        if (v59 & 1)
            goto LABEL_b5849;
LABEL_b584a:
    }
    v60 = v48 + 9;
    *(unsigned int *)&a0->field_70[idx] = v48;
    v10 = v54;
    if (v54 > (unsigned int)v47)
    {
        *(unsigned long long *)v52 = 0;
        if ((unsigned int)(v60 - v48) - 8 >= 0)
            return (unsigned int)(v60 - v48) - 8;
        return 0;
    }
    v0 = v48;
    v6 = v52;
    v4 = v53;
    v5 = v52 + 4;
    v2 = v41;
    v3 = v40;
    v61 = v47 & 0xffffffff;
    if (a5)
    {
        v12 = 0;
        v62 = v60;
        if (v4 > v61)
        {
            v63 = v1 + v61;
            v64 = sub_84f30(v2, v63, v3, v1 + v4, v11 + v4);
            if (v64 + v61 < v4)
                v65 = v63;
            else
                v65 = v11 + v61;
            v41 = v2;
            v40 = v3;
            v60 = v62;
            goto LABEL_b5948;
        }
        else
        {
            v60 = v62;
        }
    }
    v65 = v11 + v61;
    v64 = sub_7cdfc(v41, v65, v40);
LABEL_b5948:
    v66 = v64;
    if (v64 <= 8)
    {
        v67 = arm64g_calculate_condition(148, v66, 8, 0);
        if (!(v67 & 1))
            goto LABEL_b5962;
LABEL_b5961:
    }
    else
    {
        v68 = arm64g_calculate_condition(148, v66, 8, 0);
        if (v68 & 1)
            goto LABEL_b5961;
LABEL_b5962:
    }
    v69 = v41 + v64;
    if (v69 != v40)
    {
        v70 = v9 + ((unsigned int)v47 & v7) * 2 * 4;
        if (*(char *)v69 > v65[v64])
        {
            *(unsigned int *)v6 = v47;
            if ((unsigned int)v47 > v8)
            {
                v6 = v70 + 4;
            }
            else
            {
                v6 = &v15;
                goto *((void *)(g_e6c770));
            }
        }
        else
        {
            *v5 = v47;
            if ((unsigned int)v47 > v8)
            {
                v5 = v70;
            }
            else
            {
                v5 = &v15;
                goto *((void *)(g_e6c770));
            }
        }
        goto *((void *)(g_e6c7a0));
    }
    else
    {
        goto *((void *)(g_e6c770));
    }
}
