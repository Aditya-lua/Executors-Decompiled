/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0cebc..0xc0d374 (1208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_efb488;

unsigned long long * sub_c0cebc(unsigned long long *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long *ptr;  // x0
    unsigned long v7;  // x9
    unsigned long long idx;  // x24
    unsigned long long v17;  // x26
    unsigned long v18;  // x8
    unsigned long long v19;  // x28
    unsigned long long v20;  // x26
    unsigned long long v21;  // x27
    unsigned long long v22;  // x21
    unsigned long v23;  // x8
    unsigned long v24;  // x8
    unsigned long long v8;  // x10
    unsigned long v25;  // x8
    unsigned long v26;  // x8
    unsigned long v27;  // x8
    unsigned long v28;  // x8
    unsigned long v29;  // x8
    unsigned long v30;  // x8
    unsigned long v31;  // x8
    unsigned long long v32;  // x25
    unsigned long long v9;  // x8
    unsigned long long i;  // x20
    unsigned long v11;  // x11
    char *v12;  // x22
    unsigned long long v13;  // x23
    unsigned long long v14;  // x25
    unsigned long long v15;  // x21
    uint128_t v0;  // [bp-0x90]
    unsigned long long v1;  // [bp-0x78]
    unsigned long long ptr1;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    ptr = a0;
    if (a2)
    {
        v7 = *(char *)a1;
        if (!(v7 >> 31 & 1))
        {
            v8 = 0;
            v9 = 0;
            ptr = 1;
            goto LABEL_c0cef8;
        }
        else
        {
            ptr = a0;
            if (a2 != 1)
            {
                v9 = v7 & 0xff & 127;
                v7 = *(char *)(a1 + 1);
                if (!(v7 >> 31 & 1))
                {
                    ptr = 2;
                    v8 = 7;
                }
                else
                {
                    ptr = a0;
                    if (a2 == 2)
                    {
                        a0[1] = 0;
                        a0[2] = 1;
                        a0[3] = a2;
                        a0[4] = 47;
                        *a0 = 1;
                        return ptr;
                    }
                    v9 = v9 & 0xffffffffffffc000 | (v9 & 0xffffffffffffc07f | (v7 * 128 | v7 >> 57) & 16256) & 0x3fff;
                    v7 = *(char *)(a1 + 2);
                    if (!(v7 >> 31 & 1))
                    {
                        ptr = 3;
                        v8 = 14;
                    }
                    else
                    {
                        ptr = a0;
                        if (a2 == 3)
                        {
                            a0[1] = 0;
                            a0[2] = 1;
                            a0[3] = a2;
                            a0[4] = 47;
                            *a0 = 1;
                            return ptr;
                        }
                        v9 = v9 & 0xffffffffffe00000 | (v9 & 0xffffffffffe03fff | (v7 * 0x4000 | v7 >> 50) & 0x1fc000) & 0x1fffff;
                        v7 = *(char *)(a1 + 3);
                        if (!(v7 >> 31 & 1))
                        {
                            ptr = 4;
                            v8 = 21;
                        }
                        else
                        {
                            ptr = a0;
                            if (a2 == 4)
                            {
                                a0[1] = 0;
                                a0[2] = 1;
                                a0[3] = a2;
                                a0[4] = 47;
                                *a0 = 1;
                                return ptr;
                            }
                            v9 = v9 & 0xfffffffff0000000 | (v9 & 0xfffffffff01fffff | (v7 * 0x200000 | v7 >> 43) & 0xfe00000) & 0xfffffff;
                            v7 = *(char *)(a1 + 4);
                            if (!(v7 >> 31 & 1))
                            {
                                ptr = 5;
                                v8 = 28;
                            }
                            else
                            {
                                ptr = a0;
                                if (a2 == 5)
                                {
                                    a0[1] = 0;
                                    a0[2] = 1;
                                    a0[3] = a2;
                                    a0[4] = 47;
                                    *a0 = 1;
                                    return ptr;
                                }
                                v9 = v9 & 0xfffffff800000000 | (v9 & 0xfffffff80fffffff | (v7 * 0x10000000 | v7 >> 36) & 0x7f0000000) & 0x7ffffffff;
                                v7 = *(char *)(a1 + 5);
                                ptr = a0;
                                if (v7 >> 31 & 1)
                                    goto LABEL_c0d27c;
                                ptr = 6;
                                v8 = 35;
                            }
                        }
                    }
                }
                while (1)
                {
LABEL_c0cef8:
                    i = a2 - (char *)ptr;
                    if (a2 >= ptr)
                    {
                        v12 = a1 + (char *)ptr;
                        v13 = (int)v7 << (v8 & 63) | v9;
                        if (v13 < 0x2000)
                            v14 = v13;
                        else
                            v14 = 0x2000;
                        if (!v13)
                        {
                            v1 = 0;
                            ptr1 = 8;
                            v3 = 0;
                            a0[3] = 0;
                            a0[4] = 8;
                            a0[5] = v13;
                            a0[1] = v12;
                            a0[2] = i;
                            *a0 = 0;
                            return ptr;
                        }
                        v15 = v14 * 8;
                        ptr = _malloc(v15);
                        if (ptr)
                        {
                            idx = 0;
                            v1 = v14;
                            ptr1 = ptr;
                            v3 = 0;
                            v0 = 0x10000000000000000;
                            while (i)
                            {
                                v18 = *v12;
                                v19 = v18 & 0xff;
                                if (!(v18 >> 31 & 1))
                                {
                                    v20 = 0;
                                    v21 = 0;
                                    v22 = 1;
                                }
                                else
                                {
                                    if (i == 1)
                                        break;
                                    v21 = v19 & 127;
                                    v23 = v12[1];
                                    v19 = v23 & 0xff;
                                    if (!(v23 >> 31 & 1))
                                    {
                                        v22 = 2;
                                        v20 = 7;
                                    }
                                    else
                                    {
                                        if (i == 2)
                                            break;
                                        v21 = v21 & 0xffffffffffffc000 | (v21 & 0xffffffffffffc07f | (v19 * 128 | v19 >> 57) & 16256) & 0x3fff;
                                        v24 = v12[2];
                                        v19 = v24 & 0xff;
                                        if (!(v24 >> 31 & 1))
                                        {
                                            v22 = 3;
                                            v20 = 14;
                                        }
                                        else
                                        {
                                            if (i == 3)
                                                break;
                                            v21 = v21 & 0xffffffffffe00000 | (v21 & 0xffffffffffe03fff | (v19 * 0x4000 | v19 >> 50) & 0x1fc000) & 0x1fffff;
                                            v25 = v12[3];
                                            v19 = v25 & 0xff;
                                            if (!(v25 >> 31 & 1))
                                            {
                                                v22 = 4;
                                                v20 = 21;
                                            }
                                            else
                                            {
                                                if (i == 4)
                                                    break;
                                                v21 = v21 & 0xfffffffff0000000 | (v21 & 0xfffffffff01fffff | (v19 * 0x200000 | v19 >> 43) & 0xfe00000) & 0xfffffff;
                                                v26 = v12[4];
                                                v19 = v26 & 0xff;
                                                if (!(v26 >> 31 & 1))
                                                {
                                                    v22 = 5;
                                                    v20 = 28;
                                                }
                                                else
                                                {
                                                    if (i == 5)
                                                        break;
                                                    v21 = v21 & 0xfffffff800000000 | (v21 & 0xfffffff80fffffff | (v19 * 0x10000000 | v19 >> 36) & 0x7f0000000) & 0x7ffffffff;
                                                    v27 = v12[5];
                                                    v19 = v27 & 0xff;
                                                    if (!(v27 >> 31 & 1))
                                                    {
                                                        v22 = 6;
                                                        v20 = 35;
                                                    }
                                                    else
                                                    {
                                                        if (i == 6)
                                                            break;
                                                        v21 |= ((unsigned int)v19 & 127) * 0x800000000;
                                                        v28 = v12[6];
                                                        v19 = v28 & 0xff;
                                                        if (!(v28 >> 31 & 1))
                                                        {
                                                            v22 = 7;
                                                            v20 = 42;
                                                        }
                                                        else
                                                        {
                                                            if (i == 7)
                                                                break;
                                                            v21 |= ((unsigned int)v19 & 127) * 0x40000000000;
                                                            v29 = v12[7];
                                                            v19 = v29 & 0xff;
                                                            if (!(v29 >> 31 & 1))
                                                            {
                                                                v22 = 8;
                                                                v20 = 49;
                                                            }
                                                            else
                                                            {
                                                                if (i == 8)
                                                                    break;
                                                                v21 |= ((unsigned int)v19 & 127) * 0x2000000000000;
                                                                v30 = v12[8];
                                                                v19 = v30 & 0xff;
                                                                if (!(v30 >> 31 & 1))
                                                                {
                                                                    v22 = 9;
                                                                    v20 = 56;
                                                                }
                                                                else
                                                                {
                                                                    if (i == 9)
                                                                        break;
                                                                    v31 = v12[9];
                                                                    if (!(v31 >> 31 & 1))
                                                                    {
                                                                        v21 |= ((unsigned int)v19 & 127) * 0x100000000000000;
                                                                        v19 = v31 & 0xff;
                                                                        v22 = 10;
                                                                        v20 = 63;
                                                                    }
                                                                    else
                                                                    {
                                                                        v0 = _INSERT(CONCAT(1, 1), 8, v12);
                                                                        v14 = i;
                                                                        i = *(unsigned long long *)((void*)&v0 + 8);
                                                                        if (!v1)
                                                                        {
                                                                            a0[3] = v14;
                                                                            a0[4] = 47;
                                                                            a0[1] = 1;
                                                                            a0[2] = i;
                                                                            *a0 = 1;
                                                                            return ptr;
                                                                        }
                                                                        ptr = _free(ptr1);
                                                                        a0[3] = v14;
                                                                        a0[4] = 47;
                                                                        a0[1] = 1;
                                                                        a0[2] = i;
                                                                        *a0 = 1;
                                                                        return ptr;
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
                                v32 = i - v22;
                                if (i < v22)
                                {
                                    sub_c73bb0(v22, i, i, &g_efb488);
                                    __debugbreak();
                                }
                                if (idx == v1)
                                {
                                    sub_c75224(&v1);
                                    ptr = ptr1;
                                }
                                v17 = v19 << (v20 & 63) | v21;
                                ptr[idx] = v17;
                                idx += 1;
                                v12 = &v12[v22];
                                v3 = idx;
                                v14 = v32;
                                i = v32;
                                if (v13 == idx)
                                {
                                    i = v32;
                                    a0[3] = v1;
                                    a0[4] = ptr1;
                                    a0[5] = v13;
                                    a0[1] = v12;
                                    a0[2] = i;
                                    *a0 = 0;
                                    return ptr;
                                }
                            }
                            i = *(unsigned long long *)((void*)&v0 + 8);
                            if (!v1)
                            {
                                a0[3] = v14;
                                a0[4] = v17;
                                a0[1] = 0;
                                a0[2] = i;
                                *a0 = 1;
                                return ptr;
                            }
                            ptr = _free(ptr1);
                            a0[3] = v14;
                            a0[4] = v17;
                            a0[1] = 0;
                            a0[2] = i;
                            *a0 = 1;
                            return ptr;
                        }
                        a1 = v15;
                        ptr = sub_c6b970(8, a1);
                        goto LABEL_c0d348;
                    }
                    else
                    {
                        ptr = sub_c73bb0();
                        a1 = a2;
LABEL_c0d27c:
                        if (a2 == 6)
                            break;
                        v9 |= ((unsigned int)v7 & 127) * 0x800000000;
                        v7 = *(char *)(a1 + 6);
                        if (!(v7 >> 31 & 1))
                        {
                            ptr = 7;
                            v8 = 42;
                            continue;
                        }
                        if (a2 == 7)
                            break;
                        v9 |= ((unsigned int)v7 & 127) * 0x40000000000;
                        v7 = *(char *)(a1 + 7);
                        if (!(v7 >> 31 & 1))
                        {
                            ptr = 8;
                            v8 = 49;
                            continue;
                        }
                        if (a2 == 8)
                            break;
                        v9 |= ((unsigned int)v7 & 127) * 0x2000000000000;
                        v7 = *(char *)(a1 + 8);
                        if (!(v7 >> 31 & 1))
                        {
                            ptr = 9;
                            v8 = 56;
                            continue;
                        }
                        if (a2 == 9)
                            break;
                        v11 = *(char *)(a1 + 9);
                        if (v11 >> 31 & 1)
                        {
LABEL_c0d348:
                            a0[1] = 1;
                            a0[2] = a1;
                            a0[3] = a2;
                            a0[4] = 47;
                            *a0 = 1;
                            return ptr;
                        }
                        v9 |= ((unsigned int)v7 & 127) * 0x100000000000000;
                        ptr = 10;
                        v8 = 63;
                        v7 = v11;
                    }
                }
            }
        }
    }
    a0[1] = 0;
    a0[2] = 1;
    a0[3] = a2;
    a0[4] = 47;
    *a0 = 1;
    return ptr;
}
