/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd19b8..0xd2024 (1644 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d19b8_0 {
    char field_0;
} st_d19b8_0;

extern char g_cc1b00;
extern unsigned short g_f012ae;
extern unsigned short g_f012b0;
extern unsigned short g_f012b2;
extern unsigned short g_f012b4;
extern unsigned long long g_f012e0;
extern unsigned short g_f0dc72;
extern unsigned short g_f0dc74;
extern unsigned short g_f0dc76;
extern unsigned short g_f0dc78;

void sub_d19b8(void)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned int v17;  // w13
    unsigned short v18;  // x13
    unsigned short v19;  // x13
    unsigned int v20;  // w17
    unsigned int v21;  // w0
    unsigned int v22;  // w12
    unsigned int v23;  // w16
    unsigned long v24;  // x12
    unsigned long long v25;  // x16
    unsigned long long v26;  // x14
    unsigned long long v9;  // x30
    unsigned long long v27;  // x17
    unsigned long long v28;  // x0
    unsigned long long v29;  // x1
    unsigned long long v30;  // x0
    unsigned long long v31;  // x16
    unsigned long long v32;  // x16
    unsigned long long v33;  // x17
    unsigned long long v34;  // x0
    unsigned long long v35;  // x1
    unsigned long long v36;  // x2
    unsigned long long v10;  // x11
    unsigned long long v37;  // x17
    unsigned long long v38;  // x15
    unsigned long long v39;  // x17
    unsigned long long v40;  // x1
    unsigned long long v41;  // x0
    unsigned long long v42;  // x1
    unsigned long v43;  // x3
    unsigned long v44;  // x17
    unsigned int v45;  // w1
    unsigned long long v46;  // x11
    unsigned short v11;  // x15
    unsigned long long v47;  // x2
    unsigned long long v48;  // x11
    unsigned long long v49;  // x11
    unsigned long long v50;  // x15
    unsigned long long v51;  // x16
    unsigned long long v52;  // x12
    unsigned long long v53;  // x13
    unsigned long long v54;  // x14
    unsigned long long v55;  // x13
    unsigned long long v56;  // x12
    unsigned short v12;  // x13
    unsigned long long v57;  // x12
    unsigned long long v58;  // x10
    unsigned long long v59;  // x11
    unsigned long long v60;  // x10
    unsigned long v61;  // x11
    unsigned long long v62;  // x8
    unsigned long long v63;  // x9
    unsigned long long v64;  // x9
    unsigned long long v65;  // x11
    unsigned long long v66;  // x12
    unsigned short v13;  // x14
    unsigned long long v67;  // x12
    unsigned long long v68;  // x10
    unsigned long v69;  // x8
    unsigned long long v70;  // x8
    unsigned short v14;  // x16
    unsigned int v15;  // w17
    unsigned int v16;  // w0
    st_d19b8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_d19b8_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    operatornew(24);
    v1 = &v0;
    v0 = &v1;
    v10 = ~0xffffffffff6e6aeb + 0xfffffffffedcd5d6;
    v11 = -g_f0dc72;
    v12 = g_f0dc72 + g_f012ae + (v11 & ~g_f012ae) * 2 + (g_f012ae + (v11 | ~g_f012ae)) * 2 + 2;
    v13 = ((g_f012ae ^ 1) + ~g_f012ae * 2 + ((unsigned short)(__ROL__(g_f012ae, 1)) & 2 & 3) & g_f0dc72) * 2;
    v14 = -g_f0dc74;
    v15 = g_f012b2 + (g_f0dc76 | ~g_f012b2) + (g_f0dc76 ^ g_f012b2) + 1;
    v16 = g_f0dc76 + g_f012b2;
    v17 = -(g_f0dc76 | g_f012b2);
    v18 = -((v16 ^ v17) + (v16 & v17) * 2);
    v19 = (v18 ^ (unsigned short)v15) + ((unsigned short)v15 + (v18 | (unsigned short)~v15)) * 2 + 2;
    v20 = g_f012b4 * 3 + ~g_f012b4 * 4;
    v21 = (unsigned int)(0xfffffffc - v20) | g_f0dc78;
    v22 = g_f012b4 + g_f0dc78 + ~g_f0dc78 * 2 + 2;
    v23 = (v21 & v20 + 4) * 4 + (v21 ^ v20 + 4) * 2 | 1;
    v24 = (v23 ^ v22) + (v23 & v22) * 2 - 1;
    v25 = v10 & 0xffff;
    v26 = ((unsigned int)(0xffff - v13) & v12) + v13 + (v13 & v12) & 0xffff;
    v27 = -v26;
    v28 = (v25 ^ 1) + v25 * 2 + ~v25 * 4 + (v25 * 2 & 2) + 2;
    v29 = v28 + v26;
    v30 = -(v28 | v26);
    v31 = v25 + v26 + (v29 & v30) * 4 + (v25 - ((v25 | v27) + v26)) * 2;
    v32 = ~(v31 + ((v29 ^ v30) + (v27 & ~v25)) * 2 + 1) + (v31 + ((v29 ^ v30) + (v27 & ~v25)) * 2 + 1) * 2;
    v33 = v10 >> 16;
    v34 = ~v33;
    v35 = (v33 ^ 1) + v34 * 2 + (v10 >> 15 & 2) + 1;
    v36 = (unsigned int)v35 - 1 | 0xffffffffffff0000;
    v37 = (v35 - v36 - 2 ^ 0xfffffffffffffffd - (v33 * 3 + v34 * 4)) + (v35 - v36 - 2 & 0x7ffffffffffffffd - (v33 * 3 + v34 * 4)) * 2;
    v38 = g_f0dc74 + g_f012b0 + ((unsigned int)(g_f012b0 - g_f0dc74 - (v14 | g_f012b0)) + (v14 & ~g_f012b0) + (g_f012b0 + ~g_f012b0 * 2 + 1 & g_f0dc74)) * 2 & 0xffff;
    v39 = v37 + 1;
    v40 = v39 + ~v37 * 2 | v38;
    v41 = (-((v40 ^ v39) + (v40 & v39) * 2) ^ v39 + (v38 | ~v37) + (v37 ^ v38)) + (-((v40 ^ v39) + (v40 & v39) * 2) & v39 + (v38 | ~v37) + (v37 ^ v38)) * 2;
    v42 = (v10 >> 32) + (v10 >> 32 & 0xffff0000 ^ 0xffffffffffff0000);
    v43 = v19;
    v44 = ~v43;
    v45 = (unsigned int)(v42 + 0x10000 + v43 + ((v43 | ~(v42 + 0x10000)) ^ 0xfffffffffffefffe - v42) + v43 + v44 * 2 + 1 - ((v43 | ~(v42 + 0x10000)) & v42 + 65537) * 2) + ((unsigned int)v42 + 65537 + (unsigned int)~(v42 + 0x10000) * 2 & (unsigned int)~(v43 + v44 * 2 + 1)) + 2;
    v46 = v10 >> 48;
    v47 = v24 & 0xffff;
    v48 = -((v46 + ~v46 * 2 ^ ~(v46 + ~v46 * 2 + 1 | v47)) + ((v46 + ~v46 * 2 + 1 | v47) & ~(v46 + ~v46 * 2)) * 2);
    v49 = (v48 ^ (v46 | v47)) + ((v46 | v47) + (v48 | ~(v46 | v47))) * 2 + 2;
    v50 = v41 + 1 + v38 + (-v38 & ~v41) * 2 + (v41 + 1 + (-v38 | ~v41)) * 2;
    v51 = ((v41 | v38) & -v41) * 4 + ((v41 | v38) ^ -v41) * 2 + ~(((v41 | v38) & -v41) * 4 + ((v41 | v38) ^ -v41) * 2) * 2 | 1;
    v52 = (v50 + ~v51) * 0x20000 + (v51 - v50) * 0x10000 | v32 + (v26 | ~v32) + (v32 ^ v26) - (v32 & v26) + 1;
    v53 = (((unsigned int)(0xfffffffe - (((unsigned int)v44 & ~v45) + (v19 | v45) * 2)) & ~((v45 | (unsigned int)v44) + v19)) + (((unsigned int)v44 & ~v45) + (v19 | v45) * 2 + 1 & ~((v45 | (unsigned int)v44) + v19))) * 0x200000000 + ((v45 | (unsigned int)v44) + v19 + ((unsigned int)v44 & ~v45) + (v19 | v45) * 2 + 1 + 2) * 0x100000000;
    v54 = v53 + 0xffffffff00000000;
    v55 = 0xffffffff - v53;
    v56 = (v52 + ~v52 * 2 ^ ~((v52 + ~v52 * 2 + 1 & v55) + v54)) + ((v52 + ~v52 * 2 + 1 & v55) + v54 & ~(v52 + ~v52 * 2)) * 2;
    v57 = (v55 & v52) + v54 - (v52 & v54) + (v56 | ~((v55 & v52) + v54 - (v52 & v54))) + (v56 | (v55 & v52) + v54 - (v52 & v54));
    v58 = (v49 - v24 - ((unsigned int)v49 | (unsigned int)-(v24 & 0xffff)) + ((unsigned int)-(v24 & 0xffff) & ~(unsigned int)v49) + ((unsigned int)v49 * 3 + ~(unsigned int)v49 * 4 + 3 & (unsigned int)v24)) * 0x2000000000000 + ((unsigned int)v24 + (unsigned int)v49 - 1) * 0x1000000000000;
    v59 = 0xfffefffffffffffc - v58 | ~(v57 + 1) | 3;
    v60 = ((v59 ^ v57 + 2) + (v59 & v57 + 2) * 2 ^ v58 + 281474976710657) + ((v59 ^ v57 + 2) + (v59 & v57 + 2) * 2 & v58 + 281474976710657) * 2;
    v61 = g_f012e0 + 1;
    v62 = &(&g_cc1b00)[-1 * g_f012e0 + 2 * (v61 & ~&g_cc1b00)] + 0x2 * &(&g_cc1b00)[v61 | ~&g_cc1b00];
    v63 = ~(~v60 + v60 * 2 - g_f012e0) + (~v60 + v60 * 2 - g_f012e0) * 2;
    v64 = (v63 ^ 2) + (v63 * 2 & 4) - 1;
    v65 = v62 + ~v62 * 2 + 1;
    v66 = ((v65 + ~v65 * 2 + 1 | v64) & ~(v65 + ~v65 * 2)) * 4 + (v65 + ~v65 * 2 ^ ~(v65 + ~v65 * 2 + 1 | v64)) * 2;
    v67 = v66 + ~v66 * 2 | 1;
    v68 = v67 - ((v62 ^ -v64) + (v62 - (v64 + (v62 | -v64))) * 2 + 1) + ((v62 ^ -v64) + (v62 - (v64 + (v62 | -v64))) * 2 + 1 + ~v67) * 2;
    v69 = ((v65 | v64) + v62) * 2 + 2;
    v70 = ((v68 + v69 ^ -(v68 | v69)) + (v68 + v69 & -(v68 | v69)) * 2 ^ (v68 | v69) + 1) + ((v68 + v69 ^ -(v68 | v69)) + (v68 + v69 & -(v68 | v69)) * 2 & (v68 | v69) + 1) * 2;
    (~v70 + v70 * 2)();
}
