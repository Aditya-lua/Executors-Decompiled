/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d8490..0x9d87d8 (840 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d8490_0 {
    char padding_0[40];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[16];
    unsigned long long field_40;
} st_9d8490_0;


unsigned long long sub_9d8490(st_9d8490_0 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v5;  // x8
    unsigned long long v6;  // w0
    unsigned long long v15;  // x19
    unsigned long long v17;  // x0
    unsigned long v18;  // x1
    unsigned long long v7;  // 4112
    unsigned long v8;  // x1
    unsigned long long v13;  // x8
    st_9d8490_0 *v14;  // x20
    unsigned long long v0;  // [bp-0x50]
    char *v1;  // [bp-0x48]
    char v2;  // [bp-0x34]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a0->field_40;
    if (11 >= a1)
    {
        if (7 >= a1)
        {
            if (a1 == 1)
                goto LABEL_9d854c;
            if (a1 != 2)
                if (a1 != 3)
                    goto LABEL_9d8798;
            else
                v6 = (unsigned int)_feof(v5);
            goto LABEL_9d85f4;
        }
        else
        {
            switch (a1)
            {
            case 8:
                return a0->field_2c;
            case 9:
                a0->field_2c = a2;
                return 1;
            case 11:
                v7 = arm64g_calculate_condition(1, _fflush(v5) & 0xffffffff, 1, 0);
                if (!(v7 & 1))
                    return 1;
                sub_a368c8();
                v8 = *(int *)___error(sub_a369bc("crypto/bio/bss_file.c", 335, "file_ctrl"), 335, "file_ctrl");
                sub_a368c8(sub_a36abc(2, v8, "calling fflush()"), v8, "calling fflush()");
                sub_a369bc("crypto/bio/bss_file.c", 337, "file_ctrl");
                sub_a36abc(32, 0x80002, 0);
            default:
LABEL_9d8798:
                break;
            }
        }
    }
    else
    {
        if (107 >= a1)
        {
            switch (a1)
            {
            case 12:
                return 1;
            case 106:
                if (a0->field_2c && a0->field_28 && v5)
                {
                    _fclose(v5);
                    *(unsigned int *)&a0->padding_30[0] = 0;
                }
                a0->field_40 = a3;
                a0->field_28 = 1;
                a0->field_2c = (unsigned int)a2 & 1;
                return 1;
            case 107:
                if (a3)
                {
                    *(unsigned long long *)a3 = v5;
                    return 1;
                }
                return 1;
            default:
LABEL_9d8798:
                break;
            }
        }
        else
        {
            switch (a1)
            {
            case 108:
                if (a0->field_2c)
                {
                    if (a0->field_28 && v5)
                    {
                        _fclose(v5);
                        a0->field_40 = 0;
                        *(unsigned int *)&a0->padding_30[0] = 0;
                    }
                    a0->field_28 = 0;
                }
                a0->field_2c = (unsigned int)a2 & 1;
                if (!(a2 >> 3 & 1))
                {
                    v13 = a2 & 6;
                    if (v13 == 6)
                    {
                        v14 = a0;
                        v15 = a3;
                    }
                    else if (v13)
                    {
                        v14 = a0;
                        v15 = a3;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/bio/bss_file.c", 284, "file_ctrl");
                        sub_a36abc(32, 101, 0);
                    }
                }
                else
                {
                    v14 = a0;
                    v15 = a3;
                }
                sub_a6db20(&v2);
                v17 = sub_a6d9a8(v15, &v2);
                if (v17)
                {
                    v14->field_40 = v17;
                    v14->field_28 = 1;
                    sub_9d3d58(v14, 0);
                    return 1;
                }
                sub_a368c8();
                v18 = *(int *)___error(sub_a369bc("crypto/bio/bss_file.c", 299, "file_ctrl"), 299, "file_ctrl");
                v0 = v15;
                v1 = &v2;
                sub_a368c8(sub_a36abc(2, v18, "calling fopen(%s, %s)"), v18, "calling fopen(%s, %s)");
                sub_a369bc("crypto/bio/bss_file.c", 302, "file_ctrl");
                sub_a36abc(32, 0x80002, 0);
            case 128:
LABEL_9d854c:
                v6 = (unsigned int)_fseek(v5, a2, 0);
LABEL_9d85f4:
                return v6;
            default:
LABEL_9d8798:
                break;
            }
        }
    }
    return 0;
}
