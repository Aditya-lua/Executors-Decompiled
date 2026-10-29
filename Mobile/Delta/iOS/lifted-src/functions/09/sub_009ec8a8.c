/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ec8a8..0x9ecc80 (984 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ec8a8_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9ec8a8_0;

extern st_9ec8a8_0 g_d32ee8;
extern st_9ec8a8_0 g_d336e8;
extern char _NSHomeDirectory;

unsigned long long sub_9ec8a8(unsigned int a0, unsigned int *a1, unsigned int *a2, char *a3)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x9
    unsigned int v10;  // w0
    unsigned int v11;  // w4
    unsigned int v12;  // w0
    unsigned int v13;  // w0
    unsigned int v14;  // w16
    unsigned int v15;  // w0
    unsigned int v16;  // w17
    unsigned int v17;  // w1
    unsigned int v18;  // w17
    unsigned int v19;  // w17
    unsigned int v2;  // w14
    unsigned int v20;  // w14
    unsigned int v21;  // w17
    unsigned int v22;  // w15
    unsigned int v23;  // w1
    unsigned int v24;  // w15
    unsigned int v25;  // w1
    unsigned int v26;  // w15
    unsigned int v27;  // w0
    unsigned int v28;  // w16
    unsigned int v29;  // w1
    unsigned int v3;  // w15
    unsigned int v30;  // w16
    unsigned int v31;  // w16
    unsigned int v32;  // w14
    unsigned int v33;  // w16
    unsigned int v34;  // w17
    unsigned int v35;  // w1
    unsigned int v36;  // w17
    unsigned int v37;  // w17
    unsigned long long v38;  // x0
    unsigned int v39;  // w17
    unsigned long v4;  // x8
    unsigned int v40;  // w15
    unsigned int v41;  // w1
    unsigned int v42;  // w15
    unsigned int v43;  // w12
    unsigned int v44;  // w11
    unsigned int v45;  // w12
    unsigned int v46;  // w9
    unsigned int v47;  // w10
    unsigned int v48;  // w11
    unsigned int v49;  // w8
    unsigned long v5;  // x10
    unsigned int v6;  // w16
    unsigned int *v7;  // x9
    unsigned int v8;  // w17
    unsigned int *iter;  // x8

    v0 = *a1;
    v1 = a1[1];
    v2 = (unsigned int)((((((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ *a2;
    v3 = (unsigned int)((((((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ a2[1];
    v4 = a1[2];
    v5 = a1[3];
    v6 = (unsigned int)((((((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ a2[2];
    v7 = &a2[16 * a0];
    v8 = (unsigned int)((((((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ a2[3];
    iter = a2 + 19;
    while (1)
    {
        v10 = *(int *)((char *)iter - 60) ^ v2;
        v11 = *(int *)((char *)iter - 56) ^ v3;
        v12 = *(int *)(4 * (__ROL__(v10, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * (v10 & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v10, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[v10 >> 24];
        v13 = *(int *)(4 * (__ROL__(v11, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[v11 & 0xff] ^ *(int *)(4 * (__ROL__(v11, 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[v11 >> 24] ^ v12;
        v14 = v13 ^ v6;
        v15 = v8 ^ (v12 * &_NSHomeDirectory | v12 >> 8) ^ v13;
        v16 = v14 ^ *(int *)((char *)iter - 52);
        v17 = v15 ^ *(int *)((char *)iter - 48);
        v18 = *(int *)(4 * (__ROL__(v16, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * (v16 & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v16, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[v16 >> 24];
        v19 = *(int *)(4 * (__ROL__(v17, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[v17 & 0xff] ^ *(int *)(4 * (__ROL__(v17, 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[v17 >> 24] ^ v18;
        v20 = v19 ^ v2;
        v21 = v3 ^ (v18 * &_NSHomeDirectory | v18 >> 8) ^ v19;
        v22 = v20 ^ *(int *)((char *)iter - 44);
        v23 = v21 ^ *(int *)((char *)iter - 40);
        v24 = *(int *)(4 * (__ROL__(v22, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * (v22 & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v22, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[v22 >> 24];
        v25 = *(int *)(4 * (__ROL__(v23, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[v23 & 0xff] ^ *(int *)(4 * (__ROL__(v23, 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[v23 >> 24] ^ v24;
        v26 = v25 ^ v14;
        v27 = v15 ^ (v24 * &_NSHomeDirectory | v24 >> 8) ^ v25;
        v28 = v26 ^ *(int *)((char *)iter - 36);
        v29 = v27 ^ *(int *)((char *)iter - 32);
        v30 = *(int *)(4 * (__ROL__(v28, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * (v28 & 0xff) + 13841128) ^ (&g_d336e8.field_0)[(v28 * 0x10000 | v28 >> 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[v28 >> 24];
        v31 = *(int *)(4 * ((v29 * &_NSHomeDirectory | v29 >> 8) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[v29 & 0xff] ^ *(int *)(4 * ((v29 * 0x10000 | v29 >> 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[v29 >> 24] ^ v30;
        v32 = v31 ^ v20;
        v33 = v21 ^ __ROL__(v30, 24) ^ v31;
        v34 = v32 ^ *(int *)((char *)iter - 28);
        v35 = v33 ^ *(int *)((char *)iter - 24);
        v36 = *(int *)(4 * ((v34 * &_NSHomeDirectory | v34 >> 8) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * (v34 & 0xff) + 13841128) ^ (&g_d336e8.field_0)[(v34 * 0x10000 | v34 >> 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[v34 >> 24];
        v37 = *(int *)(4 * ((v35 * &_NSHomeDirectory | v35 >> 8) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[v35 & 0xff] ^ *(int *)(4 * ((v35 * 0x10000 | v35 >> 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[v35 >> 24] ^ v36;
        v38 = v37 ^ v26;
        v39 = v27 ^ __ROL__(v36, 24) ^ v37;
        v40 = (unsigned int)v38 ^ *(int *)((char *)iter - 20);
        v41 = v39 ^ *(int *)((char *)iter - 16);
        v42 = *(int *)(4 * ((v40 * &_NSHomeDirectory | v40 >> 8) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * (v40 & 0xff) + 13841128) ^ (&g_d336e8.field_0)[(v40 * 0x10000 | v40 >> 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[v40 >> 24];
        v43 = *(int *)(4 * ((v41 * &_NSHomeDirectory | v41 >> 8) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[v41 & 0xff] ^ *(int *)(4 * ((v41 * 0x10000 | v41 >> 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[v41 >> 24] ^ v42;
        v44 = v43 ^ v32;
        v45 = v33 ^ __ROL__(v42, 24) ^ v43;
        if ((char *)iter - 12 == v7)
            break;
        v3 = v45 ^ ((*(int *)((char *)iter - 12) & v44) * 2 | (*(int *)((char *)iter - 12) & v44) >> 31);
        v6 = (*iter | v39) ^ (unsigned int)v38;
        v2 = (v3 | *(int *)((char *)iter - 8)) ^ v44;
        v8 = v39 ^ ((v6 & *(int *)((char *)iter - 4)) * 2 | (v6 & *(int *)((char *)iter - 4)) >> 31);
        iter += 16;
    }
    v46 = *v7 ^ (unsigned int)v38;
    v47 = *(int *)((char *)iter - 8) ^ v39;
    v48 = *(int *)((char *)iter - 4) ^ v44;
    v49 = *iter ^ v45;
    *a3 = v46 >> 24;
    a3[1] = v46 >> 16;
    a3[2] = v46 >> 8;
    a3[3] = v46;
    a3[4] = v47 >> 24;
    a3[5] = v47 >> 16;
    a3[6] = v47 >> 8;
    a3[7] = v47;
    a3[8] = v48 >> 24;
    a3[9] = v48 >> 16;
    a3[10] = v48 >> 8;
    a3[11] = v48;
    a3[12] = v49 >> 24;
    a3[13] = v49 >> 16;
    a3[14] = v49 >> 8;
    a3[15] = v49;
    return v38;
}
