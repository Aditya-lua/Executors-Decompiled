/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5c638..0x5d0d0 (2712 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5c638_3 {
    long long field_0;
    struct st_5c638_3 *field_8;
} st_5c638_3;

typedef struct st_5c638_1 {
    char field_0;
    char padding_1[7];
    struct st_5c638_1 *field_8;
} st_5c638_1;

typedef struct st_5c638_2 {
    char padding_0[2072];
    unsigned int field_818;
    char padding_81c[4];
    unsigned long long field_820;
    int field_828;
    char padding_82c[4];
    struct st_5c638_1 *field_830;
    struct st_5c638_1 *field_838;
    struct st_5c638_1 *field_840;
    long long field_848;
} st_5c638_2;

typedef struct st_5c638_0 {
    char field_0;
} st_5c638_0;

typedef struct st_5c638_4 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_5c638_4;

extern st_5c638_4 g_e69280;
extern st_5c638_1 g_f011d0;
extern char g_f0dbe0;
extern char g_f0dbe1;
extern char g_f0dbe2;
extern char g_f0dbe3;
extern char g_f0dbe4;
extern char g_f0dbe5;
extern char g_f0dbe6;
extern char g_f0dbe7;
extern char g_f0dbe8;
extern char g_f0dbe9;
extern char g_f0dbea;
extern char g_f0dbeb;
extern char g_f0dbec;
extern char g_f0dbed;
extern char g_f0dbee;
extern char g_f0dbef;
extern char g_f0dbf0;
extern char g_f0dbf1;
extern char g_f0dbf2;
extern char g_f0dbf3;
extern char g_f0dbf4;
extern char g_f0dbf5;
extern char g_f0dbf6;
extern char g_f0dbf7;
extern char g_f0dbf8;
extern char g_f0dbf9;
extern char g_f0dbfa;
extern long long g_f0dbfd;

st_5c638_2 * sub_5c638(st_5c638_2 *a0, unsigned long long a1)
{
    unsigned long v4;  // x8
    unsigned long long v5;  // x12
    unsigned long long v14;  // x13
    unsigned long long v15;  // x13
    unsigned long long v16;  // x8
    unsigned long long v17;  // x11
    unsigned long long v18;  // x10
    int v19;  // w9
    char v20;  // w13
    st_5c638_3 *v21;  // x14
    char v22;  // w15
    unsigned int v23;  // w14
    unsigned long long v6;  // x11
    unsigned int v24;  // w14
    unsigned int v25;  // w14
    unsigned int v26;  // w15
    char v27;  // w16
    unsigned int v28;  // w1
    unsigned int v29;  // w17
    unsigned int v30;  // w0
    unsigned int v31;  // w1
    unsigned int v32;  // w17
    unsigned int v33;  // w13
    unsigned long long v7;  // x11
    unsigned int v34;  // w0
    unsigned int v35;  // w16
    unsigned int v36;  // w13
    unsigned int v37;  // w13
    unsigned int v38;  // w14
    unsigned int v39;  // w13
    unsigned int v40;  // w13
    long long v41;  // x0
    char v42;  // w20
    char i;  // w22
    unsigned long long v8;  // x11
    unsigned int v44;  // w23
    char *v45;  // x0
    unsigned long v46;  // x22
    unsigned int v47;  // w8
    unsigned int v48;  // w9
    unsigned int v49;  // w10
    unsigned int v50;  // w13
    unsigned int v51;  // w12
    unsigned int v52;  // w14
    unsigned int v53;  // w14
    unsigned long long v9;  // x10
    unsigned int v54;  // w15
    unsigned int v55;  // w16
    unsigned int v56;  // w14
    unsigned int v57;  // w11
    unsigned int v58;  // w14
    unsigned int v59;  // w17
    unsigned int v60;  // w8
    unsigned int v61;  // w10
    unsigned int v62;  // w9
    unsigned int v63;  // w9
    unsigned long long v10;  // x10
    unsigned int v64;  // w10
    unsigned int v65;  // w9
    unsigned int v66;  // w8
    unsigned int v67;  // w9
    unsigned int v68;  // w10
    unsigned int v69;  // w12
    unsigned int v70;  // w10
    unsigned int v71;  // w8
    unsigned long v11;  // x11
    unsigned long long v12;  // x12
    unsigned long long v13;  // x14
    st_5c638_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_5c638_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    _bzero();
    v4 = (int)a1;
    v5 = (long long)(a1 * 0x100000000) >> 63 & 0xfffffffe00000000 | __ROL__(a1, 1) & 0x1fffffffe & 0x1ffffffff;
    v6 = v4 + ~v4 * 2 + 1;
    v7 = (v4 ^ 0xfffffffffffff7a8) + (v5 & 0xffffffffffffef50) + (v6 + (2136 | ~v6)) * 2;
    v8 = v7 + (v5 & 4272 | ~(v7 + 2)) + (v7 + 2 | v5 & 4272);
    v9 = ((0xfff - a1 | 0x7ffffffffffff7a8) + v4 - (v5 & 0x7fffffffffffef50)) * 2;
    v10 = (v9 + 0xffffffffffffef52 | v8 + 3) + (v8 + 4 ^ v9 + 0xffffffffffffef52 - (v8 + 3) + (v8 + 3 | 4269 - v9)) + (v8 + 4 & v9 + 0xffffffffffffef52 - (v8 + 3) + (v8 + 3 | 4269 - v9)) * 2;
    v11 = v4 - 2136;
    v12 = v4 & 0xfffff7a8;
    v13 = v12 - v4 + v11 + 2135;
    v14 = v4 | 0xfffffffffffff7a8;
    v15 = (unsigned int)v13 + 1 | v14;
    v16 = (v13 + (0xffe - v13 | v14) + v15 + 2 ^ v12 - ((v4 & 1) + v4) + (v11 ^ 0xfffffffffffffffe) + (v11 | 1) + 2137) + (v13 + (0xffe - v13 | v14) + v15 + 2 & v12 - ((v4 & 1) + v4) + (v11 ^ 0xfffffffffffffffe) + (v11 | 1) + 2137) * 2;
    v17 = 1 | ((-v16 | 1) + v16 + (v16 - 1 | 1)) * 2;
    v18 = ((v17 | v10) ^ -(v17 & v10)) + ((v17 & v10) + ((v17 | v10) & -(v17 & v10))) * 2;
    a0->field_820 = &a0[1].padding_0[8];
    v19 = (long long)(0x300000000 * v18 + ~(unsigned int)v18 * 0x400000000 + ((__ROL__((unsigned int)v18 - 1, 1) & 2 & 3) + ((unsigned int)v18 - 1 ^ 1)) * 0x200000000 + 0x300000000) >> 32 >> 4;
    a0->field_828 = v19;
    a0->field_830 = &g_f011d0.field_0;
    a0->field_838 = &g_f011d0.field_0;
    a0->field_840 = &g_f011d0.field_0;
    if (v19 >= 1)
    {
        v20 = 0;
        do
        {
            v21 = a0->field_820 + v20 * 16;
            *(char *)&v21->field_0 = 5;
            v21->field_8 = a0->field_838;
            a0->field_838 = v21;
            v22 = v20 + 1;
            v23 = (v20 | 0xfffffffe) + v22 + ~v20 * 2 + (v22 | 0xfffffffe) - (v22 + ~v20 * 2 & 0xfffffffe) + 1;
            v24 = ((v23 ^ v22) + (v23 + (v22 | ~v23)) * 2 + 2 | 1) + ((v23 ^ v22) & 1);
            v25 = v24 + ~v24 * 2;
            v26 = v25 + ~v25 * 2 + 1;
            v27 = v20 - 1;
            v28 = (v27 ^ 0xfffffffe) - (__ROL__(v27, 1) & 2 & 3);
            v29 = (((int)(v27 * 0x80000000) >> 31 & 0xfffffffe | v27 & 1) & (v28 | 1) * 2) + ((v28 | 1) ^ -(v27 & 1));
            v30 = v28 + 1;
            v31 = v30 + ~v28 * 2 | 1;
            v32 = (v29 | (v31 ^ v30) + (v31 & v30) * 2) + ((v31 ^ v30) + (v31 & v30) * 2 & v29);
            v33 = v27 - v20 * 2;
            v34 = v32 + ~v32 * 2 + 1;
            v35 = (v32 ^ v33) + ((v32 & v33) + (unsigned int)(v34 - v33 - (v34 | -v33))) * 2;
            v36 = (v32 - v33 + (v33 - 1 & ~v32)) * 2;
            v37 = v35 * 2 - (v36 + 2 & v35) - (((unsigned int)(0xfffffffd - v36) & v35) - v36);
            v38 = (v37 + 2 ^ v25) + ~(v37 + 2 | v25);
            v39 = (v38 & v37 + 3) * 4 + (v38 ^ v37 + 3) * 2;
            v40 = v26 - (v37 + 4) + (v37 + 4 - (v37 + 0x80000002 | v26)) * 2 + v39 + ~v39 * 2;
        } while ((v20 = ((unsigned int)(1 - v40 * 2) ^ v40 - 1) + ((unsigned int)(0x80000001 - v40 * 2) & v40 - 1) * 2 - 1, v20 < a0->field_828));
    }
    if (!(g_f0dbe0 & 1))
    {
        sub_5eb30(-2115757488044082031, 2);
        g_f0dbe0 = 1;
    }
    v41 = sub_5ada0(a0, &g_f0dbfd);
    a0->field_848 = v41;
    v42 = 0;
    i = 0;
    *(long long *)(sub_5a99c(v41, &g_f011d0.field_0) + 8) = v41;
    v44 = a0->field_818;
    do
    {
        v45 = sub_60194(a0);
        *v45 = 33;
        v45[8] = i;
        if (!(g_f0dbe1 & 1))
        {
            sub_5ebd8(-8845489467904936591, 4);
            g_f0dbe1 = 1;
        }
        if (!(g_f0dbe2 & 1))
        {
            sub_6004c(-9099997238708077316, 2);
            g_f0dbe2 = 1;
        }
        if (!(g_f0dbe3 & 1))
        {
            sub_5e8ec(-7218134798856041616, 3);
            g_f0dbe3 = 1;
        }
        if (!(g_f0dbe4 & 1))
        {
            sub_59f20(-2355234081369623425, 3);
            g_f0dbe4 = 1;
        }
        if (!(g_f0dbe5 & 1))
        {
            sub_5b0bc(-3768520746013652484, 4);
            g_f0dbe5 = 1;
        }
        if (!(g_f0dbe6 & 1))
        {
            sub_5b62c(-8286524414128918683, 6);
            g_f0dbe6 = 1;
        }
        if (!(g_f0dbe7 & 1))
        {
            sub_5ff98(-8671126145853822078, 6);
            g_f0dbe7 = 1;
        }
        if (!(g_f0dbe8 & 1))
        {
            sub_5b9cc(258728028113263815, 4);
            g_f0dbe8 = 1;
        }
        if (!(g_f0dbe9 & 1))
        {
            sub_5d63c(3380355767021192236, 3);
            g_f0dbe9 = 1;
        }
        if (!(g_f0dbea & 1))
        {
            sub_5d838(3539983877178611159, 3);
            g_f0dbea = 1;
        }
        if (!(g_f0dbeb & 1))
        {
            sub_5af0c(1560164250864816988, 5);
            g_f0dbeb = 1;
        }
        if (!(g_f0dbec & 1))
        {
            sub_59ce0(2474913802110528349, 4);
            g_f0dbec = 1;
        }
        if (!(g_f0dbed & 1))
        {
            sub_602b4(-1636916788791373616, 4);
            g_f0dbed = 1;
        }
        if (!(g_f0dbee & 1))
        {
            sub_5e9d8(-1404365514713675026, 7);
            g_f0dbee = 1;
        }
        if (!(g_f0dbef & 1))
        {
            sub_5e7ac(-4336501151021912605, 7);
            g_f0dbef = 1;
        }
        if (!(g_f0dbf0 & 1))
        {
            sub_5e84c(-4361611152063511223, 5);
            g_f0dbf0 = 1;
        }
        if (!(g_f0dbf1 & 1))
        {
            sub_6035c(-8032461541176199041, 4);
            g_f0dbf1 = 1;
        }
        if (!(g_f0dbf2 & 1))
        {
            sub_5b774(4538870303492810040, 3);
            g_f0dbf2 = 1;
        }
        if (!(g_f0dbf3 & 1))
        {
            sub_600ec(-0x56cbd3da600872a6, 5);
            g_f0dbf3 = 1;
        }
        if (!(g_f0dbf4 & 1))
        {
            sub_5913c(-7432961136357158572, 6);
            g_f0dbf4 = 1;
        }
        if (!(g_f0dbf5 & 1))
        {
            sub_5d310(-5752319107970460325, 2);
            g_f0dbf5 = 1;
        }
        if (!(g_f0dbf6 & 1))
        {
            sub_5d3b8(8477314609861406318, 3);
            g_f0dbf6 = 1;
        }
        if (!(g_f0dbf7 & 1))
        {
            sub_58d38(-4156454527758774593, 2);
            g_f0dbf7 = 1;
        }
        if (!(g_f0dbf8 & 1))
        {
            sub_59924(-6029874518859529395, 2);
            g_f0dbf8 = 1;
        }
        if (!(g_f0dbf9 & 1))
        {
            sub_5ae6c(209847351751748196, 2);
            g_f0dbf9 = 1;
        }
        if (!(g_f0dbfa & 1))
        {
            sub_59fc0(9120192583622090692, 2);
            g_f0dbfa = 1;
        }
        v46 = i;
        *(char **)(sub_5a99c(sub_5ada0(a0, (&g_e69280.field_0)[v46]), &g_f011d0.field_0) + 8) = v45;
        a0->field_818 = v44;
        v47 = (unsigned int)v46 + 1;
        v48 = ~(unsigned int)v46;
        v49 = v48 * 2;
        v50 = (unsigned int)v46 * 2;
        v51 = ((unsigned int)v46 ^ 0xfffffffe) - (v49 + (v50 & 2));
        v52 = 1 | (v51 + (0xffffffff ^ v51 * 2)) * 2;
        v53 = (v52 ^ v47) + (v52 & v47) * 2;
        v54 = v53 - 1 | 1;
        v55 = (v54 - v53 ^ v54) + (v54 - v53 & v54) * 2;
        v56 = (v53 ^ -v54) + (v53 & -v54) * 2;
        v57 = v42 + (0xffffffff ^ v42 * 2) + v55 + (v56 | ~v55) + (v55 | v56);
        v58 = v57 + 2;
        v59 = (((unsigned int)v46 | 1) & v42) * 4 + (((unsigned int)v46 | 1) ^ v42) * 2;
        v60 = v47 + v50 + v49 + (v59 | ~(v47 + v50 + v49)) + (v47 + v50 + v49 | v59) + 1;
        v61 = v51 + 1;
        v62 = v48 | 1;
        v63 = v62 - v61;
        v64 = v63 + (v61 & ((unsigned int)v46 | v62)) * 2;
        v65 = (v64 ^ 1) + (__ROL__(v63, 1) & 2 & 3) + ~v64 * 2;
        v66 = v60 + v65 + (-v65 & ~v60) * 2 + (unsigned int)(v60 - v65 - (v60 | -v65)) * 2;
        v67 = v66 + 1;
        v68 = ~v67 + v67 * 2;
        v69 = v58 + v58 + ~v58 * 2 - (v58 + ~v58 * 2 | -v68);
        v70 = (v57 + 3 ^ 1) - v58 * 2 + (__ROL__(v57 + 3, 1) & 2 & 3);
        v71 = (v58 + v68 & 1) - v67 + (v58 + v68 & 0xfffffffe) + v70 + ((unsigned int)(3 - v70) | v66 - 1);
        i = v69 + 1 + v71 + ((unsigned int)(0xfffffffe - v69) | -v71) + (v71 - v69 + (v69 + 1 | -v71) - 2 ^ v69 + 2) + (v71 - v69 + (v69 + 1 | -v71) - 2 & v69 + 2) * 2;
        v42 = -i;
    } while (26 > i);
    return a0;
}
