/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d66d0..0x3d6bc8 (1272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d66d0_0 {
    unsigned short field_0;
    char padding_2[1022];
    unsigned short field_400;
    unsigned short field_402;
    unsigned short field_404;
    unsigned short field_406;
    unsigned short field_408;
    unsigned short field_40a;
    unsigned short field_40c;
    unsigned short field_40e;
    unsigned short field_410;
    unsigned short field_412;
    unsigned short field_414;
    unsigned short field_416;
    unsigned short field_418;
    unsigned short field_41a;
    unsigned short field_41c;
    unsigned short field_41e;
    char padding_420[4];
    unsigned int field_424;
    unsigned int field_428;
    unsigned int field_42c;
    unsigned int field_430;
    unsigned int field_434;
    unsigned int field_438;
    unsigned int field_43c;
    unsigned int field_440;
    unsigned int field_444;
    unsigned int field_448;
    unsigned int field_44c;
    unsigned int field_450;
    unsigned int field_454;
    unsigned int field_458;
    unsigned int field_45c;
    unsigned int field_460;
    unsigned short field_464;
    unsigned short field_466;
    unsigned short field_468;
    unsigned short field_46a;
    unsigned short field_46c;
    unsigned short field_46e;
    unsigned short field_470;
    unsigned short field_472;
    unsigned short field_474;
    unsigned short field_476;
    unsigned short field_478;
    unsigned short field_47a;
    unsigned short field_47c;
    unsigned short field_47e;
    unsigned short field_480;
    unsigned short field_482;
    char field_484;
    char padding_485[287];
    unsigned short field_5a4;
} st_3d66d0_0;

typedef struct st_3d66d0_1 {
    unsigned long long field_0;
} st_3d66d0_1;

extern st_3d66d0_1 *g_f0b120;
extern char g_10002b0;

int sub_3d66d0(st_3d66d0_0 *a0, char *a1, unsigned int a2)
{
    char *v24;  // x19
    unsigned long i;  // x8
    unsigned long v34;  // x9
    unsigned int v35;  // w10
    unsigned long long v36;  // x8
    unsigned long v37;  // x9
    unsigned int v38;  // w10
    unsigned long long v39;  // x8
    unsigned long v40;  // x9
    unsigned int v41;  // w10
    unsigned short v42;  // x8
    unsigned int v43;  // w9
    char *v26;  // x10
    unsigned int v44;  // w10
    unsigned short v45;  // x8
    unsigned int v46;  // w9
    unsigned int v47;  // w10
    unsigned short v48;  // x8
    unsigned int v49;  // w9
    unsigned int v50;  // w10
    unsigned short v51;  // x8
    unsigned int v52;  // w9
    unsigned int v53;  // w10
    unsigned long v27;  // x8
    unsigned short v54;  // x8
    unsigned int v55;  // w9
    unsigned int v56;  // w10
    unsigned short v57;  // x8
    unsigned int v58;  // w9
    unsigned int v59;  // w10
    unsigned short v60;  // x8
    unsigned int v61;  // w9
    unsigned int v62;  // w10
    unsigned short v63;  // x8
    unsigned long idx;  // x11
    unsigned int v64;  // w9
    unsigned int v65;  // w10
    unsigned short v66;  // x8
    unsigned int v67;  // w9
    unsigned int v68;  // w10
    unsigned int v69;  // w9
    unsigned int v70;  // w8
    unsigned long v71;  // x8
    unsigned long index;  // x17
    unsigned long v73;  // x0
    unsigned long long idx1;  // x1
    unsigned long long v75;  // 4136
    unsigned long long v76;  // 4138
    unsigned long idx2;  // x1
    unsigned long v30;  // x8
    unsigned long v31;  // x9
    unsigned int v32;  // w10
    unsigned long long v33;  // x8
    uint128_t v0;  // [bp-0xc0]
    uint128_t v1;  // [bp-0xb0]
    uint128_t v2;  // [bp-0xa0]
    uint128_t v3;  // [bp-0x90]
    unsigned int v4;  // [bp-0x80]
    char v5;  // [bp-0x78]
    unsigned int v6;  // [bp-0x74]
    unsigned int v7;  // [bp-0x70]
    unsigned int v8;  // [bp-0x6c]
    unsigned int v9;  // [bp-0x68]
    unsigned int v10;  // [bp-0x64]
    unsigned int v11;  // [bp-0x60]
    unsigned int v12;  // [bp-0x5c]
    unsigned int v13;  // [bp-0x58]
    unsigned int v14;  // [bp-0x54]
    unsigned int v15;  // [bp-0x50]
    unsigned int v16;  // [bp-0x4c]
    unsigned int v17;  // [bp-0x48]
    unsigned int v18;  // [bp-0x44]
    unsigned int v19;  // [bp-0x40]
    unsigned int v20;  // [bp-0x3c]
    unsigned long v21;  // [bp-0x38]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v24 = a1;
    v21 = *(long long *)&g_10002b0;
    v4 = 0;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    _bzero();
    if ((int)a2 >= 1)
    {
        i = a2;
        v26 = v24;
        do
        {
            v27 = i;
            idx = *v26;
            v26 += 1;
            *(int *)((char *)&v0 + 4 * idx) = *(int *)((char *)&v0 + 4 * idx) + 1;
            i = v27 - 1;
        } while (i);
    }
    if (2 >= (int)*(unsigned int *)((void*)&v0 + 4) && 4 >= (int)*(unsigned int *)((void*)&v0 + 8) && 8 >= (int)*(unsigned int *)((void*)&v0 + 12) && 16 >= (int)*(unsigned int *)&v1 && 32 >= (int)*(unsigned int *)((void*)&v1 + 4) && 64 >= (int)*(unsigned int *)((void*)&v1 + 8) && 128 >= (int)*(unsigned int *)((void*)&v1 + 12) && 0x100 >= (int)*(unsigned int *)&v2 && 0x200 >= (int)*(unsigned int *)((void*)&v2 + 4) && 0x400 >= (int)*(unsigned int *)((void*)&v2 + 8) && 0x800 >= (int)*(unsigned int *)((void*)&v2 + 12) && 0x1000 >= (int)*(unsigned int *)&v3 && 0x2000 >= (int)*(unsigned int *)((void*)&v3 + 4) && 0x4000 >= (int)*(unsigned int *)((void*)&v3 + 8) && 0x8000 >= (int)*(unsigned int *)((void*)&v3 + 12))
    {
        v6 = 0;
        a0->field_402 = 0;
        a0->field_466 = 0;
        v30 = *(unsigned int *)((void*)&v0 + 4);
        if (2 >= (int)v30)
        {
            a0->field_424 = (unsigned int)v30 * 0x8000;
            v7 = (unsigned int)v30 * 2;
            a0->field_404 = v7;
            a0->field_468 = v30;
            v31 = *(unsigned int *)((void*)&v0 + 8);
            v32 = (unsigned int)v31 + v7;
            if (!(unsigned int)v31 || 4 >= (int)v32)
            {
                a0->field_428 = v32 * 0x4000;
                v33 = v31 + v30;
                v8 = v32 * 2;
                a0->field_406 = v8;
                a0->field_46a = v33;
                v34 = *(unsigned int *)((void*)&v0 + 12);
                v35 = (unsigned int)v34 + v8;
                if (!(unsigned int)v34 || 8 >= (int)v35)
                {
                    a0->field_42c = v35 * 0x2000;
                    v36 = v34 + v33;
                    v9 = v35 * 2;
                    a0->field_408 = v9;
                    a0->field_46c = v36;
                    v37 = *(unsigned int *)&v1;
                    v38 = (unsigned int)v37 + v9;
                    if (!(unsigned int)v37 || 16 >= (int)v38)
                    {
                        a0->field_430 = v38 * 0x1000;
                        v39 = v37 + v36;
                        v10 = v38 * 2;
                        a0->field_40a = v10;
                        a0->field_46e = v39;
                        v40 = *(unsigned int *)((void*)&v1 + 4);
                        v41 = (unsigned int)v40 + v10;
                        if (!(unsigned int)v40 || 32 >= (int)v41)
                        {
                            a0->field_434 = v41 * 0x800;
                            v42 = (unsigned short)v40 + (unsigned short)v39;
                            v11 = v41 * 2;
                            a0->field_40c = v11;
                            a0->field_470 = v42;
                            v43 = *(unsigned int *)((void*)&v1 + 8);
                            v44 = v43 + v11;
                            if (!v43 || 64 >= (int)v44)
                            {
                                a0->field_438 = v44 * 0x400;
                                v45 = (unsigned short)v43 + v42;
                                v12 = v44 * 2;
                                a0->field_40e = v12;
                                a0->field_472 = v45;
                                v46 = *(unsigned int *)((void*)&v1 + 12);
                                v47 = v46 + v12;
                                if (!v46 || 128 >= (int)v47)
                                {
                                    a0->field_43c = v47 * 0x200;
                                    v48 = (unsigned short)v46 + v45;
                                    v13 = v47 * 2;
                                    a0->field_410 = v13;
                                    a0->field_474 = v48;
                                    v49 = *(unsigned int *)&v2;
                                    v50 = v49 + v13;
                                    if (!v49 || 0x100 >= (int)v50)
                                    {
                                        a0->field_440 = v50 * 0x100;
                                        v51 = (unsigned short)v49 + v48;
                                        v14 = v50 * 2;
                                        a0->field_412 = v14;
                                        a0->field_476 = v51;
                                        v52 = *(unsigned int *)((void*)&v2 + 4);
                                        v53 = v52 + v14;
                                        if (!v52 || 0x200 >= (int)v53)
                                        {
                                            a0->field_444 = v53 * 128;
                                            v54 = (unsigned short)v52 + v51;
                                            v15 = v53 * 2;
                                            a0->field_414 = v15;
                                            a0->field_478 = v54;
                                            v55 = *(unsigned int *)((void*)&v2 + 8);
                                            v56 = v55 + v15;
                                            if (!v55 || 0x400 >= (int)v56)
                                            {
                                                a0->field_448 = v56 * 64;
                                                v57 = (unsigned short)v55 + v54;
                                                v16 = v56 * 2;
                                                a0->field_416 = v16;
                                                a0->field_47a = v57;
                                                v58 = *(unsigned int *)((void*)&v2 + 12);
                                                v59 = v58 + v16;
                                                if (!v58 || 0x800 >= (int)v59)
                                                {
                                                    a0->field_44c = v59 * 32;
                                                    v60 = (unsigned short)v58 + v57;
                                                    v17 = v59 * 2;
                                                    a0->field_418 = v17;
                                                    a0->field_47c = v60;
                                                    v61 = *(unsigned int *)&v3;
                                                    v62 = v61 + v17;
                                                    if (!v61 || 0x1000 >= (int)v62)
                                                    {
                                                        a0->field_450 = v62 * 16;
                                                        v63 = (unsigned short)v61 + v60;
                                                        v18 = v62 * 2;
                                                        a0->field_41a = v18;
                                                        a0->field_47e = v63;
                                                        v64 = *(unsigned int *)((void*)&v3 + 4);
                                                        v65 = v64 + v18;
                                                        if (!v64 || 0x2000 >= (int)v65)
                                                        {
                                                            a0->field_454 = v65 * 8;
                                                            v66 = (unsigned short)v64 + v63;
                                                            v19 = v65 * 2;
                                                            a0->field_41c = v19;
                                                            a0->field_480 = v66;
                                                            v67 = *(unsigned int *)((void*)&v3 + 8);
                                                            v68 = v67 + v19;
                                                            if (!v67 || 0x4000 >= (int)v68)
                                                            {
                                                                a0->field_458 = v68 * 4;
                                                                v20 = v68 * 2;
                                                                a0->field_41e = v20;
                                                                a0->field_482 = (unsigned short)v67 + v66;
                                                                v69 = *(unsigned int *)((void*)&v3 + 12);
                                                                v70 = v69 + v20;
                                                                if (!v69 || (int)v70 <= 0x8000)
                                                                {
                                                                    a0->field_45c = v70 * 2;
                                                                    a0->field_460 = 0x10000;
                                                                    if ((int)a2 >= 1)
                                                                    {
                                                                        v71 = 0;
                                                                        do
                                                                        {
                                                                            index = v24[v71];
                                                                            if ((unsigned int)index)
                                                                            {
                                                                                v73 = *(int *)&(&v5)[4 * index];
                                                                                idx1 = (&a0->field_464)[index] + (int)(v73 - (&a0->field_400)[index]);
                                                                                (&a0->field_484)[idx1] = index;
                                                                                (&a0->field_5a4)[idx1] = v71;
                                                                                if (9 >= (unsigned int)index)
                                                                                {
                                                                                    v75 = ((((v73 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v73 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16;
                                                                                    v76 = ((((v73 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v73 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0;
                                                                                    idx2 = (unsigned int)(((((((v76 >> 4 | v75 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (v76 >> 4 | v75 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v76 >> 4 | v75 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (v76 >> 4 | v75 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48) >> ((char)(16 - index) & 31);
                                                                                    if (0x1ff >= (unsigned int)idx2)
                                                                                    {
                                                                                        do
                                                                                        {
                                                                                            (&a0->field_0)[idx2] = (unsigned short)v71 | (unsigned short)index * 0x200;
                                                                                            idx2 += 1 << ((char)index & 63);
                                                                                        } while (idx2 < 0x200);
                                                                                    }
                                                                                }
                                                                                *(unsigned int *)&(&v5)[4 * index] = (unsigned int)v73 + 1;
                                                                            }
                                                                        } while ((v71 += 1, v71 != a2));
                                                                    }
                                                                    if (*(long long *)&g_10002b0 == v21)
                                                                        return 1;
                                                                    ___stack_chk_fail();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    g_f0b120();
}
