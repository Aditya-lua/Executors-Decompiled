/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99a1b4..0x99a470 (700 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99a1b4_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned long long field_8;
} st_99a1b4_1;

typedef struct st_99a1b4_0 {
    char padding_0[20];
    unsigned int field_14;
    char padding_18[4056];
    long long field_ff0;
} st_99a1b4_0;


unsigned int sub_99a1b4(st_99a1b4_0 *a0, st_99a1b4_1 *a1)
{
    st_99a1b4_0 *v2;  // x19
    unsigned int v3;  // w8
    unsigned int v4;  // w9
    long long v5;  // x1
    long long v6;  // x2
    long long v7;  // x20
    unsigned long long v8;  // x0
    long long v9;  // x1
    long long v10;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    v3 = a1->field_0;
    v4 = a0->field_14;
    if (v3 == 2)
    {
        if (v4 != 0x10000)
        {
            sub_c6501c(v2);
            return 0;
        }
        if (8 < a1->field_8)
            goto LABEL_99a33c;
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tlsany_meth.c", 53, "tls_validate_record_header");
        v5 = 50;
        v6 = 160;
    }
    else
    {
        switch (v4)
        {
        case 772:
LABEL_99a33c:
            if (a1->field_8 <= 0x4000)
                return 1;
            sub_a368c8();
            sub_a369bc("ssl/record/methods/tlsany_meth.c", 121, "tls_validate_record_header");
            v5 = 22;
            v6 = 146;
            break;
        case 65536:
            if ((v3 & 0xffffff00) == 0x300)
                goto LABEL_99a33c;
            if (!*(int *)&v2[1].padding_18[196])
            {
                sub_a368c8();
                v10 = 82;
                goto LABEL_99a424;
            }
            v7 = v2->field_ff0;
            if (_strncmp(v7, "GET ", 4) && _strncmp(v7, "POST ", 5) && _strncmp(v7, "HEAD ", 5) && _strncmp(v7, "PATCH", 5) && _strncmp(v7, "OPTIO", 5) && _strncmp(v7, "DELET", 5) && _strncmp(v7, "TRACE", 5) && _strncmp(v7, "PUT ", 4))
            {
                v8 = _strncmp(v7, "CONNE", 5);
                sub_a368c8(v8, "CONNE", 5);
                if ((unsigned int)v8)
                {
                    v9 = 78;
                    goto LABEL_99a3ac;
                }
                else
                {
                    sub_a369bc("ssl/record/methods/tlsany_meth.c", 72, "tls_validate_record_header");
                    v5 = 0xffffffff;
                    v6 = 155;
                    break;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/record/methods/tlsany_meth.c", 0x44, "tls_validate_record_header");
                v5 = 0xffffffff;
                v6 = 156;
                break;
            }
        default:
            if (v3 == v4)
                goto LABEL_99a33c;
            if (!((char)(v4 >> 8) ^ (char)(v3 >> 8)))
            {
                if (a1->field_4 == 21)
                {
                    sub_a368c8();
                    v9 = 104;
                }
                else
                {
                    v2->field_14 = v3 & 0xffff;
                    goto LABEL_99a40c;
                }
LABEL_99a3ac:
                sub_a369bc("ssl/record/methods/tlsany_meth.c", v9, "tls_validate_record_header");
                v5 = 0xffffffff;
                goto LABEL_99a430;
            }
            else
            {
LABEL_99a40c:
                sub_a368c8();
                v10 = 111;
LABEL_99a424:
                sub_a369bc("ssl/record/methods/tlsany_meth.c", v10, "tls_validate_record_header");
                v5 = 70;
LABEL_99a430:
                v6 = 267;
                break;
            }
        }
    }
    sub_996e84(v2, v5, v6, 0);
    return 0;
}
