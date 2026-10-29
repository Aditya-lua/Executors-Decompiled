/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb47a4c..0xb47eb8 (1132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b47a4c_0 {
    char padding_0[240];
    void* field_f0;
} st_b47a4c_0;


unsigned long long sub_b47a4c(st_b47a4c_0 *a0, long long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long long v3;  // x19
    unsigned long long v4;  // x21
    unsigned int v13;  // w8
    unsigned int v14;  // w8
    unsigned int v15;  // w8
    unsigned int v16;  // w8
    unsigned int v17;  // w8
    unsigned int v18;  // w8
    unsigned int v19;  // w8
    unsigned int v20;  // w8
    unsigned int v21;  // w8
    unsigned int v22;  // w8
    long long v5;  // x22
    unsigned long long v23;  // x0
    unsigned long v24;  // cc_dep1
    unsigned long long v25;  // 4104
    unsigned long long v26;  // 4104
    unsigned int v27;  // w4
    unsigned int v28;  // w8
    unsigned int v29;  // w9
    unsigned int v30;  // w10
    unsigned int v31;  // w11
    unsigned int v32;  // w12
    unsigned long long v6;  // x23
    unsigned int v33;  // w13
    unsigned int v34;  // w14
    unsigned int v35;  // w15
    unsigned int v36;  // w16
    unsigned int v37;  // w17
    unsigned int v38;  // w0
    unsigned int v39;  // w1
    unsigned int v40;  // w2
    unsigned int v41;  // w3
    void* v42;  // x24
    void* v7;  // x26
    void* v43;  // x24
    char v44;  // x5
    unsigned long long v45;  // x21
    unsigned long long v46;  // x0
    unsigned long long v47;  // x25
    unsigned int v48;  // w8
    unsigned long v49;  // x9
    unsigned int v50;  // w9
    unsigned long long v51;  // x8
    unsigned long long v52;  // 4154
    unsigned int v8;  // w8
    unsigned int v53;  // w8
    unsigned int v54;  // w8
    unsigned int v55;  // w8
    unsigned int v56;  // w8
    unsigned int v57;  // w8
    unsigned int v58;  // w8
    unsigned int v59;  // w8
    unsigned int v60;  // w8
    unsigned int v61;  // w8
    unsigned int v62;  // w8
    unsigned int v9;  // w8
    unsigned int v63;  // w8
    unsigned int v65;  // w8
    unsigned long v66;  // cc_op
    unsigned long v67;  // cc_dep1
    unsigned long v68;  // cc_dep2
    unsigned long v69;  // cc_ndep
    unsigned long long v70;  // 4112
    unsigned long long v71;  // 4102
    unsigned int v10;  // w8
    unsigned long long v72;  // 4112
    unsigned long long v73;  // 4102
    unsigned long long v74;  // x8
    unsigned int v11;  // w8
    unsigned int v75;  // w4
    unsigned int v76;  // w8
    unsigned int v77;  // w8
    unsigned int v78;  // w8
    unsigned int v79;  // w8
    unsigned int v80;  // w8
    unsigned int v12;  // w8
    unsigned int v81;  // w8
    unsigned int v82;  // w8
    unsigned int v83;  // w8
    unsigned int v84;  // w8
    unsigned int v85;  // w8
    unsigned int v86;  // w8
    unsigned int v87;  // w8
    unsigned int v88;  // w8
    unsigned int v89;  // w8
    char v0;  // [bp-0x64]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a3;
    v4 = a2;
    v5 = a1;
    v6 = 0;
    v7 = a0->field_f0;
    if (a3 && a4)
    {
        v8 = (char)v7[99] + 1;
        *(char *)&v7[99] = v8;
        v9 = (char)v7[98] + (v8 >> 8);
        *(char *)&v7[98] = v9;
        v10 = (char)v7[97] + (v9 >> 8);
        *(char *)&v7[97] = v10;
        v11 = (char)v7[96] + (v10 >> 8);
        *(char *)&v7[96] = v11;
        v12 = (char)v7[95] + (v11 >> 8);
        *(char *)&v7[95] = v12;
        v13 = (char)v7[94] + (v12 >> 8);
        *(char *)&v7[94] = v13;
        v14 = (char)v7[93] + (v13 >> 8);
        *(char *)&v7[93] = v14;
        v15 = (char)v7[92] + (v14 >> 8);
        *(char *)&v7[92] = v15;
        v16 = (char)v7[91] + (v15 >> 8);
        *(char *)&v7[91] = v16;
        v17 = (char)v7[90] + (v16 >> 8);
        *(char *)&v7[90] = v17;
        v18 = (char)v7[89] + (v17 >> 8);
        *(char *)&v7[89] = v18;
        v19 = (char)v7[88] + (v18 >> 8);
        *(char *)&v7[88] = v19;
        v20 = (char)v7[87] + (v19 >> 8);
        *(char *)&v7[87] = v20;
        v21 = (char)v7[86] + (v20 >> 8);
        *(char *)&v7[86] = v21;
        v22 = (char)v7[0x55] + (v21 >> 8);
        *(char *)&v7[0x55] = v22;
        *(char *)&v7[84] = (char)v7[84] + (char)(v22 >> 8);
        v23 = sub_b47eb8(a0, v3, a4, 0, 0, 0, 0);
        if (!(unsigned int)v23)
            return v23;
        v24 = (int)v7[48];
        if (!(int)v7[48])
        {
            v6 = a4;
            v25 = arm64g_calculate_condition(3, v24, 0, 0);
            if (!(v25 & 1))
                goto LABEL_b47b82;
LABEL_b47b81:
        }
        else
        {
            v6 = 1;
            v26 = arm64g_calculate_condition(3, v24, 0, 0);
            if (v26 & 1)
                goto LABEL_b47b81;
LABEL_b47b82:
            v3 = 0;
        }
    }
    v27 = (char)v7[99] + 1;
    *(char *)&v7[99] = v27;
    v28 = (char)v7[98] + (v27 >> 8);
    *(char *)&v7[98] = v28;
    v29 = (char)v7[97] + (v28 >> 8);
    *(char *)&v7[97] = v29;
    v30 = (char)v7[96] + (v29 >> 8);
    *(char *)&v7[96] = v30;
    v31 = (char)v7[95] + (v30 >> 8);
    *(char *)&v7[95] = v31;
    v32 = (char)v7[94] + (v31 >> 8);
    *(char *)&v7[94] = v32;
    v33 = (char)v7[93] + (v32 >> 8);
    *(char *)&v7[93] = v33;
    v34 = (char)v7[92] + (v33 >> 8);
    *(char *)&v7[92] = v34;
    v35 = (char)v7[91] + (v34 >> 8);
    *(char *)&v7[91] = v35;
    v36 = (char)v7[90] + (v35 >> 8);
    *(char *)&v7[90] = v36;
    v37 = (char)v7[89] + (v36 >> 8);
    *(char *)&v7[89] = v37;
    v38 = (char)v7[88] + (v37 >> 8);
    *(char *)&v7[88] = v38;
    v39 = (char)v7[87] + (v38 >> 8);
    *(char *)&v7[87] = v39;
    v40 = (char)v7[86] + (v39 >> 8);
    *(char *)&v7[86] = v40;
    v41 = (char)v7[0x55] + (v40 >> 8);
    *(char *)&v7[0x55] = v41;
    v42 = v7;
    v43 = v42 + 84;
    v44 = (char)v42[84] + (char)(v41 >> 8);
    *(char *)v43 = v44;
    if (!v4)
    {
        v75 = (v27 & 0xff) + 1;
        *(char *)&v7[99] = v75;
        v76 = (v75 >> 8) + (v28 & 0xff);
        *(char *)&v7[98] = v76;
        v77 = (v76 >> 8) + (v29 & 0xff);
        *(char *)&v7[97] = v77;
        v78 = (v77 >> 8) + (v30 & 0xff);
        *(char *)&v7[96] = v78;
        v79 = (v78 >> 8) + (v31 & 0xff);
        *(char *)&v7[95] = v79;
        v80 = (v79 >> 8) + (v32 & 0xff);
        *(char *)&v7[94] = v80;
        v81 = (v80 >> 8) + (v33 & 0xff);
        *(char *)&v7[93] = v81;
        v82 = (v81 >> 8) + (v34 & 0xff);
        *(char *)&v7[92] = v82;
        v83 = (v82 >> 8) + (v35 & 0xff);
        *(char *)&v7[91] = v83;
        v84 = (v83 >> 8) + (v36 & 0xff);
        *(char *)&v7[90] = v84;
        v85 = (v84 >> 8) + (v37 & 0xff);
        *(char *)&v7[89] = v85;
        v86 = (v85 >> 8) + (v38 & 0xff);
        *(char *)&v7[88] = v86;
        v87 = (v86 >> 8) + (v39 & 0xff);
        *(char *)&v7[87] = v87;
        v88 = (v87 >> 8) + (v40 & 0xff);
        *(char *)&v7[86] = v88;
        v89 = (v88 >> 8) + (v41 & 0xff);
        *(char *)&v7[0x55] = v89;
        *(char *)&v7[84] = v44 + (char)(v89 >> 8);
        return sub_b47eb8();
    }
    _bzero(v5, v4);
    while (1)
    {
        v45 = v4;
        v46 = sub_a4c694((long long)v7[8], 0, 0, 0, v43, 0xffffffff);
        if (!(unsigned int)v46)
            return v46;
        if (v45 < 0x40000000)
            v47 = v45;
        else
            v47 = 0x40000000;
        v48 = (unsigned int)v47 + 15;
        v49 = (int)v7[96];
        v50 = (((((v49 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v49 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v49 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v49 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v51 = v50 + (v48 >> 4);
        v52 = arm64g_calculate_condition(49, v50, v48 >> 4, 0);
        if (!(v52 & 1))
        {
            if (!(unsigned int)v51)
                v47 &= 0xffffffff;
            else
                v47 = -(v50 * 16);
            v53 = (char)v7[95] + 1;
            *(char *)&v7[95] = v53;
            v54 = (char)v7[94] + (v53 >> 8);
            *(char *)&v7[94] = v54;
            v55 = (char)v7[93] + (v54 >> 8);
            *(char *)&v7[93] = v55;
            v56 = (char)v7[92] + (v55 >> 8);
            *(char *)&v7[92] = v56;
            v57 = (char)v7[91] + (v56 >> 8);
            *(char *)&v7[91] = v57;
            v58 = (char)v7[90] + (v57 >> 8);
            *(char *)&v7[90] = v58;
            v59 = (char)v7[89] + (v58 >> 8);
            *(char *)&v7[89] = v59;
            v60 = (char)v7[88] + (v59 >> 8);
            *(char *)&v7[88] = v60;
            v61 = (char)v7[87] + (v60 >> 8);
            *(char *)&v7[87] = v61;
            v62 = (char)v7[86] + (v61 >> 8);
            *(char *)&v7[86] = v62;
            v63 = (char)v7[0x55] + (v62 >> 8);
            *(char *)&v7[0x55] = v63;
            *(char *)&v7[84] = (char)v7[84] + (char)(v63 >> 8);
            v51 = 0;
        }
        *(unsigned int *)&v7[96] = (((((v51 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v51 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v51 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v51 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v65 = v0;
        if (sub_a4c6a0((long long)v7[8], v5, &v0, v5, v47))
        {
            v70 = arm64g_calculate_condition(v66 | 16, v67, v68, v69);
            v71 = arm64g_calculate_condition(19, (v70 & 1 ? v65 : 0), (v70 & 1 ? v47 & 0xffffffff : 0), 0);
            if (v71 & 1)
                break;
        }
        else
        {
            v72 = arm64g_calculate_condition(v66 | 16, v67, v68, v69);
            v73 = arm64g_calculate_condition(16, (v72 & 1 ? v65 : 0), (v72 & 1 ? v47 & 0xffffffff : 0), 0);
            if (v73 & 1)
                break;
        }
        v74 = (int)v47;
        v5 += v74;
        v4 = v45 - v74;
        if (v45 == v74)
            return sub_b47eb8(a0, v3, v6, 0, 0, 0, 0);
    }
    return 0;
}
