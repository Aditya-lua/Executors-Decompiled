/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97e94c..0x97ebcc (640 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97e94c_0 {
    char padding_0[88];
    long long field_58;
} st_97e94c_0;

extern long long g_98026c;

unsigned long long sub_97e94c(unsigned long a0, long long a1, long long a2, unsigned long long *a3, unsigned long long a4)
{
    unsigned long v14;  // x8
    unsigned long long v15;  // x8
    unsigned long v16;  // x9
    unsigned long long iter;  // x8
    unsigned long long v18;  // w10
    st_97e94c_0 *v20;  // x10
    unsigned long long v21;  // w0
    st_97e94c_0 **v0;  // [bp-0x98]
    unsigned long v1;  // [bp-0x90]
    long long v2;  // [bp-0x88]
    long long v3;  // [bp-0x80]
    unsigned long long *v4;  // [bp-0x78]
    unsigned int v5;  // [bp-0x70]
    st_97e94c_0 *v6;  // [bp-0x68]
    unsigned long long v7;  // [bp-0x50]
    unsigned long long v8;  // [bp-0x48]
    unsigned long long v9;  // [bp-0x40]
    unsigned long long v10;  // [bp-0x34]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    *a3 = 0;
    if (!sub_97f48c())
        return 0;
    sub_ad9384(sub_c4ba8(v6->field_58));
    v10 = 1;
    if (v9)
    {
        if (!v8)
            goto LABEL_97e9cc;
        v14 = v8 + 184;
        goto LABEL_97e9c8;
    }
    else if (v7)
    {
        v14 = v7 + 376;
LABEL_97e9c8:
        *(unsigned int *)v14 = 0;
    }
LABEL_97e9cc:
    if ((int)sub_97d854(&v6) >= 1)
    {
        v15 = v8;
        if (v15)
        {
LABEL_97ea00:
            if (sub_980028(&v6, *(long long *)(v15 + 128), a1, a2, a3, a4))
            {
                v16 = *(short *)(v7 + 336);
                if (*a3)
                {
                    if (!(v16 >> 5 & 1) && !sub_977368(*(long long *)(v7 + 160)))
                    {
                        iter = v6;
                        while (1)
                        {
                            switch (v18)
                            {
                            case 0:
                                iter = *(long long *)(iter + 64);
                                if (!iter)
                                    goto LABEL_97ea9c;
                                continue;
                                continue;
                            case 2:
                                break;
                            default:
LABEL_97ea9c:
                                sub_982d48(sub_97b868(v6->field_58), 0);
                                break;
                            }
                            break;
                        }
                    }
                    sub_ad93b4(sub_c4ba8(v6->field_58));
                    return 1;
                }
                if (v16 >> 5 & 1 || sub_977368(*(long long *)(v7 + 160)))
                {
                    goto LABEL_97ea84;
                }
                else
                {
                    if (sub_980e14(v6))
                    {
                        v20 = v6;
                        v0 = &v6;
                        v1 = *(long long *)(v8 + 128);
                        v2 = a1;
                        v3 = a2;
                        v4 = a3;
                        v5 = a4;
                        sub_97b8d8(v20->field_58, 0);
                        v21 = (unsigned int)sub_982de8(sub_97b868(v20->field_58), &g_98026c, &v0, 0);
                        if (v21)
                        {
                            sub_ad93b4(sub_c4ba8(v6->field_58));
                            return ~v21 >> 31;
                        }
LABEL_97ea84:
                        sub_97c738(&v6);
                    }
                    else
                    {
                        sub_97d424(&v6);
                        if (sub_980028(&v6, *(long long *)(v8 + 128), a1, a2, a3, a4))
                        {
                            if (*a3)
                            {
                                sub_ad93b4(sub_c4ba8(v6->field_58));
                                return 1;
                            }
                            if (v10)
                            {
                                if (v9)
                                {
                                    if (v8)
                                    {
                                        *(unsigned int *)(v8 + 184) = 2;
                                        sub_ad93b4(sub_c4ba8(v6->field_58));
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if (v7)
                                    {
                                        *(unsigned int *)(v7 + 376) = 2;
                                        sub_ad93b4(sub_c4ba8(v6->field_58));
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else if (sub_97f904(&v6, 0))
        {
            v15 = *(long long *)(v7 + 176);
            v8 = v15;
            goto LABEL_97ea00;
        }
    }
    sub_ad93b4(sub_c4ba8(v6->field_58));
    return 0;
}
