/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaef8d8..0xaefce4 (1036 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aef8d8_0 {
    struct st_aef8d8_0 *field_0;
    char field_1;
} st_aef8d8_0;

extern long long g_aef19c;

st_aef8d8_0 * sub_aef8d8(void)
{
    st_aef8d8_0 *v4;  // x19
    unsigned long v13;  // cc_ndep
    st_aef8d8_0 *v14;  // w9
    unsigned int v15;  // w10
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4102
    st_aef8d8_0 *v20;  // w8
    unsigned long long len;  // x0
    unsigned long long v22;  // x21
    st_aef8d8_0 *ptr;  // x20
    st_aef8d8_0 *v24;  // w8
    unsigned long long len1;  // x0
    unsigned long long v26;  // x0
    unsigned long long v27;  // x21
    st_aef8d8_0 *v28;  // w8
    unsigned long long len2;  // x0
    unsigned long long v30;  // x0
    unsigned long long v31;  // x25
    unsigned long v32;  // cc_op
    st_aef8d8_0 *v6;  // x21
    unsigned long v33;  // cc_dep1
    unsigned long v34;  // cc_dep2
    long long v35;  // x20
    long long v36;  // x21
    st_aef8d8_0 *v37;  // w9
    unsigned long long v38;  // x0
    unsigned long long v39;  // x0
    unsigned long long v40;  // x22
    st_aef8d8_0 *v41;  // x2
    st_aef8d8_0 *v42;  // x0
    st_aef8d8_0 *node;  // x24
    st_aef8d8_0 *v43;  // x1
    unsigned long long v44;  // x0
    unsigned long long v45;  // x0
    unsigned long long v46;  // x20
    unsigned long long v8;  // w8
    st_aef8d8_0 *iter;  // x21
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    st_aef8d8_0 *v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v4 = sub_a6d9b4();
    if (v4)
    {
        ptr = 0;
        v6 = v4;
        node = v6;
        v8 = 1;
        iter = v6;
        while (1)
        {
            v14 = (st_aef8d8_0 *)(char)node->field_0;
            v15 = 1 << ((char)v14 & 31) & 9217;
            if (v14 <= 13)
            {
                v16 = arm64g_calculate_condition(v10 | 144, v11, v12, v13);
                v17 = arm64g_calculate_condition(19, (v16 & 1 ? v15 : 0x40000000), 0, 0);
                if (v17 & 1)
                    goto LABEL_aefb24;
                goto LABEL_aef940;
            }
            v18 = arm64g_calculate_condition(v10 | 144, v11, v12, v13);
            v19 = arm64g_calculate_condition(16, (v18 & 1 ? v15 : 0x40000000), 0, 0);
            if (!(v19 & 1))
            {
LABEL_aef940:
                if (v8 == 1)
                {
                    if (v14 != 44)
                    {
                        v10 = 3;
                        v11 = v14 & 0xff;
                        v12 = 58;
                        if (v14 != 58)
                            goto LABEL_aefb0c;
                        *(char *)&node->field_0 = 0;
                        v20 = (st_aef8d8_0 *)(char)iter->field_0;
                        if (v20)
                        {
                            while (1)
                            {
                                ptr = iter;
                                if (!sub_a6994c((char)v20, 8))
                                    break;
                                v20 = (st_aef8d8_0 *)*((char *)&ptr->field_0 + 1);
                                iter = (char *)&ptr->field_0 + 1;
                                if (!v20)
                                    goto LABEL_aefb50;
                            }
                            if ((char)ptr->field_0)
                            {
                                len = _strlen(ptr);
                                while (1)
                                {
                                    v22 = len - 1;
                                    v10 = 4;
                                    v11 = len;
                                    v12 = 1;
                                    v13 = 0;
                                    if (len == 1)
                                        break;
                                    len = v22;
                                    if (!sub_a6994c(*((char *)ptr + len - 1), 8))
                                    {
                                        *((char *)ptr + v22 + 1) = 0;
                                        break;
                                    }
                                }
                                if (!(char)ptr->field_0)
                                    goto LABEL_aefb50;
                                iter = (char *)&node->field_0 + 1;
                                v8 = 2;
                                node = (char *)&node->field_0 + 1;
                                continue;
                            }
                        }
LABEL_aefb50:
                        v35 = 108;
                        v36 = 340;
                        goto LABEL_aefc74;
                    }
                    else
                    {
                        *(char *)&node->field_0 = 0;
                        if ((char)iter->field_0)
                        {
                            while (sub_a6994c((char)v24, 8))
                            {
                                iter = (char *)&iter->field_0 + 1;
                                if (!*((char *)&iter->field_0 + 1))
                                    goto LABEL_aefb5c;
                            }
                            if ((char)iter->field_0)
                            {
                                len1 = _strlen(iter);
                                while (1)
                                {
                                    v26 = len1;
                                    v27 = v26 - 1;
                                    if (v26 == 1)
                                        break;
                                    len1 = v27;
                                    if (!sub_a6994c(*((char *)iter + v26 - 1), 8))
                                    {
                                        *((char *)iter + v27 + 1) = 0;
                                        break;
                                    }
                                }
                                if (!(char)iter->field_0)
                                    goto LABEL_aefb5c;
                                ptr = iter;
                                if (!sub_aef014(ptr, 0, 0, &v0))
                                    break;
LABEL_aefb08:
                                iter = (char *)&node->field_0 + 1;
                                v10 = v32;
                                v11 = v33;
                                v12 = v34;
                                v13 = 0;
LABEL_aefb0c:
                                v8 = 1;
                                node = (char *)&node->field_0 + 1;
                                continue;
                            }
                        }
LABEL_aefb5c:
                        v35 = 108;
                        v36 = 349;
                        goto LABEL_aefc74;
                    }
                }
                v10 = 3;
                v11 = v14 & 0xff;
                v12 = 44;
                v13 = 0;
                if (v14 == 44)
                {
                    *(char *)&node->field_0 = 0;
                    if ((char)iter->field_0)
                    {
                        while (sub_a6994c((char)v28, 8))
                        {
                            iter = (char *)&iter->field_0 + 1;
                            if (!*((char *)&iter->field_0 + 1))
                                goto LABEL_aefb18;
                        }
                        if (!(char)iter->field_0)
                            goto LABEL_aefb18;
                        len2 = _strlen(iter);
                        while (1)
                        {
                            v30 = len2;
                            v31 = v30 - 1;
                            v32 = 4;
                            v33 = v30;
                            v34 = 1;
                            if (v30 == 1)
                                break;
                            len2 = v31;
                            if (!sub_a6994c(*((char *)iter + v30 - 1), 8))
                            {
                                *((char *)iter + v31 + 1) = 0;
                                break;
                            }
                        }
                        if (!(char)iter->field_0)
                            goto LABEL_aefb18;
                        if (!sub_aef014(ptr, iter, _strlen(iter), &v0))
                            break;
                        ptr = 0;
                        goto LABEL_aefb08;
                    }
                    else
                    {
LABEL_aefb18:
                        v35 = 109;
                        v36 = 364;
                        goto LABEL_aefc74;
                    }
                    goto LABEL_aefc74;
                }
                else
                {
                    v8 = 2;
                    node = (char *)&node->field_0 + 1;
                }
            }
            else
            {
LABEL_aefb24:
                v37 = (st_aef8d8_0 *)(char)iter->field_0;
                if (v8 == 2)
                {
                    if (v37)
                    {
                        while (sub_a6994c((char)v37, 8))
                        {
                            iter = (char *)&iter->field_0 + 1;
                            if (!*((char *)&iter->field_0 + 1))
                                goto LABEL_aefbe8;
                        }
                        if ((char)iter->field_0)
                        {
                            v38 = _strlen(iter);
                            while (1)
                            {
                                v39 = v38;
                                v40 = v39 - 1;
                                if (v39 == 1)
                                    break;
                                v38 = v40;
                                if (!sub_a6994c(*((char *)iter + v39 - 1), 8))
                                {
                                    *((char *)iter + v40 + 1) = 0;
                                    break;
                                }
                            }
                            if (!(char)iter->field_0)
                                goto LABEL_aefbe8;
                            v41 = _strlen(iter);
                            v42 = ptr;
                            v43 = iter;
LABEL_aefc48:
                            if (sub_aef014(v42, v43, v41, &v0))
                            {
                                sub_a6c2e4(v6, "crypto/x509/v3_utl.c", 395);
                                return v0;
                            }
                            break;
                        }
                    }
LABEL_aefbe8:
                    v35 = 109;
                    v36 = 379;
                }
                else if (v37)
                {
                    while (sub_a6994c((char)v37, 8))
                    {
                        iter = (char *)&iter->field_0 + 1;
                        if (!*((char *)&iter->field_0 + 1))
                            goto LABEL_aefc6c;
                    }
                    if (!(char)iter->field_0)
                        goto LABEL_aefc6c;
                    v44 = _strlen(iter);
                    while (1)
                    {
                        v45 = v44;
                        v46 = v45 - 1;
                        if (v45 == 1)
                            break;
                        v44 = v46;
                        if (!sub_a6994c(*((char *)iter + v45 - 1), 8))
                        {
                            *((char *)iter + v46 + 1) = 0;
                            break;
                        }
                    }
                    if (!(char)iter->field_0)
                        goto LABEL_aefc6c;
                    v42 = iter;
                    v43 = 0;
                    v41 = 0;
                    goto LABEL_aefc48;
                }
                else
                {
LABEL_aefc6c:
                    v35 = 108;
                    v36 = 388;
                }
LABEL_aefc74:
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_utl.c", v36, "X509V3_parse_list");
                sub_a36abc(0x22, v35, 0);
                break;
            }
        }
    }
    sub_a6c2e4(v4, "crypto/x509/v3_utl.c", 399);
    sub_ad6958(v0, &g_aef19c);
    return 0;
}
