/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa08a54..0xa08d40 (748 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_d3c7c0;

unsigned long long sub_a08a54(unsigned long long *a0, char *a1, unsigned long long a2, unsigned int a3)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned int v15;  // w10
    unsigned long long v16;  // 4113
    unsigned int v17;  // w16
    unsigned long long v18;  // x15
    unsigned long v19;  // x17
    unsigned long long v20;  // x16
    unsigned long v21;  // cc_dep1
    unsigned long long v22;  // x15
    unsigned long long v23;  // 4104
    unsigned long long v24;  // 4104
    unsigned long long v7;  // x30
    unsigned long v25;  // x16
    unsigned long long v26;  // x15
    unsigned int v27;  // w15
    unsigned long long v28;  // x15
    unsigned long long v29;  // x17
    unsigned long v30;  // cc_dep1
    unsigned long long v31;  // x15
    unsigned long long v32;  // 4104
    unsigned long long v33;  // 4104
    unsigned long long v34;  // x16
    unsigned long long i;  // x8
    unsigned int v35;  // w15
    unsigned long long v36;  // x15
    unsigned long long v37;  // x17
    unsigned long v38;  // cc_dep1
    unsigned long long v39;  // x15
    unsigned long long v40;  // 4104
    unsigned long long v41;  // 4104
    unsigned long long v42;  // x16
    unsigned int v43;  // w15
    unsigned long long v44;  // x15
    unsigned long long v9;  // x13
    unsigned long long v45;  // x17
    unsigned long v46;  // cc_dep1
    unsigned long long v47;  // x15
    unsigned long long v48;  // 4104
    unsigned long long v49;  // 4104
    unsigned long long v50;  // x16
    unsigned int v51;  // w15
    unsigned long long v52;  // x15
    unsigned long long v53;  // x17
    unsigned long v54;  // cc_dep1
    unsigned long long v10;  // w14
    unsigned long long v55;  // x15
    unsigned long long v56;  // 4104
    unsigned long long v57;  // 4104
    unsigned long v58;  // x17
    unsigned int v59;  // w15
    unsigned long long v60;  // x15
    unsigned long long v61;  // x16
    unsigned long v62;  // cc_dep1
    unsigned long long v63;  // x15
    unsigned long long v64;  // 4104
    unsigned long long v11;  // x20
    unsigned long long v65;  // 4104
    unsigned int v66;  // w15
    unsigned long long v67;  // x15
    unsigned long long v68;  // x17
    unsigned long v69;  // cc_dep1
    unsigned long long v70;  // x15
    unsigned long long v71;  // 4104
    unsigned long long v72;  // 4104
    unsigned long long v73;  // x16
    unsigned long long v74;  // x15
    unsigned long long v12;  // x11
    unsigned long long v75;  // x15
    unsigned long long v76;  // 4135
    unsigned long long v77;  // 4129
    unsigned long long v78;  // x8
    unsigned long long v13;  // x19
    unsigned long long v14;  // x9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    i = 0;
    v9 = 0;
    v10 = 0;
    v11 = 0;
    v12 = 0;
    v13 = 0;
    v14 = 0;
    v15 = ~a3;
    do
    {
        if (55 < v10 || 55 < v9)
            continue;
        v16 = arm64g_calculate_condition(4, v9, 55, 0);
        if (v16 & 1)
            v17 = v15;
        else
            v17 = 0xffffffff;
        v18 = a1[v9] & v17;
        v19 = v10;
        v20 = (v18 & 0xff) << ((char)v19 & 63);
        v21 = v19 & 64;
        if (v19 & 64)
        {
            v22 = v20;
            v23 = arm64g_calculate_condition(26, v21, 0, 0);
            if (!(v23 & 1))
                goto LABEL_a08b12;
            goto LABEL_a08b11;
        }
        else
        {
            v22 = ((v18 * 0x8000000000000000 | v18 >> 1) & 9223372036854775935 & 127) >> ((char)~v10 & 63);
            v24 = arm64g_calculate_condition(26, v21, 0, 0);
            if (v24 & 1)
            {
LABEL_a08b11:
                v20 = 0;
                goto LABEL_a08b14;
            }
            else
            {
LABEL_a08b12:
LABEL_a08b14:
                v14 |= v22;
                v13 |= v20;
                v25 = v10 + 8;
                v26 = v9 + 1;
                if (47 < v10 || 54 < v9)
                {
LABEL_a08a8c:
                    v9 = v26 & 0xffffffff;
                    v10 = (unsigned int)v25;
                }
                else
                {
                    if (v26 == 55)
                        v27 = v15;
                    else
                        v27 = 0xffffffff;
                    v28 = a1[v26] & v27;
                    v29 = (v28 & 0xff) << ((char)v25 & 63);
                    v30 = v25 & 64;
                    if (v25 & 64)
                    {
                        v31 = v29;
                        v32 = arm64g_calculate_condition(26, v30, 0, 0);
                        if (!(v32 & 1))
                            goto LABEL_a08b62;
                    }
                    else
                    {
                        v31 = ((v28 * 0x8000000000000000 | v28 >> 1) & 9223372036854775935 & 127) >> ((char)~(unsigned int)v25 & 63);
                        v33 = arm64g_calculate_condition(26, v30, 0, 0);
                        if (!(v33 & 1))
                        {
LABEL_a08b62:
                            v34 = v29;
LABEL_a08b64:
                            v14 |= v31;
                            v13 |= v34;
                            v25 = v10 + 16;
                            v26 = v9 + 2;
                            if (39 < v10 || 53 < v9)
                                goto LABEL_a08a8c;
                            if (v26 == 55)
                                v35 = v15;
                            else
                                v35 = 0xffffffff;
                            v36 = a1[v26] & v35;
                            v37 = (v36 & 0xff) << ((char)v25 & 63);
                            v38 = v25 & 64;
                            if (v25 & 64)
                            {
                                v39 = v37;
                                v40 = arm64g_calculate_condition(26, v38, 0, 0);
                                if (!(v40 & 1))
                                    goto LABEL_a08bb2;
                            }
                            else
                            {
                                v39 = ((v36 * 0x8000000000000000 | v36 >> 1) & 9223372036854775935 & 127) >> ((char)~(unsigned int)v25 & 63);
                                v41 = arm64g_calculate_condition(26, v38, 0, 0);
                                if (!(v41 & 1))
                                {
LABEL_a08bb2:
                                    v42 = v37;
LABEL_a08bb4:
                                    v14 |= v39;
                                    v13 |= v42;
                                    v25 = v10 + 24;
                                    v26 = v9 + 3;
                                    if (31 < v10 || 52 < v9)
                                        goto LABEL_a08a8c;
                                    if (v26 == 55)
                                        v43 = v15;
                                    else
                                        v43 = 0xffffffff;
                                    v44 = a1[v26] & v43;
                                    v45 = (v44 & 0xff) << ((char)v25 & 63);
                                    v46 = v25 & 64;
                                    if (v25 & 64)
                                    {
                                        v47 = v45;
                                        v48 = arm64g_calculate_condition(26, v46, 0, 0);
                                        if (!(v48 & 1))
                                            goto LABEL_a08c02;
                                    }
                                    else
                                    {
                                        v47 = ((v44 * 0x8000000000000000 | v44 >> 1) & 9223372036854775935 & 127) >> ((char)~(unsigned int)v25 & 63);
                                        v49 = arm64g_calculate_condition(26, v46, 0, 0);
                                        if (!(v49 & 1))
                                        {
LABEL_a08c02:
                                            v50 = v45;
LABEL_a08c04:
                                            v14 |= v47;
                                            v13 |= v50;
                                            v25 = v10 | 32;
                                            v26 = v9 + 4;
                                            if (23 < v10 || 0x33 < v9)
                                                goto LABEL_a08a8c;
                                            if (v26 == 55)
                                                v51 = v15;
                                            else
                                                v51 = 0xffffffff;
                                            v52 = a1[v26] & v51;
                                            v53 = (v52 & 0xff) << ((char)v25 & 63);
                                            v54 = v25 & 64;
                                            if (v25 & 64)
                                            {
                                                v55 = v53;
                                                v56 = arm64g_calculate_condition(26, v54, 0, 0);
                                                if (!(v56 & 1))
                                                    goto LABEL_a08c52;
                                            }
                                            else
                                            {
                                                v55 = ((v52 * 0x8000000000000000 | v52 >> 1) & 9223372036854775935 & 127) >> ((char)~(unsigned int)v25 & 63);
                                                v57 = arm64g_calculate_condition(26, v54, 0, 0);
                                                if (!(v57 & 1))
                                                {
LABEL_a08c52:
LABEL_a08c54:
                                                    v14 |= v55;
                                                    v13 |= v53;
                                                    v58 = v10 + 40;
                                                    v26 = v9 + 5;
                                                    if (47 < (unsigned int)v25 || 50 < v9)
                                                    {
                                                        v25 = v58;
                                                        goto LABEL_a08a8c;
                                                    }
                                                    if (v26 == 55)
                                                        v59 = v15;
                                                    else
                                                        v59 = 0xffffffff;
                                                    v60 = a1[v26] & v59;
                                                    v61 = (v60 & 0xff) << ((char)v58 & 63);
                                                    v62 = v58 & 64;
                                                    if (v58 & 64)
                                                    {
                                                        v63 = v61;
                                                        v64 = arm64g_calculate_condition(26, v62, 0, 0);
                                                        if (!(v64 & 1))
                                                            goto LABEL_a08ca2;
                                                    }
                                                    else
                                                    {
                                                        v63 = ((v60 * 0x8000000000000000 | v60 >> 1) & 9223372036854775935 & 127) >> ((char)~(unsigned int)v58 & 63);
                                                        v65 = arm64g_calculate_condition(26, v62, 0, 0);
                                                        if (!(v65 & 1))
                                                        {
LABEL_a08ca2:
LABEL_a08ca4:
                                                            v14 |= v63;
                                                            v13 |= v61;
                                                            v25 = v10 + 48;
                                                            v26 = v9 + 6;
                                                            if (7 < v10 || 49 < v9)
                                                                goto LABEL_a08a8c;
                                                            if (v26 == 55)
                                                                v66 = v15;
                                                            else
                                                                v66 = 0xffffffff;
                                                            v67 = a1[v26] & v66;
                                                            v68 = (v67 & 0xff) << ((char)v25 & 63);
                                                            v69 = v25 & 64;
                                                            if (v25 & 64)
                                                            {
                                                                v70 = v68;
                                                                v71 = arm64g_calculate_condition(26, v69, 0, 0);
                                                                if (!(v71 & 1))
                                                                    goto LABEL_a08cf2;
                                                            }
                                                            else
                                                            {
                                                                v70 = ((v67 * 0x8000000000000000 | v67 >> 1) & 9223372036854775935 & 127) >> ((char)~(unsigned int)v25 & 63);
                                                                v72 = arm64g_calculate_condition(26, v69, 0, 0);
                                                                if (!(v72 & 1))
                                                                {
LABEL_a08cf2:
                                                                    v73 = v68;
LABEL_a08cf4:
                                                                    v14 |= v70;
                                                                    v13 |= v73;
                                                                    v25 = v10 | 56;
                                                                    v26 = v9 + 7;
                                                                    goto LABEL_a08a8c;
                                                                }
                                                            }
                                                            v73 = 0;
                                                            goto LABEL_a08cf4;
                                                        }
                                                    }
                                                    v61 = 0;
                                                    goto LABEL_a08ca4;
                                                }
                                            }
                                            v53 = 0;
                                            goto LABEL_a08c54;
                                        }
                                    }
                                    v50 = 0;
                                    goto LABEL_a08c04;
                                }
                            }
                            v42 = 0;
                            goto LABEL_a08bb4;
                        }
                    }
                    v34 = 0;
                    goto LABEL_a08b64;
                }
            }
        }
        v74 = v13 & 0xffffffffffffff;
        if (i == 56)
            v74 = v13;
        v75 = v74;
        *(unsigned long long *)((char *)a0 + i) = v75;
        v10 -= 56;
        v13 = v14 * 0x100 | v13 >> 56;
        v14 >>= 56;
        v76 = arm64g_calculate_condition(50, v11, v75, 0);
        if (!(v76 & 1))
            v12 += 1;
        v77 = arm64g_calculate_flag_c(4, v11 + v75, *(long long *)((char *)&g_d3c7c0 + i), 0);
        v11 = v12 - (v77 ^ 1);
        v12 = (long long)(v11) >> 63;
        i += 8;
    } while (i != 64);
    if (a2)
        v78 = 0xffffffffffffffff;
    else
        v78 = ~sub_a087ac();
    if (v13)
        v78 = 0;
    if (v11)
        return v78;
    return 0;
}
