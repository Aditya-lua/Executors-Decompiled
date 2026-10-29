/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae98d8..0xae9b88 (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae98d8_1 {
    struct st_ae98d8_0 *field_0;
    struct st_ae98d8_0 *field_8;
} st_ae98d8_1;

typedef struct st_ae98d8_2 {
    unsigned long long field_0;
    struct st_ae98d8_0 *field_8;
    struct st_ae98d8_0 *field_10;
} st_ae98d8_2;

typedef struct st_ae98d8_0 {
    struct st_ae98d8_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_ae98d8_1 *field_8;
} st_ae98d8_0;

extern long long g_aef19c;

st_ae98d8_0 * sub_ae98d8(unsigned long a0, long long a1, long long a2)
{
    long long v11;  // x19
    st_ae98d8_0 *v12;  // x21
    st_ae98d8_0 **v22;  // x8
    long long v23;  // x1
    st_ae98d8_2 *v13;  // x22
    st_ae98d8_0 *v14;  // x8
    st_ae98d8_0 *v15;  // x0
    st_ae98d8_0 *v16;  // x23
    st_ae98d8_0 *v17;  // x22
    st_ae98d8_0 *v18;  // x22
    long long v19;  // x1
    st_ae98d8_0 *v20;  // x0
    unsigned long long v0;  // [bp-0x90]
    unsigned long v1;  // [bp-0x88]
    unsigned long long v2;  // [bp-0x80]
    st_ae98d8_0 *v3;  // [bp-0x78]
    unsigned long long v4;  // [bp-0x70]
    st_ae98d8_0 *v5;  // [bp-0x68]
    st_ae98d8_0 *v6;  // [bp-0x58]
    st_ae98d8_0 *v7;  // [bp-0x50]
    st_ae98d8_0 *v8;  // [bp-0x48]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = 0;
    v6 = 0;
    v7 = 0;
    v11 = sub_aef8d8(a2);
    if ((int)sub_ad69e4(v11) >= 1)
    {
        v12 = 0;
        do
        {
            v13 = sub_ad69f8(v11, v12);
            v14 = v13->field_8;
            if (v14)
            {
                if ((char)v14->field_0 == 64)
                {
                    v15 = sub_ae4a14(a1, (char *)&v14->field_0 + 1);
                    if (v15)
                    {
                        v16 = v15;
                        v17 = 0;
                        do
                        {
                            v18 = v17;
                            if ((int)sub_ad69e4(v16) <= (int)(unsigned int)v18)
                                sub_ae4a74(a1, v16);
                        } while ((v17 = (unsigned int)v18 + 1, sub_ae9b88(sub_ad69f8(v16, v18), &v8, &v7, &v6)));
                        sub_ae4a74(a1, v16);
                        goto LABEL_ae9ae4;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/x509/v3_pci.c", 267, "r2i_pci");
                        v23 = 135;
                        goto LABEL_ae9aa8;
                    }
                    goto LABEL_ae9aa8;
                }
                if (!v13->field_10)
                    goto LABEL_ae9a5c;
                if (!sub_ae9b88(v13, &v8, &v7, &v6))
                    goto LABEL_ae9ab0;
            }
            else
            {
LABEL_ae9a5c:
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_pci.c", 0x101, "r2i_pci");
                v23 = 0x99;
LABEL_ae9aa8:
                sub_a36abc(0x22, v23, 0);
LABEL_ae9ab0:
                v4 = ",value:";
                v5 = v13->field_10;
                v2 = ",name:";
                v3 = v13->field_8;
                v0 = "section:";
                v1 = v13->field_0;
                sub_a364a0(6);
                goto LABEL_ae9ae4;
            }
        } while ((v12 = (unsigned int)v12 + 1, (int)(unsigned int)v12 < (int)sub_ad69e4(v11)));
        if (v8)
        {
            if ((sub_a99eac(v8) & 0xfffffffd) == 665 && v6)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_pci.c", 295, "r2i_pci");
                v19 = 159;
                goto LABEL_ae9a50;
            }
            else
            {
                v20 = sub_aea170();
                if (v20)
                {
                    v22 = *(long long *)&v20->field_1;
                    *v22 = v8;
                    v22[1] = v6;
                    v20->field_0 = v7;
                    v7 = 0;
                    sub_ad6958(v11, &g_aef19c);
                    return v20;
                }
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_pci.c", 301, "r2i_pci");
                v19 = 524301;
                goto LABEL_ae9a50;
            }
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/x509/v3_pci.c", 289, "r2i_pci");
    v19 = 154;
LABEL_ae9a50:
    sub_a36abc(0x22, v19, 0);
LABEL_ae9ae4:
    sub_9c3580(v8);
    sub_9cf124(v7);
    v7 = 0;
    sub_9cf0f4(v6);
    sub_aea17c(0);
    sub_ad6958(v11, &g_aef19c);
    return 0;
}
