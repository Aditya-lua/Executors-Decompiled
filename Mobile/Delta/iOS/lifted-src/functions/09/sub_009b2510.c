/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b2510..0x9b2814 (772 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9b2510(void* a0, unsigned int a1)
{
    unsigned long v2;  // x8
    unsigned int v3;  // w8
    unsigned long v12;  // 4112
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    long long v20;  // x0
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // 4112
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long v11;  // 4112
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(int *)(*(long long *)((long long)a0[24] + 216) + 80);
    if (v2 >> 3 & 1 || *(int *)(long long)a0[24] < 772 || *(int *)(long long)a0[24] == 0x10000)
    {
        v5 = (int)a0[172];
        if (31 >= (int)v5)
        {
            v6 = v5;
            if (28 >= (int)v5)
            {
                if (2 <= v5)
                {
                    v7 = arm64g_calculate_condition(35, v6, 28, 0);
                    v8 = 3;
                    v9 = (v7 & 1 ? v5 : 0x40000000);
                    v10 = (v7 & 1 ? 23 : 0);
                    v11 = arm64g_calculate_condition(3, v9, v10, 0);
                    if (!(v11 & 1))
                        goto LABEL_9b258a;
LABEL_9b2589:
                    v14 = arm64g_calculate_condition(v8, v9, v10, 0);
                    v15 = arm64g_calculate_condition(19, (v14 & 1 ? a1 : 0), v14 & 1, 0);
                    if (v15 & 1)
                        goto LABEL_9b26c4;
                    else
                        goto LABEL_9b2590;
                }
                else
                {
                    v12 = arm64g_calculate_condition(35, v6, 28, 0);
                    v8 = 0;
                    v9 = (v12 & 1 ? v5 : 0x40000000);
                    v10 = (v12 & 1 ? 23 : 0);
                    v13 = arm64g_calculate_condition(0, v9, v10, 0);
                    if (v13 & 1)
                        goto LABEL_9b2589;
LABEL_9b258a:
                    v16 = arm64g_calculate_condition(v8, v9, v10, 0);
                    v17 = arm64g_calculate_condition(16, (v16 & 1 ? a1 : 0), v16 & 1, 0);
                    if (v17 & 1)
                        goto LABEL_9b26c4;
                    else
                        goto LABEL_9b2590;
                }
                if (!(v15 & 1))
                    goto LABEL_9b2590;
                goto LABEL_9b26c4;
            }
            if (v5 != 29)
            {
                if (v5 != 30)
                    goto LABEL_9b26c4;
                if (a1 == 16)
                    goto LABEL_9b271c;
                goto LABEL_9b26c4;
            }
            switch (a1)
            {
            case 16:
                if ((int)a0[920])
                {
                    if ((int)a0[72] != 0x300)
                        goto LABEL_9b27d0;
                    if (!~((int)a0[2384] & 3))
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 229, "ossl_statem_server_read_transition");
                        sub_9a58a4(a0, 40, 199, 0);
                        return 0;
                    }
                }
LABEL_9b271c:
                v4 = 32;
                break;
            case 11:
                if ((int)a0[920])
                    goto LABEL_9b27b0;
                goto LABEL_9b26c4;
            default:
LABEL_9b26c4:
                if (a1 == 0x101)
                    goto LABEL_9b26cc;
                goto LABEL_9b27d0;
            }
        }
        else
        {
            switch (v5)
            {
            case 34:
LABEL_9b26bc:
                if (a1 == 20)
                    goto LABEL_9b27c0;
                goto LABEL_9b26c4;
            case 32:
                if (!*(long long *)((long long)a0[0x900] + 696) && !*(long long *)((long long)a0[0x900] + 704) || (int)a0[196])
                    goto LABEL_9b2694;
                if (a1 == 15)
                    goto LABEL_9b2774;
                goto LABEL_9b26c4;
            case 35:
                if (!(int)a0[1204])
                    goto LABEL_9b26bc;
                if (a1 != 67)
                    goto LABEL_9b26c4;
                v4 = 0x22;
                break;
            case 33: case 40:
LABEL_9b2694:
                if (a1 != 0x101)
                    goto LABEL_9b27d0;
                v4 = 35;
                break;
            default:
LABEL_9b26c4:
                if (a1 != 0x101)
                    goto LABEL_9b27d0;
LABEL_9b26cc:
                if (!(v2 >> 3 & 1))
                    goto LABEL_9b27d0;
                *(unsigned long long *)&a0[264] = 0;
                *(unsigned int *)&a0[104] = 3;
                v20 = sub_95f850();
                sub_9d3d58(v20, 15);
                sub_9d3d74(v20, 9);
                return 0;
            }
        }
    }
    else if (39 < (int)a0[172])
    {
        switch (v3)
        {
        case 40: case 53:
LABEL_9b27a0:
            if (!(int)a0[920])
                goto LABEL_9b27b8;
            if (a1 != 11)
                goto LABEL_9b27d0;
LABEL_9b27b0:
            v4 = 30;
            break;
        case 50:
            if ((int)a0[2256] == 1)
            {
                if (a1 != 1)
                    goto LABEL_9b27d0;
LABEL_9b2590:
                v4 = 22;
                break;
            }
            else
            {
                if ((int)a0[2840] != 2 || (char)((char)a0[353]) >> 5 & 1)
                    goto LABEL_9b27a0;
                if (a1 != 5)
                    goto LABEL_9b27d0;
                v4 = 53;
                break;
            }
        default:
LABEL_9b27d0:
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 340, "ossl_statem_server_read_transition");
            sub_9a58a4(a0, 10, 244, 0);
            return 0;
        }
    }
    else if ((unsigned int)((int)a0[172] - 30) >= 2)
    {
        switch (v3)
        {
        case 1:
            if ((int)a0[240] == 11)
                goto LABEL_9b27d0;
            if (a1 == 11 && (int)a0[2984] == 4)
                goto LABEL_9b27b0;
            if (a1 != 24)
                goto LABEL_9b27d0;
            if ((char)((char)a0[353]) >> 5 & 1)
                goto LABEL_9b27d0;
            v4 = 48;
            break;
        case 33:
LABEL_9b27b8:
            if (a1 != 20)
                goto LABEL_9b27d0;
LABEL_9b27c0:
            v4 = 36;
            break;
        default:
LABEL_9b27d0:
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 340, "ossl_statem_server_read_transition");
            sub_9a58a4(a0, 10, 244, 0);
            return 0;
        }
    }
    else
    {
        if (!*(long long *)((long long)a0[0x900] + 696) && !*(long long *)((long long)a0[0x900] + 704))
            goto LABEL_9b27b8;
        if (a1 != 15)
            goto LABEL_9b27d0;
LABEL_9b2774:
        v4 = 33;
    }
    *(unsigned int *)&a0[172] = v4;
    return 1;
}
