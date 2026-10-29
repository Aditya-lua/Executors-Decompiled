/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc73374..0xc73620 (684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c73374_0 {
    unsigned long long field_0;
} st_c73374_0;

extern long long g_efa3f0;
extern long long g_efbae8;

unsigned long long sub_c73374(void* a0, unsigned long long *a1, long long a2)
{
    unsigned long v9;  // x20
    unsigned long long v10;  // x8
    unsigned long long v19;  // x8
    long long v20;  // x19
    unsigned long long v21;  // 4112
    unsigned long long ptr;  // x0
    void* ptr1;  // x19
    unsigned long long v24;  // x8
    unsigned long long v25;  // x9
    unsigned long long v26;  // 4137
    unsigned long long v27;  // x11
    void* v28;  // x12
    unsigned long long v11;  // 4163
    unsigned long long v29;  // x11
    long long v30;  // x1
    long long v31;  // x0
    unsigned long long v32;  // x13
    unsigned long long v33;  // x13
    unsigned long long v34;  // x14
    unsigned long long v35;  // x15
    unsigned long long v36;  // 4128
    unsigned long long v37;  // 4130
    unsigned long long v38;  // x14
    unsigned long long v12;  // x21
    unsigned long long v39;  // x14
    unsigned long long v40;  // x13
    unsigned long long v41;  // x13
    unsigned long long v42;  // 4135
    unsigned long long v43;  // 4137
    unsigned long long v44;  // x13
    unsigned long long v45;  // x13
    char v46;  // x12
    unsigned long long v47;  // x11
    void* v48;  // q0
    unsigned long long v13;  // x9
    uint128_t v49;  // q1
    long long v50;  // x0
    unsigned long long v14;  // x22
    unsigned long long v15;  // x8
    unsigned long long v16;  // x8
    unsigned long long v17;  // x8
    unsigned long long v18;  // x24
    unsigned long long *v0;  // [bp-0x88]
    st_c73374_0 **v1;  // [bp-0x78]
    void* v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x68]
    uint128_t v4;  // [bp-0x60], Other Possible Types: unsigned long long
    unsigned long v5;  // [bp-0x58]
    uint128_t v6;  // [bp-0x50]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v0 = a1;
    v1 = &v0;
    v9 = (long long)a0[24];
    v10 = v9 + 1;
    v11 = arm64g_calculate_condition(0x22, v9, 1, 0);
    if (!(v11 & 1))
    {
        v12 = (long long)a0[8];
        v13 = (v12 + 1 >> 3) * 7;
        if (v12 < 8)
            v13 = v12;
        if (v10 <= v13 >> 1)
        {
            sub_bd6e54();
            return 9223372036854775809;
        }
        if (v13 + 1 > v10)
            v10 = v13 + 1;
        if (8 > v10)
        {
            v14 = (v10 & 4) + 4;
            goto LABEL_c73448;
        }
        else if (v10 <= 0x1fffffffffffffff)
        {
            v15 = v10 * 8 / 7 - 1;
            if (!v15)
                v16 = 64;
            else
                v16 = (char)Clz(v15);
            v17 = 0xffffffffffffffff >> (v16 & 63);
            if (0x1ffffffffffffffe >= v17)
            {
                v14 = v17 + 1;
LABEL_c73448:
                v18 = v14 * 8;
                v19 = v14 + 8;
                v20 = v18 + v19;
                v21 = arm64g_calculate_condition(0x22, v18, v19, 0);
                if (!(v21 & 1))
                {
                    ptr = _malloc(v20);
                    if (ptr)
                    {
                        ptr1 = ptr + v18;
                        _memset(ptr1, 0xff, v14 + 8);
                        v24 = v14 - 1;
                        v25 = (v14 >> 3) * 7;
                        if (v14 < 9)
                            v25 = v24;
                        v2 = ptr1;
                        v3 = v24;
                        v4 = v25 - v9;
                        v5 = v9;
                        v6 = CONCAT(8, 8);
                        v26 = arm64g_calculate_condition(2, v12, 1, 0);
                        if (!(v26 & 1))
                        {
                            v27 = 0;
                            v28 = *(long long *)a0;
                            do
                            {
                                v29 = v27;
                                if (*((char *)v28 + v29) >= 0)
                                {
                                    v30 = a2;
                                    v31 = *(long long *)((char *)v28 + -8 * v29 - 8);
                                    if ((unsigned long long)v30 <= (unsigned long long)v31)
                                    {
                                        sub_c73c94(v31, v30, &g_efa3f0);
                                        __debugbreak();
                                    }
                                    v32 = v31 * 16;
                                    v33 = v24 & *(long long *)((char *)v0 + v32);
                                    v34 = *(long long *)((char *)ptr1 + v33) & 0x8080808080808080;
                                    if (!(*(long long *)((char *)ptr1 + v33) & 0x8080808080808080))
                                    {
                                        v35 = 8;
                                        do
                                        {
                                            v33 = v33 + v35 & v24;
                                            v35 += 8;
                                            v34 = *(long long *)((char *)ptr1 + v33) & 0x8080808080808080;
                                        } while (!(*(long long *)((char *)ptr1 + v33) & 0x8080808080808080));
                                    }
                                    v36 = ((((((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v37 = (((((((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v38 = ((((v37 | v36) & 0xffff0000ffff0000) >> 16 | (v37 | v36) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v37 | v36) & 0xffff0000ffff0000) >> 16 | (v37 | v36) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    if (!v38)
                                        v39 = 64;
                                    else
                                        v39 = Clz(v38);
                                    v40 = v33 + (v39 >> 3) & v24;
                                    if (*((char *)ptr1 + v40) >= 0)
                                    {
                                        v41 = *(long long *)ptr1 & 0x8080808080808080;
                                        v42 = ((((((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v43 = (((((((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v44 = ((((v43 | v42) & 0xffff0000ffff0000) >> 16 | (v43 | v42) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v43 | v42) & 0xffff0000ffff0000) >> 16 | (v43 | v42) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        if (!v44)
                                            v45 = 64;
                                        else
                                            v45 = Clz(v44);
                                        v40 = v45 >> 3;
                                    }
                                    v46 = (unsigned long long)(*(long long *)((char *)v0 + v32)) >> 57;
                                    *((char *)ptr1 + v40) = v46;
                                    *((char *)ptr1 + (v40 - 8 & v24) + 8) = v46;
                                    v28 = *(long long *)a0;
                                    ptr1 = v2;
                                    *(long long *)((char *)ptr1 + -8 * v40 - 8) = *(long long *)((char *)v28 + 8 * ~v29);
                                }
                            } while ((v27 = v29 + 1, v29 != v12));
                        }
                        v47 = (long long)a0[8];
                        v48 = (void*)*(int128_t *)a0;
                        v49 = (int128_t)a0[16];
                        *(void* *)a0 = v2;
                        *(unsigned long long *)&a0[8] = v24;
                        *(unsigned long long *)&a0[16] = v4;
                        *(unsigned long *)&a0[24] = v9;
                        v2 = v48;
                        v4 = v49;
                        if (!v47)
                            return 9223372036854775809;
                        _free((unsigned long long)v2 - (v47 * 8 + 15 & 0xfffffffffffffff8));
                        return 9223372036854775809;
                    }
                    v50 = sub_c6ba70(8, v20);
                    sub_bd6de0(&v2);
                    __Unwind_Resume(v50);
                }
            }
        }
    }
    sub_c73c94(sub_c73b38("Hash table capacity overflow", 57, &g_efbae8), 57, &g_efa3f0);
    __debugbreak();
}
