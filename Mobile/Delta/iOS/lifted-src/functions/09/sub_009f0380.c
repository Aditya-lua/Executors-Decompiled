/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f0380..0x9f0720 (928 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f0380_0 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_9f0380_0;

extern unsigned int g_f0d568;

unsigned long long * sub_9f0380(unsigned long long *a0, unsigned long long *a1, unsigned long long a2, unsigned long long *a3, st_9f0380_0 *a4)
{
    unsigned long long v21;  // x30
    unsigned long long v22;  // x19
    unsigned long long v31;  // x28
    unsigned long long v121;  // 4206
    unsigned long long v122;  // x8
    unsigned long long v123;  // x10
    unsigned long long v124;  // x12
    unsigned long long v125;  // x14
    unsigned long long v126;  // x16
    unsigned long long v127;  // x19
    unsigned long long v128;  // x21
    unsigned long long *v129;  // x1
    unsigned long long v130;  // 4239
    unsigned long long v32;  // x24
    unsigned long long v131;  // x2
    unsigned int j;  // x2
    unsigned int v133;  // x2
    unsigned long long v33;  // x25
    unsigned long long v34;  // x26
    unsigned long long v35;  // x27
    unsigned long long v36;  // x28
    unsigned long long *v37;  // x0
    unsigned long long v38;  // x5
    unsigned long long v39;  // x6
    unsigned long long v40;  // x7
    unsigned long long v23;  // x20
    unsigned long long v41;  // x8
    unsigned long long v42;  // x9
    unsigned long long v43;  // x10
    unsigned long long v44;  // x11
    unsigned long long v45;  // x12
    unsigned long long v46;  // x13
    unsigned long long v47;  // x14
    unsigned long long v48;  // x15
    unsigned long long v49;  // x16
    unsigned long long v50;  // x17
    unsigned long long v24;  // x21
    unsigned long long v51;  // x19
    unsigned long long v52;  // x20
    unsigned long long v53;  // x21
    unsigned int i;  // x4
    unsigned long long v55;  // x2
    unsigned long v56;  // cc_dep1
    unsigned long long v57;  // x5
    unsigned long long v58;  // x6
    unsigned long long v59;  // x7
    unsigned long long v60;  // x8
    unsigned long long v25;  // x22
    unsigned long long v61;  // x17
    unsigned long long v62;  // x19
    unsigned long long v63;  // x20
    unsigned long long v64;  // x21
    unsigned long long v65;  // x13
    unsigned long long v66;  // x14
    unsigned long long v67;  // x15
    unsigned long long v68;  // x16
    unsigned long long v69;  // x9
    unsigned long long v70;  // x10
    unsigned long long v26;  // x23
    unsigned long long v71;  // x11
    unsigned long long v72;  // x12
    unsigned long long v73;  // x5
    unsigned long long v74;  // x6
    unsigned long long v75;  // x7
    unsigned long long v76;  // x8
    unsigned long long v77;  // x17
    unsigned long long v78;  // x19
    unsigned long long v79;  // x20
    unsigned long long v80;  // x21
    unsigned long long v27;  // x24
    unsigned long long v81;  // x13
    unsigned long long v82;  // x14
    unsigned long long v83;  // x15
    unsigned long long v84;  // x16
    unsigned long long v85;  // x9
    unsigned long long v86;  // x10
    unsigned long long v87;  // x11
    unsigned long long v88;  // x12
    unsigned long long v89;  // x5
    unsigned long long v90;  // x6
    unsigned long long v28;  // x25
    unsigned long long v91;  // x7
    unsigned long long v92;  // x8
    unsigned long long v93;  // x21
    unsigned long long v94;  // x17
    unsigned long long v95;  // x19
    unsigned long long v96;  // x20
    unsigned long long v97;  // x15
    unsigned long long v98;  // x16
    unsigned long long v99;  // x13
    unsigned long long v100;  // x14
    unsigned long long v29;  // x26
    unsigned long long v101;  // x10
    unsigned long long v102;  // x11
    unsigned long long v103;  // x12
    unsigned long long v104;  // x9
    unsigned long long v105;  // x5
    unsigned long long v106;  // x6
    unsigned long long v107;  // x7
    unsigned long long v108;  // x8
    unsigned long long v109;  // x9
    unsigned long long v110;  // x10
    unsigned long long v30;  // x27
    unsigned long long v111;  // x11
    unsigned long long v112;  // x12
    unsigned long long v113;  // x13
    unsigned long long v114;  // x14
    unsigned long long v115;  // x15
    unsigned long long v116;  // x16
    unsigned long long v117;  // x17
    unsigned long long v118;  // x19
    unsigned long v119;  // x20
    unsigned long long v120;  // x21
    unsigned long v0;  // [bp-0xa0]
    unsigned long long v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x90]
    unsigned long long v3;  // [bp-0x88]
    unsigned long long v4;  // [bp-0x80]
    unsigned long long v5;  // [bp-0x78]
    unsigned long long v6;  // [bp-0x70]
    unsigned long long v7;  // [bp-0x68]
    char *v8;  // [bp-0x60]
    unsigned long long v9;  // [bp-0x58]
    unsigned long long v10;  // [bp-0x50]
    unsigned long long v11;  // [bp-0x48]
    unsigned long long v12;  // [bp-0x40]
    unsigned long long v13;  // [bp-0x38]
    unsigned long long v14;  // [bp-0x30]
    unsigned long long v15;  // [bp-0x28]
    unsigned long long v16;  // [bp-0x20]
    unsigned long long v17;  // [bp-0x18]
    unsigned long long v18;  // [bp-0x10]
    unsigned long long v19;  // [bp-0x8]
    char v20;  // [bp+0x0]

    if (a2 >= 192)
        if (g_f0d568 & 1)
            goto LABEL_0x9f0780;
        else
            goto LABEL_9f0398;
LABEL_9f0398:
    v8 = &v20;
    v9 = v21;
    v10 = v22;
    v11 = v23;
    v12 = v24;
    v13 = v25;
    v14 = v26;
    v15 = v27;
    v16 = v28;
    v17 = v29;
    v18 = v30;
    v19 = v31;
    v32 = *a3;
    v33 = a3[1];
    v34 = a3[2];
    v35 = a3[3];
    v36 = a4->field_0;
    x30 = a4->field_8;
    while (1)
    {
        v37 = a0;
        v38 = 1634760805;
        v39 = 857760878;
        v40 = 2036477234;
        v41 = 1797285236;
        v42 = v32 & 0xffffffff;
        v43 = v32 >> 32;
        v44 = v33 & 0xffffffff;
        v45 = v33 >> 32;
        v46 = v34 & 0xffffffff;
        v47 = v34 >> 32;
        v48 = v35 & 0xffffffff;
        v49 = v35 >> 32;
        v50 = v36 & 0xffffffff;
        v51 = v36 >> 32;
        v52 = x30 & 0xffffffff;
        v53 = (unsigned int)(x30) >> 32;
        i = 10;
        v55 = a2 - 64;
        v56 = a2;
        do
        {
            i -= 1;
            v57 = v38 + v42;
            v58 = v39 + v43;
            v59 = v40 + v44;
            v60 = v41 + v45;
            v61 = ((unsigned int)v50 ^ (unsigned int)v57) * 0x10000 | ((unsigned int)v50 ^ (unsigned int)v57) >> 16;
            v62 = ((unsigned int)v51 ^ (unsigned int)v58) * 0x10000 | ((unsigned int)v51 ^ (unsigned int)v58) >> 16;
            v63 = ((unsigned int)v52 ^ (unsigned int)v59) * 0x10000 | ((unsigned int)v52 ^ (unsigned int)v59) >> 16;
            v64 = ((unsigned int)v53 ^ (unsigned int)v60) * 0x10000 | ((unsigned int)v53 ^ (unsigned int)v60) >> 16;
            v65 = v46 + v61;
            v66 = v47 + v62;
            v67 = v48 + v63;
            v68 = v49 + v64;
            v69 = ((unsigned int)v42 ^ (unsigned int)v65) * 0x1000 | ((unsigned int)v42 ^ (unsigned int)v65) >> 20;
            v70 = ((unsigned int)v43 ^ (unsigned int)v66) * 0x1000 | ((unsigned int)v43 ^ (unsigned int)v66) >> 20;
            v71 = ((unsigned int)v44 ^ (unsigned int)v67) * 0x1000 | ((unsigned int)v44 ^ (unsigned int)v67) >> 20;
            v72 = ((unsigned int)v45 ^ (unsigned int)v68) * 0x1000 | ((unsigned int)v45 ^ (unsigned int)v68) >> 20;
            v73 = v57 + v69;
            v74 = v58 + v70;
            v75 = v59 + v71;
            v76 = v60 + v72;
            v77 = ((unsigned int)v61 ^ (unsigned int)v73) * 0x100 | ((unsigned int)v61 ^ (unsigned int)v73) >> 24;
            v78 = ((unsigned int)v62 ^ (unsigned int)v74) * 0x100 | ((unsigned int)v62 ^ (unsigned int)v74) >> 24;
            v79 = ((unsigned int)v63 ^ (unsigned int)v75) * 0x100 | ((unsigned int)v63 ^ (unsigned int)v75) >> 24;
            v80 = ((unsigned int)v64 ^ (unsigned int)v76) * 0x100 | ((unsigned int)v64 ^ (unsigned int)v76) >> 24;
            v81 = v65 + v77;
            v82 = v66 + v78;
            v83 = v67 + v79;
            v84 = v68 + v80;
            v85 = ((unsigned int)v69 ^ (unsigned int)v81) * 128 | ((unsigned int)v69 ^ (unsigned int)v81) >> 25;
            v86 = ((unsigned int)v70 ^ (unsigned int)v82) * 128 | ((unsigned int)v70 ^ (unsigned int)v82) >> 25;
            v87 = ((unsigned int)v71 ^ (unsigned int)v83) * 128 | ((unsigned int)v71 ^ (unsigned int)v83) >> 25;
            v88 = ((unsigned int)v72 ^ (unsigned int)v84) * 128 | ((unsigned int)v72 ^ (unsigned int)v84) >> 25;
            v89 = v73 + v86;
            v90 = v74 + v87;
            v91 = v75 + v88;
            v92 = v76 + v85;
            v93 = ((unsigned int)v80 ^ (unsigned int)v89) * 0x10000 | ((unsigned int)v80 ^ (unsigned int)v89) >> 16;
            v94 = ((unsigned int)v77 ^ (unsigned int)v90) * 0x10000 | ((unsigned int)v77 ^ (unsigned int)v90) >> 16;
            v95 = ((unsigned int)v78 ^ (unsigned int)v91) * 0x10000 | ((unsigned int)v78 ^ (unsigned int)v91) >> 16;
            v96 = ((unsigned int)v79 ^ (unsigned int)v92) * 0x10000 | ((unsigned int)v79 ^ (unsigned int)v92) >> 16;
            v97 = v83 + v93;
            v98 = v84 + v94;
            v99 = v81 + v95;
            v100 = v82 + v96;
            v101 = ((unsigned int)v86 ^ (unsigned int)v97) * 0x1000 | ((unsigned int)v86 ^ (unsigned int)v97) >> 20;
            v102 = ((unsigned int)v87 ^ (unsigned int)v98) * 0x1000 | ((unsigned int)v87 ^ (unsigned int)v98) >> 20;
            v103 = ((unsigned int)v88 ^ (unsigned int)v99) * 0x1000 | ((unsigned int)v88 ^ (unsigned int)v99) >> 20;
            v104 = ((unsigned int)v85 ^ (unsigned int)v100) * 0x1000 | ((unsigned int)v85 ^ (unsigned int)v100) >> 20;
            v38 = v89 + v101;
            v39 = v90 + v102;
            v40 = v91 + v103;
            v41 = v92 + v104;
            v53 = ((unsigned int)v93 ^ (unsigned int)v38) * 0x100 | ((unsigned int)v93 ^ (unsigned int)v38) >> 24;
            v50 = ((unsigned int)v94 ^ (unsigned int)v39) * 0x100 | ((unsigned int)v94 ^ (unsigned int)v39) >> 24;
            v51 = ((unsigned int)v95 ^ (unsigned int)v40) * 0x100 | ((unsigned int)v95 ^ (unsigned int)v40) >> 24;
            v52 = ((unsigned int)v96 ^ (unsigned int)v41) * 0x100 | ((unsigned int)v96 ^ (unsigned int)v41) >> 24;
            v48 = v97 + v53;
            v49 = v98 + v50;
            v46 = v99 + v51;
            v47 = v100 + v52;
            v43 = ((unsigned int)v101 ^ (unsigned int)v48) * 128 | ((unsigned int)v101 ^ (unsigned int)v48) >> 25;
            v44 = ((unsigned int)v102 ^ (unsigned int)v49) * 128 | ((unsigned int)v102 ^ (unsigned int)v49) >> 25;
            v45 = ((unsigned int)v103 ^ (unsigned int)v46) * 128 | ((unsigned int)v103 ^ (unsigned int)v46) >> 25;
            v42 = ((unsigned int)v104 ^ (unsigned int)v47) * 128 | ((unsigned int)v104 ^ (unsigned int)v47) >> 25;
        } while (i);
        v105 = v38 + 3684054920433006693;
        v106 = v39 + 857760878;
        v107 = v40 + 7719281312240119090;
        v108 = v41 + 1797285236;
        v109 = v42 + v32;
        v110 = v43 + (v32 >> 32);
        v111 = v44 + v33;
        v112 = v45 + (v33 >> 32);
        v113 = v46 + v34;
        v114 = v47 + (v34 >> 32);
        v115 = v48 + v35;
        v116 = v49 + (v35 >> 32);
        v117 = v50 + v36;
        v118 = v51 + (v36 >> 32);
        v119 = v52 + x30;
        v120 = v53 + ((unsigned int)(x30) >> 32);
        v121 = arm64g_calculate_condition(52, v56, 64, 0);
        if (!(v121 & 1))
        {
            v122 = a1[1];
            v123 = a1[2];
            v124 = a1[3];
            v125 = a1[4];
            v126 = a1[5];
            v127 = a1[6];
            v128 = a1[7];
            v129 = a1 + 8;
            *v37 = v105 + v106 * 0x100000000 ^ *a1;
            v37[1] = v107 + v108 * 0x100000000 ^ v122;
            v36 += 1;
            v37[2] = v109 + v110 * 0x100000000 ^ v123;
            v37[3] = v111 + v112 * 0x100000000 ^ v124;
            v37[4] = v113 + v114 * 0x100000000 ^ v125;
            v37[5] = v115 + v116 * 0x100000000 ^ v126;
            v37[6] = v117 + v118 * 0x100000000 ^ v127;
            v37[7] = v119 + v120 * 0x100000000 ^ v128;
            a0 = v37 + 8;
            v130 = arm64g_calculate_condition(132, v56, 64, 0);
            a2 = v55;
            a1 = v129;
            if (!(v130 & 1))
                return v37 + 8;
        }
        else
        {
            v131 = v55 + 64;
            j = -v131;
            v0 = v105 + v106 * 0x100000000;
            v1 = v107 + v108 * 0x100000000;
            v2 = v109 + v110 * 0x100000000;
            v3 = v111 + v112 * 0x100000000;
            v4 = v113 + v114 * 0x100000000;
            v5 = v115 + v116 * 0x100000000;
            v6 = v117 + v118 * 0x100000000;
            v7 = v119 + v120 * 0x100000000;
            do
            {
                v133 = j + 1;
                *((char *)v37 + v131 + v133 - 1) = *((char *)a1 + v131 + j) ^ *((char *)&v0 + v131 + j);
                j = v133;
            } while (j);
            return (char *)v37 + v131 - 1;
        }
    }
}
