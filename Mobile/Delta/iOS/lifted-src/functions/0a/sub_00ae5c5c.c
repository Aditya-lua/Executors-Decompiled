/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae5c5c..0xae5fd8 (892 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae5c5c_0 {
    char padding_0[8];
    long long field_8;
} st_ae5c5c_0;

extern long long g_eb6850;
extern long long g_eb6908;

unsigned long long sub_ae5c5c(long long a0, long long a1, long long a2)
{
    long long v4;  // x19
    long long v5;  // x22
    unsigned long long v14;  // x27
    long long *v15;  // x26
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    long long v18;  // x1
    long long v19;  // x1
    unsigned long long v6;  // x21
    unsigned long long v7;  // x26
    unsigned long long v8;  // x24
    st_ae5c5c_0 *v9;  // x0
    unsigned long long v10;  // x25
    unsigned long long v11;  // x28
    unsigned long long v12;  // x0
    unsigned long long v13;  // x25
    unsigned int v0;  // [bp-0x6c]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a2;
    v5 = a0;
    v6 = sub_ad69e4(a2);
    v7 = sub_ad61e0(0, v6);
    if (v7)
    {
        if ((int)v6 < 1)
            return v7;
        v8 = 0;
        v1 = v7;
        v0 = v6;
        while (1)
        {
            v9 = sub_ad69f8(v4, v8);
            if (v9[1].padding_0)
                break;
            v11 = sub_ae4a14(a1, v9->field_8);
            if (!v11)
                goto LABEL_ae5f8c;
            v13 = sub_9cde20(&g_eb6908);
            if (v13)
            {
                if ((int)sub_ad69e4(v11) >= 1)
                {
                    v14 = 0;
                    do
                    {
                        v15 = sub_ad69f8(v11, v14);
                        v16 = sub_ae6c10(v13, a1, v15);
                        if (0 < (int)v16)
                            continue;
                        if (v16 >> 31 & 1)
                            goto LABEL_ae5eb0;
                        if (!_strcmp(v15[1], "reasons"))
                        {
                            if (sub_ae6e1c(v13 + 8, v15[2]))
                                continue;
                        }
                        else
                        {
                            if (!_strcmp(v15[1], "CRLissuer") && (v17 = sub_ae702c(a1, v15[2]), *(unsigned long long *)(v13 + 16) = v17, !v17))
                                goto LABEL_ae5eb0;
                        }
                    } while ((v14 = (unsigned int)v14 + 1, (int)sub_ad69e4(v11) > (int)v14));
                }
                sub_ae4a74(a1, v11);
                v7 = v1;
                sub_ad68a0(v7, v13);
                v6 = v0;
            }
            else
            {
LABEL_ae5eb0:
                sub_9cd960(v13, &g_eb6908);
                sub_ae4a74(a1, v11);
                v10 = 0;
                v11 = 0;
                v7 = v1;
            }
LABEL_ae5e60:
            v8 = (unsigned int)v8 + 1;
            if ((unsigned int)v8 == (unsigned int)v6)
                return v7;
        }
        v10 = sub_aec7b0(v5, a1);
        v11 = sub_ae75c8();
        if (v11)
        {
            if (sub_ad68a0(v11, v10))
            {
                v10 = sub_9cde20(&g_eb6908);
                if (v10)
                {
                    sub_ad68a0(v7, v10);
                    v12 = sub_9cde20(&g_eb6850);
                    *(unsigned long long *)v10 = v12;
                    if (v12)
                    {
                        *(unsigned long long *)(v12 + 8) = v11;
                        *(unsigned int *)*(long long *)v10 = 0;
                        goto LABEL_ae5e60;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/x509/v3_crld.c", 289, "v2i_crld");
                        sub_a36abc(0x22, 0x8000d, 0);
LABEL_ae5f8c:
                        v10 = 0;
                    }
                }
                else
                {
                    sub_a368c8();
                    v18 = 284;
                }
LABEL_ae5f40:
                sub_a369bc("crypto/x509/v3_crld.c", v18, "v2i_crld");
                v19 = 524301;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_crld.c", 279, "v2i_crld");
                v19 = 524303;
            }
            sub_a36abc(0x22, v19, 0);
        }
        else
        {
            sub_a368c8();
            v18 = 275;
            goto LABEL_ae5f40;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_crld.c", 254, "v2i_crld");
        sub_a36abc(0x22, 0x8000f, 0);
        v10 = 0;
    }
}
