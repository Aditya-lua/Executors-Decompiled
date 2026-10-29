/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadc778..0xadc9ec (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adc778_1 {
    char padding_0[8];
    struct st_adc778_0 *field_8;
} st_adc778_1;

typedef struct st_adc778_0 {
    struct st_adc778_0 *field_0;
    char field_1;
    char padding_2[6];
    unsigned int field_8;
    char padding_c[4];
    struct st_adc778_0 *field_10;
} st_adc778_0;

extern long long g_adc768;
extern long long g_adc9ec;

int sub_adc778(st_adc778_1 *a0, st_adc778_0 *a1, unsigned int a2)
{
    st_adc778_0 *v2;  // x23
    unsigned int v3;  // w8
    st_adc778_0 *v12;  // x0
    long long v14;  // x1
    long long v15;  // x1
    st_adc778_0 *v4;  // x27
    st_adc778_0 *v5;  // x28
    st_adc778_0 *v6;  // x24
    st_adc778_0 *v7;  // x25
    long long *v8;  // x0
    st_adc778_0 *v9;  // x0
    st_adc778_0 *v10;  // x0
    st_adc778_0 *v11;  // x25
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        goto LABEL_adc8e4;
    v2 = a1;
    v3 = (char)a1->field_0;
    switch (v3)
    {
    case 0:
LABEL_adc8e4:
        sub_a368c8();
        sub_a369bc("crypto/x509/by_dir.c", 173, "add_cert_dir");
        v15 = 113;
        goto LABEL_adc908;
    case 58:
        v4 = v2;
        break;
    default:
        v4 = v2;
        goto LABEL_adc7c8;
    }
    while (1)
    {
        v5 = (char *)&v4->field_0 + 1;
        v6 = v4 - v2;
        if (v4 != v2)
        {
            if ((int)sub_ad69e4(a0->field_8) >= 1)
            {
                v7 = 0;
                do
                {
                    v8 = sub_ad69f8(a0->field_8, v7);
                } while ((_strlen(*v8) != v6 || _strncmp(*v8, v2, v6)) && (v7 = (unsigned int)v7 + 1, (int)sub_ad69e4(a0->field_8) > (int)(unsigned int)v7));
            }
            else
            {
                v7 = 0;
            }
            if ((int)(unsigned int)v7 >= (int)sub_ad69e4(a0->field_8))
            {
                if (a0->field_8 || !(v9 = sub_ad61b4(), a0->field_8 = v9, !v9))
                {
                    v10 = sub_a6bf4c(24, "crypto/x509/by_dir.c", 202);
                    if (!v10)
                        return (unsigned int)v10;
                    v11 = v10;
                    *(unsigned int *)&v10->field_1 = a2;
                    *(unsigned long long *)&v11->field_8 = sub_ad6270(&g_adc9ec);
                    v12 = sub_a6da14(v2, v6, "crypto/x509/by_dir.c", 207);
                    v11->field_0 = v12;
                    if (!v12 || !*(long long *)&v11->field_8)
                    {
                        sub_a6c2e4();
                        sub_ad6958(*(long long *)&v11->field_8, &g_adc768);
                        sub_a6c2e4(v11, "crypto/x509/by_dir.c", 0x99);
                        break;
                    }
                    if (!sub_ad68a0(a0->field_8, v11))
                    {
                        sub_a6c2e4(v11->field_0, "crypto/x509/by_dir.c", 151);
                        sub_ad6958(*(long long *)&v11->field_8, &g_adc768);
                        sub_a368c8(sub_a6c2e4(v11, "crypto/x509/by_dir.c", 0x99), "crypto/x509/by_dir.c", 0x99);
                        v14 = 214;
                        goto LABEL_adc9d8;
                    }
                }
                else
                {
                    sub_a368c8();
                    v14 = 198;
LABEL_adc9d8:
                    sub_a369bc("crypto/x509/by_dir.c", v14, "add_cert_dir");
                    v15 = 524303;
LABEL_adc908:
                    sub_a36abc(11, v15, 0);
                    break;
                }
            }
        }
        while (1)
        {
            if (!(char)v4->field_0)
                return 1;
            v3 = *((char *)&v4->field_0 + 1);
            v4 = (char *)&v4->field_0 + 1;
            v2 = v5;
            if (v3 == 58)
                break;
LABEL_adc7c8:
            if (!v3)
                break;
            v5 = v2;
        }
    }
    return 0;
}
