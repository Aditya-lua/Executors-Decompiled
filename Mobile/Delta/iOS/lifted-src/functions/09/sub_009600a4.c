/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9600a4..0x960220 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_964040;

int sub_9600a4(unsigned int *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v18;  // w8
    long long v19;  // x1
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    unsigned long v13;  // x8
    unsigned long long idx;  // x19
    unsigned int *v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // w0
    unsigned int v0;  // [bp-0x34]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (a0)
    {
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = v11;
        v5 = &v7;
        v6 = v12;
        v13 = *a0;
        idx = a0;
        if (!(unsigned int)v13 || v13 >> 7 & 1 && !(idx = sub_980dc8(), !idx))
        {
            v15 = a0;
            if (!*(long long *)(idx + 5424))
            {
                v16 = sub_9d0c08();
                *(unsigned long long *)(idx + 5424) = v16;
                if (!v16)
                    goto LABEL_960208;
                if (*(long long *)(idx + 5496) && !sub_9d0cb4(v16, &g_964040, v15))
                    goto LABEL_960208;
            }
            *(unsigned int *)(idx + 104) = 1;
            v17 = (unsigned int)sub_9d0488(idx + 5416);
            if (1 >= v17)
            {
                if (v17)
                {
                    if (v17 == 1)
                    {
                        v18 = 6;
                        goto LABEL_960204;
                    }
                }
                else
                {
                    *(unsigned int *)(idx + 104) = 1;
                    sub_a368c8();
                    sub_a369bc("ssl/ssl_lib.c", 2260, "ssl_start_async_job");
                    v19 = 405;
                    goto LABEL_9601f4;
                }
                goto LABEL_960194;
            }
            else if (v17 != 2)
            {
                if (v17 == 3)
                {
                    *(unsigned long long *)(idx + 5416) = 0;
                    a0 = v0;
                    goto LABEL_96020c;
                }
LABEL_960194:
                *(unsigned int *)(idx + 104) = 1;
                sub_a368c8();
                sub_a369bc("ssl/ssl_lib.c", 2273, "ssl_start_async_job");
                v19 = 786691;
LABEL_9601f4:
                sub_a36abc(20, v19, 0);
            }
            else
            {
                v18 = 5;
LABEL_960204:
                *(unsigned int *)(idx + 104) = v18;
            }
LABEL_960208:
            a0 = 0xffffffff;
        }
        else
        {
            a0 = 0;
        }
LABEL_96020c:
    }
    return (unsigned int)a0;
}
