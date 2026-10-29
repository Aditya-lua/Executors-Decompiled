/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb1d1c..0xbb2220 (1284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bb1d1c_5 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
} st_bb1d1c_5;

typedef struct st_bb1d1c_1 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_bb1d1c_1;

typedef struct st_bb1d1c_4 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned int field_20;
    char padding_24[8];
    unsigned int field_2c;
} st_bb1d1c_4;

typedef struct st_bb1d1c_3 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
    char padding_18[16];
    unsigned int field_28;
    unsigned int field_2c;
} st_bb1d1c_3;

typedef struct st_bb1d1c_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
} st_bb1d1c_2;

typedef struct st_bb1d1c_0 {
    char padding_0[24];
    char field_18;
    char padding_19[7];
    unsigned long long field_20;
    long long field_28;
    char padding_30[8];
    unsigned long long field_38;
    unsigned long long field_40;
} st_bb1d1c_0;

extern long long g_ef8ec8;
extern long long g_ef8ee0;
extern long long g_ef8ef8;

unsigned int sub_bb1d1c(st_bb1d1c_0 *a0, unsigned int a1, unsigned int a2)
{
    unsigned long long v23;  // x19
    unsigned long long v24;  // x8
    unsigned long long ptr;  // x0
    unsigned long long idx;  // x23
    unsigned long long v35;  // x22
    st_bb1d1c_4 *v36;  // x8
    unsigned long long v37;  // w22
    unsigned long long i;  // x20
    unsigned long long *v39;  // x27
    unsigned long v40;  // x28
    unsigned long long v41;  // x26
    st_bb1d1c_5 *v42;  // x8
    unsigned long v25;  // x20
    unsigned long long v43;  // x24
    unsigned long long *v44;  // x25
    unsigned long long j;  // x22
    unsigned long long *v46;  // x8
    st_bb1d1c_2 *v47;  // x8
    unsigned long long v48;  // x8
    unsigned long long v49;  // x9
    unsigned long long *v50;  // x10
    unsigned long long *v51;  // x11
    unsigned long long *v52;  // x11
    st_bb1d1c_3 *v26;  // x8
    unsigned long long *v53;  // x10
    unsigned long long v54;  // x26
    unsigned int v27;  // w21
    long long v28;  // x8
    st_bb1d1c_1 *v29;  // x8
    unsigned long long v30;  // x22
    unsigned long long v31;  // x22
    st_bb1d1c_4 *v32;  // x10
    unsigned long long ptr1;  // [bp-0x138]
    unsigned long long v1;  // [bp-0x130]
    unsigned long long v2;  // [bp-0x128]
    unsigned int v3;  // [bp-0x124]
    unsigned long long v4;  // [bp-0x118]
    unsigned long long v5;  // [bp-0x110]
    unsigned long long v6;  // [bp-0x108]
    char v7;  // [bp-0x100]
    unsigned long long *v8;  // [bp-0xf8]
    unsigned long v9;  // [bp-0xf0]
    unsigned long long v10;  // [bp-0xe8]
    unsigned long long *v11;  // [bp-0xe0]
    unsigned long long v12;  // [bp-0xd8]
    uint128_t v13;  // [bp-0xd0], Other Possible Types: unsigned long
    unsigned long long *v14;  // [bp-0xc8]
    uint128_t v15;  // [bp-0xc0], Other Possible Types: unsigned long long
    uint128_t v16;  // [bp-0xb0]
    uint128_t v17;  // [bp-0xa0]
    uint128_t v18;  // [bp-0x90]
    uint128_t v19;  // [bp-0x80]
    unsigned long v20;  // [bp-0x70]
    char *v21;  // [bp-0x10]
    char v22;  // [bp+0x0]

    v21 = &v22;
    v23 = a0->field_40;
    v24 = a2;
    if (v23 > v24 && !(v25 = a0->field_38, v26 = v25 + (unsigned int)v24 * 48, v26->field_0 == 0x8000000000000000))
    {
        v27 = v26->field_28;
        v3 = v26->field_2c;
        sub_b9ecac(&v7, v26->field_8, v26->field_10);
        v28 = a1;
        if ((unsigned long long)a0->field_28 <= (unsigned long long)v28 || (v29 = a0->field_20 + v28 * 32, v29->field_0 == 0x8000000000000000))
            v30 = 0xffffffff;
        else
            v30 = v29->field_18;
        do
        {
            v31 = v30;
            if (v23 <= v31 || !(v32 = v25 + 48 * v31, v32->field_0 != 0x8000000000000000))
            {
                v37 = 0;
LABEL_bb1e7c:
                sub_b9f1a4(v8, v9);
                if (!v7)
                    return v37 & 1;
                _free(v8);
                return v37 & 1;
            }
        } while ((v30 = v32->field_20, v27 != v32->field_2c));
        ptr = _malloc(16);
        if (ptr)
        {
            *(unsigned int *)ptr = v31;
            v16 = CONCAT(ptr, 4);
            idx = 1;
            while (1)
            {
                *(unsigned long long *)&v17 = idx;
                do
                {
                    v35 = v30;
                    if (v23 <= v35 || (v36 = v25 + 48 * v35, v36->field_0 == 0x8000000000000000))
                    {
                        v37 = 0;
                        i = *(unsigned long long *)((void*)&v16 + 8);
                        ptr1 = i;
                        v1 = *(unsigned long long *)&v16;
                        v39 = v8;
                        v4 = v9 * 72;
                        v5 = i + idx * 4;
LABEL_bb1ee8:
                        v2 = v37;
                        v40 = a0->field_38;
                        v6 = a0->field_40;
                        do
                        {
                            v41 = *(int *)i;
                            i += 4;
                            if (v6 <= v41 || !(v42 = v40 + (unsigned int)v41 * 48, v42->field_0 != 0x8000000000000000))
                            {
                                sub_c73c64(&g_ef8ee0);
                                __debugbreak();
                            }
                            sub_b9ecac(&v10, v42->field_8, v42->field_10);
                            v43 = v12;
                            if (v10 - v43 >= v9)
                            {
                                v44 = v11;
                                if (!v9)
                                    goto LABEL_bb1fb4;
                            }
                            else
                            {
                                sub_c736c8(&v10, v43, v9, 8, 72);
                                v44 = v11;
                                v43 = v12;
                            }
                            j = 0;
                            do
                            {
                                v46 = &v39[9 * j];
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                if ((long long)/* unsupported instruction */ < 0)
                                {
                                    sub_c769bc();
                                    sub_c73c64(&g_ef8ef8);
                                    __debugbreak();
                                }
                                *(unsigned long long *)&v16 = *v46;
                                sub_bd2788((char *)&v16 + 8, v46 + 1);
                                v47 = &v44[9 * v43];
                                v47->field_20 = v18;
                                v47->field_30 = v19;
                                v47->field_40 = v20;
                                v47->field_0 = v16;
                                v47->field_10 = v17;
                                v43 += 1;
                                j += 1;
                            } while (j != v9);
LABEL_bb1fb4:
                            v12 = v43;
                            if (v43 != v9)
                                continue;
                            v48 = v43 * 72;
                            v49 = v4;
                            v50 = v39;
                            v51 = v44;
                            while (1)
                            {
                                v52 = v51;
                                v53 = v50;
                                if (!v48)
                                    break;
                                if (!v49 || !(v51 = v52 + 9, v50 = v53 + 9, v49 -= 72, v48 -= 72, *v52 == *v53))
                                    goto LABEL_bb2004;
                            }
                            if (!(v43 & 0x1fffffffffffffff ^ v9 & 0x1fffffffffffffff))
                            {
                                sub_bd9618(&v16, &a0->field_18, v41);
                                if (*(unsigned long long *)&v16 == 0x8000000000000000)
                                {
                                    sub_c73c64(&g_ef8ef8);
                                    __debugbreak();
                                }
                                v13 = v16;
                                v15 = v17;
                                v54 = *(unsigned long long *)((void*)&v13 + 8);
                                sub_b9f1a4(v54, v15);
                                if (*(unsigned long long *)&v13)
                                    _free(v54);
                                v13 = v10;
                                v14 = v44;
                                v15 = v43;
                                sub_bd929c(&a0->field_18, a1, v3, &v13);
                                v37 = 1;
                                if (i == v5)
                                    goto LABEL_bb20c8;
                                goto LABEL_bb1ee8;
                            }
LABEL_bb2004:
                            sub_b9f1a4(v44, v43);
                            if (v10)
                                _free(v11);
                        } while (i != v5);
                        v37 = v2;
LABEL_bb20c8:
                        if (v1)
                        {
                            _free(ptr1);
                            goto LABEL_bb1e7c;
                        }
                    }
                } while ((v30 = v36->field_20, v27 != v36->field_2c));
                if (idx == *(unsigned long long *)&v16)
                {
                    sub_c736c8(&v16, idx, 1, 4, 4);
                    ptr = *(unsigned long long *)((void*)&v16 + 8);
                }
                *(unsigned int *)(ptr + idx * 4) = v35;
                idx += 1;
            }
        }
    }
    else
    {
        sub_c73c64(&g_ef8ec8);
    }
    sub_c6b970(4, 16);
    __debugbreak();
}
