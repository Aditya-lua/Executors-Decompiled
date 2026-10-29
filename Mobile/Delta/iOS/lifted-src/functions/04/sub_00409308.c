/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x409308..0x409ec0 (3000 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_409308_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_409308_1 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_30;
    unsigned int field_34;
} st_409308_0;

typedef struct st_409308_2 {
    struct st_409308_3 *field_0;
} st_409308_2;

typedef struct st_409308_3 {
    struct st_409308_2 *field_0;
} st_409308_3;

typedef struct st_409308_1 {
    char field_0;
} st_409308_1;

extern unsigned long long g_e80838;
extern unsigned long long g_e81490;
extern unsigned int g_fffffffffffffffc;

void sub_409308(st_409308_0 *a0, long long a1)
{
    unsigned long long v22;  // x28
    unsigned long long v23;  // x27
    unsigned long long v32;  // x30
    unsigned int v33;  // w8
    unsigned int v34;  // w9
    unsigned int v35;  // w10
    unsigned int v36;  // w8
    unsigned int v37;  // w9
    int v38;  // w25
    unsigned int v39;  // w8
    unsigned long long v40;  // x8
    unsigned long long v41;  // x9
    unsigned long long v24;  // x26
    unsigned long long v42;  // x10
    unsigned long long v43;  // x8
    unsigned int v44;  // w8
    unsigned int v45;  // w9
    unsigned int v46;  // w10
    unsigned int v47;  // w11
    unsigned int v48;  // w12
    unsigned int v49;  // w8
    long long v50;  // x0
    unsigned long long v51;  // x0
    unsigned long long v25;  // x25
    unsigned long long v52;  // x8
    unsigned long long v53;  // x8
    char *v54;  // x8
    unsigned int v55;  // w8
    unsigned int v56;  // w8
    unsigned int v57;  // w9
    unsigned int v58;  // w10
    unsigned int v59;  // w8
    unsigned int v60;  // w8
    unsigned int v61;  // w8
    unsigned long long v26;  // x24
    unsigned int v62;  // w10
    unsigned int v63;  // w11
    unsigned int v64;  // w11
    unsigned int v65;  // w10
    unsigned int v66;  // w11
    unsigned int v67;  // w8
    unsigned int v68;  // w9
    unsigned int v69;  // w8
    unsigned int v70;  // w8
    unsigned int v71;  // w9
    unsigned long long v27;  // x23
    unsigned int v72;  // w10
    unsigned int v73;  // w11
    unsigned int v74;  // w9
    unsigned int v75;  // w9
    unsigned int v76;  // w9
    unsigned int v77;  // w8
    unsigned int v78;  // w9
    unsigned int v79;  // w8
    unsigned int v80;  // w9
    unsigned int v81;  // w11
    unsigned long long v28;  // x22
    unsigned long long v82;  // x10
    unsigned long long v83;  // x11
    unsigned long long v84;  // x12
    unsigned long long v85;  // x13
    unsigned long long v86;  // x14
    unsigned long long v87;  // x10
    unsigned long long v88;  // x11
    unsigned long long v89;  // x1
    unsigned int v90;  // w10
    unsigned int v91;  // w12
    unsigned long long v29;  // x21
    unsigned int v92;  // w13
    unsigned int v93;  // w14
    unsigned int v94;  // w14
    unsigned int v95;  // w12
    unsigned long long v96;  // 4369
    unsigned int v97;  // w10
    unsigned long long v98;  // x9
    unsigned long long v99;  // x10
    unsigned long long v100;  // x9
    unsigned long long v101;  // x10
    unsigned long long v30;  // x20
    unsigned int v102;  // w8
    unsigned int v103;  // w8
    unsigned int v104;  // w9
    unsigned int v105;  // w10
    unsigned int v106;  // w8
    unsigned int v107;  // w8
    unsigned int v108;  // w9
    unsigned int v109;  // w8
    unsigned long long v110;  // x9
    unsigned long long v111;  // x8
    unsigned long long v31;  // x19
    unsigned long long v112;  // x9
    unsigned long long v113;  // x8
    char *v0;  // [bp-0x98], Other Possible Types: char, unsigned int, unsigned long long
    char *v1;  // [bp-0x90], Other Possible Types: unsigned int, unsigned long long
    unsigned int v2;  // [bp-0x88]
    unsigned int v3;  // [bp-0x84]
    unsigned int v4;  // [bp-0x84]
    unsigned long long v5;  // [bp-0x80]
    unsigned long long v6;  // [bp-0x80]
    st_409308_3 **v7;  // [bp-0x78], Other Possible Types: unsigned long long
    st_409308_3 **v8;  // [bp-0x70]
    unsigned long long v9;  // [bp-0x60]
    unsigned long long v10;  // [bp-0x58]
    unsigned long long v11;  // [bp-0x50]
    unsigned long long v12;  // [bp-0x48]
    unsigned long long v13;  // [bp-0x40]
    unsigned long long v14;  // [bp-0x38]
    unsigned long long v15;  // [bp-0x30]
    unsigned long long v16;  // [bp-0x28]
    unsigned long long v17;  // [bp-0x20]
    unsigned long long v18;  // [bp-0x18]
    char *v19;  // [bp-0x10]
    unsigned long long v20;  // [bp-0x8]
    char v21;  // [bp+0x0]

    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = v30;
    v18 = v31;
    v19 = &v21;
    v20 = v32;
    v1 = &v0;
    v0 = &v1;
    v33 = (unsigned int)v1;
    v34 = (unsigned int)v0;
    v35 = ((v34 | v33) ^ -(v34 & v33)) + ((v34 | v33) & -(v34 & v33)) * 2;
    v36 = ((v35 | v33) ^ ~v35 - (v33 | ~v35)) + ((v35 | v33) & ~v35 - (v33 | ~v35)) * 2;
    v37 = v35 - v34 + (v34 & ~v35) * 2;
    v38 = (v36 ^ -v37) - (v37 ^ -v36) + ((v37 & ~v36 | v36 & -v37) - (v36 & ~v37 | v37 & -v36)) * 2;
    while (1)
    {
        v39 = (~(unsigned int)v1 - ((unsigned int)v0 | ~(unsigned int)v1) ^ ((unsigned int)v0 | (unsigned int)v1)) - ((unsigned int)v0 ^ (unsigned int)v1) + (~(unsigned int)v1 - ((unsigned int)v0 | ~(unsigned int)v1) & ((unsigned int)v0 | (unsigned int)v1)) * 2;
        *(unsigned int *)&v0 = v39 + 174;
        *(unsigned int *)&v1 = v39 + 82;
        if ((int)((unsigned int)v0 + ((unsigned int)v1 | ~(unsigned int)v0) + ((unsigned int)v1 | (unsigned int)v0) + 1) <= v38)
            break;
        v40 = v1;
        v41 = v0;
        v42 = v40 - v41 + (v41 & ~v40) * 2;
        v43 = (v42 ^ -v40) + (v42 & -v40 | v40 & ~v42) * 2;
        v5 = (v43 ^ -(v42 ^ v41)) - (v42 ^ v41 ^ -v43) + ((v43 & -(v42 ^ v41)) - (v43 & ~(v42 ^ v41) | (v42 ^ v41) & -v43) + (v43 + ~v43 * 2 + 1 & (v42 ^ v41))) * 2;
        v44 = v1;
        v45 = v0;
        v46 = v44 | v45;
        v47 = (v45 | ~v44) + v44;
        v48 = v46 + ~v47;
        v49 = v48 - v44 + (v46 - v47 + (v47 - v46) * 2 + (v44 | ~(v46 - v47 + (v47 - v46) * 2))) * 2 + 2;
        v3 = v49 - ((v48 | v45) - (v48 & v45)) + (v49 ^ (v48 | v45) - (v48 & v45)) + ((v48 | v45) - (v48 & v45) - (v49 | (v48 | v45) - (v48 & v45))) * 2;
        v7 = &v8;
        v8 = &v7;
        v50 = sub_a0c8(a1);
        v51 = sub_4a3408(v50, sub_6b08(a1));
        v52 = v51 * a0->field_0;
        v53 = (v52 ^ -(v52 >> 33)) + (v52 >> 33 & ~v52 | v52 & -(v52 >> 33)) * 2;
        v3 = a0->field_30 + (unsigned int)((v53 & 31) >> ((char)a0->field_34 & 63));
        v5 = a0->field_20 + (v53 >> 5) - (v53 >> 5 | a0->field_20);
        sub_3e94ec(a0, &v3, &v5);
        v54 = a0->field_10;
        v6 = v5;
        v4 = v3;
        while (1)
        {
            if (v3 != v54[v5])
            {
                if (a0->field_28 > a0->field_18)
                {
                    v7 = v5;
                    v80 = a0->field_30;
                    v81 = ((unsigned int)v1 - ((unsigned int)v1 | (unsigned int)v0) + ((unsigned int)v1 + ~(unsigned int)v1 * 2 + 1 & (unsigned int)v0)) * 2;
                    *(unsigned int *)&v0 = v81 + 196;
                    *(unsigned int *)&v1 = v81 + 59;
                    if (v80 + v3 > ((unsigned int)v1 + 1 ^ (unsigned int)v0) + ((unsigned int)v1 + 1 & (unsigned int)v0) * 2 - 1)
                    {
                        v82 = v1;
                        v83 = v0;
                        v84 = v83 | v82;
                        v85 = (v83 | ~v82) + v82;
                        v86 = v84 + ~v85;
                        v87 = (v85 - v84 - (v85 - v84 | v82) ^ (v86 | v82)) + (v85 - v84 - (v85 - v84 | v82) & (v86 | v82)) * 2;
                        v88 = ((v86 | v83) ^ -(v86 & v83)) + ((v86 | v83) & -(v86 & v83)) * 2;
                        a0->field_28 = (v87 | v88) + ~((v88 | ~v87) + v87) - (((v87 | v88) ^ ~v88 - (v87 | ~v88)) + ((v87 | v88) & ~v88 - (v87 | ~v88)) * 2);
                    }
                    v89 = v5;
                    v90 = v3;
                    while (1)
                    {
                        v91 = v1;
                        v92 = v0;
                        v93 = v91 + ~v91 * 2 + 1;
                        v94 = (v91 ^ -v92) + (v93 + (v91 & -v92) + (v92 | ~v93)) * 2 + 2;
                        v95 = ((v94 | v91) ^ -(v94 & v91)) + ((v94 | v91) & -(v94 & v91)) * 2;
                        v96 = arm64g_calculate_condition(1, (unsigned int)(((v94 | v92) - (v94 & v92) | ~v95) + (v94 | v92) - (v94 & v92) - (v95 | (v94 | v92) - (v94 & v92))) + (v95 & ~((v94 | v92) - (v94 & v92))) * 2 ^ v54[v89], 1, 0);
                        if (v96 & 1)
                            break;
                        v89 = v89 + (v89 | 1) + (~v89 | 1) + 1;
                        v6 = v89;
                        v97 = (v90 ^ v80 + 1) + (v90 & v80 + 1) * 2;
                        v90 = ~v97 + v97 * 2;
                        v4 = v90;
                    }
                    if (v89 != v5)
                    {
                        sub_3f97cc(a0);
                        v54 = a0->field_10;
                        v5 = v7;
                    }
                    v54[v5] = v3;
                    v98 = v0;
                    v99 = (0xffffffffffffffd8 & v98 * 2) - v98 + 19;
                    v100 = ((v99 | v98) ^ -(v99 & v98)) + ((v99 | v98) & -(v99 & v98)) * 2 + (~(((unsigned int)v99 | (unsigned int)v98) ^ (unsigned int)-(v99 & v98)) | (char *)&g_fffffffffffffffc + 2);
                    v101 = (~((unsigned int)v100 + 1) | (char *)&g_fffffffffffffffc + 2) - (v100 + 1);
                    a0->field_18 = (v101 ^ v100 + 3) + a0->field_18 + (v101 & v100 + 3) * 2;
                    if (v6 == v7)
                        v102 = 2;
                    else
                        v102 = 3;
                    v2 = v102;
                    (g_e80838 - 0x7119f900)();
                }
                else
                {
                    if (sub_4255e8(a0) & 1)
                    {
                        v56 = v1;
                        v57 = v0;
                        v58 = (v56 ^ -v57) + (v56 & -v57 | v57 & ~v56) * 2;
                        v59 = v56 - v57 + (v57 - (v56 | v57)) * 2;
                        v60 = (v59 ^ v58) + (v58 + (v59 | ~v58)) * 2;
                        *(unsigned int *)&v0 = v60 + 3;
                        *(unsigned int *)&v1 = v60 + 5;
                        v61 = (unsigned int)v0 + ((unsigned int)v1 | ~(unsigned int)v0) + ((unsigned int)v1 | (unsigned int)v0) + 1;
                        goto LABEL_409bb8;
                    }
                    else
                    {
                        v62 = v0;
                        v63 = v62 + (0xffffffd6 | ~v62) + 42;
                        v64 = (v63 ^ -(v62 & 41)) + (v63 & -(v62 & 41)) * 2;
                        v65 = (~v64 - (v62 | ~v64) ^ (v64 | v62)) + (~v64 - (v62 | ~v64) & (v64 | v62)) * 2 + (~v64 - (v62 | ~v64) ^ ~(v64 | v62) | 0xfffffffe);
                        v66 = 0xfffffffd - (v65 + 1) - (v65 + 1 | 0xfffffffe);
                        v61 = (v66 ^ v65 + 3) + (v66 & v65 + 3) * 2;
                        goto LABEL_409bb8;
                    }
                }
                goto LABEL_409bb8;
            }
            else if (!sub_20b98(a1, a0->field_8 + 48 * v5))
            {
                v5 = v6 + (v6 | 1) + (~v6 | 1) + 1;
                v6 = v5;
                v55 = a0->field_30 + 1;
                v3 = ~((v55 ^ v4) + (v55 & v4) * 2) + ((v55 ^ v4) + (v55 & v4) * 2) * 2;
                v4 = v3;
                v54 = a0->field_10;
            }
            else
            {
                v67 = v0;
                v68 = (0xffffffb4 & v67 * 2) - v67;
                v69 = 0xffffffda - v68 - ((unsigned int)(0xffffffda - v68) | v67);
                v70 = ((v68 + 37 | v67) ^ v69) + ((v68 + 37 | v67) & v69) * 2 + (((v68 + 37 | v67) ^ v69) & 1) + (2 & ~(((v68 + 37 | v67) ^ v69) * 2));
                v61 = ((-v70 | 1) ^ v70) + ((-v70 | 1) & v70) * 2;
LABEL_409bb8:
                v71 = v1;
                v72 = v0;
                v73 = ((v71 | v72) ^ -(v72 & v71)) + ((v71 | v72) & -(v72 & v71)) * 2;
                v74 = v73 + (v72 ^ v71) + (-(v72 ^ v71) & ~v73) * 2 + (unsigned int)(v73 - (v72 ^ v71) - (v73 | -(v72 ^ v71))) * 2;
                v75 = ((v74 * 2 | v74 >> 31) & 6 & 7) + (v74 ^ 3);
                v76 = ~v75 + v75 * 2;
                *(unsigned int *)&v0 = v76;
                *(unsigned int *)&v1 = v76;
                if (v61 == ((unsigned int)v0 | (unsigned int)v1) + ((unsigned int)v1 & (unsigned int)v0))
                {
                    v77 = (unsigned int)v0;
                    v78 = v77 + (~v77 | 0xfffffff8) + 8;
                    v79 = ((v78 ^ -(v77 & 7)) + (v78 & -(v77 & 7)) * 2 ^ v77) + ((v78 ^ -(v77 & 7)) + (v78 & -(v77 & 7)) * 2 ^ ~v77 | 1) + ((v78 ^ -(v77 & 7)) + (v78 & -(v77 & 7)) * 2 ^ v77 ^ 1) + 1;
                    v38 = v38 + (v79 ^ 0xfffffffe) + v79 + (1 & ~v79) + 1 + ((v79 ^ 0xfffffffe) + v79 + (1 & ~v79) + 1 | ~v38) + ((unsigned int)(0xfffffffe - ((v79 ^ 0xfffffffe) + v79 + (1 & ~v79))) & v38) + 1;
                    break;
                }
                else
                {
                    v112 = 192;
                    if (v61 == 2)
                        v112 = 96;
                    v113 = 64;
                    if (v61 == 1)
                        v112 = v113;
                    goto *((void *)(*(long long *)((char *)&g_e81490 + v112)));
                }
            }
        }
    }
    v103 = v1;
    v104 = v0;
    v105 = v103 - v104 + (v104 & ~v103) * 2;
    v106 = -((~v104 - (v103 | ~v104) ^ (v104 | v103)) + (~v104 - (v103 | ~v104) & (v104 | v103)) * 2);
    v107 = (v106 ^ v105) + (v105 + (v106 | ~v105)) * 2;
    v108 = ((v107 + 2) * 2 & 4) + (v107 + 2 ^ 2);
    v0 = ~v108 + v108 * 2;
    v1 = v107 + 3;
    v109 = v1 + v0;
    v110 = 192;
    if (v109 == 2)
        v110 = 96;
    v111 = 64;
    if (v109 == 1)
        v110 = v111;
    goto *((void *)(*(long long *)((char *)&g_e81490 + v110)));
}
