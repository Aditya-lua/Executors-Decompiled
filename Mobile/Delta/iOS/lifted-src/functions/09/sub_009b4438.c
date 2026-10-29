/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b4438..0x9b46c0 (648 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9b4438(void* a0, long long a1)
{
    char v3;  // x0
    unsigned long long v4;  // x0
    long long v5;  // x1
    unsigned long long v6;  // x0
    long long v7;  // x0
    unsigned long long v8;  // x0
    long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!((char)(*(char *)(*(long long *)((long long)a0[24] + 216) + 80)) >> 3 & 1) && *(int *)(long long)a0[24] >= 772 && *(int *)(long long)a0[24] != 0x10000)
    {
        if ((int)a0[2984] == 3)
        {
            sub_a6c2e4((long long)a0[2992], "ssl/statem/statem_srvr.c", 2881);
            *(unsigned long long *)&a0[3000] = 32;
            v3 = sub_a6bf4c(32, "ssl/statem/statem_srvr.c", 2883);
            *(unsigned long long *)&a0[2992] = v3;
            if (!v3)
            {
                *(unsigned long long *)&a0[3000] = 0;
                sub_a368c8();
                v5 = 2885;
            }
            else if ((int)sub_aa8658(*(long long *)(long long)a0[8], v3, (long long)a0[3000], 0) >= 1 && sub_a6ec4c(a1, (long long)a0[2992], (long long)a0[3000], 1))
            {
                v4 = sub_9b2334(a0);
                if (!(unsigned int)v4)
                    return v4;
LABEL_9b45c0:
                v6 = sub_99b1e4(a0, a1, 0x4000, 0, 0);
                if (!(unsigned int)v6)
                    return v6;
                goto LABEL_9b45dc;
            }
            else
            {
                sub_a368c8();
                v5 = 2893;
            }
        }
        else
        {
            if (sub_c68d5c(a1, 0, 1))
                goto LABEL_9b45c0;
            sub_a368c8();
            v5 = 2903;
        }
    }
    else
    {
        if (sub_c6876c(a1, 1) && sub_9562c4(a0, a1) && sub_a6e970(a1))
        {
            if (!((char)(*(char *)(*(long long *)((long long)a0[24] + 216) + 80)) >> 1 & 1) || (v7 = sub_9696b0(a0, 1, &v0), sub_c6876c(a1, 2) && sub_c689f4(a1, 1) && sub_96b360(a0, a1, v0, sub_9696b0(a0, 1, &v0)) && sub_a6e970(a1)))
            {
                v8 = sub_9b211c(a0, sub_9b20cc(a0), a1);
                if (!(unsigned int)v8)
                    return v8;
LABEL_9b45dc:
                *(int *)&a0[3008] = (int)a0[3008] + 1;
                *(unsigned int *)&a0[920] = 1;
                return 1;
            }
            sub_a368c8();
            v5 = 2932;
        }
        else
        {
            sub_a368c8();
            v5 = 2920;
        }
    }
    sub_a369bc("ssl/statem/statem_srvr.c", v5, "tls_construct_certificate_request");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
