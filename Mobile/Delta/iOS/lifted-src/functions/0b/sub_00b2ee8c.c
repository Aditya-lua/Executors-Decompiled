/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2ee8c..0xb2f17c (752 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;

long long sub_b2ee8c(long long a0, unsigned int a1, long long a2, unsigned long n, long long a4, long long a5, long long a6, long long a7, unsigned long a8, unsigned long a9, unsigned int a10, unsigned long long a11, unsigned long a12, unsigned int a13)
{
    unsigned long v12;  // x20
    unsigned long v13;  // x19
    char *v14;  // x27
    unsigned long long v15;  // x20
    unsigned long v16;  // x8
    unsigned long v17;  // x9
    unsigned long long v18;  // x8
    unsigned long i;  // x21
    unsigned long v20;  // x27
    unsigned long v21;  // x27
    unsigned long long v0;  // [bp-0xb8]
    char *v1;  // [bp-0xa8]
    unsigned long long v2;  // [bp-0xa0]
    unsigned long v3;  // [bp-0x98]
    unsigned int v4;  // [bp-0x8c]
    unsigned long v5;  // [bp-0x88]
    unsigned long v6;  // [bp-0x80]
    unsigned int v7;  // [bp-0x78]
    unsigned int v8;  // [bp-0x68]
    char v9;  // [bp-0x61]
    char *v10;  // [bp-0x10]
    unsigned int v11;  // [bp+0x14]

    v10 = &a8;
    v9 = 0;
    if (n)
        _memcpy(a8, a2, n);
    if (a12)
    {
        if ((int)a13 < 0)
            v12 = a13 + 7;
        else
            v12 = a13;
        v8 = (unsigned int)&g_1000000;
        v13 = sub_a57f5c();
        if (v13 && (a1 != 1 || sub_a58164(v13, a8, n)) && !(v14 = (char *)&v8 - ((int)((unsigned int)v12) >> 3) + 4, v15 = (long long)(v12 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v12, 61) & 0xe00000001fffffff & 0x1fffffff, !sub_a58164(v13, v14, v15) || !sub_a58164(v13, a4, a5) || (v7 = v11, v11 && !sub_a58164(v13, &v9, 1) || !sub_a58164(v13, a6, a7) || a10 && !sub_a58164(v13, &a10, 4) || (v6 = a9, !sub_a58170(v13, a8, 0, a9)))))
        {
            v2 = a11;
            _memcpy();
            sub_a57f0c(v13);
            v16 = v6;
            v17 = a12 - v16;
            if (a12 <= v16)
                goto LABEL_b2f148;
            v1 = v14;
            v18 = 2;
            v0 = v15;
            i = v6;
            do
            {
                v3 = v17;
                v5 = i;
                v4 = v18;
                v8 = (((((v18 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v18 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v18 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v18 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                v13 = sub_a57f5c(a0);
                if (!v13 || (v20 = v6, a1 == 1 && !sub_a58164(v13, a8, v20) || !sub_a58164(v13, v1, v15) || !sub_a58164(v13, a4, a5) || v7 && !sub_a58164(v13, &v9, 1) || !sub_a58164(v13, a6, a7) || a10 && !sub_a58164(v13, &a10, 4) || !sub_a58170(v13, a8, 0, v20)))
                    goto LABEL_b2f140;
                _memcpy();
                i = v5 + v20;
                sub_a57f0c(v13);
                v13 = 0;
                v18 = v4 + 1;
                v21 = 1;
                v17 = v3 - v20;
                v15 = v0;
            } while (i < a12);
            goto LABEL_b2f140;
        }
        else
        {
LABEL_b2f140:
            v21 = 0;
        }
    }
    else
    {
LABEL_b2f148:
        v13 = 0;
        v21 = 1;
    }
    sub_a57f0c(v13);
    return v21;
}
