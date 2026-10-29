/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ab254..0x9ab63c (1000 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9ab254(void* a0)
{
    long long v4;  // x2
    long long v13;  // x1
    long long v15;  // x20
    unsigned int v16;  // x0
    unsigned int v17;  // x0
    unsigned long long *v18;  // x8
    unsigned long long v19;  // x0
    long long v5;  // x1
    unsigned int v6;  // x0
    unsigned long long *v7;  // x8
    unsigned long long *v8;  // x8
    void* v9;  // x0
    long long v10;  // x1
    long long v11;  // x2
    long long v12;  // x2
    char v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if ((char)a0[2898] != 2)
    {
        if ((int)a0[104] == 8)
            *(unsigned int *)&a0[104] = 1;
        sub_a36c8c();
        if ((int)sub_958e4c(a0, *(long long *)((long long)a0[0x900] + 712)) > 0)
        {
            sub_a36cd4();
            if ((int)a0[104] == 8)
                return 4;
            goto LABEL_9ab3a8;
        }
        if ((int)a0[2384])
        {
            sub_a368c8(sub_a36e70());
            v4 = "tls_post_process_server_certificate";
            v5 = 2125;
            goto LABEL_9ab388;
        }
        else
        {
            sub_a36cd4();
LABEL_9ab3a8:
            v15 = sub_ad69f8(*(long long *)((long long)a0[0x900] + 712), 0);
            v16 = sub_af1e94(v15, 0);
            if (!v16 || sub_a5a164())
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_clnt.c", 2142, "tls_post_process_server_certificate");
                v9 = a0;
                v10 = 80;
                v11 = 239;
            }
            else
            {
                v17 = sub_959f90(v16, &v0, (long long)a0[8]);
                if (v17)
                {
                    if (!((char)(*(char *)(*(long long *)((long long)a0[24] + 216) + 80)) >> 3 & 1) && *(int *)(long long)a0[24] >= 772 && *(int *)(long long)a0[24] != 0x10000 || *(int *)((long long)a0[0x300] + 32) & *(int *)(v17 + 4))
                    {
                        if (sub_af3b1c(v15))
                        {
                            sub_afc404(*(long long *)((long long)a0[0x900] + 704));
                            v18 = (long long)a0[0x900];
                            v18[88] = v15;
                            v18[90] = (long long)a0[2456];
                            sub_a5a4c8(v18[87]);
                            *(unsigned long long *)((long long)a0[0x900] + 696) = 0;
                            goto LABEL_9ab50c;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/statem/statem_clnt.c", 2165, "tls_post_process_server_certificate");
                            v9 = a0;
                            v10 = 80;
                            v11 = 786691;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 2159, "tls_post_process_server_certificate");
                        v9 = a0;
                        v10 = 47;
                        v11 = 383;
                    }
                }
                else
                {
                    sub_a368c8();
                    v12 = "tls_post_process_server_certificate";
                    v13 = 2149;
LABEL_9ab5b0:
                    sub_a369bc("ssl/statem/statem_clnt.c", v13, v12);
                    v9 = a0;
                    v10 = 47;
                    v11 = 247;
                }
            }
        }
    }
    else if (*(long long *)((long long)a0[0x900] + 696))
    {
        if ((int)a0[104] == 8)
            *(unsigned int *)&a0[104] = 1;
        sub_a36c8c();
        if ((int)sub_958b78(a0, *(long long *)((long long)a0[0x900] + 696)) > 0)
        {
            sub_a36cd4();
            if ((int)a0[104] == 8)
                return 4;
            goto LABEL_9ab488;
        }
        else if ((int)a0[2384])
        {
            sub_a368c8(sub_a36e70());
            v4 = "tls_post_process_server_rpk";
            v5 = 1947;
LABEL_9ab388:
            sub_a369bc("ssl/statem/statem_clnt.c", v5, v4);
            v10 = sub_9b0df0((int)a0[2456]);
            v9 = a0;
            v11 = 134;
        }
        else
        {
            sub_a36cd4();
LABEL_9ab488:
            v6 = sub_959f90(*(long long *)((long long)a0[0x900] + 696), &v0, (long long)a0[8]);
            if (!v6)
            {
                sub_a368c8();
                v12 = "tls_post_process_server_rpk";
                v13 = 1958;
                goto LABEL_9ab5b0;
            }
            if (!((char)(*(char *)(*(long long *)((long long)a0[24] + 216) + 80)) >> 3 & 1) && *(int *)(long long)a0[24] >= 772 && *(int *)(long long)a0[24] != 0x10000 || *(int *)((long long)a0[0x300] + 32) & *(int *)(v6 + 4))
            {
                sub_afc404(*(long long *)((long long)a0[0x900] + 704));
                v7 = (long long)a0[0x900];
                v7[88] = 0;
                sub_ad6958(v7[89], sub_afc404);
                v8 = (long long)a0[0x900];
                v8[89] = 0;
                v8[90] = (long long)a0[2456];
LABEL_9ab50c:
                if ((char)(*(char *)(*(long long *)((long long)a0[24] + 216) + 80)) >> 3 & 1 || *(int *)(long long)a0[24] < 772 || *(int *)(long long)a0[24] == 0x10000)
                    return 2;
                v19 = sub_962d78(a0, a0 + 2184, 64, a0 + 2248);
                if (!(unsigned int)v19)
                    return v19;
                return 2;
            }
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_clnt.c", 1969, "tls_post_process_server_rpk");
            v9 = a0;
            v10 = 47;
            v11 = 351;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 1935, "tls_post_process_server_rpk");
        v9 = a0;
        v10 = 47;
        v11 = 350;
    }
    sub_9a58a4(v9, v10, v11, 0);
    return 0;
}
