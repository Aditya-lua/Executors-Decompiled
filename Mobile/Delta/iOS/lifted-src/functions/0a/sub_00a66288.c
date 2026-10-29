/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa66288..0xa663dc (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a66288(char *a0, unsigned int *a1)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w8
    unsigned int v10;  // w12
    unsigned int v11;  // w13
    unsigned int v12;  // w16
    unsigned int v13;  // w13
    unsigned int v14;  // w15
    unsigned int *iter;  // x13
    unsigned int v16;  // w14
    unsigned int v17;  // w17
    unsigned int v2;  // w9
    unsigned int v3;  // w10
    unsigned int v4;  // w8
    unsigned int v5;  // w11
    unsigned int v6;  // w10
    unsigned int v7;  // w12
    unsigned int v8;  // w11
    unsigned int v9;  // w13

    v0 = *a0;
    *a1 = v0 * 0x100;
    *a1 = (a0[1] | __ROL__(v0, 8) & 0xff00) & 0xffff;
    v1 = a0[2];
    a1[1] = v1 * 0x100;
    v2 = (a0[3] | __ROL__(v1, 8) & 0xff00) & 0xffff;
    a1[1] = v2;
    v3 = a0[4];
    a1[2] = v3 * 0x100;
    v4 = (a0[5] | __ROL__(v3, 8) & 0xff00) & 0xffff;
    a1[2] = v4;
    v5 = a0[6];
    a1[3] = v5 * 0x100;
    v6 = (a0[7] | __ROL__(v5, 8) & 0xff00) & 0xffff;
    a1[3] = v6;
    v7 = a0[8];
    a1[4] = v7 * 0x100;
    v8 = (a0[9] | __ROL__(v7, 8) & 0xff00) & 0xffff;
    a1[4] = v8;
    v9 = a0[10];
    a1[5] = v9 * 0x100;
    v10 = (a0[11] | __ROL__(v9, 8) & 0xff00) & 0xffff;
    a1[5] = v10;
    v11 = a0[12];
    a1[6] = v11 * 0x100;
    v12 = (a0[13] | __ROL__(v11, 8) & 0xff00) & 0xffff;
    a1[6] = v12;
    v13 = a0[14];
    a1[7] = v13 * 0x100;
    v14 = (a0[15] | __ROL__(v13, 8) & 0xff00) & 0xffff;
    a1[7] = v14;
    iter = a1 + 15;
    v16 = 5;
    while (1)
    {
        v17 = (v6 >> 7 | v4 * 0x200) & 0xffff;
        *(unsigned int *)((char *)iter - 28) = (v4 >> 7 | v2 * 0x200) & 0xffff;
        *(unsigned int *)((char *)iter - 24) = v17;
        v4 = (v8 >> 7 | v6 * 0x200) & 0xffff;
        v6 = (v10 >> 7 | v8 * 0x200) & 0xffff;
        *(unsigned int *)((char *)iter - 20) = v4;
        *(unsigned int *)((char *)iter - 16) = v6;
        v8 = (v12 >> 7 | v10 * 0x200) & 0xffff;
        v10 = (v14 >> 7 | v12 * 0x200) & 0xffff;
        *(unsigned int *)((char *)iter - 12) = v8;
        *(unsigned int *)((char *)iter - 8) = v10;
        if (!v16)
            break;
        a0 = *(int *)((char *)iter - 60);
        v12 = ((unsigned int)a0 >> 7 | v14 * 0x200) & 0xffff;
        v14 = ((unsigned int)a0 * 0x200 | v2 >> 7) & 0xffff;
        *(unsigned int *)((char *)iter - 4) = v12;
        *iter = v14;
        v16 -= 1;
        iter += 8;
        v2 = v17;
    }
    return (unsigned int)a0;
}
