/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bf33c..0x9bf864 (1320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9bf33c_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9bf33c_0;

extern void g_d2b4c0;
extern st_9bf33c_0 g_d2bcc0;
extern char _NSHomeDirectory;

int sub_9bf33c(void* a0, void* a1, void* a2)
{
    unsigned int v0;  // w15
    unsigned int v1;  // w8
    unsigned long v4;  // cc_dep2
    unsigned long v5;  // cc_ndep
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // x8
    unsigned long v11;  // x9
    unsigned long v12;  // x9
    unsigned long v13;  // x11
    unsigned int v14;  // w16
    unsigned int v15;  // w14
    unsigned int v16;  // w13
    unsigned int v17;  // w17
    unsigned int v18;  // w16
    unsigned int v19;  // w13
    unsigned int v20;  // w17
    unsigned int v21;  // w14
    unsigned int v22;  // w13
    unsigned int v23;  // w3
    unsigned int v24;  // w13
    unsigned int v25;  // w16
    unsigned int v26;  // w4
    unsigned int v27;  // w13
    unsigned int v28;  // w14
    unsigned int v29;  // w0
    unsigned int v30;  // w6
    unsigned int v31;  // w3
    unsigned int v32;  // w17
    unsigned int v33;  // w16
    unsigned int *iter;  // x13
    unsigned int i;  // w15
    unsigned int v36;  // w2
    unsigned int v37;  // w17
    unsigned int v38;  // w16
    unsigned int v39;  // w0
    unsigned int v40;  // w17
    unsigned int v41;  // w3
    unsigned int v42;  // w0
    unsigned int v43;  // w16
    unsigned int v44;  // w2
    unsigned int v45;  // w17
    unsigned int v46;  // w0
    unsigned int v47;  // w3
    unsigned int v48;  // w4
    unsigned int v49;  // w2
    unsigned int v50;  // w0
    unsigned int v51;  // w16
    unsigned long long v2;  // 4112
    unsigned int v52;  // w17
    unsigned int v53;  // w0
    unsigned int v54;  // w16
    unsigned int v55;  // w2
    unsigned int v56;  // w0
    unsigned int v57;  // w3
    unsigned int v58;  // w0
    unsigned int v59;  // w16
    unsigned int v60;  // w2
    unsigned int v61;  // w17
    unsigned long long v3;  // 4102
    unsigned int v62;  // w5
    unsigned int v63;  // w12
    unsigned int v64;  // w14
    unsigned int v65;  // w12
    unsigned int v66;  // w14
    unsigned int v67;  // w2
    unsigned int v68;  // w14
    unsigned int v69;  // w15
    unsigned int v70;  // w0
    unsigned int v71;  // w13
    unsigned int v72;  // w10
    unsigned int v73;  // w11
    unsigned int v74;  // w15
    unsigned int v75;  // w9
    unsigned int v76;  // w8
    unsigned int v77;  // w8

    if (a0 && a1 && a2)
    {
        v0 = (int)a2[272];
        v1 = 1 << ((char)v0 & 31) & 0x15000;
        if (v0 <= 16)
        {
            v2 = arm64g_calculate_condition(v8 | 144, v9, v4, v5);
            v3 = arm64g_calculate_condition(3, (v2 & 1 ? v1 : 0x40000000), 0, 0);
            if (!(v3 & 1))
                goto LABEL_9bf36c;
        }
        else
        {
            v6 = arm64g_calculate_condition(v8 | 144, v9, v4, v5);
            v7 = arm64g_calculate_condition(0, (v6 & 1 ? v1 : 0x40000000), 0, 0);
            if (!(v7 & 1))
            {
LABEL_9bf36c:
                v10 = *(int *)a0;
                v11 = (int)a0[4];
                v12 = (int)a0[8];
                v13 = (int)a0[12];
                v14 = *(int *)a2 ^ (unsigned int)((((((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
                v15 = (int)a2[4] ^ (unsigned int)((((((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
                v16 = (int)a2[8] ^ (unsigned int)((((((v12 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v12 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v12 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v12 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
                v17 = (int)a2[12] ^ (unsigned int)((((((v13 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v13 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v13 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v13 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
                v18 = *(int *)&(&g_d2b4c0)[4 * (__ROL__(v14, 16) & 0xffff00ff & 0xff)] ^ *(int *)(4 * (v14 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v14, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v14 & 0xff];
                v19 = *(int *)&(&g_d2b4c0)[4 * (__ROL__(v16, 16) & 0xffff00ff & 0xff)] ^ *(int *)(4 * (v16 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v16, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v16 & 0xff];
                v20 = *(int *)&(&g_d2b4c0)[4 * (__ROL__(v17, 16) & 0xffff00ff & 0xff)] ^ *(int *)(4 * (v17 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v17, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v17 & 0xff];
                v21 = *(int *)&(&g_d2b4c0)[4 * (__ROL__(v15, 16) & 0xffff00ff & 0xff)] ^ *(int *)(4 * (v15 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v15, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v15 & 0xff] ^ v19;
                v22 = v20 ^ v19;
                v23 = v21 ^ v18;
                v24 = ((((((v22 ^ v18) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v22 ^ v18) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v22 ^ v18) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v22 ^ v18) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                v25 = __ROL__(v22 ^ v23, 16);
                v26 = ((((((v20 ^ v21) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v20 ^ v21) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v20 ^ v21) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v20 ^ v21) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                v27 = v25 ^ (v24 * 0x10000 | v24 >> 16);
                v28 = v25 ^ v26;
                v29 = (int)a2[20] ^ v23 ^ v28;
                v30 = v27 ^ v23;
                v31 = v30 ^ (int)a2[16];
                v32 = v28 ^ (int)a2[24] ^ v30;
                v33 = (int)a2[28] ^ v26 ^ v27;
                iter = a2 + 32;
                i = v0 + 2;
                do
                {
                    v36 = (&g_d2bcc0.field_0)[__ROL__(v31, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v31 >> 24) + 13809856) ^ *(int *)(4 * (__ROL__(v31, 24) & 0xff0000ff & 0xff) + 13807808) ^ *(int *)&(&g_d2b4c0)[4 * (v31 & 0xff)];
                    v37 = (&g_d2bcc0.field_0)[__ROL__(v32, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v32 >> 24) + 13809856) ^ *(int *)(4 * (__ROL__(v32, 24) & 0xff0000ff & 0xff) + 13807808) ^ *(int *)&(&g_d2b4c0)[4 * (v32 & 0xff)];
                    v38 = (&g_d2bcc0.field_0)[__ROL__(v33, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v33 >> 24) + 13809856) ^ *(int *)(4 * (__ROL__(v33, 24) & 0xff0000ff & 0xff) + 13807808) ^ *(int *)&(&g_d2b4c0)[4 * (v33 & 0xff)];
                    v39 = (&g_d2bcc0.field_0)[__ROL__(v29, 16) & 0xffff00ff & 0xff] ^ *(int *)(4 * (v29 >> 24) + 13809856) ^ *(int *)(4 * (__ROL__(v29, 24) & 0xff0000ff & 0xff) + 13807808) ^ *(int *)&(&g_d2b4c0)[4 * (v29 & 0xff)] ^ v37;
                    v40 = v38 ^ v37;
                    v41 = v39 ^ v36;
                    v42 = v40 ^ v41;
                    v43 = 0xff00ff00 & (v38 ^ v39) * 0x100 | 0xff00ff & (v38 ^ v39) >> 8;
                    v44 = __ROL__(v41, 16);
                    v45 = (unsigned int)(((((((v40 ^ v36) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v40 ^ v36) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v40 ^ v36) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v40 ^ v36) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ v42;
                    v46 = v43 ^ v42;
                    v47 = v45 ^ v44;
                    v48 = v47 ^ *iter;
                    v49 = iter[1] ^ v44 ^ v46;
                    v50 = v47 ^ iter[2] ^ v46;
                    v51 = v45 ^ iter[3] ^ v43;
                    v52 = *(int *)&(&g_d2b4c0)[4 * (__ROL__(v48, 16) & 0xffff00ff & 0xff)] ^ *(int *)(4 * (v48 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v48, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v48 & 0xff];
                    v53 = *(int *)&(&g_d2b4c0)[4 * (__ROL__(v50, 16) & 0xffff00ff & 0xff)] ^ *(int *)(4 * (v50 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v50, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v50 & 0xff];
                    v54 = *(int *)&(&g_d2b4c0)[4 * (__ROL__(v51, 16) & 0xffff00ff & 0xff)] ^ *(int *)(4 * (v51 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v51, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v51 & 0xff];
                    v55 = *(int *)&(&g_d2b4c0)[4 * (__ROL__(v49, 16) & 0xffff00ff & 0xff)] ^ *(int *)(4 * (v49 >> 24) + 13807808) ^ *(int *)(4 * (__ROL__(v49, 24) & 0xff0000ff & 0xff) + 13809856) ^ (&g_d2bcc0.field_0)[v49 & 0xff] ^ v53;
                    v56 = v54 ^ v53;
                    v57 = v55 ^ v52;
                    v58 = __ROL__(v56 ^ v57, 16);
                    v59 = ((((((v54 ^ v55) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v54 ^ v55) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v54 ^ v55) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v54 ^ v55) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    v60 = (0xff00ff00 & (v56 ^ v52) * 0x100 | 0xff00ff & (v56 ^ v52) >> 8) ^ v58;
                    v61 = v58 ^ v59;
                    v29 = iter[5] ^ v57 ^ v61;
                    v62 = v60 ^ v57;
                    v31 = v62 ^ iter[4];
                    v32 = v61 ^ iter[6] ^ v62;
                    v33 = iter[7] ^ v59 ^ v60;
                    iter += 8;
                    i -= 2;
                } while (4 < i);
                v63 = (&g_d2bcc0.field_0)[__ROL__(v31, 16) & 0xffff00ff & 0xff] * 0x100 & 0xff0000 | *(int *)(4 * (v31 >> 24) + 13809856) * &_NSHomeDirectory;
                v64 = __ROL__(v31, 24) & 0xff0000ff & 0xff;
                v65 = (v63 & 0xffff0000 | (v63 & 0xffff00ff | __ROL__(*(int *)(4 * v64 + 13807808), 8) & 0xff00) & 0xffff | (&g_d2b4c0)[((v31 & 0xff) * 4 | (v31 & 0xff) >> 62) & 0x3fffffffc & 0x3ffffffff]) ^ *iter;
                v66 = (&g_d2bcc0.field_0)[__ROL__(v29, 16) & 0xffff00ff & 0xff] * 0x100 & 0xff0000 | *(int *)(4 * (v29 >> 24) + 13809856) * &_NSHomeDirectory;
                v67 = __ROL__(v29, 24) & 0xff0000ff & 0xff;
                v68 = (v66 & 0xffff0000 | (v66 & 0xffff00ff | __ROL__(*(int *)(4 * v67 + 13807808), 8) & 0xff00) & 0xffff | (&g_d2b4c0)[((v29 & 0xff) * 4 | (v29 & 0xff) >> 62) & 0x3fffffffc & 0x3ffffffff]) ^ iter[1];
                v69 = (&g_d2bcc0.field_0)[__ROL__(v32, 16) & 0xffff00ff & 0xff] * 0x100 & 0xff0000 | *(int *)(4 * (v32 >> 24) + 13809856) * &_NSHomeDirectory;
                v70 = __ROL__(v32, 24) & 0xff0000ff & 0xff;
                v71 = iter[3];
                v72 = *(int *)(4 * (v33 >> 24) + 13809856);
                a0 = __ROL__(v33, 16) & 0xffff00ff & 0xff;
                v73 = (&g_d2bcc0.field_0)[a0 & 0xffffffff];
                v74 = (v69 & 0xffff0000 | (v69 & 0xffff00ff | __ROL__(*(int *)(4 * v70 + 13807808), 8) & 0xff00) & 0xffff | (&g_d2b4c0)[((v32 & 0xff) * 4 | (v32 & 0xff) >> 62) & 0x3fffffffc & 0x3ffffffff]) ^ iter[2];
                v75 = *(int *)(4 * (__ROL__(v33, 24) & 0xff0000ff & 0xff) + 13807808);
                v76 = (&g_d2b4c0)[((v33 & 0xff) * 4 | (v33 & 0xff) >> 62) & 0x3fffffffc & 0x3ffffffff];
                *(char *)a1 = v65 >> 24;
                *(char *)&a1[1] = v65 >> 16;
                *(char *)&a1[2] = v65 >> 8;
                *(char *)&a1[3] = v65;
                *(char *)&a1[4] = v68 >> 24;
                *(char *)&a1[5] = v68 >> 16;
                *(char *)&a1[6] = v68 >> 8;
                *(char *)&a1[7] = v68;
                *(char *)&a1[8] = v74 >> 24;
                *(char *)&a1[9] = v74 >> 16;
                *(char *)&a1[10] = v74 >> 8;
                *(char *)&a1[11] = v74;
                v77 = ((v73 * 0x100 & 0xff0000 | v72 * &_NSHomeDirectory) & 0xffff0000 | ((v73 * 0x100 & 0xff0000 | v72 * &_NSHomeDirectory) & 0xffff00ff | __ROL__(v75, 8) & 0xff00) & 0xffff | v76) ^ v71;
                *(char *)&a1[12] = v77 >> 24;
                *(char *)&a1[13] = v77 >> 16;
                *(char *)&a1[14] = v77 >> 8;
                *(char *)&a1[15] = v77;
            }
        }
    }
    return (unsigned int)a0;
}
