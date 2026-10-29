/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf8ed8..0xaf9054 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af8ed8_1 {
    char padding_0[16];
    unsigned int field_10;
} st_af8ed8_1;

typedef struct st_af8ed8_0 {
    char padding_0[16];
    char *field_10;
} st_af8ed8_0;


int sub_af8ed8(char *a0, long long a1, char *a2, char *a3)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    char *v19;  // w8
    unsigned long v20;  // x20
    char *v21;  // w23
    unsigned long long v22;  // 4151
    st_af8ed8_0 *v23;  // x0
    char *v24;  // w22
    char *v25;  // x21
    unsigned int i;  // w0
    unsigned long v27;  // x20
    st_af8ed8_1 *v28;  // x0
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    char *v16;  // w20
    long long v17;  // x19
    char *v18;  // w0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a0)
    {
        v0 = v9;
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = &v8;
        v7 = v15;
        v16 = a2;
        v17 = *(long long *)a0;
        v18 = (char *)(unsigned int)sub_ad69e4(v17);
        if (v18 < v16)
            v19 = v18;
        else
            v19 = v16;
        if (v16 < 0)
            v20 = v18;
        else
            v20 = v19;
        v21 = (char *)(!a3);
        *(unsigned int *)&a0[8] = 1;
        v22 = arm64g_calculate_condition(1, (unsigned long long)a3, 1, 0);
        if (!(v22 & 1))
        {
            if (v18 > (int)v20)
            {
                v23 = sub_ad69f8(v17, v20);
                goto LABEL_af8f60;
            }
            else if ((unsigned int)v20)
            {
                v24 = (char *)(*(int *)(sub_ad69f8(v17, (unsigned int)v20 - 1) + 16) + 1);
            }
            else
            {
                v24 = (char *)0;
            }
        }
        else
        {
            if ((unsigned int)v20)
            {
                v23 = sub_ad69f8(v17, (unsigned int)v20 - 1);
                v21 = (char *)0;
LABEL_af8f60:
                v24 = (char *)(int)v23->field_10;
            }
            else
            {
                v24 = (char *)0;
                v21 = (char *)1;
            }
        }
        v25 = sub_afa350(a1);
        if (v25)
        {
            *(unsigned int *)&v25[16] = (unsigned int)v24;
            if (sub_ad64b4(v17, v25, v20))
            {
                if (v21)
                {
                    i = sub_ad69e4(v17);
                    v27 = (unsigned int)v20 + 1;
                    if ((int)i > (int)v27)
                    {
                        do
                        {
                            v28 = sub_ad69f8(v17, v27);
                            v28->field_10 = v28->field_10 + 1;
                            v27 = (unsigned int)v27 + 1;
                        } while (i != (unsigned int)v27);
                    }
                }
                a0 = 1;
                goto LABEL_af9040;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/x509name.c", 228, "X509_NAME_add_entry");
                sub_a36abc(11, 0x8000f, 0);
            }
        }
        sub_afa344(v25);
        a0 = 0;
LABEL_af9040:
    }
    return (unsigned int)a0;
}
