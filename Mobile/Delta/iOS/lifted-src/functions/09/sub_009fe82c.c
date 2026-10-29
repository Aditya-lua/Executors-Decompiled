/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fe82c..0x9fead0 (676 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9fe82c(void* a0, unsigned long long a1, unsigned int a2, long long a3)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    unsigned long v21;  // x19
    long long v22;  // x22
    unsigned long v23;  // x0
    unsigned long v24;  // x23
    unsigned long v25;  // x0
    unsigned long v26;  // x0
    unsigned long v27;  // x24
    unsigned long v28;  // x20
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    long long v20;  // x1
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (*(long long *)((long long)a0[184] + 64))
    {
        goto *((void *)(*(long long *)((long long)a0[184] + 64)));
    }
    else
    {
        v0 = v11;
        v1 = v12;
        v2 = v13;
        v3 = v14;
        v4 = v15;
        v5 = v16;
        v6 = v17;
        v7 = v18;
        v8 = &v10;
        v9 = v19;
        if ((int)a1 >= 10001)
        {
            sub_a368c8();
            sub_a369bc("crypto/dh/dh_gen.c", 164, "dh_builtin_genparams");
            v20 = 103;
        }
        else if (0x1ff >= (int)a1)
        {
            sub_a368c8();
            sub_a369bc("crypto/dh/dh_gen.c", 169, "dh_builtin_genparams");
            v20 = 126;
        }
        else
        {
            v21 = sub_9dddcc((long long)a0[176]);
            if (v21)
            {
                sub_9de064(v21);
                v22 = sub_9de208(v21);
                v23 = sub_9de208(v21);
                if (!v23 || (v24 = v23, !(long long)a0[8] && !(v25 = sub_9e4958(), *(unsigned long *)&a0[8] = v25, v25) || !(long long)a0[24] && (v26 = sub_9e4958(), *(unsigned long *)&a0[24] = v26, !v26)))
                    goto LABEL_9fe964;
                if (1 >= (int)a2)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/dh/dh_gen.c", 189, "dh_builtin_genparams");
                    sub_a36abc(5, 101, 0);
                    goto LABEL_9fe964;
                }
                switch (a2)
                {
                case 5:
                    if (sub_9e4d58(v22, 60) && sub_9e4d58(v24, 59))
                    {
                        v27 = 5;
                        goto LABEL_9fea44;
                    }
                    goto LABEL_9fe964;
                case 2:
                    if (sub_9e4d58() && sub_9e4d58(v24, 23))
                    {
                        v27 = 2;
                        goto LABEL_9fea44;
                    }
                    goto LABEL_9fe964;
                default:
                    if (!sub_9e4d58() || !sub_9e4d58(v24, 11))
                        goto LABEL_9fe964;
                    v27 = a2;
LABEL_9fea44:
                    if (!sub_9e80bc((long long)a0[8], a1, 1, v22, v24, a3, v21) || !sub_9e804c(a3, 3, 0) || !sub_9e4d58((long long)a0[24], v27))
                        goto LABEL_9fe964;
                    *(unsigned int *)&a0[104] = 25 * ((sub_ab148c(a1) & 0xffff) * 2 + 24) / 25;
                    *(long long *)&a0[200] = (long long)a0[200] + 1;
                    v28 = 1;
                    break;
                }
            }
            else
            {
LABEL_9fe964:
                sub_a368c8();
                sub_a369bc("crypto/dh/dh_gen.c", 231, "dh_builtin_genparams");
                sub_a36abc(5, 0x80003, 0);
                v28 = 0;
            }
            sub_9de17c(v21);
            sub_9dded4(v21);
            return v28;
        }
        sub_a36abc(5, v20, 0);
        return 0;
    }
}
