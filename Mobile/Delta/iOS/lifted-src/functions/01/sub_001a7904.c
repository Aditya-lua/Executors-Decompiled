/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a7904..0x1a7d34 (1072 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a7904_2 {
    struct st_1a7904_0 *field_0;
} st_1a7904_2;

typedef struct st_1a7904_0 {
    char field_0;
} st_1a7904_0;

extern char g_10002b0;

unsigned long long sub_1a7904(long long a0, long long a1, long long a2, unsigned long long a3, unsigned int a4, unsigned long long a5, unsigned int a6, unsigned long a7)
{
    unsigned long long v25;  // x0
    unsigned long long v26;  // x0
    unsigned long long v35;  // 4112
    unsigned long long v36;  // w8
    long long v37;  // x0
    long long v38;  // x0
    unsigned long long sock;  // x23
    unsigned long long v28;  // 4116
    long long v29;  // x0
    unsigned long long v30;  // x0
    unsigned long long v32;  // x24
    unsigned int *v33;  // x24
    unsigned long long v34;  // 4116
    unsigned long long v0;  // [bp-0x180]
    long long v1;  // [bp-0x178]
    st_1a7904_0 **v2;  // [bp-0x170], Other Possible Types: char
    st_1a7904_0 *v3;  // [bp-0x168]
    unsigned int v4;  // [bp-0x160]
    char v5;  // [bp-0x148]
    uint128_t v6;  // [bp-0x140], Other Possible Types: unsigned long long
    double v7;  // [bp-0x140]
    unsigned int v8;  // [bp-0x130], Other Possible Types: unsigned long long
    unsigned long long *v9;  // [bp-0x120], Other Possible Types: unsigned long long
    st_1a7904_0 **v10;  // [bp-0x110], Other Possible Types: char, unsigned int, unsigned long long
    st_1a7904_2 **v11;  // [bp-0x108], Other Possible Types: st_1a7904_0 *
    st_1a7904_0 **v12;  // [bp-0x100], Other Possible Types: char, unsigned int
    st_1a7904_0 *v13;  // [bp-0xe0]
    unsigned long long v14;  // [bp-0xe0]
    unsigned long long v15;  // [bp-0xdf]
    unsigned long long v16;  // [bp-0xd0]
    unsigned long long v17;  // [bp-0xc0]
    unsigned long long v18;  // [bp-0xb0]
    unsigned long long v19;  // [bp-0xa0]
    unsigned long long v20;  // [bp-0x90]
    unsigned long long v21;  // [bp-0x86]
    unsigned long v22;  // [bp-0x70]
    char *v23;  // [bp-0x10]
    long long v24;  // [bp+0x0]

    v23 = &v24;
    v1 = v24;
    v22 = *(long long *)&g_10002b0;
    v3 = &v2;
    v2 = &v3;
    v6 = 0;
    v8 = 0;
    v9 = 0;
    *(unsigned int *)((char *)&v6 + 8) = 1;
    v13 = &v12;
    v12 = &v13;
    if (sub_6b08(a1))
    {
        v25 = sub_a0c8(a1);
        v7 = 2e-323;
        goto LABEL_1a7a0c;
    }
    else
    {
        v13 = &v12;
        v12 = &v13;
        if (sub_6b08(a0))
        {
            v25 = sub_a0c8(a0);
            *(unsigned int *)&v6 = a4;
            v7 = (double)_INSERT(v6, 4, a3);
            if (a3 == 1)
                goto LABEL_1a79e4;
LABEL_1a7a0c:
            std::__1::to_string(a2);
            if (_getaddrinfo(v25, sub_a0c8(&v4), &v7, &v5))
            {
                sock = 0xffffffff;
            }
            else
            {
                v11 = &v5;
                sub_1a48d4(&v12, &v11, &v10);
                v10 = &v11;
                v11 = &v10;
                sub_159d9c(&v13, &v12);
                v17 = 1;
                sub_181a8(&v12);
                v32 = v5;
                if (v32)
                {
                    while (1)
                    {
                        v33 = v32;
                        sock = _socket(v33[1], v33[2], v33[3]);
                        v34 = arm64g_calculate_condition(1, sock & 0xffffffff, 1, 0);
                        if (!(v34 & 1))
                        {
                            v0 = 1;
                            v35 = arm64g_calculate_condition(1, _fcntl(sock, 2) & 0xffffffff, 1, 0);
                            if (v35 & 1)
                            {
                                _close(sock);
                                goto LABEL_1a7aa0;
                            }
                            if (a5)
                            {
                                v10 = 1;
                                v11 = &v12;
                                v12 = &v11;
                                _setsockopt(sock, 6, 1, &v10, 4);
                            }
                            if (v33[1] == 30)
                            {
                                v10 = a6;
                                v11 = &v12;
                                v12 = &v11;
                                _setsockopt(sock, 41, 27, &v10, 4);
                            }
                            if (*(long long *)(a7 + 24))
                            {
                                v12 = sock;
                                sub_6b0cc(a7, &v12);
                            }
                            v12 = (st_1a7904_0 **)0;
                            if (sub_1c25a0(v1, sock, v33, &v12) & 1)
                            {
                                v36 = 1;
                                v25 = sock;
                                if (!0)
                                    goto LABEL_1a7c74;
                            }
                            else
                            {
                                _close(sock);
                                if (v12)
                                    v36 = 2;
                                else
                                    v36 = 0;
                                sock = v25;
                                if (v36)
                                {
LABEL_1a7c74:
                                    if (v36 != 2)
                                        goto LABEL_1a7c80;
                                    break;
                                }
                            }
                        }
LABEL_1a7aa0:
                        v32 = *(long long *)&v33[10];
                        if (!*(long long *)&v33[10])
                            break;
                    }
                }
                sock = 0xffffffff;
LABEL_1a7c80:
                sub_1b3f74(&v13);
            }
            goto LABEL_1a7c8c;
        }
        else
        {
            v25 = 0;
            *(unsigned int *)&v6 = a4;
            v7 = (double)_INSERT(v6, 4, a3);
            if (a3 != 1)
                goto LABEL_1a7a0c;
LABEL_1a79e4:
            v26 = sub_6b08(a0);
            if (v26 > 104)
            {
                sock = 0xffffffff;
            }
            else
            {
                sock = _socket(*(unsigned int *)((void*)&v7 + 4), *(unsigned int *)((void*)&v7 + 8), *(unsigned int *)((void*)&v7 + 12));
                v28 = arm64g_calculate_condition(1, sock & 0xffffffff, 1, 0);
                if (!(v28 & 1))
                {
                    v21 = 0;
                    v19 = 0;
                    v20 = 0;
                    v17 = 0;
                    v18 = 0;
                    v14 = 0;
                    v16 = 0;
                    v15 = 1;
                    sub_1ada8c(a0);
                    v29 = sub_a0c8(&v12);
                    v30 = sub_a0c8(&v12);
                    sub_6505c(&v14 | 2, v29, v30 + sub_6b08(&v12) - v29);
                    v9 = &v14;
                    v8 = (unsigned int)v26 + 2;
                    v0 = 1;
                    _fcntl(sock, 2);
                    if (*(long long *)(a7 + 24))
                    {
                        v4 = sock;
                        sub_6b0cc(a7, &v4);
                    }
                    if (!(sub_1c25a0(v1, sock, &v7, &v4) & 1))
                    {
                        _close(sock);
                        sock = 0xffffffff;
                    }
LABEL_1a7c8c:
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v22)
        return sock;
    v37 = __Unwind_Resume(___stack_chk_fail());
    v38 = __Unwind_Resume(__Unwind_Resume(__Unwind_Resume(v37)));
    sub_1b3f74(&v13);
    __Unwind_Resume(v38);
}
