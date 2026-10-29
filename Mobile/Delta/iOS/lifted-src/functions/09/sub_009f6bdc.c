/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f6bdc..0x9f6d90 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f6bdc_1 {
    unsigned short field_0;
} st_9f6bdc_1;

typedef struct st_9f6bdc_0 {
    struct st_9f6bdc_0 *field_0;
} st_9f6bdc_0;


st_9f6bdc_0 ** sub_9f6bdc(st_9f6bdc_0 **a0, st_9f6bdc_1 **a1, unsigned long a2)
{
    long long v2;  // x1
    unsigned long v3;  // x9
    long long v12;  // x1
    st_9f6bdc_0 **v4;  // x24
    st_9f6bdc_0 **v5;  // x19
    st_9f6bdc_0 **v6;  // x23
    unsigned long v7;  // x9
    unsigned long v8;  // x21
    unsigned long v9;  // x24
    st_9f6bdc_0 **v10;  // x0
    st_9f6bdc_0 **v11;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (0xffffffffffff0001 >= a2 - 0x10000)
    {
        sub_a368c8();
        v2 = 260;
        goto LABEL_9f6c78;
    }
    else
    {
        v3 = *(short *)*a1;
        v4 = (unsigned int)((v3 & 0xff00) >> 8) | (unsigned int)v3 * 0x100 & 0xff00ff00;
        *a1 = *a1 + 1;
        if (v4 == a2 - 2)
        {
            if (a0 && !(v5 = *a0, !v5))
            {
                v6 = a0;
                while (sub_ad692c(v5))
                {
                    sub_9f770c();
                }
            }
            else
            {
                v6 = a0;
                v5 = sub_ad61b4();
                if (!v5)
                    return v5;
            }
            do
            {
                if (!v4)
                {
                    if (!v6 || *v6)
                        return v5;
                    *v6 = v5;
                    return v5;
                }
                if (v4 != 1)
                {
                    v7 = *(short *)*a1;
                    v8 = (unsigned int)((v7 & 0xff00) >> 8) | (unsigned int)v7 * 0x100 & 0xff00ff00;
                    *a1 = *a1 + 1;
                    v9 = (char *)v4 - 2;
                    if (v9 > v8 - 1)
                    {
                        v10 = sub_9f6708(0, a1, v8);
                        if (!v10)
                            goto LABEL_9f6d78;
                    }
                    else
                    {
                        sub_a368c8();
                        v12 = 294;
LABEL_9f6d64:
                        sub_a369bc("crypto/ct/ct_oct.c", v12, "o2i_SCT_LIST");
                        sub_a36abc(50, 105, 0);
                    }
                }
                else
                {
                    sub_a368c8();
                    v12 = 287;
                    goto LABEL_9f6d64;
                }
            } while ((v11 = v10, v4 = v9 - v8, sub_ad68a0(v5, v11)));
            sub_9f770c(v11);
LABEL_9f6d78:
            if (!v6 || !*v6)
                sub_9f7788(v5);
        }
        else
        {
            sub_a368c8();
            v2 = 266;
LABEL_9f6c78:
            sub_a369bc("crypto/ct/ct_oct.c", v2, "o2i_SCT_LIST");
            sub_a36abc(50, 105, 0);
        }
        return 0;
    }
}
