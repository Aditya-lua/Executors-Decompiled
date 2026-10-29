/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979f24..0x97a1e0 (700 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_979f24(unsigned long long a0, unsigned int a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, void* a6)
{
    unsigned long long v13;  // 4118
    unsigned long long v14;  // x26
    unsigned int v23;  // w8
    unsigned long v25;  // x0
    void* v28;  // x20
    unsigned int v29;  // w21
    unsigned int v30;  // w21
    unsigned long v31;  // x0
    unsigned long long v15;  // x25
    unsigned long long v16;  // x24
    unsigned long long v17;  // x23
    unsigned long long v18;  // x22
    unsigned long long v19;  // x21
    unsigned long long v20;  // x20
    unsigned long long v21;  // x19
    unsigned long long v22;  // x30
    unsigned int v0;  // [bp-0x5c]
    unsigned long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v13 = arm64g_calculate_condition(33, (unsigned int)a0 - 4, 2, 0);
    if (!(v13 & 1))
        return 0;
    v2 = v14;
    v3 = v15;
    v4 = v16;
    v5 = v17;
    v6 = v18;
    v7 = v19;
    v8 = v20;
    v9 = v21;
    v10 = &v12;
    v11 = v22;
    v23 = (int)a6[1568];
    if (a1)
    {
        if ((unsigned int)a0 > ((v23 * 0x40000 | v23 >> 14) & 7))
        {
            v25 = sub_9853a4((long long)a6[1056], a0);
            if (!(unsigned int)v25)
                return v25;
            *(unsigned long long *)&a6[1568] = (long long)a6[1568] & 0xfffffffffffe3fff | (unsigned int)a0 * 0x4000;
            return 1;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        if ((unsigned int)a0 > ((v23 * 0x8000 | v23 >> 0x11) & 7))
        {
            v1 = 0;
            v0 = 0;
            if ((long long)a6[1120])
            {
                v28 = a6;
                if (!sub_986278((long long)a6[1120], &v1, &v0))
                    goto LABEL_97a18c;
                a6 = v28;
                if (!v1)
                    goto LABEL_979ff8;
            }
            else
            {
LABEL_979ff8:
                if ((unsigned int)a0 == 1)
                {
LABEL_97a108:
                    v31 = sub_9837fc((long long)a6[1064], a0);
                    if (!(unsigned int)v31)
                        return v31;
                    *(unsigned long long *)&a6[1568] = (long long)a6[1568] & 0xfffffffffff1ffff | (unsigned int)a0 * 0x20000 | 0x4000000;
                    return 1;
                }
                v1 = 0;
                v0 = 0;
                if ((long long)a6[1136])
                {
                    v28 = a6;
                    if (!sub_986278((long long)a6[1136], &v1, &v0))
                        goto LABEL_97a18c;
                    a6 = v28;
                    if (!v1)
                        goto LABEL_97a050;
                }
                else
                {
LABEL_97a050:
                    if ((unsigned int)a0 == 2)
                        goto LABEL_97a108;
                    v1 = 0;
                    v0 = 0;
                    if ((long long)a6[1128])
                    {
                        v28 = a6;
                        if (!sub_986278((long long)a6[1128], &v1, &v0))
                            goto LABEL_97a18c;
                        a6 = v28;
                        if (!v1)
                            goto LABEL_97a0a8;
                    }
                    else
                    {
LABEL_97a0a8:
                        if ((unsigned int)a0 == 3)
                            goto LABEL_97a108;
                        v1 = 0;
                        v0 = 0;
                        if ((long long)a6[1136])
                        {
                            v28 = a6;
                            if (!sub_986278((long long)a6[1136], &v1, &v0))
                                goto LABEL_97a18c;
                            a6 = v28;
                            if (!v1)
                                goto LABEL_97a100;
                        }
                        else
                        {
LABEL_97a100:
                            v29 = (unsigned int)a0 - 4;
                            if ((unsigned int)a0 == 4)
                                goto LABEL_97a108;
                            while (1)
                            {
                                v30 = v29;
                                v1 = 0;
                                v0 = 0;
                                if ((long long)a6[1136])
                                    break;
LABEL_97a130:
                                v29 = v30 - 1;
                                if (v30 == 1)
                                    goto LABEL_97a108;
                            }
                            v28 = a6;
                            if (sub_986278((long long)a6[1136], &v1, &v0))
                            {
                                a6 = v28;
                                if (!v1)
                                    goto LABEL_97a130;
                            }
                            else
                            {
LABEL_97a18c:
                                a6 = v28;
                            }
                        }
                    }
                }
            }
            sub_979174(a6, 10, 6, "crypto stream data in wrong EL", 0, "ssl/quic/quic_channel.c", 1112, "ch_on_handshake_yield_secret");
            return 0;
        }
        else
        {
            return 0;
        }
    }
}
