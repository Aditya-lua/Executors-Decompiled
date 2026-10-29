/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc28b04..0xc28cc4 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c28b04_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c28b04_0;


double sub_c28b04(st_c28b04_0 *a0, unsigned long long *a1, unsigned long long a2)
{
    unsigned long long *v4;  // x24
    unsigned long long v5;  // x1
    unsigned long long v12;  // x23
    unsigned long long *v13;  // x22
    unsigned long long v15;  // 4121
    unsigned long long v16;  // x8
    unsigned long long v17;  // x25
    unsigned long long v18;  // x0
    unsigned long long ptr;  // x0
    unsigned long long *v20;  // x8
    st_c28b04_0 *v6;  // x20
    long long v22;  // x0
    unsigned long long v23;  // x26
    long long v24;  // x0
    unsigned long long ptr1;  // x0
    unsigned long long v8;  // x26
    unsigned long long i;  // x19
    unsigned long long *v10;  // x24
    unsigned long long v11;  // x25
    uint128_t v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1;
    v5 = a2 * 24;
    if (a2 > 384307168202282325)
        a0 = sub_c6b970(0);
    v6 = a0;
    if (v5)
    {
        ptr1 = _malloc(v5);
        if (!ptr1)
        {
            v22 = sub_c6b970(8, v5);
            v1 = v23;
            sub_c28dac(&v0);
            v24 = __Unwind_Resume(v22);
            sub_c73e0c(v24);
        }
        v0 = CONCAT(ptr1, a2);
        if (a2)
        {
            v8 = 0;
            i = a2;
            v10 = v4;
            do
            {
                if (v10 == &v4[3 * a2])
                    break;
                v13 = v10;
                v15 = arm64g_calculate_condition(0x44, *v13, 0, 0);
                if (v15 & 1)
                    v16 = *v13 ^ 0x8000000000000000;
                else
                    v16 = 1;
                if (v16)
                {
                    if (v16 == 1)
                    {
                        v17 = v10[2];
                        if ((long long)v17 < 0)
                        {
                            sub_c6b970(0, v12);
                            __debugbreak();
                        }
                        if (!v17)
                        {
                            v5 = 0;
                            v12 = 1;
                            v18 = 1;
                            v11 = v17;
                            continue;
                        }
                        else
                        {
                            ptr = _malloc(v17);
                            v11 = v17;
                            if (ptr)
                            {
                                v18 = ptr;
                                _memcpy();
                                v11 = v17;
                                v12 = v18;
                                v5 = v17;
                                continue;
                            }
                        }
                    }
                    else
                    {
                        v18 = sub_c28cc4(v10 + 1);
                        v11 = 9223372036854775810;
                        continue;
                    }
                    goto LABEL_c28c8c;
                }
                else
                {
                    v18 = v10[1];
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    if ((long long)/* unsupported instruction */ < 0)
                    {
                        sub_c769bc();
LABEL_c28c8c:
                        sub_c6b970(1, v11);
                        __debugbreak();
                    }
                    v11 = 0x8000000000000000;
                }
                v20 = ptr1 + 24 * v8;
                v8 += 1;
                *v20 = v11;
                v20[1] = v18;
                v20[2] = v5;
                i -= 1;
                v10 = v13 + 3;
            } while (i);
        }
    }
    else
    {
        v0 = CONCAT(8, 0);
    }
    v6->field_0 = v0;
    v6->field_10 = a2;
    return *(unsigned long long *)&v0;
}
