/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaecd38..0xaeceb8 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char sub_aecd38(char *a0, long long a1, char a2)
{
    long long v2;  // x0
    long long v3;  // x23
    unsigned long long v4;  // x24
    long long v5;  // x19
    unsigned long long v6;  // x0
    unsigned long long v7;  // x1
    long long v8;  // x0
    char v9;  // x22
    char v10;  // x25
    long long v11;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
LABEL_aece20:
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_san.c", 431, "copy_email");
        sub_a36abc(0x22, 125, 0);
        return 0;
    }
    if (*a0 & 1)
        return 1;
    if (*(long long *)&a0[16])
    {
        v2 = sub_ab1c50(*(long long *)&a0[16]);
    }
    else
    {
        if (!*(long long *)&a0[24])
            goto LABEL_aece20;
        v2 = sub_975ff4(*(long long *)&a0[24]);
    }
    v3 = v2;
    v4 = 0xffffffff;
    v5 = 524301;
    while (1)
    {
        v6 = sub_af8d64(v3, 48, v4);
        if (v6 >> 31 & 1)
            break;
        v4 = v6;
        v7 = v4;
        v8 = sub_af8cf4(v3, v7);
        v9 = sub_9c7864(sub_9f2aec(v8, v7));
        if (a2)
        {
            sub_af8df4(v3, v4);
            sub_afa344(v8);
            v4 = (unsigned int)v4 - 1;
        }
        if (!v9)
        {
            v10 = 0;
LABEL_aece5c:
            v11 = 449;
LABEL_aece60:
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_san.c", v11, "copy_email");
            sub_a36abc(0x22, v5, 0);
            sub_ae75b0(v10);
            sub_9cf0f4(v9);
            return 0;
        }
        v10 = sub_ae75a4();
        if (!v10)
            goto LABEL_aece5c;
        *(unsigned long long *)(v10 + 8) = v9;
        *(unsigned int *)v10 = 1;
        if (!sub_ad68a0(a1, v10))
        {
            v9 = 0;
            v5 = 524303;
            v11 = 456;
            goto LABEL_aece60;
        }
    }
    return 1;
}
