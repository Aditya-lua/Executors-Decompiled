/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xced24..0xd0d28 (8196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ced24_0 {
    char field_0;
} st_ced24_0;

extern long long g_c7c2eb;
extern char g_cc1aa8;
extern unsigned short g_f012b6;
extern unsigned short g_f012b8;
extern unsigned short g_f012ba;
extern unsigned short g_f012bc;
extern unsigned long long g_f012e8;
extern unsigned short g_f0dc7a;
extern unsigned short g_f0dc7c;
extern unsigned short g_f0dc7e;
extern unsigned short g_f0dc80;
extern char g_10002b0;

unsigned long long sub_ced24(void)
{
    unsigned long long v11;  // x10
    unsigned long long v12;  // x10
    unsigned short v21;  // x17
    unsigned short v22;  // x12
    unsigned short v23;  // x14
    unsigned short v24;  // x14
    unsigned long long v25;  // x16
    unsigned long v26;  // x12
    unsigned long long v27;  // x13
    unsigned long long v28;  // x13
    unsigned long long v29;  // x16
    unsigned long long v30;  // x17
    unsigned long long v13;  // x11
    unsigned long long v31;  // x1
    unsigned long long v32;  // x16
    unsigned long v33;  // x15
    unsigned long long v34;  // x16
    unsigned long long v35;  // x17
    unsigned long long v36;  // x1
    unsigned int v37;  // w1
    unsigned int v38;  // w11
    unsigned int v39;  // w17
    unsigned long long v40;  // x12
    unsigned short v14;  // x14
    unsigned long long v41;  // x13
    unsigned long long v42;  // x13
    unsigned int v43;  // w10
    unsigned int v44;  // w10
    unsigned int v45;  // w15
    unsigned int v46;  // w11
    unsigned int v47;  // w14
    unsigned long long v48;  // x14
    unsigned long long v49;  // x12
    unsigned long long v50;  // x12
    unsigned short v15;  // x15
    unsigned long long v51;  // x10
    unsigned long long v52;  // x10
    unsigned long long v53;  // x11
    unsigned long long v54;  // x10
    unsigned long long v55;  // x8
    unsigned long long v56;  // x12
    unsigned long long v57;  // x8
    unsigned long long v58;  // x9
    unsigned long long v59;  // x9
    unsigned long long v60;  // x14
    unsigned short v16;  // x15
    unsigned long long v61;  // x10
    unsigned long long v62;  // x11
    long long v63;  // x8
    unsigned long long v64;  // x0
    long long v65;  // x0
    long long v66;  // x0
    unsigned short v17;  // x16
    unsigned short v18;  // x17
    unsigned int v19;  // w10
    unsigned short v20;  // x10
    unsigned long long v0;  // [bp-0x22c]
    st_ced24_0 **v1;  // [bp-0x228], Other Possible Types: char
    st_ced24_0 *v2;  // [bp-0x220]
    st_ced24_0 **v3;  // [bp-0x218], Other Possible Types: char
    unsigned long long i;  // [bp-0x200]
    st_ced24_0 *v5;  // [bp-0x190], Other Possible Types: char, unsigned long long
    unsigned long long v6;  // [bp-0x188]
    unsigned long long v7;  // [bp-0x183]
    unsigned long v8;  // [bp-0x70]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    v5 = 0;
    v6 = 0;
    v7 = 0;
    v5 = (unsigned int)(7.489395633e-315 >> 0);
    i = 0;
    if (20 >= i)
    {
        do
        {
            (&v5)[i] = (unsigned int)i + 979324980 + (&v5)[i] - ((unsigned int)i + 979324980 & (&v5)[i]) * 2 - 108;
            i += 1;
        } while (i < 21);
    }
    v0 = (unsigned int)_open();
    if (v0 >= 0)
    {
        v5 = &v3;
        v3 = &v5;
        v11 = 1328484956504667742 + ~1328484956504667742 * 2 + 1;
        v12 = 1328484956504667742 + (v11 + (7894887080347731466 | ~v11)) * 2 + 1328484956507044344;
        v13 = (v12 ^ 62917653) + (v12 & 62917653) * 2 - 1;
        v14 = (g_f012b6 ^ 1) + ~g_f012b6 * 2 + ((unsigned short)(__ROL__(g_f012b6, 1)) & 2 & 3) & g_f0dc7a;
        v15 = -g_f0dc7a;
        v16 = g_f0dc7c | g_f012b8;
        v17 = -g_f012b8;
        v18 = g_f0dc7e + 1;
        v19 = g_f0dc7e & g_f012ba;
        v20 = v18 + (unsigned short)v19 + (unsigned short)~v19 * 2 + (v18 + ~g_f0dc7e * 2 & g_f012ba) + 1;
        v21 = -g_f0dc80;
        v22 = g_f0dc80 + g_f012bc + (v21 & ~g_f012bc) * 2 + (g_f012bc + (v21 | ~g_f012bc)) * 2 + 2;
        v23 = (g_f0dc80 & ~g_f012bc) * 2;
        v24 = (v22 | v23) + (v22 & v23);
        v25 = v13 * 2 + (v13 ^ 0xfffffffffffffffe) - (v13 * 2 & 2) + (v13 + ~(v13 * 2) | 0xffff) + 3;
        v26 = g_f012b6 + g_f0dc7a + (g_f012b6 + (v15 | ~g_f012b6)) * 2 + (v14 + (v15 & ~g_f012b6)) * 2 + 2 & 0xffff;
        v27 = (v26 - v25 + (v25 & ~v26)) * 2;
        v28 = v25 - v26 + (v27 | ~(v25 - v26)) + (v27 | v25 - v26) + 1;
        v29 = v13 >> 16;
        v30 = ~v29;
        v31 = v29 * 3 + v30 * 4 + 65538 + (0xfffc - (v29 * 3 + v30 * 4) | 0xffffffffffff0000) + 1;
        v32 = v31 + (v29 ^ 1) + v30 * 2 + (v13 >> 15 & 2) + (-((v29 ^ 1) + v30 * 2 + (v13 >> 15 & 2)) & ~v31) * 2 + (v31 - ((v29 ^ 1) + v30 * 2 + (v13 >> 15 & 2)) - (v31 | -((v29 ^ 1) + v30 * 2 + (v13 >> 15 & 2)))) * 2;
        v33 = (unsigned int)(g_f012b8 - g_f0dc7c) + (v16 ^ v17) * 2 + (v16 & v17) * 4 & 0xffff;
        v34 = v33 + 1 + v33 + 1 + ~v33 * 2 + v32 + ~(v33 + 1 + ~v33 * 2 | v32) + (v32 & v33) + ((v33 + 1 + ~v33 * 2 | v32) - (v33 + 1 + v33 + 1 + ~v33 * 2 + v32) & -(v32 & v33)) * 2 + (v33 + 1 + v33 + 1 + ~v33 * 2 + v32 + ~(v33 + 1 + ~v33 * 2 | v32) - (v32 & v33) - (v33 + 1 + v33 + 1 + ~v33 * 2 + v32 + ~(v33 + 1 + ~v33 * 2 | v32) | -(v32 & v33))) * 2;
        v35 = v13 >> 32;
        v36 = v35 + (0xffffffffffffffff ^ v35 * 2) | 0xffff;
        v37 = (unsigned int)v36 + (unsigned int)v35 + (unsigned int)~v35 * 2 + 1 + ((unsigned int)(v36 - (v35 + ~v35 * 2 + 1) - (v36 | ~(v35 + ~v35 * 2))) + ((unsigned int)~v36 & (unsigned int)~(v35 + ~v35 * 2))) * 2 ^ v20;
        v38 = v24;
        v39 = (unsigned int)((v13 >> 48) - v24) + ((unsigned int)(v13 >> 48) + (0xffffffff ^ (unsigned int)(v13 >> 48) * 2) + v24 & (unsigned int)-((v13 >> 48) + (0xffffffffffffffff ^ (v13 >> 48) * 2) | v24)) * 4 + ((unsigned int)(v13 >> 48) + (0xffffffff ^ (unsigned int)(v13 >> 48) * 2) + v24 ^ (unsigned int)-((v13 >> 48) + (0xffffffffffffffff ^ (v13 >> 48) * 2) | v24)) * 2 + (((unsigned int)(v13 >> 48) + (0xffffffff ^ (unsigned int)(v13 >> 48) * 2) + v24 & (unsigned int)-((v13 >> 48) + (0xffffffffffffffff ^ (v13 >> 48) * 2) | v24)) * 4 + ((unsigned int)(v13 >> 48) + (0xffffffff ^ (unsigned int)(v13 >> 48) * 2) + v24 ^ (unsigned int)-((v13 >> 48) + (0xffffffffffffffff ^ (v13 >> 48) * 2) | v24)) * 2 | (unsigned int)~((v13 >> 48) - v24)) + ((unsigned int)((v13 >> 48) - v24) & (unsigned int)~(((v13 >> 48) + (0xffffffffffffffff ^ (v13 >> 48) * 2) + v24 & -((v13 >> 48) + (0xffffffffffffffff ^ (v13 >> 48) * 2) | v24)) * 4 + ((v13 >> 48) + (0xffffffffffffffff ^ (v13 >> 48) * 2) + v24 ^ -((v13 >> 48) + (0xffffffffffffffff ^ (v13 >> 48) * 2) | v24)) * 2)) + 1;
        v40 = (v28 - v26 | (~(unsigned int)v28 & v26) * 2) + ((~(unsigned int)v28 & v26) * 2 & v28 - v26);
        v41 = v34 + ~v34 * 2 + 1;
        v42 = v34 - v33 + (v41 + v33 ^ -(v41 | v33)) * 2 + (v41 + v33 & -(v41 | v33)) * 4;
        v43 = v20;
        v44 = v43 + v37 + (-v43 & ~v37) * 2 + (v37 + (-v43 | ~v37)) * 2;
        v45 = (v39 ^ 1) + ~v39 * 2 + (__ROL__(v39, 1) & 2 & 3);
        v46 = (v39 ^ -v38) + (unsigned int)(v39 - v38 - (v39 | -v38)) * 2;
        v47 = (v45 + v38 + ~(v45 | v38)) * 2;
        v48 = v42 * 0x10000;
        v49 = v48 + v42 * 0x20000 + ~v48 * 4 | v40 + ~v40 * 2 + 1;
        v50 = ((v49 | 3) + 1 ^ (v40 | v48) + (v48 & v40) + 1) + ((v49 | 3) + 1 & (v40 | v48) + (v48 & v40) + 1) * 2;
        v51 = (v44 + ((v43 & ~v37) * 2 | (unsigned int)(0xfffffffd - v44)) + (v44 + 2 | (v43 & ~v37) * 2) + 3) * 0x100000000;
        v52 = (v51 | -v50) + v50 - 1 + ((v50 - 1 | v51) ^ -(v50 - 1 & v51)) + ((v50 - 1 | v51) & -(v50 - 1 & v51)) * 2;
        v53 = (((unsigned int)(0xfffd - v47) & v46) + v47 + 2 + (v47 + 2 & v46)) * 0x1000000000000;
        v54 = (0xfffffffffffffffe - v52 & v53) + v52 - v53 + (0xfffffffffffffffe - ((0xfffffffffffffffe - v52 & v53) + v52 - v53) | v53) + ((0xfffffffffffffffe - v52 & v53) + v52 - v53 + 1 | v53) + 2;
        v55 = g_f012e8 | 13376168;
        v56 = ~&g_cc1aa8 & ~g_f012e8;
        v57 = (13376168 & g_f012e8 | v56 + v55 * 2 + 1) + (v56 + v55 * 2 + 1 & 13376168 & g_f012e8);
        v58 = (g_f012e8 ^ 1) + ~g_f012e8 * 2 + ((g_f012e8 * 2 | g_f012e8 >> 63) & 2 & 3);
        v59 = v54 + v58 + (v58 | ~v54) + (v54 & ~v58) + 2;
        v60 = v57 + v59;
        v61 = v60 + (-v59 & ~v57) * 2 + (v57 - v59 - (v57 | -v59)) * 2;
        v62 = ((v57 | v59) & -v57) * 4 + ((v57 | v59) ^ -v57) * 2;
        (v61 + v62 + (~v61 | ~v62) + (v60 + ~((v59 | ~v57) + v57 + (v57 ^ v59))) * 2 + (v61 & v62) + 1)();
    }
    v64 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v63, &g_c7c2eb, 0);
    if (*(long long *)&g_10002b0 == v8)
        return v64;
    v65 = ___stack_chk_fail();
    sub_63590(&v5);
    v5 = &v3;
    sub_d18e4(&v5);
    v66 = __Unwind_Resume(v65);
    v5 = &v3;
    sub_d18e4(&v5);
    __Unwind_Resume(v66);
}
