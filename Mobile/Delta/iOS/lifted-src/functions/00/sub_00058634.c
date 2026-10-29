/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x58634..0x589a4 (880 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_58634(void* ptr)
{
    char *v2;  // x19
    unsigned long idx;  // x8
    unsigned long idx1;  // x8
    unsigned long idx2;  // x8
    unsigned long v14;  // x8
    unsigned long v15;  // x8
    unsigned long v16;  // x8
    unsigned long v17;  // x8
    unsigned long v18;  // x8
    unsigned long v19;  // x8
    unsigned long v20;  // x8
    unsigned long v21;  // x8
    unsigned long index;  // x8
    unsigned long v22;  // x8
    unsigned long v23;  // x8
    unsigned long v24;  // x8
    unsigned long v25;  // x8
    unsigned long v26;  // x8
    unsigned long v27;  // x8
    unsigned long v28;  // x8
    unsigned long v29;  // x8
    unsigned long v30;  // x8
    unsigned long v31;  // x8
    unsigned long v5;  // x8
    unsigned long v32;  // x8
    unsigned long v33;  // x8
    unsigned long v34;  // x8
    unsigned long v35;  // x8
    unsigned long v36;  // x8
    unsigned long v37;  // x8
    unsigned long v38;  // x8
    unsigned long i;  // x8
    unsigned long v40;  // x8
    unsigned long v41;  // x8
    unsigned long v6;  // x8
    void* v42;  // x9
    unsigned long v7;  // x8
    unsigned long v8;  // x8
    unsigned long v9;  // x8
    unsigned long v10;  // x8
    unsigned long v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned int *)&ptr[1188] = 0;
    memset(ptr, 0, 128);
    v2 = ptr + 160;
    *(uint128_t *)&ptr[128] = 0;
    *(uint128_t *)&ptr[144] = 0;
    _memset(v2, 0xff, 1025);
    idx = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)idx + 1;
    *(unsigned int *)((char *)ptr + 4 * idx) = 8;
    index = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)index + 1;
    *(unsigned int *)((char *)ptr + 4 * index) = 16;
    v5 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v5 + 1;
    *(unsigned int *)((char *)ptr + 4 * v5) = 24;
    v6 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v6 + 1;
    *(unsigned int *)((char *)ptr + 4 * v6) = 32;
    v7 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v7 + 1;
    *(unsigned int *)((char *)ptr + 4 * v7) = 40;
    v8 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v8 + 1;
    *(unsigned int *)((char *)ptr + 4 * v8) = 48;
    v9 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v9 + 1;
    *(unsigned int *)((char *)ptr + 4 * v9) = 56;
    v10 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v10 + 1;
    *(unsigned int *)((char *)ptr + 4 * v10) = 64;
    v11 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v11 + 1;
    *(unsigned int *)((char *)ptr + 4 * v11) = 80;
    idx1 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)idx1 + 1;
    *(unsigned int *)((char *)ptr + 4 * idx1) = 96;
    idx2 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)idx2 + 1;
    *(unsigned int *)((char *)ptr + 4 * idx2) = 112;
    v14 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v14 + 1;
    *(unsigned int *)((char *)ptr + 4 * v14) = 128;
    v15 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v15 + 1;
    *(unsigned int *)((char *)ptr + 4 * v15) = 144;
    v16 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v16 + 1;
    *(unsigned int *)((char *)ptr + 4 * v16) = 160;
    v17 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v17 + 1;
    *(unsigned int *)((char *)ptr + 4 * v17) = 176;
    v18 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v18 + 1;
    *(unsigned int *)((char *)ptr + 4 * v18) = 192;
    v19 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v19 + 1;
    *(unsigned int *)((char *)ptr + 4 * v19) = 208;
    v20 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v20 + 1;
    *(unsigned int *)((char *)ptr + 4 * v20) = 224;
    v21 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v21 + 1;
    *(unsigned int *)((char *)ptr + 4 * v21) = 240;
    v22 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v22 + 1;
    *(unsigned int *)((char *)ptr + 4 * v22) = 0x100;
    v23 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v23 + 1;
    *(unsigned int *)((char *)ptr + 4 * v23) = 288;
    v24 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v24 + 1;
    *(unsigned int *)((char *)ptr + 4 * v24) = 320;
    v25 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v25 + 1;
    *(unsigned int *)((char *)ptr + 4 * v25) = 352;
    v26 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v26 + 1;
    *(unsigned int *)((char *)ptr + 4 * v26) = 384;
    v27 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v27 + 1;
    *(unsigned int *)((char *)ptr + 4 * v27) = 416;
    v28 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v28 + 1;
    *(unsigned int *)((char *)ptr + 4 * v28) = 448;
    v29 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v29 + 1;
    *(unsigned int *)((char *)ptr + 4 * v29) = 480;
    v30 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v30 + 1;
    *(unsigned int *)((char *)ptr + 4 * v30) = 0x200;
    v31 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v31 + 1;
    *(unsigned int *)((char *)ptr + 4 * v31) = 576;
    v32 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v32 + 1;
    *(unsigned int *)((char *)ptr + 4 * v32) = 640;
    v33 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v33 + 1;
    *(unsigned int *)((char *)ptr + 4 * v33) = 704;
    v34 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v34 + 1;
    *(unsigned int *)((char *)ptr + 4 * v34) = 0x300;
    v35 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v35 + 1;
    *(unsigned int *)((char *)ptr + 4 * v35) = 832;
    v36 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v36 + 1;
    *(unsigned int *)((char *)ptr + 4 * v36) = 896;
    v37 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v37 + 1;
    *(unsigned int *)((char *)ptr + 4 * v37) = 960;
    v38 = (int)ptr[1188];
    *(unsigned int *)&ptr[1188] = (unsigned int)v38 + 1;
    *(unsigned int *)((char *)ptr + 4 * v38) = 0x400;
    if ((int)ptr[1188] >= 1)
    {
        i = 0;
        do
        {
            v2[*(int *)((char *)ptr + 4 * i)] = i;
            i += 1;
        } while ((long long)i < (int)ptr[1188]);
    }
    v40 = 0x400;
    do
    {
        v41 = v40;
        v42 = ptr + v41;
        if ((char)v42[159] < 0)
            *(char *)&v42[159] = (char)v42[160];
    } while ((v40 = v41 - 1, v41 != 1));
    return ptr;
}
