/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ecc80..0x9ed050 (976 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ecc80_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9ecc80_0;

extern st_9ecc80_0 g_d32ee8;
extern st_9ecc80_0 g_d336e8;
extern char _NSHomeDirectory;

unsigned int sub_9ecc80(unsigned int a0, unsigned int *a1, unsigned int *a2, char *a3)
{
    unsigned long long v0;  // x8
    unsigned int *v1;  // x9
    unsigned long long v10;  // x8
    unsigned int *v11;  // x10
    unsigned int v12;  // w0
    unsigned int v13;  // w4
    unsigned int v14;  // w0
    unsigned int v15;  // w0
    unsigned int v16;  // w16
    unsigned int v17;  // w17
    unsigned int v18;  // w0
    unsigned int v19;  // w1
    unsigned long v2;  // x10
    unsigned int v20;  // w0
    unsigned int v21;  // w0
    unsigned int v22;  // w14
    unsigned int v23;  // w0
    unsigned int v24;  // w15
    unsigned int v25;  // w1
    unsigned int v26;  // w15
    unsigned int v27;  // w1
    unsigned int v28;  // w15
    unsigned int v29;  // w17
    unsigned long v3;  // x11
    unsigned int v30;  // w16
    unsigned int v31;  // w1
    unsigned int v32;  // w16
    unsigned int v33;  // w16
    unsigned int v34;  // w14
    unsigned int v35;  // w16
    unsigned int v36;  // w0
    unsigned int v37;  // w1
    unsigned int v38;  // w0
    unsigned int v39;  // w0
    unsigned int v4;  // w15
    unsigned int v40;  // w15
    unsigned int v41;  // w17
    unsigned int v42;  // w0
    unsigned int v43;  // w1
    unsigned int v44;  // w0
    unsigned int v45;  // w12
    unsigned int v46;  // w11
    unsigned int v47;  // w12
    unsigned int v48;  // w8
    unsigned int v49;  // w9
    unsigned int v5;  // w14
    unsigned int v50;  // w10
    unsigned int v51;  // w11
    unsigned long v6;  // x10
    unsigned long v7;  // x11
    unsigned int v8;  // w16
    unsigned int v9;  // w17

    v0 = (long long)(a0 * 16 * 0x100000000) >> 63 & 0xfffffffc00000000 | __ROL__(a0 * 16, 2) & 0x3fffffffc & 0x3ffffffff;
    v1 = (char *)a2 + v0;
    v2 = *a1;
    v3 = a1[1];
    v4 = (unsigned int)((((((v2 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v2 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v2 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v2 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ *v1;
    v5 = (unsigned int)((((((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ v1[1];
    v6 = a1[2];
    v7 = a1[3];
    v8 = (unsigned int)((((((v6 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v6 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v6 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v6 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ v1[2];
    v9 = (unsigned int)((((((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ v1[3];
    v10 = v0 - 64;
    while (1)
    {
        v11 = (char *)a2 + v10;
        v12 = v11[14] ^ v4;
        v13 = v11[15] ^ v5;
        v14 = *(int *)(4 * (__ROL__(v12, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * (v12 & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v12, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[v12 >> 24];
        v15 = *(int *)(4 * (__ROL__(v13, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[v13 & 0xff] ^ *(int *)(4 * (__ROL__(v13, 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[v13 >> 24] ^ v14;
        v16 = v15 ^ v8;
        v17 = v9 ^ (v14 * &_NSHomeDirectory | v14 >> 8) ^ v15;
        v18 = v16 ^ v11[12];
        v19 = v17 ^ v11[13];
        v20 = *(int *)(4 * (__ROL__(v18, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * (v18 & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v18, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[v18 >> 24];
        v21 = *(int *)(4 * (__ROL__(v19, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[v19 & 0xff] ^ *(int *)(4 * (__ROL__(v19, 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[v19 >> 24] ^ v20;
        v22 = v21 ^ v4;
        v23 = v5 ^ (v20 * &_NSHomeDirectory | v20 >> 8) ^ v21;
        v24 = v22 ^ v11[10];
        v25 = v23 ^ v11[11];
        v26 = *(int *)(4 * (__ROL__(v24, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * (v24 & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v24, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[v24 >> 24];
        v27 = *(int *)(4 * (__ROL__(v25, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[v25 & 0xff] ^ *(int *)(4 * (__ROL__(v25, 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[v25 >> 24] ^ v26;
        v28 = v27 ^ v16;
        v29 = v17 ^ (v26 * &_NSHomeDirectory | v26 >> 8) ^ v27;
        v30 = v28 ^ v11[8];
        v31 = v29 ^ v11[9];
        v32 = *(int *)(4 * (__ROL__(v30, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * (v30 & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v30, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[v30 >> 24];
        v33 = *(int *)(4 * (__ROL__(v31, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[v31 & 0xff] ^ *(int *)(4 * (__ROL__(v31, 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[v31 >> 24] ^ v32;
        v34 = v33 ^ v22;
        v35 = v23 ^ (v32 * &_NSHomeDirectory | v32 >> 8) ^ v33;
        v36 = v34 ^ v11[6];
        v37 = v35 ^ v11[7];
        v38 = *(int *)(4 * (__ROL__(v36, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * (v36 & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v36, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[v36 >> 24];
        v39 = *(int *)(4 * (__ROL__(v37, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[v37 & 0xff] ^ *(int *)(4 * (__ROL__(v37, 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[v37 >> 24] ^ v38;
        v40 = v39 ^ v28;
        v41 = v29 ^ (v38 * &_NSHomeDirectory | v38 >> 8) ^ v39;
        v42 = v40 ^ v11[4];
        v43 = v41 ^ v11[5];
        v44 = *(int *)(4 * (__ROL__(v42, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * (v42 & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v42, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[v42 >> 24];
        v45 = *(int *)(4 * (__ROL__(v43, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[v43 & 0xff] ^ *(int *)(4 * (__ROL__(v43, 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[v43 >> 24] ^ v44;
        v46 = v45 ^ v34;
        v47 = v35 ^ (v44 * &_NSHomeDirectory | v44 >> 8) ^ v45;
        if (!v10)
            break;
        v5 = v47 ^ ((v11[2] & v46) * 2 | (v11[2] & v46) >> 31);
        v8 = (v11[1] | v41) ^ v40;
        v4 = (v5 | v11[3]) ^ v46;
        v9 = v41 ^ ((v8 & *v11) * 2 | (v8 & *v11) >> 31);
        v10 -= 64;
    }
    v48 = *a2 ^ v40;
    v49 = a2[1] ^ v41;
    v50 = a2[2] ^ v46;
    v51 = a2[3] ^ v47;
    *a3 = v48 >> 24;
    a3[1] = v48 >> 16;
    a3[2] = v48 >> 8;
    a3[3] = v48;
    a3[4] = v49 >> 24;
    a3[5] = v49 >> 16;
    a3[6] = v49 >> 8;
    a3[7] = v49;
    a3[8] = v50 >> 24;
    a3[9] = v50 >> 16;
    a3[10] = v50 >> 8;
    a3[11] = v50;
    a3[12] = v51 >> 24;
    a3[13] = v51 >> 16;
    a3[14] = v51 >> 8;
    a3[15] = v51;
    return v44;
}
