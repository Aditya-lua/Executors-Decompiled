/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5db80..0x5e7ac (3116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5db80_0 {
    char field_0;
} st_5db80_0;

extern unsigned long long g_e69410;
extern char g_10002b0;

void sub_5db80(unsigned long a0, char *a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v18;  // d9
    unsigned long long v19;  // d8
    unsigned long long v28;  // x20
    unsigned long long v29;  // x19
    unsigned long long v30;  // x30
    unsigned int v31;  // w9
    unsigned int v32;  // w0
    unsigned int v33;  // w17
    unsigned int v34;  // w0
    unsigned int v35;  // w1
    unsigned int v36;  // w2
    unsigned int v37;  // w3
    unsigned long long v20;  // x28
    unsigned int v38;  // w4
    unsigned int v39;  // w0
    unsigned int v40;  // w0
    unsigned int v41;  // w1
    unsigned int v42;  // w0
    unsigned int v43;  // w4
    unsigned int v44;  // w2
    unsigned int v45;  // w2
    unsigned int v46;  // w0
    unsigned int v47;  // w0
    unsigned long long v21;  // x27
    unsigned int v48;  // w1
    unsigned int v49;  // w17
    unsigned int v50;  // w1
    unsigned int v51;  // w3
    unsigned int v52;  // w17
    unsigned int v53;  // w17
    unsigned long long v54;  // 4509
    int v55;  // w17
    unsigned long long v56;  // x0
    unsigned long long v57;  // x17
    unsigned long long v22;  // x26
    unsigned long long v23;  // x25
    unsigned long long v24;  // x24
    unsigned long long v25;  // x23
    unsigned long long v26;  // x22
    unsigned long long v27;  // x21
    st_5db80_0 **v0;  // [bp-0xa8], Other Possible Types: char
    st_5db80_0 *v1;  // [bp-0xa0]
    unsigned long v2;  // [bp-0x78]
    unsigned long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    unsigned long long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    unsigned long long v7;  // [bp-0x50]
    unsigned long long v8;  // [bp-0x48]
    unsigned long long v9;  // [bp-0x40]
    unsigned long long v10;  // [bp-0x38]
    unsigned long long v11;  // [bp-0x30]
    unsigned long long v12;  // [bp-0x28]
    unsigned long long v13;  // [bp-0x20]
    unsigned long long v14;  // [bp-0x18]
    char *v15;  // [bp-0x10]
    unsigned long long v16;  // [bp-0x8]
    char v17;  // [bp+0x0]

    v3 = v18;
    v4 = v19;
    v5 = v20;
    v6 = v21;
    v7 = v22;
    v8 = v23;
    v9 = v24;
    v10 = v25;
    v11 = v26;
    v12 = v27;
    v13 = v28;
    v14 = v29;
    v15 = &v17;
    v16 = v30;
    v2 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v31 = *a1;
    v32 = ~v31;
    v33 = ~(v31 * 2) + v31;
    v34 = (v33 | v32) + v31 + 1 + (v33 | v31);
    v35 = v32 * 2 + v31;
    v36 = v35 + 2;
    v37 = (v34 & (unsigned int)(0xfffffffd - v35)) + v36;
    v38 = ~v34;
    v39 = (v35 + v34 + v34 + v38 * 2 + 1 + ((unsigned int)(0x7ffffffd - v35) | ~(v34 + v38 * 2 + 1))) * 2 + 8;
    v40 = (v37 ^ v38 - (v36 | ~v34)) + (v37 & v38 - (v36 | ~v34)) * 2 + (v39 | ~((v37 ^ v38 - (v36 | ~v34)) + (v37 & v38 - (v36 | ~v34)) * 2)) + (v39 | (v37 ^ v38 - (v36 | ~v34)) + (v37 & v38 - (v36 | ~v34)) * 2);
    v41 = v40 + 2;
    v42 = v40 + 1;
    v43 = v41 * 2;
    v44 = (v42 ^ 1) - v43 + (__ROL__(v42, 1) & 2 & 3);
    v45 = (v44 + 1 & -(v44 | 1)) * 4 + (v44 + 1 ^ -(v44 | 1)) * 2;
    v46 = (v41 | 0xfffffffe) + v41 + (v41 | 0xfffffffe) + v41 + v41 - (v42 | 1) + 2 + ((unsigned int)(0xfffffffe - ((v41 | 0xfffffffe) + v41 + v41 - (v42 | 1))) & ~((v41 | 0xfffffffe) + v41)) * 2 + (((unsigned int)(0xfffffffe - ((v41 | 0xfffffffe) + v41 + v41 - (v42 | 1))) | ~((v41 | 0xfffffffe) + v41)) + (v41 | 0xfffffffe) + v41 + v41 - (v42 | 1) + 2) * 2 + 1;
    v47 = (v45 | -(v43 + ~v41)) + v43 + ~v41 + (v45 | v43 + ~v41 - 1) + ~v46 + v46 * 2;
    v48 = ((v31 - 1) * 2 & 2) + (v31 - 1 ^ 1);
    v49 = v33 + v48 + (v31 | ~v48) + (v48 & v33);
    v50 = v49 + 2;
    v51 = (v31 | 0xfffffffe) - (-v31 & 0xfffffffe) + ((-v31 | 1) + v31) * 2;
    v52 = ((unsigned int)(0xfffffffe - v49) | -v51) + v50;
    v53 = ((v49 + 1 & v51 - 1) - v51 ^ v52 - 1) - ((v50 + ~v51 & -((v49 + 1 & v51 - 1) - v51)) * 4 + (((v49 + 1 & v51 - 1) - v51 & -v52) + (v50 + ~v51 ^ -((v49 + 1 & v51 - 1) - v51))) * 2);
    v54 = arm64g_calculate_condition(1, ((v47 | v53) + (v47 & v53) ^ 2) + ((v47 | v53) + (v47 & v53) + (~((v47 | v53) + (v47 & v53)) | 2)) * 2, 1, 0);
    if (v54 & 1)
        v55 = 0;
    else
        v55 = (int)(v31) >> 2;
    v56 = 328;
    if (v55 == 2)
        v56 = 464;
    if (v55 == 3)
        v56 = 432;
    if (!v55)
        v56 = 88;
    if (v55 == 4)
        v56 = 24;
    v57 = 216;
    if (v55 == 5)
        v56 = v57;
    goto *((void *)(*(long long *)((char *)&g_e69410 + v56)));
}
