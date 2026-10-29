/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9db928..0x9dbad4 (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9db928(unsigned long long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    char v17;  // x9
    unsigned long long v18;  // x10
    unsigned long long v19;  // 4105
    unsigned long long v20;  // 4105
    unsigned long long v21;  // x12
    unsigned long long v22;  // 4105
    unsigned long long v23;  // 4105
    unsigned long long v24;  // x8
    unsigned long long v25;  // x9
    unsigned long v26;  // cc_dep1
    unsigned long long v9;  // x20
    unsigned long v27;  // cc_dep2
    unsigned long long v28;  // x13
    unsigned long long v29;  // x14
    unsigned long long v30;  // x15
    unsigned long long v31;  // x16
    unsigned long long v32;  // x17
    unsigned long long v33;  // 4110
    unsigned long long v34;  // 4102
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4102
    unsigned long long v10;  // x19
    unsigned long long v37;  // x16
    unsigned long long v38;  // x17
    unsigned long long v39;  // x16
    unsigned long long v40;  // x17
    unsigned long long v41;  // x16
    unsigned long long v42;  // x16
    unsigned long long v43;  // x14
    unsigned long long v44;  // x12
    unsigned long long v45;  // x11
    unsigned long long v46;  // x10
    unsigned long long v11;  // x30
    unsigned long v47;  // cc_dep1
    unsigned long v48;  // cc_dep2
    unsigned long long v49;  // x12
    unsigned long long v50;  // x14
    unsigned long long v51;  // x15
    unsigned long long v52;  // x16
    unsigned long long v53;  // x17
    unsigned long long v54;  // 4110
    unsigned long long v55;  // 4102
    unsigned long long v56;  // 4110
    unsigned long long v12;  // x21
    unsigned long long v57;  // 4102
    unsigned long long v58;  // x16
    unsigned long long v59;  // x17
    unsigned long long v60;  // x16
    unsigned long long v61;  // x17
    unsigned long long v62;  // x16
    unsigned long long v63;  // x8
    unsigned int v13;  // w0
    unsigned long long v14;  // x8
    unsigned long long v15;  // x8
    unsigned long v16;  // cc_dep1
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a2)
        return 0xffffffffffffffff;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a2;
    v13 = sub_9e4630(a2);
    if (a0 < v12)
        v14 = 0;
    else
        v14 = v12;
    v15 = a0 - v14;
    v16 = v13;
    v17 = -v13;
    if (v13 == 64)
    {
        v18 = a1;
        v19 = arm64g_calculate_condition(3, v16, 64, 0);
        if (!(v19 & 1))
            goto LABEL_9db986;
LABEL_9db985:
        v21 = v12;
        v22 = arm64g_calculate_condition(3, v16, 64, 0);
        if (!(v22 & 1))
            goto LABEL_9db98a;
LABEL_9db989:
    }
    else
    {
        v18 = a1 << (v17 & 63);
        v20 = arm64g_calculate_condition(3, v16, 64, 0);
        if (v20 & 1)
            goto LABEL_9db985;
LABEL_9db986:
        v21 = v12 << (v17 & 63);
        v23 = arm64g_calculate_condition(3, v16, 64, 0);
        if (v23 & 1)
            goto LABEL_9db989;
LABEL_9db98a:
        v15 = v15 * 2 << ((char)~v13 & 63) | a1 >> ((char)v13 & 63);
    }
    v24 = v21 >> 32;
    v25 = v21 & 0xffffffff;
    v26 = v24;
    v27 = v15 >> 32;
    if (v24 == v15 >> 32)
        v28 = 0xffffffff;
    else
        v28 = v15 / v24;
    v29 = v24 * v28;
    v30 = v25 * v28;
    v31 = v15 - v29;
    v32 = v31 * 0x100000000 | v18 >> 32;
    if (v31 <= 0xffffffff)
    {
        v33 = arm64g_calculate_condition(4, v26, v27, 0);
        v34 = arm64g_calculate_condition(148, (v33 & 1 ? v30 : 0), (v33 & 1 ? v32 : 0), 0);
        if (!(v34 & 1))
            goto LABEL_9db9dc;
    }
    else
    {
        v35 = arm64g_calculate_condition(4, v26, v27, 0);
        v36 = arm64g_calculate_condition(144, (v35 & 1 ? v30 : 0), (v35 & 1 ? v32 : 0), 0);
        if (!(v36 & 1))
        {
LABEL_9db9dc:
            v37 = v28 - 1;
            v38 = v25 * v37;
            v39 = v15 - v37 * v24;
            do
            {
                v40 = v38;
                v41 = v39;
                v28 -= 1;
                v29 -= v24;
                v30 -= v25;
            } while (v41 <= 0xffffffff && (v39 = v41 + v24, v38 = v40 - v25, (v41 * 0x100000000 | v18 >> 32) < v40));
        }
    }
    v42 = v30 * 0x100000000;
    v43 = v29 + (v30 >> 32);
    if (v42 > v18)
        v43 += 1;
    if (v15 < v43)
        v44 = v21 & 0xffffffff;
    else
        v44 = 0;
    v45 = (v15 - v43 + v44) * 0x100000000 | v18 - v42 >> 32;
    v46 = v18 * 0x100000000;
    v47 = v24;
    v48 = v45 >> 32;
    if (v24 == v45 >> 32)
        v49 = 0xffffffff;
    else
        v49 = v45 / v24;
    v50 = v24 * v49;
    v51 = v25 * v49;
    v52 = v45 - v50;
    v53 = v52 * 0x100000000 | v46 >> 32;
    if (v52 <= 0xffffffff)
    {
        v54 = arm64g_calculate_condition(4, v47, v48, 0);
        v55 = arm64g_calculate_condition(148, (v54 & 1 ? v51 : 0), (v54 & 1 ? v53 : 0), 0);
        if (!(v55 & 1))
            goto LABEL_9dba7c;
    }
    else
    {
        v56 = arm64g_calculate_condition(4, v47, v48, 0);
        v57 = arm64g_calculate_condition(144, (v56 & 1 ? v51 : 0), (v56 & 1 ? v53 : 0), 0);
        if (!(v57 & 1))
        {
LABEL_9dba7c:
            v58 = v49 - 1;
            v59 = v25 * v58;
            v60 = v45 - v58 * v24;
            do
            {
                v61 = v59;
                v62 = v60;
                v49 -= 1;
                v50 -= v24;
                v51 -= v25;
            } while (v62 <= 0xffffffff && (v60 = v62 + v24, v59 = v61 - v25, (v62 * 0x100000000 | v46 >> 32) < v61));
        }
    }
    v63 = v50 + (v51 >> 32);
    if (v51 * 0x100000000 > v46)
        v63 += 1;
    return v49 - (v63 > v45) | (v28 - (v43 > v15)) * 0x100000000;
}
