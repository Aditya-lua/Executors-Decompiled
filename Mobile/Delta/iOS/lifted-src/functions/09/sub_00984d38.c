/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x984d38..0x984fe0 (680 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_984d38_0 {
    char padding_0[40];
    long long field_28;
    char padding_30[16];
    long long field_40;
    long long field_48;
    char padding_50[16];
    unsigned int field_60;
} st_984d38_0;

extern char g_10002b0;

int sub_984d38(st_984d38_0 *a0, long long a1, unsigned long a2, void* a3, long long a4, void* a5)
{
    unsigned long v5;  // x24
    unsigned int v6;  // w0
    long long v15;  // x21
    long long v16;  // x1
    unsigned int v7;  // w0
    unsigned long v9;  // x20
    unsigned long v10;  // x26
    long long v11;  // x25
    unsigned long v12;  // x23
    unsigned long v13;  // x24
    long long v0;  // [bp-0xb0]
    char v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    *(unsigned long long *)a3 = 0;
    *(unsigned long long *)a5 = 0;
    v5 = sub_985cc0(a0->field_60);
    v6 = sub_985d60(a0->field_60);
    v7 = sub_985d38(a0->field_60);
    if (v5)
    {
        if (64 >= a2 && (sub_985d10(a0->field_60) & 0xffffffff) == a2)
        {
            v9 = v6;
            *(unsigned int *)&v0 = 1;
            if (sub_96eae0(a0->field_40, a0->field_48, a0->field_28, a1, "quic iv", 7, 0, 0, a4, v9, v0) && !(v10 = v7, *(unsigned int *)&v0 = 1, !sub_96eae0(a0->field_40, a0->field_48, a0->field_28, a1, "quic key", 8, 0, 0, &v1, v10, v0)))
            {
                v11 = 524294;
                v12 = sub_a4e104(a0->field_40, v5, a0->field_48);
                if (v12)
                {
                    v13 = sub_a4bc70();
                    if (!v13)
                    {
                        v15 = 144;
                    }
                    else if (v9 != sub_a50728(v12) || v10 != sub_9e4290(v12))
                    {
                        v15 = 150;
                        v11 = 786691;
                    }
                    else if (sub_a4c694(v13, v12, 0, &v1, a4, 0))
                    {
                        *(unsigned long *)a3 = v13;
                        *(unsigned long *)a5 = v9;
                        sub_a66ec0(&v1, 64);
                        sub_a4bbe4(v12);
                        if (*(long long *)&g_10002b0 == v2)
                            return 1;
                        ___stack_chk_fail();
                    }
                    else
                    {
                        v15 = 156;
                    }
                }
                else
                {
                    v13 = 0;
                    v15 = 139;
                }
                sub_a368c8();
                sub_a369bc("ssl/quic/quic_record_shared.c", v15, "el_build_keyslot");
                sub_a36abc(20, v11, 0);
            }
            else
            {
                v12 = 0;
                v13 = 0;
            }
            sub_a4bca0(v13);
            sub_a4bbe4(v12);
            sub_a66ec0(&v1, 64);
            sub_a66ec0(a4, v9);
        }
        else
        {
            sub_a368c8();
            v16 = 121;
LABEL_984efc:
            sub_a369bc("ssl/quic/quic_record_shared.c", v16, "el_build_keyslot");
            sub_a36abc(20, 0xc0103, 0);
        }
        if (*(long long *)&g_10002b0 == v2)
            return 0;
        ___stack_chk_fail();
    }
    else
    {
        sub_a368c8();
        v16 = 115;
        goto LABEL_984efc;
    }
}
