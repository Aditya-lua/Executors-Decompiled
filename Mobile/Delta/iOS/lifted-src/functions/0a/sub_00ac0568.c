/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac0568..0xac08e4 (892 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ac0568(void* a0, void* a1)
{
    void* iter;  // x19
    unsigned int *v6;  // x21
    unsigned long long v15;  // x10
    unsigned long v16;  // x11
    unsigned long long v17;  // x12
    unsigned long long v18;  // x13
    unsigned long long v19;  // x14
    unsigned long v20;  // x15
    unsigned long long v21;  // x16
    unsigned long long v22;  // x17
    unsigned long long v23;  // x0
    unsigned long v24;  // x1
    unsigned long v7;  // x9
    unsigned long long v25;  // x2
    unsigned long long v26;  // x3
    unsigned long long v27;  // x4
    unsigned long v28;  // x5
    unsigned long long v29;  // x6
    unsigned long long v30;  // x7
    unsigned long long v31;  // x21
    unsigned long v32;  // x23
    unsigned long long v33;  // x24
    unsigned long long v34;  // x25
    unsigned long v8;  // x8
    void* v35;  // x26
    unsigned long v36;  // x8
    void* v37;  // x26
    void* v38;  // x27
    void* v39;  // x27
    unsigned long long v40;  // 4102
    unsigned long long v41;  // x8
    unsigned long v42;  // x9
    unsigned int v43;  // w26
    unsigned long v9;  // x9
    unsigned int v46;  // w27
    unsigned int v47;  // w22
    unsigned int v48;  // w6
    unsigned int v49;  // w2
    unsigned int v50;  // w16
    unsigned int v51;  // w12
    unsigned long v10;  // x8
    unsigned long long v11;  // x22
    unsigned long long v12;  // x8
    unsigned long long v13;  // x9
    unsigned int v14;  // w26
    unsigned long long v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x70]
    unsigned long long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    iter = a0;
    v6 = a1 + 40;
    v7 = (int)a1[104];
    *((char *)v6 + v7) = 128;
    v8 = v7 + 1;
    if ((unsigned int)v7 >= 56)
    {
        _bzero((char *)v6 + v8, 63 - v7);
        sub_abe680(a1, v6, 1);
        v8 = 0;
    }
    _bzero((char *)v6 + v8, 56 - v8);
    v9 = (int)a1[32];
    v10 = (int)a1[36];
    *(unsigned int *)&a1[96] = (((((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    *(unsigned int *)&a1[100] = (((((v9 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v9 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v9 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v9 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v11 = 1;
    sub_abe680(a1, v6, 1);
    *(unsigned int *)&a1[104] = 0;
    sub_a66ec0(v6, 64);
    v12 = 23;
    v13 = 22;
    v15 = 21;
    v16 = 20;
    v17 = 19;
    v18 = 18;
    v19 = 0x11;
    v20 = 16;
    v21 = 15;
    v22 = 14;
    v23 = 13;
    v24 = 12;
    v25 = 11;
    v26 = 10;
    v27 = 9;
    v28 = 8;
    v29 = 7;
    v30 = 6;
    v31 = 5;
    v32 = 4;
    v33 = 3;
    v34 = 2;
    switch (v14)
    {
    case 24:
        v46 = *(int *)a1;
        *(char *)iter = v46 >> 24;
        *(char *)&iter[1] = v46 >> 16;
        *(char *)&iter[2] = v46 >> 8;
        *(char *)&iter[3] = v46;
        v47 = (int)a1[4];
        *(char *)&iter[4] = v47 >> 24;
        *(char *)&iter[5] = v47 >> 16;
        *(char *)&iter[6] = v47 >> 8;
        *(char *)&iter[7] = v47;
        v48 = (int)a1[8];
        *(char *)&iter[8] = v48 >> 24;
        *(char *)&iter[9] = v48 >> 16;
        *(char *)&iter[10] = v48 >> 8;
        *(char *)&iter[11] = v48;
        v49 = (int)a1[12];
        *(char *)&iter[12] = v49 >> 24;
        *(char *)&iter[13] = v49 >> 16;
        *(char *)&iter[14] = v49 >> 8;
        *(char *)&iter[15] = v49;
        v50 = (int)a1[16];
        *(char *)&iter[16] = v50 >> 24;
        *(char *)&iter[0x11] = v50 >> 16;
        *(char *)&iter[18] = v50 >> 8;
        *(char *)&iter[19] = v50;
        v51 = (int)a1[20];
        *(char *)&iter[20] = v51 >> 24;
        *(char *)&iter[21] = v51 >> 16;
        *(char *)&iter[22] = v51 >> 8;
        *(char *)&iter[23] = v51;
        return 1;
    case 28:
        v2 = 27;
        v1 = 26;
        v0 = 25;
        x30 = 24;
        v37 = a1;
        v39 = iter;
        break;
    case 32:
        v35 = a1;
        v36 = *(int *)v35;
        v37 = v35 + 4;
        v38 = iter;
        *(unsigned int *)v38 = (((((v36 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v36 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v36 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v36 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v39 = v38 + 4;
        v2 = 31;
        v1 = 30;
        v0 = 29;
        x30 = 28;
        v12 = 27;
        v13 = 26;
        v15 = 25;
        v16 = 24;
        v17 = 23;
        v18 = 22;
        v19 = 21;
        v20 = 20;
        v21 = 19;
        v22 = 18;
        v23 = 0x11;
        v24 = 16;
        v25 = 15;
        v26 = 14;
        v27 = 13;
        v28 = 12;
        v29 = 11;
        v30 = 10;
        v31 = 9;
        v32 = 8;
        v33 = 7;
        v34 = 6;
        v11 = 5;
        break;
    default:
        v40 = arm64g_calculate_condition(147, (int)a1[108], 32, 0);
        if (!(v40 & 1))
        {
            return 0;
        }
        else if ((unsigned int)(int)a1[108] < 4)
        {
            return 1;
        }
        else
        {
            v41 = 0;
            do
            {
                v42 = *(int *)((char *)a1 + 4 * v41);
                *(unsigned int *)iter = (((((v42 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v42 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v42 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v42 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                iter += 4;
                v41 += 1;
            } while (v41 < (unsigned int)((int)a1[108]) >> 2);
            return 1;
        }
    }
    v43 = *(int *)v37;
    *(char *)v39 = v43 >> 24;
    *((char *)iter + v11) = v43 >> 16;
    *((char *)iter + v34) = v43 >> 8;
    *((char *)iter + v33) = v43;
    v32 = v28;
    v24 = v20;
    v16 = x30;
    v20 = v16;
    v28 = v24;
    v46 = *(int *)((char *)a1 + v32);
    *((char *)iter + v32) = v46 >> 24;
    *((char *)iter + v31) = v46 >> 16;
    *((char *)iter + v30) = v46 >> 8;
    *((char *)iter + v29) = v46;
    v47 = *(int *)((char *)a1 + v32);
    *((char *)iter + v32) = v47 >> 24;
    *((char *)iter + v27) = v47 >> 16;
    *((char *)iter + v26) = v47 >> 8;
    *((char *)iter + v25) = v47;
    v48 = *(int *)((char *)a1 + v28);
    *((char *)iter + v28) = v48 >> 24;
    *((char *)iter + v23) = v48 >> 16;
    *((char *)iter + v22) = v48 >> 8;
    *((char *)iter + v21) = v48;
    v49 = *(int *)((char *)a1 + v24);
    *((char *)iter + v24) = v49 >> 24;
    *((char *)iter + v19) = v49 >> 16;
    *((char *)iter + v18) = v49 >> 8;
    *((char *)iter + v17) = v49;
    v50 = *(int *)((char *)a1 + v20);
    *((char *)iter + v20) = v50 >> 24;
    *((char *)iter + v15) = v50 >> 16;
    *((char *)iter + v13) = v50 >> 8;
    *((char *)iter + v12) = v50;
    v51 = *(int *)((char *)a1 + v16);
    *((char *)iter + v16) = v51 >> 24;
    *((char *)iter + v0) = v51 >> 16;
    *((char *)iter + v1) = v51 >> 8;
    *((char *)iter + v2) = v51;
    return 1;
}
