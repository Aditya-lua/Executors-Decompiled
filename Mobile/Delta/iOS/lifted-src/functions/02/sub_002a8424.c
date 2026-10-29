/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a8424..0x2a8d70 (2380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a8424_1 {
    char padding_0[20];
    unsigned int field_14;
    char padding_18[32];
    long long field_38;
    char padding_40[16];
    char field_50;
    char padding_51[63];
    unsigned long long field_90;
} st_2a8424_1;

typedef struct st_2a8424_0 {
    char field_0;
} st_2a8424_0;

extern unsigned long long g_e7bd48;
extern char g_10002b0;

void sub_2a8424(st_2a8424_1 *a0)
{
    unsigned long long v19;  // x28
    unsigned long long v20;  // x27
    unsigned long long v29;  // x30
    unsigned long long *v30;  // x20
    unsigned long long v31;  // w0
    unsigned long long v32;  // x8
    unsigned long long v33;  // 4117
    unsigned long v34;  // cc_dep1
    unsigned int v35;  // w9
    unsigned int v36;  // w10
    unsigned long v37;  // 4112
    unsigned long v38;  // cc_op
    unsigned long long v21;  // x26
    unsigned long v39;  // cc_dep1
    unsigned long v40;  // cc_dep2
    unsigned long long v41;  // 4113
    unsigned long v42;  // 4112
    unsigned long long v43;  // 4113
    unsigned long v44;  // 4112
    unsigned long v45;  // cc_op
    unsigned long v46;  // cc_dep1
    unsigned long v47;  // cc_dep2
    unsigned long long v48;  // 4113
    unsigned long long v22;  // x25
    unsigned long v49;  // 4112
    unsigned long long v50;  // 4113
    unsigned long v51;  // 4112
    unsigned long v52;  // cc_op
    unsigned long v53;  // cc_dep1
    unsigned long v54;  // cc_dep2
    unsigned long long v55;  // 4113
    unsigned long v56;  // 4112
    unsigned long long v57;  // 4113
    unsigned long v58;  // 4112
    unsigned long long v23;  // x24
    unsigned long v59;  // cc_op
    unsigned long v60;  // cc_dep1
    unsigned long v61;  // cc_dep2
    unsigned int v62;  // w10
    unsigned long long v63;  // 4119
    unsigned long v64;  // 4112
    unsigned long long v65;  // 4119
    unsigned long v66;  // 4112
    unsigned long v67;  // cc_op
    unsigned long v68;  // cc_dep1
    unsigned long long v24;  // x23
    unsigned long v69;  // cc_dep2
    unsigned long long v70;  // 4113
    unsigned long v71;  // 4112
    unsigned long long v72;  // 4113
    unsigned long v73;  // 4112
    unsigned long v74;  // cc_op
    unsigned long v75;  // cc_dep1
    unsigned long v76;  // cc_dep2
    unsigned long long v77;  // 4112
    unsigned long v78;  // 4112
    unsigned long long v25;  // x22
    unsigned long long v79;  // 4112
    unsigned long v80;  // 4112
    unsigned long v81;  // cc_op
    unsigned long v82;  // cc_dep1
    unsigned long v83;  // cc_dep2
    unsigned long long v84;  // 4112
    unsigned long v85;  // 4112
    unsigned long long v86;  // 4112
    unsigned long v87;  // 4112
    unsigned long v88;  // cc_op
    unsigned long long v26;  // x21
    unsigned long v89;  // cc_dep1
    unsigned long v90;  // cc_dep2
    unsigned long long v91;  // 4106
    unsigned long v92;  // 4112
    unsigned long long v93;  // 4106
    unsigned int v94;  // w9
    unsigned long v95;  // 4112
    unsigned long v96;  // cc_op
    unsigned long v97;  // cc_dep1
    unsigned long v98;  // cc_dep2
    unsigned long long v27;  // x20
    unsigned long long v99;  // 4112
    unsigned long v100;  // 4112
    unsigned long long v101;  // 4112
    unsigned long long v102;  // 4112
    unsigned long long v103;  // 4106
    unsigned long long v104;  // 4112
    unsigned long long v105;  // 4106
    unsigned long v106;  // cc_dep1
    unsigned long v107;  // 4112
    unsigned long v108;  // cc_op
    unsigned long long v28;  // x19
    unsigned long v109;  // cc_dep1
    unsigned long v110;  // cc_dep2
    unsigned long long v111;  // 4112
    unsigned long v112;  // 4112
    unsigned long long v113;  // 4112
    unsigned long long v114;  // 4112
    unsigned long long v115;  // 4104
    unsigned long long v116;  // 4112
    unsigned long long v117;  // 4104
    st_2a8424_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_2a8424_0 *v1;  // [bp-0x98]
    st_2a8424_0 **v2;  // [bp-0x90], Other Possible Types: char
    char v3;  // [bp-0x81]
    st_2a8424_0 *v4;  // [bp-0x80]
    unsigned long v5;  // [bp-0x68]
    unsigned long long v6;  // [bp-0x60]
    unsigned long long v7;  // [bp-0x58]
    unsigned long long v8;  // [bp-0x50]
    unsigned long long v9;  // [bp-0x48]
    unsigned long long v10;  // [bp-0x40]
    unsigned long long v11;  // [bp-0x38]
    unsigned long long v12;  // [bp-0x30]
    unsigned long long v13;  // [bp-0x28]
    unsigned long long v14;  // [bp-0x20]
    unsigned long long v15;  // [bp-0x18]
    char *v16;  // [bp-0x10]
    unsigned long long v17;  // [bp-0x8]
    char v18;  // [bp+0x0]

    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = &v18;
    v17 = v29;
    v5 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v4 = &v2;
    v2 = &v4;
    sub_30d84(&a0->field_50);
    v30 = &a0->field_38;
    sub_c84c(v30, a0->field_38);
    v30[11] = 0xffffffffffffffff;
    v3 = *(int *)((char *)v30 - 36);
    sub_30594(v30, &v3);
    v31 = (unsigned int)sub_2aa6a8(a0);
    v32 = 88;
    v33 = arm64g_calculate_condition(1, v31, 1, 0);
    if (v33 & 1)
        v32 = 200;
    if (v31 == 0x22)
        v32 = 384;
    if (v31 == 92)
        v32 = 408;
    if (!v31)
        v32 = 216;
    if (v31 == 1)
        v32 = 208;
    if (v31 == 2)
        v32 = 64;
    if (v31 == 3)
        v32 = 240;
    if (v31 == 4)
        v32 = 424;
    if (v31 == 5)
        v32 = 600;
    if (v31 == 6)
        v32 = 304;
    if (v31 == 7)
        v32 = 552;
    if (v31 == 8)
        v32 = 688;
    if (v31 == 9)
        v32 = 0x100;
    if (v31 == 10)
        v32 = 312;
    if (v31 == 11)
        v32 = 360;
    if (v31 == 12)
        v32 = 440;
    if (v31 == 13)
        v32 = 400;
    if (v31 == 14)
        v32 = 24;
    if (v31 == 15)
        v32 = 624;
    if (v31 == 16)
        v32 = 480;
    if (v31 == 0x11)
        v32 = 696;
    if (v31 == 18)
        v32 = 96;
    if (v31 == 19)
        v32 = 432;
    if (v31 == 20)
        v32 = 192;
    if (v31 == 21)
        v32 = 80;
    if (v31 == 22)
        v32 = 528;
    if (v31 == 23)
        v32 = 16;
    if (v31 == 24)
        v32 = 672;
    if (v31 == 25)
        v32 = 224;
    if (v31 == 26)
        v32 = 472;
    if (v31 == 27)
        v32 = 392;
    if (v31 == 28)
        v32 = 680;
    if (v31 == 29)
        v32 = 296;
    if (v31 == 30)
        v32 = 456;
    v34 = v31;
    if (v31 == 31)
        v32 = 592;
    v35 = v31 & 0xfffffffe;
    v36 = v31 - 39;
    if (v35 != 32)
    {
        v37 = arm64g_calculate_condition(19, v34, 31, 0);
        v38 = 3;
        v39 = (v37 & 1 ? v31 : 0x40000000);
        v40 = (v37 & 1 ? 35 : 0);
        v41 = arm64g_calculate_condition(19, v39, v40, 0);
        if (!(v41 & 1))
            goto LABEL_2a869e;
LABEL_2a869d:
        v44 = arm64g_calculate_condition(v38 | 16, v39, v40, 0);
        v45 = 3;
        v46 = (v44 & 1 ? v35 : 0x40000000);
        v47 = (v44 & 1 ? 36 : 0);
        v48 = arm64g_calculate_condition(19, v46, v47, 0);
        if (!(v48 & 1))
            goto LABEL_2a86a6;
LABEL_2a86a5:
        v51 = arm64g_calculate_condition(v45 | 16, v46, v47, 0);
        v52 = 3;
        v53 = (v51 & 1 ? v31 : 0x40000000);
        v54 = (v51 & 1 ? 38 : 0);
        v55 = arm64g_calculate_condition(19, v53, v54, 0);
        if (!(v55 & 1))
            goto LABEL_2a86ae;
LABEL_2a86ad:
        v58 = arm64g_calculate_condition(v52 | 16, v53, v54, 0);
        v59 = 3;
        v60 = (v58 & 1 ? v36 : 0);
        v61 = (v58 & 1 ? 53 : 0);
        v62 = v31 - 97;
        v63 = arm64g_calculate_condition(35, v60, v61, 0);
        if (!(v63 & 1))
            goto LABEL_2a86ba;
        goto LABEL_2a86b9;
    }
    else
    {
        v42 = arm64g_calculate_condition(19, v34, 31, 0);
        v38 = 0;
        v39 = (v42 & 1 ? v31 : 0x40000000);
        v40 = (v42 & 1 ? 35 : 0);
        v43 = arm64g_calculate_condition(16, v39, v40, 0);
        if (v43 & 1)
            goto LABEL_2a869d;
LABEL_2a869e:
        v49 = arm64g_calculate_condition(v38 | 16, v39, v40, 0);
        v45 = 0;
        v46 = (v49 & 1 ? v35 : 0x40000000);
        v47 = (v49 & 1 ? 36 : 0);
        v50 = arm64g_calculate_condition(16, v46, v47, 0);
        if (v50 & 1)
            goto LABEL_2a86a5;
LABEL_2a86a6:
        v56 = arm64g_calculate_condition(v45 | 16, v46, v47, 0);
        v52 = 0;
        v53 = (v56 & 1 ? v31 : 0x40000000);
        v54 = (v56 & 1 ? 38 : 0);
        v57 = arm64g_calculate_condition(16, v53, v54, 0);
        if (v57 & 1)
            goto LABEL_2a86ad;
LABEL_2a86ae:
        v64 = arm64g_calculate_condition(v52 | 16, v53, v54, 0);
        v59 = 0;
        v60 = (v64 & 1 ? v36 : 0);
        v61 = (v64 & 1 ? 53 : 0);
        v62 = v31 - 97;
        v65 = arm64g_calculate_condition(32, v60, v61, 0);
        if (v65 & 1)
        {
LABEL_2a86b9:
            v66 = arm64g_calculate_condition(v59 | 32, v60, v61, 0);
            v67 = 3;
            v68 = (v66 & 1 ? v31 : 0x40000000);
            v69 = (v66 & 1 ? 93 : 0);
            v70 = arm64g_calculate_condition(19, v68, v69, 0);
            if (!(v70 & 1))
                goto LABEL_2a86c2;
            goto LABEL_2a86c1;
        }
        else
        {
LABEL_2a86ba:
            v71 = arm64g_calculate_condition(v59 | 32, v60, v61, 0);
            v67 = 0;
            v68 = (v71 & 1 ? v31 : 0x40000000);
            v69 = (v71 & 1 ? 93 : 0);
            v72 = arm64g_calculate_condition(16, v68, v69, 0);
            if (v72 & 1)
            {
LABEL_2a86c1:
                v73 = arm64g_calculate_condition(v67 | 16, v68, v69, 0);
                v74 = 3;
                v75 = (v73 & 1 ? v35 : 0x40000000);
                v76 = (v73 & 1 ? 94 : 0);
                v77 = arm64g_calculate_condition(19, v75, v76, 0);
                if (!(v77 & 1))
                    goto LABEL_2a86c6;
                goto LABEL_2a86c5;
            }
            else
            {
LABEL_2a86c2:
                v78 = arm64g_calculate_condition(v67 | 16, v68, v69, 0);
                v74 = 0;
                v75 = (v78 & 1 ? v35 : 0x40000000);
                v76 = (v78 & 1 ? 94 : 0);
                v79 = arm64g_calculate_condition(16, v75, v76, 0);
                if (v79 & 1)
                {
LABEL_2a86c5:
                    v80 = arm64g_calculate_condition(v74 | 16, v75, v76, 0);
                    v81 = 3;
                    v82 = (v80 & 1 ? v31 : 0x40000000);
                    v83 = (v80 & 1 ? 96 : 0);
                    v84 = arm64g_calculate_condition(19, v82, v83, 0);
                    if (!(v84 & 1))
                        goto LABEL_2a86ca;
                    goto LABEL_2a86c9;
                }
                else
                {
LABEL_2a86c6:
                    v85 = arm64g_calculate_condition(v74 | 16, v75, v76, 0);
                    v81 = 0;
                    v82 = (v85 & 1 ? v31 : 0x40000000);
                    v83 = (v85 & 1 ? 96 : 0);
                    v86 = arm64g_calculate_condition(16, v82, v83, 0);
                    if (v86 & 1)
                    {
LABEL_2a86c9:
                        v87 = arm64g_calculate_condition(v81 | 16, v82, v83, 0);
                        v88 = 3;
                        v89 = (v87 & 1 ? v62 : 0);
                        v90 = (v87 & 1 ? 31 : 0);
                        v91 = arm64g_calculate_condition(0x33, v89, v90, 0);
                        if (!(v91 & 1))
                            goto LABEL_2a86d2;
                        goto LABEL_2a86d1;
                    }
                    else
                    {
LABEL_2a86ca:
                        v92 = arm64g_calculate_condition(v81 | 16, v82, v83, 0);
                        v88 = 0;
                        v89 = (v92 & 1 ? v62 : 0);
                        v90 = (v92 & 1 ? 31 : 0);
                        v93 = arm64g_calculate_condition(48, v89, v90, 0);
                        if (v93 & 1)
                        {
LABEL_2a86d1:
                            v32 = 0x200;
                        }
                        else
                        {
LABEL_2a86d2:
                        }
                    }
                }
            }
        }
    }
    v94 = v31 - 197;
    if (v35 != 194)
    {
        v95 = arm64g_calculate_condition(v88 | 16, v89, v90, 0);
        v96 = 3;
        v97 = (v95 & 1 ? v31 : 0x40000000);
        v98 = (v95 & 1 ? 196 : 0);
        v99 = arm64g_calculate_condition(19, v97, v98, 0);
        if (!(v99 & 1))
            goto LABEL_2a86e6;
LABEL_2a86e5:
        v102 = arm64g_calculate_condition(v96 | 16, v97, v98, 0);
        v103 = arm64g_calculate_condition(0x33, (v102 & 1 ? v94 : 0), (v102 & 1 ? 27 : 0), 0);
        if (!(v103 & 1))
            goto LABEL_2a86ee;
LABEL_2a86ed:
        v32 = 152;
    }
    else
    {
        v100 = arm64g_calculate_condition(v88 | 16, v89, v90, 0);
        v96 = 0;
        v97 = (v100 & 1 ? v31 : 0x40000000);
        v98 = (v100 & 1 ? 196 : 0);
        v101 = arm64g_calculate_condition(16, v97, v98, 0);
        if (v101 & 1)
            goto LABEL_2a86e5;
LABEL_2a86e6:
        v104 = arm64g_calculate_condition(v96 | 16, v97, v98, 0);
        v105 = arm64g_calculate_condition(48, (v104 & 1 ? v94 : 0), (v104 & 1 ? 27 : 0), 0);
        if (v105 & 1)
            goto LABEL_2a86ed;
LABEL_2a86ee:
    }
    v106 = v31;
    if (v31 == 224)
        v32 = 72;
    if (12 <= v31 - 225)
    {
        v107 = arm64g_calculate_condition(35, v106, 224, 0);
        v108 = 3;
        v109 = (v107 & 1 ? v31 : 0x40000000);
        v110 = (v107 & 1 ? 239 : 0);
        v111 = arm64g_calculate_condition(19, v109, v110, 0);
        if (!(v111 & 1))
            goto LABEL_2a870a;
LABEL_2a8709:
        v114 = arm64g_calculate_condition(v108 | 16, v109, v110, 0);
        v115 = arm64g_calculate_condition(3, (v114 & 1 ? v31 : 0x40000000), (v114 & 1 ? 0xee : 0), 0);
        if (!(v115 & 1))
            goto LABEL_2a870e;
LABEL_2a870d:
        v32 = 0;
    }
    else
    {
        v112 = arm64g_calculate_condition(35, v106, 224, 0);
        v108 = 0;
        v109 = (v112 & 1 ? v31 : 0x40000000);
        v110 = (v112 & 1 ? 239 : 0);
        v113 = arm64g_calculate_condition(16, v109, v110, 0);
        if (v113 & 1)
            goto LABEL_2a8709;
LABEL_2a870a:
        v116 = arm64g_calculate_condition(v108 | 16, v109, v110, 0);
        v117 = arm64g_calculate_condition(0, (v116 & 1 ? v31 : 0x40000000), (v116 & 1 ? 0xee : 0), 0);
        if (v117 & 1)
            goto LABEL_2a870d;
LABEL_2a870e:
    }
    if (v31 == 237)
        v32 = 504;
    if (v31 == 240)
        v32 = 664;
    if (v31 - 241 < 3)
        v32 = 416;
    if (v31 == 244)
        v32 = 128;
    goto *((void *)(*(long long *)((char *)&g_e7bd48 + v32)));
}
