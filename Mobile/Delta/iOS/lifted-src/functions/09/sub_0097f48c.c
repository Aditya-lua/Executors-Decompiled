/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97f48c..0x97f904 (1144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned short sub_97f48c(unsigned short idx, void* a1, unsigned long long a2)
{
    unsigned long long v2;  // x22
    unsigned short v3;  // w20
    unsigned short v12;  // x8
    unsigned long v14;  // x8
    void* v15;  // x0
    unsigned short v16;  // w8
    unsigned short v17;  // w8
    unsigned long v18;  // x8
    unsigned long long v19;  // x19
    void* v20;  // x22
    unsigned short v4;  // w8
    unsigned long v22;  // x8
    unsigned short v5;  // w8
    unsigned short v6;  // w21
    unsigned long v7;  // x8
    uint128_t v8;  // q0
    unsigned short v9;  // x0
    void* v10;  // x1
    uint128_t v11;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(uint128_t *)&a1[16] = 0;
    *(uint128_t *)&a1[32] = 0;
    *(uint128_t *)a1 = 0;
    *(unsigned int *)&a1[48] = 0;
    *(unsigned int *)&a1[52] = __ROL__((unsigned int)a2, 26) & 4227858433 & 1;
    if (!idx)
    {
        sub_97c738();
        return 0;
    }
    v2 = (unsigned int)a2 >> 2 & 2 | (unsigned int)a2;
    v3 = (unsigned int)a2 & 64;
    v4 = *(int *)idx;
    if (129 < v4)
    {
        if (v4 != 130)
        {
            if (v4 != 131)
            {
                sub_97c738();
                return 0;
            }
            if (!(a2 >> 7 & 1))
            {
                if (a2 >> 8 & 1)
                {
                    return 0;
                }
                else if (3 >= ((unsigned int)v2 & 7) - 1)
                {
                    sub_97c738();
                    return 0;
                }
LABEL_97f6a8:
                sub_97c738();
                return 0;
            }
            v6 = 0;
            *(unsigned long long *)a1 = idx;
            *(unsigned long long *)&a1[8] = idx;
            *(unsigned int *)&a1[48] = 1;
            v9 = 1;
            v10 = a1;
            if (a2 >> 5 & 1)
                goto LABEL_97f6f4;
            goto LABEL_97f884;
        }
        else
        {
            if (!(a2 >> 2 & 1))
            {
                if (!(a2 >> 8 & 1))
                {
                    v17 = (unsigned int)v2 & 131;
                    sub_97c738();
                    return 0;
                }
                return 0;
            }
            v6 = 0;
            v18 = *(long long *)(idx + 120);
            *(unsigned long long *)a1 = idx;
            *(unsigned long *)&a1[8] = v18;
            *(unsigned long long *)&a1[16] = idx;
            *(unsigned int *)&a1[44] = 1;
            v9 = 1;
            v10 = a1;
            if (a2 >> 5 & 1)
                goto LABEL_97f6f4;
            goto LABEL_97f884;
        }
    }
    if (v4 != 128)
    {
        if (v4 != 129)
        {
            sub_97c738();
            return 0;
        }
        if (!(v2 >> 1 & 1))
        {
            if (!(a2 >> 8 & 1))
            {
                switch (v5)
                {
                case 1:
                    sub_97c738();
                    return 0;
                case 128:
                    sub_97c738();
                    return 0;
                case 4:
                    sub_97c738();
                    return 0;
                default:
                    goto LABEL_97f6a8;
                }
            }
            else
            {
                return 0;
            }
        }
        v6 = 0;
        *(unsigned long long *)a1 = idx;
        v7 = *(long long *)(idx + 120);
        v8 = __dirty_unsupported_Iop_SliceV128(*(int128_t *)(v7 + 128), *(int128_t *)(v7 + 128), 8);
        *(uint128_t *)&a1[8] = v8;
        *(unsigned long *)&a1[24] = v7;
        *(unsigned long long *)&a1[32] = idx;
        *(unsigned int *)&a1[40] = 1;
        v9 = 1;
        v10 = a1;
        if (a2 >> 5 & 1)
            goto LABEL_97f6f4;
        goto LABEL_97f884;
    }
    else
    {
        *(unsigned long long *)a1 = idx;
        v11 = __dirty_unsupported_Iop_SliceV128(*(int128_t *)(idx + 128), *(int128_t *)(idx + 128), 8);
        *(uint128_t *)&a1[8] = v11;
        *(unsigned long long *)&a1[24] = idx;
        if (!(a2 >> 3 & 1))
        {
            v6 = 0;
            v12 = *(long long *)(idx + 176);
            v10 = a1;
            if (!(a2 & 1))
                goto LABEL_97f6e0;
            goto LABEL_97f6e8;
        }
        sub_ad9384(sub_c4ba8(*(long long *)(idx + 88)));
        v10 = a1;
        if (v3)
        {
            *(unsigned int *)&v10[52] = 1;
            if ((int)v10[40])
            {
                if (!(long long)v10[32])
                    goto LABEL_97f6c4;
                v14 = (long long)v10[32] + 184;
                goto LABEL_97f6c0;
            }
            else if ((long long)v10[24])
            {
                v14 = (long long)v10[24] + 376;
LABEL_97f6c0:
                *(unsigned int *)v14 = 0;
            }
        }
LABEL_97f6c4:
        if (*(long long *)(idx + 176))
        {
            v6 = 1;
            v12 = *(long long *)(idx + 176);
            a1 = v10;
            if (!(a2 & 1))
                goto LABEL_97f6e0;
            goto LABEL_97f6e8;
        }
        if ((unsigned short)(*(short *)(idx + 336)) >> 5 & 1 || (v10 = a1, sub_977368(*(long long *)(idx + 160))))
        {
            sub_97c738(v10);
            v9 = 0;
        }
        else if ((int)sub_97d854(v10) >= 1)
        {
            v15 = a1;
            if (!(a2 >> 4 & 1))
                v9 = sub_97fb98(v15);
            else
                v9 = sub_97f904(v15, 0);
            v6 = 1;
            if (!v9)
                goto LABEL_97f8f4;
            v12 = *(long long *)(idx + 176);
            v10 = a1;
            if (!(a2 & 1))
            {
LABEL_97f6e0:
                if (v2 >> 1 & 1 && (v10 = a1, v12))
                    goto LABEL_97f6e8;
                if (!(a2 >> 8 & 1))
                {
                    switch (v16)
                    {
                    case 2:
                        break;
                    case 128:
                        break;
                    case 4:
                        break;
                    default:
                        break;
                    }
                    sub_97c738(0);
                    v9 = 0;
                    v10 = a1;
LABEL_97f884:
                    a1 = v10;
                    if (!v6)
                        return v9;
                }
                else
                {
                    v9 = 0;
                    if (!v6)
                        return 0;
                }
            }
            else
            {
LABEL_97f6e8:
                *(unsigned long long *)&v10[32] = v12;
                v9 = 1;
                a1 = v10;
                if (!(a2 >> 5 & 1))
                    goto LABEL_97f884;
                v9 = 1;
LABEL_97f6f4:
                v10 = a1;
                if (v6)
                    goto LABEL_97f884;
                v19 = a2;
                v20 = a1;
                sub_ad9384(sub_c4ba8(*(long long *)(*(long long *)a1 + 88)));
                if (!v3)
                {
                    v9 = 1;
                    a2 = v19;
                    a1 = v20;
                }
                else
                {
                    a1 = v20;
                    *(unsigned int *)&v20[52] = 1;
                    if ((int)v20[40])
                    {
                        a2 = v19;
                        if (!(long long)a1[32])
                            goto LABEL_97f798;
                        v22 = (long long)a1[32] + 184;
                        goto LABEL_97f794;
                    }
                    else
                    {
                        a2 = v19;
                        if ((long long)a1[24])
                        {
                            v22 = (long long)a1[24] + 376;
LABEL_97f794:
                            *(unsigned int *)v22 = 0;
                        }
                    }
LABEL_97f798:
                    v9 = 1;
                }
            }
        }
        else
        {
            v9 = 0;
LABEL_97f8f4:
        }
        if (v9 & 1 & (unsigned int)a2 >> 5 & 1)
            return v9;
        sub_ad93b4(sub_c4ba8(*(long long *)(*(long long *)a1 + 88)));
        return v9;
    }
}
