/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9973a0..0x9976a8 (776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9973a0(void* a0, char a1, char a2, unsigned long long a3, unsigned long long a4, char *a5)
{
    unsigned long long v13;  // x28
    unsigned long long v14;  // x27
    unsigned long long v23;  // x30
    char v24;  // x21
    unsigned long v25;  // x23
    long long v26;  // x8
    unsigned long long v27;  // x25
    char v28;  // x1
    unsigned long long v29;  // x9
    char v30;  // x24
    char v31;  // x22
    unsigned long v32;  // x9
    unsigned long long v15;  // x26
    char v33;  // x9
    unsigned long v34;  // x25
    char v35;  // x10
    unsigned long long v36;  // x26
    char v37;  // x22
    char v38;  // w0
    char v39;  // x9
    unsigned long long v40;  // x8
    char v41;  // x0
    unsigned long long v16;  // x25
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
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

    if (!a1)
        return 0xffffffff;
    v0 = v13;
    v1 = v14;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = &v12;
    v11 = v23;
    v24 = a1;
    v25 = (long long)a0[1728];
    v26 = (long long)a0[1696];
    v27 = v26 & 7 ^ 3;
    if ((unsigned int)a3)
    {
        v28 = (long long)a0[0xff0];
        if (!v28)
        {
            sub_c64f18(a0);
            return 0xfffffffe;
        }
    }
    else
    {
        if (v25)
        {
            v29 = (long long)a0[1720];
        }
        else
        {
            *(unsigned long long *)&a0[1720] = v27;
            v29 = v27;
        }
        v28 = v26 + v29;
        *(unsigned long long *)&a0[0xff0] = v28;
        *(unsigned long long *)&a0[0xff8] = 0;
        if (!v28)
        {
            sub_c64f18(a0);
            return 0xfffffffe;
        }
    }
    v30 = (long long)a0[0xff8];
    v31 = v26 + v27;
    if (a4 == 1 && v28 != v31)
    {
        _memmove(v31);
        *(unsigned long long *)&a0[0xff0] = v31;
        *(unsigned long long *)&a0[1720] = v30 + v27;
    }
    if ((int)a0[16])
    {
        if ((unsigned int)a3 && !v25)
            return 0xffffffff;
        if (v25 < v24)
            v32 = v25;
        else
            v32 = v24;
        if (v25)
            v24 = v32;
    }
    if (v24 > v25)
    {
        v33 = (long long)a0[1712] - (long long)a0[1720];
        if (v24 > v33)
        {
            sub_a368c8();
            sub_a369bc("ssl/record/methods/tls_common.c", 378, "tls_default_read_n");
            sub_996e84(a0, 80, 0xc0103, 0);
            return 0xfffffffe;
        }
        v34 = a0 + 0xff0;
        if (a2 < v24)
            v35 = v24;
        else
            v35 = a2;
        if (v35 < v33)
            v33 = v35;
        if (!(int)a0[4108] && !(int)a0[16])
            v36 = v24;
        else
            v36 = v33;
        while (1)
        {
            v37 = (long long)a0[56];
            if (v37)
            {
                *(unsigned int *)___error() = 0;
                goto LABEL_99756c;
            }
            v37 = (long long)a0[64];
            *(unsigned int *)___error() = 0;
            if (v37)
            {
LABEL_99756c:
                v38 = sub_9d3d84(v37, v31 + v30 + v25, v36 - v25);
                if (0 < v38)
                {
                    v25 += v38;
                    if (v24 < v25)
                        v39 = v24;
                    else
                        v39 = v25;
                    if ((int)a0[16])
                        v24 = v39;
                    v40 = v25 - v24;
                    if (v24 > v25)
                        continue;
                    goto LABEL_9975ac;
                }
                if (sub_9d3d68(v37, 8))
                {
                    v41 = (long long)a0[56];
                    if (!v41)
                        goto LABEL_99764c;
                    sub_9d3c28(v41);
                    *(unsigned long long *)&a0[56] = 0;
                    v40 = v25 - v24;
                    if (v25 >= v24)
                    {
LABEL_9975ac:
                        *(long long *)&a0[1720] = (long long)a0[1720] + v24;
                        *(unsigned long long *)&a0[1728] = v40;
                        *(long long *)&a0[0xff8] = (long long)a0[0xff8] + v24;
                        break;
                    }
                }
                else
                {
                    if (sub_9d46fc(v37, 2, 0, 0))
                        v41 = 0xfffffffd;
                    else
                        v41 = 0xfffffffe;
LABEL_99764c:
                    *(unsigned long *)&a0[1728] = v25;
                    if (!((char)((char)a0[88]) >> 4 & 1))
                    {
                        return v41;
                    }
                    else if ((int)a0[16])
                    {
                        return v41;
                    }
                    else if (v30 != -v25)
                    {
                        return v41;
                    }
                    else
                    {
                        if ((char)((char)a0[80]) >> 1 & 1)
                            sub_a66ec0((long long)a0[1696], (long long)a0[1712]);
                        sub_a6c2e4((long long)a0[1696], "ssl/record/methods/tls_common.c", 284);
                        *(unsigned long long *)&a0[1696] = 0;
                        *(unsigned long long *)v34 = 0;
                        *(unsigned long long *)(v34 + 8) = 0;
                        return v41;
                    }
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/record/methods/tls_common.c", 427, "tls_default_read_n");
                sub_996e84(a0, 80, 211, 0);
                v41 = 0xfffffffe;
                goto LABEL_99764c;
            }
        }
    }
    else
    {
        *(long long *)&a0[0xff8] = (long long)a0[0xff8] + v24;
        *(unsigned long *)&a0[1728] = v25 - v24;
        *(long long *)&a0[1720] = (long long)a0[1720] + v24;
    }
    *(unsigned long long *)a5 = v24;
    return 1;
}
