/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa106a8..0xa10838 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a106a8_0 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    char field_4;
    char field_5;
    char field_6;
    char field_7;
    char field_8;
    char field_9;
    char field_a;
    char field_b;
    char field_c;
    char field_d;
    char field_e;
    char field_f;
    char field_10;
    char field_11;
    char field_12;
    char field_13;
    char field_14;
    char field_15;
    char field_16;
    char field_17;
    char field_18;
    char field_19;
    char field_1a;
    char field_1b;
    char field_1c;
    char field_1d;
    char field_1e;
    char field_1f;
} st_a106a8_0;

extern char g_1000000;

st_a106a8_0 * sub_a106a8(st_a106a8_0 *a0, unsigned int *a1)
{
    unsigned int v0;  // w17
    int v1;  // w2
    unsigned int v10;  // w10
    unsigned int v11;  // w9
    unsigned int v12;  // w8
    int v2;  // w2
    unsigned int v3;  // w1
    unsigned int v4;  // w2
    unsigned int v5;  // w3
    unsigned int v6;  // w11
    unsigned int v7;  // w12
    unsigned int v8;  // w13
    unsigned int v9;  // w14

    v0 = a1[9];
    v1 = a1[3] + ((long long)(a1[2] + ((long long)(a1[1] + ((long long)(*a1 + (&(&g_1000000)[19 * v0] >> 25)) >> 26)) >> 25)) >> 26);
    v2 = a1[7] + ((int)(a1[6] + ((int)(a1[5] + ((int)(a1[4] + (v1 >> 25)) >> 26)) >> 25)) >> 26);
    v3 = *a1 + 19 * ((int)(v0 + ((int)(a1[8] + (v2 >> 25)) >> 26)) >> 25);
    v4 = a1[1] + ((int)(v3) >> 26);
    v5 = a1[2] + ((int)(v4) >> 25);
    v6 = a1[3] + ((int)(v5) >> 26);
    v7 = a1[4] + ((int)(v6) >> 25);
    v8 = a1[5] + ((int)(v7) >> 26);
    v9 = a1[6] + ((int)(v8) >> 25);
    v10 = a1[7] + ((int)(v9) >> 26);
    v11 = a1[8] + ((int)(v10) >> 25);
    v12 = v0 + ((int)(v11) >> 26);
    a0->field_0 = v3;
    a0->field_1 = v3 >> 8;
    a0->field_2 = v3 >> 16;
    a0->field_3 = (char)(v3 >> 24) & 3 | (char)(__ROL__(v4, 2)) & 252;
    a0->field_4 = v4 >> 6;
    a0->field_5 = v4 >> 14;
    a0->field_6 = (char)(__ROL__(v4, 10)) & 7 | (char)v5 * 8;
    a0->field_7 = v5 >> 5;
    a0->field_8 = v5 >> 13;
    a0->field_9 = (char)(__ROL__(v5, 11)) & 31 | (char)v6 * 32;
    a0->field_a = v6 >> 3;
    a0->field_b = v6 >> 11;
    a0->field_c = (char)(__ROL__(v6, 13)) & 63 | (char)v7 * 64;
    a0->field_d = v7 >> 2;
    a0->field_e = v7 >> 10;
    a0->field_f = v7 >> 18;
    a0->field_10 = v8;
    a0->field_11 = v8 >> 8;
    a0->field_12 = v8 >> 16;
    a0->field_13 = (char)(v8 >> 24) & 1 | (char)(__ROL__(v9, 1)) & 254;
    a0->field_14 = v9 >> 7;
    a0->field_15 = v9 >> 15;
    a0->field_16 = (char)(__ROL__(v9, 9)) & 7 | (char)v10 * 8;
    a0->field_17 = v10 >> 5;
    a0->field_18 = v10 >> 13;
    a0->field_19 = (char)(__ROL__(v10, 11)) & 15 | (char)v11 * 16;
    a0->field_1a = v11 >> 4;
    a0->field_1b = v11 >> 12;
    a0->field_1c = (char)(__ROL__(v11, 12)) & 63 | (char)v12 * 64;
    a0->field_1d = v12 >> 2;
    a0->field_1e = v12 >> 10;
    a0->field_1f = (char)(__ROL__(v12, 14)) & 127;
    return a0;
}
