/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d0e94..0x9d12d0 (1084 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_9d0e94(unsigned int *a0, unsigned int *a1)
{
    unsigned int *v0;  // x8
    unsigned int v1;  // w11
    unsigned int v10;  // w12
    unsigned int v11;  // w11
    unsigned int v12;  // w12
    unsigned int v13;  // w11
    unsigned int v14;  // w12
    unsigned int v15;  // w11
    unsigned int v16;  // w12
    unsigned int v17;  // w8
    unsigned int v18;  // w9
    unsigned int v2;  // w12
    unsigned int v3;  // w11
    unsigned int v4;  // w12
    unsigned int v5;  // w11
    unsigned int v6;  // w12
    unsigned int v7;  // w11
    unsigned int v8;  // w12
    unsigned int v9;  // w11

    v0 = a1 + 18;
    v1 = *a1 ^ *a0;
    v2 = a1[1] ^ a0[1] ^ (v0[0x100 | (0x100 | __ROL__(v1, 16) & 0xffff00ff) & 0xff] + v0[v1 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v1, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v1 & 0xff) & 0xff];
    v3 = a1[2] ^ v1 ^ (v0[0x100 | (0x100 | __ROL__(v2, 16) & 0xffff00ff) & 0xff] + v0[v2 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v2, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v2 & 0xff) & 0xff];
    v4 = a1[3] ^ v2 ^ (v0[0x100 | (0x100 | __ROL__(v3, 16) & 0xffff00ff) & 0xff] + v0[v3 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v3, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v3 & 0xff) & 0xff];
    v5 = a1[4] ^ v3 ^ (v0[0x100 | (0x100 | __ROL__(v4, 16) & 0xffff00ff) & 0xff] + v0[v4 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v4, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v4 & 0xff) & 0xff];
    v6 = a1[5] ^ v4 ^ (v0[0x100 | (0x100 | __ROL__(v5, 16) & 0xffff00ff) & 0xff] + v0[v5 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v5, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v5 & 0xff) & 0xff];
    v7 = a1[6] ^ v5 ^ (v0[0x100 | (0x100 | __ROL__(v6, 16) & 0xffff00ff) & 0xff] + v0[v6 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v6, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v6 & 0xff) & 0xff];
    v8 = a1[7] ^ v6 ^ (v0[0x100 | (0x100 | __ROL__(v7, 16) & 0xffff00ff) & 0xff] + v0[v7 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v7, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v7 & 0xff) & 0xff];
    v9 = a1[8] ^ v7 ^ (v0[0x100 | (0x100 | __ROL__(v8, 16) & 0xffff00ff) & 0xff] + v0[v8 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v8, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v8 & 0xff) & 0xff];
    v10 = a1[9] ^ v8 ^ (v0[0x100 | (0x100 | __ROL__(v9, 16) & 0xffff00ff) & 0xff] + v0[v9 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v9, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v9 & 0xff) & 0xff];
    v11 = a1[10] ^ v9 ^ (v0[0x100 | (0x100 | __ROL__(v10, 16) & 0xffff00ff) & 0xff] + v0[v10 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v10, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v10 & 0xff) & 0xff];
    v12 = a1[11] ^ v10 ^ (v0[0x100 | (0x100 | __ROL__(v11, 16) & 0xffff00ff) & 0xff] + v0[v11 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v11, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v11 & 0xff) & 0xff];
    v13 = a1[12] ^ v11 ^ (v0[0x100 | (0x100 | __ROL__(v12, 16) & 0xffff00ff) & 0xff] + v0[v12 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v12, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v12 & 0xff) & 0xff];
    v14 = a1[13] ^ v12 ^ (v0[0x100 | (0x100 | __ROL__(v13, 16) & 0xffff00ff) & 0xff] + v0[v13 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v13, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v13 & 0xff) & 0xff];
    v15 = a1[14] ^ v13 ^ (v0[0x100 | (0x100 | __ROL__(v14, 16) & 0xffff00ff) & 0xff] + v0[v14 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v14, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v14 & 0xff) & 0xff];
    v16 = a1[15] ^ v14 ^ (v0[0x100 | (0x100 | __ROL__(v15, 16) & 0xffff00ff) & 0xff] + v0[v15 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v15, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v15 & 0xff) & 0xff];
    v17 = (v0[0x100 | (0x100 | __ROL__(v16, 16) & 0xffff00ff) & 0xff] + v0[v16 >> 24] ^ v0[0x200 | (0x200 | __ROL__(v16, 24) & 0xff0000ff) & 0xff]) + v0[0x300 | (0x300 | v16 & 0xff) & 0xff];
    v18 = a1[16] ^ v15;
    *a0 = a1[0x11] ^ v16;
    a0[1] = v18 ^ v17;
    return a0;
}
