/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc14db8..0xc14fc0 (520 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_c14db8(unsigned long a0, void* a1)
{
    unsigned long long v15;  // x26
    unsigned long long v16;  // x25
    void* v25;  // x8
    void* v26;  // x8
    unsigned long long v27;  // 4114
    void* i;  // x25
    unsigned long long v29;  // x0
    void* n;  // x21
    unsigned long v31;  // cc_op
    unsigned long v32;  // cc_dep1
    unsigned long v33;  // cc_dep2
    unsigned long v34;  // cc_ndep
    unsigned long long v17;  // x24
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4102
    void* v37;  // x1
    unsigned long long v38;  // 4110
    unsigned long long v39;  // 4102
    unsigned long long v18;  // x23
    void* v40;  // x24
    void* v42;  // x20
    unsigned long long v19;  // x22
    unsigned long long v43;  // 4110
    unsigned long long v44;  // 4102
    unsigned long long v45;  // 4110
    unsigned long long v46;  // 4102
    void* v47;  // x24
    void* v48;  // x26
    unsigned long long v20;  // x21
    void* ptr;  // x8
    void* v50;  // x21
    void* ptr1;  // x0
    void* v52;  // w8
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v23;  // x30
    void* v24;  // x8
    void* v0;  // [bp-0x70]
    void* ptr2;  // [bp-0x68]
    void* v2;  // [bp-0x60]
    void* v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = &v14;
    v13 = v23;
    v24 = a0 * 3;
    v25 = v24 - 1;
    if (!v25)
        v26 = (void*)64;
    else
        v26 = (void*)(char)Clz(v25);
    v27 = arm64g_calculate_condition(148, v24, 1, 0);
    if (v27 & 1)
        i = 1;
    else
        i = (0xffffffffffffffff >> (v26 & 63)) + 1;
    v29 = sub_c5f828();
    n = i * 64;
    if (i <= 0x3ffffffffffffff)
    {
        v35 = arm64g_calculate_condition(v31, v32, v33, v34);
        v36 = arm64g_calculate_condition(148, (v35 & 1 ? n : 0x20000000), (v35 & 1 ? 0x7fffffffffffffc0 : 0), 0);
        v37 = a1;
        if (v36 & 1)
            goto LABEL_c14e20;
    }
    else
    {
        v38 = arm64g_calculate_condition(v31, v32, v33, v34);
        v39 = arm64g_calculate_condition(144, (v38 & 1 ? n : 0x20000000), (v38 & 1 ? 0x7fffffffffffffc0 : 0), 0);
        v37 = a1;
        if (v39 & 1)
            goto LABEL_c14e20;
    }
    v40 = 0;
    while (1)
    {
        v37 = n;
        v29 = sub_c6b970(v40, v37);
LABEL_c14e20:
        if (!n)
            break;
        v0 = 0;
        v40 = 64;
        v42 = v0;
        if (!_posix_memalign(&v0, 64, n))
        {
            v43 = arm64g_calculate_condition(v31, v32, v33, v34);
            v44 = arm64g_calculate_condition(4, (v43 & 1 ? v42 : 0x40000000), 0, 0);
            if (v44 & 1)
                continue;
            goto LABEL_c14e54;
        }
        else
        {
            v45 = arm64g_calculate_condition(v31, v32, v33, v34);
            v46 = arm64g_calculate_condition(0, (v45 & 1 ? v42 : 0x40000000), 0, 0);
            if (!(v46 & 1))
            {
LABEL_c14e54:
                v0 = i;
                ptr2 = v42;
                v2 = 0;
                if (!i)
                    goto LABEL_c14f18;
                goto LABEL_c14e60;
            }
        }
    }
    v42 = 64;
    v0 = 0;
    ptr2 = 64;
    v2 = 0;
    if (i)
    {
LABEL_c14e60:
        v47 = 0;
        v48 = 0;
        do
        {
            if (v48 == v0)
            {
                sub_c75c44(&v0);
                v42 = ptr2;
            }
            v48 += 1;
            ptr = v42 + v47;
            memset(ptr, 0, 24);
            *(unsigned long long *)&ptr[24] = v29;
            *(unsigned int *)&ptr[32] = (unsigned int)v37;
            *(unsigned int *)&ptr[40] = (unsigned int)v48;
            v47 += 64;
            v2 = v48;
        } while (i != v48);
        if (v0 > i)
        {
            v3 = 0;
            if (_posix_memalign(&v3, 64, n) || (v42 = v3, !v42))
            {
                sub_c6b970(64, n);
LABEL_c14f8c:
                __debugbreak();
            }
            _memcpy(v42, ptr2, n);
            _free(ptr2);
            v50 = i;
            ptr1 = _malloc(32);
            if (!ptr1)
                goto LABEL_c14f70;
        }
        else
        {
            v50 = i;
            v42 = ptr2;
            ptr1 = _malloc(32);
            if (!ptr1)
                goto LABEL_c14f70;
        }
    }
    else
    {
LABEL_c14f18:
        v50 = 0;
        ptr1 = _malloc(32);
        if (!ptr1)
        {
LABEL_c14f70:
            sub_c6ba70(8, 32);
            goto LABEL_c14f8c;
        }
    }
    if (!i)
        v52 = (void*)64;
    else
        v52 = (void*)(unsigned int)Clz(i);
    *(void* *)ptr1 = v42;
    *(void* *)&ptr1[8] = v50;
    *(void* *)&ptr1[16] = a1;
    *(unsigned int *)&ptr1[24] = 63 - (unsigned long long)v52;
    return (unsigned int)ptr1;
}
