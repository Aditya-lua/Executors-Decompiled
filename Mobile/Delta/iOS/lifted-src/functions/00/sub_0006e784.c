/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6e784..0x6e8cc (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6e784_0 {
    char field_0;
} st_6e784_0;

extern char g_10002b0;

unsigned long long sub_6e784(unsigned long a0, long long a1)
{
    unsigned long long v31;  // x0
    st_6e784_0 **v0;  // [bp-0xf0], Other Possible Types: char
    st_6e784_0 *v1;  // [bp-0xe8]
    uint128_t v2;  // [bp-0xe0]
    uint128_t v3;  // [bp-0xd0]
    uint128_t v4;  // [bp-0xc0]
    uint128_t v5;  // [bp-0xb4]
    unsigned int v6;  // [bp-0xa4]
    uint128_t v7;  // [bp-0xa0], Other Possible Types: unsigned int
    unsigned int v8;  // [bp-0x9c]
    unsigned int v9;  // [bp-0x98]
    unsigned int v10;  // [bp-0x94]
    uint128_t v11;  // [bp-0x90], Other Possible Types: unsigned int
    unsigned int v12;  // [bp-0x8c]
    char v13[16];  // [bp-0x80]
    uint128_t v14;  // [bp-0x70]
    uint128_t v15;  // [bp-0x60]
    uint128_t v16;  // [bp-0x60]
    unsigned int v17;  // [bp-0x58]
    unsigned int v18;  // [bp-0x54]
    unsigned int v19;  // [bp-0x50]
    char v20;  // [bp-0x41], Other Possible Types: unsigned int
    unsigned int v21;  // [bp-0x3d]
    unsigned int v22;  // [bp-0x39]
    unsigned int v23;  // [bp-0x35]
    unsigned int v24;  // [bp-0x31]
    unsigned int v25;  // [bp-0x2d]
    char v26;  // [bp-0x29]
    unsigned long v27;  // [bp-0x28]
    char *v28;  // [bp-0x10]
    char v29;  // [bp+0x0]

    v28 = &v29;
    v27 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    _strncpy(&v20, sub_a0c8(), 24);
    v26 = 0;
    v16 = 0x1032547698badcfeefcdab8967452301;
    v19 = 3285377520;
    v7 = 0;
    v11 = 0x41464135323538450000000000000000;
    strncpy(v13, "19E-74-49-AD-AC5", 16);
    v14 = 0x80000000354231313044433843354142;
    v7 = (((((v20 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v20 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v20 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v20 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v8 = (((((v21 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v21 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v21 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v21 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v9 = (((((v22 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v22 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v22 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v22 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v10 = (((((v23 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v23 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v23 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v23 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v11 = (((((v24 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v24 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v24 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v24 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v12 = (((((v25 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v25 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v25 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v25 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    sub_6d35c(&v16, &v7);
    v5 = 0;
    v3 = 0;
    v4 = 0;
    v2 = 0;
    v6 = 480;
    sub_6d35c(&v16, &v2);
    v15 = _INSERT(v16, 0, (((((*(unsigned int *)&v16 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | *(unsigned int *)&v16 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((*(unsigned int *)&v16 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | *(unsigned int *)&v16 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
    *(unsigned int *)((char *)&v15 + 4) = (((((*(unsigned int *)((void*)&v16 + 4) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | *(unsigned int *)((void*)&v16 + 4) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((*(unsigned int *)((void*)&v16 + 4) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | *(unsigned int *)((void*)&v16 + 4) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v17 = (((((*(unsigned int *)((void*)&v15 + 8) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | *(unsigned int *)((void*)&v15 + 8) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((*(unsigned int *)((void*)&v15 + 8) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | *(unsigned int *)((void*)&v15 + 8) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v18 = (((((*(unsigned int *)((void*)&v15 + 12) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | *(unsigned int *)((void*)&v15 + 12) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((*(unsigned int *)((void*)&v15 + 12) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | *(unsigned int *)((void*)&v15 + 12) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v19 = (((((v19 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v19 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v19 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v19 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v31 = sub_6e1e4(&v15, a1);
    if (*(long long *)&g_10002b0 == v27)
        return v31;
    ___stack_chk_fail();
}
