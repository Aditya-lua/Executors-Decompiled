/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x83548..0x83b18 (1488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_83548_0 {
    int field_0;
    unsigned int field_4;
} st_83548_0;

typedef struct st_83548_1 {
    unsigned int field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_83548_1;

typedef struct st_83548_2 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_83548_2;

extern char g_cc0118;
extern char g_cc013c;
extern st_83548_2 g_cc0174;

unsigned long long sub_83548(long long a0, long long a1, unsigned short *a2, char *a3, unsigned short *a4, char *a5, unsigned short *a6, char *a7, unsigned long a8, unsigned long long a9, unsigned long long a10)
{
    char *v14;  // x22
    char *v15;  // x26
    unsigned long v24;  // x8
    unsigned int v25;  // w8
    unsigned long long v26;  // w13
    unsigned long v27;  // x23
    unsigned long long v28;  // x12
    st_83548_0 *v29;  // x12
    unsigned long v30;  // x12
    unsigned long v31;  // x12
    unsigned long long v32;  // w14
    unsigned long v33;  // x24
    unsigned long long v16;  // 4106
    unsigned long long v34;  // x11
    st_83548_0 *v35;  // x11
    unsigned long v36;  // x11
    unsigned long v37;  // x19
    st_83548_1 *v38;  // x20
    unsigned long v39;  // x10
    unsigned int v40;  // w12
    unsigned int v41;  // w10
    unsigned long v42;  // x13
    unsigned long long v43;  // x9
    unsigned long long v17;  // x21
    unsigned int v44;  // w10
    unsigned long long v45;  // w21
    unsigned long long v46;  // x27
    unsigned int *v47;  // x25
    unsigned long v48;  // x8
    unsigned int v49;  // w21
    unsigned long v50;  // x9
    unsigned int v51;  // w22
    unsigned int v52;  // w20
    st_83548_0 *v53;  // x10
    unsigned long long v18;  // x10
    unsigned long v54;  // x15
    unsigned long long v55;  // x10
    unsigned int v56;  // w13
    unsigned int v57;  // w10
    st_83548_0 *v58;  // x9
    unsigned long v59;  // x14
    unsigned long long v60;  // x9
    unsigned int v61;  // w10
    st_83548_0 *v62;  // x8
    unsigned long long v63;  // x14
    unsigned long v19;  // x9
    unsigned long v64;  // x8
    unsigned int v65;  // w9
    unsigned int v66;  // w24
    unsigned int v67;  // w9
    unsigned int v68;  // w9
    unsigned int v69;  // w8
    unsigned long long v70;  // w20
    unsigned int v71;  // w9
    unsigned int v72;  // w9
    unsigned long long v73;  // w11
    unsigned long long v20;  // w12
    unsigned int v74;  // w9
    unsigned long long v75;  // w11
    unsigned int v76;  // w9
    unsigned long long v77;  // w11
    unsigned int v78;  // w9
    unsigned long long v79;  // x0
    unsigned long v21;  // x19
    unsigned long long v22;  // x8
    st_83548_0 *v23;  // x8
    unsigned long long v0;  // [bp-0xec]
    unsigned long long v1;  // [bp-0xe8]
    unsigned long long v2;  // [bp-0xe4]
    unsigned long v3;  // [bp-0xd8]
    unsigned long long v4;  // [bp-0xd0]
    unsigned long long v5;  // [bp-0xc8]
    unsigned long long v6;  // [bp-0xb8]
    unsigned long v7;  // [bp-0xb0]
    unsigned long long i;  // [bp-0xa8]
    unsigned long v9;  // [bp-0xa0]
    unsigned long v10;  // [bp-0x98]
    unsigned long long v11;  // [bp-0x90], Other Possible Types: unsigned long
    unsigned int v12;  // [bp-0x88]
    char *v13;  // [bp-0x10]

    v13 = &a8;
    v14 = a7;
    v15 = a5;
    v16 = arm64g_calculate_condition(130, sub_77f20(&v11, a0, a1), 120, 0);
    if (v16 & 1)
        return 0xffffffffffffffba;
    v17 = a9;
    v18 = v17 - 1;
    v19 = a3[v18];
    v20 = *a2;
    v21 = a2 + 2;
    v22 = 1 << ((char)(v20 - 1) & 31);
    v2 = v20;
    if (!v2)
        v22 = 1;
    v6 = v21 + v22 * 4;
    v7 = v21;
    v23 = v6 + v19 * 8;
    v24 = v23->field_4;
    v10 = *(short *)(v21 + (((unsigned int)v24 + 0x8000 & 0xffff0000) - v24 >> ((char)((unsigned int)v24 + 0x8000 >> 16) & 63)) * 2 + v23->field_0 * 2);
    v25 = v15[v18];
    v26 = *a4;
    v27 = a4 + 2;
    v28 = 1 << ((char)(v26 - 1) & 31);
    v1 = v26;
    if (!v1)
        v28 = 1;
    v5 = v27 + v28 * 4;
    v29 = v5 + (v25 & 0xff) * 8;
    v30 = v29->field_4;
    v9 = *(short *)(v27 + (((unsigned int)v30 + 0x8000 & 0xffff0000) - v30 >> ((char)((unsigned int)v30 + 0x8000 >> 16) & 63)) * 2 + v29->field_0 * 2);
    v31 = v14[v18];
    v32 = *a6;
    v33 = a6 + 2;
    v34 = 1 << ((char)(v32 - 1) & 31);
    v0 = v32;
    if (!v0)
        v34 = 1;
    v4 = v33 + v34 * 4;
    v35 = v4 + v31 * 8;
    v36 = v35->field_4;
    v37 = *(short *)(v33 + (((unsigned int)v36 + 0x8000 & 0xffff0000) - v36 >> ((char)((unsigned int)v36 + 0x8000 >> 16) & 63)) * 2 + v35->field_0 * 2);
    v38 = a8 + v18 * 8;
    v39 = (&g_cc0118)[v31];
    v40 = v12;
    v41 = v40 + (unsigned int)v39;
    v42 = (&g_cc013c)[v19];
    v43 = ((&g_cc0174.field_0)[v39] & v38->field_4) << ((char)v40 & 63) | v11 | ((&g_cc0174.field_0)[v42] & v38->field_6) << ((char)v41 & 63);
    v44 = v41 + (unsigned int)v42;
    i = v17;
    if (a10)
    {
        if (56 > v25)
        {
            v45 = 0;
        }
        else
        {
            v45 = v25 - 56;
            if (v25 != 56)
            {
                v43 |= ((&g_cc0174.field_0)[v45] & v38->field_0) << ((char)v44 & 63);
                v44 += v45;
                sub_783b4(&v43);
                v25 = 56;
            }
        }
        v11 = ((&g_cc0174.field_0)[v25] & v38->field_0 >> ((char)v45 & 31)) << ((char)v44 & 63) | v43;
        v17 = i;
        v12 = v25 + v44;
        sub_783b4(&v11);
        v46 = v17 - 2;
        if (v17 >= 2)
            goto LABEL_838a0;
LABEL_83750:
    }
    else
    {
        v11 = ((&g_cc0174.field_0)[v25 & 0xff] & v38->field_0) << ((char)v44 & 63) | v43;
        v12 = v44 + v25;
        sub_783b4(&v11);
        v46 = v17 - 2;
        if (2 > v17)
            goto LABEL_83750;
LABEL_838a0:
        v3 = v27;
        v47 = a8 + v17 * 8 - 16;
        do
        {
            v48 = v14[v46];
            v49 = v15[v46];
            v50 = a3[v46];
            v51 = (&g_cc0118)[v48];
            v52 = (&g_cc013c)[v50];
            v53 = v5 + (v49 & 0xff) * 8;
            v54 = v9;
            v55 = v54 + v53->field_4 >> 16;
            v56 = v12;
            v9 = *(short *)(v3 + (v54 >> ((char)v55 & 63)) * 2 + v53->field_0 * 2);
            v57 = v56 + (unsigned int)v55;
            v58 = v6 + v50 * 8;
            v59 = v10;
            v60 = v59 + v58->field_4 >> 16;
            v61 = v57 + (unsigned int)v60;
            v10 = *(short *)(v7 + (v59 >> ((char)v60 & 63)) * 2 + v58->field_0 * 2);
            v62 = v4 + v48 * 8;
            v63 = v37 + v62->field_4 >> 16;
            v64 = (v54 & (&g_cc0174.field_0)[v55]) << ((char)v56 & 63) | v11 | (v59 & (&g_cc0174.field_0)[v60]) << ((char)v57 & 63) | (v37 & (&g_cc0174.field_0)[v63]) << ((char)v61 & 63);
            v11 = v64;
            v65 = v61 + (unsigned int)v63;
            v12 = v65;
            v37 = *(short *)(v33 + (v37 >> ((char)v63 & 63)) * 2 + v62->field_0 * 2);
            v66 = v51 + v49 + v52;
            if (v66 >= 31)
            {
                sub_783b4(&v11);
                v65 = v12;
                v64 = v11;
            }
            v67 = v65 + v51;
            v11 = ((&g_cc0174.field_0)[v51 & 0xff] & (unsigned short)v47[1]) << ((char)v65 & 63) | ((&g_cc0174.field_0)[v52 & 0xff] & *(short *)((char *)&v47[1] + 2)) << ((char)v67 & 63) | v64;
            v12 = v67 + v52;
            if (v66 >= 57)
                sub_783b4(&v11);
            if (!a10)
            {
                v68 = v12;
                v11 |= ((&g_cc0174.field_0)[v49 & 0xff] & *v47) << ((char)v68 & 63);
                v69 = v68 + v49;
            }
            else
            {
                if (56 > v49)
                {
                    v70 = 0;
                }
                else
                {
                    v70 = v49 - 56;
                    if (v49 != 56)
                    {
                        v71 = v12;
                        v11 |= ((&g_cc0174.field_0)[v70] & *v47) << ((char)v71 & 63);
                        v12 = v71 + v70;
                        sub_783b4(&v11);
                        v49 = 56;
                    }
                }
                v72 = v12;
                v11 |= ((&g_cc0174.field_0)[v49] & *v47 >> ((char)v70 & 31)) << ((char)v72 & 63);
                v69 = v72 + v49;
            }
            v12 = v69;
            sub_783b4(&v11);
            v46 -= 1;
            v47 = (char *)v47 - 8;
        } while (i > v46);
    }
    v73 = v2;
    v74 = v12;
    v11 |= (v10 & (&g_cc0174.field_0)[v73]) << ((char)v74 & 63);
    v12 = v74 + v73;
    sub_783b4(&v11);
    v75 = v1;
    v76 = v12;
    v11 |= (v9 & (&g_cc0174.field_0)[v75]) << ((char)v76 & 63);
    v12 = v76 + v75;
    sub_783b4(&v11);
    v77 = v0;
    v78 = v12;
    v11 |= (v37 & (&g_cc0174.field_0)[v77]) << ((char)v78 & 63);
    v12 = v78 + v77;
    sub_783b4(&v11);
    v79 = sub_78620(&v11);
    if (v79)
        return v79;
    return 0xffffffffffffffba;
}
