/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafa8bc..0xafaacc (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afa8bc_0 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_afa8bc_0;

typedef struct st_afa8bc_2 {
    char padding_0[16];
    unsigned int field_10;
} st_afa8bc_2;

typedef struct st_afa8bc_1 {
    long long field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_afa8bc_0 *field_10;
} st_afa8bc_1;

extern long long g_afaf90;
extern long long g_ebaa40;

unsigned long long sub_afa8bc(st_afa8bc_1 **a0, unsigned long long a1)
{
    st_afa8bc_1 *v4;  // x20
    unsigned long long v5;  // x21
    unsigned long long v6;  // x22
    unsigned long long v7;  // x23
    unsigned int v8;  // w25
    st_afa8bc_2 *v9;  // x24
    unsigned long long v10;  // x0
    unsigned long long v11;  // x21
    unsigned long long v12;  // x22
    unsigned long n;  // x20
    unsigned long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *a0;
    if (!v4->field_8)
    {
LABEL_afa9f4:
        v12 = v4->field_10->field_0;
        if (!a1)
            return v12;
        n = (int)v12;
        _memcpy(*(long long *)a1, v4->field_10->field_8, n);
        *(unsigned long *)a1 = *(long long *)a1 + n;
        return v12;
    }
    v5 = sub_ad61b4();
    v1 = v5;
    if (v5)
    {
        if ((int)sub_ad69e4(v4->field_0) >= 1)
        {
            v6 = 0;
            v7 = 0;
            v8 = 0xffffffff;
            do
            {
                v9 = sub_ad69f8(v4->field_0, v6);
                if (v9->field_10 != v8)
                {
                    v10 = sub_ad61b4();
                    if (!v10)
                        goto LABEL_afaa64;
                    v7 = v10;
                    if (sub_ad68a0(v5, v7))
                    {
                        v8 = v9->field_10;
                    }
                    else
                    {
                        sub_ad6020(v7);
                        goto LABEL_afaa64;
                    }
                }
                if (!sub_ad68a0(v7, v9))
                    goto LABEL_afaa64;
            } while ((v6 = (unsigned int)v6 + 1, (int)v6 < (int)sub_ad69e4(v4->field_0)));
        }
        v11 = sub_9ccc84(&v1, 0, &g_ebaa40, 0xffffffff, 0xffffffff);
        if (sub_9ebd68(v4->field_10, (int)v11))
        {
            v0 = v4->field_10->field_8;
            sub_9ccc84(&v1, &v0, &g_ebaa40, 0xffffffff, 0xffffffff);
            sub_ad6958(v1, &g_afaf90);
            v4->field_8 = 0;
            if (v11 >> 31 & 1)
                return v11;
            if (sub_afaaf4(v4))
                goto LABEL_afa9f4;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/x_name.c", 271, "x509_name_encode");
            sub_a36abc(13, 0x80007, 0);
            v5 = v1;
LABEL_afaa98:
            sub_ad6958(v5, &g_afaf90);
        }
        return 0xffffffff;
    }
LABEL_afaa64:
    sub_a368c8();
    sub_a369bc("crypto/x509/x_name.c", 282, "x509_name_encode");
    sub_a36abc(13, 0x8000f, 0);
    goto LABEL_afaa98;
}
