/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad0c20..0xad0e80 (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ad0c20(unsigned long a0, unsigned long a1, unsigned long long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6)
{
    unsigned long long v25;  // x15
    unsigned long long v26;  // x16
    unsigned long long v35;  // x25
    unsigned long long v36;  // x26
    unsigned long long v37;  // x27
    unsigned long long v38;  // x28
    unsigned long long v39;  // x30
    unsigned long long v40;  // d8
    unsigned long long v41;  // d9
    unsigned long long v42;  // d10
    unsigned long long v43;  // d11
    unsigned long long v44;  // d12
    unsigned long long v27;  // x17
    unsigned long long v45;  // d13
    unsigned long long v46;  // d14
    unsigned long long v47;  // d15
    unsigned long long v48;  // w11
    unsigned long long v49;  // w11
    unsigned long long v50;  // x2
    unsigned long long v28;  // x18
    unsigned long long v29;  // x19
    unsigned long long v30;  // x20
    unsigned long long v31;  // x21
    unsigned long long v32;  // x22
    unsigned long long v33;  // x23
    unsigned long long v34;  // x24
    unsigned long long v0;  // [bp-0xc0]
    unsigned long long v1;  // [bp-0xb8]
    unsigned long long v2;  // [bp-0xb0]
    unsigned long long v3;  // [bp-0xa8]
    unsigned long long v4;  // [bp-0xa0]
    unsigned long long v5;  // [bp-0x98]
    unsigned long long v6;  // [bp-0x90]
    unsigned long long v7;  // [bp-0x88]
    char *v8;  // [bp-0x80]
    unsigned long long v9;  // [bp-0x78]
    unsigned long long v10;  // [bp-0x70]
    unsigned long long v11;  // [bp-0x68]
    unsigned long long v12;  // [bp-0x60]
    unsigned long long v13;  // [bp-0x58]
    unsigned long long v14;  // [bp-0x50]
    unsigned long long v15;  // [bp-0x48]
    unsigned long long v16;  // [bp-0x40]
    unsigned long long v17;  // [bp-0x38]
    unsigned long long v18;  // [bp-0x30]
    unsigned long long v19;  // [bp-0x28]
    unsigned long long v20;  // [bp-0x20]
    unsigned long long v21;  // [bp-0x18]
    unsigned long long v22;  // [bp-0x10]
    unsigned long long v23;  // [bp-0x8]
    char v24;  // [bp+0x0]

    v22 = v25;
    v23 = v26;
    v20 = v27;
    v21 = v28;
    v18 = v29;
    v19 = v30;
    v16 = v31;
    v17 = v32;
    v14 = v33;
    v15 = v34;
    v12 = v35;
    v13 = v36;
    v10 = v37;
    v11 = v38;
    v8 = &v24;
    v9 = v39;
    v6 = v40;
    v7 = v41;
    v4 = v42;
    v5 = v43;
    v2 = v44;
    v3 = v45;
    v0 = v46;
    v1 = v47;
    v48 = 8;
    do
    {
        v49 = v48;
    } while ((v48 = v49 - 1, v49 != 1));
    v50 = a2 >> 4;
    if ((long long)v50 < 1)
        goto LABEL_0xad1978;
    if (!(a2 & 15))
        goto LABEL_0xad0e80;
    if (v50 == 1)
        goto LABEL_0xad1540;
    else
        goto LABEL_0xad0e80;
}
