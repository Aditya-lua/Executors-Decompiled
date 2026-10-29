/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa456c0..0xa45b08 (1096 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a456c0_3 {
    char padding_0[12];
    char field_c;
} st_a456c0_3;

typedef struct st_a456c0_1 {
    char field_0[13];
    unsigned long long field_5;
} st_a456c0_1;

typedef struct st_a456c0_0 {
    char padding_0[680];
    struct st_a456c0_0 *field_2a8;
    char padding_2b0[48];
    unsigned long long field_2e0;
} st_a456c0_0;

typedef struct st_a456c0_2 {
    char padding_0[11];
    char field_b;
} st_a456c0_2;


unsigned long long sub_a456c0(long long *a0, unsigned long long a1, unsigned long long a2, void* ptr)
{
    void* v2;  // x19
    unsigned long long v3;  // 4118
    st_a456c0_2 *v12;  // x0
    st_a456c0_3 *v13;  // x0
    unsigned long long v14;  // w20
    unsigned long long v15;  // w19
    char *v16;  // x8
    unsigned long v17;  // x9
    unsigned long v18;  // x9
    unsigned long v19;  // x9
    unsigned long v20;  // x9
    unsigned long v21;  // x9
    unsigned long v22;  // x9
    unsigned long v23;  // x9
    unsigned long long v24;  // 4112
    unsigned long long n;  // x23
    unsigned long long v5;  // 4118
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    st_a456c0_0 *v8;  // x22
    unsigned long long v9;  // x0
    st_a456c0_1 *v10;  // x0
    unsigned long long v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    if (0x11 >= a1)
    {
        if (a1 <= 8)
        {
            if (!a1)
            {
                *(unsigned long long *)&v2[280] = 0;
                *(unsigned int *)&v2[744] = sub_a50728(*a0);
                *(long long **)&v2[736] = a0 + 5;
                *(unsigned int *)&v2[748] = 0xffffffff;
                *(unsigned long long *)&v2[752] = 0xffffffff00000000;
                return 1;
            }
            if (a1 != 8)
                return 0xffffffff;
            v8 = sub_9ffdd8(ptr);
            if ((long long)v2[680])
            {
                if ((long long)v2[680] == v2)
                {
                    v8->field_2a8 = v8;
                    goto LABEL_a457a4;
                }
            }
            else
            {
LABEL_a457a4:
                if ((long long)v2[736] == a0 + 5)
                {
                    v8->field_2e0 = ptr + 40;
                    return 1;
                }
                v9 = sub_a6bf4c((int)v2[744], "crypto/evp/e_aria.c", 386);
                v8->field_2e0 = v9;
                if (!v9)
                    return v9;
                _memcpy();
                return 1;
            }
        }
        else if (a1 != 9)
        {
            if (a1 == 16)
            {
                v5 = arm64g_calculate_condition(49, (unsigned int)a2 - 0x11, 16, 0);
                if (!(v5 & 1))
                {
                    v6 = sub_a50720(a0);
                    if (!(unsigned int)v6)
                        return v6;
                    if ((int)v2[748] >= 0)
                    {
                        sub_a507c8(a0);
                        _memcpy();
                        return 1;
                    }
                }
            }
            else if (a1 == 0x11)
            {
                v3 = arm64g_calculate_condition(49, (unsigned int)a2 - 0x11, 16, 0);
                if (!(v3 & 1) && !sub_a50720(a0))
                {
                    _memcpy(sub_a507c8(a0), ptr, a2 & 0xffffffff);
                    *(unsigned int *)&v2[748] = a2;
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
                if ((unsigned int)a2 >= 0x11 && (int)a2 > (int)v2[744])
                {
                    if ((long long)v2[736] != a0 + 5)
                        sub_a6c2e4((long long)v2[736], "crypto/evp/e_aria.c", 284);
                    v7 = sub_a6bf4c(a2 & 0xffffffff, "crypto/evp/e_aria.c", 285);
                    *(unsigned long long *)&v2[736] = v7;
                    if (!v7)
                        return v7;
                }
                *(unsigned int *)&v2[744] = a2;
                return 1;
            }
        }
    }
    else
    {
        if (a1 > 21)
        {
            if (a1 != 22)
            {
                if (a1 != 24)
                {
                    if (a1 == 37)
                    {
                        *(int *)ptr = (int)v2[744];
                        return 1;
                    }
                    return 0xffffffff;
                }
                if ((int)v2[752] && (int)v2[280] && !sub_a50720(a0))
                {
                    _memcpy((long long)v2[736] + (int)v2[744] - (int)a2, ptr, (int)a2);
                    sub_a94bbc(v2 + 288, (long long)v2[736], (int)v2[744]);
LABEL_a45afc:
                    *(unsigned int *)&v2[284] = 1;
                    return 1;
                }
            }
            else if ((unsigned int)a2 == 13)
            {
                v10 = sub_a507c8(a0);
                v11 = (long long)ptr[5];
                *(long long *)&v10->field_0[0] = *(long long *)ptr;
                *(unsigned long long *)&v10->field_0[5] = v11;
                *(unsigned int *)&v2[756] = 13;
                v12 = sub_a507c8(a0);
                v13 = sub_a507c8(a0);
                v14 = v13->field_c | v12->field_b * 0x100;
                v15 = v14 - 8;
                if (v14 >= 8)
                {
                    if (sub_a50720(a0))
                    {
                        v15 = v15;
                        *(char *)(sub_a507c8(a0) + 11) = v15 >> 8;
                        *(char *)(sub_a507c8(a0) + 12) = v15;
                        return 16;
                    }
                    else if (v15 >= 16)
                    {
                        v15 = v14 - 24;
                        *(char *)(sub_a507c8(a0) + 11) = v15 >> 8;
                        *(char *)(sub_a507c8(a0) + 12) = v15;
                        return 16;
                    }
                }
            }
        }
        else
        {
            if (a1 != 18)
            {
                if (a1 != 19)
                    return 0xffffffff;
                if ((int)v2[752] && (int)v2[280])
                {
                    sub_a94bbc(v2 + 288, (long long)v2[736], (int)v2[744]);
                    _memcpy();
                    v16 = (long long)v2[736] + (int)v2[744];
                    v17 = *(v16 - 1) + 1;
                    *(v16 - 1) = v17;
                    if (v17 >> 8 & 1)
                    {
                        v18 = *(v16 - 2) + 1;
                        *(v16 - 2) = v18;
                        if (v18 >> 8 & 1)
                        {
                            v19 = *(v16 - 3) + 1;
                            *(v16 - 3) = v19;
                            if (v19 >> 8 & 1)
                            {
                                v20 = *(v16 - 4) + 1;
                                *(v16 - 4) = v20;
                                if (v20 >> 8 & 1)
                                {
                                    v21 = *(v16 - 5) + 1;
                                    *(v16 - 5) = v21;
                                    if (v21 >> 8 & 1)
                                    {
                                        v22 = *(v16 - 6) + 1;
                                        *(v16 - 6) = v22;
                                        if (v22 >> 8 & 1)
                                        {
                                            v23 = *(v16 - 7) + 1;
                                            *(v16 - 7) = v23;
                                            if (v23 >> 8 & 1)
                                            {
                                                *(v16 - 8) = *(v16 - 8) + 1;
                                                *(unsigned int *)&v2[284] = 1;
                                                return 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    goto LABEL_a45afc;
                }
            }
            else
            {
                v24 = arm64g_calculate_condition(1, a2 & 0xffffffff, 1, 0);
                if (v24 & 1)
                {
                    _memcpy((long long)v2[736], ptr, (int)v2[744]);
LABEL_a45aa4:
                    *(unsigned int *)&v2[752] = 1;
                    return 1;
                }
                else if ((int)a2 >= 4 && (int)((int)v2[744] - a2) >= 8 && (n = a2 & 0xffffffff, _memcpy((long long)v2[736], ptr, n), !sub_a50720(a0) || 1 <= (int)sub_aa8830((long long)v2[736] + n, (int)v2[744] - a2)))
                {
                    goto LABEL_a45aa4;
                }
            }
        }
    }
    return 0;
}
