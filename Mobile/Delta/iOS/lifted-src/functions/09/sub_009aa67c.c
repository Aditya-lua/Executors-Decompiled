/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9aa67c..0x9aab44 (1224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9aa67c_0 {
    void* field_0;
    unsigned long long field_8;
} st_9aa67c_0;

typedef struct st_9aa67c_3 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[176];
    unsigned long long field_c0;
    char padding_c8[1944];
    unsigned int field_860;
    char padding_864[4];
    unsigned long long field_868;
} st_9aa67c_3;


unsigned long long sub_9aa67c(void* a0, st_9aa67c_0 *a1)
{
    unsigned long long v5;  // x1
    char v6;  // x0
    unsigned long v15;  // x10
    void* v16;  // x0
    long long v17;  // x1
    long long v18;  // x2
    long long v19;  // x1
    unsigned long v20;  // x21
    unsigned long v21;  // x9
    unsigned long v22;  // x22
    st_9aa67c_3 *v23;  // x23
    char v24;  // x0
    unsigned long v7;  // x21
    unsigned long long v25;  // x9
    unsigned long v26;  // x8
    unsigned long long v27;  // x8
    unsigned long v28;  // x10
    unsigned long long v29;  // x0
    unsigned long v8;  // x9
    unsigned long long *v9;  // x23
    unsigned long v10;  // x22
    char v11;  // x0
    unsigned long long v12;  // x9
    unsigned long v13;  // x8
    unsigned long long v14;  // x8
    char v0;  // [bp-0x58]
    unsigned long v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = (long long)a0[280] * 4;
    if ((long long)a0[1032])
    {
        _bzero((long long)a0[1032], v5);
        if (!(long long)a0[1032])
            goto LABEL_9aa7c4;
        goto LABEL_9aa6b8;
    }
    v6 = sub_a6bffc(v5, "ssl/statem/statem_clnt.c", 2607);
    *(unsigned long long *)&a0[1032] = v6;
    if (v6)
    {
LABEL_9aa6b8:
        if (!((char)(*(char *)(*(long long *)((long long)a0[24] + 216) + 80)) >> 3 & 1) && *(int *)(long long)a0[24] >= 772 && *(int *)(long long)a0[24] != 0x10000)
        {
            v0 = 0;
            if ((char)a0[132] & 1)
                return 1;
            sub_a6c2e4((long long)a0[840], "ssl/statem/statem_clnt.c", 2629);
            *(uint128_t *)&a0[840] = 0;
            sub_a6c2e4((long long)a0[2992], "ssl/statem/statem_clnt.c", 2632);
            *(uint128_t *)&a0[2992] = 0;
            if (!a1->field_8 || (v7 = *(char *)a1->field_0, v8 = a1->field_8 - 1, v7 > v8))
            {
LABEL_9aa740:
                sub_a368c8();
                v19 = 2637;
                goto LABEL_9aa790;
            }
            v9 = a0 + 2992;
            v10 = a1->field_0 + 1;
            a1->field_0 = v10 + v7;
            a1->field_8 = v8 - v7;
            sub_a6c2e4(*v9, "include/internal/packet.h", 454);
            *v9 = 0;
            v9[1] = 0;
            if ((unsigned int)v7)
            {
                v11 = sub_a6dac4(v10, v7, "include/internal/packet.h", 463);
                *v9 = v11;
                if (v11)
                {
                    *(unsigned long *)&a0[3000] = v7;
                    goto LABEL_9aa970;
                }
                goto LABEL_9aa740;
            }
LABEL_9aa970:
            v12 = a1->field_8 - 2;
            if (a1->field_8 < 2 || (v13 = *(short *)a1->field_0, v14 = (unsigned int)((v13 & 0xff00) >> 8) | (unsigned int)v13 * 0x100 & 0xff00ff00, v14 > v12))
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_clnt.c", 2642, "tls_process_certificate_request");
                v16 = a0;
                v17 = 50;
                goto LABEL_9aa9b4;
            }
            v15 = a1->field_0 + 2;
            a1->field_0 = v15 + v14;
            a1->field_8 = v12 - v14;
            v1 = v15;
            v2 = v14;
            if (!sub_99a780(a0, &v1, 0x4000, &v0, 0, 1) || !sub_99b03c(a0, 0x4000, v0, 0, 0, 1))
            {
                sub_a6c2e4(v0, "ssl/statem/statem_clnt.c", 2651);
                return 0;
            }
            sub_a6c2e4(v0, "ssl/statem/statem_clnt.c", 2654);
            if (sub_96a5ac(a0))
            {
LABEL_9aa888:
                if (a1->field_8)
                {
                    sub_a368c8();
                    v19 = 2704;
                    goto LABEL_9aa790;
                }
                else
                {
                    *(unsigned int *)&a0[832] = 1;
                    if ((char)(*(char *)(*(long long *)((long long)a0[24] + 216) + 80)) >> 3 & 1 || *(int *)(long long)a0[24] < 772 || *(int *)(long long)a0[24] == 0x10000 || (int)a0[2984] == 4)
                        return 2;
                    return 3;
                    return 2;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_clnt.c", 2656, "tls_process_certificate_request");
                v16 = a0;
                v17 = 80;
LABEL_9aa9b4:
                v18 = 271;
            }
        }
        else
        {
            if (!a1->field_8 || (v20 = *(char *)a1->field_0, v21 = a1->field_8 - 1, v20 > v21))
            {
                sub_a368c8();
                v19 = 2664;
                goto LABEL_9aa790;
            }
            v22 = a1->field_0 + 1;
            a1->field_0 = v22 + v20;
            a1->field_8 = v21 - v20;
            v23 = a0 + 840;
            sub_a6c2e4((long long)a0[840], "include/internal/packet.h", 454);
            *(uint128_t *)&v23->field_0 = 0;
            if ((unsigned int)v20)
            {
                v24 = sub_a6dac4(v22, v20, "include/internal/packet.h", 463);
                v23->field_0 = v24;
                if (v24)
                {
                    *(unsigned long *)&a0[848] = v20;
                    goto LABEL_9aa868;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 2669, "tls_process_certificate_request");
                    v16 = a0;
                    v17 = 80;
                    v18 = 786691;
                }
            }
            else
            {
LABEL_9aa868:
                if (!((char)(*(char *)(*(long long *)((long long)a0[24] + 216) + 80)) >> 1 & 1))
                {
LABEL_9aa878:
                    v29 = sub_9b1e94(a0, a1);
                    if (!(unsigned int)v29)
                        return v29;
                    goto LABEL_9aa888;
                }
                v25 = a1->field_8 - 2;
                if (a1->field_8 < 2 || (v26 = *(short *)a1->field_0, v27 = (unsigned int)((v26 & 0xff00) >> 8) | (unsigned int)v26 * 0x100 & 0xff00ff00, v27 > v25))
                {
                    sub_a368c8();
                    v19 = 2677;
LABEL_9aa790:
                    sub_a369bc("ssl/statem/statem_clnt.c", v19, "tls_process_certificate_request");
                    v16 = a0;
                    v17 = 50;
                    v18 = 159;
                }
                else
                {
                    v28 = a1->field_0 + 2;
                    a1->field_0 = v28 + v27;
                    a1->field_8 = v25 - v27;
                    v1 = v28;
                    v2 = v27;
                    if (sub_96b598(a0, &v1, 0))
                    {
                        if (sub_96a5ac(a0))
                            goto LABEL_9aa878;
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 2691, "tls_process_certificate_request");
                        v18 = 524308;
                        v16 = a0;
                        v17 = 80;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 2687, "tls_process_certificate_request");
                        v16 = a0;
                        v17 = 80;
                        v18 = 360;
                    }
                }
            }
        }
    }
    else
    {
LABEL_9aa7c4:
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 2611, "tls_process_certificate_request");
        v16 = a0;
        v17 = 80;
        v18 = 524303;
    }
    sub_9a58a4(v16, v17, v18, 0);
    return 0;
}
