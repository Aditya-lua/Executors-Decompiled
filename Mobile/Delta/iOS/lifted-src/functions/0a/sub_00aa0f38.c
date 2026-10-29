/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa0f38..0xaa1298 (864 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa0f38_0 {
    char padding_0[24];
    long long field_18;
} st_aa0f38_0;

extern unsigned int g_7fffff;
extern long long g_aa0380;
extern long long g_aa26a4;
extern unsigned long long g_c7c2eb;

unsigned long long sub_aa0f38(unsigned long long a0, unsigned long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long v2;  // x23
    unsigned long long v3;  // x21
    unsigned long long v12;  // w0
    unsigned long long v13;  // x0
    unsigned long long v14;  // x23
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned int v17;  // w8
    long long v4;  // x22
    long long v5;  // x23
    unsigned long long v6;  // x0
    unsigned long long v7;  // x24
    unsigned long long v8;  // x25
    st_aa0f38_0 *v9;  // x27
    unsigned int v10;  // w0
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    if (a2)
        *(unsigned long long *)a2 = 0;
    if (a3)
        *(unsigned long long *)a3 = 0;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_kiss.c", 49, "PKCS12_parse");
        sub_a36abc(35, 105, 0);
        return 0;
    }
    if (!sub_aa14f8(a0))
    {
        if (v2 && *(char *)v2)
        {
LABEL_aa103c:
            if (!a3 && !a4)
                goto LABEL_aa106c;
            goto LABEL_aa1044;
        }
        v2 = 0;
        if (a3 || a4)
        {
LABEL_aa1044:
            v3 = sub_ad61b4();
            if (v3)
                goto LABEL_aa1070;
            v4 = 524303;
            v5 = 81;
        }
        else
        {
LABEL_aa106c:
            v3 = 0;
LABEL_aa1070:
            v6 = sub_aa01b8(a0);
            if (v6)
            {
                v7 = v6;
                if ((int)sub_ad69e4() >= 1)
                {
                    v8 = 0;
                    do
                    {
                        v9 = sub_ad69f8(v7, v8);
                        v10 = sub_a99eac(v9->field_18);
                        if (v10 != 26)
                        {
                            if (v10 != 21)
                                continue;
                            v11 = sub_aa002c(v9);
                            if (!v11)
                                goto LABEL_aa1128;
                        }
                        else
                        {
                            v11 = sub_aa00fc(v9, v2, 0xffffffff);
                            if (!v11)
                                goto LABEL_aa1128;
                        }
                        v12 = (unsigned int)sub_aa1298();
                        sub_ad6958(v11, &g_aa0380);
                        if (!v12)
                        {
LABEL_aa1128:
                            sub_ad6958(v7, &g_aa26a4);
                            goto LABEL_aa1138;
                        }
                    } while ((v8 = (unsigned int)v8 + 1, (int)sub_ad69e4(v7) > (int)v8));
                }
                sub_ad6958(v7, &g_aa26a4);
                v13 = sub_ad68b8(v3);
                if (v13)
                {
                    v14 = v13;
                    do
                    {
                        if (!a2 || !a3 || !*(long long *)a2 || *(long long *)a3)
                        {
LABEL_aa1230:
                            if (!a4)
                            {
                                sub_afc404(v14);
                            }
                            else
                            {
                                if (sub_af1bbc(a4, v14, 0))
                                    continue;
                            }
                        }
                        else
                        {
                            sub_a36c8c();
                            v15 = sub_af1ea4(v14, *(long long *)a2);
                            sub_a36cd4(v15, *(long long *)a2);
                            if (!(unsigned int)v15)
                                goto LABEL_aa1230;
                            *(unsigned long long *)a3 = v14;
                        }
                    } while ((v14 = sub_ad68b8(v3), v14));
                }
                sub_ad6020(v3);
                return 1;
            }
LABEL_aa1138:
            v16 = sub_a36000();
            if (!(v16 >> 31 & 1) && ((unsigned int)v16 & 0xff800000) == 0x3000000)
                goto LABEL_aa11a0;
            if (0 <= (int)v16)
                v17 = (unsigned int)&g_7fffff;
            else
                v17 = 0x7fffffff;
            if ((v17 & (unsigned int)v16) == 156)
                goto LABEL_aa11a0;
            v4 = 114;
            v5 = 90;
        }
    }
    else if (v2 && *(char *)v2)
    {
        if (sub_aa1c50(a0, v2, 0xffffffff))
            goto LABEL_aa103c;
        v3 = 0;
        v4 = 113;
        v5 = 71;
    }
    else
    {
        v2 = 0;
        if (sub_aa1c50(a0, 0, 0) || !(v2 = &g_c7c2eb, !sub_aa1c50(a0, &g_c7c2eb, 0)))
            goto LABEL_aa103c;
        v3 = 0;
        v4 = 113;
        v5 = 67;
    }
    sub_a368c8();
    sub_a369bc("crypto/pkcs12/p12_kiss.c", v5, "PKCS12_parse");
    sub_a36abc(35, v4, 0);
LABEL_aa11a0:
    v14 = 0;
    if (a2)
    {
        sub_a5a4c8(*(long long *)a2);
        *(unsigned long long *)a2 = 0;
    }
    if (a3)
    {
        sub_afc404(*(long long *)a3);
        *(unsigned long long *)a3 = 0;
    }
    sub_afc404(v14);
    sub_aded90(v3);
    return 0;
}
