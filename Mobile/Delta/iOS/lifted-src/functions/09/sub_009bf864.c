/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bf864..0x9c0050 (2028 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9bf864_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9bf864_0;

extern st_9bf864_0 g_d2b4c0;
extern st_9bf864_0 g_d2bcc0;
extern unsigned int g_d2c0c0[12];
extern char _NSHomeDirectory;

void* sub_9bf864(void* a0, unsigned int a1, void* a2)
{
    unsigned long long v25;  // 4125
    unsigned int v26;  // w9
    unsigned long long v35;  // x20
    unsigned long long v36;  // x19
    unsigned long long v37;  // x30
    unsigned int *v38;  // x26
    unsigned int v39;  // w8
    unsigned int v40;  // w9
    unsigned int v41;  // w17
    unsigned int v42;  // w10
    unsigned int v43;  // w3
    unsigned int v44;  // w11
    unsigned long long v27;  // x28
    unsigned int v45;  // w4
    unsigned int v46;  // w13
    unsigned int v47;  // w15
    unsigned int v48;  // w14
    unsigned int v49;  // w16
    unsigned int v50;  // w5
    unsigned int v51;  // w15
    unsigned int v52;  // w16
    unsigned int v53;  // w6
    unsigned int v54;  // w14
    unsigned long long v28;  // x27
    unsigned int v55;  // w16
    unsigned int v56;  // w5
    unsigned long v57;  // x15
    unsigned int v58;  // w16
    unsigned int v59;  // w7
    unsigned int v60;  // w24
    unsigned int v61;  // w23
    unsigned int v62;  // w6
    unsigned long v63;  // x14
    unsigned long v64;  // x16
    unsigned long long v29;  // x26
    void* v65;  // w15
    void* v66;  // w16
    unsigned long v67;  // x14
    unsigned long v68;  // x0
    void* v69;  // w14
    void* v70;  // w25
    unsigned int v71;  // w0
    unsigned int v72;  // w15
    unsigned int v73;  // w5
    unsigned int v74;  // w8
    unsigned long long v30;  // x25
    unsigned int v75;  // w6
    unsigned int v76;  // w7
    unsigned int v77;  // w24
    unsigned int v78;  // w25
    unsigned int v79;  // w15
    unsigned int v80;  // w14
    unsigned int v81;  // w16
    unsigned int v82;  // w8
    unsigned int v83;  // w14
    unsigned int v84;  // w8
    unsigned long long v31;  // x24
    unsigned int v85;  // w16
    unsigned int v86;  // w8
    unsigned int v87;  // w14
    unsigned int v88;  // w17
    unsigned int v89;  // w23
    unsigned int v90;  // w4
    unsigned int v91;  // w15
    unsigned int v92;  // w8
    unsigned int v93;  // w24
    unsigned int v94;  // w16
    unsigned long long v32;  // x23
    unsigned int v95;  // w25
    unsigned int v96;  // w8
    unsigned int v97;  // w26
    unsigned int v98;  // w14
    unsigned int v99;  // w15
    unsigned int v100;  // w8
    unsigned int v101;  // w12
    unsigned int v102;  // w14
    unsigned int v103;  // w8
    unsigned int v104;  // w15
    unsigned long long v33;  // x22
    unsigned int v105;  // w16
    unsigned int v106;  // w8
    unsigned int v107;  // w12
    unsigned int v108;  // w3
    unsigned int v109;  // w14
    unsigned int v110;  // w12
    unsigned int v111;  // w8
    unsigned int v112;  // w15
    unsigned int v113;  // w27
    unsigned long long v114;  // 4102
    unsigned long long v34;  // x21
    unsigned int v0;  // [bp-0x90]
    unsigned int v1;  // [bp-0x8c]
    unsigned int v2;  // [bp-0x88]
    unsigned int v3;  // [bp-0x84]
    unsigned int v4;  // [bp-0x80]
    unsigned int v5;  // [bp-0x7c]
    unsigned int v6;  // [bp-0x78]
    unsigned int v7;  // [bp-0x74]
    unsigned int v8;  // [bp-0x70]
    unsigned int v9;  // [bp-0x6c]
    unsigned int v10;  // [bp-0x68]
    unsigned int v11;  // [bp-0x64]
    unsigned long long v12;  // [bp-0x60]
    unsigned long long v13;  // [bp-0x58]
    unsigned long long v14;  // [bp-0x50]
    unsigned long long v15;  // [bp-0x48]
    unsigned long long v16;  // [bp-0x40]
    unsigned long long v17;  // [bp-0x38]
    unsigned long long v18;  // [bp-0x30]
    unsigned long long v19;  // [bp-0x28]
    unsigned long long v20;  // [bp-0x20]
    unsigned long long v21;  // [bp-0x18]
    char *v22;  // [bp-0x10]
    unsigned long long v23;  // [bp-0x8]
    char v24;  // [bp+0x0]

    v25 = arm64g_calculate_condition(177, a1, 0x100, 0);
    if (v25 & 1)
        v26 = a1 + 287;
    else
        v26 = a1 + 0x100;
    if (!a0)
    {
        return 0xffffffff;
    }
    else if (a2)
    {
        if (a1 != 128 && a1 != 0x100 && a1 != 192)
            return 0xfffffffe;
        v12 = v27;
        v13 = v28;
        v14 = v29;
        v15 = v30;
        v16 = v31;
        v17 = v32;
        v18 = v33;
        v19 = v34;
        v20 = v35;
        v21 = v36;
        v22 = &v24;
        v23 = v37;
        *(unsigned int *)&a2[272] = (int)(v26) >> 5;
        v38 = &g_d2c0c0[4 * (a1 - 128 >> 6)];
        v7 = *(char *)a0;
        v39 = (char)a0[3];
        v3 = v7 * &_NSHomeDirectory | (char)a0[1] * 0x10000;
        v40 = v39 | (char)a0[2] * 0x100 | v3;
        v6 = (char)a0[4];
        v41 = (char)a0[7];
        v2 = v6 * &_NSHomeDirectory | (char)a0[5] * 0x10000;
        v42 = v41 | (char)a0[6] * 0x100 | v2;
        v5 = (char)a0[8];
        v43 = (char)a0[11];
        v1 = v5 * &_NSHomeDirectory | (char)a0[9] * 0x10000;
        v44 = v43 | (char)a0[10] * 0x100 | v1;
        v4 = (char)a0[12];
        v45 = (char)a0[15];
        v0 = v4 * &_NSHomeDirectory | (char)a0[13] * 0x10000;
        v46 = v45 | (char)a0[14] * 0x100 | v0;
        v47 = *v38 ^ v40;
        v48 = v38[1] ^ v42;
        v49 = v38[2] ^ v44;
        v50 = v38[3] ^ v46;
        v51 = (&g_d2b4c0.field_0)[__ROL__(v47, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v47 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v47, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v47 & 0xff];
        v52 = (&g_d2b4c0.field_0)[__ROL__(v49, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v49 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v49, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v49 & 0xff];
        v53 = (&g_d2b4c0.field_0)[(v50 * 0x10000 | v50 >> 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v50 >> 24) + 13807808) ^ *(int *)(4 * ((v50 * &_NSHomeDirectory | v50 >> 8) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v50 & 0xff];
        v54 = (&g_d2b4c0.field_0)[__ROL__(v48, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v48 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v48, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v48 & 0xff] ^ v52;
        v55 = v53 ^ v52;
        v56 = v54 ^ v51;
        v57 = v55 ^ v51;
        v58 = __ROL__(v55 ^ v56, 16);
        v59 = ((((((v53 ^ v54) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v53 ^ v54) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v53 ^ v54) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v53 ^ v54) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v60 = v58 ^ v59;
        v61 = v58 ^ __ROL__((unsigned int)((((((v57 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v55 ^ v51) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v57 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v55 ^ v51) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32), 16);
        v62 = v61 ^ v56;
        v10 = v41;
        v11 = v39;
        v8 = v45;
        v9 = v43;
        if (a1 >= 129)
        {
            v63 = (int)a0[16];
            v64 = (int)a0[20];
            v65 = (void*)(unsigned int)((((((v63 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v63 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v63 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v63 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
            v66 = (void*)(unsigned int)((((((v64 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v64 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v64 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v64 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
            if (a1 < 193)
                goto LABEL_9bfac4;
            v67 = (int)a0[24];
            v68 = (int)a0[28];
            v69 = (void*)(unsigned int)((((((v67 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v67 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v67 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v67 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
            v70 = (void*)(unsigned int)((((((v68 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v68 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v68 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v68 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
        }
        else
        {
            v65 = (void*)0;
            v66 = (void*)0;
LABEL_9bfac4:
            v69 = (void*)0;
            v70 = (void*)0;
        }
        v71 = v65 ^ v62;
        v72 = v38[4] ^ v71;
        v73 = v56 ^ v66 ^ v60;
        v74 = v38[5] ^ v73;
        v75 = v60 ^ v69 ^ v62;
        v76 = v59 ^ v70 ^ v61;
        v77 = v38[6] ^ v75;
        v78 = v38[7] ^ v76;
        v79 = (&g_d2bcc0.field_0)[__ROL__(v72, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v72 >> 24) + 13809856) ^ *(int *)(4 * (__ROL__(v72, 24) & 0xff0000ff & 0xff) + 13807808) ^ (&g_d2b4c0.field_0)[v72 & 0xff];
        v80 = (&g_d2bcc0.field_0)[__ROL__(v77, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v77 >> 24) + 13809856) ^ *(int *)(4 * (__ROL__(v77, 24) & 0xff0000ff & 0xff) + 13807808) ^ (&g_d2b4c0.field_0)[v77 & 0xff];
        v81 = (&g_d2bcc0.field_0)[__ROL__(v78, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v78 >> 24) + 13809856) ^ *(int *)(4 * (__ROL__(v78, 24) & 0xff0000ff & 0xff) + 13807808) ^ (&g_d2b4c0.field_0)[v78 & 0xff];
        v82 = (&g_d2bcc0.field_0)[__ROL__(v74, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v74 >> 24) + 13809856) ^ *(int *)(4 * (__ROL__(v74, 24) & 0xff0000ff & 0xff) + 13807808) ^ (&g_d2b4c0.field_0)[v74 & 0xff] ^ v80;
        v83 = v81 ^ v80;
        v84 = v82 ^ v79;
        v85 = __ROL__(v84, 16);
        v86 = v83 ^ v84;
        v87 = (unsigned int)(((((((v83 ^ v79) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v83 ^ v79) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v83 ^ v79) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v83 ^ v79) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ v86;
        v88 = v87 ^ v85;
        v89 = v88 ^ v40;
        v90 = v89 ^ v38[8];
        v91 = 0xff00ff00 & (v81 ^ v82) * 0x100 | 0xff00ff & (v81 ^ v82) >> 8;
        v92 = v91 ^ v86;
        v93 = v85 ^ v42 ^ v92;
        v94 = v93 ^ v38[9];
        v95 = v88 ^ v44 ^ v92;
        v96 = v95 ^ v38[10];
        v97 = v87 ^ v46 ^ v91;
        v98 = v97 ^ v38[11];
        v99 = (&g_d2b4c0.field_0)[__ROL__(v90, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v90 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v90, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v90 & 0xff];
        v100 = (&g_d2b4c0.field_0)[__ROL__(v96, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v96 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v96, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v96 & 0xff];
        v101 = (&g_d2b4c0.field_0)[__ROL__(v98, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v98 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v98, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v98 & 0xff];
        v102 = v101 ^ v100;
        v103 = (&g_d2b4c0.field_0)[__ROL__(v94, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v94 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v94, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v94 & 0xff] ^ v100;
        v104 = v103 ^ v99;
        v105 = __ROL__(v102 ^ v104, 16);
        *(unsigned int *)a2 = (v76 * 0x2000 | v71 >> 19) ^ v40;
        *(unsigned int *)&a2[4] = (v71 * 0x2000 | v73 >> 19) ^ v42;
        *(unsigned int *)&a2[8] = (v73 * 0x2000 | v75 >> 19) ^ v44;
        *(unsigned int *)&a2[12] = (v75 * 0x2000 | v76 >> 19) ^ v46;
        v106 = ((((((v101 ^ v103) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v101 ^ v103) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v101 ^ v103) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v101 ^ v103) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v107 = (0xff00ff00 & (v102 ^ v99) * 0x100 | 0xff00ff & (v102 ^ v99) >> 8) ^ v105;
        v108 = v107 ^ v104;
        *(unsigned int *)&a2[16] = (v97 * 0x2000 | v89 >> 19) ^ v71;
        *(unsigned int *)&a2[20] = (v89 * 0x2000 | v93 >> 19) ^ v73;
        *(unsigned int *)&a2[24] = (v93 * 0x2000 | v95 >> 19) ^ v75;
        *(unsigned int *)&a2[28] = (v95 * 0x2000 | v97 >> 19) ^ v76;
        v109 = v108 ^ v71;
        v110 = v106 ^ v76 ^ v107;
        v111 = v105 ^ v106;
        v112 = v104 ^ v73 ^ v111;
        v113 = v111 ^ v75 ^ v108;
        *(unsigned int *)&a2[32] = (v110 * 0x2000 | v109 >> 19) ^ v89;
        *(unsigned int *)&a2[36] = (v109 * 0x2000 | v112 >> 19) ^ v93;
        *(unsigned int *)&a2[40] = (v112 * 0x2000 | v113 >> 19) ^ v95;
        *(unsigned int *)&a2[44] = (v113 * 0x2000 | v110 >> 19) ^ v97;
        *(unsigned int *)&a2[48] = v109 ^ (v46 * 0x2000 | v3 >> 19);
        *(unsigned int *)&a2[52] = v112 ^ (v40 * 0x2000 | v2 >> 19);
        *(unsigned int *)&a2[56] = v113 ^ (v42 * 0x2000 | v1 >> 19);
        *(unsigned int *)&a2[60] = v110 ^ (v44 * 0x2000 | v0 >> 19);
        *(unsigned int *)&a2[64] = (v76 * 2 | v71 >> 31) ^ v40;
        *(unsigned int *)&a2[0x44] = (v71 * 2 | v73 >> 31) ^ v42;
        *(unsigned int *)&a2[72] = (v73 * 2 | v75 >> 31) ^ v44;
        *(unsigned int *)&a2[76] = (v75 * 2 | v76 >> 31) ^ v46;
        *(unsigned int *)&a2[80] = (v97 * 2 | v89 >> 31) ^ v71;
        *(unsigned int *)&a2[84] = (v89 * 2 | v93 >> 31) ^ v73;
        *(unsigned int *)&a2[88] = (v93 * 2 | v95 >> 31) ^ v75;
        *(unsigned int *)&a2[92] = (v95 * 2 | v97 >> 31) ^ v76;
        *(unsigned int *)&a2[96] = (v110 * 2 | v109 >> 31) ^ v89;
        *(unsigned int *)&a2[100] = (v109 * 2 | v112 >> 31) ^ v93;
        *(unsigned int *)&a2[104] = (v112 * 2 | v113 >> 31) ^ v95;
        *(unsigned int *)&a2[108] = (v113 * 2 | v110 >> 31) ^ v97;
        *(unsigned int *)&a2[112] = v109 ^ (v7 >> 7 | v46 * 2);
        *(unsigned int *)&a2[116] = v112 ^ (v6 >> 7 | v40 * 2);
        *(unsigned int *)&a2[120] = v113 ^ (v5 >> 7 | v42 * 2);
        *(unsigned int *)&a2[124] = v110 ^ (v4 >> 7 | v44 * 2);
        *(unsigned int *)&a2[128] = (v73 * 0x20000000 | v75 >> 3) ^ v40;
        *(unsigned int *)&a2[132] = (v75 * 0x20000000 | v76 >> 3) ^ v42;
        *(unsigned int *)&a2[0x88] = (v76 * 0x20000000 | v71 >> 3) ^ v44;
        *(unsigned int *)&a2[140] = (v71 * 0x20000000 | v73 >> 3) ^ v46;
        *(unsigned int *)&a2[144] = (v93 * 0x20000000 | v95 >> 3) ^ v71;
        *(unsigned int *)&a2[148] = (v95 * 0x20000000 | v97 >> 3) ^ v73;
        *(unsigned int *)&a2[152] = (v97 * 0x20000000 | v89 >> 3) ^ v75;
        *(unsigned int *)&a2[156] = (v89 * 0x20000000 | v93 >> 3) ^ v76;
        *(unsigned int *)&a2[160] = (v112 * 0x20000000 | v113 >> 3) ^ v89;
        *(unsigned int *)&a2[164] = (v113 * 0x20000000 | v110 >> 3) ^ v93;
        *(unsigned int *)&a2[168] = (v110 * 0x20000000 | v109 >> 3) ^ v95;
        *(unsigned int *)&a2[172] = (v109 * 0x20000000 | v112 >> 3) ^ v97;
        *(unsigned int *)&a2[176] = v109 ^ (v10 * 0x20000000 | v44 >> 3);
        *(unsigned int *)&a2[180] = v112 ^ (v9 * 0x20000000 | v46 >> 3);
        *(unsigned int *)&a2[184] = v113 ^ (v8 * 0x20000000 | v40 >> 3);
        *(unsigned int *)&a2[188] = v110 ^ (v11 * 0x20000000 | v42 >> 3);
        *(unsigned int *)&a2[192] = (v71 * 0x80000000 | v73 >> 1) ^ v40;
        *(unsigned int *)&a2[196] = (v73 * 0x80000000 | v75 >> 1) ^ v42;
        *(unsigned int *)&a2[200] = (v75 * 0x80000000 | v76 >> 1) ^ v44;
        *(unsigned int *)&a2[0xcc] = (v76 * 0x80000000 | v71 >> 1) ^ v46;
        v114 = arm64g_calculate_condition(0x33, a1, 129, 0);
        if (v114 & 1)
            return 0;
        *(unsigned int *)&a2[208] = (v89 * 0x80000000 | v93 >> 1) ^ v71;
        *(unsigned int *)&a2[212] = (v93 * 0x80000000 | v95 >> 1) ^ v73;
        *(unsigned int *)&a2[216] = (v95 * 0x80000000 | v97 >> 1) ^ v75;
        *(unsigned int *)&a2[220] = (v97 * 0x80000000 | v89 >> 1) ^ v76;
        *(unsigned int *)&a2[224] = (v109 * 0x80000000 | v112 >> 1) ^ v89;
        *(unsigned int *)&a2[228] = (v112 * 0x80000000 | v113 >> 1) ^ v93;
        *(unsigned int *)&a2[232] = (v113 * 0x80000000 | v110 >> 1) ^ v95;
        *(unsigned int *)&a2[236] = (v110 * 0x80000000 | v109 >> 1) ^ v97;
        if (a1 >= 193)
        {
            *(unsigned int *)&a2[240] = v109 ^ (v11 * 0x80000000 | v42 >> 1);
            *(unsigned int *)&a2[244] = v112 ^ (v10 * 0x80000000 | v44 >> 1);
            *(unsigned int *)&a2[248] = v113 ^ (v9 * 0x80000000 | v46 >> 1);
            *(unsigned int *)&a2[252] = v110 ^ (v8 * 0x80000000 | v40 >> 1);
            *(unsigned int *)&a2[0x100] = (v71 * 0x80000 | v73 >> 13) ^ v40;
            *(unsigned int *)&a2[260] = (v73 * 0x80000 | v75 >> 13) ^ v42;
            *(unsigned int *)&a2[264] = (v75 * 0x80000 | v76 >> 13) ^ v44;
            *(unsigned int *)&a2[268] = (v76 * 0x80000 | v71 >> 13) ^ v46;
            return 0;
        }
        return 0;
    }
    else
    {
        return 0xffffffff;
    }
}
