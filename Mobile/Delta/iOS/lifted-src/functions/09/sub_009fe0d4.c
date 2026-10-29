/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fe0d4..0x9fe338 (612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fe0d4_0 {
    char padding_0[176];
    long long field_b0;
} st_9fe0d4_0;


unsigned long long sub_9fe0d4(st_9fe0d4_0 *a0, unsigned int *a1)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // x0
    unsigned long long v12;  // x0
    unsigned long long v4;  // x20
    long long v5;  // x22
    unsigned long long v6;  // x0
    unsigned long long v7;  // x23
    long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned int v10;  // w8
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9fec10();
    *a1 = 0;
    if (!*(long long *)&a0->padding_0[8] || !*(long long *)&a0->padding_0[24])
    {
        *a1 = 9;
    }
    else if (!v2)
    {
        if ((int)sub_9e46a8() > 0x8000)
        {
            sub_a368c8();
            sub_a369bc("crypto/dh/dh_check.c", 171, "DH_check");
            sub_a36abc(5, 103, 0);
            *a1 = 0x101;
            return 0;
        }
        v3 = sub_9fdd70(a0, a1);
        if (!(unsigned int)v3)
            return v3;
        v4 = sub_9dddcc(a0->field_b0);
        if (v4)
        {
            sub_9de064(v4);
            v5 = sub_9de208(v4);
            v6 = sub_9de208(v4);
            if (v6)
            {
                if (*(long long *)&a0->padding_0[16])
                {
                    v7 = v6;
                    if ((int)sub_9e53a8(*(long long *)&a0->padding_0[8]) < 1)
                    {
                        v10 = 32;
LABEL_9fe280:
                        *a1 = *a1 | v10;
                        goto LABEL_9fe28c;
                    }
                    v8 = sub_9e4624();
                    if ((int)sub_9e5528(*(long long *)&a0->padding_0[24], v8) < 1 || !(sub_9e5528(*(long long *)&a0->padding_0[24], *(long long *)&a0->padding_0[8]) >> 31 & 1))
                    {
LABEL_9fe200:
                        *a1 = *a1 | 8;
LABEL_9fe20c:
                        v9 = sub_9e892c(*(long long *)&a0->padding_0[16], v4, 0);
                        if (!(v9 >> 31 & 1))
                        {
                            if (!(unsigned int)v9)
                                *a1 = *a1 | 16;
                            if (sub_9de520(v5, v7, *(long long *)&a0->padding_0[8], *(long long *)&a0->padding_0[16], v4))
                            {
                                if (!sub_9e5b90(v7))
                                    *a1 = *a1 | 32;
                                if (*(long long *)&a0->padding_0[32] && sub_9e5528(*(long long *)&a0->padding_0[32], v5))
                                {
                                    v10 = 64;
                                    goto LABEL_9fe280;
                                }
                                goto LABEL_9fe28c;
                            }
                        }
                    }
                    else if (sub_9dea6c(v5, *(long long *)&a0->padding_0[24], *(long long *)&a0->padding_0[16], *(long long *)&a0->padding_0[8], v4))
                    {
                        if (sub_9e5b90(v5))
                            goto LABEL_9fe20c;
                        goto LABEL_9fe200;
                    }
                }
                else
                {
LABEL_9fe28c:
                    v11 = sub_9e892c(*(long long *)&a0->padding_0[8], v4, 0);
                    if (!(v11 >> 31 & 1))
                    {
                        if (!(unsigned int)v11)
                        {
                            *a1 = *a1 | 1;
                            sub_9de17c(v4);
                            sub_9dded4(v4);
                            return 1;
                        }
                        else if (*(long long *)&a0->padding_0[16])
                        {
                            sub_9de17c(v4);
                            sub_9dded4(v4);
                            return 1;
                        }
                        else if (sub_9ea50c(v5, *(long long *)&a0->padding_0[8]))
                        {
                            v12 = sub_9e892c(v5, v4, 0);
                            if (!(v12 >> 31 & 1))
                            {
                                if (!(unsigned int)v12)
                                {
                                    *a1 = *a1 | 2;
                                    sub_9de17c(v4);
                                    sub_9dded4(v4);
                                    return 1;
                                }
                                sub_9de17c(v4);
                                sub_9dded4(v4);
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        sub_9de17c(v4);
        sub_9dded4(v4);
        return 0;
    }
    return 1;
}
