/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7966c..0xb79b20 (1204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7966c_6 {
    char padding_0[8];
    struct st_b7966c_4 *field_8;
} st_b7966c_6;

typedef struct st_b7966c_1 {
    char padding_0[8];
    struct st_b7966c_0 *field_8;
    struct st_b7966c_2 *field_10;
} st_b7966c_1;

typedef struct st_b7966c_4 {
    char padding_0[24];
    struct st_b7966c_5 *field_18;
} st_b7966c_4;

typedef struct st_b7966c_3 {
    unsigned long long field_0;
    unsigned long long field_8;
    double field_10;
    char padding_18[40];
    unsigned long long field_40;
} st_b7966c_3;

typedef struct st_b7966c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[40];
    unsigned long long field_40;
} st_b7966c_0;

typedef struct st_b7966c_5 {
    unsigned long long field_0;
} st_b7966c_5;

typedef struct st_b7966c_2 {
    struct st_b7966c_0 *field_0;
} st_b7966c_2;


void sub_b7966c(st_b7966c_6 **a0, st_b7966c_1 *a1)
{
    unsigned long long v16;  // x28
    unsigned long long v17;  // x27
    unsigned long long v26;  // x30
    unsigned long long *v27;  // x20
    st_b7966c_0 **v28;  // x27
    st_b7966c_3 **v29;  // x28
    st_b7966c_3 **v30;  // x8
    unsigned long long *v31;  // x9
    unsigned long long *v32;  // x9
    unsigned long long *v33;  // x24
    st_b7966c_3 **v34;  // x8
    unsigned long long *v35;  // x24
    unsigned long long v18;  // x26
    st_b7966c_3 **ptr;  // x0
    st_b7966c_3 **v37;  // x21
    st_b7966c_3 **node;  // x23
    unsigned long long *v39;  // x24
    unsigned long long v40;  // x10
    unsigned long long *v41;  // x12
    st_b7966c_3 **v42;  // w26
    long long v43;  // x0
    unsigned long long *v44;  // x9
    unsigned long long v19;  // x25
    unsigned long long v20;  // x24
    unsigned long long v21;  // x23
    unsigned long long v22;  // x22
    unsigned long long v23;  // x21
    unsigned long long v24;  // x20
    unsigned long long v25;  // x19
    st_b7966c_3 **v0;  // [bp-0x78]
    st_b7966c_3 **iter;  // [bp-0x70], Other Possible Types: long long
    st_b7966c_3 **v2;  // [bp-0x68]
    unsigned long long v3;  // [bp-0x60]
    unsigned long long v4;  // [bp-0x58]
    unsigned long long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = &v15;
    v14 = v26;
    v27 = &a1->field_8->field_0;
    v28 = a1->field_10;
    v29 = v28 * 128;
    if (v28)
    {
        v30 = v29;
        v31 = v27;
        while (1)
        {
            v32 = v31;
            if (!v30)
                break;
            v31 = v32 + 16;
            v30 = (char *)v30 - 128;
            if (*v32 != 12)
            {
                v33 = v27;
                v34 = v29;
                while (1)
                {
                    v35 = v33;
                    if (!v34)
                        break;
                    v33 = v35 + 16;
                    v34 = (char *)v34 - 128;
                    if (*v35 != 12)
                    {
                        ptr = _malloc(32);
                        if (ptr)
                        {
                            *ptr = v35;
                            v0 = 4;
                            iter = ptr;
                            v37 = 1;
                            node = 8;
                            while (1)
                            {
                                v2 = v37;
                                do
                                {
                                    v39 = v33;
                                    if (v39 == v27 + v29)
                                    {
                                        v40 = 0xffffffffffffffff;
                                        while (node)
                                        {
                                            v41 = &*iter->field_0;
                                            iter += 1;
                                            if (*v41 != 6 || v41[1] != 9223372036854775810 || !(v40 += 1, node = (char *)node - 8, v40 + 1 == (unsigned long long)(*(double *)&v41[2] + -1.0)))
                                            {
                                                v42 = (st_b7966c_3 **)0;
                                                if (!v0)
                                                    goto LABEL_b797c0;
                                                goto LABEL_b797bc;
                                            }
                                        }
                                        v42 = (st_b7966c_3 **)1;
                                        if (!v0)
                                            goto LABEL_b797c0;
LABEL_b797bc:
                                        _free();
                                        goto LABEL_b797c0;
                                    }
                                } while ((v33 = v39 + 16, *v39 == 12));
                                if (v37 == v0)
                                {
                                    sub_c6c0cc(&v0, v37, 1, 8, 8);
                                    ptr = iter;
                                }
                                *(unsigned long long **)((char *)ptr + 0x8 * v37) = v39;
                                v37 = (char *)v37 + 1;
                                node += 1;
                            }
                        }
                        else
                        {
                            v43 = sub_c6b970(8, 32);
                            if (v0)
                                _free(iter);
                            __Unwind_Resume(v43);
                        }
                    }
                }
                goto LABEL_b797f0;
            }
        }
        v42 = (st_b7966c_3 **)1;
LABEL_b797c0:
        goto LABEL_b797f0;
    }
    do
    {
        v44 = v27;
        if (!v29)
            goto LABEL_b797f0;
    } while ((v27 = v44 + 16, v29 = (char *)v29 - 128, v44[8] != 5));
LABEL_b797f0:
    *a0->field_8->field_18();
}
