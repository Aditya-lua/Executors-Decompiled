/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c4a78..0x3c5114 (1692 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c4a78_1 {
    char field_0;
} st_3c4a78_1;

typedef struct st_3c4a78_0 {
    char padding_0[928];
    unsigned long long field_3a0;
} st_3c4a78_0;

extern char g_d0d7c0;
extern unsigned short g_f03828;
extern unsigned short g_f0382a;
extern unsigned short g_f0382c;
extern unsigned short g_f0382e;
extern unsigned long long g_f03838;
extern st_3c4a78_0 *g_f0d198;
extern unsigned long long g_f0d528;
extern unsigned short g_f11d20;
extern unsigned short g_f11d22;
extern unsigned short g_f11d24;
extern unsigned short g_f11d26;

void sub_3c4a78(unsigned long a0)
{
    unsigned long long v15;  // x26
    unsigned long long v16;  // x25
    long long v25;  // x22
    long long v26;  // x0
    long long v27;  // x21
    unsigned long long v29;  // x10
    unsigned long long v30;  // x10
    unsigned long long v31;  // x11
    unsigned short v32;  // x14
    unsigned short v33;  // x15
    unsigned short v34;  // x15
    unsigned long long v17;  // x24
    unsigned short v35;  // x16
    unsigned short v36;  // x17
    unsigned int v37;  // w10
    unsigned short v38;  // x10
    unsigned short v39;  // x17
    unsigned short v40;  // x12
    unsigned short v41;  // x14
    unsigned short v42;  // x14
    unsigned long long v43;  // x16
    unsigned long v44;  // x12
    unsigned long long v18;  // x23
    unsigned long long v45;  // x13
    unsigned long long v46;  // x13
    unsigned long long v47;  // x16
    unsigned long v48;  // x15
    unsigned long long v49;  // x16
    unsigned long long v50;  // x17
    unsigned long long v51;  // x1
    unsigned int v52;  // w1
    unsigned int v53;  // w11
    unsigned int v54;  // w17
    unsigned long long v19;  // x22
    unsigned long long v55;  // x12
    unsigned long long v56;  // x13
    unsigned long long v57;  // x13
    unsigned int v58;  // w10
    unsigned int v59;  // w10
    unsigned int v60;  // w15
    unsigned int v61;  // w11
    unsigned int v62;  // w14
    unsigned long long v63;  // x14
    unsigned long long v64;  // x12
    unsigned long long v20;  // x21
    unsigned long long v65;  // x12
    unsigned long long v66;  // x10
    unsigned long long v67;  // x10
    unsigned long long v68;  // x11
    unsigned long long v69;  // x10
    unsigned long long v70;  // x8
    unsigned long long v71;  // x12
    unsigned long long v72;  // x8
    unsigned long long v73;  // x9
    unsigned long long v74;  // x9
    unsigned long long v21;  // x20
    unsigned long long v75;  // x14
    unsigned long long v76;  // x10
    unsigned long long v77;  // x11
    unsigned long long v22;  // x19
    unsigned long long v23;  // x30
    long long len;  // x21
    char v0;  // [bp-0x90]
    char v1;  // [bp-0x78]
    st_3c4a78_1 **v2;  // [bp-0x60], Other Possible Types: char
    st_3c4a78_1 *v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = &v14;
    v13 = v23;
    len = _strlen(g_f0d528 + 435);
    v25 = sub_6b08(g_f0d198->field_3a0 + 186536);
    sub_64128(&v1, v25 + len, &v0);
    v26 = sub_a0c8(&v1);
    sub_12478(v26, g_f0d528 + 435, len);
    v27 = v26 + len;
    sub_12478(v27, sub_a0c8(g_f0d198->field_3a0 + 186536), v25);
    v0 = 0;
    sub_348a4(v27 + v25, 1, &v0);
    v3 = &v2;
    v2 = &v3;
    v29 = 8619088790769452617 + ~8619088790769452617 * 2 + 1;
    v30 = 8619088790769452617 + (v29 + (604283246075666059 | ~v29)) * 2 + 8619088790779109751;
    v31 = (v30 ^ 1739795) + (v30 & 1739795) * 2 - 1;
    v32 = (g_f03828 ^ 1) + ~g_f03828 * 2 + ((unsigned short)(__ROL__(g_f03828, 1)) & 2 & 3) & g_f11d20;
    v33 = -g_f11d20;
    v34 = g_f11d22 | g_f0382a;
    v35 = -g_f0382a;
    v36 = g_f11d24 + 1;
    v37 = g_f11d24 & g_f0382c;
    v38 = v36 + (unsigned short)v37 + (unsigned short)~v37 * 2 + (v36 + ~g_f11d24 * 2 & g_f0382c) + 1;
    v39 = -g_f11d26;
    v40 = g_f11d26 + g_f0382e + (v39 & ~g_f0382e) * 2 + (g_f0382e + (v39 | ~g_f0382e)) * 2 + 2;
    v41 = (g_f11d26 & ~g_f0382e) * 2;
    v42 = (v40 | v41) + (v40 & v41);
    v43 = v31 * 2 + (v31 ^ 0xfffffffffffffffe) - (v31 * 2 & 2) + (v31 + ~(v31 * 2) | 0xffff) + 3;
    v44 = g_f03828 + g_f11d20 + (g_f03828 + (v33 | ~g_f03828)) * 2 + (v32 + (v33 & ~g_f03828)) * 2 + 2 & 0xffff;
    v45 = (v44 - v43 + (v43 & ~v44)) * 2;
    v46 = v43 - v44 + (v45 | ~(v43 - v44)) + (v45 | v43 - v44) + 1;
    v47 = 3 * (v31 >> 16) + 4 * ~(v31 >> 16) + (0xfffc - ((v31 >> 16) * 3 + ~(v31 >> 16) * 4) | 0xffffffffffff0000) + (v31 >> 16 ^ 1) + 2 * ~(v31 >> 16) + (v31 >> 15 & 2) + 2 * (-((v31 >> 16 ^ 1) + ~(v31 >> 16) * 2 + (v31 >> 15 & 2)) & ~(char *)(3 * (v31 >> 16) + 4 * ~(v31 >> 16) + (0xfffc - ((v31 >> 16) * 3 + ~(v31 >> 16) * 4) | 0xffffffffffff0000) + 65539)) + 6 * (v31 >> 16) + 8 * ~(v31 >> 16) + 2 * (0xfffc - ((v31 >> 16) * 3 + ~(v31 >> 16) * 4) | 0xffffffffffff0000) + -2 * (v31 >> 16 ^ 1) + -4 * ~(v31 >> 16) + -2 * (v31 >> 15 & 2) + -2 * ((char *)(3 * (v31 >> 16) + 4 * ~(v31 >> 16) + (0xfffc - ((v31 >> 16) * 3 + ~(v31 >> 16) * 4) | 0xffffffffffff0000) + 65539) | -((v31 >> 16 ^ 1) + ~(v31 >> 16) * 2 + (v31 >> 15 & 2))) + 196617;
    v48 = (unsigned int)(g_f0382a - g_f11d22) + (v34 ^ v35) * 2 + (v34 & v35) * 4 & 0xffff;
    v49 = v48 + 1 + v48 + 1 + ~v48 * 2 + v47 + ~(v48 + 1 + ~v48 * 2 | v47) + (v47 & v48) + ((v48 + 1 + ~v48 * 2 | v47) - (v48 + 1 + v48 + 1 + ~v48 * 2 + v47) & -(v47 & v48)) * 2 + (v48 + 1 + v48 + 1 + ~v48 * 2 + v47 + ~(v48 + 1 + ~v48 * 2 | v47) - (v47 & v48) - (v48 + 1 + v48 + 1 + ~v48 * 2 + v47 + ~(v48 + 1 + ~v48 * 2 | v47) | -(v47 & v48))) * 2;
    v50 = v31 >> 32;
    v51 = v50 + (0xffffffffffffffff ^ v50 * 2) | 0xffff;
    v52 = (unsigned int)v51 + (unsigned int)v50 + (unsigned int)~v50 * 2 + 1 + ((unsigned int)(v51 - (v50 + ~v50 * 2 + 1) - (v51 | ~(v50 + ~v50 * 2))) + ((unsigned int)~v51 & (unsigned int)~(v50 + ~v50 * 2))) * 2 ^ v38;
    v53 = v42;
    v54 = (unsigned int)((v31 >> 48) - v42) + ((unsigned int)(v31 >> 48) + (0xffffffff ^ (unsigned int)(v31 >> 48) * 2) + v42 & (unsigned int)-((v31 >> 48) + (0xffffffffffffffff ^ (v31 >> 48) * 2) | v42)) * 4 + ((unsigned int)(v31 >> 48) + (0xffffffff ^ (unsigned int)(v31 >> 48) * 2) + v42 ^ (unsigned int)-((v31 >> 48) + (0xffffffffffffffff ^ (v31 >> 48) * 2) | v42)) * 2 + (((unsigned int)(v31 >> 48) + (0xffffffff ^ (unsigned int)(v31 >> 48) * 2) + v42 & (unsigned int)-((v31 >> 48) + (0xffffffffffffffff ^ (v31 >> 48) * 2) | v42)) * 4 + ((unsigned int)(v31 >> 48) + (0xffffffff ^ (unsigned int)(v31 >> 48) * 2) + v42 ^ (unsigned int)-((v31 >> 48) + (0xffffffffffffffff ^ (v31 >> 48) * 2) | v42)) * 2 | (unsigned int)~((v31 >> 48) - v42)) + ((unsigned int)((v31 >> 48) - v42) & (unsigned int)~(((v31 >> 48) + (0xffffffffffffffff ^ (v31 >> 48) * 2) + v42 & -((v31 >> 48) + (0xffffffffffffffff ^ (v31 >> 48) * 2) | v42)) * 4 + ((v31 >> 48) + (0xffffffffffffffff ^ (v31 >> 48) * 2) + v42 ^ -((v31 >> 48) + (0xffffffffffffffff ^ (v31 >> 48) * 2) | v42)) * 2)) + 1;
    v55 = (v46 - v44 | (~(unsigned int)v46 & v44) * 2) + ((~(unsigned int)v46 & v44) * 2 & v46 - v44);
    v56 = v49 + ~v49 * 2 + 1;
    v57 = v49 - v48 + (v56 + v48 ^ -(v56 | v48)) * 2 + (v56 + v48 & -(v56 | v48)) * 4;
    v58 = v38;
    v59 = v58 + v52 + (-v58 & ~v52) * 2 + (v52 + (-v58 | ~v52)) * 2;
    v60 = (v54 ^ 1) + ~v54 * 2 + (__ROL__(v54, 1) & 2 & 3);
    v61 = (v54 ^ -v53) + (unsigned int)(v54 - v53 - (v54 | -v53)) * 2;
    v62 = (v60 + v53 + ~(v60 | v53)) * 2;
    v63 = v57 * 0x10000;
    v64 = v63 + v57 * 0x20000 + ~v63 * 4 | v55 + ~v55 * 2 + 1;
    v65 = ((v64 | 3) + 1 ^ (v55 | v63) + (v63 & v55) + 1) + ((v64 | 3) + 1 & (v55 | v63) + (v63 & v55) + 1) * 2;
    v66 = (v59 + ((v58 & ~v52) * 2 | (unsigned int)(0xfffffffd - v59)) + (v59 + 2 | (v58 & ~v52) * 2) + 3) * 0x100000000;
    v67 = (v66 | -v65) + v65 - 1 + ((v65 - 1 | v66) ^ -(v65 - 1 & v66)) + ((v65 - 1 | v66) & -(v65 - 1 & v66)) * 2;
    v68 = (((unsigned int)(0xfffd - v62) & v61) + v62 + 2 + (v62 + 2 & v61)) * 0x1000000000000;
    v69 = (0xfffffffffffffffe - v67 & v68) + v67 - v68 + (0xfffffffffffffffe - ((0xfffffffffffffffe - v67 & v68) + v67 - v68) | v68) + ((0xfffffffffffffffe - v67 & v68) + v67 - v68 + 1 | v68) + 2;
    v70 = g_f03838 | 13686720;
    v71 = ~&g_d0d7c0 & ~g_f03838;
    v72 = (13686720 & g_f03838 | v71 + v70 * 2 + 1) + (v71 + v70 * 2 + 1 & 13686720 & g_f03838);
    v73 = (g_f03838 ^ 1) + ~g_f03838 * 2 + ((g_f03838 * 2 | g_f03838 >> 63) & 2 & 3);
    v74 = v69 + v73 + (v73 | ~v69) + (v69 & ~v73) + 2;
    v75 = v72 + v74;
    v76 = v75 + (-v74 & ~v72) * 2 + (v72 - v74 - (v72 | -v74)) * 2;
    v77 = ((v72 | v74) & -v72) * 4 + ((v72 | v74) ^ -v72) * 2;
    (v76 + v77 + (~v76 | ~v77) + (v75 + ~((v74 | ~v72) + v72 + (v72 ^ v74))) * 2 + (v76 & v77) + 1)();
}
