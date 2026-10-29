/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fc26c..0x9fc404 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_d369a8[4];

long long sub_9fc26c(unsigned int *a0, unsigned int *iter)
{
    unsigned long long i;  // x8
    unsigned int v1;  // w11
    unsigned int v10;  // w10
    unsigned int v11;  // w9
    unsigned int v12;  // w11
    unsigned int v13;  // w9
    unsigned int v14;  // w11
    unsigned int v15;  // w10
    unsigned int v16;  // w10
    unsigned int v17;  // w10
    unsigned int v18;  // w15
    unsigned long v19;  // x16
    unsigned int v2;  // w9
    unsigned long v20;  // cc_dep1
    char v21;  // x16
    unsigned int v22;  // w15
    unsigned long long v23;  // 4119
    unsigned long long v24;  // 4119
    char v25;  // x17
    unsigned int v26;  // w16
    unsigned int v27;  // w17
    unsigned int v28;  // w2
    unsigned int v29;  // w15
    unsigned int v3;  // w10
    unsigned int v30;  // w16
    unsigned int v4;  // w9
    unsigned int v5;  // w10
    unsigned int v6;  // w11
    unsigned int v7;  // w9
    unsigned int v8;  // w10
    unsigned int v9;  // w11

    i = 0;
    v1 = (*a0 ^ a0[1] >> 4) & 0xf0f0f0f;
    v2 = v1 ^ *a0;
    v3 = a0[1] ^ v1 * 16;
    v4 = ((v2 ^ v2 * 0x40000) & 0xcccc0000 & 0xffffc000 | __ROL__((v2 ^ v2 * 0x40000) & 0xcccc0000, 14) & 0x3fff) ^ v2;
    v5 = ((v3 ^ v3 * 0x40000) & 0xcccc0000 & 0xffffc000 | __ROL__((v3 ^ v3 * 0x40000) & 0xcccc0000, 14) & 0x3fff) ^ v3;
    v6 = (v4 ^ v5 >> 1) & 0x55555555;
    v7 = v6 ^ v4;
    v8 = v5 ^ v6 * 2;
    v9 = (v8 ^ v7 >> 8) & 0xff00ff;
    v10 = v9 ^ v8;
    v11 = v7 ^ v9 * 0x100;
    v12 = (v11 ^ v10 >> 1) & 0x55555555;
    v13 = v12 ^ v11;
    v14 = v10 ^ v12 * 2;
    v15 = v13 >> 4 & 0xf000000 & 0xffff0000 | (v13 >> 4 & 0xf000000 & 0xffff0000 | v14 & 0xffff) & 0xffff;
    v16 = v15 & 0xff000000 | (v15 & 0xff00ffff | __ROL__(v14, 16) & 0xff0000) & 0xffffff;
    v17 = v16 & 0xffffff00 | (v16 & 0xff00 | __ROL__(v14, 16) & 0xffff00ff) & 0xff;
    do
    {
        v18 = v13 & 0xfffffff;
        v19 = 33027 >> ((char)i & 63);
        v20 = v19 & 1;
        if (v19 & 1)
        {
            v21 = 1;
            v22 = v18 >> 1;
            v23 = arm64g_calculate_condition(10, v20, 0, 0);
            if (!(v23 & 1))
                goto LABEL_9fc316;
            goto LABEL_9fc315;
        }
        else
        {
            v21 = 2;
            v22 = v18 >> 2;
            v24 = arm64g_calculate_condition(10, v20, 0, 0);
            if (v24 & 1)
            {
LABEL_9fc315:
                v25 = 26;
                continue;
            }
            else
            {
LABEL_9fc316:
                v25 = 27;
            }
        }
        v26 = v17 >> (v21 & 31);
        v13 = v22 | v13 << (v25 & 31);
        v27 = v26 | v17 << (v25 & 31);
        v17 = v27 & 0xfffffff;
        v28 = v22 >> 7 & 60;
        v29 = g_d369a8[64 + (v22 >> 7 & 60 & 0xfffffffc | (v28 & 0x3fffffc | __ROL__(v22, 26) & 4227858435) & 3)] | g_d369a8[v22 & 63] | g_d369a8[128 + (v22 >> 14 & 48 & 0xfffffff0 | (v22 >> 14 & 48 & 0x7fff0 | __ROL__(v22, 19) & 0xfff8000f) & 15)] | g_d369a8[192 + (v22 >> 21 & 6 & 0xfffffffe | __ROL__(v22, 12) & 0xfffff001 & 1 | v13 >> 22 & 56)];
        v30 = g_d369a8[320 + (v26 >> 8 & 60 & 0xfffffffc | (v26 >> 8 & 60 & 0x1fffffc | __ROL__(v26, 25) & 4261412867) & 3)] | g_d369a8[0x100 + (v26 & 63)] | g_d369a8[384 + (__ROL__(v26, 0x11) & 0xfffe003f & 63)] | g_d369a8[448 + (v27 >> 22 & 48 & 0xfffffff0 | (v27 >> 22 & 48 & 2032 | __ROL__(v26, 11) & 0xfffff80f) & 15)];
        *iter = (v29 & 0xffff | __ROL__(v30, 16) & 0xffff0000) * 4 | v30 * 0x10000 >> 30;
        iter[1] = (v30 & 0x3ff0000 & 0xffff0000 | __ROL__(v29, 16) & 0xffff) * 64 | v30 >> 26;
        iter += 2;
        i += 1;
    } while (i != 16);
    return v30 & 0x3ff0000 & 0xffff0000 | __ROL__(v29, 16) & 0xffff;
}
