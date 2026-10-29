/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9987e4..0x998b7c (920 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_9987e4(unsigned long a0, unsigned long a1, int a2, unsigned int a3, unsigned int a4, char a5, long long a6, unsigned long a7, unsigned long a8, unsigned long a9, char a10, char a11, char a12, char a13, unsigned long a14, char a15, unsigned long a16, unsigned long a17)
{
    void* v1;  // x0
    void* v2;  // x19
    char iter;  // x28
    char v4;  // x23
    long long v5;  // x20
    long long v6;  // x21
    unsigned long node;  // x12
    char v8;  // w13
    unsigned long v9;  // x14
    char *v0;  // [bp-0x10]

    v0 = &a8;
    v1 = sub_a6bffc(0x1148, "ssl/record/methods/tls_common.c", 1267);
    *(unsigned long long *)a17 = 0;
    if (!v1)
        return 0xfffffffe;
    v2 = v1;
    iter = a13;
    *(unsigned int *)&v1[4172] = 0x4000;
    if (iter)
    {
        v4 = *(long long *)iter;
        if (*(long long *)iter)
        {
            do
            {
                if (!_strcmp(v4, "use_etm"))
                {
                    if (sub_a6fc2c(iter, v2 + 4272))
                        continue;
                    v5 = 316;
                    v6 = 1286;
                    goto LABEL_998b24;
                }
                else if (_strcmp(v4, "max_frag_len"))
                {
                    if (!_strcmp(v4, "max_early_data"))
                    {
                        if (sub_a6ffd0(iter, v2 + 4176))
                            continue;
                        v5 = 316;
                        v6 = 1300;
                        goto LABEL_998b24;
                    }
                    else if (!_strcmp(v4, "stream_mac"))
                    {
                        if (sub_a6fc2c(iter, v2 + 4276))
                            continue;
                        v5 = 316;
                        v6 = 1307;
                        goto LABEL_998b24;
                    }
                    else if (!_strcmp(v4, "tlstree"))
                    {
                        if (sub_a6fc2c(iter, v2 + 4280))
                            continue;
                        v5 = 316;
                        v6 = 1314;
                        goto LABEL_998b24;
                    }
                    else
                    {
                        v5 = 323;
                        v6 = 1318;
                        goto LABEL_998b24;
                    }
                }
                else
                {
                    if (!sub_a6ffcc(iter, v2 + 4172))
                    {
                        v5 = 316;
                        v6 = 1293;
                        goto LABEL_998b24;
                    }
                }
            } while ((v4 = *(long long *)(iter + 40), iter += 40, v4));
        }
    }
    *(unsigned long *)v2 = a0;
    *(unsigned long *)&v2[8] = a1;
    *(int *)&v2[20] = a2;
    *(unsigned int *)&v2[24] = a3;
    *(unsigned int *)&v2[28] = a4;
    *(unsigned int *)&v2[32] = a5;
    *(unsigned long *)&v2[4312] = a7;
    *(unsigned long *)&v2[40] = a8;
    *(unsigned int *)&v2[4104] = 0xffffffff;
    *(unsigned int *)&v2[4072] = 240;
    if (!a5)
    {
        *(unsigned int *)&v2[4308] = 1;
        if (a11)
        {
LABEL_9989ac:
            if (!sub_9d3d38(a11))
                goto LABEL_998b50;
        }
    }
    else if (a11)
    {
        goto LABEL_9989ac;
    }
    sub_9d5018((long long)v2[64]);
    *(unsigned long long *)&v2[64] = a11;
    if (!a10 || sub_9d3d38(a10))
    {
        *(unsigned long long *)&v2[56] = a10;
        if (!a12 || sub_9d3d38(a12))
        {
            *(unsigned long long *)&v2[72] = a12;
            *(unsigned long *)&v2[4368] = a16;
            if (a15)
            {
                node = a15 + 8;
                while (1)
                {
                    v8 = *(int *)(node - 8);
                    if (2 >= v8)
                    {
                        v9 = v2 + 4376;
                        if (v8 != 1 && !(v9 = v2 + 4384, v8 == 2))
                        {
                            if (!v8)
                                break;
                            else
                                goto LABEL_998a38;
                            goto LABEL_998a38;
                        }
                        goto LABEL_998a30;
                    }
                    v9 = v2 + 4392;
                    if (v8 == 3)
                    {
LABEL_998a30:
                        *(long long *)v9 = *(long long *)node;
                        goto LABEL_998a38;
                    }
                    else if (v8 != 4)
                    {
LABEL_998a38:
                        node += 16;
                    }
                    else
                    {
                        v9 = v2 + 4400;
                        goto LABEL_998a30;
                    }
                }
            }
            if (sub_998680(v2))
            {
                if (!((char)((char)v2[81]) >> 3 & 1) && 769 >= (int)v2[20] && !sub_a4fe08(a6, "NULL") && !sub_a4fe08(a6, "RC4"))
                    *(unsigned int *)&v2[4120] = 1;
                *(void* *)a17 = v2;
                return 1;
            }
            v5 = 316;
            v6 = 1374;
LABEL_998b24:
            sub_a368c8();
            sub_a369bc("ssl/record/methods/tls_common.c", v6, "tls_int_new_record_layer");
            sub_a36abc(20, v5, 0);
        }
    }
LABEL_998b50:
    sub_998bbc(v2);
    return 0xfffffffe;
}
