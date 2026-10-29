/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab148c..0xab1850 (964 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ab148c(unsigned long long a0)
{
    unsigned long long v6;  // 4102
    unsigned long long v7;  // w11
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x9
    unsigned long long v20;  // x12
    unsigned long long v21;  // x13
    char v22;  // x13
    char v23;  // x14
    unsigned long long v24;  // 4135
    unsigned long long v25;  // x14
    unsigned int v8;  // w8
    unsigned long long v26;  // x15
    char v27;  // x15
    unsigned long long v28;  // 4135
    unsigned long long v29;  // x14
    unsigned long long v30;  // x16
    char v31;  // x16
    unsigned long long v32;  // 4135
    unsigned long long v33;  // x16
    unsigned long long v34;  // x17
    char v35;  // x17
    unsigned long long v9;  // x10
    unsigned long long v36;  // 4135
    unsigned long long v37;  // x17
    unsigned long long v38;  // x1
    char v39;  // x1
    unsigned long long v40;  // 4135
    unsigned long long v41;  // x1
    unsigned long long v42;  // x2
    char v43;  // x2
    unsigned long long v44;  // 4135
    unsigned long long v45;  // x2
    unsigned long long v10;  // x9
    unsigned long long v46;  // x3
    char v47;  // x3
    unsigned long long v48;  // 4135
    unsigned long long v49;  // x3
    unsigned long long v50;  // x4
    char v51;  // x4
    unsigned long long v52;  // 4135
    unsigned long long v53;  // x4
    unsigned long long v54;  // x5
    char v55;  // x5
    unsigned long long i;  // x9
    unsigned long long v56;  // 4135
    unsigned long long v57;  // x5
    unsigned long long v58;  // x6
    char v59;  // x6
    unsigned long long v60;  // 4135
    unsigned long long v61;  // x5
    unsigned long long v62;  // x7
    char v63;  // x7
    unsigned long long v64;  // 4135
    unsigned long long v65;  // x5
    unsigned long long v12;  // x12
    unsigned long long v66;  // x19
    char v67;  // x19
    unsigned long long v68;  // 4135
    unsigned long long v69;  // x5
    unsigned long long v70;  // x20
    char v71;  // x20
    unsigned long long v72;  // 4135
    unsigned long long v73;  // x5
    unsigned long long v74;  // x21
    char v75;  // x21
    unsigned long long v13;  // x24
    unsigned long long v76;  // 4135
    unsigned long long v77;  // x5
    unsigned long long v78;  // x22
    char v79;  // x22
    unsigned long long v80;  // 4135
    unsigned long long v81;  // x5
    unsigned long long v82;  // x23
    char v83;  // x23
    unsigned long long v84;  // 4139
    unsigned long long v85;  // x5
    unsigned long long v14;  // x23
    unsigned long long v86;  // x24
    unsigned long long v87;  // 4291
    unsigned int v89;  // w11
    unsigned long v90;  // x11
    unsigned long long v91;  // x11
    unsigned long long v92;  // x10
    unsigned long long v93;  // x11
    unsigned long long v94;  // x12
    unsigned long long v95;  // x9
    unsigned long long v15;  // x22
    unsigned long long v96;  // x13
    unsigned long v97;  // cc_dep1
    unsigned long v98;  // cc_dep2
    unsigned long long v99;  // 4104
    unsigned long long v100;  // 4104
    unsigned long long v101;  // x12
    unsigned int v102;  // w9
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    unsigned long long v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]

    if (a0 > 0x17ff)
    {
        if (0x2000 <= a0)
        {
            v6 = arm64g_calculate_condition(3, a0, 0x2000, 0);
            if (v6 & 1)
                return 200;
            if (a0 == 0x3c00)
                return 0x100;
        }
        else if (a0 == 0x1800)
        {
            return 176;
        }
        else if (a0 == 0x1e00)
        {
            return 192;
        }
    }
    else
    {
        if (a0 == 0x800)
        {
            return 112;
        }
        else if (a0 == 0xc00)
        {
            return 128;
        }
        else if (a0 == 0x1000)
        {
            return 152;
        }
    }
    if (a0 > 687736)
    {
        return 1200;
    }
    else if (8 > a0)
    {
        return 0;
    }
    else
    {
        v7 = 0;
        if (a0 < 15361)
            v8 = 0x100;
        else
            v8 = 1200;
        v9 = a0 * 181704;
        v10 = v9;
        do
        {
            i = v10;
            v12 = i >> 1;
            v7 += 0x40000;
            v10 = v12;
        } while (i > 0xfffff);
        v0 = v13;
        v1 = v14;
        v2 = v15;
        v3 = v16;
        v4 = v17;
        v5 = v18;
        v19 = 0;
        v20 = v12 * v12;
        v21 = v20 >> 37;
        v22 = 18;
        if (!v21)
            v23 = 18;
        else
            v23 = 19;
        v24 = arm64g_calculate_condition(4, v21, 0, 0);
        v25 = (v20 >> (v23 & 63)) * (v20 >> (v23 & 63));
        v26 = v25 >> 37;
        if (!v26)
            v27 = 18;
        else
            v27 = 19;
        v28 = arm64g_calculate_condition(4, v26, 0, 0);
        v29 = (v25 >> (v27 & 63)) * (v25 >> (v27 & 63));
        v30 = v29 >> 37;
        if (!v30)
            v31 = 18;
        else
            v31 = 19;
        v32 = arm64g_calculate_condition(4, v30, 0, 0);
        v33 = (v29 >> (v31 & 63)) * (v29 >> (v31 & 63));
        v34 = v33 >> 37;
        if (!v34)
            v35 = 18;
        else
            v35 = 19;
        v36 = arm64g_calculate_condition(4, v34, 0, 0);
        v37 = (v33 >> (v35 & 63)) * (v33 >> (v35 & 63));
        v38 = v37 >> 37;
        if (!v38)
            v39 = 18;
        else
            v39 = 19;
        v40 = arm64g_calculate_condition(4, v38, 0, 0);
        v41 = (v37 >> (v39 & 63)) * (v37 >> (v39 & 63));
        v42 = v41 >> 37;
        if (!v42)
            v43 = 18;
        else
            v43 = 19;
        v44 = arm64g_calculate_condition(4, v42, 0, 0);
        v45 = (v41 >> (v43 & 63)) * (v41 >> (v43 & 63));
        v46 = v45 >> 37;
        if (!v46)
            v47 = 18;
        else
            v47 = 19;
        v48 = arm64g_calculate_condition(4, v46, 0, 0);
        v49 = (v45 >> (v47 & 63)) * (v45 >> (v47 & 63));
        v50 = v49 >> 37;
        if (!v50)
            v51 = 18;
        else
            v51 = 19;
        v52 = arm64g_calculate_condition(4, v50, 0, 0);
        v53 = (v49 >> (v51 & 63)) * (v49 >> (v51 & 63));
        v54 = v53 >> 37;
        if (!v54)
            v55 = 18;
        else
            v55 = 19;
        v56 = arm64g_calculate_condition(4, v54, 0, 0);
        v57 = (v53 >> (v55 & 63)) * (v53 >> (v55 & 63));
        v58 = v57 >> 37;
        if (!v58)
            v59 = 18;
        else
            v59 = 19;
        v60 = arm64g_calculate_condition(4, v58, 0, 0);
        v61 = (v57 >> (v59 & 63)) * (v57 >> (v59 & 63));
        v62 = v61 >> 37;
        if (!v62)
            v63 = 18;
        else
            v63 = 19;
        v64 = arm64g_calculate_condition(4, v62, 0, 0);
        v65 = (v61 >> (v63 & 63)) * (v61 >> (v63 & 63));
        v66 = v65 >> 37;
        if (!v66)
            v67 = 18;
        else
            v67 = 19;
        v68 = arm64g_calculate_condition(4, v66, 0, 0);
        v69 = (v65 >> (v67 & 63)) * (v65 >> (v67 & 63));
        v70 = v69 >> 37;
        if (!v70)
            v71 = 18;
        else
            v71 = 19;
        v72 = arm64g_calculate_condition(4, v70, 0, 0);
        v73 = (v69 >> (v71 & 63)) * (v69 >> (v71 & 63));
        v74 = v73 >> 37;
        if (!v74)
            v75 = 18;
        else
            v75 = 19;
        v76 = arm64g_calculate_condition(4, v74, 0, 0);
        v77 = (v73 >> (v75 & 63)) * (v73 >> (v75 & 63));
        v78 = v77 >> 37;
        if (!v78)
            v79 = 18;
        else
            v79 = 19;
        v80 = arm64g_calculate_condition(4, v78, 0, 0);
        v81 = (v77 >> (v79 & 63)) * (v77 >> (v79 & 63));
        v82 = v81 >> 37;
        if (!v82)
            v83 = 18;
        else
            v83 = 19;
        v84 = arm64g_calculate_condition(4, v82, 0, 0);
        v85 = (v81 >> (v83 & 63)) * (v81 >> (v83 & 63));
        v86 = v85 >> 37;
        if (v86)
            v22 = 19;
        v87 = arm64g_calculate_condition(4, v86, 0, 0);
        v89 = ...;
        if ((v85 >> (v22 & 63)) * (v85 >> (v22 & 63)) <= 0x1fffffffff)
            v90 = v89;
        else
            v90 = v89 + 1;
        v91 = ((v90 * 0x40000 | v90 >> 46) & 0x3fffffffc0000 & 0x3ffffffffffff) / 378193;
        v92 = v91 * (v9 * v91 >> 18) >> 18;
        v93 = 66;
        do
        {
            v93 -= 3;
            v94 = v19 * 2;
            v95 = (1 | (v19 * 2 | v19 >> 63) & 0xfffffffffffffffe) * v19 * 6;
            v96 = v92 >> ((char)v93 & 63);
            v97 = v96;
            v98 = v95;
            if (v96 <= v95)
            {
                v19 = v94;
                v99 = arm64g_calculate_condition(132, v97, v98, 0);
                if (!(v99 & 1))
                    goto LABEL_ab17ee;
                goto LABEL_ab17ed;
            }
            else
            {
                v19 = v94 + 1;
                v100 = arm64g_calculate_condition(132, v97, v98, 0);
                if (v100 & 1)
                {
LABEL_ab17ed:
                    v101 = ~v95 << ((char)v93 & 63);
                    continue;
                }
                else
                {
LABEL_ab17ee:
                    v101 = 0;
                }
            }
        } while ((v92 += v101, 2 < v93));
        if (a0 < 7681)
            v8 = 192;
        v102 = (((unsigned int)((0xffffffffffed3d71 + (0x7b126000 * v19 >> 18)) * 6653270261604748243 >> 64) * 0 | (unsigned int)((0xffffffffffed3d71 + (0x7b126000 * v19 >> 18)) / 181704)) & 0xffff) + 4 & 0xfff8;
        if (v102 >= v8)
            return v8;
        return v102;
    }
}
