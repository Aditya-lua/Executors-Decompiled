/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa05544..0xa05934 (1008 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_d37300;
extern long long g_d37340;
extern char g_10002b0;

unsigned long long sub_a05544(unsigned long a0, unsigned long long a1, long long a2)
{
    uint128_t i;  // x24
    uint128_t j;  // x28
    unsigned long long v31;  // x11
    unsigned int v32;  // w10
    unsigned long long v33;  // x9
    unsigned long long v34;  // x11
    unsigned int v35;  // w10
    unsigned long long v36;  // x8
    uint128_t k;  // x9
    uint128_t v38;  // q0
    unsigned int v39;  // w8
    unsigned long long v40;  // x11
    uint128_t v23;  // x27
    uint128_t v41;  // q1
    uint128_t v42;  // q2
    uint128_t v43;  // q3
    uint128_t v44;  // q4
    uint128_t v45;  // q5
    unsigned long long v46;  // x10
    unsigned long long v47;  // x11
    uint128_t v48;  // q6
    uint128_t v49;  // q7
    uint128_t v50;  // q16
    unsigned long long v24;  // x19
    uint128_t v51;  // q17
    uint128_t v52;  // q18
    uint128_t v53;  // q19
    uint128_t v54;  // q20
    uint128_t *v55;  // x12
    unsigned long v56;  // x25
    uint128_t v57;  // q0
    uint128_t v58;  // q1
    uint128_t v59;  // q2
    uint128_t v60;  // q4
    unsigned long long v25;  // x8
    uint128_t v61;  // q3
    uint128_t v62;  // q5
    uint128_t v63;  // q0
    uint128_t v64;  // q3
    uint128_t v65;  // q4
    uint128_t v66;  // q1
    uint128_t v67;  // q2
    uint128_t v68;  // q4
    uint128_t v69;  // q0
    uint128_t v70;  // q3
    unsigned int v26;  // w9
    uint128_t v71;  // q5
    uint128_t v72;  // q2
    unsigned long long v73;  // x0
    unsigned long long v27;  // x9
    unsigned long long v28;  // x11
    unsigned int v29;  // w10
    unsigned long long v30;  // x9
    uint128_t v0;  // [bp-0x1d0]
    unsigned long long v1;  // [bp-0x1b8]
    uint128_t v2;  // [bp-0x180], Other Possible Types: uint128_t
    uint128_t v3;  // [bp-0x170], Other Possible Types: uint128_t
    uint128_t v4;  // [bp-0x160], Other Possible Types: uint128_t
    uint128_t v5;  // [bp-0x150], Other Possible Types: uint128_t
    uint128_t v6;  // [bp-0x140], Other Possible Types: uint128_t
    uint128_t v7;  // [bp-0x130], Other Possible Types: uint128_t
    uint128_t v8;  // [bp-0x120], Other Possible Types: uint128_t
    uint128_t v9;  // [bp-0x110], Other Possible Types: uint128_t
    uint128_t v10;  // [bp-0x100], Other Possible Types: uint128_t
    uint128_t v11;  // [bp-0xf0]
    uint128_t v12;  // [bp-0xe0]
    uint128_t v13;  // [bp-0xd0]
    uint128_t v14;  // [bp-0xc0]
    uint128_t v15;  // [bp-0xb0]
    uint128_t v16;  // [bp-0xa0]
    uint128_t v17;  // [bp-0x90]
    unsigned long v18;  // [bp-0x78]
    char *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    v19 = &v20;
    v18 = *(long long *)&g_10002b0;
    sub_a09b60(&v1, a2, &g_d37340);
    sub_a0a654(&v1, &v1);
    i = 18;
    do
    {
        if (i != 18)
            sub_a04f78(a0, a0, 0);
        j = 0;
        v23 = i - 1;
        v24 = a1;
        do
        {
            v25 = v23 + 90 * j;
            v26 = (&v1)[(v25 * 0x400000000000000 | v25 >> 6) & 0xfc00000003ffffff & 0x3ffffff] >> ((char)v25 & 63);
            v27 = v25 + 18;
            v28 = (&v1)[(v27 * 0x400000000000000 | v27 >> 6) & 0xfc00000003ffffff & 0x3ffffff];
            v29 = v26 & 1 & 0xfffffffc | (v26 & 1 & 0xfffffffd | ((unsigned int)(v28 >> ((char)v27 & 63)) * 2 | (unsigned int)(v28 >> ((char)v27 & 63)) >> 31) & 2) & 3;
            v30 = v25 + 36;
            v31 = (&v1)[(v30 * 0x400000000000000 | v30 >> 6) & 0xfc00000003ffffff & 0x3ffffff];
            v32 = v29 & 0xfffffff8 | (v29 & 0xfffffffb | ((unsigned int)(v31 >> ((char)v30 & 63)) * 4 | (unsigned int)(v31 >> ((char)v30 & 63)) >> 30) & 4) & 7;
            v33 = v25 + 54;
            v34 = (&v1)[(v33 * 0x400000000000000 | v33 >> 6) & 0xfc00000003ffffff & 0x3ffffff];
            v35 = v32 & 0xfffffff0 | (v32 & 0xfffffff7 | ((unsigned int)(v34 >> ((char)v33 & 63)) * 8 | (unsigned int)(v34 >> ((char)v33 & 63)) >> 29) & 8) & 15;
            v36 = v25 + 72;
            if (445 >= v36)
                v35 = v35 & 0xffffffe0 | (v35 & 0xffffffef | __ROL__((int)((unsigned long long)(*(long long *)((char *)&v1 + (v36 >> 3 & 0x1ffffffffffffff8))) >> ((char)v36 & 63)), 4) & 16) & 31;
            k = 0;
            v38 = 0;
            v12 = 0;
            v13 = 0;
            v39 = (v35 >> 4) - 1;
            v10 = 0;
            v11 = 0;
            v40 = (v39 ^ v35) & 15;
            v8 = 0;
            v9 = 0;
            v41 = 0;
            v42 = 0;
            v7 = 0;
            v5 = 0;
            v6 = 0;
            v43 = 0;
            v44 = 0;
            v45 = 0;
            v3 = 0;
            v4 = 0;
            v46 = v40 - 1;
            v47 = ~v40;
            v48 = 0;
            v49 = 0;
            v50 = 0;
            v51 = 0;
            v52 = 0;
            v53 = 0;
            v2 = 0;
            do
            {
                v54 = CONCAT((unsigned int)((long long)(v46 & v47) >> 63) & 0xff | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff) * 0x100 | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff) * 0x100) * 0x10000 | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff) * 0x100 | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff) * 0x100) * 0x10000) * 0x100000000, (unsigned int)((long long)(v46 & v47) >> 63) & 0xff | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff) * 0x100 | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff) * 0x100) * 0x10000 | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff) * 0x100 | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff | ((unsigned int)((long long)(v46 & v47) >> 63) & 0xff) * 0x100) * 0x10000) * 0x100000000);
                v55 = (uint128_t *)(v24 + k);
                v53 |= *v55 & v54;
                v52 |= v55[1] & v54;
                v51 |= v55[2] & v54;
                v50 |= v55[3] & v54;
                v49 |= v55[4] & v54;
                v48 |= v55[5] & v54;
                v45 |= v55[6] & v54;
                v44 |= v55[7] & v54;
                v43 |= v55[8] & v54;
                v42 |= v55[9] & v54;
                v41 |= v55[10] & v54;
                v38 |= v55[11] & v54;
                v46 -= 1;
                v47 += 1;
                k += 192;
            } while (k != 0xc00);
            v2 = v53;
            v3 = v52;
            v4 = v51;
            v5 = v50;
            v6 = v49;
            v7 = v48;
            v8 = v45;
            v9 = v44;
            v10 = v43;
            v11 = v42;
            v12 = v41;
            v13 = v38;
            v56 = v39;
            v57 = v6;
            v58 = v2;
            v59 = v3;
            v60 = CONCAT(v56, v56);
            v61 = (v58 ^ v57) & v60;
            v62 = v60;
            v0 = v60;
            v6 = v57 ^ v61;
            v63 = v7;
            v64 = v8;
            v65 = (v59 ^ v63) & v62;
            v2 = v58 ^ v61;
            v3 = v59 ^ v65;
            v66 = v4;
            v67 = v5;
            v68 = (v66 ^ v64) & v62;
            v7 = v63 ^ v65;
            v8 = v64 ^ v68;
            v69 = v9;
            v70 = (v67 ^ v69) & v62;
            v4 = v66 ^ v68;
            v5 = v67 ^ v70;
            v9 = v69 ^ v70;
            sub_a08d40(&v14, &g_d37300, &v10);
            v71 = v0;
            v72 = CONCAT(~v56, ~v56);
            v10 = v10 & v72 | v14 & v71;
            v11 = v11 & v72 | v15 & v71;
            v12 = v12 & v72 | v16 & v71;
            v13 = v13 & v72 | v17 & v71;
            if (i != 18 || j)
            {
                sub_a05934();
            }
            else
            {
                sub_a088cc(a0 + 64, &v6, &v2);
                sub_a08d40(a0, &v6, &v2);
                sub_a04850(a0 + 192, a0 + 64, a0);
                *(uint128_t *)(a0 + 128) = 1;
                memset(a0 + 144, 0, 48);
            }
            j += 1;
            v24 += 0xc00;
        } while (j != 5);
        i = v23;
    } while (i);
    sub_a66ec0(&v2, 192);
    v73 = sub_a66ec0(&v1, 56);
    if (*(long long *)&g_10002b0 == v18)
        return v73;
    ___stack_chk_fail();
}
