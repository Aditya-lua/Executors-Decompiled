/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa42958..0xa42da4 (1100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a42958_1 {
    char padding_0[648];
    struct st_a42958_1 *field_288;
    char padding_290[48];
    unsigned long long field_2c0;
} st_a42958_1;

typedef struct st_a42958_0 {
    long long field_0;
    char padding_8[8];
    unsigned int field_10;
    char padding_14[20];
    char field_28;
    char padding_29[15];
    unsigned long long field_38;
    unsigned short field_3d[4];
    unsigned short field_43;
} st_a42958_0;


unsigned long long sub_a42958(st_a42958_0 *a0, unsigned long long a1, unsigned long long a2, void* ptr)
{
    void* v2;  // x0
    unsigned long long v3;  // 4118
    st_a42958_1 *v12;  // x21
    unsigned long long v13;  // x8
    void* v14;  // x19
    unsigned long long v15;  // x8
    unsigned long long v16;  // x8
    void* v17;  // x20
    unsigned long v18;  // x8
    unsigned long v19;  // x8
    unsigned long long v20;  // w9
    unsigned long v21;  // x8
    unsigned long long v4;  // 4118
    unsigned long long v23;  // x8
    unsigned long long v24;  // x8
    void* v25;  // x20
    char *v26;  // x8
    unsigned long v27;  // x10
    unsigned long v28;  // x10
    unsigned long v29;  // x10
    unsigned long v30;  // x10
    unsigned long v31;  // x10
    unsigned long long v5;  // x8
    unsigned long v32;  // x10
    unsigned long v33;  // x10
    unsigned long long v34;  // 4112
    void* v35;  // x23
    unsigned long long n;  // x22
    unsigned long long ptr1;  // x0
    void* v9;  // x19
    unsigned long long v10;  // x8
    void* v11;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    if (0x11 < a1)
    {
        switch (a1)
        {
        case 18:
            v34 = arm64g_calculate_condition(1, a2 & 0xffffffff, 1, 0);
            if (v34 & 1)
            {
                _memcpy((long long)v2[704], ptr, (int)v2[712]);
                *(unsigned int *)&v2[720] = 1;
                return 1;
            }
            if ((int)a2 >= 4 && (int)((int)v2[712] - a2) >= 8)
            {
                v35 = v2;
                n = a2 & 0xffffffff;
                _memcpy((long long)v2[704], ptr, n);
                if (!a0->field_10 || (int)sub_aa8830((long long)v35[704] + n, (int)v35[712] - a2) >= 1)
                {
                    *(unsigned int *)&v35[720] = 1;
                    return 1;
                }
            }
            break;
        case 19:
            v23 = (int)v2[720];
            if (!(unsigned int)v23)
                return v23;
            v24 = (int)v2[248];
            if (!(unsigned int)v24)
                return v24;
            v25 = v2;
            sub_a94bbc(v2 + 0x100, (long long)v2[704], (int)v2[712]);
            _memcpy();
            v26 = (long long)v25[704] + (int)v25[712];
            v27 = *(v26 - 1) + 1;
            *(v26 - 1) = v27;
            if (v27 >> 8 & 1)
            {
                v28 = *(v26 - 2) + 1;
                *(v26 - 2) = v28;
                if (v28 >> 8 & 1)
                {
                    v29 = *(v26 - 3) + 1;
                    *(v26 - 3) = v29;
                    if (v29 >> 8 & 1)
                    {
                        v30 = *(v26 - 4) + 1;
                        *(v26 - 4) = v30;
                        if (v30 >> 8 & 1)
                        {
                            v31 = *(v26 - 5) + 1;
                            *(v26 - 5) = v31;
                            if (v31 >> 8 & 1)
                            {
                                v32 = *(v26 - 6) + 1;
                                *(v26 - 6) = v32;
                                if (v32 >> 8 & 1)
                                {
                                    v33 = *(v26 - 7) + 1;
                                    *(v26 - 7) = v33;
                                    if (v33 >> 8 & 1)
                                        *(v26 - 8) = *(v26 - 8) + 1;
                                }
                            }
                        }
                    }
                }
            }
            *(unsigned int *)&v25[252] = 1;
            return 1;
        case 22:
            if ((unsigned int)a2 == 13)
            {
                v18 = *(long long *)ptr;
                *(long long *)((char *)&a0->field_38 + 5) = (long long)ptr[5];
                a0->field_38 = v18;
                *(unsigned int *)&v2[728] = 13;
                *(unsigned long long *)&v2[736] = 0;
                v19 = *(short *)((char *)&a0->field_3d[1] + 1);
                v20 = (unsigned int)((v19 & 0xff00) >> 8) | (unsigned int)v19 * 0x100 & 0xff00ff00;
                v21 = v20 - 8;
                if (v20 >= 8)
                {
                    if (!a0->field_10)
                    {
                        if ((unsigned int)v21 >= 16)
                        {
                            *(unsigned short *)((char *)&a0->field_3d[1] + 1) = ((((((v20 - 24) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v20 - 24) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v20 - 24) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v20 - 24) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                            return 16;
                        }
                    }
                    else
                    {
                        *(unsigned short *)((char *)&a0->field_3d[1] + 1) = (((((v21 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v21 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v21 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v21 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                        return 16;
                    }
                }
            }
            break;
        case 24:
            v15 = (int)v2[720];
            if (!(unsigned int)v15)
                return v15;
            v16 = (int)v2[248];
            if (!(unsigned int)v16)
                return v16;
            if (!a0->field_10)
            {
                v17 = v2;
                _memcpy((long long)v2[704] + (int)v2[712] - (int)a2, ptr, (int)a2);
                sub_a94bbc(v17 + 0x100, (long long)v17[704], (int)v17[712]);
                *(unsigned int *)&v17[252] = 1;
                return 1;
            }
            break;
        case 37:
            *(int *)ptr = (int)v2[712];
            return 1;
        default:
            return 0xffffffff;
        }
    }
    else if (a1 <= 8)
    {
        if (!a1)
        {
            *(unsigned long long *)&v2[248] = 0;
            v14 = v2;
            *(unsigned int *)&v14[712] = sub_a50728(a0->field_0);
            *(st_a42958_0 **)&v14[704] = &a0->field_28;
            *(unsigned long *)&v14[716] = 0xffffffff;
            *(unsigned int *)&v14[728] = 0xffffffff;
            return 1;
        }
        if (a1 != 8)
            return 0xffffffff;
        v11 = v2;
        v12 = sub_9ffdd8(ptr);
        v13 = v11;
        if ((long long)v11[648])
        {
            if ((long long)v11[648] == v13)
            {
                v12->field_288 = v12;
                goto LABEL_a42a3c;
            }
        }
        else
        {
LABEL_a42a3c:
            if (*(long long *)(v13 + 704) == &a0->field_28)
            {
                v12->field_2c0 = ptr + 40;
                return 1;
            }
            ptr1 = sub_a6bf4c(*(int *)(v13 + 712), "crypto/evp/e_aes.c", 2782);
            v12->field_2c0 = ptr1;
            if (ptr1)
            {
                _memcpy(ptr1, (long long)v11[704], (int)v11[712]);
                return 1;
            }
        }
    }
    else if (a1 != 9)
    {
        if (a1 == 16)
        {
            v4 = arm64g_calculate_condition(49, (unsigned int)a2 - 0x11, 16, 0);
            if (!(v4 & 1))
            {
                v5 = a0->field_10;
                if (!(unsigned int)v5)
                    return v5;
                if ((int)v2[716] >= 0)
                {
                    _memcpy(ptr, &a0->field_38, a2 & 0xffffffff);
                    return 1;
                }
            }
        }
        else if (a1 == 0x11)
        {
            v3 = arm64g_calculate_condition(49, (unsigned int)a2 - 0x11, 16, 0);
            if (!(v3 & 1) && !a0->field_10)
            {
                _memcpy(&a0->field_38, ptr, a2 & 0xffffffff);
                *(unsigned int *)&v2[716] = a2;
                return 1;
            }
        }
        else
        {
            return 0xffffffff;
        }
    }
    else
    {
        if ((int)a2 >= 1)
        {
            if ((unsigned int)a2 >= 0x11 && (int)a2 > (int)v2[712])
            {
                v9 = v2;
                if ((long long)v2[704] != &a0->field_28)
                    sub_a6c2e4((long long)v2[704], "crypto/evp/e_aes.c", 2682);
                v10 = sub_a6bf4c(a2 & 0xffffffff, "crypto/evp/e_aes.c", 2683);
                v2 = v9;
                *(unsigned long long *)&v9[704] = v10;
                if (!v10)
                    return v10;
            }
            *(unsigned int *)&v2[712] = a2;
            return 1;
        }
    }
    return 0;
}
