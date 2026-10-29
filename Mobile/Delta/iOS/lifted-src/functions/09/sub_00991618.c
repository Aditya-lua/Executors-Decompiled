/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991618..0x991a18 (1024 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_d286b6;
extern long long g_d286c6;
extern char g_10002b0;

unsigned long long sub_991618(long long a0, long long a1, void* a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long long v14;  // x0
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x21
    long long v18;  // x1
    unsigned long long v19;  // x22
    long long v20;  // x1
    long long v21;  // x1
    unsigned long long v0;  // [bp-0x168]
    char v1;  // [bp-0x160]
    unsigned long long v2;  // [bp-0x128]
    uint128_t v3;  // [bp-0x120]
    uint128_t v4;  // [bp-0x110]
    uint128_t v5;  // [bp-0x100]
    uint128_t v6;  // [bp-0xf0]
    uint128_t v7;  // [bp-0xe0]
    unsigned long long v8;  // [bp-0xd8]
    unsigned long long v9;  // [bp-0xd0]
    char v10;  // [bp-0xc8]
    unsigned long v11;  // [bp-0x48]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    v2 = 0;
    v0 = 0;
    if (*(char *)a2 != 4 || !(int)a2[4] || 16 > (unsigned long long)(long long)a2[72] || !a4 || !a3 || !(long long)a2[80] || 21 <= *(char *)a3)
    {
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_wire_pkt.c", 883, "ossl_quic_calculate_retry_integrity_tag");
        goto LABEL_991690;
    }
    else
    {
        v6 = (int128_t)a2[48];
        v7 = (int128_t)a2[64];
        v4 = (int128_t)a2[16];
        v5 = (int128_t)a2[32];
        v3 = *(int128_t *)a2;
        v8 = 0;
        v9 = (long long)a2[80];
        if (sub_c68800(&v1, &v10, 128, 0))
        {
            if (!sub_c68d5c(&v1, *(char *)a3, 1) || !sub_a6ebd4(&v1, a3 + 1, *(char *)a3))
            {
                sub_a368c8();
                v21 = 907;
                goto LABEL_9917a0;
            }
            if (!sub_c639ec(&v1, *(char *)((void*)&v3 + 8), &v3, 0))
                goto LABEL_9917c0;
            if (sub_c68eb8(&v1, &v0))
            {
                v14 = sub_a4e104(a0, "AES-128-GCM", a1);
                if (v14)
                {
                    v15 = v14;
                    v16 = sub_a4bc70();
                    if (!v16)
                    {
                        sub_a368c8();
                        v18 = 929;
                    }
                    else if (!sub_a4c694(v16, v15, 0, &g_d286b6, &g_d286c6, 1))
                    {
                        sub_a368c8();
                        v18 = 935;
                    }
                    else if (sub_a4c6a0(v16, 0, (char *)&v2 + 4, &v10, (unsigned int)v0) != 1)
                    {
                        sub_a368c8();
                        v18 = 941;
                    }
                    else if (sub_a4c6a0(v16, 0, (char *)&v2 + 4, (long long)a2[80], (int)a2[72] - 16) != 1)
                    {
                        sub_a368c8();
                        v18 = 949;
                    }
                    else if (sub_a4ca14(v16, 0, &v2) != 1)
                    {
                        sub_a368c8();
                        v18 = 955;
                    }
                    else if (sub_a4d5dc(v16, 16, 16, a4) == 1)
                    {
                        v17 = 1;
                        goto LABEL_991a0c;
                    }
                    else
                    {
                        sub_a368c8();
                        v18 = 963;
                    }
                    sub_a369bc("ssl/quic/quic_wire_pkt.c", v18, "ossl_quic_calculate_retry_integrity_tag");
                    sub_a36abc(20, 0x80006, 0);
                    v17 = 0;
                    v19 = 0;
LABEL_991a0c:
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/quic/quic_wire_pkt.c", 924, "ossl_quic_calculate_retry_integrity_tag");
                    v20 = 524294;
LABEL_9917b8:
                    sub_a36abc(20, v20, 0);
LABEL_9917c0:
                    v15 = 0;
                    v16 = 0;
                    v17 = 0;
                    v19 = 0;
                }
            }
            else
            {
                sub_a368c8();
                v21 = 917;
LABEL_9917a0:
                sub_a369bc("ssl/quic/quic_wire_pkt.c", v21, "ossl_quic_calculate_retry_integrity_tag");
                v20 = 524303;
                goto LABEL_9917b8;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/quic/quic_wire_pkt.c", 897, "ossl_quic_calculate_retry_integrity_tag");
LABEL_991690:
            sub_a36abc(20);
            v15 = 0;
            v16 = 0;
            v17 = 0;
            v19 = 1;
        }
    }
    sub_a4bbe4(v15);
    sub_a4bca0(v16);
    if (!(v19 & 1))
        sub_a6eaf8(&v1);
    if (*(long long *)&g_10002b0 == v11)
        return v17;
    ___stack_chk_fail();
}
