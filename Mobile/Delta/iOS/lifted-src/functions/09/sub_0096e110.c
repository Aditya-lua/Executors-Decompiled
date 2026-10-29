/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96e110..0x96e8d4 (1988 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96e110_0 {
    char padding_0[8];
    struct st_96e110_1 *field_8;
} st_96e110_0;

typedef struct st_96e110_3 {
    char padding_0[1648];
    unsigned long long field_670;
} st_96e110_3;

typedef struct st_96e110_2 {
    char padding_0[8];
    unsigned short field_8;
} st_96e110_2;

typedef struct st_96e110_1 {
    char field_0;
} st_96e110_1;

extern long long g_968d10;
extern st_96e110_0 g_e88188;
extern st_96e110_0 g_e88198;
extern st_96e110_2 g_e881a8;
extern st_96e110_2 g_e881b8;
extern st_96e110_2 g_e881c8;
extern st_96e110_2 g_e881d8;
extern st_96e110_2 g_e881e8;
extern st_96e110_2 g_e881f8;
extern st_96e110_2 g_e88208;
extern char g_10002b0;

unsigned long long sub_96e110(unsigned long long a0, unsigned int a1, unsigned long long idx)
{
    unsigned long long v4;  // w25
    unsigned long long v5;  // w24
    unsigned long long v14;  // x21
    unsigned long long v15;  // x22
    unsigned int v17;  // w21
    unsigned long long v18;  // x0
    unsigned long long n;  // x21
    st_96e110_3 *v20;  // x20
    unsigned long long v21;  // x21
    unsigned long long v22;  // x22
    unsigned long long i;  // w8
    unsigned long long v6;  // x26
    st_96e110_2 *v24;  // x8
    st_96e110_3 *v25;  // x10
    unsigned long long v26;  // x9
    unsigned long v27;  // x10
    unsigned long long v28;  // x9
    unsigned long long idx1;  // x10
    unsigned long long v31;  // x9
    unsigned short *v32;  // x12
    unsigned long long v33;  // x11
    unsigned long long v7;  // x21
    unsigned long long v34;  // x15
    unsigned long long v35;  // x13
    unsigned long long v36;  // x14
    unsigned long long v37;  // x16
    unsigned long long v38;  // x15
    void* iter;  // x16
    unsigned long long j;  // x17
    unsigned long long v41;  // x17
    uint128_t v42;  // q1
    unsigned long long ptr;  // x0
    unsigned long long v44;  // x17
    unsigned long long v45;  // x13
    unsigned long long *iter1;  // x15
    unsigned long long v48;  // 4117
    unsigned short *iter2;  // x12
    unsigned long long k;  // x10
    unsigned long long v51;  // x10
    unsigned long long v53;  // x12
    unsigned long long v9;  // w8
    unsigned long long v54;  // x11
    unsigned long long index;  // x10
    unsigned long long v56;  // x10
    unsigned long long v57;  // x12
    unsigned short *v58;  // x11
    unsigned long long v59;  // x9
    unsigned long long v60;  // x14
    unsigned long long v61;  // x13
    unsigned long long v62;  // x8
    unsigned long long v63;  // x13
    unsigned long long v10;  // x0
    unsigned long long v64;  // x14
    void* node;  // x15
    unsigned long long l;  // x16
    unsigned long long v67;  // x16
    uint128_t v68;  // q1
    unsigned long long v70;  // x15
    unsigned long long v71;  // x12
    unsigned long long *v72;  // x14
    st_96e110_0 *v11;  // x8
    unsigned long long v74;  // 4117
    unsigned short *v75;  // x8
    unsigned long long m;  // x10
    unsigned long long v77;  // x10
    unsigned short *v79;  // x9
    unsigned short *v80;  // x11
    unsigned long long v81;  // x12
    unsigned long long v82;  // x12
    char *ptr1;  // x20
    unsigned long long idx2;  // x10
    unsigned short *v85;  // x9
    unsigned long long v13;  // x8
    char v0;  // [bp-0x98]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if ((int)a1 >= 1 && a0 && idx)
    {
        v4 = 0;
        v5 = 0;
        v6 = 0;
        v7 = a1;
        while (1)
        {
            ptr = _memchr("/:?*-", *(char *)a0, 6);
            if (!ptr && (ptr = "D", sub_a6e258("D", a0, 1)))
                break;
            v9 = *(char *)ptr;
            if (46 >= v9)
            {
                switch (v9)
                {
                case 42:
                    if (!v5)
                    {
                        v5 = 1;
                        break;
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v1)
                            return 0xffffffff;
                        ___stack_chk_fail();
                    }
                case 45:
                    if (!v4)
                    {
                        v4 = 1;
                        break;
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v1)
                            return 0xffffffff;
                        ___stack_chk_fail();
                    }
                default:
                    goto LABEL_96e24c;
                }
            }
            else if (v9 != 63)
            {
                if (v9 == 47 || v9 == 58)
                {
                    if (*(long long *)&g_10002b0 == v1)
                        return 0xffffffff;
                    ___stack_chk_fail();
                }
LABEL_96e24c:
                if ((unsigned int)v7 != 7)
                {
                    if ((unsigned int)v7 == 15)
                    {
                        if (sub_a6e258("DEFAULT_SUITE_B", a0, v7))
                        {
                            v7 = 15;
                            break;
                        }
                        else
                        {
                            v11 = &g_e88198.padding_0[0];
                            goto LABEL_96e4b0;
                        }
                        goto LABEL_96e4b0;
                    }
                }
                else
                {
                    if (sub_a6e258("DEFAULT", a0, v7))
                    {
                        v7 = 7;
                        break;
                    }
                    else
                    {
                        v11 = &g_e88188.padding_0[0];
                    }
LABEL_96e4b0:
                    if ((unsigned int)v6 || v4)
                    {
                        if (*(long long *)&g_10002b0 == v1)
                            return 0xffffffff;
                        ___stack_chk_fail();
                    }
                    else
                    {
                        ptr1 = v11->field_8;
                        v10 = sub_a6bf4c(_strlen(ptr1) + 2, "ssl/t1_lib.c", 1345);
                        if (!v10)
                        {
                            if (*(long long *)&g_10002b0 == v1)
                                return v10;
                            ___stack_chk_fail();
                        }
                        else
                        {
                            if (!v5 || *ptr1 == 42)
                            {
                                v13 = 0;
                            }
                            else
                            {
                                *(char *)v10 = 42;
                                v13 = 1;
                            }
                            v14 = v10 + v13;
                            v15 = v10;
                            _memcpy(v14, ptr1, _strlen(ptr1));
                            *(char *)(v14 + _strlen(ptr1)) = 0;
                            v17 = *(int *)(idx + 84);
                            *(unsigned long *)(idx + 80) = 4294967297;
                            v18 = sub_9f5c88(v15, 47, 1, &g_968d10, idx);
                            *(unsigned int *)(idx + 80) = 0;
                            *(unsigned int *)(idx + 84) = v17;
                            sub_a6c2e4(v15, "ssl/t1_lib.c", 1370);
                            if (*(long long *)&g_10002b0 == v1)
                                return v18;
                            ___stack_chk_fail();
                        }
                    }
                }
LABEL_96e27c:
                if (!(unsigned int)v7)
                {
                    if (*(long long *)&g_10002b0 == v1)
                        return 0xffffffff;
                    ___stack_chk_fail();
                }
                break;
            }
            else if (!(unsigned int)v6)
            {
                v6 = 1;
            }
            else
            {
                if (*(long long *)&g_10002b0 == v1)
                    return 0xffffffff;
                ___stack_chk_fail();
            }
            a0 += 1;
            v7 -= 1;
            if ((int)((unsigned int)v7 + 1) <= 1)
                goto LABEL_96e27c;
        }
        if (*(long long *)(idx + 16) == *(long long *)(idx + 8))
        {
            v10 = sub_a6c1b4(*(long long *)(idx + 24), *(long long *)(idx + 16) * 2 + 64, "ssl/t1_lib.c", 1391);
            if (v10)
            {
                *(long long *)(idx + 8) = *(long long *)(idx + 8) + 32;
                *(unsigned long long *)(idx + 24) = v10;
            }
            else
            {
                if (*(long long *)&g_10002b0 == v1)
                    return v10;
                ___stack_chk_fail();
            }
        }
        if (*(long long *)(idx + 64) == *(long long *)(idx + 56))
        {
            v10 = sub_a6c1b4(*(long long *)(idx + 72), *(long long *)(idx + 64) * 2 + 64, "ssl/t1_lib.c", 1402);
            if (v10)
            {
                *(long long *)(idx + 56) = *(long long *)(idx + 56) + 32;
                *(unsigned long long *)(idx + 72) = v10;
            }
            else
            {
                if (*(long long *)&g_10002b0 == v1)
                    return v10;
                ___stack_chk_fail();
            }
        }
        if ((int)v7 > 63)
        {
            if (*(long long *)&g_10002b0 == v1)
                return 0xffffffff;
            ___stack_chk_fail();
        }
        n = v7 & 0xffffffff;
        ___memcpy_chk(&v0, a0, n, 64);
        (&v0)[n] = 0;
        v20 = *(long long *)idx;
        if (*(long long *)&v20[1].padding_0[0])
        {
            v21 = 0;
            v22 = 0;
            while (sub_a6e200(*(long long *)(v20->field_670 + v21), &v0) && sub_a6e200(*(long long *)(v20->field_670 + v21 + 8), &v0))
            {
                v22 += 1;
                v21 += 56;
                if (v22 >= (unsigned long long)*(long long *)&v20[1].padding_0[0])
                    goto LABEL_96e3c0;
            }
            i = *(short *)(v20->field_670 + v21 + 28);
            if (i)
                goto LABEL_96e51c;
        }
LABEL_96e3c0:
        if (!sub_a6e200(&v0, "GC256A"))
        {
            v24 = &g_e881a8.padding_0[0];
        }
        else if (!sub_a6e200(&v0, "GC256B"))
        {
            v24 = &g_e881b8.padding_0[0];
        }
        else if (!sub_a6e200(&v0, "GC256C"))
        {
            v24 = &g_e881c8.padding_0[0];
        }
        else if (!sub_a6e200(&v0, "GC256D"))
        {
            v24 = &g_e881d8.padding_0[0];
        }
        else if (!sub_a6e200(&v0, "GC512A"))
        {
            v24 = &g_e881e8.padding_0[0];
        }
        else if (!sub_a6e200(&v0, "GC512B"))
        {
            v24 = &g_e881f8.padding_0[0];
        }
        else if (!sub_a6e200(&v0, "GC512C"))
        {
            v24 = &g_e88208.padding_0[0];
        }
        else
        {
            if (*(long long *)&g_10002b0 == v1)
                return v6;
            ___stack_chk_fail();
        }
        i = v24->field_8;
        if (!i)
        {
            if (*(long long *)&g_10002b0 == v1)
                return v6;
            ___stack_chk_fail();
        }
LABEL_96e51c:
        v25 = *(long long *)idx;
        v26 = *(long long *)&v25[1].padding_0[0];
        if (*(long long *)&v25[1].padding_0[0])
        {
            v27 = v25->field_670 + 28;
            while (1)
            {
                v28 = v26;
                if (*(short *)v27 == i)
                    break;
                v26 = v28 - 1;
                v27 += 56;
                if (v28 == 1)
                {
                    if (*(long long *)&g_10002b0 == v1)
                        return v6;
                    ___stack_chk_fail();
                }
            }
            idx1 = *(long long *)(idx + 16);
            if (!v4)
            {
                v79 = *(long long *)(idx + 24);
                if (idx1)
                {
                    v80 = v79;
                    v81 = idx1;
                    do
                    {
                        v82 = v81;
                        if (*v80 == i)
                        {
                            if (*(long long *)&g_10002b0 == v1)
                                return 1;
                            ___stack_chk_fail();
                        }
                    } while ((v81 = v82 - 1, v80 += 1, v82 != 1));
                }
                *(unsigned long long *)(idx + 16) = idx1 + 1;
                v79[idx1] = i;
                *(long long *)(*(long long *)(idx + 48) + *(long long *)(idx + 40) * 8) = *(long long *)(*(long long *)(idx + 48) + *(long long *)(idx + 40) * 8) + 1;
                if (v5)
                {
                    idx2 = *(long long *)(idx + 64);
                    v85 = *(long long *)(idx + 72);
                    *(unsigned long long *)(idx + 64) = idx2 + 1;
                    v85[idx2] = i;
                }
                if (*(long long *)&g_10002b0 == v1)
                    return 1;
                ___stack_chk_fail();
            }
            if (!idx1)
            {
                if (*(long long *)&g_10002b0 == v1)
                    return 1;
                ___stack_chk_fail();
            }
            v31 = 0;
            v32 = *(long long *)(idx + 24);
            v33 = idx1 - 1;
            v34 = 0xffffffffffffffee;
            v35 = v33;
            while (v32[v31] != i)
            {
                v35 -= 1;
                v34 -= 2;
                if (idx1 == v31 + 1)
                {
                    if (*(long long *)&g_10002b0 == v1)
                        return 1;
                    ___stack_chk_fail();
                }
            }
            if (v33 > v31)
            {
                v36 = ~v31 + idx1;
                v37 = v31;
                if (v36 < 4)
                {
LABEL_96e72c:
                    iter2 = &v32[v37 + 1];
                    k = ~v37 + idx1;
                    do
                    {
                        v51 = k;
                        *(unsigned short *)((char *)iter2 - 2) = *iter2;
                        iter2 += 1;
                        k = v51 - 1;
                    } while (k);
                }
                else if (16 > v36)
                {
                    v38 = 0;
LABEL_96e6e8:
                    v44 = v36 & 0xfffffffffffffffc;
                    v37 = (v35 & 0xfffffffffffffffc) + v31;
                    v45 = v38 - v44;
                    iter1 = &v32[v31 + v38 + 1];
                    do
                    {
                        *(double *)((char *)iter1 - 2) = *(double *)iter1;
                        iter1 += 1;
                        v48 = arm64g_calculate_condition(18, v45, 4, 0);
                        v45 += 4;
                    } while (v48 & 1);
                    if (v36 != v44)
                        goto LABEL_96e72c;
                }
                else
                {
                    iter = (char *)v32 - v34;
                    v38 = v36 & 0xfffffffffffffff0;
                    j = v38;
                    do
                    {
                        v41 = j;
                        v42 = *(int128_t *)iter;
                        *(int128_t *)((char *)iter - 18) = *(int128_t *)((char *)iter - 16);
                        *(uint128_t *)((char *)iter - 2) = v42;
                        iter += 32;
                        j = v41 - 16;
                    } while (j);
                    if (v36 == v38)
                        goto LABEL_96e750;
                    if (v36 & 12)
                        goto LABEL_96e6e8;
                    v37 = (v35 & 0xfffffffffffffff0) + v31;
                    goto LABEL_96e72c;
                }
            }
LABEL_96e750:
            *(unsigned long long *)(idx + 16) = v33;
            v53 = *(long long *)(idx + 40);
            if (v53)
            {
                v54 = 0;
                index = 0;
                do
                {
                    v54 += *(long long *)(*(long long *)(idx + 48) + index * 8);
                    if (v31 < v54)
                    {
                        *(long long *)(*(long long *)(idx + 48) + index * 8) = *(long long *)(*(long long *)(idx + 48) + index * 8) - 1;
                        goto LABEL_96e79c;
                    }
                } while ((index += 1, v53 != index));
                index = v53;
LABEL_96e79c:
                if (v31 < v54)
                    goto LABEL_96e7b4;
            }
            else
            {
                index = 0;
            }
            *(long long *)(*(long long *)(idx + 48) + index * 8) = *(long long *)(*(long long *)(idx + 48) + index * 8) - 1;
LABEL_96e7b4:
            v56 = *(long long *)(idx + 64);
            if (v56)
            {
                v57 = 0;
                v58 = *(long long *)(idx + 72);
                v59 = v56 - 1;
                v60 = 0xffffffffffffffee;
                v61 = v59;
                while (v58[v57] != i)
                {
                    v61 -= 1;
                    v60 -= 2;
                    if (v56 == v57 + 1)
                    {
                        if (*(long long *)&g_10002b0 == v1)
                            return 1;
                        ___stack_chk_fail();
                    }
                }
                if (v59 > v57)
                {
                    v62 = ~v57 + v56;
                    if (4 > v62)
                    {
                        v63 = v57;
                        goto LABEL_96e8a0;
                    }
                    else if (16 > v62)
                    {
                        v64 = 0;
LABEL_96e85c:
                        v70 = v62 & 0xfffffffffffffffc;
                        v63 = (v61 & 0xfffffffffffffffc) + v57;
                        v71 = v64 - v70;
                        v72 = &v58[v57 + v64 + 1];
                        do
                        {
                            *(double *)((char *)v72 - 2) = *(double *)v72;
                            v72 += 1;
                            v74 = arm64g_calculate_condition(18, v71, 4, 0);
                            v71 += 4;
                        } while (v74 & 1);
                        if (v62 != v70)
                            goto LABEL_96e8a0;
                    }
                    else
                    {
                        node = (char *)v58 - v60;
                        v64 = v62 & 0xfffffffffffffff0;
                        l = v64;
                        do
                        {
                            v67 = l;
                            v68 = *(int128_t *)node;
                            *(int128_t *)((char *)node - 18) = *(int128_t *)((char *)node - 16);
                            *(uint128_t *)((char *)node - 2) = v68;
                            node += 32;
                            l = v67 - 16;
                        } while (l);
                        if (v62 != v64)
                        {
                            if (v62 & 12)
                                goto LABEL_96e85c;
                            v63 = (v61 & 0xfffffffffffffff0) + v57;
LABEL_96e8a0:
                            v75 = &v58[v63 + 1];
                            m = ~v63 + v56;
                            do
                            {
                                v77 = m;
                                *(unsigned short *)((char *)v75 - 2) = *v75;
                                v75 += 1;
                                m = v77 - 1;
                            } while (m);
                        }
                    }
                }
                *(unsigned long long *)(idx + 64) = v59;
            }
            else
            {
                if (*(long long *)&g_10002b0 == v1)
                    return 1;
                ___stack_chk_fail();
            }
        }
        else
        {
            if (*(long long *)&g_10002b0 == v1)
                return v6;
            ___stack_chk_fail();
        }
        if (*(long long *)&g_10002b0 == v1)
            return 1;
        ___stack_chk_fail();
    }
    sub_a368c8();
    sub_a369bc("ssl/t1_lib.c", 1282, "gid_cb");
    sub_a36abc(20, 414, 0);
    if (*(long long *)&g_10002b0 == v1)
        return 0;
    ___stack_chk_fail();
}
