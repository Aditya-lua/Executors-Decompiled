/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae66cc..0xae69d8 (780 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae66cc_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
} st_ae66cc_0;

extern long long g_eb6850;
extern long long g_eb6c78;

unsigned long long sub_ae66cc(long long a0, long long a1, long long a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x21
    unsigned long long v12;  // x0
    unsigned long v13;  // x27
    unsigned long long v4;  // x20
    unsigned long long v5;  // x19
    unsigned long long v6;  // x0
    long long v7;  // x1
    long long v8;  // x1
    unsigned long long v9;  // x19
    unsigned long long v10;  // x22
    st_ae66cc_0 *v11;  // x28
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad69f8(a2, 0);
    if (!v2)
    {
LABEL_ae6960:
        return 0;
    }
    if (!*(long long *)(v2 + 16))
    {
        v3 = sub_ae4a14(a1, *(long long *)(v2 + 8));
        if (v3)
        {
            v9 = sub_9cde20(&g_eb6c78);
            if (v9)
            {
                if ((int)sub_ad69e4(v3) > 0)
                {
                    v10 = 0;
                    do
                    {
                        v11 = sub_ad69f8(v3, v10);
                        v12 = sub_ae6c10(v9, a1, v11);
                        if (0 < (int)v12)
                            continue;
                        if (v12 >> 31 & 1)
                            goto LABEL_ae68a4;
                        v13 = v11->field_8;
                        if (_strcmp(v13, "reasons"))
                        {
                            if (_strcmp(v13, "indirectCRL") && _strcmp(v13, "containsUserAttributeCerts") && _strcmp(v13, "containsAACerts") && _strcmp(v13, "containsSOAPublicKeyCerts"))
                                continue;
                            if (!sub_aef6fc(v11))
                                goto LABEL_ae68a4;
                        }
                        else if (!(!sub_ae6e1c(v9 + 8, v11->field_10)))
                        {
                            continue;
                        }
                    } while ((v10 = (unsigned int)v10 + 1, (int)sub_ad69e4(v3) > (int)v10));
                }
                sub_ae4a74(a1, v3);
                return v9;
            }
LABEL_ae68a4:
            sub_9cd960(v9, &g_eb6c78);
            sub_ae4a74(a1, v3);
            v3 = 0;
        }
LABEL_ae68c4:
        v4 = 0;
        goto LABEL_ae693c;
    }
    v3 = sub_aec7b0(a0, a1);
    if (!v3)
        goto LABEL_ae68c4;
    v4 = sub_ae75c8();
    if (v4)
    {
        if (sub_ad68a0(v4, v3))
        {
            v5 = sub_9cde20(&g_eb6c78);
            if (v5)
            {
                v6 = sub_9cde20(&g_eb6850);
                *(unsigned long long *)v5 = v6;
                if (v6)
                {
                    *(unsigned long long *)(v6 + 8) = v4;
                    *(unsigned int *)*(long long *)v5 = 0;
                    return v5;
                }
                sub_a368c8();
                v7 = 648;
            }
            else
            {
                sub_a368c8();
                v7 = 644;
            }
            sub_a369bc("crypto/x509/v3_crld.c", v7, "v2i_aaidp");
            sub_a36abc(0x22, 0x8000d, 0);
            v3 = 0;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_crld.c", 639, "v2i_aaidp");
            v8 = 524303;
LABEL_ae6934:
            sub_a36abc(0x22, v8, 0);
LABEL_ae693c:
            v5 = 0;
        }
        sub_9cd960(v5, &g_eb6c78);
        sub_ae75b0(v3);
        sub_ae75d4(v4);
        goto LABEL_ae6960;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_crld.c", 635, "v2i_aaidp");
        v8 = 524301;
        goto LABEL_ae6934;
    }
}
